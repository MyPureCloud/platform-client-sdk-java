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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * GoogleAuthToken
 */

public class GoogleAuthToken  implements Serializable {
  
  private String id = null;
  private String clientId = null;
  private List<String> scopes = null;
  private Date dateCreated = null;
  private DomainEntityRef createdBy = null;

  public GoogleAuthToken() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      scopes = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "ID of the Google OAuth 2 access token. The token cannot be accessed via Genesys API, only referenced by this property. When the token is not referenced by any integration, it is deleted after 24 hours.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", required = true, value = "ID of the Genesys-owned Google API client")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }


  @ApiModelProperty(example = "null", required = true, value = "Google API authorization scopes that have been granted to the Genesys-owned Google API client")
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }


  @ApiModelProperty(example = "null", required = true, value = "Date this token was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", required = true, value = "User reference that created this Integration")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAuthToken googleAuthToken = (GoogleAuthToken) o;

    return Objects.equals(this.id, googleAuthToken.id) &&
            Objects.equals(this.clientId, googleAuthToken.clientId) &&
            Objects.equals(this.scopes, googleAuthToken.scopes) &&
            Objects.equals(this.dateCreated, googleAuthToken.dateCreated) &&
            Objects.equals(this.createdBy, googleAuthToken.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, scopes, dateCreated, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAuthToken {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

