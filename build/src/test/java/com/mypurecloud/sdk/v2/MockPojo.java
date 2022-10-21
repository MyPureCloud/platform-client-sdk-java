package com.mypurecloud.sdk.v2;

public class MockPojo {

    private String id;

    public MockPojo() {}

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MockPojo [id "+ getId() + "]";
    }    

}