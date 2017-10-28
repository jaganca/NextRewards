//import android.os.AsyncTask;
//
//public class getCategory extends AsyncTask {
//
//    @Override
//    protected Void doInBackground(String query_url) {
//        String category;
////        pm = getPackageManager();
////        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
////        Iterator<ApplicationInfo> iterator = packages.iterator();
////        while (iterator.hasNext()) {
////            ApplicationInfo packageInfo = iterator.next();
////            String query_url = GOOGLE_URL + packageInfo.packageName;
////            Log.i(TAG, query_url);
//            category = getCategory(query_url);
//            // store category or do something else
//        }
////        return null;
////    }
//
//
//    private String getCategory(String query_url) {
////        boolean network = mActivityUtil.isNetworkAvailable();
////        if (!network) {
////            //manage connectivity lost
////            return ERROR;
////        } else {
////            try {
////                Document doc = Jsoup.connect(query_url).get();
////                Element link = doc.select("span[itemprop=genre]").first();
////                return link.text();
////            } catch (Exception e) {
////                return ERROR;
////            }
////        }
//    }
//
//}
