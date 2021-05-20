package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.DataSchemaListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.CursorContactListing;
import com.mypurecloud.sdk.v2.model.CursorNoteListing;
import com.mypurecloud.sdk.v2.model.CursorOrganizationListing;
import com.mypurecloud.sdk.v2.model.CursorRelationshipListing;
import com.mypurecloud.sdk.v2.model.BulkFetchContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkIdsRequest;
import com.mypurecloud.sdk.v2.model.BulkContactsResponse;
import com.mypurecloud.sdk.v2.model.BulkContactsRequest;
import com.mypurecloud.sdk.v2.model.BulkDeleteResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkNotesResponse;
import com.mypurecloud.sdk.v2.model.BulkNotesRequest;
import com.mypurecloud.sdk.v2.model.BulkFetchOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsRequest;
import com.mypurecloud.sdk.v2.model.BulkOrganizationsResponse;
import com.mypurecloud.sdk.v2.model.BulkFetchRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsRequest;
import com.mypurecloud.sdk.v2.model.BulkRelationshipsResponse;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationTrustorLink;

public class PutExternalcontactsContactNoteRequest {
    
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

    public ApiRequest<Note> withHttpInfo() {
        
        // verify the required parameter 'contactId' is set
        if (this.contactId == null) {
            throw new IllegalStateException("Missing the required parameter 'contactId' when building request for PutExternalcontactsContactNoteRequest.");
        }
        
        // verify the required parameter 'noteId' is set
        if (this.noteId == null) {
            throw new IllegalStateException("Missing the required parameter 'noteId' when building request for PutExternalcontactsContactNoteRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutExternalcontactsContactNoteRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/externalcontacts/contacts/{contactId}/notes/{noteId}")
                .withPathParameter("contactId", contactId)
        
                .withPathParameter("noteId", noteId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String contactId, String noteId, Note body) {
	    return new Builder()
	            .withRequiredParams(contactId, noteId, body);
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
		

		
		public Builder withRequiredParams(String contactId, String noteId, Note body) {
			request.setContactId(contactId);
						request.setNoteId(noteId);
						request.setBody(body);
			
			return this;
		}
		

		public PutExternalcontactsContactNoteRequest build() {
            
            // verify the required parameter 'contactId' is set
            if (request.contactId == null) {
                throw new IllegalStateException("Missing the required parameter 'contactId' when building request for PutExternalcontactsContactNoteRequest.");
            }
            
            // verify the required parameter 'noteId' is set
            if (request.noteId == null) {
                throw new IllegalStateException("Missing the required parameter 'noteId' when building request for PutExternalcontactsContactNoteRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutExternalcontactsContactNoteRequest.");
            }
            
			return request;
		}
	}
}
