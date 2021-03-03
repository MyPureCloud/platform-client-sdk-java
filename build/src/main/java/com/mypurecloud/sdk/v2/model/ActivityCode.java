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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Activity code data
 */
@ApiModel(description = "Activity code data")

public class ActivityCode  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private String name = null;
  private Boolean isActive = null;
  private Boolean isDefault = null;

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
   * The activity code's category.
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
  private WfmVersionedEntityMetadata metadata = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * The name of the activity code. Default activity codes will be created with an empty name
   **/
  public ActivityCode name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the activity code. Default activity codes will be created with an empty name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Whether this activity code is active or has been deleted
   **/
  public ActivityCode isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity code is active or has been deleted")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  
  /**
   * Whether this is a default activity code
   **/
  public ActivityCode isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is a default activity code")
  @JsonProperty("isDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  
  /**
   * The activity code's category.
   **/
  public ActivityCode category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activity code's category.")
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
  public ActivityCode lengthInMinutes(Integer lengthInMinutes) {
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
  public ActivityCode countsAsPaidTime(Boolean countsAsPaidTime) {
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
   * Indicates whether or not the activity should be counted as contiguous work time for calculating daily constraints
   **/
  public ActivityCode countsAsWorkTime(Boolean countsAsWorkTime) {
    this.countsAsWorkTime = countsAsWorkTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether or not the activity should be counted as contiguous work time for calculating daily constraints")
  @JsonProperty("countsAsWorkTime")
  public Boolean getCountsAsWorkTime() {
    return countsAsWorkTime;
  }
  public void setCountsAsWorkTime(Boolean countsAsWorkTime) {
    this.countsAsWorkTime = countsAsWorkTime;
  }

  
  /**
   * Whether an agent can select this activity code when creating or editing a time off request. Null if the activity's category is not time off.
   **/
  public ActivityCode agentTimeOffSelectable(Boolean agentTimeOffSelectable) {
    this.agentTimeOffSelectable = agentTimeOffSelectable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether an agent can select this activity code when creating or editing a time off request. Null if the activity's category is not time off.")
  @JsonProperty("agentTimeOffSelectable")
  public Boolean getAgentTimeOffSelectable() {
    return agentTimeOffSelectable;
  }
  public void setAgentTimeOffSelectable(Boolean agentTimeOffSelectable) {
    this.agentTimeOffSelectable = agentTimeOffSelectable;
  }

  
  /**
   * Version metadata for the associated management unit's list of activity codes
   **/
  public ActivityCode metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the associated management unit's list of activity codes")
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
    ActivityCode activityCode = (ActivityCode) o;
    return Objects.equals(this.id, activityCode.id) &&
        Objects.equals(this.selfUri, activityCode.selfUri) &&
        Objects.equals(this.name, activityCode.name) &&
        Objects.equals(this.isActive, activityCode.isActive) &&
        Objects.equals(this.isDefault, activityCode.isDefault) &&
        Objects.equals(this.category, activityCode.category) &&
        Objects.equals(this.lengthInMinutes, activityCode.lengthInMinutes) &&
        Objects.equals(this.countsAsPaidTime, activityCode.countsAsPaidTime) &&
        Objects.equals(this.countsAsWorkTime, activityCode.countsAsWorkTime) &&
        Objects.equals(this.agentTimeOffSelectable, activityCode.agentTimeOffSelectable) &&
        Objects.equals(this.metadata, activityCode.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, name, isActive, isDefault, category, lengthInMinutes, countsAsPaidTime, countsAsWorkTime, agentTimeOffSelectable, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityCode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    countsAsWorkTime: ").append(toIndentedString(countsAsWorkTime)).append("\n");
    sb.append("    agentTimeOffSelectable: ").append(toIndentedString(agentTimeOffSelectable)).append("\n");
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

