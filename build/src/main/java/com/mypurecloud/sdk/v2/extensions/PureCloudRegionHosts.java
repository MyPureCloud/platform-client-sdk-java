package com.mypurecloud.sdk.v2.extensions;

public enum PureCloudRegionHosts {
    us_east_1( "api.mypurecloud.com"),
    eu_west_1("api.mypurecloud.ie"),
    ap_southeast_2( "api.mypurecloud.com.au"),
    ap_northeast_1("api.mypurecloud.jp"),
    eu_central_1("api.mypurecloud.de");


    private String apiHost;
    PureCloudRegionHosts(String apiHost) {
        this.apiHost = apiHost;
    }

    public String getApiHost() {
        return apiHost;
    }
}

