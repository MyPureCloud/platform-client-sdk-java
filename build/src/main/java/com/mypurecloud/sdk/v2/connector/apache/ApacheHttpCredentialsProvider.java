package com.mypurecloud.sdk.v2.connector.apache;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;

import java.security.Principal;

import java.util.HashMap;

public class ApacheHttpCredentialsProvider implements CredentialsProvider {
    private HashMap<String, Credentials> map = new HashMap<>();

    public ApacheHttpCredentialsProvider(String hostname, int port, String user, String pass) {
        PrincipalWrapper principalWrapper = new PrincipalWrapper(user);
        setCredentials(new AuthScope(hostname, port), new CredentialsWrapper(principalWrapper, pass));
    }

    @Override
    public void setCredentials(AuthScope authScope, Credentials credentials) {
        map.put(authDescription(authScope), credentials);
    }

    @Override
    public Credentials getCredentials(AuthScope authScope) {
        return map.get(authDescription(authScope));
    }

    @Override
    public void clear() {
        map.clear();
    }

    private String authDescription(AuthScope authScope) {
        return authScope.getHost() + ":" + authScope.getPort();
    }

    private class CredentialsWrapper implements Credentials {
        private Principal principal;
        private String pass;

        public CredentialsWrapper(Principal principal, String pass) {
            this.principal = principal;
            this.pass = pass;
        }

        @Override
        public Principal getUserPrincipal() {
            return principal;
        }

        @Override
        public String getPassword() {
            return pass;
        }
    }

    private class PrincipalWrapper implements Principal {
        private String name;

        public PrincipalWrapper(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}
