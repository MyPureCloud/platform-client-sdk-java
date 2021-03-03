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

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignConfigChangeErrorDetail
 */

public class OutboundMessagingMessagingCampaignConfigChangeErrorDetail  implements Serializable {
  
  private String error = null;
  private String details = null;

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeErrorDetail error(String error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeErrorDetail details(String details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingMessagingCampaignConfigChangeErrorDetail outboundMessagingMessagingCampaignConfigChangeErrorDetail = (OutboundMessagingMessagingCampaignConfigChangeErrorDetail) o;
    return Objects.equals(this.error, outboundMessagingMessagingCampaignConfigChangeErrorDetail.error) &&
        Objects.equals(this.details, outboundMessagingMessagingCampaignConfigChangeErrorDetail.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeErrorDetail {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

