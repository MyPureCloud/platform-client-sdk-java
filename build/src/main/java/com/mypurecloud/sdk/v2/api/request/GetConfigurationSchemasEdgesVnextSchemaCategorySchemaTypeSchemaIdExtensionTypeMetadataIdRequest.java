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
import com.mypurecloud.sdk.v2.model.SchemaCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.SchemaReferenceEntityListing;
import com.mypurecloud.sdk.v2.model.Organization;
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnosticResponse;
import com.mypurecloud.sdk.v2.model.EdgeLine;
import com.mypurecloud.sdk.v2.model.EdgeLineEntityListing;
import com.mypurecloud.sdk.v2.model.DomainLogicalInterface;
import com.mypurecloud.sdk.v2.model.LogicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeLogsJob;
import com.mypurecloud.sdk.v2.model.EdgeMetrics;
import com.mypurecloud.sdk.v2.model.DomainPhysicalInterface;
import com.mypurecloud.sdk.v2.model.PhysicalInterfaceEntityListing;
import com.mypurecloud.sdk.v2.model.VmPairingInfo;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareVersionDtoEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeEntityListing;
import com.mypurecloud.sdk.v2.model.AvailableLanguageList;
import com.mypurecloud.sdk.v2.model.CertificateAuthorityEntityListing;
import com.mypurecloud.sdk.v2.model.DomainCertificateAuthority;
import com.mypurecloud.sdk.v2.model.DID;
import com.mypurecloud.sdk.v2.model.DIDPool;
import com.mypurecloud.sdk.v2.model.DIDPoolEntityListing;
import com.mypurecloud.sdk.v2.model.DIDNumberEntityListing;
import com.mypurecloud.sdk.v2.model.DIDEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeGroup;
import com.mypurecloud.sdk.v2.model.EdgeTrunkBase;
import com.mypurecloud.sdk.v2.model.EdgeGroupEntityListing;
import com.mypurecloud.sdk.v2.model.EdgeVersionReport;
import com.mypurecloud.sdk.v2.model.Extension;
import com.mypurecloud.sdk.v2.model.ExtensionPool;
import com.mypurecloud.sdk.v2.model.ExtensionPoolEntityListing;
import com.mypurecloud.sdk.v2.model.ExtensionEntityListing;
import com.mypurecloud.sdk.v2.model.Line;
import com.mypurecloud.sdk.v2.model.LineBase;
import com.mypurecloud.sdk.v2.model.LineBaseEntityListing;
import com.mypurecloud.sdk.v2.model.LineEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundRoute;
import com.mypurecloud.sdk.v2.model.OutboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.Phone;
import com.mypurecloud.sdk.v2.model.PhoneBase;
import com.mypurecloud.sdk.v2.model.PhoneBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneMetaBaseEntityListing;
import com.mypurecloud.sdk.v2.model.PhoneEntityListing;
import com.mypurecloud.sdk.v2.model.Site;
import com.mypurecloud.sdk.v2.model.NumberPlan;
import com.mypurecloud.sdk.v2.model.OutboundRouteBase;
import com.mypurecloud.sdk.v2.model.OutboundRouteBaseEntityListing;
import com.mypurecloud.sdk.v2.model.SiteEntityListing;
import com.mypurecloud.sdk.v2.model.TimeZoneEntityListing;
import com.mypurecloud.sdk.v2.model.Trunk;
import com.mypurecloud.sdk.v2.model.TrunkMetrics;
import com.mypurecloud.sdk.v2.model.TrunkBase;
import com.mypurecloud.sdk.v2.model.TrunkBaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkMetabaseEntityListing;
import com.mypurecloud.sdk.v2.model.TrunkRecordingEnabledCount;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnostic;
import com.mypurecloud.sdk.v2.model.EdgeNetworkDiagnosticRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobUploadRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobRequest;
import com.mypurecloud.sdk.v2.model.EdgeLogsJobResponse;
import com.mypurecloud.sdk.v2.model.EdgeRebootParameters;
import com.mypurecloud.sdk.v2.model.EdgeServiceStateRequest;
import com.mypurecloud.sdk.v2.model.ValidateAddressResponse;
import com.mypurecloud.sdk.v2.model.ValidateAddressRequest;
import com.mypurecloud.sdk.v2.model.PhonesReboot;

public class GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest {
    
	private String schemaCategory;
	public String getSchemaCategory() {
		return this.schemaCategory;
	}

	public void setSchemaCategory(String schemaCategory) {
		this.schemaCategory = schemaCategory;
	}

	public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest withSchemaCategory(String schemaCategory) {
	    this.setSchemaCategory(schemaCategory);
	    return this;
	} 
	
	private String schemaType;
	public String getSchemaType() {
		return this.schemaType;
	}

