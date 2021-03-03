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
 * DialerCampaignConfigChangeRestErrorDetail
 */

public class DialerCampaignConfigChangeRestErrorDetail  implements Serializable {
  
  private String error = null;
  private String details = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCampaignConfigChangeRestErrorDetail error(String error) {
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
  public DialerCampaignConfigChangeRestErrorDetail details(String details) {
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

  
  /**
   **/
  public DialerCampaignConfigChangeRestErrorDetail additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignConfigChangeRestErrorDetail dialerCampaignConfigChangeRestErrorDetail = (DialerCampaignConfigChangeRestErrorDetail) o;
    return Objects.equals(this.error, dialerCampaignConfigChangeRestErrorDetail.error) &&
        Objects.equals(this.details, dialerCampaignConfigChangeRestErrorDetail.details) &&
        Objects.equals(this.additionalProperties, dialerCampaignConfigChangeRestErrorDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, details, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignConfigChangeRestErrorDetail {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

