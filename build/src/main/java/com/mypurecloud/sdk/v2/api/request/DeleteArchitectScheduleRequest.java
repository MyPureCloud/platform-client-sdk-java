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

import com.mypurecloud.sdk.v2.model.ArchitectExportJobStateResponse;
import com.mypurecloud.sdk.v2.model.ArchitectJobStateResponse;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.CriteriaQuery;
import com.mypurecloud.sdk.v2.model.DataTable;
import com.mypurecloud.sdk.v2.model.DataTableExportJob;
import com.mypurecloud.sdk.v2.model.DataTableImportEntityListing;
import com.mypurecloud.sdk.v2.model.DataTableImportJob;
import com.mypurecloud.sdk.v2.model.DataTableRowEntityListing;
import com.mypurecloud.sdk.v2.model.DataTablesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroup;
import com.mypurecloud.sdk.v2.model.EmergencyGroupDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroupListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ExecutionDataFlowSettingsResponse;
import com.mypurecloud.sdk.v2.model.ExecutionDataRequest;
import com.mypurecloud.sdk.v2.model.ExecutionDataSettingsRequest;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchRequest;
import com.mypurecloud.sdk.v2.model.FlowExecutionLaunchResponse;
import com.mypurecloud.sdk.v2.model.FlowHealth;
import com.mypurecloud.sdk.v2.model.FlowHealthIntent;
import com.mypurecloud.sdk.v2.model.FlowHealthUtterance;
import com.mypurecloud.sdk.v2.model.FlowLogLevelCharacteristicsDefinitions;
import com.mypurecloud.sdk.v2.model.FlowLogLevelRequest;
import com.mypurecloud.sdk.v2.model.FlowMilestone;
import com.mypurecloud.sdk.v2.model.FlowMilestoneDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowMilestoneListing;
import com.mypurecloud.sdk.v2.model.FlowOutcome;
import com.mypurecloud.sdk.v2.model.FlowOutcomeDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.FlowOutcomeListing;
import com.mypurecloud.sdk.v2.model.FlowResultEntityListing;
import com.mypurecloud.sdk.v2.model.FlowRuntimeExecution;
import com.mypurecloud.sdk.v2.model.FlowSettingsResponse;
import com.mypurecloud.sdk.v2.model.FlowSettingsResponseEntityListing;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowsQueryCriteriaResponse;
import com.mypurecloud.sdk.v2.model.GetFlowExecutionDataJobResult;
import com.mypurecloud.sdk.v2.model.Grammar;
import com.mypurecloud.sdk.v2.model.GrammarFileUploadRequest;
import com.mypurecloud.sdk.v2.model.GrammarLanguage;
import com.mypurecloud.sdk.v2.model.GrammarLanguageUpdate;
import com.mypurecloud.sdk.v2.model.GrammarListing;
import com.mypurecloud.sdk.v2.model.HistoryListing;
import com.mypurecloud.sdk.v2.model.IVR;
import com.mypurecloud.sdk.v2.model.IVRDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.IVREntityListing;
import com.mypurecloud.sdk.v2.model.IdentityResolutionConfig;
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetUpload;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.RegisterArchitectExportJob;
import com.mypurecloud.sdk.v2.model.RegisterArchitectExportJobResponse;
import com.mypurecloud.sdk.v2.model.RegisterArchitectJobResponse;
import com.mypurecloud.sdk.v2.model.Schedule;
import com.mypurecloud.sdk.v2.model.ScheduleDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleGroup;
import com.mypurecloud.sdk.v2.model.ScheduleGroupDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleGroupEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;

public class DeleteArchitectScheduleRequest {

	private String scheduleId;
	public String getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public DeleteArchitectScheduleRequest withScheduleId(String scheduleId) {
	    this.setScheduleId(scheduleId);
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

    public DeleteArchitectScheduleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scheduleId' is set
        if (this.scheduleId == null) {
            throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for DeleteArchitectScheduleRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/architect/schedules/{scheduleId}")
                .withPathParameter("scheduleId", scheduleId)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String scheduleId) {
	    return new Builder()
	            .withRequiredParams(scheduleId);
	}


	public static class Builder {
		private final DeleteArchitectScheduleRequest request;

		private Builder() {
			request = new DeleteArchitectScheduleRequest();
		}


		public Builder withScheduleId(String scheduleId) {
			request.setScheduleId(scheduleId);
			return this;
		}



		public Builder withRequiredParams(String scheduleId) {
			request.setScheduleId(scheduleId);

			return this;
		}


		public DeleteArchitectScheduleRequest build() {
            
            // verify the required parameter 'scheduleId' is set
            if (request.scheduleId == null) {
                throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for DeleteArchitectScheduleRequest.");
            }
            
			return request;
		}
	}
}
