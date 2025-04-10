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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AlternativeShiftBuSettingsResponse
 */

public class AlternativeShiftBuSettingsResponse  implements Serializable {
  

  private static class EnabledGranularitiesEnumDeserializer extends StdDeserializer<EnabledGranularitiesEnum> {
    public EnabledGranularitiesEnumDeserializer() {
      super(EnabledGranularitiesEnumDeserializer.class);
    }

    @Override
    public EnabledGranularitiesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EnabledGranularitiesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets enabledGranularities
   */
 @JsonDeserialize(using = EnabledGranularitiesEnumDeserializer.class)
  public enum EnabledGranularitiesEnum {
    DAILY("Daily");

    private String value;

    EnabledGranularitiesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EnabledGranularitiesEnum fromString(String key) {
      if (key == null) return null;

      for (EnabledGranularitiesEnum value : EnabledGranularitiesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EnabledGranularitiesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<EnabledGranularitiesEnum> enabledGranularities = null;
  private Integer minMinutesBeforeStartTime = null;

  private static class RetainedActivityCategoriesEnumDeserializer extends StdDeserializer<RetainedActivityCategoriesEnum> {
    public RetainedActivityCategoriesEnumDeserializer() {
      super(RetainedActivityCategoriesEnumDeserializer.class);
    }

    @Override
    public RetainedActivityCategoriesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RetainedActivityCategoriesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets retainedActivityCategories
   */
 @JsonDeserialize(using = RetainedActivityCategoriesEnumDeserializer.class)
  public enum RetainedActivityCategoriesEnum {
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable");

    private String value;

    RetainedActivityCategoriesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RetainedActivityCategoriesEnum fromString(String key) {
      if (key == null) return null;

      for (RetainedActivityCategoriesEnum value : RetainedActivityCategoriesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RetainedActivityCategoriesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<RetainedActivityCategoriesEnum> retainedActivityCategories = null;
  private WfmVersionedEntityMetadata metadata = null;

  public AlternativeShiftBuSettingsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      enabledGranularities = new ArrayList<EnabledGranularitiesEnum>();
      retainedActivityCategories = new ArrayList<RetainedActivityCategoriesEnum>();
    }
  }

  
  /**
   * The granularity at which alternative shifts is allowed. An empty list means Alternative Shifts is disabled
   **/
  public AlternativeShiftBuSettingsResponse enabledGranularities(List<EnabledGranularitiesEnum> enabledGranularities) {
    this.enabledGranularities = enabledGranularities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The granularity at which alternative shifts is allowed. An empty list means Alternative Shifts is disabled")
  @JsonProperty("enabledGranularities")
  public List<EnabledGranularitiesEnum> getEnabledGranularities() {
    return enabledGranularities;
  }
  public void setEnabledGranularities(List<EnabledGranularitiesEnum> enabledGranularities) {
    this.enabledGranularities = enabledGranularities;
  }


  /**
   * The minimum number of minutes before the start of a shift that an alternative shift can be automatically approved
   **/
  public AlternativeShiftBuSettingsResponse minMinutesBeforeStartTime(Integer minMinutesBeforeStartTime) {
    this.minMinutesBeforeStartTime = minMinutesBeforeStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum number of minutes before the start of a shift that an alternative shift can be automatically approved")
  @JsonProperty("minMinutesBeforeStartTime")
  public Integer getMinMinutesBeforeStartTime() {
    return minMinutesBeforeStartTime;
  }
  public void setMinMinutesBeforeStartTime(Integer minMinutesBeforeStartTime) {
    this.minMinutesBeforeStartTime = minMinutesBeforeStartTime;
  }


  /**
   * Categories of activities that are required to remain at the same time slot for the alternative shifts offered. An empty list represents no retained activities
   **/
  public AlternativeShiftBuSettingsResponse retainedActivityCategories(List<RetainedActivityCategoriesEnum> retainedActivityCategories) {
    this.retainedActivityCategories = retainedActivityCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Categories of activities that are required to remain at the same time slot for the alternative shifts offered. An empty list represents no retained activities")
  @JsonProperty("retainedActivityCategories")
  public List<RetainedActivityCategoriesEnum> getRetainedActivityCategories() {
    return retainedActivityCategories;
  }
  public void setRetainedActivityCategories(List<RetainedActivityCategoriesEnum> retainedActivityCategories) {
    this.retainedActivityCategories = retainedActivityCategories;
  }


  /**
   * Version metadata for this business unit's alternative shift settings
   **/
  public AlternativeShiftBuSettingsResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this business unit's alternative shift settings")
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
    AlternativeShiftBuSettingsResponse alternativeShiftBuSettingsResponse = (AlternativeShiftBuSettingsResponse) o;

    return Objects.equals(this.enabledGranularities, alternativeShiftBuSettingsResponse.enabledGranularities) &&
            Objects.equals(this.minMinutesBeforeStartTime, alternativeShiftBuSettingsResponse.minMinutesBeforeStartTime) &&
            Objects.equals(this.retainedActivityCategories, alternativeShiftBuSettingsResponse.retainedActivityCategories) &&
            Objects.equals(this.metadata, alternativeShiftBuSettingsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledGranularities, minMinutesBeforeStartTime, retainedActivityCategories, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeShiftBuSettingsResponse {\n");
    
    sb.append("    enabledGranularities: ").append(toIndentedString(enabledGranularities)).append("\n");
    sb.append("    minMinutesBeforeStartTime: ").append(toIndentedString(minMinutesBeforeStartTime)).append("\n");
    sb.append("    retainedActivityCategories: ").append(toIndentedString(retainedActivityCategories)).append("\n");
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

