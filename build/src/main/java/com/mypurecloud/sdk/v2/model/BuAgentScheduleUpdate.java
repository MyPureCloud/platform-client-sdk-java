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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuAgentScheduleUpdate
 */

public class BuAgentScheduleUpdate  implements Serializable {
  

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
   * The type of update
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDED("Added"),
    EDITED("Edited"),
    DELETED("Deleted");

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
  private List<Date> shiftStartDates = new ArrayList<Date>();

  
  /**
   * The type of update
   **/
  public BuAgentScheduleUpdate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of update")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The start date for the affected shifts
   **/
  public BuAgentScheduleUpdate shiftStartDates(List<Date> shiftStartDates) {
    this.shiftStartDates = shiftStartDates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date for the affected shifts")
  @JsonProperty("shiftStartDates")
  public List<Date> getShiftStartDates() {
    return shiftStartDates;
  }
  public void setShiftStartDates(List<Date> shiftStartDates) {
    this.shiftStartDates = shiftStartDates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentScheduleUpdate buAgentScheduleUpdate = (BuAgentScheduleUpdate) o;
    return Objects.equals(this.type, buAgentScheduleUpdate.type) &&
        Objects.equals(this.shiftStartDates, buAgentScheduleUpdate.shiftStartDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, shiftStartDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentScheduleUpdate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shiftStartDates: ").append(toIndentedString(shiftStartDates)).append("\n");
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