	public void setSchemaType(String schemaType) {
		this.schemaType = schemaType;
	}

	public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest withSchemaType(String schemaType) {
	    this.setSchemaType(schemaType);
	    return this;
	} 
	
	private String schemaId;
	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
	}

	public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest withSchemaId(String schemaId) {
	    this.setSchemaId(schemaId);
	    return this;
	} 
	
	private String extensionType;
	public String getExtensionType() {
		return this.extensionType;
	}

	public void setExtensionType(String extensionType) {
		this.extensionType = extensionType;
	}

	public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest withExtensionType(String extensionType) {
	    this.setExtensionType(extensionType);
	    return this;
	} 
	
	private String metadataId;
	public String getMetadataId() {
		return this.metadataId;
	}

	public void setMetadataId(String metadataId) {
		this.metadataId = metadataId;
	}

	public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest withMetadataId(String metadataId) {
	    this.setMetadataId(metadataId);
	    return this;
	} 
	
	private String type;
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest withType(String type) {
	    this.setType(type);
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

    public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'schemaCategory' is set
        if (this.schemaCategory == null) {
            throw new IllegalStateException("Missing the required parameter 'schemaCategory' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
        }
        
        // verify the required parameter 'schemaType' is set
        if (this.schemaType == null) {
            throw new IllegalStateException("Missing the required parameter 'schemaType' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
        }
        
        // verify the required parameter 'schemaId' is set
        if (this.schemaId == null) {
            throw new IllegalStateException("Missing the required parameter 'schemaId' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
        }
        
        // verify the required parameter 'extensionType' is set
        if (this.extensionType == null) {
            throw new IllegalStateException("Missing the required parameter 'extensionType' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
        }
        
        // verify the required parameter 'metadataId' is set
        if (this.metadataId == null) {
            throw new IllegalStateException("Missing the required parameter 'metadataId' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/configuration/schemas/edges/vnext/{schemaCategory}/{schemaType}/{schemaId}/{extensionType}/{metadataId}")
                .withPathParameter("schemaCategory", schemaCategory)
        
                .withPathParameter("schemaType", schemaType)
        
                .withPathParameter("schemaId", schemaId)
        
                .withPathParameter("extensionType", extensionType)
        
                .withPathParameter("metadataId", metadataId)
        
                .withQueryParameters("type", "", type)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String schemaCategory, String schemaType, String schemaId, String extensionType, String metadataId) {
	    return new Builder()
	            .withRequiredParams(schemaCategory, schemaType, schemaId, extensionType, metadataId);
	}
	

	public static class Builder {
		private final GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest request;

		private Builder() {
			request = new GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest();
		}

		
		public Builder withSchemaCategory(String schemaCategory) {
			request.setSchemaCategory(schemaCategory);
			return this;
		}
		
		public Builder withSchemaType(String schemaType) {
			request.setSchemaType(schemaType);
			return this;
		}
		
		public Builder withSchemaId(String schemaId) {
			request.setSchemaId(schemaId);
			return this;
		}
		
		public Builder withExtensionType(String extensionType) {
			request.setExtensionType(extensionType);
			return this;
		}
		
		public Builder withMetadataId(String metadataId) {
			request.setMetadataId(metadataId);
			return this;
		}
		
		public Builder withType(String type) {
			request.setType(type);
			return this;
		}
		

		
		public Builder withRequiredParams(String schemaCategory, String schemaType, String schemaId, String extensionType, String metadataId) {
			request.setSchemaCategory(schemaCategory);
						request.setSchemaType(schemaType);
						request.setSchemaId(schemaId);
						request.setExtensionType(extensionType);
						request.setMetadataId(metadataId);
			
			return this;
		}
		

		public GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest build() {
            
            // verify the required parameter 'schemaCategory' is set
            if (request.schemaCategory == null) {
                throw new IllegalStateException("Missing the required parameter 'schemaCategory' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
            }
            
            // verify the required parameter 'schemaType' is set
            if (request.schemaType == null) {
                throw new IllegalStateException("Missing the required parameter 'schemaType' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
            }
            
            // verify the required parameter 'schemaId' is set
            if (request.schemaId == null) {
                throw new IllegalStateException("Missing the required parameter 'schemaId' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
            }
            
            // verify the required parameter 'extensionType' is set
            if (request.extensionType == null) {
                throw new IllegalStateException("Missing the required parameter 'extensionType' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
            }
            
            // verify the required parameter 'metadataId' is set
            if (request.metadataId == null) {
                throw new IllegalStateException("Missing the required parameter 'metadataId' when building request for GetConfigurationSchemasEdgesVnextSchemaCategorySchemaTypeSchemaIdExtensionTypeMetadataIdRequest.");
            }
            
			return request;
		}
	}
}
