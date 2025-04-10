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

import java.io.Serializable;
/**
 * Alteration
 */

public class Alteration  implements Serializable {
  

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
   * Range type (Exclusion: used to exclude a specific time within the recurrence. Inclusion: used to include a specific time within the recurrence which will execute in addition to the normal recurrence. If both an exclusion and inclusion are specified, the inclusion will take precedence over the exclusion.)
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXCLUSION("Exclusion"),
    INCLUSION("Inclusion");

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
  private String start = null;
  private String end = null;

  public Alteration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Range type (Exclusion: used to exclude a specific time within the recurrence. Inclusion: used to include a specific time within the recurrence which will execute in addition to the normal recurrence. If both an exclusion and inclusion are specified, the inclusion will take precedence over the exclusion.)
   **/
  public Alteration type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Range type (Exclusion: used to exclude a specific time within the recurrence. Inclusion: used to include a specific time within the recurrence which will execute in addition to the normal recurrence. If both an exclusion and inclusion are specified, the inclusion will take precedence over the exclusion.)")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The start date of an alteration range as an ISO-8601 string
   **/
  public Alteration start(String start) {
    this.start = start;
    return this;
  }
  
  @ApiModelProperty(example = "2023-12-21T16:30:25", value = "The start date of an alteration range as an ISO-8601 string")
  @JsonProperty("start")
  public String getStart() {
    return start;
  }
  public void setStart(String start) {
    this.start = start;
  }


  /**
   * The end date of an alteration range as an ISO-8601 string
   **/
  public Alteration end(String end) {
    this.end = end;
    return this;
  }
  
  @ApiModelProperty(example = "2023-12-21T16:30:25", value = "The end date of an alteration range as an ISO-8601 string")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }
  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alteration alteration = (Alteration) o;

    return Objects.equals(this.type, alteration.type) &&
            Objects.equals(this.start, alteration.start) &&
            Objects.equals(this.end, alteration.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alteration {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

