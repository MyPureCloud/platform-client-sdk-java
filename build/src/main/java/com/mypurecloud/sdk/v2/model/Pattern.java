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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Pattern
 */

public class Pattern  implements Serializable {
  

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
   * Pattern type (Daily/Weekly)
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

  private static class DaysOfWeekEnumDeserializer extends StdDeserializer<DaysOfWeekEnum> {
    public DaysOfWeekEnumDeserializer() {
      super(DaysOfWeekEnumDeserializer.class);
    }

    @Override
    public DaysOfWeekEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DaysOfWeekEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets daysOfWeek
   */
 @JsonDeserialize(using = DaysOfWeekEnumDeserializer.class)
  public enum DaysOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    DaysOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DaysOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (DaysOfWeekEnum value : DaysOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DaysOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DaysOfWeekEnum> daysOfWeek = null;

  public Pattern() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      daysOfWeek = new ArrayList<DaysOfWeekEnum>();
    }
  }

  
  /**
   * Pattern type (Daily/Weekly)
   **/
  public Pattern type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pattern type (Daily/Weekly)")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The interval of days between the occurrences for Daily pattern type, and weeks between the occurrences for Weekly
   **/
  public Pattern interval(Integer interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The interval of days between the occurrences for Daily pattern type, and weeks between the occurrences for Weekly")
  @JsonProperty("interval")
  public Integer getInterval() {
    return interval;
  }
  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  /**
   * The day(s) of week the occurrence should be repeated. Required to set for Weekly pattern type. E.g. [\"Monday\", \"Wednesday\"]
   **/
  public Pattern daysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The day(s) of week the occurrence should be repeated. Required to set for Weekly pattern type. E.g. [\"Monday\", \"Wednesday\"]")
  @JsonProperty("daysOfWeek")
  public List<DaysOfWeekEnum> getDaysOfWeek() {
    return daysOfWeek;
  }
  public void setDaysOfWeek(List<DaysOfWeekEnum> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pattern pattern = (Pattern) o;

    return Objects.equals(this.type, pattern.type) &&
            Objects.equals(this.interval, pattern.interval) &&
            Objects.equals(this.daysOfWeek, pattern.daysOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, interval, daysOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pattern {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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

