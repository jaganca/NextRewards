package com.quirodev.usagestatsmanagersample;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.nexteducation.nextresources.model.Chapter;
import com.nexteducation.nextresources.model.ChapterResponse;
import com.nexteducation.nextresources.model.LoginCustomResponse;
import com.nexteducation.nextresources.model.UserRegistrationFetchRequest;
import com.quirodev.usagestatsmanagersample.Chapter.ChapterListener;
import com.quirodev.usagestatsmanagersample.Chapter.ChapterModel;

import java.util.ArrayList;
import java.util.List;

public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.ChapterHolder> implements ChapterListener {
//constructor - list
    private ChapterModel mChapterModel;
    private  Context context;
    List<Chapter> list = new ArrayList<>();

    public class ChapterHolder extends RecyclerView.ViewHolder {

        private TextView text;
        public View layout;

        public ChapterHolder(View view){
            super(view);
            layout = view;
            text = (TextView) itemView.findViewById(R.id.chapterName);

        }
    }

    public ChapterAdapter(List<Chapter> arrayList) {
        list = arrayList;
    }
    @Override
    public ChapterHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chaper_item, viewGroup, false);
        return new ChapterHolder(view);
    }

    @Override
    public void onBindViewHolder(ChapterHolder holder, int position) {
//         object = list.get(position);
//        list.get(position).get();
//        String chapterName = object.getFirstText()
        holder.text.setText(list.get(position).getChapterName());

        holder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = getItemViewType(position);
                Chapter chapter = list.get(id);

                if(mChapterModel == null) {
                    mChapterModel = new ChapterModel(ChapterAdapter.this);
                }
                SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);


                Long classId = sharedPrefs.getLong("classId",0L);
                Long studentId = sharedPrefs.getLong("studentId",0L);
                mChapterModel.chapter(chapter.getSubject().getId(),classId,chapter.getId(),studentId);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void chapterSuccess(ChapterResponse chapterResponse) {

        if (chapterResponse.getError()) {
            String error = "Please finish the following concepts and then come back here";
            for (int i = 0; i < chapterResponse.getReason().size(); i++) {
                error = error + " " + chapterResponse.getReason().get(i);
            }
            Toast.makeText(context, error, Toast.LENGTH_LONG).show();
        } else {

            Gson gson = new Gson();

            String json = gson.toJson(chapterResponse);
            Intent intent = new Intent(context, DescriptionActivity.class);

            Bundle bundle = new Bundle();
            bundle.putSerializable("text", json);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Override
    public void chapterFailed() {
        Toast.makeText(context, "Chapter Fetch Failed", Toast.LENGTH_LONG).show();
    }

}
