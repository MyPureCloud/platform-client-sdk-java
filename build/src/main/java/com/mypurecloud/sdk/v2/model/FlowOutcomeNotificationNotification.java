package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.PromptNotificationNotificationCurrentOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowOutcomeNotificationNotification
 */

public class FlowOutcomeNotificationNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private PromptNotificationNotificationCurrentOperation currentOperation = null;

  
  /**
   **/
  public FlowOutcomeNotificationNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public FlowOutcomeNotificationNotification name(String name) {
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
   **/
  public FlowOutcomeNotificationNotification description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public FlowOutcomeNotificationNotification currentOperation(PromptNotificationNotificationCurrentOperation currentOperation) {
    this.currentOperation = currentOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentOperation")
  public PromptNotificationNotificationCurrentOperation getCurrentOperation() {
    return currentOperation;
  }
  public void setCurrentOperation(PromptNotificationNotificationCurrentOperation currentOperation) {
    this.currentOperation = currentOperation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowOutcomeNotificationNotification flowOutcomeNotificationNotification = (FlowOutcomeNotificationNotification) o;
    return Objects.equals(this.id, flowOutcomeNotificationNotification.id) &&
        Objects.equals(this.name, flowOutcomeNotificationNotification.name) &&
        Objects.equals(this.description, flowOutcomeNotificationNotification.description) &&
        Objects.equals(this.currentOperation, flowOutcomeNotificationNotification.currentOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, currentOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowOutcomeNotificationNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currentOperation: ").append(toIndentedString(currentOperation)).append("\n");
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

