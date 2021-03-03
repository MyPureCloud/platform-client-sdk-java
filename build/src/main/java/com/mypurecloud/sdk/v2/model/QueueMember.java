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
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueMember
 */

public class QueueMember  implements Serializable {
  
  private String id = null;
  private String name = null;
  private User user = null;
  private Integer ringNumber = null;
  private Boolean joined = null;
  private String memberBy = null;
  private RoutingStatus routingStatus = null;
  private String selfUri = null;

  
  /**
   * The queue member's id.
   **/
  public QueueMember id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue member's id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public QueueMember name(String name) {
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
  public QueueMember user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   **/
  public QueueMember ringNumber(Integer ringNumber) {
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
  public QueueMember joined(Boolean joined) {
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
  public QueueMember memberBy(String memberBy) {
    this.memberBy = memberBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("memberBy")
  public String getMemberBy() {
    return memberBy;
  }
  public void setMemberBy(String memberBy) {
    this.memberBy = memberBy;
  }

  
  /**
   **/
  public QueueMember routingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routingStatus")
  public RoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueMember queueMember = (QueueMember) o;
    return Objects.equals(this.id, queueMember.id) &&
        Objects.equals(this.name, queueMember.name) &&
        Objects.equals(this.user, queueMember.user) &&
        Objects.equals(this.ringNumber, queueMember.ringNumber) &&
        Objects.equals(this.joined, queueMember.joined) &&
        Objects.equals(this.memberBy, queueMember.memberBy) &&
        Objects.equals(this.routingStatus, queueMember.routingStatus) &&
        Objects.equals(this.selfUri, queueMember.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, user, ringNumber, joined, memberBy, routingStatus, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueMember {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    ringNumber: ").append(toIndentedString(ringNumber)).append("\n");
    sb.append("    joined: ").append(toIndentedString(joined)).append("\n");
    sb.append("    memberBy: ").append(toIndentedString(memberBy)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

