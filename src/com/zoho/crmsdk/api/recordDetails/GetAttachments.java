package com.zoho.crmsdk.api.record;

import com.zoho.crm.library.api.response.BulkAPIResponse;
import com.zoho.crm.library.crud.ZCRMAttachment;
import com.zoho.crm.library.crud.ZCRMNote;
import com.zoho.crm.library.crud.ZCRMRecord;
import com.zoho.crm.library.setup.restclient.ZCRMRestClient;

import java.util.List;

public class GetAttachments {
    public static void main(String[] args) throws Exception {

        ZCRMRestClient.initialize();

        System.out.println("======== Get list of attachments ========");

        ZCRMRecord record = ZCRMRecord.getInstance("Products", 123456l);
        BulkAPIResponse response = record.getAllAttachmentsDetails();
        List<ZCRMAttachment> attachments = (List<ZCRMAttachment>) response.getData();
    }

}
