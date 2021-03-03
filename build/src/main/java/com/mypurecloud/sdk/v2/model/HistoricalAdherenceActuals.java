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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HistoricalAdherenceActuals
 */

public class HistoricalAdherenceActuals  implements Serializable {
  

  private static class ActualActivityCategoryEnumDeserializer extends StdDeserializer<ActualActivityCategoryEnum> {
    public ActualActivityCategoryEnumDeserializer() {
      super(ActualActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ActualActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActualActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Activity in which the user is actually engaged
   */
 @JsonDeserialize(using = ActualActivityCategoryEnumDeserializer.class)
  public enum ActualActivityCategoryEnum {
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

    ActualActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActualActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ActualActivityCategoryEnum value : ActualActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActualActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActualActivityCategoryEnum actualActivityCategory = null;
  private Integer startOffsetSeconds = null;
  private Integer endOffsetSeconds = null;

  
  /**
   * Activity in which the user is actually engaged
   **/
  public HistoricalAdherenceActuals actualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activity in which the user is actually engaged")
  @JsonProperty("actualActivityCategory")
  public ActualActivityCategoryEnum getActualActivityCategory() {
    return actualActivityCategory;
  }
  public void setActualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
  }

  
  /**
   * Actual start offset in seconds relative to query start time
   **/
  public HistoricalAdherenceActuals startOffsetSeconds(Integer startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actual start offset in seconds relative to query start time")
  @JsonProperty("startOffsetSeconds")
  public Integer getStartOffsetSeconds() {
    return startOffsetSeconds;
  }
  public void setStartOffsetSeconds(Integer startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
  }

  
  /**
   * Actual end offset in seconds relative to query start time
   **/
  public HistoricalAdherenceActuals endOffsetSeconds(Integer endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actual end offset in seconds relative to query start time")
  @JsonProperty("endOffsetSeconds")
  public Integer getEndOffsetSeconds() {
    return endOffsetSeconds;
  }
  public void setEndOffsetSeconds(Integer endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalAdherenceActuals historicalAdherenceActuals = (HistoricalAdherenceActuals) o;
    return Objects.equals(this.actualActivityCategory, historicalAdherenceActuals.actualActivityCategory) &&
        Objects.equals(this.startOffsetSeconds, historicalAdherenceActuals.startOffsetSeconds) &&
        Objects.equals(this.endOffsetSeconds, historicalAdherenceActuals.endOffsetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualActivityCategory, startOffsetSeconds, endOffsetSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalAdherenceActuals {\n");
    
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
    sb.append("    startOffsetSeconds: ").append(toIndentedString(startOffsetSeconds)).append("\n");
    sb.append("    endOffsetSeconds: ").append(toIndentedString(endOffsetSeconds)).append("\n");
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

