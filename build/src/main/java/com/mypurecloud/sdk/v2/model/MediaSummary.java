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
import com.mypurecloud.sdk.v2.model.MediaSummaryDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MediaSummary
 */

public class MediaSummary  implements Serializable {
  
  private MediaSummaryDetail contactCenter = null;
  private MediaSummaryDetail enterprise = null;

  
  /**
   **/
  public MediaSummary contactCenter(MediaSummaryDetail contactCenter) {
    this.contactCenter = contactCenter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactCenter")
  public MediaSummaryDetail getContactCenter() {
    return contactCenter;
  }
  public void setContactCenter(MediaSummaryDetail contactCenter) {
    this.contactCenter = contactCenter;
  }

  
  /**
   **/
  public MediaSummary enterprise(MediaSummaryDetail enterprise) {
    this.enterprise = enterprise;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enterprise")
  public MediaSummaryDetail getEnterprise() {
    return enterprise;
  }
  public void setEnterprise(MediaSummaryDetail enterprise) {
    this.enterprise = enterprise;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaSummary mediaSummary = (MediaSummary) o;
    return Objects.equals(this.contactCenter, mediaSummary.contactCenter) &&
        Objects.equals(this.enterprise, mediaSummary.enterprise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactCenter, enterprise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaSummary {\n");
    
    sb.append("    contactCenter: ").append(toIndentedString(contactCenter)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
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

