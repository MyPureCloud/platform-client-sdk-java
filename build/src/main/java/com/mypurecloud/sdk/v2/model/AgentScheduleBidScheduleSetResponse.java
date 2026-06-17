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
import com.mypurecloud.sdk.v2.model.BidGroupScheduleSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentScheduleBidScheduleSetResponse
 */

public class AgentScheduleBidScheduleSetResponse  implements Serializable {
  
  private String downloadUrl = null;
  private BidGroupScheduleSet downloadTemplate = null;

  public AgentScheduleBidScheduleSetResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentScheduleBidScheduleSetResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The download URL to fetch the schedule set of the bid group to which the agent belongs
   **/
  public AgentScheduleBidScheduleSetResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The download URL to fetch the schedule set of the bid group to which the agent belongs")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Schedule sets always come through downloadUrl, the schema included here is just for documentation
   **/
  public AgentScheduleBidScheduleSetResponse downloadTemplate(BidGroupScheduleSet downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule sets always come through downloadUrl, the schema included here is just for documentation")
  @JsonProperty("downloadTemplate")
  public BidGroupScheduleSet getDownloadTemplate() {
    return downloadTemplate;
  }
  public void setDownloadTemplate(BidGroupScheduleSet downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentScheduleBidScheduleSetResponse agentScheduleBidScheduleSetResponse = (AgentScheduleBidScheduleSetResponse) o;

    return Objects.equals(this.downloadUrl, agentScheduleBidScheduleSetResponse.downloadUrl) &&
            Objects.equals(this.downloadTemplate, agentScheduleBidScheduleSetResponse.downloadTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, downloadTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleBidScheduleSetResponse {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadTemplate: ").append(toIndentedString(downloadTemplate)).append("\n");
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

