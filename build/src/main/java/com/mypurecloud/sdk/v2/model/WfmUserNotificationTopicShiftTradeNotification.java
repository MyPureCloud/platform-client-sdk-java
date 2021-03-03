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
import java.util.Date;

import java.io.Serializable;
/**
 * WfmUserNotificationTopicShiftTradeNotification
 */

public class WfmUserNotificationTopicShiftTradeNotification  implements Serializable {
  
  private String weekDate = null;
  private String tradeId = null;
  private Boolean oneSided = null;

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
    UNMATCHED("Unmatched"),
    MATCHED("Matched"),
    APPROVED("Approved"),
    DENIED("Denied"),
    EXPIRED("Expired"),
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

  
  /**
   **/
  public WfmUserNotificationTopicShiftTradeNotification weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   **/
  public WfmUserNotificationTopicShiftTradeNotification tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tradeId")
  public String getTradeId() {
    return tradeId;
  }
  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  
  /**
   **/
  public WfmUserNotificationTopicShiftTradeNotification oneSided(Boolean oneSided) {
    this.oneSided = oneSided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oneSided")
  public Boolean getOneSided() {
    return oneSided;
  }
  public void setOneSided(Boolean oneSided) {
    this.oneSided = oneSided;
  }

  
  /**
   **/
  public WfmUserNotificationTopicShiftTradeNotification newState(NewStateEnum newState) {
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
  public WfmUserNotificationTopicShiftTradeNotification initiatingUser(WfmUserNotificationTopicUserReference initiatingUser) {
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
  public WfmUserNotificationTopicShiftTradeNotification initiatingShiftDate(Date initiatingShiftDate) {
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
  public WfmUserNotificationTopicShiftTradeNotification receivingUser(WfmUserNotificationTopicUserReference receivingUser) {
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
  public WfmUserNotificationTopicShiftTradeNotification receivingShiftDate(Date receivingShiftDate) {
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
    WfmUserNotificationTopicShiftTradeNotification wfmUserNotificationTopicShiftTradeNotification = (WfmUserNotificationTopicShiftTradeNotification) o;
    return Objects.equals(this.weekDate, wfmUserNotificationTopicShiftTradeNotification.weekDate) &&
        Objects.equals(this.tradeId, wfmUserNotificationTopicShiftTradeNotification.tradeId) &&
        Objects.equals(this.oneSided, wfmUserNotificationTopicShiftTradeNotification.oneSided) &&
        Objects.equals(this.newState, wfmUserNotificationTopicShiftTradeNotification.newState) &&
        Objects.equals(this.initiatingUser, wfmUserNotificationTopicShiftTradeNotification.initiatingUser) &&
        Objects.equals(this.initiatingShiftDate, wfmUserNotificationTopicShiftTradeNotification.initiatingShiftDate) &&
        Objects.equals(this.receivingUser, wfmUserNotificationTopicShiftTradeNotification.receivingUser) &&
        Objects.equals(this.receivingShiftDate, wfmUserNotificationTopicShiftTradeNotification.receivingShiftDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, tradeId, oneSided, newState, initiatingUser, initiatingShiftDate, receivingUser, receivingShiftDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserNotificationTopicShiftTradeNotification {\n");
    
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    oneSided: ").append(toIndentedString(oneSided)).append("\n");
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

