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
import com.mypurecloud.sdk.v2.model.ShiftTradeNotification;
import com.mypurecloud.sdk.v2.model.TimeOffRequestNotification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmUserNotification
 */

public class WfmUserNotification  implements Serializable {
  
  private String id = null;
  private String mutableGroupId = null;
  private Date timestamp = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of this notification
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SHIFTTRADE("ShiftTrade"),
    TIMEOFFREQUEST("TimeOffRequest");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private ShiftTradeNotification shiftTrade = null;
  private TimeOffRequestNotification timeOffRequest = null;
  private Boolean markedAsRead = null;
  private Boolean agentNotification = null;
  private List<String> otherNotificationIdsInGroup = new ArrayList<String>();

  
  /**
   * The immutable globally unique identifier for the object.
   **/
  public WfmUserNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The immutable globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The group ID of the notification (mutable, may change  on update)
   **/
  public WfmUserNotification mutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The group ID of the notification (mutable, may change  on update)")
  @JsonProperty("mutableGroupId")
  public String getMutableGroupId() {
    return mutableGroupId;
  }
  public void setMutableGroupId(String mutableGroupId) {
    this.mutableGroupId = mutableGroupId;
  }

  
  @ApiModelProperty(example = "null", value = "The timestamp for this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }

  
  @ApiModelProperty(example = "null", value = "The type of this notification")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  
  @ApiModelProperty(example = "null", value = "A shift trade notification.  Only set if type == ShiftTrade")
  @JsonProperty("shiftTrade")
  public ShiftTradeNotification getShiftTrade() {
    return shiftTrade;
  }

  
  @ApiModelProperty(example = "null", value = "A time off request notification.  Only set if type == TimeOffRequest")
  @JsonProperty("timeOffRequest")
  public TimeOffRequestNotification getTimeOffRequest() {
    return timeOffRequest;
  }

  
  /**
   * Whether this notification has been marked \"read\"
   **/
  public WfmUserNotification markedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this notification has been marked \"read\"")
  @JsonProperty("markedAsRead")
  public Boolean getMarkedAsRead() {
    return markedAsRead;
  }
  public void setMarkedAsRead(Boolean markedAsRead) {
    this.markedAsRead = markedAsRead;
  }

  
  @ApiModelProperty(example = "null", value = "Whether this notification is for an agent")
  @JsonProperty("agentNotification")
  public Boolean getAgentNotification() {
    return agentNotification;
  }

  
  @ApiModelProperty(example = "null", value = "Other notification IDs in group.  This field is only populated in real-time notifications")
  @JsonProperty("otherNotificationIdsInGroup")
  public List<String> getOtherNotificationIdsInGroup() {
    return otherNotificationIdsInGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserNotification wfmUserNotification = (WfmUserNotification) o;
    return Objects.equals(this.id, wfmUserNotification.id) &&
        Objects.equals(this.mutableGroupId, wfmUserNotification.mutableGroupId) &&
        Objects.equals(this.timestamp, wfmUserNotification.timestamp) &&
        Objects.equals(this.type, wfmUserNotification.type) &&
        Objects.equals(this.shiftTrade, wfmUserNotification.shiftTrade) &&
        Objects.equals(this.timeOffRequest, wfmUserNotification.timeOffRequest) &&
        Objects.equals(this.markedAsRead, wfmUserNotification.markedAsRead) &&
        Objects.equals(this.agentNotification, wfmUserNotification.agentNotification) &&
        Objects.equals(this.otherNotificationIdsInGroup, wfmUserNotification.otherNotificationIdsInGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mutableGroupId, timestamp, type, shiftTrade, timeOffRequest, markedAsRead, agentNotification, otherNotificationIdsInGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mutableGroupId: ").append(toIndentedString(mutableGroupId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shiftTrade: ").append(toIndentedString(shiftTrade)).append("\n");
    sb.append("    timeOffRequest: ").append(toIndentedString(timeOffRequest)).append("\n");
    sb.append("    markedAsRead: ").append(toIndentedString(markedAsRead)).append("\n");
    sb.append("    agentNotification: ").append(toIndentedString(agentNotification)).append("\n");
    sb.append("    otherNotificationIdsInGroup: ").append(toIndentedString(otherNotificationIdsInGroup)).append("\n");
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

