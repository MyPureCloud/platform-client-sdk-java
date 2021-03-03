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
 * KeyRotationSchedule
 */

public class KeyRotationSchedule  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class PeriodEnumDeserializer extends StdDeserializer<PeriodEnum> {
    public PeriodEnumDeserializer() {
      super(PeriodEnumDeserializer.class);
    }

    @Override
    public PeriodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PeriodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Value to set schedule to
   */
 @JsonDeserialize(using = PeriodEnumDeserializer.class)
  public enum PeriodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DISABLED("DISABLED"),
    DAILY("DAILY"),
    WEEKLY("WEEKLY"),
    MONTHLY("MONTHLY"),
    YEARLY("YEARLY");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PeriodEnum fromString(String key) {
      if (key == null) return null;

      for (PeriodEnum value : PeriodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PeriodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PeriodEnum period = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public KeyRotationSchedule name(String name) {
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
   * Value to set schedule to
   **/
  public KeyRotationSchedule period(PeriodEnum period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value to set schedule to")
  @JsonProperty("period")
  public PeriodEnum getPeriod() {
    return period;
  }
  public void setPeriod(PeriodEnum period) {
    this.period = period;
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
    KeyRotationSchedule keyRotationSchedule = (KeyRotationSchedule) o;
    return Objects.equals(this.id, keyRotationSchedule.id) &&
        Objects.equals(this.name, keyRotationSchedule.name) &&
        Objects.equals(this.period, keyRotationSchedule.period) &&
        Objects.equals(this.selfUri, keyRotationSchedule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, period, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyRotationSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

