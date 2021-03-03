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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmUserNotificationTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmUserNotificationTopicTimeOffRequestNotification
 */

public class WfmUserNotificationTopicTimeOffRequestNotification  implements Serializable {
  
  private String timeOffRequestId = null;
  private WfmUserNotificationTopicUserReference user = null;
  private Boolean isFullDayRequest = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("PENDING"),
    APPROVED("APPROVED"),
    DENIED("DENIED"),
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private List<Date> partialDayStartDateTimes = new ArrayList<Date>();
  private List<String> fullDayManagementUnitDates = new ArrayList<String>();

  
  /**
   **/
  public WfmUserNotificationTopicTimeOffRequestNotification timeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeOffRequestId")
  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }
  public void setTimeOffRequestId(String timeOffRequestId) {
    this.timeOffRequestId = timeOffRequestId;
  }

  
  /**
   **/
  public WfmUserNotificationTopicTimeOffRequestNotification user(WfmUserNotificationTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmUserNotificationTopicUserReference getUser() {
    return user;
  }
  public void setUser(WfmUserNotificationTopicUserReference user) {
    this.user = user;
  }

  
  /**
   **/
  public WfmUserNotificationTopicTimeOffRequestNotification isFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isFullDayRequest")
  public Boolean getIsFullDayRequest() {
    return isFullDayRequest;
  }
  public void setIsFullDayRequest(Boolean isFullDayRequest) {
    this.isFullDayRequest = isFullDayRequest;
  }

  
  /**
   **/
  public WfmUserNotificationTopicTimeOffRequestNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public WfmUserNotificationTopicTimeOffRequestNotification partialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("partialDayStartDateTimes")
  public List<Date> getPartialDayStartDateTimes() {
    return partialDayStartDateTimes;
  }
  public void setPartialDayStartDateTimes(List<Date> partialDayStartDateTimes) {
    this.partialDayStartDateTimes = partialDayStartDateTimes;
  }

  
  /**
   **/
  public WfmUserNotificationTopicTimeOffRequestNotification fullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullDayManagementUnitDates")
  public List<String> getFullDayManagementUnitDates() {
    return fullDayManagementUnitDates;
  }
  public void setFullDayManagementUnitDates(List<String> fullDayManagementUnitDates) {
    this.fullDayManagementUnitDates = fullDayManagementUnitDates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserNotificationTopicTimeOffRequestNotification wfmUserNotificationTopicTimeOffRequestNotification = (WfmUserNotificationTopicTimeOffRequestNotification) o;
    return Objects.equals(this.timeOffRequestId, wfmUserNotificationTopicTimeOffRequestNotification.timeOffRequestId) &&
        Objects.equals(this.user, wfmUserNotificationTopicTimeOffRequestNotification.user) &&
        Objects.equals(this.isFullDayRequest, wfmUserNotificationTopicTimeOffRequestNotification.isFullDayRequest) &&
        Objects.equals(this.status, wfmUserNotificationTopicTimeOffRequestNotification.status) &&
        Objects.equals(this.partialDayStartDateTimes, wfmUserNotificationTopicTimeOffRequestNotification.partialDayStartDateTimes) &&
        Objects.equals(this.fullDayManagementUnitDates, wfmUserNotificationTopicTimeOffRequestNotification.fullDayManagementUnitDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequestId, user, isFullDayRequest, status, partialDayStartDateTimes, fullDayManagementUnitDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserNotificationTopicTimeOffRequestNotification {\n");
    
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isFullDayRequest: ").append(toIndentedString(isFullDayRequest)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partialDayStartDateTimes: ").append(toIndentedString(partialDayStartDateTimes)).append("\n");
    sb.append("    fullDayManagementUnitDates: ").append(toIndentedString(fullDayManagementUnitDates)).append("\n");
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

