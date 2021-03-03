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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ShiftTradeNotification
 */

public class ShiftTradeNotification  implements Serializable {
  
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
   * The new state of the shift trade, null if there was no change
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
  private UserReference initiatingUser = null;
  private Date initiatingShiftDate = null;
  private UserReference receivingUser = null;
  private Date receivingShiftDate = null;

  
  /**
   * The start date of the schedule with which this trade is associated
   **/
  public ShiftTradeNotification weekDate(String weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date of the schedule with which this trade is associated")
  @JsonProperty("weekDate")
  public String getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(String weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * The ID of the shift trade
   **/
  public ShiftTradeNotification tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the shift trade")
  @JsonProperty("tradeId")
  public String getTradeId() {
    return tradeId;
  }
  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  
  /**
   * Whether this is a one sided shift trade
   **/
  public ShiftTradeNotification oneSided(Boolean oneSided) {
    this.oneSided = oneSided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is a one sided shift trade")
  @JsonProperty("oneSided")
  public Boolean getOneSided() {
    return oneSided;
  }
  public void setOneSided(Boolean oneSided) {
    this.oneSided = oneSided;
  }

  
  /**
   * The new state of the shift trade, null if there was no change
   **/
  public ShiftTradeNotification newState(NewStateEnum newState) {
    this.newState = newState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new state of the shift trade, null if there was no change")
  @JsonProperty("newState")
  public NewStateEnum getNewState() {
    return newState;
  }
  public void setNewState(NewStateEnum newState) {
    this.newState = newState;
  }

  
  /**
   * The user who initiated the shift trade
   **/
  public ShiftTradeNotification initiatingUser(UserReference initiatingUser) {
    this.initiatingUser = initiatingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who initiated the shift trade")
  @JsonProperty("initiatingUser")
  public UserReference getInitiatingUser() {
    return initiatingUser;
  }
  public void setInitiatingUser(UserReference initiatingUser) {
    this.initiatingUser = initiatingUser;
  }

  
  /**
   * The start date and time of the initiating shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeNotification initiatingShiftDate(Date initiatingShiftDate) {
    this.initiatingShiftDate = initiatingShiftDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date and time of the initiating shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("initiatingShiftDate")
  public Date getInitiatingShiftDate() {
    return initiatingShiftDate;
  }
  public void setInitiatingShiftDate(Date initiatingShiftDate) {
    this.initiatingShiftDate = initiatingShiftDate;
  }

  
  /**
   * The user on the receiving side of this shift trade (null if not matched)
   **/
  public ShiftTradeNotification receivingUser(UserReference receivingUser) {
    this.receivingUser = receivingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user on the receiving side of this shift trade (null if not matched)")
  @JsonProperty("receivingUser")
  public UserReference getReceivingUser() {
    return receivingUser;
  }
  public void setReceivingUser(UserReference receivingUser) {
    this.receivingUser = receivingUser;
  }

  
  /**
   * The start date and time of the receiving shift (null if not matched or if one-sided. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ShiftTradeNotification receivingShiftDate(Date receivingShiftDate) {
    this.receivingShiftDate = receivingShiftDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date and time of the receiving shift (null if not matched or if one-sided. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    ShiftTradeNotification shiftTradeNotification = (ShiftTradeNotification) o;
    return Objects.equals(this.weekDate, shiftTradeNotification.weekDate) &&
        Objects.equals(this.tradeId, shiftTradeNotification.tradeId) &&
        Objects.equals(this.oneSided, shiftTradeNotification.oneSided) &&
        Objects.equals(this.newState, shiftTradeNotification.newState) &&
        Objects.equals(this.initiatingUser, shiftTradeNotification.initiatingUser) &&
        Objects.equals(this.initiatingShiftDate, shiftTradeNotification.initiatingShiftDate) &&
        Objects.equals(this.receivingUser, shiftTradeNotification.receivingUser) &&
        Objects.equals(this.receivingShiftDate, shiftTradeNotification.receivingShiftDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDate, tradeId, oneSided, newState, initiatingUser, initiatingShiftDate, receivingUser, receivingShiftDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeNotification {\n");
    
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

