package com.mypurecloud.sdk.v2.api.request;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;

public class PutExternalcontactsContactNoteRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String contactId;
	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public PutExternalcontactsContactNoteRequest withContactId(String contactId) {
	    this.setContactId(contactId);
	    return this;
	}

	private String noteId;
	public String getNoteId() {
		return this.noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public PutExternalcontactsContactNoteRequest withNoteId(String noteId) {
	    this.setNoteId(noteId);
	    return this;
	}

	private Note body;
	public Note getBody() {
		return this.body;
	}

	public void setBody(Note body) {
		this.body = body;
	}

	public PutExternalcontactsContactNoteRequest withBody(Note body) {
	    this.setBody(body);
	    return this;
	}

	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public PutExternalcontactsContactNoteRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Note> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'contactId' is set
        if (this.contactId == null) {
            throw new ApiException(400, "Missing the required parameter 'contactId' when building request for PutExternalcontactsContactNoteRequest.");
        }
        
        // verify the required parameter 'noteId' is set
        if (this.noteId == null) {
            throw new ApiException(400, "Missing the required parameter 'noteId' when building request for PutExternalcontactsContactNoteRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}")
                .withPathParameter("contactId", contactId)
        
                .withPathParameter("noteId", noteId)
        
                .withBody(body)
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String contactId, String noteId) {
	    return new Builder()
	            .withRequiredParams(contactId, noteId);
	}

	public static class Builder {
		private final PutExternalcontactsContactNoteRequest request;

		private Builder() {
			request = new PutExternalcontactsContactNoteRequest();
		}

		public Builder withContactId(String contactId) {
			request.setContactId(contactId);
			return this;
		}
		public Builder withNoteId(String noteId) {
			request.setNoteId(noteId);
			return this;
		}
		public Builder withBody(Note body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String contactId, String noteId) {
			request.setContactId(contactId);
			request.setNoteId(noteId);
			return this;
		}


		public PutExternalcontactsContactNoteRequest build() {
			return request;
		}
	}
}
