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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * CampaignPerformanceDataContactRate
 */

public class CampaignPerformanceDataContactRate  implements Serializable {
  
  private BigDecimal connectRatio = null;

  public CampaignPerformanceDataContactRate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Ratio of connects to attempts
   **/
  public CampaignPerformanceDataContactRate connectRatio(BigDecimal connectRatio) {
    this.connectRatio = connectRatio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ratio of connects to attempts")
  @JsonProperty("connectRatio")
  public BigDecimal getConnectRatio() {
    return connectRatio;
  }
  public void setConnectRatio(BigDecimal connectRatio) {
    this.connectRatio = connectRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPerformanceDataContactRate campaignPerformanceDataContactRate = (CampaignPerformanceDataContactRate) o;

    return Objects.equals(this.connectRatio, campaignPerformanceDataContactRate.connectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPerformanceDataContactRate {\n");
    
    sb.append("    connectRatio: ").append(toIndentedString(connectRatio)).append("\n");
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

