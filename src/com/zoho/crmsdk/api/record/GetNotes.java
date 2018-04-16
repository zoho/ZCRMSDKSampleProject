package com.zoho.crmsdk.api.record;

import com.zoho.crm.library.api.response.BulkAPIResponse;
import com.zoho.crm.library.common.CommonUtil;
import com.zoho.crm.library.crud.ZCRMModule;
import com.zoho.crm.library.crud.ZCRMNote;
import com.zoho.crm.library.crud.ZCRMRecord;
import com.zoho.crm.library.exception.ZCRMException;
import com.zoho.crm.library.setup.restclient.ZCRMRestClient;

import java.util.List;

public class GetNotes {
    public static void main(String[] args) throws Exception {

        ZCRMRestClient.initialize();

        System.out.println("======== Get list of notes ========");

        ZCRMRecord record = ZCRMRecord.getInstance("Products", 123456l);
        BulkAPIResponse response = record.getNotes();
        List<ZCRMNote> notes = (List<ZCRMNote>) response.getData();
    }

}
