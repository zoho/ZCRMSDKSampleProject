package com.zoho.crmsdk.api.setup;

import com.zoho.crm.library.api.response.BulkAPIResponse;
import com.zoho.crm.library.api.response.FileAPIResponse;
import com.zoho.crm.library.crud.ZCRMAttachment;
import com.zoho.crm.library.crud.ZCRMLayout;
import com.zoho.crm.library.crud.ZCRMModule;
import com.zoho.crm.library.crud.ZCRMRecord;
import com.zoho.crm.library.exception.ZCRMException;
import com.zoho.crm.library.setup.restclient.ZCRMRestClient;

import java.io.IOException;
import java.util.List;

public class GetLayoutDetails {
    public static void main(String[] args) throws Exception {

        ZCRMRestClient.initialize();

        System.out.println("======== Get list of layouts ========");

        ZCRMModule module = ZCRMModule.getInstance("Products"); // module apiname
        BulkAPIResponse response = module.getLayouts();
        List<ZCRMLayout> layouts = (List<ZCRMLayout>) response.getData();

    }
}
