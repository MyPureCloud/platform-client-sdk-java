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
import com.mypurecloud.sdk.v2.model.ListWrapperSecondaryPresence;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateActivityCodeRequest
 */

public class UpdateActivityCodeRequest  implements Serializable {
  
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
   * The activity code's category. Attempting to change the category of a default activity code will return an error
   */
 @JsonDeserialize(using = CategoryEnumDeserializer.class)
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

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
  private Integer lengthInMinutes = null;
  private Boolean countsAsPaidTime = null;
  private Boolean countsAsWorkTime = null;
  private Boolean agentTimeOffSelectable = null;
  private Boolean countsTowardShrinkage = null;
  private Boolean plannedShrinkage = null;
  private Boolean interruptible = null;
  private ListWrapperSecondaryPresence secondaryPresences = null;
  private WfmVersionedEntityMetadata metadata = null;

  public UpdateActivityCodeRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the activity code
   **/
  public UpdateActivityCodeRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the activity code")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The activity code's category. Attempting to change the category of a default activity code will return an error
   **/
  public UpdateActivityCodeRequest category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activity code's category. Attempting to change the category of a default activity code will return an error")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   * The default length of the activity in minutes
   **/
  public UpdateActivityCodeRequest lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default length of the activity in minutes")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   * Whether an agent is paid while performing this activity
   **/
  public UpdateActivityCodeRequest countsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether an agent is paid while performing this activity")
  @JsonProperty("countsAsPaidTime")
  public Boolean getCountsAsPaidTime() {
    return countsAsPaidTime;
  }
  public void setCountsAsPaidTime(Boolean countsAsPaidTime) {
    this.countsAsPaidTime = countsAsPaidTime;
  }


  /**
   * Indicates whether or not the activity should be counted as work time
   **/
  public UpdateActivityCodeRequest countsAsWorkTime(Boolean countsAsWorkTime) {
    this.countsAsWorkTime = countsAsWorkTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not the activity should be counted as work time")
  @JsonProperty("countsAsWorkTime")
  public Boolean getCountsAsWorkTime() {
    return countsAsWorkTime;
  }
  public void setCountsAsWorkTime(Boolean countsAsWorkTime) {
    this.countsAsWorkTime = countsAsWorkTime;
  }


  /**
   * Whether an agent can select this activity code when creating or editing a time off request
   **/
  public UpdateActivityCodeRequest agentTimeOffSelectable(Boolean agentTimeOffSelectable) {
    this.agentTimeOffSelectable = agentTimeOffSelectable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether an agent can select this activity code when creating or editing a time off request")
  @JsonProperty("agentTimeOffSelectable")
  public Boolean getAgentTimeOffSelectable() {
    return agentTimeOffSelectable;
  }
  public void setAgentTimeOffSelectable(Boolean agentTimeOffSelectable) {
    this.agentTimeOffSelectable = agentTimeOffSelectable;
  }


  /**
   * Whether or not this activity code counts toward shrinkage calculations
   **/
  public UpdateActivityCodeRequest countsTowardShrinkage(Boolean countsTowardShrinkage) {
    this.countsTowardShrinkage = countsTowardShrinkage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not this activity code counts toward shrinkage calculations")
  @JsonProperty("countsTowardShrinkage")
  public Boolean getCountsTowardShrinkage() {
    return countsTowardShrinkage;
  }
  public void setCountsTowardShrinkage(Boolean countsTowardShrinkage) {
    this.countsTowardShrinkage = countsTowardShrinkage;
  }


  /**
   * Whether this activity code is considered planned or unplanned shrinkage
   **/
  public UpdateActivityCodeRequest plannedShrinkage(Boolean plannedShrinkage) {
    this.plannedShrinkage = plannedShrinkage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity code is considered planned or unplanned shrinkage")
  @JsonProperty("plannedShrinkage")
  public Boolean getPlannedShrinkage() {
    return plannedShrinkage;
  }
  public void setPlannedShrinkage(Boolean plannedShrinkage) {
    this.plannedShrinkage = plannedShrinkage;
  }


  /**
   * Whether this activity code is considered interruptible
   **/
  public UpdateActivityCodeRequest interruptible(Boolean interruptible) {
    this.interruptible = interruptible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity code is considered interruptible")
  @JsonProperty("interruptible")
  public Boolean getInterruptible() {
    return interruptible;
  }
  public void setInterruptible(Boolean interruptible) {
    this.interruptible = interruptible;
  }


  /**
   * The secondary presences of this activity code
   **/
  public UpdateActivityCodeRequest secondaryPresences(ListWrapperSecondaryPresence secondaryPresences) {
    this.secondaryPresences = secondaryPresences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The secondary presences of this activity code")
  @JsonProperty("secondaryPresences")
  public ListWrapperSecondaryPresence getSecondaryPresences() {
    return secondaryPresences;
  }
  public void setSecondaryPresences(ListWrapperSecondaryPresence secondaryPresences) {
    this.secondaryPresences = secondaryPresences;
  }


  /**
   * Version metadata for the associated business unit's list of activity codes
   **/
  public UpdateActivityCodeRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the associated business unit's list of activity codes")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateActivityCodeRequest updateActivityCodeRequest = (UpdateActivityCodeRequest) o;

    return Objects.equals(this.name, updateActivityCodeRequest.name) &&
            Objects.equals(this.category, updateActivityCodeRequest.category) &&
            Objects.equals(this.lengthInMinutes, updateActivityCodeRequest.lengthInMinutes) &&
            Objects.equals(this.countsAsPaidTime, updateActivityCodeRequest.countsAsPaidTime) &&
            Objects.equals(this.countsAsWorkTime, updateActivityCodeRequest.countsAsWorkTime) &&
            Objects.equals(this.agentTimeOffSelectable, updateActivityCodeRequest.agentTimeOffSelectable) &&
            Objects.equals(this.countsTowardShrinkage, updateActivityCodeRequest.countsTowardShrinkage) &&
            Objects.equals(this.plannedShrinkage, updateActivityCodeRequest.plannedShrinkage) &&
            Objects.equals(this.interruptible, updateActivityCodeRequest.interruptible) &&
            Objects.equals(this.secondaryPresences, updateActivityCodeRequest.secondaryPresences) &&
            Objects.equals(this.metadata, updateActivityCodeRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, lengthInMinutes, countsAsPaidTime, countsAsWorkTime, agentTimeOffSelectable, countsTowardShrinkage, plannedShrinkage, interruptible, secondaryPresences, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateActivityCodeRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    countsAsWorkTime: ").append(toIndentedString(countsAsWorkTime)).append("\n");
    sb.append("    agentTimeOffSelectable: ").append(toIndentedString(agentTimeOffSelectable)).append("\n");
    sb.append("    countsTowardShrinkage: ").append(toIndentedString(countsTowardShrinkage)).append("\n");
    sb.append("    plannedShrinkage: ").append(toIndentedString(plannedShrinkage)).append("\n");
    sb.append("    interruptible: ").append(toIndentedString(interruptible)).append("\n");
    sb.append("    secondaryPresences: ").append(toIndentedString(secondaryPresences)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

