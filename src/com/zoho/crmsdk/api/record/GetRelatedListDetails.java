package com.zoho.crmsdk.api.record;

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

public class GetRelatedListDetails {
    public static void main(String[] args) throws Exception {

        ZCRMRestClient.initialize();

        System.out.println("======== Get related records ========");
        ZCRMRecord record = ZCRMRecord.getInstance("Contacts", 12345l);//module api name with record id
        BulkAPIResponse response = record.getRelatedListRecords("Deals");
        List<ZCRMRecord> deals = (List<ZCRMRecord>) response.getData();
    }
}
