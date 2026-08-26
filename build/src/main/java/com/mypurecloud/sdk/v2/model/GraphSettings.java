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
import java.util.Date;

import java.io.Serializable;
/**
 * GraphSettings
 */

public class GraphSettings  implements Serializable {
  
  private Boolean automaticMergingEnabled = null;
  private Date dateModified = null;
  private String selfUri = null;

  public GraphSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public GraphSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether to enable automatic merging of discovered clusters
   **/
  public GraphSettings automaticMergingEnabled(Boolean automaticMergingEnabled) {
    this.automaticMergingEnabled = automaticMergingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enable automatic merging of discovered clusters")
  @JsonProperty("automaticMergingEnabled")
  public Boolean getAutomaticMergingEnabled() {
    return automaticMergingEnabled;
  }
  public void setAutomaticMergingEnabled(Boolean automaticMergingEnabled) {
    this.automaticMergingEnabled = automaticMergingEnabled;
  }


  @ApiModelProperty(example = "null", value = "The date the configuration was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    GraphSettings graphSettings = (GraphSettings) o;

    return Objects.equals(this.automaticMergingEnabled, graphSettings.automaticMergingEnabled) &&
            Objects.equals(this.dateModified, graphSettings.dateModified) &&
            Objects.equals(this.selfUri, graphSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticMergingEnabled, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphSettings {\n");
    
    sb.append("    automaticMergingEnabled: ").append(toIndentedString(automaticMergingEnabled)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

