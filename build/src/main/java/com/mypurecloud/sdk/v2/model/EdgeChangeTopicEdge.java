package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeChangeTopicEdge
 */

public class EdgeChangeTopicEdge  implements Serializable {
  
  private String id = null;

  /**
   * Gets or Sets onlineStatus
   */
  public enum OnlineStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONLINE("ONLINE"),
    OFFLINE("OFFLINE");

    private String value;

    OnlineStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OnlineStatusEnum fromString(String key) {
      if (key == null) return null;

      for (OnlineStatusEnum value : OnlineStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OnlineStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OnlineStatusEnum onlineStatus = null;

  
  /**
   **/
  public EdgeChangeTopicEdge id(String id) {
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
  public EdgeChangeTopicEdge onlineStatus(OnlineStatusEnum onlineStatus) {
    this.onlineStatus = onlineStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onlineStatus")
  public OnlineStatusEnum getOnlineStatus() {
    return onlineStatus;
  }
  public void setOnlineStatus(OnlineStatusEnum onlineStatus) {
    this.onlineStatus = onlineStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeChangeTopicEdge edgeChangeTopicEdge = (EdgeChangeTopicEdge) o;
    return Objects.equals(this.id, edgeChangeTopicEdge.id) &&
        Objects.equals(this.onlineStatus, edgeChangeTopicEdge.onlineStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, onlineStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeChangeTopicEdge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
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

