package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ObservationValue
 */

public class ObservationValue  implements Serializable {
  
  private Date observationDate = null;
  private String conversationId = null;
  private String sessionId = null;
  private List<String> requestedRoutingSkillIds = new ArrayList<String>();
  private String requestedLanguageId = null;
  private String participantName = null;
  private String userId = null;

  /**
   * The direction of the communication
   */
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;
  private String convertedFrom = null;
  private String convertedTo = null;
  private String addressFrom = null;
  private String addressTo = null;
  private String ani = null;
  private String dnis = null;

  
  /**
   * The time at which the observation occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public ObservationValue observationDate(Date observationDate) {
    this.observationDate = observationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time at which the observation occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("observationDate")
  public Date getObservationDate() {
    return observationDate;
  }
  public void setObservationDate(Date observationDate) {
    this.observationDate = observationDate;
  }

  
  /**
   * Unique identifier for the conversation
   **/
  public ObservationValue conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * The unique identifier of this session
   **/
  public ObservationValue sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of this session")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   * Unique identifier for a skill requested for an interaction
   **/
  public ObservationValue requestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for a skill requested for an interaction")
  @JsonProperty("requestedRoutingSkillIds")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }

  
  /**
   * Unique identifier for the language requested for an interaction
   **/
  public ObservationValue requestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the language requested for an interaction")
  @JsonProperty("requestedLanguageId")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }

  
  /**
   * A human readable name identifying the participant
   **/
  public ObservationValue participantName(String participantName) {
    this.participantName = participantName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human readable name identifying the participant")
  @JsonProperty("participantName")
  public String getParticipantName() {
    return participantName;
  }
  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }

  
  /**
   * Unique identifier for the user
   **/
  public ObservationValue userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The direction of the communication
   **/
  public ObservationValue direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the communication")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * Session media type that was converted from in case of a media type conversion
   **/
  public ObservationValue convertedFrom(String convertedFrom) {
    this.convertedFrom = convertedFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session media type that was converted from in case of a media type conversion")
  @JsonProperty("convertedFrom")
  public String getConvertedFrom() {
    return convertedFrom;
  }
  public void setConvertedFrom(String convertedFrom) {
    this.convertedFrom = convertedFrom;
  }

  
  /**
   * Session media type that was converted to in case of a media type conversion
   **/
  public ObservationValue convertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Session media type that was converted to in case of a media type conversion")
  @JsonProperty("convertedTo")
  public String getConvertedTo() {
    return convertedTo;
  }
  public void setConvertedTo(String convertedTo) {
    this.convertedTo = convertedTo;
  }

  
  /**
   * The address that initiated an action
   **/
  public ObservationValue addressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address that initiated an action")
  @JsonProperty("addressFrom")
  public String getAddressFrom() {
    return addressFrom;
  }
  public void setAddressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
  }

  
  /**
   * The address receiving an action
   **/
  public ObservationValue addressTo(String addressTo) {
    this.addressTo = addressTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address receiving an action")
  @JsonProperty("addressTo")
  public String getAddressTo() {
    return addressTo;
  }
  public void setAddressTo(String addressTo) {
    this.addressTo = addressTo;
  }

  
  /**
   * Automatic Number Identification (caller's number)
   **/
  public ObservationValue ani(String ani) {
    this.ani = ani;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Automatic Number Identification (caller's number)")
  @JsonProperty("ani")
  public String getAni() {
    return ani;
  }
  public void setAni(String ani) {
    this.ani = ani;
  }

  
  /**
   * Dialed number identification service (number dialed by the calling party)
   **/
  public ObservationValue dnis(String dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dialed number identification service (number dialed by the calling party)")
  @JsonProperty("dnis")
  public String getDnis() {
    return dnis;
  }
  public void setDnis(String dnis) {
    this.dnis = dnis;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationValue observationValue = (ObservationValue) o;
    return Objects.equals(this.observationDate, observationValue.observationDate) &&
        Objects.equals(this.conversationId, observationValue.conversationId) &&
        Objects.equals(this.sessionId, observationValue.sessionId) &&
        Objects.equals(this.requestedRoutingSkillIds, observationValue.requestedRoutingSkillIds) &&
        Objects.equals(this.requestedLanguageId, observationValue.requestedLanguageId) &&
        Objects.equals(this.participantName, observationValue.participantName) &&
        Objects.equals(this.userId, observationValue.userId) &&
        Objects.equals(this.direction, observationValue.direction) &&
        Objects.equals(this.convertedFrom, observationValue.convertedFrom) &&
        Objects.equals(this.convertedTo, observationValue.convertedTo) &&
        Objects.equals(this.addressFrom, observationValue.addressFrom) &&
        Objects.equals(this.addressTo, observationValue.addressTo) &&
        Objects.equals(this.ani, observationValue.ani) &&
        Objects.equals(this.dnis, observationValue.dnis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observationDate, conversationId, sessionId, requestedRoutingSkillIds, requestedLanguageId, participantName, userId, direction, convertedFrom, convertedTo, addressFrom, addressTo, ani, dnis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationValue {\n");
    
    sb.append("    observationDate: ").append(toIndentedString(observationDate)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    convertedFrom: ").append(toIndentedString(convertedFrom)).append("\n");
    sb.append("    convertedTo: ").append(toIndentedString(convertedTo)).append("\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    ani: ").append(toIndentedString(ani)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
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

