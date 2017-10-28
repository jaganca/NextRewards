package com.nexteducation.nextresources.api;

import com.nexteducation.nextresources.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }

    
    /**
     * 
     *
     * 
     */
    @Test
    public void addAutoNumberingsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        AutoNumberingAddRequest body = null;
        // AddResponse response = api.addAutoNumberings(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addCastesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        CasteAddRequest body = null;
        // AddResponse response = api.addCastes(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addCategoriesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        CategoryAddRequest body = null;
        // JerseyResponse response = api.addCategories(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * add Chapters
     *
     * add Chapters
     */
    @Test
    public void addChapterTest() {
        ChapterAddRequest body = null;
        // StatusResponse response = api.addChapter(body);

        // TODO: test validations
    }
    
    /**
     * add Completed concepts
     *
     * add completed Concepts
     */
    @Test
    public void addCompletedConceptsTest() {
        ConceptCompleteAddRequest body = null;
        // StatusResponse response = api.addCompletedConcepts(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addCustomFieldDataTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        CustomFieldDataDTO body = null;
        // JerseyResponse response = api.addCustomFieldData(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addCustomFieldData_0Test() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        List<CustomFieldDataDTO> body = null;
        // JerseyResponse response = api.addCustomFieldData_0(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addCustomFormElementsTest() {
        String formName = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        CustomFormElementRequest body = null;
        // JerseyResponse response = api.addCustomFormElements(formName, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addCustomFormElementsBulkTest() {
        String formName = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        List<CustomFormElementRequest> body = null;
        // JerseyResponse response = api.addCustomFormElementsBulk(formName, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addLanguagesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        LanguageAddRequest body = null;
        // AddResponse response = api.addLanguages(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * add mind map 
     *
     * add mind map
     */
    @Test
    public void addMindMapTest() {
        Long subjectId = null;
        MindMapAddRequest body = null;
        // StatusResponse response = api.addMindMap(subjectId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addOrUpdateCustomFormElementsTest() {
        String formName = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        List<CustomFormElementRequest> body = null;
        // JerseyResponse response = api.addOrUpdateCustomFormElements(formName, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addOrupdateCustomFieldDataTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        List<CustomFieldDataDTO> body = null;
        // JerseyResponse response = api.addOrupdateCustomFieldData(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addProductFeatureTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        ProductFeatureAddRequest body = null;
        // JerseyResponse response = api.addProductFeature(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void addReligionsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        ReligionAddRequest body = null;
        // JerseyResponse response = api.addReligions(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * add questions
     *
     * add questions
     */
    @Test
    public void addquestionTest() {
        QuestionAddRequest body = null;
        // StatusResponse response = api.addquestion(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteAutoNumberingsTest() {
        Long autoNumberingId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // JerseyResponse response = api.deleteAutoNumberings(autoNumberingId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteCastesTest() {
        Long casteId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // JerseyResponse response = api.deleteCastes(casteId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteCategoriesTest() {
        Long categoryId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // JerseyResponse response = api.deleteCategories(categoryId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteCustomFieldDataTest() {
        Long customFieldDataId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        // JerseyResponse response = api.deleteCustomFieldData(customFieldDataId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteCustomFieldListsTest() {
        Long customFieldListId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        // JerseyResponse response = api.deleteCustomFieldLists(customFieldListId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteCustomFormElementsTest() {
        Long customFormElementId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        // JerseyResponse response = api.deleteCustomFormElements(customFormElementId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteLanguagesTest() {
        Long languageId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // JerseyResponse response = api.deleteLanguages(languageId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteProductFeatureTest() {
        Long productFeatureId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // JerseyResponse response = api.deleteProductFeature(productFeatureId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void deleteReligionsTest() {
        Long religionId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // JerseyResponse response = api.deleteReligions(religionId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllCastesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long branchId = null;
        List<Long> parentIds = null;
        List<String> fetch = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<CasteResponse> response = api.fetchAllCastes(lbid, lasid, luid, branchId, parentIds, fetch, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllCategoriesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<CategoryResponse> response = api.fetchAllCategories(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllCustomFieldDataTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long customFieldId = null;
        List<Long> customFieldIds = null;
        String entity = null;
        List<String> entities = null;
        Long formId = null;
        Long branchId = null;
        Long entityInstanceId = null;
        List<Long> entityInstanceIds = null;
        List<String> fetch = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<CustomFieldDataDTO> response = api.fetchAllCustomFieldData(lbid, lasid, luid, customFieldId, customFieldIds, entity, entities, formId, branchId, entityInstanceId, entityInstanceIds, fetch, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllEntitiesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<EntityResponse> response = api.fetchAllEntities(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllLanguagesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<LanguageResponse> response = api.fetchAllLanguages(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllParentCastesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<CasteCustomResponse> response = api.fetchAllParentCastes(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllProductFeaturesTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<ProductFeatureResponse> response = api.fetchAllProductFeatures(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllReligionsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<ReligionResponse> response = api.fetchAllReligions(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAutoNumberingsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        String type = null;
        // List<AutoNumberingResponse> response = api.fetchAutoNumberings(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, type);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAutoNumberings_0Test() {
        Long autoNumberingId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // AutoNumberingResponse response = api.fetchAutoNumberings_0(autoNumberingId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchCastesTest() {
        Long casteId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // CasteResponse response = api.fetchCastes(casteId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchCategoriesTest() {
        Long categoryId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // CategoryResponse response = api.fetchCategories(categoryId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * Fetch Chapters
     *
     * Fetch Chapters
     */
    @Test
    public void fetchChapterTest() {
        Long subjectId = null;
        Long classId = null;
        Long chapterId = null;
        Long studentId = null;
        // List<ChapterResponse> response = api.fetchChapter(subjectId, classId, chapterId, studentId);

        // TODO: test validations
    }
    
    /**
     * Fetch Chapters
     *
     * Fetch Chapters
     */
    @Test
    public void fetchChapterByClassTest() {
        Long subjectId = null;
        Long classId = null;
        Long chapterId = null;
        Long studentId = null;
        // List<ChapterResponse> response = api.fetchChapterByClass(subjectId, classId, chapterId, studentId);

        // TODO: test validations
    }
    
    /**
     * Fetch Chapters
     *
     * Fetch Chapters
     */
    @Test
    public void fetchChaptersTest() {
        Long subjectId = null;
        Long classId = null;
        Long chapterId = null;
        Long studentId = null;
        // ChapterResponse response = api.fetchChapters(subjectId, classId, chapterId, studentId);

        // TODO: test validations
    }
    
    /**
     * Fetch Classes
     *
     * Fetch Classes
     */
    @Test
    public void fetchClassesTest() {
        ClassFetchParams body = null;
        // List<StudyClassResponse> response = api.fetchClasses(body);

        // TODO: test validations
    }
    
    /**
     * fetch Completed concepts
     *
     * fetch completed Concepts
     */
    @Test
    public void fetchCompletedConceptsTest() {
        Long chapterId = null;
        ConceptCompleteAddRequest body = null;
        // List<ConceptCompletedResponse> response = api.fetchCompletedConcepts(chapterId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchCustomFieldListsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long customFieldId = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<CustomFieldListResponse> response = api.fetchCustomFieldLists(lbid, lasid, luid, customFieldId, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchCustomFormElementsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long branchId = null;
        Long formId = null;
        String formName = null;
        String entity = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<CustomFormElementResponse> response = api.fetchCustomFormElements(lbid, lasid, luid, branchId, formId, formName, entity, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchCustomFormElements_0Test() {
        Long customFormElementId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        // CustomFormElementResponse response = api.fetchCustomFormElements_0(customFormElementId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchLanguagesTest() {
        Long languageId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // LanguageResponse response = api.fetchLanguages(languageId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchReligionsTest() {
        Long religionId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // ReligionResponse response = api.fetchReligions(religionId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchStandardFieldsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        String entity = null;
        String formName = null;
        Long formId = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<StandardFieldDTO> response = api.fetchStandardFields(lbid, lasid, luid, entity, formName, formId, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void fetchSubCastesTest() {
        Long casteId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // List<CasteCustomResponse> response = api.fetchSubCastes(casteId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * Fetch Subjects
     *
     * Fetch Subjects
     */
    @Test
    public void fetchSubjectTest() {
        Long staffId = null;
        // List<SubjectResponse> response = api.fetchSubject(staffId);

        // TODO: test validations
    }
    
    /**
     * fetch prereq
     *
     * fetch prereq
     */
    @Test
    public void fetchquestionsTest() {
        Long chapterId = null;
        // List<MindMapResponse> response = api.fetchquestions(chapterId);

        // TODO: test validations
    }
    
    /**
     * fetch questions
     *
     * fetch questions
     */
    @Test
    public void fetchquestions_0Test() {
        Long chapterId = null;
        // List<QuestionResponse> response = api.fetchquestions_0(chapterId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void generateAutoGeneratedNosTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        AutoNumberingGenerateRequest body = null;
        // AutoNumberingResponse response = api.generateAutoGeneratedNos(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void generateAutoGeneratedNosByIdTest() {
        Long autoNumberingId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // AutoNumberingResponse response = api.generateAutoGeneratedNosById(autoNumberingId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void generateAutoNumberTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        AutoNumberingAddRequest body = null;
        // AutoNumberingResponse response = api.generateAutoNumber(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getCustomFieldDataTest() {
        Long customFieldDataId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        // CustomFieldDataDTO response = api.getCustomFieldData(customFieldDataId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void getProductFeatureTest() {
        Long productFeatureId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        // ProductFeatureResponse response = api.getProductFeature(productFeatureId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void registerAuthenticityTest() {
        UserRegistrationFetchRequest body = null;
        // LoginCustomResponse response = api.registerAuthenticity(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void registerUserTest() {
        UserRegistrationRequest body = null;
        // StatusResponse response = api.registerUser(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void saveCustomFieldDataTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        List<CustomFieldDataDTO> body = null;
        // JerseyResponse response = api.saveCustomFieldData(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * save questions
     *
     * save questions
     */
    @Test
    public void saverepliesTest() {
        List<QuestionReplyRequest> body = null;
        // CustomQuestionResponse response = api.savereplies(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateAutoNumberingsTest() {
        String autoNumberingId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        AutoNumberingUpdateRequest body = null;
        // JerseyResponse response = api.updateAutoNumberings(autoNumberingId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateBulkAutoNumberingsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        List<AutoNumberingUpdateRequest> body = null;
        // JerseyResponse response = api.updateBulkAutoNumberings(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateCastesTest() {
        Long casteId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        CasteUpdateRequest body = null;
        // JerseyResponse response = api.updateCastes(casteId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateCategoriesTest() {
        Long categoryId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        CategoryUpdateRequest body = null;
        // JerseyResponse response = api.updateCategories(categoryId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateCustomFieldDataTest() {
        Long customFieldDataId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        CustomFieldDataDTO body = null;
        // JerseyResponse response = api.updateCustomFieldData(customFieldDataId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateCustomFormElementsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long customFormElementId = null;
        String formName = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        CustomFormElementRequest body = null;
        // JerseyResponse response = api.updateCustomFormElements(lbid, lasid, luid, customFormElementId, formName, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateLanguagesTest() {
        Long languageId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        LanguageUpdateRequest body = null;
        // JerseyResponse response = api.updateLanguages(languageId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateProductFeatureTest() {
        Long productFeatureId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        ProductFeatureUpdateRequest body = null;
        // JerseyResponse response = api.updateProductFeature(productFeatureId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     */
    @Test
    public void updateReligionsTest() {
        Long religionId = null;
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        Long lcasid = null;
        Long lupid = null;
        String ptype = null;
        Boolean cform = null;
        Boolean csform = null;
        Long lstduid = null;
        List<String> roles = null;
        String sortBy = null;
        String filter = null;
        Integer page = null;
        Integer pageSize = null;
        String select = null;
        ReligionUpdateRequest body = null;
        // JerseyResponse response = api.updateReligions(religionId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
}
