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
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentTargetReferenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Target definition for input or output data type properties
 */
@ApiModel(description = "Target definition for input or output data type properties")

public class AgenticVirtualAgentTargetDefinition  implements Serializable {
  

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
   * The type of target.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REQUEST("Request"),
    RESPONSE("Response"),
    CUSTOMCONVERSATIONATTRIBUTES("CustomConversationAttributes");

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
  private AgenticVirtualAgentTargetReferenceDefinition target = null;

  public AgenticVirtualAgentTargetDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgentTargetDefinition(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The type of target.
   **/
  public AgenticVirtualAgentTargetDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of target.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The reference target object. Contains information on the Conversation Attributes schema.
   **/
  public AgenticVirtualAgentTargetDefinition target(AgenticVirtualAgentTargetReferenceDefinition target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference target object. Contains information on the Conversation Attributes schema.")
  @JsonProperty("target")
  public AgenticVirtualAgentTargetReferenceDefinition getTarget() {
    return target;
  }
  public void setTarget(AgenticVirtualAgentTargetReferenceDefinition target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentTargetDefinition agenticVirtualAgentTargetDefinition = (AgenticVirtualAgentTargetDefinition) o;

    return Objects.equals(this.type, agenticVirtualAgentTargetDefinition.type) &&
            Objects.equals(this.target, agenticVirtualAgentTargetDefinition.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentTargetDefinition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

