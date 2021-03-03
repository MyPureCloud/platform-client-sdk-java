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
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicPhoneStatus;
import com.mypurecloud.sdk.v2.model.PhoneChangeTopicUserAgentInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PhoneChangeTopicPhone
 */

public class PhoneChangeTopicPhone  implements Serializable {
  
  private PhoneChangeTopicUserAgentInfo userAgentInfo = null;
  private String id = null;
  private PhoneChangeTopicPhoneStatus status = null;
  private PhoneChangeTopicPhoneStatus secondaryStatus = null;

  
  /**
   **/
  public PhoneChangeTopicPhone userAgentInfo(PhoneChangeTopicUserAgentInfo userAgentInfo) {
    this.userAgentInfo = userAgentInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userAgentInfo")
  public PhoneChangeTopicUserAgentInfo getUserAgentInfo() {
    return userAgentInfo;
  }
  public void setUserAgentInfo(PhoneChangeTopicUserAgentInfo userAgentInfo) {
    this.userAgentInfo = userAgentInfo;
  }

  
  /**
   **/
  public PhoneChangeTopicPhone id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public PhoneChangeTopicPhone status(PhoneChangeTopicPhoneStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public PhoneChangeTopicPhoneStatus getStatus() {
    return status;
  }
  public void setStatus(PhoneChangeTopicPhoneStatus status) {
    this.status = status;
  }

  
  /**
   **/
  public PhoneChangeTopicPhone secondaryStatus(PhoneChangeTopicPhoneStatus secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryStatus")
  public PhoneChangeTopicPhoneStatus getSecondaryStatus() {
    return secondaryStatus;
  }
  public void setSecondaryStatus(PhoneChangeTopicPhoneStatus secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChangeTopicPhone phoneChangeTopicPhone = (PhoneChangeTopicPhone) o;
    return Objects.equals(this.userAgentInfo, phoneChangeTopicPhone.userAgentInfo) &&
        Objects.equals(this.id, phoneChangeTopicPhone.id) &&
        Objects.equals(this.status, phoneChangeTopicPhone.status) &&
        Objects.equals(this.secondaryStatus, phoneChangeTopicPhone.secondaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgentInfo, id, status, secondaryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChangeTopicPhone {\n");
    
    sb.append("    userAgentInfo: ").append(toIndentedString(userAgentInfo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
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

