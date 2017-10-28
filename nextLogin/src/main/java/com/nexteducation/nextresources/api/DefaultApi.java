package com.nexteducation.nextresources.api;

import com.nexteducation.nextresources.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.nextresources.model.AutoNumberingAddRequest;
import com.nexteducation.nextresources.model.AddResponse;
import com.nexteducation.nextresources.model.CasteAddRequest;
import com.nexteducation.nextresources.model.JerseyResponse;
import com.nexteducation.nextresources.model.CategoryAddRequest;
import com.nexteducation.nextresources.model.ChapterAddRequest;
import com.nexteducation.nextresources.model.StatusResponse;
import com.nexteducation.nextresources.model.ConceptCompleteAddRequest;
import com.nexteducation.nextresources.model.CustomFieldDataDTO;
import com.nexteducation.nextresources.model.CustomFormElementRequest;
import com.nexteducation.nextresources.model.LanguageAddRequest;
import com.nexteducation.nextresources.model.MindMapAddRequest;
import com.nexteducation.nextresources.model.ProductFeatureAddRequest;
import com.nexteducation.nextresources.model.ReligionAddRequest;
import com.nexteducation.nextresources.model.QuestionAddRequest;
import com.nexteducation.nextresources.model.CasteResponse;
import com.nexteducation.nextresources.model.CategoryResponse;
import com.nexteducation.nextresources.model.EntityResponse;
import com.nexteducation.nextresources.model.LanguageResponse;
import com.nexteducation.nextresources.model.CasteCustomResponse;
import com.nexteducation.nextresources.model.ProductFeatureResponse;
import com.nexteducation.nextresources.model.ReligionResponse;
import com.nexteducation.nextresources.model.AutoNumberingResponse;
import com.nexteducation.nextresources.model.ChapterResponse;
import com.nexteducation.nextresources.model.ClassFetchParams;
import com.nexteducation.nextresources.model.StudyClassResponse;
import com.nexteducation.nextresources.model.ConceptCompletedResponse;
import com.nexteducation.nextresources.model.CustomFieldListResponse;
import com.nexteducation.nextresources.model.CustomFormElementResponse;
import com.nexteducation.nextresources.model.StandardFieldDTO;
import com.nexteducation.nextresources.model.SubjectResponse;
import com.nexteducation.nextresources.model.MindMapResponse;
import com.nexteducation.nextresources.model.QuestionResponse;
import com.nexteducation.nextresources.model.AutoNumberingGenerateRequest;
import com.nexteducation.nextresources.model.LoginCustomResponse;
import com.nexteducation.nextresources.model.UserRegistrationFetchRequest;
import com.nexteducation.nextresources.model.UserRegistrationRequest;
import com.nexteducation.nextresources.model.CustomQuestionResponse;
import com.nexteducation.nextresources.model.QuestionReplyRequest;
import com.nexteducation.nextresources.model.AutoNumberingUpdateRequest;
import com.nexteducation.nextresources.model.CasteUpdateRequest;
import com.nexteducation.nextresources.model.CategoryUpdateRequest;
import com.nexteducation.nextresources.model.LanguageUpdateRequest;
import com.nexteducation.nextresources.model.ProductFeatureUpdateRequest;
import com.nexteducation.nextresources.model.ReligionUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;AddResponse&gt;
   */
  
  @POST("v1/auto_numberings")
  Call<AddResponse> addAutoNumberings(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body AutoNumberingAddRequest body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;AddResponse&gt;
   */
  
  @POST("v1/castes")
  Call<AddResponse> addCastes(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body CasteAddRequest body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/categories")
  Call<JerseyResponse> addCategories(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body CategoryAddRequest body
  );

  /**
   * add Chapters
   * add Chapters
   * @param body  (optional)
   * @return Call&lt;StatusResponse&gt;
   */
  
  @POST("v1/chapters")
  Call<StatusResponse> addChapter(
    @Body ChapterAddRequest body
  );

  /**
   * add Completed concepts
   * add completed Concepts
   * @param body  (optional)
   * @return Call&lt;StatusResponse&gt;
   */
  
  @POST("v1/concept_completed")
  Call<StatusResponse> addCompletedConcepts(
    @Body ConceptCompleteAddRequest body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/custom_field_data")
  Call<JerseyResponse> addCustomFieldData(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body CustomFieldDataDTO body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/custom_field_data/bulk")
  Call<JerseyResponse> addCustomFieldData_0(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body List<CustomFieldDataDTO> body
  );

  /**
   * 
   * 
   * @param formName  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/custom_form_elements")
  Call<JerseyResponse> addCustomFormElements(
    @Query("form_name") String formName, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body CustomFormElementRequest body
  );

  /**
   * 
   * 
   * @param formName  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/custom_form_elements/bulk_add")
  Call<JerseyResponse> addCustomFormElementsBulk(
    @Query("form_name") String formName, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body List<CustomFormElementRequest> body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;AddResponse&gt;
   */
  
  @POST("v1/languages")
  Call<AddResponse> addLanguages(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body LanguageAddRequest body
  );

  /**
   * add mind map 
   * add mind map
   * @param subjectId  (required)
   * @param body  (optional)
   * @return Call&lt;StatusResponse&gt;
   */
  
  @POST("v1/mind_map")
  Call<StatusResponse> addMindMap(
    @Path("subject_id") Long subjectId, @Body MindMapAddRequest body
  );

  /**
   * 
   * 
   * @param formName  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/custom_form_elements/bulk")
  Call<JerseyResponse> addOrUpdateCustomFormElements(
    @Query("form_name") String formName, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body List<CustomFormElementRequest> body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/custom_field_data/bulk")
  Call<JerseyResponse> addOrupdateCustomFieldData(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body List<CustomFieldDataDTO> body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/product_features")
  Call<JerseyResponse> addProductFeature(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body ProductFeatureAddRequest body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/religions")
  Call<JerseyResponse> addReligions(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body ReligionAddRequest body
  );

  /**
   * add questions
   * add questions
   * @param body  (optional)
   * @return Call&lt;StatusResponse&gt;
   */
  
  @POST("v1/question")
  Call<StatusResponse> addquestion(
    @Body QuestionAddRequest body
  );

  /**
   * 
   * 
   * @param autoNumberingId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/auto_numberings/{autoNumberingId}")
  Call<JerseyResponse> deleteAutoNumberings(
    @Path("autoNumberingId") Long autoNumberingId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param casteId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/castes/{caste_id}")
  Call<JerseyResponse> deleteCastes(
    @Path("caste_id") Long casteId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param categoryId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/categories/{category_id}")
  Call<JerseyResponse> deleteCategories(
    @Path("category_id") Long categoryId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param customFieldDataId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/custom_field_data/{custom_field_data_id}")
  Call<JerseyResponse> deleteCustomFieldData(
    @Path("custom_field_data_id") Long customFieldDataId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles
  );

  /**
   * 
   * 
   * @param customFieldListId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/custom_field_lists/{custom_field_list_id}")
  Call<JerseyResponse> deleteCustomFieldLists(
    @Path("custom_field_list_id") Long customFieldListId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles
  );

  /**
   * 
   * 
   * @param customFormElementId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/custom_form_elements/{custom_form_element_id}")
  Call<JerseyResponse> deleteCustomFormElements(
    @Path("custom_form_element_id") Long customFormElementId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles
  );

  /**
   * 
   * 
   * @param languageId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/languages/{language_id}")
  Call<JerseyResponse> deleteLanguages(
    @Path("language_id") Long languageId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param productFeatureId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/product_features/{product_feature_id}")
  Call<JerseyResponse> deleteProductFeature(
    @Path("product_feature_id") Long productFeatureId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param religionId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @DELETE("v1/religions/{religion_id}")
  Call<JerseyResponse> deleteReligions(
    @Path("religion_id") Long religionId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param branchId  (optional)
   * @param parentIds  (optional)
   * @param fetch  (optional)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<CasteResponse>&gt;
   */
  
  @GET("v1/castes")
  Call<List<CasteResponse>> fetchAllCastes(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("branch_id") Long branchId, @Query("parent_ids") List<Long> parentIds, @Query("fetch") List<String> fetch, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<CategoryResponse>&gt;
   */
  
  @GET("v1/categories")
  Call<List<CategoryResponse>> fetchAllCategories(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param customFieldId  (optional)
   * @param customFieldIds  (optional)
   * @param entity  (optional)
   * @param entities  (optional)
   * @param formId  (optional)
   * @param branchId  (optional)
   * @param entityInstanceId  (optional)
   * @param entityInstanceIds  (optional)
   * @param fetch  (optional)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<CustomFieldDataDTO>&gt;
   */
  
  @GET("v1/custom_field_data")
  Call<List<CustomFieldDataDTO>> fetchAllCustomFieldData(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("custom_field_id") Long customFieldId, @Query("custom_field_ids") List<Long> customFieldIds, @Query("entity") String entity, @Query("entities") List<String> entities, @Query("form_id") Long formId, @Query("branch_id") Long branchId, @Query("entity_instance_id") Long entityInstanceId, @Query("entity_instance_ids") List<Long> entityInstanceIds, @Query("fetch") List<String> fetch, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<EntityResponse>&gt;
   */
  
  @GET("v1/entities")
  Call<List<EntityResponse>> fetchAllEntities(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<LanguageResponse>&gt;
   */
  
  @GET("v1/languages")
  Call<List<LanguageResponse>> fetchAllLanguages(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<CasteCustomResponse>&gt;
   */
  
  @GET("v1/castes/castes_parent")
  Call<List<CasteCustomResponse>> fetchAllParentCastes(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<ProductFeatureResponse>&gt;
   */
  
  @GET("v1/product_features")
  Call<List<ProductFeatureResponse>> fetchAllProductFeatures(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<ReligionResponse>&gt;
   */
  
  @GET("v1/religions")
  Call<List<ReligionResponse>> fetchAllReligions(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param type  (optional)
   * @return Call&lt;List<AutoNumberingResponse>&gt;
   */
  
  @GET("v1/auto_numberings")
  Call<List<AutoNumberingResponse>> fetchAutoNumberings(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Query("type") String type
  );

  /**
   * 
   * 
   * @param autoNumberingId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;AutoNumberingResponse&gt;
   */
  
  @GET("v1/auto_numberings/{autoNumberingId}")
  Call<AutoNumberingResponse> fetchAutoNumberings_0(
    @Path("autoNumberingId") Long autoNumberingId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param casteId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CasteResponse&gt;
   */
  
  @GET("v1/castes/{caste_id}")
  Call<CasteResponse> fetchCastes(
    @Path("caste_id") Long casteId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param categoryId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CategoryResponse&gt;
   */
  
  @GET("v1/categories/{category_id}")
  Call<CategoryResponse> fetchCategories(
    @Path("category_id") Long categoryId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * Fetch Chapters
   * Fetch Chapters
   * @param subjectId  (optional)
   * @param classId  (optional)
   * @param chapterId  (optional)
   * @param studentId  (optional)
   * @return Call&lt;List<ChapterResponse>&gt;
   */
  
  @GET("v1/chapters")
  Call<List<ChapterResponse>> fetchChapter(
    @Query("subject_id") Long subjectId, @Query("class_id") Long classId, @Query("chapter_id") Long chapterId, @Query("student_id") Long studentId
  );

  /**
   * Fetch Chapters
   * Fetch Chapters
   * @param subjectId  (optional)
   * @param classId  (optional)
   * @param chapterId  (optional)
   * @param studentId  (optional)
   * @return Call&lt;List<ChapterResponse>&gt;
   */
  
  @GET("v1/chapters/class")
  Call<List<ChapterResponse>> fetchChapterByClass(
    @Query("subject_id") Long subjectId, @Query("class_id") Long classId, @Query("chapter_id") Long chapterId, @Query("student_id") Long studentId
  );

  /**
   * Fetch Chapters
   * Fetch Chapters
   * @param subjectId  (optional)
   * @param classId  (optional)
   * @param chapterId  (optional)
   * @param studentId  (optional)
   * @return Call&lt;ChapterResponse&gt;
   */
  
  @POST("v1/chapters/class")
  Call<ChapterResponse> fetchChapters(
    @Query("subject_id") Long subjectId, @Query("class_id") Long classId, @Query("chapter_id") Long chapterId, @Query("student_id") Long studentId
  );

  /**
   * Fetch Classes
   * Fetch Classes
   * @param body  (optional)
   * @return Call&lt;List<StudyClassResponse>&gt;
   */
  
  @GET("v1")
  Call<List<StudyClassResponse>> fetchClasses(
    @Body ClassFetchParams body
  );

  /**
   * fetch Completed concepts
   * fetch completed Concepts
   * @param chapterId  (required)
   * @param body  (optional)
   * @return Call&lt;List<ConceptCompletedResponse>&gt;
   */
  
  @POST("v1/concept_completed_id")
  Call<List<ConceptCompletedResponse>> fetchCompletedConcepts(
    @Path("chapter_id") Long chapterId, @Body ConceptCompleteAddRequest body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param customFieldId  (optional)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<CustomFieldListResponse>&gt;
   */
  
  @GET("v1/custom_field_lists")
  Call<List<CustomFieldListResponse>> fetchCustomFieldLists(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("custom_field_id") Long customFieldId, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param branchId  (optional)
   * @param formId  (optional)
   * @param formName  (optional)
   * @param entity  (optional)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<CustomFormElementResponse>&gt;
   */
  
  @GET("v1/custom_form_elements")
  Call<List<CustomFormElementResponse>> fetchCustomFormElements(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("branch_id") Long branchId, @Query("form_id") Long formId, @Query("form_name") String formName, @Query("entity") String entity, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param customFormElementId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @return Call&lt;CustomFormElementResponse&gt;
   */
  
  @GET("v1/custom_form_elements/{custom_form_element_id}")
  Call<CustomFormElementResponse> fetchCustomFormElements_0(
    @Path("custom_form_element_id") Long customFormElementId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles
  );

  /**
   * 
   * 
   * @param languageId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;LanguageResponse&gt;
   */
  
  @GET("v1/languages/{language_id}")
  Call<LanguageResponse> fetchLanguages(
    @Path("language_id") Long languageId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param religionId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;ReligionResponse&gt;
   */
  
  @GET("v1/religions/{religion_id}")
  Call<ReligionResponse> fetchReligions(
    @Path("religion_id") Long religionId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param entity  (optional)
   * @param formName  (optional)
   * @param formId  (optional)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<StandardFieldDTO>&gt;
   */
  
  @GET("v1/standard_fields")
  Call<List<StandardFieldDTO>> fetchStandardFields(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("entity") String entity, @Query("form_name") String formName, @Query("form_id") Long formId, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param casteId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;List<CasteCustomResponse>&gt;
   */
  
  @GET("v1/castes/{caste_id}/sub")
  Call<List<CasteCustomResponse>> fetchSubCastes(
    @Path("caste_id") Long casteId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * Fetch Subjects
   * Fetch Subjects
   * @param staffId  (required)
   * @return Call&lt;List<SubjectResponse>&gt;
   */
  
  @GET("v1/subjects")
  Call<List<SubjectResponse>> fetchSubject(
    @Query("staff_id") Long staffId
  );

  /**
   * fetch prereq
   * fetch prereq
   * @param chapterId  (required)
   * @return Call&lt;List<MindMapResponse>&gt;
   */
  
  @GET("v1/mind_map")
  Call<List<MindMapResponse>> fetchquestions(
    @Path("chapter_id") Long chapterId
  );

  /**
   * fetch questions
   * fetch questions
   * @param chapterId  (required)
   * @return Call&lt;List<QuestionResponse>&gt;
   */
  
  @GET("v1/question_id")
  Call<List<QuestionResponse>> fetchquestions_0(
    @Query("chapter_id") Long chapterId
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;AutoNumberingResponse&gt;
   */
  
  @POST("v1/auto_numberings/generate")
  Call<AutoNumberingResponse> generateAutoGeneratedNos(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body AutoNumberingGenerateRequest body
  );

  /**
   * 
   * 
   * @param autoNumberingId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;AutoNumberingResponse&gt;
   */
  
  @GET("v1/auto_numberings/generate/{autoNumberingId}")
  Call<AutoNumberingResponse> generateAutoGeneratedNosById(
    @Path("autoNumberingId") Long autoNumberingId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;AutoNumberingResponse&gt;
   */
  
  @POST("v1/generate_auto_number")
  Call<AutoNumberingResponse> generateAutoNumber(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body AutoNumberingAddRequest body
  );

  /**
   * 
   * 
   * @param customFieldDataId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @return Call&lt;CustomFieldDataDTO&gt;
   */
  
  @GET("v1/custom_field_data/{custom_field_data_id}")
  Call<CustomFieldDataDTO> getCustomFieldData(
    @Path("custom_field_data_id") Long customFieldDataId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles
  );

  /**
   * 
   * 
   * @param productFeatureId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;ProductFeatureResponse&gt;
   */
  
  @GET("v1/product_features/{product_feature_id}")
  Call<ProductFeatureResponse> getProductFeature(
    @Path("product_feature_id") Long productFeatureId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Call&lt;LoginCustomResponse&gt;
   */
  
  @POST("v1/login/id")
  Call<LoginCustomResponse> registerAuthenticity(
    @Body UserRegistrationFetchRequest body
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Call&lt;StatusResponse&gt;
   */
  
  @POST("v1/login")
  Call<StatusResponse> registerUser(
    @Body UserRegistrationRequest body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/custom_field_data/excel")
  Call<JerseyResponse> saveCustomFieldData(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body List<CustomFieldDataDTO> body
  );

  /**
   * save questions
   * save questions
   * @param body  (optional)
   * @return Call&lt;CustomQuestionResponse&gt;
   */
  
  @POST("v1/question_id")
  Call<CustomQuestionResponse> savereplies(
    @Body List<QuestionReplyRequest> body
  );

  /**
   * 
   * 
   * @param autoNumberingId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/auto_numberings")
  Call<JerseyResponse> updateAutoNumberings(
    @Path("autoNumberingId") String autoNumberingId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body AutoNumberingUpdateRequest body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @POST("v1/auto_numberings/bulk")
  Call<JerseyResponse> updateBulkAutoNumberings(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body List<AutoNumberingUpdateRequest> body
  );

  /**
   * 
   * 
   * @param casteId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/castes/{caste_id}")
  Call<JerseyResponse> updateCastes(
    @Path("caste_id") Long casteId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body CasteUpdateRequest body
  );

  /**
   * 
   * 
   * @param categoryId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/categories/{category_id}")
  Call<JerseyResponse> updateCategories(
    @Path("category_id") Long categoryId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body CategoryUpdateRequest body
  );

  /**
   * 
   * 
   * @param customFieldDataId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/custom_field_data/{custom_field_data_id}")
  Call<JerseyResponse> updateCustomFieldData(
    @Path("custom_field_data_id") Long customFieldDataId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body CustomFieldDataDTO body
  );

  /**
   * 
   * 
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param customFormElementId  (optional)
   * @param formName  (optional)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/custom_form_elements")
  Call<JerseyResponse> updateCustomFormElements(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("custom_form_element_id") Long customFormElementId, @Query("form_name") String formName, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body CustomFormElementRequest body
  );

  /**
   * 
   * 
   * @param languageId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/languages/{language_id}")
  Call<JerseyResponse> updateLanguages(
    @Path("language_id") Long languageId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body LanguageUpdateRequest body
  );

  /**
   * 
   * 
   * @param productFeatureId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/product_features/{product_feature_id}")
  Call<JerseyResponse> updateProductFeature(
    @Path("product_feature_id") Long productFeatureId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body ProductFeatureUpdateRequest body
  );

  /**
   * 
   * 
   * @param religionId  (required)
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param lcasid Session Parameter - Current Academic Session Id (optional)
   * @param lupid Session Parameter - Reference Id (optional)
   * @param ptype Session Parameter - Profile Type (optional)
   * @param cform Custom Parameter - Customized Form (optional)
   * @param csform Custom Parameter - Customized Sub Form (optional)
   * @param lstduid Session Parameter - Student Reference Id (optional)
   * @param roles Session Parameter - Roles of user (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @param body  (optional)
   * @return Call&lt;JerseyResponse&gt;
   */
  
  @PUT("v1/religions/{religion_id}")
  Call<JerseyResponse> updateReligions(
    @Path("religion_id") Long religionId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body ReligionUpdateRequest body
  );

}
