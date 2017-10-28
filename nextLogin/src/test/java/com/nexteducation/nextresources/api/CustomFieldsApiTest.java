package com.nexteducation.nextresources.api;

import com.nexteducation.nextresources.ApiClient;
import com.nexteducation.nextresources.model.CustomFieldDTO;
import com.nexteducation.nextresources.model.JerseyResponse;
import com.nexteducation.nextresources.model.CustomFieldCountResponse;
import com.nexteducation.nextresources.model.CustomFieldFetchParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFieldsApi
 */
public class CustomFieldsApiTest {

    private CustomFieldsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CustomFieldsApi.class);
    }

    
    /**
     * Add Custom Fields
     *
     * Add new Custom Fields
     */
    @Test
    public void addCustomFieldsTest() {
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
        CustomFieldDTO body = null;
        // JerseyResponse response = api.addCustomFields(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, body);

        // TODO: test validations
    }
    
    /**
     * Delete Custom Fields
     *
     * Delete Custom Fields
     */
    @Test
    public void deleteCustomFieldsTest() {
        Long customFieldId = null;
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
        // JerseyResponse response = api.deleteCustomFields(customFieldId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles);

        // TODO: test validations
    }
    
    /**
     * Fetch Custom Fields
     *
     * Fetch Custom Fields based on filters
     */
    @Test
    public void fetchCustomFieldsTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        List<String> entity = null;
        Long branchId = null;
        String search = null;
        List<String> fetch = null;
        String formName = null;
        List<Long> entityInstanceIds = null;
        List<Long> customFieldIds = null;
        Boolean mandatory = null;
        Boolean fetchMandatory = null;
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
        // List<CustomFieldDTO> response = api.fetchCustomFields(lbid, lasid, luid, entity, branchId, search, fetch, formName, entityInstanceIds, customFieldIds, mandatory, fetchMandatory, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * Fetch Custom Fields Count
     *
     * Fetch Custom Fields Count
     */
    @Test
    public void fetchCustomFieldsCountTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        List<String> entity = null;
        Long branchId = null;
        String search = null;
        List<String> fetch = null;
        String formName = null;
        List<Long> entityInstanceIds = null;
        List<Long> customFieldIds = null;
        Boolean mandatory = null;
        Boolean fetchMandatory = null;
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
        // CustomFieldCountResponse response = api.fetchCustomFieldsCount(lbid, lasid, luid, entity, branchId, search, fetch, formName, entityInstanceIds, customFieldIds, mandatory, fetchMandatory, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * Fetch Custom Fields Not In Form
     *
     * Fetch Custom Fields based on filters
     */
    @Test
    public void fetchCustomFieldsNotInFormTest() {
        Long lbid = null;
        Long lasid = null;
        Long luid = null;
        List<String> entity = null;
        Long branchId = null;
        String search = null;
        List<String> fetch = null;
        String formName = null;
        List<Long> entityInstanceIds = null;
        List<Long> customFieldIds = null;
        Boolean mandatory = null;
        Boolean fetchMandatory = null;
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
        // List<CustomFieldDTO> response = api.fetchCustomFieldsNotInForm(lbid, lasid, luid, entity, branchId, search, fetch, formName, entityInstanceIds, customFieldIds, mandatory, fetchMandatory, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * Fetch Custom Fields With Data
     *
     * Fetch Custom Fields with data based on filters
     */
    @Test
    public void fetchCustomFieldsWithDataTest() {
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
        CustomFieldFetchParams body = null;
        // List<CustomFieldDTO> response = api.fetchCustomFieldsWithData(lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
    /**
     * Fetch Custom Fields
     *
     * Fetch Custom fields based on Id
     */
    @Test
    public void fetchCustomFields_0Test() {
        Long customFieldId = null;
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
        // CustomFieldDTO response = api.fetchCustomFields_0(customFieldId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select);

        // TODO: test validations
    }
    
    /**
     * Update Custom Fields
     *
     * Update existing Custom Fields
     */
    @Test
    public void updateCustomFieldsTest() {
        Long customFieldId = null;
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
        CustomFieldDTO body = null;
        // JerseyResponse response = api.updateCustomFields(customFieldId, lbid, lasid, luid, lcasid, lupid, ptype, cform, csform, lstduid, roles, sortBy, filter, page, pageSize, select, body);

        // TODO: test validations
    }
    
}
