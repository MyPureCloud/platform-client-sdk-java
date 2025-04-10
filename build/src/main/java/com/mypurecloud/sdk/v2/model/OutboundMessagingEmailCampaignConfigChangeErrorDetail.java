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
 * OutboundMessagingEmailCampaignConfigChangeErrorDetail
 */

public class OutboundMessagingEmailCampaignConfigChangeErrorDetail  implements Serializable {
  
  private String error = null;
  private String details = null;

  public OutboundMessagingEmailCampaignConfigChangeErrorDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the error code.
   **/
  public OutboundMessagingEmailCampaignConfigChangeErrorDetail error(String error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the error code.")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }


  /**
   * The additional information regarding the error message.
   **/
  public OutboundMessagingEmailCampaignConfigChangeErrorDetail details(String details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The additional information regarding the error message.")
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
    OutboundMessagingEmailCampaignConfigChangeErrorDetail outboundMessagingEmailCampaignConfigChangeErrorDetail = (OutboundMessagingEmailCampaignConfigChangeErrorDetail) o;

    return Objects.equals(this.error, outboundMessagingEmailCampaignConfigChangeErrorDetail.error) &&
            Objects.equals(this.details, outboundMessagingEmailCampaignConfigChangeErrorDetail.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingEmailCampaignConfigChangeErrorDetail {\n");
    
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

