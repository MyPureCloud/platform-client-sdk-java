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
 * CasePriorityUpdate
 */

public class CasePriorityUpdate  implements Serializable {
  

  private static class PriorityEnumDeserializer extends StdDeserializer<PriorityEnum> {
    public PriorityEnumDeserializer() {
      super(PriorityEnumDeserializer.class);
    }

    @Override
    public PriorityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PriorityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The priority of the Case.
   */
 @JsonDeserialize(using = PriorityEnumDeserializer.class)
  public enum PriorityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    URGENT("Urgent"),
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PriorityEnum fromString(String key) {
      if (key == null) return null;

      for (PriorityEnum value : PriorityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PriorityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PriorityEnum priority = null;

  public CasePriorityUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The priority of the Case.
   **/
  public CasePriorityUpdate priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The priority of the Case.")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CasePriorityUpdate casePriorityUpdate = (CasePriorityUpdate) o;

    return Objects.equals(this.priority, casePriorityUpdate.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CasePriorityUpdate {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

