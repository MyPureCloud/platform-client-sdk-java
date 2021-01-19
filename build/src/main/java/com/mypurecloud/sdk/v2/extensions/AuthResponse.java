package com.mypurecloud.sdk.v2.extensions;

import java.io.Serializable;

public class AuthResponse implements Serializable {
    private String access_token;
    private String refresh_token;
    private String token_type;
    private int expires_in;
    private String error;

    public String getAccess_token() {
        return access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "[AuthResponse]\n" +
                "  access_token=" + access_token + "\n" +
                "  refresh_token=" + refresh_token + "\n" +
                "  token_type=" + token_type + "\n" +
                "  expires_in=" + expires_in + "\n" +
                "  error=" + error + "\n";
    }
}
