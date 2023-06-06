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
import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
/**
 * AuthorizationSettings
 */

public class AuthorizationSettings  implements Serializable {
  
  private String id = null;
  private Boolean analysisEnabled = null;
  private Integer analysisDays = null;
  private Date dateLastCalculated = null;
  private LocalDate dateLastActive = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Boolean showing if organization is opted in or not to unused role/perm analysis
   **/
  public AuthorizationSettings analysisEnabled(Boolean analysisEnabled) {
    this.analysisEnabled = analysisEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean showing if organization is opted in or not to unused role/perm analysis")
  @JsonProperty("analysisEnabled")
  public Boolean getAnalysisEnabled() {
    return analysisEnabled;
  }
  public void setAnalysisEnabled(Boolean analysisEnabled) {
    this.analysisEnabled = analysisEnabled;
  }


  /**
   * Integer number of days to analyze user usage
   **/
  public AuthorizationSettings analysisDays(Integer analysisDays) {
    this.analysisDays = analysisDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Integer number of days to analyze user usage")
  @JsonProperty("analysisDays")
  public Integer getAnalysisDays() {
    return analysisDays;
  }
  public void setAnalysisDays(Integer analysisDays) {
    this.analysisDays = analysisDays;
  }


  @ApiModelProperty(example = "null", value = "The date and time of the most recent unused role calculation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastCalculated")
  public Date getDateLastCalculated() {
    return dateLastCalculated;
  }


  @ApiModelProperty(example = "null", value = "The date of the most recent org activity used for analysis. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateLastActive")
  public LocalDate getDateLastActive() {
    return dateLastActive;
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
            Objects.equals(this.dateLastCalculated, authorizationSettings.dateLastCalculated) &&
            Objects.equals(this.dateLastActive, authorizationSettings.dateLastActive) &&
            Objects.equals(this.selfUri, authorizationSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, analysisEnabled, analysisDays, dateLastCalculated, dateLastActive, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    analysisEnabled: ").append(toIndentedString(analysisEnabled)).append("\n");
    sb.append("    analysisDays: ").append(toIndentedString(analysisDays)).append("\n");
    sb.append("    dateLastCalculated: ").append(toIndentedString(dateLastCalculated)).append("\n");
    sb.append("    dateLastActive: ").append(toIndentedString(dateLastActive)).append("\n");
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

