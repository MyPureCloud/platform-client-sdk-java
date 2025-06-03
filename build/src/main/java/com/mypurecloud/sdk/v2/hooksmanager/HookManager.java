package com.mypurecloud.sdk.v2.hooksmanager;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HookManager {
    private List<PreRequestHook> preRequestHooks;
    private List<PostResponseHook> postResponseHooks;

    public HookManager() {
        this.preRequestHooks = new ArrayList<>();
        this.postResponseHooks = new ArrayList<>();
    }

    public List<PreRequestHook> getPreRequestHooks() {
        return Collections.unmodifiableList(preRequestHooks);
    }
    
    public List<PostResponseHook> getPostResponseHooks() {
        return Collections.unmodifiableList(postResponseHooks);
    }
    
    public void addPreRequestHook(PreRequestHook hook) {
        if (hook != null) {
            this.preRequestHooks.add(hook);
        }
    }

    public void removePreRequestHook(PreRequestHook hook) {
        this.preRequestHooks.remove(hook);
    }

    public void addPostResponseHook(PostResponseHook hook) {
        if (hook != null) {
            this.postResponseHooks.add(hook);
        }
    }

    public void removePostResponseHook(PostResponseHook hook) {
        this.postResponseHooks.remove(hook);
    }
}