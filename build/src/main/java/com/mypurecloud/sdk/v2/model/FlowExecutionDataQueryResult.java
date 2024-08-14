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
import java.util.Date;

import java.io.Serializable;
/**
 * This is the metadata of an executionData entry for a flow.
 */
@ApiModel(description = "This is the metadata of an executionData entry for a flow.")

public class FlowExecutionDataQueryResult  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date startDateTime = null;
  private Date endDateTime = null;
  private String flowId = null;
  private String flowVersion = null;
  private String conversationId = null;

  private static class FlowTypeEnumDeserializer extends StdDeserializer<FlowTypeEnum> {
    public FlowTypeEnumDeserializer() {
      super(FlowTypeEnumDeserializer.class);
    }

    @Override
    public FlowTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlowTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of flow.
   */
 @JsonDeserialize(using = FlowTypeEnumDeserializer.class)
  public enum FlowTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("bot"),
    COMMONMODULE("commonmodule"),
    DIGITALBOT("digitalbot"),
    INBOUNDCALL("inboundcall"),
    INBOUNDCHAT("inboundchat"),
    INBOUNDEMAIL("inboundemail"),
    INBOUNDSHORTMESSAGE("inboundshortmessage"),
    INQUEUECALL("inqueuecall"),
    INQUEUESHORTMESSAGE("inqueueshortmessage"),
    INQUEUEEMAIL("inqueueemail"),
    OUTBOUNDCALL("outboundcall"),
    SECURECALL("securecall"),
    SURVEYINVITE("surveyinvite"),
    VOICE("voice"),
    VOICEMAIL("voicemail"),
    VOICESURVEY("voicesurvey"),
    WORKFLOW("workflow"),
    WORKITEM("workitem");

    private String value;

    FlowTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlowTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FlowTypeEnum value : FlowTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlowTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlowTypeEnum flowType = null;
  private String flowErrorReason = null;
  private String flowWarningReason = null;
  private String flowName = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public FlowExecutionDataQueryResult name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The start time for the execution of this flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FlowExecutionDataQueryResult startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time for the execution of this flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }


  /**
   * The end time for the execution of this flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FlowExecutionDataQueryResult endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time for the execution of this flow. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDateTime")
  public Date getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }


  /**
   * The id of the flow that was executed.
   **/
  public FlowExecutionDataQueryResult flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the flow that was executed.")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  /**
   * The version of the flow that was executed.
   **/
  public FlowExecutionDataQueryResult flowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the flow that was executed.")
  @JsonProperty("flowVersion")
  public String getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
  }


  /**
   * The id of the conversation that executed this flow.
   **/
  public FlowExecutionDataQueryResult conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the conversation that executed this flow.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The type of flow.
   **/
  public FlowExecutionDataQueryResult flowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of flow.")
  @JsonProperty("flowType")
  public FlowTypeEnum getFlowType() {
    return flowType;
  }
  public void setFlowType(FlowTypeEnum flowType) {
    this.flowType = flowType;
  }


  /**
   * If the flow errored out this is the reason.
   **/
  public FlowExecutionDataQueryResult flowErrorReason(String flowErrorReason) {
    this.flowErrorReason = flowErrorReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the flow errored out this is the reason.")
  @JsonProperty("flowErrorReason")
  public String getFlowErrorReason() {
    return flowErrorReason;
  }
  public void setFlowErrorReason(String flowErrorReason) {
    this.flowErrorReason = flowErrorReason;
  }


  /**
   * If the flow had a warning, this is the reason.
   **/
  public FlowExecutionDataQueryResult flowWarningReason(String flowWarningReason) {
    this.flowWarningReason = flowWarningReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the flow had a warning, this is the reason.")
  @JsonProperty("flowWarningReason")
  public String getFlowWarningReason() {
    return flowWarningReason;
  }
  public void setFlowWarningReason(String flowWarningReason) {
    this.flowWarningReason = flowWarningReason;
  }


  /**
   * The name of the flow.
   **/
  public FlowExecutionDataQueryResult flowName(String flowName) {
    this.flowName = flowName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the flow.")
  @JsonProperty("flowName")
  public String getFlowName() {
    return flowName;
  }
  public void setFlowName(String flowName) {
    this.flowName = flowName;
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
    FlowExecutionDataQueryResult flowExecutionDataQueryResult = (FlowExecutionDataQueryResult) o;

    return Objects.equals(this.id, flowExecutionDataQueryResult.id) &&
            Objects.equals(this.name, flowExecutionDataQueryResult.name) &&
            Objects.equals(this.startDateTime, flowExecutionDataQueryResult.startDateTime) &&
            Objects.equals(this.endDateTime, flowExecutionDataQueryResult.endDateTime) &&
            Objects.equals(this.flowId, flowExecutionDataQueryResult.flowId) &&
            Objects.equals(this.flowVersion, flowExecutionDataQueryResult.flowVersion) &&
            Objects.equals(this.conversationId, flowExecutionDataQueryResult.conversationId) &&
            Objects.equals(this.flowType, flowExecutionDataQueryResult.flowType) &&
            Objects.equals(this.flowErrorReason, flowExecutionDataQueryResult.flowErrorReason) &&
            Objects.equals(this.flowWarningReason, flowExecutionDataQueryResult.flowWarningReason) &&
            Objects.equals(this.flowName, flowExecutionDataQueryResult.flowName) &&
            Objects.equals(this.selfUri, flowExecutionDataQueryResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDateTime, endDateTime, flowId, flowVersion, conversationId, flowType, flowErrorReason, flowWarningReason, flowName, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowExecutionDataQueryResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    flowErrorReason: ").append(toIndentedString(flowErrorReason)).append("\n");
    sb.append("    flowWarningReason: ").append(toIndentedString(flowWarningReason)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
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

