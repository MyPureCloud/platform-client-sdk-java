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
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ModelingStatusResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnit;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.WfmAgent;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.SchedulingRunResponse;
import com.mypurecloud.sdk.v2.model.RescheduleResult;
import com.mypurecloud.sdk.v2.model.SchedulingRunListResponse;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroup;
import com.mypurecloud.sdk.v2.model.ServiceGoalGroupList;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettingsResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeMatchesSummaryResponse;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.WeekScheduleGenerationResult;
import com.mypurecloud.sdk.v2.model.WeekScheduleListResponse;
import com.mypurecloud.sdk.v2.model.ForecastResultResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastListResponse;
import com.mypurecloud.sdk.v2.model.WorkPlan;
import com.mypurecloud.sdk.v2.model.WorkPlanListResponse;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.NotificationsResponse;
import com.mypurecloud.sdk.v2.model.SchedulingStatusResponse;
import com.mypurecloud.sdk.v2.model.ShiftTradeListResponse;
import com.mypurecloud.sdk.v2.model.UpdateManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.UpdateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.UpdateSchedulingRunRequest;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettingsRequest;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.UpdateWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.AsyncWeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.AgentTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQueryForUsers;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitRequest;
import com.mypurecloud.sdk.v2.model.MoveManagementUnitResponse;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateServiceGoalGroupRequest;
import com.mypurecloud.sdk.v2.model.CreateAdminTimeOffRequest;
import com.mypurecloud.sdk.v2.model.TimeOffRequestEntityList;
import com.mypurecloud.sdk.v2.model.TimeOffRequestLookupList;
import com.mypurecloud.sdk.v2.model.TimeOffRequestQueryBody;
import com.mypurecloud.sdk.v2.model.CopyWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.RescheduleRequest;
import com.mypurecloud.sdk.v2.model.ImportWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.GenerateWeekScheduleResponse;
import com.mypurecloud.sdk.v2.model.GenerateWeekScheduleRequest;
import com.mypurecloud.sdk.v2.model.UserSchedulesPartialUploadRequest;
import com.mypurecloud.sdk.v2.model.PartialUploadResponse;
import com.mypurecloud.sdk.v2.model.ShortTermForecastResponse;
import com.mypurecloud.sdk.v2.model.CopyShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.ImportShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.GenerateShortTermForecastResponse;
import com.mypurecloud.sdk.v2.model.GenerateShortTermForecastRequest;
import com.mypurecloud.sdk.v2.model.RouteGroupList;
import com.mypurecloud.sdk.v2.model.CopyWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateWorkPlan;
import com.mypurecloud.sdk.v2.model.CreateManagementUnitApiRequest;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsResponse;
import com.mypurecloud.sdk.v2.model.UpdateNotificationsRequest;
import com.mypurecloud.sdk.v2.model.CurrentUserScheduleRequestBody;
import com.mypurecloud.sdk.v2.model.CreateAgentTimeOffRequest;

public class GetWorkforcemanagementManagementunitActivitycodeRequest {
    
	private String muId;
	public String getMuId() {
		return this.muId;
	}

	public void setMuId(String muId) {
		this.muId = muId;
	}

	public GetWorkforcemanagementManagementunitActivitycodeRequest withMuId(String muId) {
	    this.setMuId(muId);
	    return this;
	} 
	
	private String acId;
	public String getAcId() {
		return this.acId;
	}

	public void setAcId(String acId) {
		this.acId = acId;
	}

	public GetWorkforcemanagementManagementunitActivitycodeRequest withAcId(String acId) {
	    this.setAcId(acId);
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

    public GetWorkforcemanagementManagementunitActivitycodeRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'muId' is set
        if (this.muId == null) {
            throw new IllegalStateException("Missing the required parameter 'muId' when building request for GetWorkforcemanagementManagementunitActivitycodeRequest.");
        }
        
        // verify the required parameter 'acId' is set
        if (this.acId == null) {
            throw new IllegalStateException("Missing the required parameter 'acId' when building request for GetWorkforcemanagementManagementunitActivitycodeRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/workforcemanagement/managementunits/{muId}/activitycodes/{acId}")
                .withPathParameter("muId", muId)
        
                .withPathParameter("acId", acId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String muId, String acId) {
	    return new Builder()
	            .withRequiredParams(muId, acId);
	}
	

	public static class Builder {
		private final GetWorkforcemanagementManagementunitActivitycodeRequest request;

		private Builder() {
			request = new GetWorkforcemanagementManagementunitActivitycodeRequest();
		}

		
		public Builder withMuId(String muId) {
			request.setMuId(muId);
			return this;
		}
		
		public Builder withAcId(String acId) {
			request.setAcId(acId);
			return this;
		}
		

		
		public Builder withRequiredParams(String muId, String acId) {
			request.setMuId(muId);
						request.setAcId(acId);
			
			return this;
		}
		

		public GetWorkforcemanagementManagementunitActivitycodeRequest build() {
            
            // verify the required parameter 'muId' is set
            if (request.muId == null) {
                throw new IllegalStateException("Missing the required parameter 'muId' when building request for GetWorkforcemanagementManagementunitActivitycodeRequest.");
            }
            
            // verify the required parameter 'acId' is set
            if (request.acId == null) {
                throw new IllegalStateException("Missing the required parameter 'acId' when building request for GetWorkforcemanagementManagementunitActivitycodeRequest.");
            }
            
			return request;
		}
	}
}
