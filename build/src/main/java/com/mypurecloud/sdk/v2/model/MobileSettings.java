package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.MobileNotificationSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings for mobile devices
 */
@ApiModel(description = "Settings for mobile devices")

public class MobileSettings  implements Serializable {
  
  private MobileNotificationSettings notifications = null;

  
  /**
   * Settings for a user's mobile notifications
   **/
  public MobileSettings notifications(MobileNotificationSettings notifications) {
    this.notifications = notifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings for a user's mobile notifications")
  @JsonProperty("notifications")
  public MobileNotificationSettings getNotifications() {
    return notifications;
  }
  public void setNotifications(MobileNotificationSettings notifications) {
    this.notifications = notifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileSettings mobileSettings = (MobileSettings) o;

    return Objects.equals(this.notifications, mobileSettings.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileSettings {\n");
    
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

