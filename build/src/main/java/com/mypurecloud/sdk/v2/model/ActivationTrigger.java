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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ActivationTrigger
 */

public class ActivationTrigger  implements Serializable {
  

  private static class TriggerTypeEnumDeserializer extends StdDeserializer<TriggerTypeEnum> {
    public TriggerTypeEnumDeserializer() {
      super(TriggerTypeEnumDeserializer.class);
    }

    @Override
    public TriggerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TriggerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Trigger type that activated this checklist.
   */
 @JsonDeserialize(using = TriggerTypeEnumDeserializer.class)
  public enum TriggerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTENT("Intent"),
    CONVERSATIONSTART("ConversationStart");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TriggerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TriggerTypeEnum value : TriggerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TriggerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TriggerTypeEnum triggerType = null;
  private Date triggerDate = null;
  private String intentId = null;
  private String intentName = null;

  public ActivationTrigger() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Trigger type that activated this checklist.
   **/
  public ActivationTrigger triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trigger type that activated this checklist.")
  @JsonProperty("triggerType")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }
  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }


  /**
   * Date when the checklist was triggered. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ActivationTrigger triggerDate(Date triggerDate) {
    this.triggerDate = triggerDate;
    return this;
  }
  
  @ApiModelProperty(example = "2025-08-06T03:52:10.150Z", value = "Date when the checklist was triggered. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("triggerDate")
  public Date getTriggerDate() {
    return triggerDate;
  }
  public void setTriggerDate(Date triggerDate) {
    this.triggerDate = triggerDate;
  }


  /**
   * The intent ID if checklist was triggered by an intent.
   **/
  public ActivationTrigger intentId(String intentId) {
    this.intentId = intentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent ID if checklist was triggered by an intent.")
  @JsonProperty("intentId")
  public String getIntentId() {
    return intentId;
  }
  public void setIntentId(String intentId) {
    this.intentId = intentId;
  }


  /**
   * The intent name if checklist was triggered by an intent.
   **/
  public ActivationTrigger intentName(String intentName) {
    this.intentName = intentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intent name if checklist was triggered by an intent.")
  @JsonProperty("intentName")
  public String getIntentName() {
    return intentName;
  }
  public void setIntentName(String intentName) {
    this.intentName = intentName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivationTrigger activationTrigger = (ActivationTrigger) o;

    return Objects.equals(this.triggerType, activationTrigger.triggerType) &&
            Objects.equals(this.triggerDate, activationTrigger.triggerDate) &&
            Objects.equals(this.intentId, activationTrigger.intentId) &&
            Objects.equals(this.intentName, activationTrigger.intentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerType, triggerDate, intentId, intentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivationTrigger {\n");
    
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    triggerDate: ").append(toIndentedString(triggerDate)).append("\n");
    sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
    sb.append("    intentName: ").append(toIndentedString(intentName)).append("\n");
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

