package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GoogleOAuthSettingsResponse
 */

public class GoogleOAuthSettingsResponse  implements Serializable {
  
  private String clientId = null;
  private List<String> scopes = null;

  public GoogleOAuthSettingsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      scopes = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "ID of the Genesys-owned Google API client")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }


  @ApiModelProperty(example = "null", required = true, value = "Google API authorization scopes that must be granted to the Genesys-owned Google API client")
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleOAuthSettingsResponse googleOAuthSettingsResponse = (GoogleOAuthSettingsResponse) o;

    return Objects.equals(this.clientId, googleOAuthSettingsResponse.clientId) &&
            Objects.equals(this.scopes, googleOAuthSettingsResponse.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleOAuthSettingsResponse {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

