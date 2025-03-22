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
import com.mypurecloud.sdk.v2.model.EscalationTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ManualEscalationResponse
 */

public class ManualEscalationResponse  implements Serializable {
  
  private String socialMediaNormalizedMessageId = null;
  private String conversationNormalizedMessageId = null;
  private EscalationTarget escalationTarget = null;

  private static class EscalationStatusEnumDeserializer extends StdDeserializer<EscalationStatusEnum> {
    public EscalationStatusEnumDeserializer() {
      super(EscalationStatusEnumDeserializer.class);
    }

    @Override
    public EscalationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EscalationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Escalation Status of the message.
   */
 @JsonDeserialize(using = EscalationStatusEnumDeserializer.class)
  public enum EscalationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    MANUAL("Manual"),
    THROTTLED("Throttled"),
    PREVIOUSLYESCALATED("PreviouslyEscalated"),
    NOTESCALATED("NotEscalated"),
    AUTOMATIC("Automatic");

    private String value;

    EscalationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EscalationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (EscalationStatusEnum value : EscalationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EscalationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EscalationStatusEnum escalationStatus = null;

  
  /**
   * The Id of the message that got escalated.
   **/
  public ManualEscalationResponse socialMediaNormalizedMessageId(String socialMediaNormalizedMessageId) {
    this.socialMediaNormalizedMessageId = socialMediaNormalizedMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Id of the message that got escalated.")
  @JsonProperty("socialMediaNormalizedMessageId")
  public String getSocialMediaNormalizedMessageId() {
    return socialMediaNormalizedMessageId;
  }
  public void setSocialMediaNormalizedMessageId(String socialMediaNormalizedMessageId) {
    this.socialMediaNormalizedMessageId = socialMediaNormalizedMessageId;
  }


  /**
   * The ID of the message in the conversation.
   **/
  public ManualEscalationResponse conversationNormalizedMessageId(String conversationNormalizedMessageId) {
    this.conversationNormalizedMessageId = conversationNormalizedMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the message in the conversation.")
  @JsonProperty("conversationNormalizedMessageId")
  public String getConversationNormalizedMessageId() {
    return conversationNormalizedMessageId;
  }
  public void setConversationNormalizedMessageId(String conversationNormalizedMessageId) {
    this.conversationNormalizedMessageId = conversationNormalizedMessageId;
  }


  /**
   * The target integration configuration used for an social media message.
   **/
  public ManualEscalationResponse escalationTarget(EscalationTarget escalationTarget) {
    this.escalationTarget = escalationTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for an social media message.")
  @JsonProperty("escalationTarget")
  public EscalationTarget getEscalationTarget() {
    return escalationTarget;
  }
  public void setEscalationTarget(EscalationTarget escalationTarget) {
    this.escalationTarget = escalationTarget;
  }


  /**
   * Escalation Status of the message.
   **/
  public ManualEscalationResponse escalationStatus(EscalationStatusEnum escalationStatus) {
    this.escalationStatus = escalationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Escalation Status of the message.")
  @JsonProperty("escalationStatus")
  public EscalationStatusEnum getEscalationStatus() {
    return escalationStatus;
  }
  public void setEscalationStatus(EscalationStatusEnum escalationStatus) {
    this.escalationStatus = escalationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualEscalationResponse manualEscalationResponse = (ManualEscalationResponse) o;

    return Objects.equals(this.socialMediaNormalizedMessageId, manualEscalationResponse.socialMediaNormalizedMessageId) &&
            Objects.equals(this.conversationNormalizedMessageId, manualEscalationResponse.conversationNormalizedMessageId) &&
            Objects.equals(this.escalationTarget, manualEscalationResponse.escalationTarget) &&
            Objects.equals(this.escalationStatus, manualEscalationResponse.escalationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialMediaNormalizedMessageId, conversationNormalizedMessageId, escalationTarget, escalationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualEscalationResponse {\n");
    
    sb.append("    socialMediaNormalizedMessageId: ").append(toIndentedString(socialMediaNormalizedMessageId)).append("\n");
    sb.append("    conversationNormalizedMessageId: ").append(toIndentedString(conversationNormalizedMessageId)).append("\n");
    sb.append("    escalationTarget: ").append(toIndentedString(escalationTarget)).append("\n");
    sb.append("    escalationStatus: ").append(toIndentedString(escalationStatus)).append("\n");
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

