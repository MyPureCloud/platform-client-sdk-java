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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BuScheduleNotificationsSettingsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuNotificationSettingsResponse
 */

public class BuNotificationSettingsResponse  implements Serializable {
  
  private BuScheduleNotificationsSettingsResponse scheduling = null;

  public BuNotificationSettingsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Schedule notification settings
   **/
  public BuNotificationSettingsResponse scheduling(BuScheduleNotificationsSettingsResponse scheduling) {
    this.scheduling = scheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule notification settings")
  @JsonProperty("scheduling")
  public BuScheduleNotificationsSettingsResponse getScheduling() {
    return scheduling;
  }
  public void setScheduling(BuScheduleNotificationsSettingsResponse scheduling) {
    this.scheduling = scheduling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuNotificationSettingsResponse buNotificationSettingsResponse = (BuNotificationSettingsResponse) o;

    return Objects.equals(this.scheduling, buNotificationSettingsResponse.scheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuNotificationSettingsResponse {\n");
    
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
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

