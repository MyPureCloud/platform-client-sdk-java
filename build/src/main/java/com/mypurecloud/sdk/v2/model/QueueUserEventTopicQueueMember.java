package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueUserEventTopicQueueMember
 */

public class QueueUserEventTopicQueueMember  implements Serializable {
  
  private String memberId = null;
  private String name = null;
  private Integer ringNumber = null;
  private String type = null;
  private Boolean joined = null;

  
  /**
   **/
  public QueueUserEventTopicQueueMember memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  
  /**
   **/
  public QueueUserEventTopicQueueMember name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public QueueUserEventTopicQueueMember ringNumber(Integer ringNumber) {
    this.ringNumber = ringNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ringNumber")
  public Integer getRingNumber() {
    return ringNumber;
  }
  public void setRingNumber(Integer ringNumber) {
    this.ringNumber = ringNumber;
  }

  
  /**
   **/
  public QueueUserEventTopicQueueMember type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public QueueUserEventTopicQueueMember joined(Boolean joined) {
    this.joined = joined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("joined")
  public Boolean getJoined() {
    return joined;
  }
  public void setJoined(Boolean joined) {
    this.joined = joined;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueUserEventTopicQueueMember queueUserEventTopicQueueMember = (QueueUserEventTopicQueueMember) o;
    return Objects.equals(this.memberId, queueUserEventTopicQueueMember.memberId) &&
        Objects.equals(this.name, queueUserEventTopicQueueMember.name) &&
        Objects.equals(this.ringNumber, queueUserEventTopicQueueMember.ringNumber) &&
        Objects.equals(this.type, queueUserEventTopicQueueMember.type) &&
        Objects.equals(this.joined, queueUserEventTopicQueueMember.joined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, name, ringNumber, type, joined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueUserEventTopicQueueMember {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ringNumber: ").append(toIndentedString(ringNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    joined: ").append(toIndentedString(joined)).append("\n");
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

