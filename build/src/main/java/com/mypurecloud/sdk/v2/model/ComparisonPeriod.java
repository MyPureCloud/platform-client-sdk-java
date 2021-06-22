package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ComparisonPeriod
 */

public class ComparisonPeriod  implements Serializable {
  
  private String id = null;
  private String kpi = null;
  private Date dateStarted = null;
  private Date dateEnded = null;
  private Long kpiTotalOn = null;
  private Long kpiTotalOff = null;
  private Long interactionCountOn = null;
  private Long interactionCountOff = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "Key Performance Indicator optimised during the comparison period.")
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }

  
  @ApiModelProperty(example = "null", value = "Start date of the comparison period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStarted")
  public Date getDateStarted() {
    return dateStarted;
  }

  
  @ApiModelProperty(example = "null", value = "End date of the comparison period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnded")
  public Date getDateEnded() {
    return dateEnded;
  }

  
  @ApiModelProperty(example = "null", value = "Absolute metric (in which the KPI is based) total for the interactions handled by predictive routing (GPR was on)")
  @JsonProperty("kpiTotalOn")
  public Long getKpiTotalOn() {
    return kpiTotalOn;
  }

  
  @ApiModelProperty(example = "null", value = "Absolute metric (in which the KPI is based) total for the interactions not routed by predictive routing (GPR was off)")
  @JsonProperty("kpiTotalOff")
  public Long getKpiTotalOff() {
    return kpiTotalOff;
  }

  
  @ApiModelProperty(example = "null", value = "Total interactions handled by predictive routing (GPR was on)")
  @JsonProperty("interactionCountOn")
  public Long getInteractionCountOn() {
    return interactionCountOn;
  }

  
  @ApiModelProperty(example = "null", value = "Total interactions not routed by predictive routing (GPR was off)")
  @JsonProperty("interactionCountOff")
  public Long getInteractionCountOff() {
    return interactionCountOff;
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
    ComparisonPeriod comparisonPeriod = (ComparisonPeriod) o;
    return Objects.equals(this.id, comparisonPeriod.id) &&
        Objects.equals(this.kpi, comparisonPeriod.kpi) &&
        Objects.equals(this.dateStarted, comparisonPeriod.dateStarted) &&
        Objects.equals(this.dateEnded, comparisonPeriod.dateEnded) &&
        Objects.equals(this.kpiTotalOn, comparisonPeriod.kpiTotalOn) &&
        Objects.equals(this.kpiTotalOff, comparisonPeriod.kpiTotalOff) &&
        Objects.equals(this.interactionCountOn, comparisonPeriod.interactionCountOn) &&
        Objects.equals(this.interactionCountOff, comparisonPeriod.interactionCountOff) &&
        Objects.equals(this.selfUri, comparisonPeriod.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kpi, dateStarted, dateEnded, kpiTotalOn, kpiTotalOff, interactionCountOn, interactionCountOff, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonPeriod {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    dateEnded: ").append(toIndentedString(dateEnded)).append("\n");
    sb.append("    kpiTotalOn: ").append(toIndentedString(kpiTotalOn)).append("\n");
    sb.append("    kpiTotalOff: ").append(toIndentedString(kpiTotalOff)).append("\n");
    sb.append("    interactionCountOn: ").append(toIndentedString(interactionCountOn)).append("\n");
    sb.append("    interactionCountOff: ").append(toIndentedString(interactionCountOff)).append("\n");
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

