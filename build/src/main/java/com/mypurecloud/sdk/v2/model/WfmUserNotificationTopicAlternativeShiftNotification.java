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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmUserNotificationTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WfmUserNotificationTopicAlternativeShiftNotification
 */

public class WfmUserNotificationTopicAlternativeShiftNotification  implements Serializable {
  
  private String id = null;
  private Date weekDate = null;

  private static class GranularityEnumDeserializer extends StdDeserializer<GranularityEnum> {
    public GranularityEnumDeserializer() {
      super(GranularityEnumDeserializer.class);
    }

    @Override
    public GranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets granularity
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily"),
    WEEKLY("Weekly");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityEnum value : GranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityEnum granularity = null;

  private static class NewStateEnumDeserializer extends StdDeserializer<NewStateEnum> {
    public NewStateEnumDeserializer() {
      super(NewStateEnumDeserializer.class);
    }

    @Override
    public NewStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NewStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets newState
   */
 @JsonDeserialize(using = NewStateEnumDeserializer.class)
  public enum NewStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUBMITTED("Submitted"),
    EXPIRED("Expired"),
    APPROVED("Approved"),
    DENIED("Denied"),
    CANCELED("Canceled");

    private String value;

    NewStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NewStateEnum fromString(String key) {
      if (key == null) return null;

      for (NewStateEnum value : NewStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NewStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NewStateEnum newState = null;
  private WfmUserNotificationTopicUserReference initiatingUser = null;
  private Date initiatingShiftDate = null;
  private WfmUserNotificationTopicUserReference receivingUser = null;
  private Date receivingShiftDate = null;

  public WfmUserNotificationTopicAlternativeShiftNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmUserNotificationTopicAlternativeShiftNotification id(String id) {
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
  public WfmUserNotificationTopicAlternativeShiftNotification weekDate(Date weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public Date getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(Date weekDate) {
    this.weekDate = weekDate;
  }


  /**
   **/
  public WfmUserNotificationTopicAlternativeShiftNotification granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   **/
  public WfmUserNotificationTopicAlternativeShiftNotification newState(NewStateEnum newState) {
    this.newState = newState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("newState")
  public NewStateEnum getNewState() {
    return newState;
  }
  public void setNewState(NewStateEnum newState) {
    this.newState = newState;
  }


  /**
   **/
  public WfmUserNotificationTopicAlternativeShiftNotification initiatingUser(WfmUserNotificationTopicUserReference initiatingUser) {
    this.initiatingUser = initiatingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiatingUser")
  public WfmUserNotificationTopicUserReference getInitiatingUser() {
    return initiatingUser;
  }
  public void setInitiatingUser(WfmUserNotificationTopicUserReference initiatingUser) {
    this.initiatingUser = initiatingUser;
  }


  /**
   **/
  public WfmUserNotificationTopicAlternativeShiftNotification initiatingShiftDate(Date initiatingShiftDate) {
    this.initiatingShiftDate = initiatingShiftDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiatingShiftDate")
  public Date getInitiatingShiftDate() {
    return initiatingShiftDate;
  }
  public void setInitiatingShiftDate(Date initiatingShiftDate) {
    this.initiatingShiftDate = initiatingShiftDate;
  }


  /**
   **/
  public WfmUserNotificationTopicAlternativeShiftNotification receivingUser(WfmUserNotificationTopicUserReference receivingUser) {
    this.receivingUser = receivingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivingUser")
  public WfmUserNotificationTopicUserReference getReceivingUser() {
    return receivingUser;
  }
  public void setReceivingUser(WfmUserNotificationTopicUserReference receivingUser) {
    this.receivingUser = receivingUser;
  }


  /**
   **/
  public WfmUserNotificationTopicAlternativeShiftNotification receivingShiftDate(Date receivingShiftDate) {
    this.receivingShiftDate = receivingShiftDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("receivingShiftDate")
  public Date getReceivingShiftDate() {
    return receivingShiftDate;
  }
  public void setReceivingShiftDate(Date receivingShiftDate) {
    this.receivingShiftDate = receivingShiftDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserNotificationTopicAlternativeShiftNotification wfmUserNotificationTopicAlternativeShiftNotification = (WfmUserNotificationTopicAlternativeShiftNotification) o;

    return Objects.equals(this.id, wfmUserNotificationTopicAlternativeShiftNotification.id) &&
            Objects.equals(this.weekDate, wfmUserNotificationTopicAlternativeShiftNotification.weekDate) &&
            Objects.equals(this.granularity, wfmUserNotificationTopicAlternativeShiftNotification.granularity) &&
            Objects.equals(this.newState, wfmUserNotificationTopicAlternativeShiftNotification.newState) &&
            Objects.equals(this.initiatingUser, wfmUserNotificationTopicAlternativeShiftNotification.initiatingUser) &&
            Objects.equals(this.initiatingShiftDate, wfmUserNotificationTopicAlternativeShiftNotification.initiatingShiftDate) &&
            Objects.equals(this.receivingUser, wfmUserNotificationTopicAlternativeShiftNotification.receivingUser) &&
            Objects.equals(this.receivingShiftDate, wfmUserNotificationTopicAlternativeShiftNotification.receivingShiftDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, granularity, newState, initiatingUser, initiatingShiftDate, receivingUser, receivingShiftDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserNotificationTopicAlternativeShiftNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
    sb.append("    initiatingUser: ").append(toIndentedString(initiatingUser)).append("\n");
    sb.append("    initiatingShiftDate: ").append(toIndentedString(initiatingShiftDate)).append("\n");
    sb.append("    receivingUser: ").append(toIndentedString(receivingUser)).append("\n");
    sb.append("    receivingShiftDate: ").append(toIndentedString(receivingShiftDate)).append("\n");
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

