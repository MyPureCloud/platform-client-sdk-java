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
import com.mypurecloud.sdk.v2.model.ExportScriptRequest;
import com.mypurecloud.sdk.v2.model.ExportScriptResponse;
import com.mypurecloud.sdk.v2.model.ImportScriptStatusResponse;
import com.mypurecloud.sdk.v2.model.Page;
import com.mypurecloud.sdk.v2.model.PublishScriptRequestData;
import com.mypurecloud.sdk.v2.model.Script;
import com.mypurecloud.sdk.v2.model.ScriptEntityListing;

public class GetScriptsPublishedDivisionviewVariablesRequest {

	private String scriptId;
	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}

	public GetScriptsPublishedDivisionviewVariablesRequest withScriptId(String scriptId) {
	    this.setScriptId(scriptId);
	    return this;
	} 

	private String input;
	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public GetScriptsPublishedDivisionviewVariablesRequest withInput(String input) {
	    this.setInput(input);
	    return this;
	} 

	public enum inputValues { 
		TRUE("true"),
		FALSE("false");

		private String value;

		inputValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static inputValues fromString(String key) {
			if (key == null) return null;

			for (inputValues value : inputValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return inputValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String output;
	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public GetScriptsPublishedDivisionviewVariablesRequest withOutput(String output) {
	    this.setOutput(output);
	    return this;
	} 

	public enum outputValues { 
		TRUE("true"),
		FALSE("false");

		private String value;

		outputValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static outputValues fromString(String key) {
			if (key == null) return null;

			for (outputValues value : outputValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return outputValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetScriptsPublishedDivisionviewVariablesRequest withType(String type) {
	    this.setType(type);
	    return this;
	} 

	public enum typeValues { 
		STRING("string"),
		NUMBER("number"),
		BOOLEAN("boolean");

		private String value;

		typeValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static typeValues fromString(String key) {
			if (key == null) return null;

			for (typeValues value : typeValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return typeValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}

	private String scriptDataVersion;
	public String getScriptDataVersion() {
		return this.scriptDataVersion;
	}

	public void setScriptDataVersion(String scriptDataVersion) {
		this.scriptDataVersion = scriptDataVersion;
	}

	public GetScriptsPublishedDivisionviewVariablesRequest withScriptDataVersion(String scriptDataVersion) {
	    this.setScriptDataVersion(scriptDataVersion);
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

    public GetScriptsPublishedDivisionviewVariablesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'scriptId' is set
        if (this.scriptId == null) {
            throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptsPublishedDivisionviewVariablesRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/scripts/published/divisionviews/{scriptId}/variables")
                .withPathParameter("scriptId", scriptId)
        

                .withQueryParameters("input", "", input)
        

                .withQueryParameters("output", "", output)
        

                .withQueryParameters("type", "", type)
        

                .withQueryParameters("scriptDataVersion", "", scriptDataVersion)
        
		.withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}


	public static Builder builder(String scriptId) {
	    return new Builder()
	            .withRequiredParams(scriptId);
	}


	public static class Builder {
		private final GetScriptsPublishedDivisionviewVariablesRequest request;

		private Builder() {
			request = new GetScriptsPublishedDivisionviewVariablesRequest();
		}


		public Builder withScriptId(String scriptId) {
			request.setScriptId(scriptId);
			return this;
		}

		public Builder withInput(String input) {
			request.setInput(input);
			return this;
		}



		
		public Builder withInput(inputValues input) {
		    request.setInput(input.toString());

		    return this;
		}

		public Builder withOutput(String output) {
			request.setOutput(output);
			return this;
		}



		
		public Builder withOutput(outputValues output) {
		    request.setOutput(output.toString());

		    return this;
		}

		public Builder withType(String type) {
			request.setType(type);
			return this;
		}



		
		public Builder withType(typeValues type) {
		    request.setType(type.toString());

		    return this;
		}

		public Builder withScriptDataVersion(String scriptDataVersion) {
			request.setScriptDataVersion(scriptDataVersion);
			return this;
		}



		public Builder withRequiredParams(String scriptId) {
			request.setScriptId(scriptId);

			return this;
		}


		public GetScriptsPublishedDivisionviewVariablesRequest build() {
            
            // verify the required parameter 'scriptId' is set
            if (request.scriptId == null) {
                throw new IllegalStateException("Missing the required parameter 'scriptId' when building request for GetScriptsPublishedDivisionviewVariablesRequest.");
            }
            
			return request;
		}
	}
}
