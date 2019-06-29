package com.mypurecloud.sdk.v2;

public enum PureCloudRegionHosts {
    us_east_1( "https://api.mypurecloud.com"),
    eu_west_1("https://api.mypurecloud.ie"),
    ap_southeast_2( "https://api.mypurecloud.com.au"),
    ap_northeast_1("https://api.mypurecloud.jp"),
    eu_central_1("https://api.mypurecloud.de");


    private String apiHost;
    PureCloudRegionHosts(String apiHost) {
        this.apiHost = apiHost;
    }

    public String getApiHost() {
        return apiHost;
    }
}
