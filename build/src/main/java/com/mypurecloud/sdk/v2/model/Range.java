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

import java.io.Serializable;
/**
 * Range
 */

public class Range  implements Serializable {
  

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
   * Range type (NoEnd: without an end date. EndDate: with an end date. Numbered: with a specific number of occurrences)
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOEND("NoEnd"),
    ENDDATE("EndDate"),
    NUMBERED("Numbered");

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
  private String end = null;
  private Integer numberOfOccurrences = null;

  
  /**
   * Range type (NoEnd: without an end date. EndDate: with an end date. Numbered: with a specific number of occurrences)
   **/
  public Range type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Range type (NoEnd: without an end date. EndDate: with an end date. Numbered: with a specific number of occurrences)")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The end date time of the last occurrence of the range as an ISO-8601 string in UTC time, e.g: 2023-12-21T16:30:25.000Z, Required to set for EndDate range type.
   **/
  public Range end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date time of the last occurrence of the range as an ISO-8601 string in UTC time, e.g: 2023-12-21T16:30:25.000Z, Required to set for EndDate range type.")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * The number of times the schedule will be repeated, e.g: 2. Required to set for Numbered range type.
   **/
  public Range numberOfOccurrences(Integer numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of times the schedule will be repeated, e.g: 2. Required to set for Numbered range type.")
  @JsonProperty("numberOfOccurrences")
  public Integer getNumberOfOccurrences() {
    return numberOfOccurrences;
  }
  public void setNumberOfOccurrences(Integer numberOfOccurrences) {
    this.numberOfOccurrences = numberOfOccurrences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Range range = (Range) o;

    return Objects.equals(this.type, range.type) &&
            Objects.equals(this.end, range.end) &&
            Objects.equals(this.numberOfOccurrences, range.numberOfOccurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, end, numberOfOccurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Range {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    numberOfOccurrences: ").append(toIndentedString(numberOfOccurrences)).append("\n");
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

