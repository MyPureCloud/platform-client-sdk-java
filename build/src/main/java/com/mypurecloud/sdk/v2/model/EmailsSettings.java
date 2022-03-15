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
 * EmailsSettings
 */

public class EmailsSettings  implements Serializable {
  
  private Integer sendingSizeLimit = null;

  
  /**
   **/
  public EmailsSettings sendingSizeLimit(Integer sendingSizeLimit) {
    this.sendingSizeLimit = sendingSizeLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sendingSizeLimit")
  public Integer getSendingSizeLimit() {
    return sendingSizeLimit;
  }
  public void setSendingSizeLimit(Integer sendingSizeLimit) {
    this.sendingSizeLimit = sendingSizeLimit;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailsSettings emailsSettings = (EmailsSettings) o;
    return Objects.equals(this.sendingSizeLimit, emailsSettings.sendingSizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendingSizeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailsSettings {\n");
    
    sb.append("    sendingSizeLimit: ").append(toIndentedString(sendingSizeLimit)).append("\n");
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

