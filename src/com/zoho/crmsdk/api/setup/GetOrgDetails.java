package com.zoho.crmsdk.api.setup;

import com.zoho.crm.library.api.response.APIResponse;
import com.zoho.crm.library.api.response.BulkAPIResponse;
import com.zoho.crm.library.crud.ZCRMModule;
import com.zoho.crm.library.setup.metadata.ZCRMOrganization;
import com.zoho.crm.library.setup.restclient.ZCRMRestClient;

import java.util.List;

public class GetOrgDetails {
    public static void main(String[] args) throws Exception {

        ZCRMRestClient.initialize();

        System.out.println("======== Organization details ========");

        ZCRMRestClient client = ZCRMRestClient.getInstance();
        APIResponse response = client.getOrganizationDetails();
        ZCRMOrganization org = (ZCRMOrganization) response.getData();

    }

}
