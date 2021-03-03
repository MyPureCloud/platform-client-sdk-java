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
 * LocationEmergencyNumber
 */

public class LocationEmergencyNumber  implements Serializable {
  
  private String e164 = null;
  private String number = null;

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
   * The type of emergency number.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DEFAULT("default"),
    ELIN("elin");

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

  
  /**
   **/
  public LocationEmergencyNumber e164(String e164) {
    this.e164 = e164;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("e164")
  public String getE164() {
    return e164;
  }
  public void setE164(String e164) {
    this.e164 = e164;
  }

  
  /**
   **/
  public LocationEmergencyNumber number(String number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  
  /**
   * The type of emergency number.
   **/
  public LocationEmergencyNumber type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of emergency number.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationEmergencyNumber locationEmergencyNumber = (LocationEmergencyNumber) o;
    return Objects.equals(this.e164, locationEmergencyNumber.e164) &&
        Objects.equals(this.number, locationEmergencyNumber.number) &&
        Objects.equals(this.type, locationEmergencyNumber.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e164, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationEmergencyNumber {\n");
    
    sb.append("    e164: ").append(toIndentedString(e164)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

