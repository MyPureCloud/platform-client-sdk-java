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
 * OrgSettings
 */

public class OrgSettings  implements Serializable {
  
  private Boolean contentSearchEnabled = null;
  private Boolean useDivisionedPermissions = null;

  public OrgSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OrgSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * If true, enables full-text search of interaction transcripts
   **/
  public OrgSettings contentSearchEnabled(Boolean contentSearchEnabled) {
    this.contentSearchEnabled = contentSearchEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, enables full-text search of interaction transcripts")
  @JsonProperty("contentSearchEnabled")
  public Boolean getContentSearchEnabled() {
    return contentSearchEnabled;
  }
  public void setContentSearchEnabled(Boolean contentSearchEnabled) {
    this.contentSearchEnabled = contentSearchEnabled;
  }


  /**
   * If true, the results of searches for users are restricted to the divisions the user has directory:user:view permissions in
   **/
  public OrgSettings useDivisionedPermissions(Boolean useDivisionedPermissions) {
    this.useDivisionedPermissions = useDivisionedPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the results of searches for users are restricted to the divisions the user has directory:user:view permissions in")
  @JsonProperty("useDivisionedPermissions")
  public Boolean getUseDivisionedPermissions() {
    return useDivisionedPermissions;
  }
  public void setUseDivisionedPermissions(Boolean useDivisionedPermissions) {
    this.useDivisionedPermissions = useDivisionedPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgSettings orgSettings = (OrgSettings) o;

    return Objects.equals(this.contentSearchEnabled, orgSettings.contentSearchEnabled) &&
            Objects.equals(this.useDivisionedPermissions, orgSettings.useDivisionedPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentSearchEnabled, useDivisionedPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgSettings {\n");
    
    sb.append("    contentSearchEnabled: ").append(toIndentedString(contentSearchEnabled)).append("\n");
    sb.append("    useDivisionedPermissions: ").append(toIndentedString(useDivisionedPermissions)).append("\n");
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

