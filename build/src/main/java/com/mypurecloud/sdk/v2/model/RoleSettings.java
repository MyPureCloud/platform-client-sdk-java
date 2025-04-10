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

import java.io.Serializable;
/**
 * RoleSettings
 */

public class RoleSettings  implements Serializable {
  
  private String id = null;
  private Boolean backfillEnabled = null;
  private Boolean authorizationGrantDivisionAware = null;
  private String selfUri = null;

  public RoleSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Boolean showing if organization is opted in or not to role backfills
   **/
  public RoleSettings backfillEnabled(Boolean backfillEnabled) {
    this.backfillEnabled = backfillEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean showing if organization is opted in or not to role backfills")
  @JsonProperty("backfillEnabled")
  public Boolean getBackfillEnabled() {
    return backfillEnabled;
  }
  public void setBackfillEnabled(Boolean backfillEnabled) {
    this.backfillEnabled = backfillEnabled;
  }


  /**
   * Boolean enabling enforcement of division aware for authorization grant add and delete
   **/
  public RoleSettings authorizationGrantDivisionAware(Boolean authorizationGrantDivisionAware) {
    this.authorizationGrantDivisionAware = authorizationGrantDivisionAware;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean enabling enforcement of division aware for authorization grant add and delete")
  @JsonProperty("authorizationGrantDivisionAware")
  public Boolean getAuthorizationGrantDivisionAware() {
    return authorizationGrantDivisionAware;
  }
  public void setAuthorizationGrantDivisionAware(Boolean authorizationGrantDivisionAware) {
    this.authorizationGrantDivisionAware = authorizationGrantDivisionAware;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleSettings roleSettings = (RoleSettings) o;

    return Objects.equals(this.id, roleSettings.id) &&
            Objects.equals(this.backfillEnabled, roleSettings.backfillEnabled) &&
            Objects.equals(this.authorizationGrantDivisionAware, roleSettings.authorizationGrantDivisionAware) &&
            Objects.equals(this.selfUri, roleSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, backfillEnabled, authorizationGrantDivisionAware, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    backfillEnabled: ").append(toIndentedString(backfillEnabled)).append("\n");
    sb.append("    authorizationGrantDivisionAware: ").append(toIndentedString(authorizationGrantDivisionAware)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

