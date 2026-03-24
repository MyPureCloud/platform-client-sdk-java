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
 * CampaignRuleCampaignRunTimeSettings
 */

public class CampaignRuleCampaignRunTimeSettings  implements Serializable {
  
  private Boolean includeWaitingTime = null;

  public CampaignRuleCampaignRunTimeSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * When true counts all campaign running time, otherwise only running time that a campaign was not waiting. Default: true
   **/
  public CampaignRuleCampaignRunTimeSettings includeWaitingTime(Boolean includeWaitingTime) {
    this.includeWaitingTime = includeWaitingTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When true counts all campaign running time, otherwise only running time that a campaign was not waiting. Default: true")
  @JsonProperty("includeWaitingTime")
  public Boolean getIncludeWaitingTime() {
    return includeWaitingTime;
  }
  public void setIncludeWaitingTime(Boolean includeWaitingTime) {
    this.includeWaitingTime = includeWaitingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleCampaignRunTimeSettings campaignRuleCampaignRunTimeSettings = (CampaignRuleCampaignRunTimeSettings) o;

    return Objects.equals(this.includeWaitingTime, campaignRuleCampaignRunTimeSettings.includeWaitingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeWaitingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleCampaignRunTimeSettings {\n");
    
    sb.append("    includeWaitingTime: ").append(toIndentedString(includeWaitingTime)).append("\n");
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

