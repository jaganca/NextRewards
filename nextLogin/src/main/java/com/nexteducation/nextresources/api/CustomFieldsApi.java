package com.nexteducation.nextresources.api;

import com.nexteducation.nextresources.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.nextresources.model.CustomFieldDTO;
import com.nexteducation.nextresources.model.JerseyResponse;
import com.nexteducation.nextresources.model.CustomFieldCountResponse;
import com.nexteducation.nextresources.model.CustomFieldFetchParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CustomFieldsApi {
  /**
   * Add Custom Fields
   * Add new Custom Fields
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
  
  @POST("v1/custom_fields")
  Call<JerseyResponse> addCustomFields(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Body CustomFieldDTO body
  );

  /**
   * Delete Custom Fields
   * Delete Custom Fields
   * @param customFieldId  (required)
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
  
  @DELETE("v1/custom_fields/{custom_field_id}")
  Call<JerseyResponse> deleteCustomFields(
    @Path("custom_field_id") Long customFieldId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles
  );

  /**
   * Fetch Custom Fields
   * Fetch Custom Fields based on filters
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param entity  (optional)
   * @param branchId  (optional)
   * @param search  (optional)
   * @param fetch  (optional)
   * @param formName  (optional)
   * @param entityInstanceIds  (optional)
   * @param customFieldIds  (optional)
   * @param mandatory  (optional)
   * @param fetchMandatory  (optional)
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
   * @return Call&lt;List<CustomFieldDTO>&gt;
   */
  
  @GET("v1/custom_fields")
  Call<List<CustomFieldDTO>> fetchCustomFields(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("entity") List<String> entity, @Query("branch_id") Long branchId, @Query("search") String search, @Query("fetch") List<String> fetch, @Query("form_name") String formName, @Query("entity_instance_ids") List<Long> entityInstanceIds, @Query("custom_field_ids") List<Long> customFieldIds, @Query("mandatory") Boolean mandatory, @Query("fetch_mandatory") Boolean fetchMandatory, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * Fetch Custom Fields Count
   * Fetch Custom Fields Count
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param entity  (optional)
   * @param branchId  (optional)
   * @param search  (optional)
   * @param fetch  (optional)
   * @param formName  (optional)
   * @param entityInstanceIds  (optional)
   * @param customFieldIds  (optional)
   * @param mandatory  (optional)
   * @param fetchMandatory  (optional)
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
   * @return Call&lt;CustomFieldCountResponse&gt;
   */
  
  @GET("v1/custom_fields/count")
  Call<CustomFieldCountResponse> fetchCustomFieldsCount(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("entity") List<String> entity, @Query("branch_id") Long branchId, @Query("search") String search, @Query("fetch") List<String> fetch, @Query("form_name") String formName, @Query("entity_instance_ids") List<Long> entityInstanceIds, @Query("custom_field_ids") List<Long> customFieldIds, @Query("mandatory") Boolean mandatory, @Query("fetch_mandatory") Boolean fetchMandatory, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * Fetch Custom Fields Not In Form
   * Fetch Custom Fields based on filters
   * @param lbid Session Parameter - Branch Id (required)
   * @param lasid Session Parameter - Academic Session Id (required)
   * @param luid Session Parameter - User Id (required)
   * @param entity  (optional)
   * @param branchId  (optional)
   * @param search  (optional)
   * @param fetch  (optional)
   * @param formName  (optional)
   * @param entityInstanceIds  (optional)
   * @param customFieldIds  (optional)
   * @param mandatory  (optional)
   * @param fetchMandatory  (optional)
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
   * @return Call&lt;List<CustomFieldDTO>&gt;
   */
  
  @GET("v1/custom_fields/not_in_form")
  Call<List<CustomFieldDTO>> fetchCustomFieldsNotInForm(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("entity") List<String> entity, @Query("branch_id") Long branchId, @Query("search") String search, @Query("fetch") List<String> fetch, @Query("form_name") String formName, @Query("entity_instance_ids") List<Long> entityInstanceIds, @Query("custom_field_ids") List<Long> customFieldIds, @Query("mandatory") Boolean mandatory, @Query("fetch_mandatory") Boolean fetchMandatory, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * Fetch Custom Fields With Data
   * Fetch Custom Fields with data based on filters
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
   * @return Call&lt;List<CustomFieldDTO>&gt;
   */
  
  @POST("v1/custom_fields/data")
  Call<List<CustomFieldDTO>> fetchCustomFieldsWithData(
    @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body CustomFieldFetchParams body
  );

  /**
   * Fetch Custom Fields
   * Fetch Custom fields based on Id
   * @param customFieldId  (required)
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
   * @return Call&lt;CustomFieldDTO&gt;
   */
  
  @GET("v1/custom_fields/{custom_field_id}")
  Call<CustomFieldDTO> fetchCustomFields_0(
    @Path("custom_field_id") Long customFieldId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select
  );

  /**
   * Update Custom Fields
   * Update existing Custom Fields
   * @param customFieldId  (required)
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
  
  @PUT("v1/custom_fields/{custom_field_id}")
  Call<JerseyResponse> updateCustomFields(
    @Path("custom_field_id") Long customFieldId, @Query("lbid") Long lbid, @Query("lasid") Long lasid, @Query("luid") Long luid, @Query("lcasid") Long lcasid, @Query("lupid") Long lupid, @Query("ptype") String ptype, @Query("cform") Boolean cform, @Query("csform") Boolean csform, @Query("lstduid") Long lstduid, @Query("roles") List<String> roles, @Query("sort_by") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("page_size") Integer pageSize, @Query("select") String select, @Body CustomFieldDTO body
  );

}
