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
import com.mypurecloud.sdk.v2.model.FlowCharacteristics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Defines a characteristic that can be captured by data providers
 */
@ApiModel(description = "Defines a characteristic that can be captured by data providers")

public class FlowLogLevelCharacteristicsDefinition  implements Serializable {
  
  private String id = null;

  private static class MinimumLevelEnumDeserializer extends StdDeserializer<MinimumLevelEnum> {
    public MinimumLevelEnumDeserializer() {
      super(MinimumLevelEnumDeserializer.class);
    }

    @Override
    public MinimumLevelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MinimumLevelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The minimum level required for this characteristic to be enabled.
   */
 @JsonDeserialize(using = MinimumLevelEnumDeserializer.class)
  public enum MinimumLevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    DISABLED("Disabled"),
    BASE("Base"),
    NOTES("Notes"),
    VERBOSENOTES("VerboseNotes"),
    ALL("All");

    private String value;

    MinimumLevelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MinimumLevelEnum fromString(String key) {
      if (key == null) return null;

      for (MinimumLevelEnum value : MinimumLevelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MinimumLevelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MinimumLevelEnum minimumLevel = null;
  private FlowCharacteristics dependsOn = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The minimum level required for this characteristic to be enabled.")
  @JsonProperty("minimumLevel")
  public MinimumLevelEnum getMinimumLevel() {
    return minimumLevel;
  }


  @ApiModelProperty(example = "null", value = "If set, this is the id of the characteristic that this one depends on and it must be enabled for this to be enabled.")
  @JsonProperty("dependsOn")
  public FlowCharacteristics getDependsOn() {
    return dependsOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowLogLevelCharacteristicsDefinition flowLogLevelCharacteristicsDefinition = (FlowLogLevelCharacteristicsDefinition) o;

    return Objects.equals(this.id, flowLogLevelCharacteristicsDefinition.id) &&
            Objects.equals(this.minimumLevel, flowLogLevelCharacteristicsDefinition.minimumLevel) &&
            Objects.equals(this.dependsOn, flowLogLevelCharacteristicsDefinition.dependsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, minimumLevel, dependsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowLogLevelCharacteristicsDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    minimumLevel: ").append(toIndentedString(minimumLevel)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
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

