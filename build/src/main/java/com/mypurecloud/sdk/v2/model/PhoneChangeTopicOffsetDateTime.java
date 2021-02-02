package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicLocalDateTime;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicZoneOffset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PhoneChangeTopicOffsetDateTime
 */

public class PhoneChangeTopicOffsetDateTime  implements Serializable {
  
  private PhoneChangeTopicLocalDateTime dateTime = null;
  private PhoneChangeTopicZoneOffset offset = null;

  
  /**
   **/
  public PhoneChangeTopicOffsetDateTime dateTime(PhoneChangeTopicLocalDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateTime")
  public PhoneChangeTopicLocalDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(PhoneChangeTopicLocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  
  /**
   **/
  public PhoneChangeTopicOffsetDateTime offset(PhoneChangeTopicZoneOffset offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offset")
  public PhoneChangeTopicZoneOffset getOffset() {
    return offset;
  }
  public void setOffset(PhoneChangeTopicZoneOffset offset) {
    this.offset = offset;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChangeTopicOffsetDateTime phoneChangeTopicOffsetDateTime = (PhoneChangeTopicOffsetDateTime) o;
    return Objects.equals(this.dateTime, phoneChangeTopicOffsetDateTime.dateTime) &&
        Objects.equals(this.offset, phoneChangeTopicOffsetDateTime.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChangeTopicOffsetDateTime {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

