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
import com.mypurecloud.sdk.v2.model.ListWrapperString;
import com.mypurecloud.sdk.v2.model.ValueWrapperActivityCodeStyle;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkUpdateActivityCodeRequestItem
 */

public class BulkUpdateActivityCodeRequestItem  implements Serializable {
  
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
    UNAVAILABLE("Unavailable");

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
  private ListWrapperString planningGroupIds = null;
  private ValueWrapperActivityCodeStyle style = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String id = null;

  public BulkUpdateActivityCodeRequestItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BulkUpdateActivityCodeRequestItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the activity code
   **/
  public BulkUpdateActivityCodeRequestItem name(String name) {
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
  public BulkUpdateActivityCodeRequestItem category(CategoryEnum category) {
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
  public BulkUpdateActivityCodeRequestItem lengthInMinutes(Integer lengthInMinutes) {
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
  public BulkUpdateActivityCodeRequestItem countsAsPaidTime(Boolean countsAsPaidTime) {
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
  public BulkUpdateActivityCodeRequestItem countsAsWorkTime(Boolean countsAsWorkTime) {
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
  public BulkUpdateActivityCodeRequestItem agentTimeOffSelectable(Boolean agentTimeOffSelectable) {
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
  public BulkUpdateActivityCodeRequestItem countsTowardShrinkage(Boolean countsTowardShrinkage) {
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
  public BulkUpdateActivityCodeRequestItem plannedShrinkage(Boolean plannedShrinkage) {
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
  public BulkUpdateActivityCodeRequestItem interruptible(Boolean interruptible) {
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
   * The planning group IDs associated with this activity code
   **/
  public BulkUpdateActivityCodeRequestItem planningGroupIds(ListWrapperString planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The planning group IDs associated with this activity code")
  @JsonProperty("planningGroupIds")
  public ListWrapperString getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(ListWrapperString planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }


  /**
   * The style configuration for the activity code
   **/
  public BulkUpdateActivityCodeRequestItem style(ValueWrapperActivityCodeStyle style) {
    this.style = style;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The style configuration for the activity code")
  @JsonProperty("style")
  public ValueWrapperActivityCodeStyle getStyle() {
    return style;
  }
  public void setStyle(ValueWrapperActivityCodeStyle style) {
    this.style = style;
  }


  /**
   * Version metadata for the associated business unit's list of activity codes
   **/
  public BulkUpdateActivityCodeRequestItem metadata(WfmVersionedEntityMetadata metadata) {
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


  /**
   * The ID of the activity code
   **/
  public BulkUpdateActivityCodeRequestItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUpdateActivityCodeRequestItem bulkUpdateActivityCodeRequestItem = (BulkUpdateActivityCodeRequestItem) o;

    return Objects.equals(this.name, bulkUpdateActivityCodeRequestItem.name) &&
            Objects.equals(this.category, bulkUpdateActivityCodeRequestItem.category) &&
            Objects.equals(this.lengthInMinutes, bulkUpdateActivityCodeRequestItem.lengthInMinutes) &&
            Objects.equals(this.countsAsPaidTime, bulkUpdateActivityCodeRequestItem.countsAsPaidTime) &&
            Objects.equals(this.countsAsWorkTime, bulkUpdateActivityCodeRequestItem.countsAsWorkTime) &&
            Objects.equals(this.agentTimeOffSelectable, bulkUpdateActivityCodeRequestItem.agentTimeOffSelectable) &&
            Objects.equals(this.countsTowardShrinkage, bulkUpdateActivityCodeRequestItem.countsTowardShrinkage) &&
            Objects.equals(this.plannedShrinkage, bulkUpdateActivityCodeRequestItem.plannedShrinkage) &&
            Objects.equals(this.interruptible, bulkUpdateActivityCodeRequestItem.interruptible) &&
            Objects.equals(this.planningGroupIds, bulkUpdateActivityCodeRequestItem.planningGroupIds) &&
            Objects.equals(this.style, bulkUpdateActivityCodeRequestItem.style) &&
            Objects.equals(this.metadata, bulkUpdateActivityCodeRequestItem.metadata) &&
            Objects.equals(this.id, bulkUpdateActivityCodeRequestItem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, lengthInMinutes, countsAsPaidTime, countsAsWorkTime, agentTimeOffSelectable, countsTowardShrinkage, plannedShrinkage, interruptible, planningGroupIds, style, metadata, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpdateActivityCodeRequestItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    countsAsWorkTime: ").append(toIndentedString(countsAsWorkTime)).append("\n");
    sb.append("    agentTimeOffSelectable: ").append(toIndentedString(agentTimeOffSelectable)).append("\n");
    sb.append("    countsTowardShrinkage: ").append(toIndentedString(countsTowardShrinkage)).append("\n");
    sb.append("    plannedShrinkage: ").append(toIndentedString(plannedShrinkage)).append("\n");
    sb.append("    interruptible: ").append(toIndentedString(interruptible)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

