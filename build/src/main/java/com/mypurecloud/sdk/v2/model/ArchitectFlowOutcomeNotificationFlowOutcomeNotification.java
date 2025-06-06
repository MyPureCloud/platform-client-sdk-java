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
import com.mypurecloud.sdk.v2.model.ArchitectFlowOutcomeNotificationArchitectOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArchitectFlowOutcomeNotificationFlowOutcomeNotification
 */

public class ArchitectFlowOutcomeNotificationFlowOutcomeNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private ArchitectFlowOutcomeNotificationArchitectOperation currentOperation = null;

  public ArchitectFlowOutcomeNotificationFlowOutcomeNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The flow outcome ID
   **/
  public ArchitectFlowOutcomeNotificationFlowOutcomeNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow outcome ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The flow outcome name
   **/
  public ArchitectFlowOutcomeNotificationFlowOutcomeNotification name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow outcome name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The flow outcome description
   **/
  public ArchitectFlowOutcomeNotificationFlowOutcomeNotification description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow outcome description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public ArchitectFlowOutcomeNotificationFlowOutcomeNotification currentOperation(ArchitectFlowOutcomeNotificationArchitectOperation currentOperation) {
    this.currentOperation = currentOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentOperation")
  public ArchitectFlowOutcomeNotificationArchitectOperation getCurrentOperation() {
    return currentOperation;
  }
  public void setCurrentOperation(ArchitectFlowOutcomeNotificationArchitectOperation currentOperation) {
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
    ArchitectFlowOutcomeNotificationFlowOutcomeNotification architectFlowOutcomeNotificationFlowOutcomeNotification = (ArchitectFlowOutcomeNotificationFlowOutcomeNotification) o;

    return Objects.equals(this.id, architectFlowOutcomeNotificationFlowOutcomeNotification.id) &&
            Objects.equals(this.name, architectFlowOutcomeNotificationFlowOutcomeNotification.name) &&
            Objects.equals(this.description, architectFlowOutcomeNotificationFlowOutcomeNotification.description) &&
            Objects.equals(this.currentOperation, architectFlowOutcomeNotificationFlowOutcomeNotification.currentOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, currentOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectFlowOutcomeNotificationFlowOutcomeNotification {\n");
    
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

