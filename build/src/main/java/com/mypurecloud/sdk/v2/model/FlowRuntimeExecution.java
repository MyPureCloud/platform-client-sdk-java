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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Details about the current state of a Flow execution
 */
@ApiModel(description = "Details about the current state of a Flow execution")

public class FlowRuntimeExecution  implements Serializable {
  
  private String id = null;
  private String name = null;
  private FlowVersion flowVersion = null;
  private Date dateLaunched = null;

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
   * The flow's running status, which indicates whether the flow is running normally or completed, etc.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    RUNNING("RUNNING"),
    ERROR("ERROR"),
    TERMINATED("TERMINATED"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED");

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
  private Date dateCompleted = null;
  private String completionReason = null;
  private ErrorBody flowErrorInfo = null;
  private Map<String, Object> outputData = null;
  private DomainEntityRef conversation = null;
  private String selfUri = null;

  
  /**
   * The flow execution ID
   **/
  public FlowRuntimeExecution id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow execution ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The flow execution name.
   **/
  public FlowRuntimeExecution name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow execution name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The Version of the flow definition of the flow execution.
   **/
  public FlowRuntimeExecution flowVersion(FlowVersion flowVersion) {
    this.flowVersion = flowVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Version of the flow definition of the flow execution.")
  @JsonProperty("flowVersion")
  public FlowVersion getFlowVersion() {
    return flowVersion;
  }
  public void setFlowVersion(FlowVersion flowVersion) {
    this.flowVersion = flowVersion;
  }

  
  /**
   * The time the flow was launched. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FlowRuntimeExecution dateLaunched(Date dateLaunched) {
    this.dateLaunched = dateLaunched;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time the flow was launched. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLaunched")
  public Date getDateLaunched() {
    return dateLaunched;
  }
  public void setDateLaunched(Date dateLaunched) {
    this.dateLaunched = dateLaunched;
  }

  
  /**
   * The flow's running status, which indicates whether the flow is running normally or completed, etc.
   **/
  public FlowRuntimeExecution status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flow's running status, which indicates whether the flow is running normally or completed, etc.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The time the flow completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FlowRuntimeExecution dateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the flow completed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(Date dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  
  /**
   * The completion reason set at the flow completion time, if applicable.
   **/
  public FlowRuntimeExecution completionReason(String completionReason) {
    this.completionReason = completionReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The completion reason set at the flow completion time, if applicable.")
  @JsonProperty("completionReason")
  public String getCompletionReason() {
    return completionReason;
  }
  public void setCompletionReason(String completionReason) {
    this.completionReason = completionReason;
  }

  
  /**
   * Additional information if the flow is in error
   **/
  public FlowRuntimeExecution flowErrorInfo(ErrorBody flowErrorInfo) {
    this.flowErrorInfo = flowErrorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional information if the flow is in error")
  @JsonProperty("flowErrorInfo")
  public ErrorBody getFlowErrorInfo() {
    return flowErrorInfo;
  }
  public void setFlowErrorInfo(ErrorBody flowErrorInfo) {
    this.flowErrorInfo = flowErrorInfo;
  }

  
  /**
   * List of the flow's output variables, if any. Output variables are only supplied for Completed flows.
   **/
  public FlowRuntimeExecution outputData(Map<String, Object> outputData) {
    this.outputData = outputData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of the flow's output variables, if any. Output variables are only supplied for Completed flows.")
  @JsonProperty("outputData")
  public Map<String, Object> getOutputData() {
    return outputData;
  }
  public void setOutputData(Map<String, Object> outputData) {
    this.outputData = outputData;
  }

  
  /**
   * The conversation to which this Flow execution is related
   **/
  public FlowRuntimeExecution conversation(DomainEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation to which this Flow execution is related")
  @JsonProperty("conversation")
  public DomainEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(DomainEntityRef conversation) {
    this.conversation = conversation;
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
    FlowRuntimeExecution flowRuntimeExecution = (FlowRuntimeExecution) o;
    return Objects.equals(this.id, flowRuntimeExecution.id) &&
        Objects.equals(this.name, flowRuntimeExecution.name) &&
        Objects.equals(this.flowVersion, flowRuntimeExecution.flowVersion) &&
        Objects.equals(this.dateLaunched, flowRuntimeExecution.dateLaunched) &&
        Objects.equals(this.status, flowRuntimeExecution.status) &&
        Objects.equals(this.dateCompleted, flowRuntimeExecution.dateCompleted) &&
        Objects.equals(this.completionReason, flowRuntimeExecution.completionReason) &&
        Objects.equals(this.flowErrorInfo, flowRuntimeExecution.flowErrorInfo) &&
        Objects.equals(this.outputData, flowRuntimeExecution.outputData) &&
        Objects.equals(this.conversation, flowRuntimeExecution.conversation) &&
        Objects.equals(this.selfUri, flowRuntimeExecution.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, flowVersion, dateLaunched, status, dateCompleted, completionReason, flowErrorInfo, outputData, conversation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowRuntimeExecution {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowVersion: ").append(toIndentedString(flowVersion)).append("\n");
    sb.append("    dateLaunched: ").append(toIndentedString(dateLaunched)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    completionReason: ").append(toIndentedString(completionReason)).append("\n");
    sb.append("    flowErrorInfo: ").append(toIndentedString(flowErrorInfo)).append("\n");
    sb.append("    outputData: ").append(toIndentedString(outputData)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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

