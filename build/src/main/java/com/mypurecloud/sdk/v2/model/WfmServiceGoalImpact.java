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
 * WfmServiceGoalImpact
 */

public class WfmServiceGoalImpact  implements Serializable {
  
  private Double increaseByPercent = null;
  private Double decreaseByPercent = null;

  public WfmServiceGoalImpact() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The maximum allowed percent increase from the configured goal
   **/
  public WfmServiceGoalImpact increaseByPercent(Double increaseByPercent) {
    this.increaseByPercent = increaseByPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum allowed percent increase from the configured goal")
  @JsonProperty("increaseByPercent")
  public Double getIncreaseByPercent() {
    return increaseByPercent;
  }
  public void setIncreaseByPercent(Double increaseByPercent) {
    this.increaseByPercent = increaseByPercent;
  }


  /**
   * The maximum allowed percent decrease from the configured goal
   **/
  public WfmServiceGoalImpact decreaseByPercent(Double decreaseByPercent) {
    this.decreaseByPercent = decreaseByPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum allowed percent decrease from the configured goal")
  @JsonProperty("decreaseByPercent")
  public Double getDecreaseByPercent() {
    return decreaseByPercent;
  }
  public void setDecreaseByPercent(Double decreaseByPercent) {
    this.decreaseByPercent = decreaseByPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmServiceGoalImpact wfmServiceGoalImpact = (WfmServiceGoalImpact) o;

    return Objects.equals(this.increaseByPercent, wfmServiceGoalImpact.increaseByPercent) &&
            Objects.equals(this.decreaseByPercent, wfmServiceGoalImpact.decreaseByPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increaseByPercent, decreaseByPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmServiceGoalImpact {\n");
    
    sb.append("    increaseByPercent: ").append(toIndentedString(increaseByPercent)).append("\n");
    sb.append("    decreaseByPercent: ").append(toIndentedString(decreaseByPercent)).append("\n");
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

