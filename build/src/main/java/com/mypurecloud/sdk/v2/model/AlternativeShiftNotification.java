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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
/**
 * AlternativeShiftNotification
 */

public class AlternativeShiftNotification  implements Serializable {
  
  private String id = null;
  private LocalDate weekDate = null;

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
   * The granularity of alternative shifts to be traded
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily");

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
   * The new state of the alternative shift trade, null if there was no change
   */
 @JsonDeserialize(using = NewStateEnumDeserializer.class)
  public enum NewStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CANCELED("Canceled"),
    DENIED("Denied"),
    EXPIRED("Expired"),
    SUBMITTED("Submitted"),
    APPROVED("Approved");

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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The start date of the schedule with which this trade is associated. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public AlternativeShiftNotification weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date of the schedule with which this trade is associated. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  /**
   * The granularity of alternative shifts to be traded
   **/
  public AlternativeShiftNotification granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The granularity of alternative shifts to be traded")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * The new state of the alternative shift trade, null if there was no change
   **/
  public AlternativeShiftNotification newState(NewStateEnum newState) {
    this.newState = newState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new state of the alternative shift trade, null if there was no change")
  @JsonProperty("newState")
  public NewStateEnum getNewState() {
    return newState;
  }
  public void setNewState(NewStateEnum newState) {
    this.newState = newState;
  }


  /**
   * The user who initiated the alternative shift trade
   **/
  public AlternativeShiftNotification initiatingUser(UserReference initiatingUser) {
    this.initiatingUser = initiatingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who initiated the alternative shift trade")
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
  public AlternativeShiftNotification initiatingShiftDate(Date initiatingShiftDate) {
    this.initiatingShiftDate = initiatingShiftDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date and time of the initiating shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("initiatingShiftDate")
  public Date getInitiatingShiftDate() {
    return initiatingShiftDate;
  }
  public void setInitiatingShiftDate(Date initiatingShiftDate) {
    this.initiatingShiftDate = initiatingShiftDate;
  }


  /**
   * The user on the receiving this alternative shift trade
   **/
  public AlternativeShiftNotification receivingUser(UserReference receivingUser) {
    this.receivingUser = receivingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user on the receiving this alternative shift trade")
  @JsonProperty("receivingUser")
  public UserReference getReceivingUser() {
    return receivingUser;
  }
  public void setReceivingUser(UserReference receivingUser) {
    this.receivingUser = receivingUser;
  }


  /**
   * The start date and time of the receiving alternative shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AlternativeShiftNotification receivingShiftDate(Date receivingShiftDate) {
    this.receivingShiftDate = receivingShiftDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date and time of the receiving alternative shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("receivingShiftDate")
  public Date getReceivingShiftDate() {
    return receivingShiftDate;
  }
  public void setReceivingShiftDate(Date receivingShiftDate) {
    this.receivingShiftDate = receivingShiftDate;
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
    AlternativeShiftNotification alternativeShiftNotification = (AlternativeShiftNotification) o;

    return Objects.equals(this.id, alternativeShiftNotification.id) &&
            Objects.equals(this.weekDate, alternativeShiftNotification.weekDate) &&
            Objects.equals(this.granularity, alternativeShiftNotification.granularity) &&
            Objects.equals(this.newState, alternativeShiftNotification.newState) &&
            Objects.equals(this.initiatingUser, alternativeShiftNotification.initiatingUser) &&
            Objects.equals(this.initiatingShiftDate, alternativeShiftNotification.initiatingShiftDate) &&
            Objects.equals(this.receivingUser, alternativeShiftNotification.receivingUser) &&
            Objects.equals(this.receivingShiftDate, alternativeShiftNotification.receivingShiftDate) &&
            Objects.equals(this.selfUri, alternativeShiftNotification.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, granularity, newState, initiatingUser, initiatingShiftDate, receivingUser, receivingShiftDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
    sb.append("    initiatingUser: ").append(toIndentedString(initiatingUser)).append("\n");
    sb.append("    initiatingShiftDate: ").append(toIndentedString(initiatingShiftDate)).append("\n");
    sb.append("    receivingUser: ").append(toIndentedString(receivingUser)).append("\n");
    sb.append("    receivingShiftDate: ").append(toIndentedString(receivingShiftDate)).append("\n");
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

