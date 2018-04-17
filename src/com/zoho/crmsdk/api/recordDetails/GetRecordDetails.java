package com.zoho.crmsdk.api.record;

import com.zoho.crm.library.api.response.BulkAPIResponse;
import com.zoho.crm.library.common.CommonUtil;
import com.zoho.crm.library.crud.ZCRMModule;
import com.zoho.crm.library.crud.ZCRMRecord;
import com.zoho.crm.library.setup.restclient.ZCRMRestClient;

import java.util.List;

public class GetRecordDetails {
    public static void main(String[] args) throws Exception {

        ZCRMRestClient.initialize();

        System.out.println("======== Get list of records ========");

        ZCRMModule module = ZCRMModule.getInstance("Products"); //module api name
        BulkAPIResponse response = module.getRecords(425476547854l, "Company", CommonUtil.SortOrder.asc, 1, 4, null);
        List<ZCRMRecord> records = (List<ZCRMRecord>) response.getData();
    }

}
