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

public class BusinessUnitActivityCode  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean active = null;
  private Boolean defaultCode = null;

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
   * The category of the activity code
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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public BusinessUnitActivityCode name(String name) {
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
   * Whether this activity code is active or has been deleted
   **/
  public BusinessUnitActivityCode active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity code is active or has been deleted")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * Whether this is a default activity code
   **/
  public BusinessUnitActivityCode defaultCode(Boolean defaultCode) {
    this.defaultCode = defaultCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this is a default activity code")
  @JsonProperty("defaultCode")
  public Boolean getDefaultCode() {
    return defaultCode;
  }
  public void setDefaultCode(Boolean defaultCode) {
    this.defaultCode = defaultCode;
  }

  
  /**
   * The category of the activity code
   **/
  public BusinessUnitActivityCode category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of the activity code")
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
  public BusinessUnitActivityCode lengthInMinutes(Integer lengthInMinutes) {
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
  public BusinessUnitActivityCode countsAsPaidTime(Boolean countsAsPaidTime) {
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
  public BusinessUnitActivityCode countsAsWorkTime(Boolean countsAsWorkTime) {
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
  public BusinessUnitActivityCode agentTimeOffSelectable(Boolean agentTimeOffSelectable) {
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
   * Version metadata of this activity code
   **/
  public BusinessUnitActivityCode metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata of this activity code")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
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
    BusinessUnitActivityCode businessUnitActivityCode = (BusinessUnitActivityCode) o;
    return Objects.equals(this.id, businessUnitActivityCode.id) &&
        Objects.equals(this.name, businessUnitActivityCode.name) &&
        Objects.equals(this.active, businessUnitActivityCode.active) &&
        Objects.equals(this.defaultCode, businessUnitActivityCode.defaultCode) &&
        Objects.equals(this.category, businessUnitActivityCode.category) &&
        Objects.equals(this.lengthInMinutes, businessUnitActivityCode.lengthInMinutes) &&
        Objects.equals(this.countsAsPaidTime, businessUnitActivityCode.countsAsPaidTime) &&
        Objects.equals(this.countsAsWorkTime, businessUnitActivityCode.countsAsWorkTime) &&
        Objects.equals(this.agentTimeOffSelectable, businessUnitActivityCode.agentTimeOffSelectable) &&
        Objects.equals(this.metadata, businessUnitActivityCode.metadata) &&
        Objects.equals(this.selfUri, businessUnitActivityCode.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, defaultCode, category, lengthInMinutes, countsAsPaidTime, countsAsWorkTime, agentTimeOffSelectable, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessUnitActivityCode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    defaultCode: ").append(toIndentedString(defaultCode)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    countsAsPaidTime: ").append(toIndentedString(countsAsPaidTime)).append("\n");
    sb.append("    countsAsWorkTime: ").append(toIndentedString(countsAsWorkTime)).append("\n");
    sb.append("    agentTimeOffSelectable: ").append(toIndentedString(agentTimeOffSelectable)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

