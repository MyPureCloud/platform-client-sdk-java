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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * This contains information about the workitem that invoked this flow execution.
 */
@ApiModel(description = "This contains information about the workitem that invoked this flow execution.")

public class V2FlowExecutionDataFlowidTopicWorkitem  implements Serializable {
  
  private String workitemId = null;
  private String workitemName = null;

  
  /**
   * The identifier of the workitem that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicWorkitem workitemId(String workitemId) {
    this.workitemId = workitemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the workitem that invoked this flow.")
  @JsonProperty("workitemId")
  public String getWorkitemId() {
    return workitemId;
  }
  public void setWorkitemId(String workitemId) {
    this.workitemId = workitemId;
  }


  /**
   * The name of the process workitem that invoked this flow.
   **/
  public V2FlowExecutionDataFlowidTopicWorkitem workitemName(String workitemName) {
    this.workitemName = workitemName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the process workitem that invoked this flow.")
  @JsonProperty("workitemName")
  public String getWorkitemName() {
    return workitemName;
  }
  public void setWorkitemName(String workitemName) {
    this.workitemName = workitemName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2FlowExecutionDataFlowidTopicWorkitem v2FlowExecutionDataFlowidTopicWorkitem = (V2FlowExecutionDataFlowidTopicWorkitem) o;

    return Objects.equals(this.workitemId, v2FlowExecutionDataFlowidTopicWorkitem.workitemId) &&
            Objects.equals(this.workitemName, v2FlowExecutionDataFlowidTopicWorkitem.workitemName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workitemId, workitemName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2FlowExecutionDataFlowidTopicWorkitem {\n");
    
    sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
    sb.append("    workitemName: ").append(toIndentedString(workitemName)).append("\n");
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

