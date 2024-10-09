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

import com.mypurecloud.sdk.v2.model.BulkResponse;
import com.mypurecloud.sdk.v2.model.CategoryCreateRequest;
import com.mypurecloud.sdk.v2.model.CategoryListing;
import com.mypurecloud.sdk.v2.model.CategoryResponse;
import com.mypurecloud.sdk.v2.model.CategoryResponseListing;
import com.mypurecloud.sdk.v2.model.CategoryUpdateRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobRequest;
import com.mypurecloud.sdk.v2.model.CreateUploadSourceUrlJobResponse;
import com.mypurecloud.sdk.v2.model.DocumentListing;
import com.mypurecloud.sdk.v2.model.DocumentVariation;
import com.mypurecloud.sdk.v2.model.DocumentVariationListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GetUploadSourceUrlJobStatusResponse;
import com.mypurecloud.sdk.v2.model.GuestCategoryResponseListing;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeAnswerDocumentsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseCreateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocument;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRemoveRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkVersionAddRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentContentUpload;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentCopy;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentFeedbackUpdateRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearch;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentGuestSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentPresentation;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentQuery;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentQueryResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentReq;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearch;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSuggestion;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentSuggestionRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersion;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionVariation;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentVersionVariationListing;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentView;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentsAnswerFilter;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeExportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeExtendedCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestAnswerDocumentsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentCopy;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentFeedback;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentPresentation;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentResponseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestion;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentSuggestionRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentView;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestSession;
import com.mypurecloud.sdk.v2.model.KnowledgeImport;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeImportJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeIntegrationOptionsResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestImport;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobRequestPatch;
import com.mypurecloud.sdk.v2.model.KnowledgeParseJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSyncJobResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.LabelCreateRequest;
import com.mypurecloud.sdk.v2.model.LabelListing;
import com.mypurecloud.sdk.v2.model.LabelResponse;
import com.mypurecloud.sdk.v2.model.LabelUpdateRequest;
import java.time.LocalDate;
import com.mypurecloud.sdk.v2.model.OperationCreatorUserResponse;
import com.mypurecloud.sdk.v2.model.OperationListing;
import com.mypurecloud.sdk.v2.model.SalesforceSourceRequest;
import com.mypurecloud.sdk.v2.model.SalesforceSourceResponse;
import com.mypurecloud.sdk.v2.model.SearchUpdateRequest;
import com.mypurecloud.sdk.v2.model.ServiceNowSourceRequest;
import com.mypurecloud.sdk.v2.model.ServiceNowSourceResponse;
import com.mypurecloud.sdk.v2.model.SourceBaseResponse;
import com.mypurecloud.sdk.v2.model.SourceSyncResponse;
import com.mypurecloud.sdk.v2.model.SyncStatusRequest;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.UnansweredGroup;
import com.mypurecloud.sdk.v2.model.UnansweredGroups;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroup;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupPatchRequestBody;
import com.mypurecloud.sdk.v2.model.UnansweredPhraseGroupUpdateResponse;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class PostKnowledgeKnowledgebaseLanguageCategoriesRequest {

	private String knowledgeBaseId;
	public String getKnowledgeBaseId() {
		return this.knowledgeBaseId;
	}

	public void setKnowledgeBaseId(String knowledgeBaseId) {
		this.knowledgeBaseId = knowledgeBaseId;
	}

	public PostKnowledgeKnowledgebaseLanguageCategoriesRequest withKnowledgeBaseId(String knowledgeBaseId) {
	    this.setKnowledgeBaseId(knowledgeBaseId);
	    return this;
	} 

	private String languageCode;
	public String getLanguageCode() {
		return this.languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public PostKnowledgeKnowledgebaseLanguageCategoriesRequest withLanguageCode(String languageCode) {
	    this.setLanguageCode(languageCode);
	    return this;
	} 

	public enum languageCodeValues { 
		EN_US("en-US"),
		EN_UK("en-UK"),
		EN_AU("en-AU"),
		EN_CA("en-CA"),
		EN_HK("en-HK"),
		EN_IN("en-IN"),
		EN_IE("en-IE"),
		EN_NZ("en-NZ"),
		EN_PH("en-PH"),
		EN_SG("en-SG"),
		EN_ZA("en-ZA"),
		DE_DE("de-DE"),
		DE_AT("de-AT"),
		DE_CH("de-CH"),
		ES_AR("es-AR"),
		ES_CO("es-CO"),
		ES_MX("es-MX"),
		ES_US("es-US"),
		ES_ES("es-ES"),
		FR_FR("fr-FR"),
		FR_BE("fr-BE"),
		FR_CA("fr-CA"),
		FR_CH("fr-CH"),
		PT_BR("pt-BR"),
		PT_PT("pt-PT"),
		NL_NL("nl-NL"),
		NL_BE("nl-BE"),
		IT_IT("it-IT"),
		CA_ES("ca-ES"),
		TR_TR("tr-TR"),
		SV_SE("sv-SE"),
		FI_FI("fi-FI"),
		NB_NO("nb-NO"),
		DA_DK("da-DK"),
		JA_JP("ja-JP"),
		AR_AE("ar-AE"),
		ZH_CN("zh-CN"),
		ZH_TW("zh-TW"),
		ZH_HK("zh-HK"),
		KO_KR("ko-KR"),
		PL_PL("pl-PL"),
		HI_IN("hi-IN"),
		TH_TH("th-TH"),
		HU_HU("hu-HU"),
		VI_VN("vi-VN"),
		UK_UA("uk-UA");

		private String value;

		languageCodeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static languageCodeValues fromString(String key) {
			if (key == null) return null;

			for (languageCodeValues value : languageCodeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return languageCodeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private KnowledgeCategoryRequest body;
	public KnowledgeCategoryRequest getBody() {
		return this.body;
	}

	public void setBody(KnowledgeCategoryRequest body) {
		this.body = body;
	}

	public PostKnowledgeKnowledgebaseLanguageCategoriesRequest withBody(KnowledgeCategoryRequest body) {
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

    public PostKnowledgeKnowledgebaseLanguageCategoriesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<KnowledgeCategoryRequest> withHttpInfo() {
        
        // verify the required parameter 'knowledgeBaseId' is set
        if (this.knowledgeBaseId == null) {
            throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PostKnowledgeKnowledgebaseLanguageCategoriesRequest.");
        }
        
        // verify the required parameter 'languageCode' is set
        if (this.languageCode == null) {
            throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for PostKnowledgeKnowledgebaseLanguageCategoriesRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostKnowledgeKnowledgebaseLanguageCategoriesRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/knowledge/knowledgebases/{knowledgeBaseId}/languages/{languageCode}/categories")
                .withPathParameter("knowledgeBaseId", knowledgeBaseId)
        
                .withPathParameter("languageCode", languageCode)
        
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


	public static Builder builder(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
	    return new Builder()
	            .withRequiredParams(knowledgeBaseId, languageCode, body);
	}


	public static class Builder {
		private final PostKnowledgeKnowledgebaseLanguageCategoriesRequest request;

		private Builder() {
			request = new PostKnowledgeKnowledgebaseLanguageCategoriesRequest();
		}


		public Builder withKnowledgeBaseId(String knowledgeBaseId) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			return this;
		}

		public Builder withLanguageCode(String languageCode) {
			request.setLanguageCode(languageCode);
			return this;
		}



		
		public Builder withLanguageCode(languageCodeValues languageCode) {
		    request.setLanguageCode(languageCode.toString());

		    return this;
		}

		public Builder withBody(KnowledgeCategoryRequest body) {
			request.setBody(body);
			return this;
		}



		public Builder withRequiredParams(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
			request.setKnowledgeBaseId(knowledgeBaseId);
			request.setLanguageCode(languageCode);
			request.setBody(body);

			return this;
		}


		public PostKnowledgeKnowledgebaseLanguageCategoriesRequest build() {
            
            // verify the required parameter 'knowledgeBaseId' is set
            if (request.knowledgeBaseId == null) {
                throw new IllegalStateException("Missing the required parameter 'knowledgeBaseId' when building request for PostKnowledgeKnowledgebaseLanguageCategoriesRequest.");
            }
            
            // verify the required parameter 'languageCode' is set
            if (request.languageCode == null) {
                throw new IllegalStateException("Missing the required parameter 'languageCode' when building request for PostKnowledgeKnowledgebaseLanguageCategoriesRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostKnowledgeKnowledgebaseLanguageCategoriesRequest.");
            }
            
			return request;
		}
	}
}
