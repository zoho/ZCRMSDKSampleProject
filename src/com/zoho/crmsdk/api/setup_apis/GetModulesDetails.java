package com.zoho.crmsdk.api.setup;

import com.sun.javafx.tools.packager.Log;
import com.zoho.crm.library.api.response.APIResponse;
import com.zoho.crm.library.api.response.BulkAPIResponse;
import com.zoho.crm.library.api.response.FileAPIResponse;
import com.zoho.crm.library.common.CommonUtil;
import com.zoho.crm.library.common.ZCRMConfigUtil;
import com.zoho.crm.library.crud.ZCRMAttachment;
import com.zoho.crm.library.crud.ZCRMLayout;
import com.zoho.crm.library.crud.ZCRMModule;
import com.zoho.crm.library.crud.ZCRMRecord;
import com.zoho.crm.library.exception.ZCRMException;
import com.zoho.crm.library.exception.ZCRMLogger;
import com.zoho.crm.library.setup.restclient.ZCRMRestClient;
import com.zoho.oauth.client.ZohoOAuthClient;
import com.zoho.oauth.contract.ZohoOAuthTokens;

import java.io.IOException;
import java.util.List;

public class GetModulesDetails {
    public static void main(String[] args) throws Exception {

        ZCRMRestClient.initialize();

        System.out.println("======== Get list of modules ========");

        ZCRMRestClient client = ZCRMRestClient.getInstance();
        BulkAPIResponse response = client.getAllModules();
        List<ZCRMModule> modules = (List<ZCRMModule>) response.getData();

    }

}
