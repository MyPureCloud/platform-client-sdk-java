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
 * This is a set of enabled characteristics for the loglevel
 */
@ApiModel(description = "This is a set of enabled characteristics for the loglevel")

public class FlowCharacteristics  implements Serializable {
  
  private Boolean executionItems = null;
  private Boolean executionInputOutputs = null;
  private Boolean communications = null;
  private Boolean eventError = null;
  private Boolean eventWarning = null;
  private Boolean eventOther = null;
  private Boolean variables = null;
  private Boolean names = null;

  
  /**
   * Whether to report execution data about individual actions, menus, states, tasks, etc. etc. that ran during execution of the flow.
   **/
  public FlowCharacteristics executionItems(Boolean executionItems) {
    this.executionItems = executionItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to report execution data about individual actions, menus, states, tasks, etc. etc. that ran during execution of the flow.")
  @JsonProperty("executionItems")
  public Boolean getExecutionItems() {
    return executionItems;
  }
  public void setExecutionItems(Boolean executionItems) {
    this.executionItems = executionItems;
  }


  /**
   * Whether to report input setting input setting values and output data values for individual execution items above.  For example, if you have FlowExecutionInputOutputs and a Call Data Action ran in a flow, if FlowExecutionItems was enabled you'd see the fact a Call Data Action ran and the output path it took but nothing about which Data Action it ran, the input data sent to it at flow runtime and the data returned from it.  If you enable this characteristic, execution data will contain this additional detail.
   **/
  public FlowCharacteristics executionInputOutputs(Boolean executionInputOutputs) {
    this.executionInputOutputs = executionInputOutputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to report input setting input setting values and output data values for individual execution items above.  For example, if you have FlowExecutionInputOutputs and a Call Data Action ran in a flow, if FlowExecutionItems was enabled you'd see the fact a Call Data Action ran and the output path it took but nothing about which Data Action it ran, the input data sent to it at flow runtime and the data returned from it.  If you enable this characteristic, execution data will contain this additional detail.")
  @JsonProperty("executionInputOutputs")
  public Boolean getExecutionInputOutputs() {
    return executionInputOutputs;
  }
  public void setExecutionInputOutputs(Boolean executionInputOutputs) {
    this.executionInputOutputs = executionInputOutputs;
  }


  /**
   * Communications are either audio or digital communications sent to or received from a participant.  An example here would be the initial greeting in an inbound call flow where it plays a greeting message to the participant.
   **/
  public FlowCharacteristics communications(Boolean communications) {
    this.communications = communications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Communications are either audio or digital communications sent to or received from a participant.  An example here would be the initial greeting in an inbound call flow where it plays a greeting message to the participant.")
  @JsonProperty("communications")
  public Boolean getCommunications() {
    return communications;
  }
  public void setCommunications(Boolean communications) {
    this.communications = communications;
  }


  /**
   * Whether to report flow error events.
   **/
  public FlowCharacteristics eventError(Boolean eventError) {
    this.eventError = eventError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to report flow error events.")
  @JsonProperty("eventError")
  public Boolean getEventError() {
    return eventError;
  }
  public void setEventError(Boolean eventError) {
    this.eventError = eventError;
  }


  /**
   * Whether to report flow warning events.
   **/
  public FlowCharacteristics eventWarning(Boolean eventWarning) {
    this.eventWarning = eventWarning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to report flow warning events.")
  @JsonProperty("eventWarning")
  public Boolean getEventWarning() {
    return eventWarning;
  }
  public void setEventWarning(Boolean eventWarning) {
    this.eventWarning = eventWarning;
  }


  /**
   * Whether to report events other than errors or warnings such as a language change, loop event.
   **/
  public FlowCharacteristics eventOther(Boolean eventOther) {
    this.eventOther = eventOther;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to report events other than errors or warnings such as a language change, loop event.")
  @JsonProperty("eventOther")
  public Boolean getEventOther() {
    return eventOther;
  }
  public void setEventOther(Boolean eventOther) {
    this.eventOther = eventOther;
  }


  /**
   * Whether to report assignment of values to variables in flow execution data. It's important to remember there is a difference between variable value assignments and output data from an action.  If you have a Call Digital Bot flow action in an Inbound Message flow and there is no variable bound to the Exit Reason output but FlowExecutionInputOutputs is enabled, you will still be able to see the exit reason from the digital bot flow in execution data even though it is not bound to a variable.
   **/
  public FlowCharacteristics variables(Boolean variables) {
    this.variables = variables;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to report assignment of values to variables in flow execution data. It's important to remember there is a difference between variable value assignments and output data from an action.  If you have a Call Digital Bot flow action in an Inbound Message flow and there is no variable bound to the Exit Reason output but FlowExecutionInputOutputs is enabled, you will still be able to see the exit reason from the digital bot flow in execution data even though it is not bound to a variable.")
  @JsonProperty("variables")
  public Boolean getVariables() {
    return variables;
  }
  public void setVariables(Boolean variables) {
    this.variables = variables;
  }


  /**
   * This characteristic specifies whether or not name information should be emitted in execution data such as action, task, state or even the flow name itself.  Names are very handy from a readability standpoint but they do take up additional space in flow execution data instances.
   **/
  public FlowCharacteristics names(Boolean names) {
    this.names = names;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This characteristic specifies whether or not name information should be emitted in execution data such as action, task, state or even the flow name itself.  Names are very handy from a readability standpoint but they do take up additional space in flow execution data instances.")
  @JsonProperty("names")
  public Boolean getNames() {
    return names;
  }
  public void setNames(Boolean names) {
    this.names = names;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowCharacteristics flowCharacteristics = (FlowCharacteristics) o;

    return Objects.equals(this.executionItems, flowCharacteristics.executionItems) &&
            Objects.equals(this.executionInputOutputs, flowCharacteristics.executionInputOutputs) &&
            Objects.equals(this.communications, flowCharacteristics.communications) &&
            Objects.equals(this.eventError, flowCharacteristics.eventError) &&
            Objects.equals(this.eventWarning, flowCharacteristics.eventWarning) &&
            Objects.equals(this.eventOther, flowCharacteristics.eventOther) &&
            Objects.equals(this.variables, flowCharacteristics.variables) &&
            Objects.equals(this.names, flowCharacteristics.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionItems, executionInputOutputs, communications, eventError, eventWarning, eventOther, variables, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowCharacteristics {\n");
    
    sb.append("    executionItems: ").append(toIndentedString(executionItems)).append("\n");
    sb.append("    executionInputOutputs: ").append(toIndentedString(executionInputOutputs)).append("\n");
    sb.append("    communications: ").append(toIndentedString(communications)).append("\n");
    sb.append("    eventError: ").append(toIndentedString(eventError)).append("\n");
    sb.append("    eventWarning: ").append(toIndentedString(eventWarning)).append("\n");
    sb.append("    eventOther: ").append(toIndentedString(eventOther)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

