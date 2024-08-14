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
 * CampaignBusinessCategoryMetrics
 */

public class CampaignBusinessCategoryMetrics  implements Serializable {
  
  private Integer successCount = null;
  private Integer neutralCount = null;
  private Integer failureCount = null;

  
  /**
   * Number of calls categorized as business success
   **/
  public CampaignBusinessCategoryMetrics successCount(Integer successCount) {
    this.successCount = successCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of calls categorized as business success")
  @JsonProperty("successCount")
  public Integer getSuccessCount() {
    return successCount;
  }
  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }


  /**
   * Number of calls categorized as business neutral
   **/
  public CampaignBusinessCategoryMetrics neutralCount(Integer neutralCount) {
    this.neutralCount = neutralCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of calls categorized as business neutral")
  @JsonProperty("neutralCount")
  public Integer getNeutralCount() {
    return neutralCount;
  }
  public void setNeutralCount(Integer neutralCount) {
    this.neutralCount = neutralCount;
  }


  /**
   * Number of calls categorized as business failure
   **/
  public CampaignBusinessCategoryMetrics failureCount(Integer failureCount) {
    this.failureCount = failureCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of calls categorized as business failure")
  @JsonProperty("failureCount")
  public Integer getFailureCount() {
    return failureCount;
  }
  public void setFailureCount(Integer failureCount) {
    this.failureCount = failureCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBusinessCategoryMetrics campaignBusinessCategoryMetrics = (CampaignBusinessCategoryMetrics) o;

    return Objects.equals(this.successCount, campaignBusinessCategoryMetrics.successCount) &&
            Objects.equals(this.neutralCount, campaignBusinessCategoryMetrics.neutralCount) &&
            Objects.equals(this.failureCount, campaignBusinessCategoryMetrics.failureCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successCount, neutralCount, failureCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBusinessCategoryMetrics {\n");
    
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
    sb.append("    neutralCount: ").append(toIndentedString(neutralCount)).append("\n");
    sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
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

