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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AuthorizationSettings
 */

public class AuthorizationSettings  implements Serializable {
  
  private String id = null;
  private Boolean analysisEnabled = null;
  private Integer analysisDays = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "Boolean showing if organization is opted in or not to unused role/perm analysis")
  @JsonProperty("analysisEnabled")
  public Boolean getAnalysisEnabled() {
    return analysisEnabled;
  }


  @ApiModelProperty(example = "null", value = "Integer number of days to analyze user usage")
  @JsonProperty("analysisDays")
  public Integer getAnalysisDays() {
    return analysisDays;
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
    AuthorizationSettings authorizationSettings = (AuthorizationSettings) o;

    return Objects.equals(this.id, authorizationSettings.id) &&
            Objects.equals(this.analysisEnabled, authorizationSettings.analysisEnabled) &&
            Objects.equals(this.analysisDays, authorizationSettings.analysisDays) &&
            Objects.equals(this.selfUri, authorizationSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, analysisEnabled, analysisDays, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    analysisEnabled: ").append(toIndentedString(analysisEnabled)).append("\n");
    sb.append("    analysisDays: ").append(toIndentedString(analysisDays)).append("\n");
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

