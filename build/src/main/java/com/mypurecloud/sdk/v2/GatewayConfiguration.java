package com.mypurecloud.sdk.v2;

public class GatewayConfiguration {
    
    // Gateway Host
    private String host = null;

    // Gateway Protocol
    private String protocol = null;
    
    // Gateway Port
    private int port = -1;

    // Gateway Path Param for Login
    private String pathParamsLogin = null;
    
    // Gateway Path Param for API
    private String pathParamsApi = null;
    
    // Gateway Username (future)
    private String username = null;
    
    // Gateway Password (future)
    private String password = null;

    GatewayConfiguration() {
        this.host = null;
        this.protocol = "https";
        this.port = -1;
        this.pathParamsLogin = "";
        this.pathParamsApi = "";
        this.username = null;
        this.password = null;
    }

    GatewayConfiguration(
        String host,
        String protocol,
        int port,
        String pathParamsLogin,
        String pathParamsApi,
        String username,
        String password
    ) {
        super();
        this.setHost(host);
        this.setProtocol(protocol);
        this.setPort(port);
        this.setPathParamsLogin(pathParamsLogin);
        this.setPathParamsApi(pathParamsApi);
        this.setUsername(username);
        this.setPassword(password);
    }

    GatewayConfiguration(
        String host,
        String protocol,
        int port,
        String pathParamsLogin,
        String pathParamsApi
    ) {
        super();
        this.setHost(host);
        this.setProtocol(protocol);
        this.setPort(port);
        this.setPathParamsLogin(pathParamsLogin);
        this.setPathParamsApi(pathParamsApi);
    }

    String getHost() {
        return this.host;
    }

    void setHost(String host) {
        if (host != null && !host.isEmpty()) {
            this.host = host;
        }
    }

    String getProtocol() {
        return this.protocol;
    }

    void setProtocol(String protocol) {
        if (protocol != null && !protocol.isEmpty()) {
            this.protocol = protocol;
        } else {
            this.protocol = "https";
        }
    }

    int getPort() {
        return this.port;
    }

    void setPort(int port) {
        if (port > -1) {
            this.port = port;
        } else {
            this.port = -1;
        }
    }

    String getPathParamsLogin() {
        return this.pathParamsLogin;
    }

    void setPathParamsLogin(String pathParams) {
        if (pathParams != null && !pathParams.isEmpty()) {
            this.pathParamsLogin = pathParams;
            if (this.pathParamsLogin.endsWith("/")) {
                this.pathParamsLogin = this.pathParamsLogin.substring(
                                            0,
                                            this.pathParamsLogin.length() - 1);
            }
        } else {
            this.pathParamsLogin = "";
        }
    }

    String getPathParamsApi() {
        return this.pathParamsApi;
    }

    void setPathParamsApi(String pathParams) {
        if (pathParams != null && !pathParams.isEmpty()) {
            this.pathParamsApi = pathParams;
            if (this.pathParamsApi.endsWith("/")) {
                this.pathParamsApi = this.pathParamsApi.substring(
                                            0,
                                            this.pathParamsApi.length() - 1);
            }
        } else {
            this.pathParamsApi = "";
        }
    }

    String getUsername() {
        return this.username;
    }

    void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        }
    }

    String getPassword() {
        return this.password;
    }

    void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        }
    }
}
