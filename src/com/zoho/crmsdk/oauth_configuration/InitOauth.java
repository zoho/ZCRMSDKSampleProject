package com.zoho.crmsdk.oauth_configuration;

import com.zoho.crm.library.setup.restclient.ZCRMRestClient;
import com.zoho.oauth.client.ZohoOAuthClient;
import com.zoho.oauth.contract.ZohoOAuthTokens;

public class InitOauth {
    public static void main(String[] args) throws Exception {
        generateToken();
    }

    public static void generateToken() throws Exception {
        ZCRMRestClient.initialize();
        ZohoOAuthClient cli = ZohoOAuthClient.getInstance();
        String grantToken = "your_grant_token";
        ZohoOAuthTokens tokens = cli.generateAccessToken(grantToken);
        System.out.println(">>>> grantToken" + grantToken + " >>>> accessToken : " + tokens.getAccessToken()+" >>>>> ref token :"+tokens.getRefreshToken());
    }
}
