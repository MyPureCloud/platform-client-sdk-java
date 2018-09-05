package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ChatBadgeNotificationEntity
 */

public class ChatBadgeNotificationEntity  implements Serializable {
  
  private String jabberId = null;

  
  /**
   **/
  public ChatBadgeNotificationEntity jabberId(String jabberId) {
    this.jabberId = jabberId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jabberId")
  public String getJabberId() {
    return jabberId;
  }
  public void setJabberId(String jabberId) {
    this.jabberId = jabberId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatBadgeNotificationEntity chatBadgeNotificationEntity = (ChatBadgeNotificationEntity) o;
    return Objects.equals(this.jabberId, chatBadgeNotificationEntity.jabberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jabberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatBadgeNotificationEntity {\n");
    
    sb.append("    jabberId: ").append(toIndentedString(jabberId)).append("\n");
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

