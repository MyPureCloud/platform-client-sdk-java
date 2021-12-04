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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.RecordingMetadata;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobStatusResult;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicy;
import com.mypurecloud.sdk.v2.model.RecordingJob;
import com.mypurecloud.sdk.v2.model.FailedRecordingEntityListing;
import com.mypurecloud.sdk.v2.model.RecordingJobEntityListing;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyUpdate;
import com.mypurecloud.sdk.v2.model.PolicyUpdate;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmission;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmissionResult;
import com.mypurecloud.sdk.v2.model.CrossPlatformPolicyCreate;
import com.mypurecloud.sdk.v2.model.RecordingJobsQuery;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.ConversationDeletionProtectionQuery;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AcknowledgeScreenRecordingRequest;
import com.mypurecloud.sdk.v2.model.ScreenRecordingMetaDataRequest;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;
import com.mypurecloud.sdk.v2.model.ExecuteRecordingJobsQuery;

public class GetOrphanrecordingMediaRequest {
    
	private String orphanId;
	public String getOrphanId() {
		return this.orphanId;
	}

	public void setOrphanId(String orphanId) {
		this.orphanId = orphanId;
	}

	public GetOrphanrecordingMediaRequest withOrphanId(String orphanId) {
	    this.setOrphanId(orphanId);
	    return this;
	} 
	
	private String formatId;
	public String getFormatId() {
		return this.formatId;
	}

	public void setFormatId(String formatId) {
		this.formatId = formatId;
	}

	public GetOrphanrecordingMediaRequest withFormatId(String formatId) {
	    this.setFormatId(formatId);
	    return this;
	} 

	public enum formatIdValues { 
		WAV("WAV"), 
		WEBM("WEBM"), 
		WAV_ULAW("WAV_ULAW"), 
		OGG_VORBIS("OGG_VORBIS"), 
		OGG_OPUS("OGG_OPUS"), 
		MP3("MP3"), 
		NONE("NONE");

		private String value;

		formatIdValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static formatIdValues fromString(String key) {
			if (key == null) return null;

			for (formatIdValues value : formatIdValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return formatIdValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String emailFormatId;
	public String getEmailFormatId() {
		return this.emailFormatId;
	}

	public void setEmailFormatId(String emailFormatId) {
		this.emailFormatId = emailFormatId;
	}

	public GetOrphanrecordingMediaRequest withEmailFormatId(String emailFormatId) {
	    this.setEmailFormatId(emailFormatId);
	    return this;
	} 

	public enum emailFormatIdValues { 
		EML("EML"), 
		NONE("NONE");

		private String value;

		emailFormatIdValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static emailFormatIdValues fromString(String key) {
			if (key == null) return null;

			for (emailFormatIdValues value : emailFormatIdValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return emailFormatIdValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String chatFormatId;
	public String getChatFormatId() {
		return this.chatFormatId;
	}

	public void setChatFormatId(String chatFormatId) {
		this.chatFormatId = chatFormatId;
	}

	public GetOrphanrecordingMediaRequest withChatFormatId(String chatFormatId) {
	    this.setChatFormatId(chatFormatId);
	    return this;
	} 

	public enum chatFormatIdValues { 
		ZIP("ZIP"), 
		NONE("NONE");

		private String value;

		chatFormatIdValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static chatFormatIdValues fromString(String key) {
			if (key == null) return null;

			for (chatFormatIdValues value : chatFormatIdValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return chatFormatIdValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String messageFormatId;
	public String getMessageFormatId() {
		return this.messageFormatId;
	}

	public void setMessageFormatId(String messageFormatId) {
		this.messageFormatId = messageFormatId;
	}

	public GetOrphanrecordingMediaRequest withMessageFormatId(String messageFormatId) {
	    this.setMessageFormatId(messageFormatId);
	    return this;
	} 

	public enum messageFormatIdValues { 
		ZIP("ZIP"), 
		NONE("NONE");

		private String value;

		messageFormatIdValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static messageFormatIdValues fromString(String key) {
			if (key == null) return null;

			for (messageFormatIdValues value : messageFormatIdValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return messageFormatIdValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private Boolean download;
	public Boolean getDownload() {
		return this.download;
	}

	public void setDownload(Boolean download) {
		this.download = download;
	}

	public GetOrphanrecordingMediaRequest withDownload(Boolean download) {
	    this.setDownload(download);
	    return this;
	} 
	
	private String fileName;
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public GetOrphanrecordingMediaRequest withFileName(String fileName) {
	    this.setFileName(fileName);
	    return this;
	} 
	
	private String locale;
	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public GetOrphanrecordingMediaRequest withLocale(String locale) {
	    this.setLocale(locale);
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

    public GetOrphanrecordingMediaRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'orphanId' is set
        if (this.orphanId == null) {
            throw new IllegalStateException("Missing the required parameter 'orphanId' when building request for GetOrphanrecordingMediaRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/orphanrecordings/{orphanId}/media")
                .withPathParameter("orphanId", orphanId)
        
                .withQueryParameters("formatId", "", formatId)
        
                .withQueryParameters("emailFormatId", "", emailFormatId)
        
                .withQueryParameters("chatFormatId", "", chatFormatId)
        
                .withQueryParameters("messageFormatId", "", messageFormatId)
        
                .withQueryParameters("download", "", download)
        
                .withQueryParameters("fileName", "", fileName)
        
                .withQueryParameters("locale", "", locale)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String orphanId) {
	    return new Builder()
	            .withRequiredParams(orphanId);
	}
	

	public static class Builder {
		private final GetOrphanrecordingMediaRequest request;

		private Builder() {
			request = new GetOrphanrecordingMediaRequest();
		}

		
		public Builder withOrphanId(String orphanId) {
			request.setOrphanId(orphanId);
			return this;
		}
		
		public Builder withFormatId(String formatId) {
			request.setFormatId(formatId);
			return this;
		}

		public Builder withFormatId(formatIdValues formatId) {
		    request.setFormatId(formatId.toString());
		    return this;
		}
		
		public Builder withEmailFormatId(String emailFormatId) {
			request.setEmailFormatId(emailFormatId);
			return this;
		}

		public Builder withEmailFormatId(emailFormatIdValues emailFormatId) {
		    request.setEmailFormatId(emailFormatId.toString());
		    return this;
		}
		
		public Builder withChatFormatId(String chatFormatId) {
			request.setChatFormatId(chatFormatId);
			return this;
		}

		public Builder withChatFormatId(chatFormatIdValues chatFormatId) {
		    request.setChatFormatId(chatFormatId.toString());
		    return this;
		}
		
		public Builder withMessageFormatId(String messageFormatId) {
			request.setMessageFormatId(messageFormatId);
			return this;
		}

		public Builder withMessageFormatId(messageFormatIdValues messageFormatId) {
		    request.setMessageFormatId(messageFormatId.toString());
		    return this;
		}
		
		public Builder withDownload(Boolean download) {
			request.setDownload(download);
			return this;
		}
		
		public Builder withFileName(String fileName) {
			request.setFileName(fileName);
			return this;
		}
		
		public Builder withLocale(String locale) {
			request.setLocale(locale);
			return this;
		}
		

		
		public Builder withRequiredParams(String orphanId) {
			request.setOrphanId(orphanId);
			
			return this;
		}
		

		public GetOrphanrecordingMediaRequest build() {
            
            // verify the required parameter 'orphanId' is set
            if (request.orphanId == null) {
                throw new IllegalStateException("Missing the required parameter 'orphanId' when building request for GetOrphanrecordingMediaRequest.");
            }
            
			return request;
		}
	}
}
