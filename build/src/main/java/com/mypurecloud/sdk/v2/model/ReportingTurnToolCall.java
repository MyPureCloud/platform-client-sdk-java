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
import com.mypurecloud.sdk.v2.model.ReportingTurnKnowledgeMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ReportingTurnToolCall
 */

public class ReportingTurnToolCall  implements Serializable {
  
  private String toolId = null;
  private String toolName = null;

  private static class ToolTypeEnumDeserializer extends StdDeserializer<ToolTypeEnum> {
    public ToolTypeEnumDeserializer() {
      super(ToolTypeEnumDeserializer.class);
    }

    @Override
    public ToolTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ToolTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Represents the type of tool used in the event.
   */
 @JsonDeserialize(using = ToolTypeEnumDeserializer.class)
  public enum ToolTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    KNOWLEDGESETTING("KnowledgeSetting"),
    KNOWLEDGEBASE("KnowledgeBase"),
    DATAACTION("DataAction"),
    EXTERNALA2ASERVER("ExternalA2AServer"),
    UNKNOWN("Unknown");

    private String value;

    ToolTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ToolTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ToolTypeEnum value : ToolTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ToolTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ToolTypeEnum toolType = null;
  private String targetId = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Represents whether the tool call was successful or not.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESS("Success"),
    FAILURE("Failure"),
    TIMEOUT("Timeout"),
    UNKNOWN("Unknown");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String errorText = null;
  private Date dateInvoked = null;
  private Integer latencyMs = null;

  private static class OriginEnumDeserializer extends StdDeserializer<OriginEnum> {
    public OriginEnumDeserializer() {
      super(OriginEnumDeserializer.class);
    }

    @Override
    public OriginEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Represents the origin of the tool call.
   */
 @JsonDeserialize(using = OriginEnumDeserializer.class)
  public enum OriginEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVATOOL("AvaTool"),
    UNKNOWN("Unknown");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginEnum fromString(String key) {
      if (key == null) return null;

      for (OriginEnum value : OriginEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OriginEnum origin = null;
  private ReportingTurnKnowledgeMetadata knowledgeMetadata = null;

  public ReportingTurnToolCall() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ReportingTurnToolCall(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Represents the identifier of the tool called.
   **/
  public ReportingTurnToolCall toolId(String toolId) {
    this.toolId = toolId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the identifier of the tool called.")
  @JsonProperty("toolId")
  public String getToolId() {
    return toolId;
  }
  public void setToolId(String toolId) {
    this.toolId = toolId;
  }


  /**
   * Represents the name of the tool used in the event.
   **/
  public ReportingTurnToolCall toolName(String toolName) {
    this.toolName = toolName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the name of the tool used in the event.")
  @JsonProperty("toolName")
  public String getToolName() {
    return toolName;
  }
  public void setToolName(String toolName) {
    this.toolName = toolName;
  }


  /**
   * Represents the type of tool used in the event.
   **/
  public ReportingTurnToolCall toolType(ToolTypeEnum toolType) {
    this.toolType = toolType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the type of tool used in the event.")
  @JsonProperty("toolType")
  public ToolTypeEnum getToolType() {
    return toolType;
  }
  public void setToolType(ToolTypeEnum toolType) {
    this.toolType = toolType;
  }


  /**
   * Represents the identifier of the target that the tool is using.
   **/
  public ReportingTurnToolCall targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the identifier of the target that the tool is using.")
  @JsonProperty("targetId")
  public String getTargetId() {
    return targetId;
  }
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  /**
   * Represents whether the tool call was successful or not.
   **/
  public ReportingTurnToolCall status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents whether the tool call was successful or not.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Represents the error returned by the tool in the event of a failure.
   **/
  public ReportingTurnToolCall errorText(String errorText) {
    this.errorText = errorText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the error returned by the tool in the event of a failure.")
  @JsonProperty("errorText")
  public String getErrorText() {
    return errorText;
  }
  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }


  /**
   * Represents the starting time of the tool call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportingTurnToolCall dateInvoked(Date dateInvoked) {
    this.dateInvoked = dateInvoked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the starting time of the tool call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateInvoked")
  public Date getDateInvoked() {
    return dateInvoked;
  }
  public void setDateInvoked(Date dateInvoked) {
    this.dateInvoked = dateInvoked;
  }


  /**
   * Represents the time it took the tool call to execute.
   **/
  public ReportingTurnToolCall latencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the time it took the tool call to execute.")
  @JsonProperty("latencyMs")
  public Integer getLatencyMs() {
    return latencyMs;
  }
  public void setLatencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
  }


  /**
   * Represents the origin of the tool call.
   **/
  public ReportingTurnToolCall origin(OriginEnum origin) {
    this.origin = origin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the origin of the tool call.")
  @JsonProperty("origin")
  public OriginEnum getOrigin() {
    return origin;
  }
  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }


  /**
   * Represents various metadata of knowledge calls used by the tool if the tool is configured to use knowledge.
   **/
  public ReportingTurnToolCall knowledgeMetadata(ReportingTurnKnowledgeMetadata knowledgeMetadata) {
    this.knowledgeMetadata = knowledgeMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents various metadata of knowledge calls used by the tool if the tool is configured to use knowledge.")
  @JsonProperty("knowledgeMetadata")
  public ReportingTurnKnowledgeMetadata getKnowledgeMetadata() {
    return knowledgeMetadata;
  }
  public void setKnowledgeMetadata(ReportingTurnKnowledgeMetadata knowledgeMetadata) {
    this.knowledgeMetadata = knowledgeMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnToolCall reportingTurnToolCall = (ReportingTurnToolCall) o;

    return Objects.equals(this.toolId, reportingTurnToolCall.toolId) &&
            Objects.equals(this.toolName, reportingTurnToolCall.toolName) &&
            Objects.equals(this.toolType, reportingTurnToolCall.toolType) &&
            Objects.equals(this.targetId, reportingTurnToolCall.targetId) &&
            Objects.equals(this.status, reportingTurnToolCall.status) &&
            Objects.equals(this.errorText, reportingTurnToolCall.errorText) &&
            Objects.equals(this.dateInvoked, reportingTurnToolCall.dateInvoked) &&
            Objects.equals(this.latencyMs, reportingTurnToolCall.latencyMs) &&
            Objects.equals(this.origin, reportingTurnToolCall.origin) &&
            Objects.equals(this.knowledgeMetadata, reportingTurnToolCall.knowledgeMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolId, toolName, toolType, targetId, status, errorText, dateInvoked, latencyMs, origin, knowledgeMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnToolCall {\n");
    
    sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
    sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
    sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
    sb.append("    dateInvoked: ").append(toIndentedString(dateInvoked)).append("\n");
    sb.append("    latencyMs: ").append(toIndentedString(latencyMs)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    knowledgeMetadata: ").append(toIndentedString(knowledgeMetadata)).append("\n");
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

