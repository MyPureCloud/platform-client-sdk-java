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

import java.io.Serializable;
/**
 * ConversationSummaryTriggerSource
 */

public class ConversationSummaryTriggerSource  implements Serializable {
  

  private static class SourceTypeEnumDeserializer extends StdDeserializer<SourceTypeEnum> {
    public SourceTypeEnumDeserializer() {
      super(SourceTypeEnumDeserializer.class);
    }

    @Override
    public SourceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The configuration entity for which summarization is triggered.
   */
 @JsonDeserialize(using = SourceTypeEnumDeserializer.class)
  public enum SourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    AGENTASSISTANT("AgentAssistant"),
    PROGRAM("Program"),
    FLOW("Flow"),
    COPILOT("Copilot");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SourceTypeEnum value : SourceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceTypeEnum sourceType = null;
  private String sourceId = null;

  private static class SourceOutcomeEnumDeserializer extends StdDeserializer<SourceOutcomeEnum> {
    public SourceOutcomeEnumDeserializer() {
      super(SourceOutcomeEnumDeserializer.class);
    }

    @Override
    public SourceOutcomeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceOutcomeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason a trigger source finished processing. Only applies to Flow trigger source types.
   */
 @JsonDeserialize(using = SourceOutcomeEnumDeserializer.class)
  public enum SourceOutcomeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    CONTAINED("Contained"),
    TRANSFER("Transfer");

    private String value;

    SourceOutcomeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceOutcomeEnum fromString(String key) {
      if (key == null) return null;

      for (SourceOutcomeEnum value : SourceOutcomeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceOutcomeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceOutcomeEnum sourceOutcome = null;

  public ConversationSummaryTriggerSource() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ConversationSummaryTriggerSource(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The configuration entity for which summarization is triggered.
   **/
  public ConversationSummaryTriggerSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration entity for which summarization is triggered.")
  @JsonProperty("sourceType")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  /**
   * The id value for the source type.
   **/
  public ConversationSummaryTriggerSource sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id value for the source type.")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * The reason a trigger source finished processing. Only applies to Flow trigger source types.
   **/
  public ConversationSummaryTriggerSource sourceOutcome(SourceOutcomeEnum sourceOutcome) {
    this.sourceOutcome = sourceOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason a trigger source finished processing. Only applies to Flow trigger source types.")
  @JsonProperty("sourceOutcome")
  public SourceOutcomeEnum getSourceOutcome() {
    return sourceOutcome;
  }
  public void setSourceOutcome(SourceOutcomeEnum sourceOutcome) {
    this.sourceOutcome = sourceOutcome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSummaryTriggerSource conversationSummaryTriggerSource = (ConversationSummaryTriggerSource) o;

    return Objects.equals(this.sourceType, conversationSummaryTriggerSource.sourceType) &&
            Objects.equals(this.sourceId, conversationSummaryTriggerSource.sourceId) &&
            Objects.equals(this.sourceOutcome, conversationSummaryTriggerSource.sourceOutcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, sourceId, sourceOutcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummaryTriggerSource {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceOutcome: ").append(toIndentedString(sourceOutcome)).append("\n");
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

