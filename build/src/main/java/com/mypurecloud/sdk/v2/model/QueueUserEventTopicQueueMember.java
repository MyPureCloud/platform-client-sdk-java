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
import com.mypurecloud.sdk.v2.model.QueueUserEventTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueUserEventTopicQueueMember
 */

public class QueueUserEventTopicQueueMember  implements Serializable {
  
  private String id = null;
  private QueueUserEventTopicUserReference user = null;
  private String queueId = null;
  private Boolean joined = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueUserEventTopicQueueMember id(String id) {
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
  public QueueUserEventTopicQueueMember user(QueueUserEventTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public QueueUserEventTopicUserReference getUser() {
    return user;
  }
  public void setUser(QueueUserEventTopicUserReference user) {
    this.user = user;
  }

  
  /**
   **/
  public QueueUserEventTopicQueueMember queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
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

  
  /**
   **/
  public QueueUserEventTopicQueueMember additionalProperties(Object additionalProperties) {
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
    QueueUserEventTopicQueueMember queueUserEventTopicQueueMember = (QueueUserEventTopicQueueMember) o;
    return Objects.equals(this.id, queueUserEventTopicQueueMember.id) &&
        Objects.equals(this.user, queueUserEventTopicQueueMember.user) &&
        Objects.equals(this.queueId, queueUserEventTopicQueueMember.queueId) &&
        Objects.equals(this.joined, queueUserEventTopicQueueMember.joined) &&
        Objects.equals(this.additionalProperties, queueUserEventTopicQueueMember.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, queueId, joined, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueUserEventTopicQueueMember {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    joined: ").append(toIndentedString(joined)).append("\n");
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

