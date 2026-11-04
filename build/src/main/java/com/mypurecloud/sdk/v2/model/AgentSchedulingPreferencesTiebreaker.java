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
 * AgentSchedulingPreferencesTiebreaker
 */

public class AgentSchedulingPreferencesTiebreaker  implements Serializable {
  

  private static class PrimaryEnumDeserializer extends StdDeserializer<PrimaryEnum> {
    public PrimaryEnumDeserializer() {
      super(PrimaryEnumDeserializer.class);
    }

    @Override
    public PrimaryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PrimaryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The primary ranking tiebreaker used when agents have equal preference scores
   */
 @JsonDeserialize(using = PrimaryEnumDeserializer.class)
  public enum PrimaryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOM("Custom"),
    HIREDATE("HireDate"),
    PERFORMANCE("Performance"),
    RANDOMLYASSIGN("RandomlyAssign");

    private String value;

    PrimaryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PrimaryEnum fromString(String key) {
      if (key == null) return null;

      for (PrimaryEnum value : PrimaryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PrimaryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PrimaryEnum primary = null;

  private static class SecondaryEnumDeserializer extends StdDeserializer<SecondaryEnum> {
    public SecondaryEnumDeserializer() {
      super(SecondaryEnumDeserializer.class);
    }

    @Override
    public SecondaryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SecondaryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The secondary ranking tiebreaker. Omit when primary is RandomlyAssign
   */
 @JsonDeserialize(using = SecondaryEnumDeserializer.class)
  public enum SecondaryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOM("Custom"),
    HIREDATE("HireDate"),
    PERFORMANCE("Performance"),
    RANDOMLYASSIGN("RandomlyAssign");

    private String value;

    SecondaryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SecondaryEnum fromString(String key) {
      if (key == null) return null;

      for (SecondaryEnum value : SecondaryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SecondaryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SecondaryEnum secondary = null;

  public AgentSchedulingPreferencesTiebreaker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentSchedulingPreferencesTiebreaker(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The primary ranking tiebreaker used when agents have equal preference scores
   **/
  public AgentSchedulingPreferencesTiebreaker primary(PrimaryEnum primary) {
    this.primary = primary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The primary ranking tiebreaker used when agents have equal preference scores")
  @JsonProperty("primary")
  public PrimaryEnum getPrimary() {
    return primary;
  }
  public void setPrimary(PrimaryEnum primary) {
    this.primary = primary;
  }


  /**
   * The secondary ranking tiebreaker. Omit when primary is RandomlyAssign
   **/
  public AgentSchedulingPreferencesTiebreaker secondary(SecondaryEnum secondary) {
    this.secondary = secondary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The secondary ranking tiebreaker. Omit when primary is RandomlyAssign")
  @JsonProperty("secondary")
  public SecondaryEnum getSecondary() {
    return secondary;
  }
  public void setSecondary(SecondaryEnum secondary) {
    this.secondary = secondary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSchedulingPreferencesTiebreaker agentSchedulingPreferencesTiebreaker = (AgentSchedulingPreferencesTiebreaker) o;

    return Objects.equals(this.primary, agentSchedulingPreferencesTiebreaker.primary) &&
            Objects.equals(this.secondary, agentSchedulingPreferencesTiebreaker.secondary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSchedulingPreferencesTiebreaker {\n");
    
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
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

