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
import com.mypurecloud.sdk.v2.model.TrunkInstanceTopicTrunkErrorInfoDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrunkInstanceTopicTrunkErrorInfo
 */

public class TrunkInstanceTopicTrunkErrorInfo  implements Serializable {
  
  private String text = null;
  private String code = null;
  private TrunkInstanceTopicTrunkErrorInfoDetails details = null;

  
  /**
   **/
  public TrunkInstanceTopicTrunkErrorInfo text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkErrorInfo code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkErrorInfo details(TrunkInstanceTopicTrunkErrorInfoDetails details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("details")
  public TrunkInstanceTopicTrunkErrorInfoDetails getDetails() {
    return details;
  }
  public void setDetails(TrunkInstanceTopicTrunkErrorInfoDetails details) {
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
    TrunkInstanceTopicTrunkErrorInfo trunkInstanceTopicTrunkErrorInfo = (TrunkInstanceTopicTrunkErrorInfo) o;
    return Objects.equals(this.text, trunkInstanceTopicTrunkErrorInfo.text) &&
        Objects.equals(this.code, trunkInstanceTopicTrunkErrorInfo.code) &&
        Objects.equals(this.details, trunkInstanceTopicTrunkErrorInfo.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, code, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkInstanceTopicTrunkErrorInfo {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

