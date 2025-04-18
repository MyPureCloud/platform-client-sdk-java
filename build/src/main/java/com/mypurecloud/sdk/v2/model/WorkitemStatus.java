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
import com.mypurecloud.sdk.v2.model.WorkitemStatusReference;
import com.mypurecloud.sdk.v2.model.WorktypeReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkitemStatus
 */

public class WorkitemStatus  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class CategoryEnumDeserializer extends StdDeserializer<CategoryEnum> {
    public CategoryEnumDeserializer() {
      super(CategoryEnumDeserializer.class);
    }

    @Override
    public CategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Category of the Status.
   */
 @JsonDeserialize(using = CategoryEnumDeserializer.class)
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    WAITING("Waiting"),
    CLOSED("Closed"),
    UNKNOWN("Unknown");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private List<WorkitemStatusReference> destinationStatuses = null;
  private String description = null;
  private WorkitemStatusReference defaultDestinationStatus = null;
  private Integer statusTransitionDelaySeconds = null;
  private String statusTransitionTime = null;
  private WorktypeReference worktype = null;
  private Boolean autoTerminateWorkitem = null;
  private String selfUri = null;

  public WorkitemStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      destinationStatuses = new ArrayList<WorkitemStatusReference>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public WorkitemStatus name(String name) {
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
   * The Category of the Status.
   **/
  public WorkitemStatus category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Category of the Status.")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   * The Statuses the Status can transition to.
   **/
  public WorkitemStatus destinationStatuses(List<WorkitemStatusReference> destinationStatuses) {
    this.destinationStatuses = destinationStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Statuses the Status can transition to.")
  @JsonProperty("destinationStatuses")
  public List<WorkitemStatusReference> getDestinationStatuses() {
    return destinationStatuses;
  }
  public void setDestinationStatuses(List<WorkitemStatusReference> destinationStatuses) {
    this.destinationStatuses = destinationStatuses;
  }


  /**
   * The description of the Status.
   **/
  public WorkitemStatus description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Status.")
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
  public WorkitemStatus defaultDestinationStatus(WorkitemStatusReference defaultDestinationStatus) {
    this.defaultDestinationStatus = defaultDestinationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default destination status to which this Status will transition to if auto status transition enabled.")
  @JsonProperty("defaultDestinationStatus")
  public WorkitemStatusReference getDefaultDestinationStatus() {
    return defaultDestinationStatus;
  }
  public void setDefaultDestinationStatus(WorkitemStatusReference defaultDestinationStatus) {
    this.defaultDestinationStatus = defaultDestinationStatus;
  }


  /**
   * Delay in seconds for auto status transition
   **/
  public WorkitemStatus statusTransitionDelaySeconds(Integer statusTransitionDelaySeconds) {
    this.statusTransitionDelaySeconds = statusTransitionDelaySeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Delay in seconds for auto status transition")
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
  public WorkitemStatus statusTransitionTime(String statusTransitionTime) {
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
   * The Worktype containing the Status.
   **/
  public WorkitemStatus worktype(WorktypeReference worktype) {
    this.worktype = worktype;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Worktype containing the Status.")
  @JsonProperty("worktype")
  public WorktypeReference getWorktype() {
    return worktype;
  }
  public void setWorktype(WorktypeReference worktype) {
    this.worktype = worktype;
  }


  /**
   * Terminate workitem on selection of status. Applicable only for statuses in the Closed category.
   **/
  public WorkitemStatus autoTerminateWorkitem(Boolean autoTerminateWorkitem) {
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
    WorkitemStatus workitemStatus = (WorkitemStatus) o;

    return Objects.equals(this.id, workitemStatus.id) &&
            Objects.equals(this.name, workitemStatus.name) &&
            Objects.equals(this.category, workitemStatus.category) &&
            Objects.equals(this.destinationStatuses, workitemStatus.destinationStatuses) &&
            Objects.equals(this.description, workitemStatus.description) &&
            Objects.equals(this.defaultDestinationStatus, workitemStatus.defaultDestinationStatus) &&
            Objects.equals(this.statusTransitionDelaySeconds, workitemStatus.statusTransitionDelaySeconds) &&
            Objects.equals(this.statusTransitionTime, workitemStatus.statusTransitionTime) &&
            Objects.equals(this.worktype, workitemStatus.worktype) &&
            Objects.equals(this.autoTerminateWorkitem, workitemStatus.autoTerminateWorkitem) &&
            Objects.equals(this.selfUri, workitemStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, destinationStatuses, description, defaultDestinationStatus, statusTransitionDelaySeconds, statusTransitionTime, worktype, autoTerminateWorkitem, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    destinationStatuses: ").append(toIndentedString(destinationStatuses)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultDestinationStatus: ").append(toIndentedString(defaultDestinationStatus)).append("\n");
    sb.append("    statusTransitionDelaySeconds: ").append(toIndentedString(statusTransitionDelaySeconds)).append("\n");
    sb.append("    statusTransitionTime: ").append(toIndentedString(statusTransitionTime)).append("\n");
    sb.append("    worktype: ").append(toIndentedString(worktype)).append("\n");
    sb.append("    autoTerminateWorkitem: ").append(toIndentedString(autoTerminateWorkitem)).append("\n");
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

