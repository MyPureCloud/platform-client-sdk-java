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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * the schedule pattern
 */
@ApiModel(description = "the schedule pattern")

public class DialerSequenceScheduleConfigChangeRecurrencePattern  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily"),
    WEEKLY("Weekly");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Integer interval = null;
  private List<String> daysOfWeek = new ArrayList<String>();
  private Map<String, Object> additionalProperties = null;

  
  /**
   **/
  public DialerSequenceScheduleConfigChangeRecurrencePattern type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * the amount of time in between occurrences
   **/
  public DialerSequenceScheduleConfigChangeRecurrencePattern interval(Integer interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the amount of time in between occurrences")
  @JsonProperty("interval")
  public Integer getInterval() {
    return interval;
  }
  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  /**
   * the day(s) of the week the occurrence happens
   **/
  public DialerSequenceScheduleConfigChangeRecurrencePattern daysOfWeek(List<String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the day(s) of the week the occurrence happens")
  @JsonProperty("daysOfWeek")
  public List<String> getDaysOfWeek() {
    return daysOfWeek;
  }
  public void setDaysOfWeek(List<String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  /**
   **/
  public DialerSequenceScheduleConfigChangeRecurrencePattern additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerSequenceScheduleConfigChangeRecurrencePattern dialerSequenceScheduleConfigChangeRecurrencePattern = (DialerSequenceScheduleConfigChangeRecurrencePattern) o;

    return Objects.equals(this.type, dialerSequenceScheduleConfigChangeRecurrencePattern.type) &&
            Objects.equals(this.interval, dialerSequenceScheduleConfigChangeRecurrencePattern.interval) &&
            Objects.equals(this.daysOfWeek, dialerSequenceScheduleConfigChangeRecurrencePattern.daysOfWeek) &&
            Objects.equals(this.additionalProperties, dialerSequenceScheduleConfigChangeRecurrencePattern.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, interval, daysOfWeek, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerSequenceScheduleConfigChangeRecurrencePattern {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

