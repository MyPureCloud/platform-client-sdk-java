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
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicExecution;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo;
import com.mypurecloud.sdk.v2.model.V2FlowExecutionDataFlowidTopicInvokingContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * V2FlowExecutionDataFlowidTopicFlowExecutionHistory
 */

public class V2FlowExecutionDataFlowidTopicFlowExecutionHistory  implements Serializable {
  
  private String executionId = null;
  private String conversationId = null;
  private String divisionId = null;
  private Date endDateTime = null;
  private String endpoint = null;
  private List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> errors = new ArrayList<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo>();
  private List<V2FlowExecutionDataFlowidTopicExecution> execution = new ArrayList<V2FlowExecutionDataFlowidTopicExecution>();
  private String flowExitReason = null;
  private String flowId = null;
  private Boolean flowIsDebug = null;
  private Boolean executionItemsTruncated = null;
  private String flowType = null;
  private String flowVersion = null;

  private static class MessageTypeEnumDeserializer extends StdDeserializer<MessageTypeEnum> {
    public MessageTypeEnumDeserializer() {
      super(MessageTypeEnumDeserializer.class);
    }

    @Override
    public MessageTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessageTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * If applicable, the type of message platform from which the message originated.
   */
 @JsonDeserialize(using = MessageTypeEnumDeserializer.class)
  public enum MessageTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    SMS("sms"),
    TWITTER("twitter"),
    FACEBOOK("facebook"),
    INSTAGRAM("instagram"),
    LINE("line"),
    WHATSAPP("whatsapp"),
    WEBMESSAGING("webmessaging"),
    OPEN("open");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypeEnum value : MessageTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageTypeEnum messageType = null;
  private V2FlowExecutionDataFlowidTopicInvokingContext invokingContext = null;
  private Date startDateTime = null;
  private List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> warnings = new ArrayList<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo>();

  
  /**
   * The execution identifier which represents this unique instance of the flow that ran.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The execution identifier which represents this unique instance of the flow that ran.")
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }
  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  /**
   * The Genesys Cloud conversation identifier associated with this flow instance execution data.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Genesys Cloud conversation identifier associated with this flow instance execution data.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The division identifier for the division associated with the flow for this flow instance.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division identifier for the division associated with the flow for this flow instance.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * The end date time for this flow instance execution data.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date time for this flow instance execution data.")
  @JsonProperty("endDateTime")
  public Date getEndDateTime() {
    return endDateTime;
  }
  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }


  /**
   * The public endpoint a user can use to retrieve the full historical log from the service.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The public endpoint a user can use to retrieve the full historical log from the service.")
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  /**
   * If the flow invoked error handling, an array of errors.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory errors(List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the flow invoked error handling, an array of errors.")
  @JsonProperty("errors")
  public List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> getErrors() {
    return errors;
  }
  public void setErrors(List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> errors) {
    this.errors = errors;
  }


  /**
   * An array of execution items that describe what happened when an Architect flow action container ran such as a flow, task, state or bot.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory execution(List<V2FlowExecutionDataFlowidTopicExecution> execution) {
    this.execution = execution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of execution items that describe what happened when an Architect flow action container ran such as a flow, task, state or bot.")
  @JsonProperty("execution")
  public List<V2FlowExecutionDataFlowidTopicExecution> getExecution() {
    return execution;
  }
  public void setExecution(List<V2FlowExecutionDataFlowidTopicExecution> execution) {
    this.execution = execution;
  }


  /**
   * Provides information about why a flow ended.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory flowExitReason(String flowExitReason) {
    this.flowExitReason = flowExitReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides information about why a flow ended.")
  @JsonProperty("flowExitReason")
  public String getFlowExitReason() {
    return flowExitReason;
  }
  public void setFlowExitReason(String flowExitReason) {
    this.flowExitReason = flowExitReason;
  }


  /**
   * The flow identifier for this flow instance execution data.  This is the identifier of the flow configuration that users load up in Architect.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory flowId(String flowId) {
    this.flowId = flowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow identifier for this flow instance execution data.  This is the identifier of the flow configuration that users load up in Architect.")
  @JsonProperty("flowId")
  public String getFlowId() {
    return flowId;
  }
  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  /**
   * Whether the flow that ran for this flow instance execution data was in debug mode.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory flowIsDebug(Boolean flowIsDebug) {
    this.flowIsDebug = flowIsDebug;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the flow that ran for this flow instance execution data was in debug mode.")
  @JsonProperty("flowIsDebug")
  public Boolean getFlowIsDebug() {
    return flowIsDebug;
  }
  public void setFlowIsDebug(Boolean flowIsDebug) {
    this.flowIsDebug = flowIsDebug;
  }


  /**
   * If true, the execution items in this event have been truncated to be deliverable.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory executionItemsTruncated(Boolean executionItemsTruncated) {
    this.executionItemsTruncated = executionItemsTruncated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the execution items in this event have been truncated to be deliverable.")
  @JsonProperty("executionItemsTruncated")
  public Boolean getExecutionItemsTruncated() {
    return executionItemsTruncated;
  }
  public void setExecutionItemsTruncated(Boolean executionItemsTruncated) {
    this.executionItemsTruncated = executionItemsTruncated;
  }


  /**
   * The flow type of the Architect flow that was run.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory flowType(String flowType) {
    this.flowType = flowType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow type of the Architect flow that was run.")
  @JsonProperty("flowType")
  public String getFlowType() {
    return flowType;
  }
  public void setFlowType(String flowType) {
    this.flowType = flowType;
  }


  /**
   * The version of the flow for this flow instance execution data. Typically this is a numeric value like 1.0 represented as a string but can also be 'debug'
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory flowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the flow for this flow instance execution data. Typically this is a numeric value like 1.0 represented as a string but can also be 'debug'")
  @JsonProperty("flowVersion")
  public String getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(String flowVersion) {
    this.flowVersion = flowVersion;
  }


  /**
   * If applicable, the type of message platform from which the message originated.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If applicable, the type of message platform from which the message originated.")
  @JsonProperty("messageType")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  /**
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory invokingContext(V2FlowExecutionDataFlowidTopicInvokingContext invokingContext) {
    this.invokingContext = invokingContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("invokingContext")
  public V2FlowExecutionDataFlowidTopicInvokingContext getInvokingContext() {
    return invokingContext;
  }
  public void setInvokingContext(V2FlowExecutionDataFlowidTopicInvokingContext invokingContext) {
    this.invokingContext = invokingContext;
  }


  /**
   * The start date time for this flow instance execution data.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date time for this flow instance execution data.")
  @JsonProperty("startDateTime")
  public Date getStartDateTime() {
    return startDateTime;
  }
  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }


  /**
   * If the flow encountered a warning during execution, this is an array of the warnings.
   **/
  public V2FlowExecutionDataFlowidTopicFlowExecutionHistory warnings(List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> warnings) {
    this.warnings = warnings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the flow encountered a warning during execution, this is an array of the warnings.")
  @JsonProperty("warnings")
  public List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicFlowExecutionHistory v2FlowExecutionDataFlowidTopicFlowExecutionHistory = (V2FlowExecutionDataFlowidTopicFlowExecutionHistory) o;

    return Objects.equals(this.executionId, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.executionId) &&
            Objects.equals(this.conversationId, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.conversationId) &&
            Objects.equals(this.divisionId, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.divisionId) &&
            Objects.equals(this.endDateTime, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.endDateTime) &&
            Objects.equals(this.endpoint, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.endpoint) &&
            Objects.equals(this.errors, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.errors) &&
            Objects.equals(this.execution, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.execution) &&
            Objects.equals(this.flowExitReason, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.flowExitReason) &&
            Objects.equals(this.flowId, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.flowId) &&
            Objects.equals(this.flowIsDebug, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.flowIsDebug) &&
            Objects.equals(this.executionItemsTruncated, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.executionItemsTruncated) &&
            Objects.equals(this.flowType, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.flowType) &&
            Objects.equals(this.flowVersion, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.flowVersion) &&
            Objects.equals(this.messageType, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.messageType) &&
            Objects.equals(this.invokingContext, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.invokingContext) &&
            Objects.equals(this.startDateTime, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.startDateTime) &&
            Objects.equals(this.warnings, v2FlowExecutionDataFlowidTopicFlowExecutionHistory.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionId, conversationId, divisionId, endDateTime, endpoint, errors, execution, flowExitReason, flowId, flowIsDebug, executionItemsTruncated, flowType, flowVersion, messageType, invokingContext, startDateTime, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicFlowExecutionHistory {\n");
    
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    execution: ").append(toIndentedString(execution)).append("\n");
    sb.append("    flowExitReason: ").append(toIndentedString(flowExitReason)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowIsDebug: ").append(toIndentedString(flowIsDebug)).append("\n");
    sb.append("    executionItemsTruncated: ").append(toIndentedString(executionItemsTruncated)).append("\n");
    sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    invokingContext: ").append(toIndentedString(invokingContext)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

