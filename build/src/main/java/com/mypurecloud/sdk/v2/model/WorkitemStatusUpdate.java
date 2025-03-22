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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkitemStatusUpdate
 */

public class WorkitemStatusUpdate  implements Serializable {
  
  private String name = null;
  private List<String> destinationStatusIds = new ArrayList<String>();
  private String description = null;
  private String defaultDestinationStatusId = null;
  private Integer statusTransitionDelaySeconds = null;
  private String statusTransitionTime = null;
  private Boolean autoTerminateWorkitem = null;

  
  /**
   * The name of the Status. Valid length between 3 and 256 characters.
   **/
  public WorkitemStatusUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Status. Valid length between 3 and 256 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * A list of destination Statuses where a Workitem with this Status can transition to. If the list is empty Workitems with this Status can transition to all other Statuses defined on the Worktype. A Status can have a maximum of 24 destinations.
   **/
  public WorkitemStatusUpdate destinationStatusIds(List<String> destinationStatusIds) {
    this.destinationStatusIds = destinationStatusIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of destination Statuses where a Workitem with this Status can transition to. If the list is empty Workitems with this Status can transition to all other Statuses defined on the Worktype. A Status can have a maximum of 24 destinations.")
  @JsonProperty("destinationStatusIds")
  public List<String> getDestinationStatusIds() {
    return destinationStatusIds;
  }
  public void setDestinationStatusIds(List<String> destinationStatusIds) {
    this.destinationStatusIds = destinationStatusIds;
  }


  /**
   * The description of the Status. Maximum length of 512 characters.
   **/
  public WorkitemStatusUpdate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Status. Maximum length of 512 characters.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Default destination status to which this Status will transition to if auto status transition enabled.
   **/
  public WorkitemStatusUpdate defaultDestinationStatusId(String defaultDestinationStatusId) {
    this.defaultDestinationStatusId = defaultDestinationStatusId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default destination status to which this Status will transition to if auto status transition enabled.")
  @JsonProperty("defaultDestinationStatusId")
  public String getDefaultDestinationStatusId() {
    return defaultDestinationStatusId;
  }
  public void setDefaultDestinationStatusId(String defaultDestinationStatusId) {
    this.defaultDestinationStatusId = defaultDestinationStatusId;
  }


  /**
   * Delay in seconds for auto status transition. Required if defaultDestinationStatusId is provided.
   **/
  public WorkitemStatusUpdate statusTransitionDelaySeconds(Integer statusTransitionDelaySeconds) {
    this.statusTransitionDelaySeconds = statusTransitionDelaySeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Delay in seconds for auto status transition. Required if defaultDestinationStatusId is provided.")
  @JsonProperty("statusTransitionDelaySeconds")
  public Integer getStatusTransitionDelaySeconds() {
    return statusTransitionDelaySeconds;
  }
  public void setStatusTransitionDelaySeconds(Integer statusTransitionDelaySeconds) {
    this.statusTransitionDelaySeconds = statusTransitionDelaySeconds;
  }


  /**
   * Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS
   **/
  public WorkitemStatusUpdate statusTransitionTime(String statusTransitionTime) {
    this.statusTransitionTime = statusTransitionTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS")
  @JsonProperty("statusTransitionTime")
  public String getStatusTransitionTime() {
    return statusTransitionTime;
  }
  public void setStatusTransitionTime(String statusTransitionTime) {
    this.statusTransitionTime = statusTransitionTime;
  }


  /**
   * Terminate workitem on selection of status. Applicable only for statuses in the Closed category.
   **/
  public WorkitemStatusUpdate autoTerminateWorkitem(Boolean autoTerminateWorkitem) {
    this.autoTerminateWorkitem = autoTerminateWorkitem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Terminate workitem on selection of status. Applicable only for statuses in the Closed category.")
  @JsonProperty("autoTerminateWorkitem")
  public Boolean getAutoTerminateWorkitem() {
    return autoTerminateWorkitem;
  }
  public void setAutoTerminateWorkitem(Boolean autoTerminateWorkitem) {
    this.autoTerminateWorkitem = autoTerminateWorkitem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemStatusUpdate workitemStatusUpdate = (WorkitemStatusUpdate) o;

    return Objects.equals(this.name, workitemStatusUpdate.name) &&
            Objects.equals(this.destinationStatusIds, workitemStatusUpdate.destinationStatusIds) &&
            Objects.equals(this.description, workitemStatusUpdate.description) &&
            Objects.equals(this.defaultDestinationStatusId, workitemStatusUpdate.defaultDestinationStatusId) &&
            Objects.equals(this.statusTransitionDelaySeconds, workitemStatusUpdate.statusTransitionDelaySeconds) &&
            Objects.equals(this.statusTransitionTime, workitemStatusUpdate.statusTransitionTime) &&
            Objects.equals(this.autoTerminateWorkitem, workitemStatusUpdate.autoTerminateWorkitem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, destinationStatusIds, description, defaultDestinationStatusId, statusTransitionDelaySeconds, statusTransitionTime, autoTerminateWorkitem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemStatusUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationStatusIds: ").append(toIndentedString(destinationStatusIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultDestinationStatusId: ").append(toIndentedString(defaultDestinationStatusId)).append("\n");
    sb.append("    statusTransitionDelaySeconds: ").append(toIndentedString(statusTransitionDelaySeconds)).append("\n");
    sb.append("    statusTransitionTime: ").append(toIndentedString(statusTransitionTime)).append("\n");
    sb.append("    autoTerminateWorkitem: ").append(toIndentedString(autoTerminateWorkitem)).append("\n");
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

