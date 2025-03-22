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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationSummaryTopicConversationSummaryParticipant
 */

public class ConversationSummaryTopicConversationSummaryParticipant  implements Serializable {
  
  private String userId = null;

  private static class PurposeEnumDeserializer extends StdDeserializer<PurposeEnum> {
    public PurposeEnumDeserializer() {
      super(PurposeEnumDeserializer.class);
    }

    @Override
    public PurposeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PurposeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets purpose
   */
 @JsonDeserialize(using = PurposeEnumDeserializer.class)
  public enum PurposeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    ACD("ACD"),
    AGENT("AGENT"),
    CUSTOMER("CUSTOMER"),
    WORKFLOW("WORKFLOW");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PurposeEnum fromString(String key) {
      if (key == null) return null;

      for (PurposeEnum value : PurposeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PurposeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PurposeEnum purpose = null;

  
  /**
   **/
  public ConversationSummaryTopicConversationSummaryParticipant userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public ConversationSummaryTopicConversationSummaryParticipant purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSummaryTopicConversationSummaryParticipant conversationSummaryTopicConversationSummaryParticipant = (ConversationSummaryTopicConversationSummaryParticipant) o;

    return Objects.equals(this.userId, conversationSummaryTopicConversationSummaryParticipant.userId) &&
            Objects.equals(this.purpose, conversationSummaryTopicConversationSummaryParticipant.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummaryTopicConversationSummaryParticipant {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

