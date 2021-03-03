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
 * FreeSeatingConfiguration
 */

public class FreeSeatingConfiguration  implements Serializable {
  

  private static class FreeSeatingStateEnumDeserializer extends StdDeserializer<FreeSeatingStateEnum> {
    public FreeSeatingStateEnumDeserializer() {
      super(FreeSeatingStateEnumDeserializer.class);
    }

    @Override
    public FreeSeatingStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FreeSeatingStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The FreeSeatingState for FreeSeatingConfiguration. Can be ON, OFF, or PARTIAL. ON meaning disassociate the user after the ttl expires, OFF meaning never disassociate the user, and PARTIAL meaning only disassociate when a user explicitly clicks log out.
   */
 @JsonDeserialize(using = FreeSeatingStateEnumDeserializer.class)
  public enum FreeSeatingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("ON"),
    OFF("OFF"),
    PARTIAL("PARTIAL");

    private String value;

    FreeSeatingStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FreeSeatingStateEnum fromString(String key) {
      if (key == null) return null;

      for (FreeSeatingStateEnum value : FreeSeatingStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FreeSeatingStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FreeSeatingStateEnum freeSeatingState = null;
  private Integer ttlMinutes = null;

  
  /**
   * The FreeSeatingState for FreeSeatingConfiguration. Can be ON, OFF, or PARTIAL. ON meaning disassociate the user after the ttl expires, OFF meaning never disassociate the user, and PARTIAL meaning only disassociate when a user explicitly clicks log out.
   **/
  public FreeSeatingConfiguration freeSeatingState(FreeSeatingStateEnum freeSeatingState) {
    this.freeSeatingState = freeSeatingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The FreeSeatingState for FreeSeatingConfiguration. Can be ON, OFF, or PARTIAL. ON meaning disassociate the user after the ttl expires, OFF meaning never disassociate the user, and PARTIAL meaning only disassociate when a user explicitly clicks log out.")
  @JsonProperty("freeSeatingState")
  public FreeSeatingStateEnum getFreeSeatingState() {
    return freeSeatingState;
  }
  public void setFreeSeatingState(FreeSeatingStateEnum freeSeatingState) {
    this.freeSeatingState = freeSeatingState;
  }

  
  /**
   * The amount of time in minutes until an offline user is disassociated from their station
   **/
  public FreeSeatingConfiguration ttlMinutes(Integer ttlMinutes) {
    this.ttlMinutes = ttlMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of time in minutes until an offline user is disassociated from their station")
  @JsonProperty("ttlMinutes")
  public Integer getTtlMinutes() {
    return ttlMinutes;
  }
  public void setTtlMinutes(Integer ttlMinutes) {
    this.ttlMinutes = ttlMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeSeatingConfiguration freeSeatingConfiguration = (FreeSeatingConfiguration) o;
    return Objects.equals(this.freeSeatingState, freeSeatingConfiguration.freeSeatingState) &&
        Objects.equals(this.ttlMinutes, freeSeatingConfiguration.ttlMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeSeatingState, ttlMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeSeatingConfiguration {\n");
    
    sb.append("    freeSeatingState: ").append(toIndentedString(freeSeatingState)).append("\n");
    sb.append("    ttlMinutes: ").append(toIndentedString(ttlMinutes)).append("\n");
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

