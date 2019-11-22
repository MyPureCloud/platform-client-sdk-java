package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MessageEvaluation
 */

public class MessageEvaluation  implements Serializable {
  
  private String contactColumn = null;
  private String contactAddress = null;
  private String wrapupCodeId = null;
  private Date timestamp = null;

  
  /**
   **/
  public MessageEvaluation contactColumn(String contactColumn) {
    this.contactColumn = contactColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactColumn")
  public String getContactColumn() {
    return contactColumn;
  }
  public void setContactColumn(String contactColumn) {
    this.contactColumn = contactColumn;
  }

  
  /**
   **/
  public MessageEvaluation contactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactAddress")
  public String getContactAddress() {
    return contactAddress;
  }
  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }

  
  /**
   **/
  public MessageEvaluation wrapupCodeId(String wrapupCodeId) {
    this.wrapupCodeId = wrapupCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupCodeId")
  public String getWrapupCodeId() {
    return wrapupCodeId;
  }
  public void setWrapupCodeId(String wrapupCodeId) {
    this.wrapupCodeId = wrapupCodeId;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public MessageEvaluation timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageEvaluation messageEvaluation = (MessageEvaluation) o;
    return Objects.equals(this.contactColumn, messageEvaluation.contactColumn) &&
        Objects.equals(this.contactAddress, messageEvaluation.contactAddress) &&
        Objects.equals(this.wrapupCodeId, messageEvaluation.wrapupCodeId) &&
        Objects.equals(this.timestamp, messageEvaluation.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactColumn, contactAddress, wrapupCodeId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageEvaluation {\n");
    
    sb.append("    contactColumn: ").append(toIndentedString(contactColumn)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    wrapupCodeId: ").append(toIndentedString(wrapupCodeId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

