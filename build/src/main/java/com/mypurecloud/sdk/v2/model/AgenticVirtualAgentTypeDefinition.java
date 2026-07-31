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
import com.mypurecloud.sdk.v2.model.AgenticVirtualAgentPropertyDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Type definition used by a virtual agent. The applicable fields depend on the type value and related fields.
 */
@ApiModel(description = "Type definition used by a virtual agent. The applicable fields depend on the type value and related fields.")

public class AgenticVirtualAgentTypeDefinition  implements Serializable {
  
  private String name = null;
  private String description = null;

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Intended direction of use for this type.
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INPUT("Input"),
    OUTPUT("Output"),
    AGENTINPUT("AgentInput"),
    AGENTOUTPUT("AgentOutput");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;

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
   * Type value. The applicable fields depend on this value and related fields.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("string"),
    INTEGER("integer"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    NULL("null"),
    OBJECT("object"),
    ARRAY("array"),
    DATAACTIONHTTPERROR("DataActionHttpError");

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
  private TypeEnum type = TypeEnum.NULL;
  private Boolean userUtteranceSubstring = null;
  private Boolean undisclosed = null;
  private List<AgenticVirtualAgentPropertyDefinition> properties = null;
  private String items = null;
  private List<Integer> statusCodes = null;
  private String defaultInstruction = null;
  private List<String> _enum = null;

  public AgenticVirtualAgentTypeDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      properties = new ArrayList<AgenticVirtualAgentPropertyDefinition>();
      statusCodes = new ArrayList<Integer>();
      _enum = new ArrayList<String>();
    }
  }

  public AgenticVirtualAgentTypeDefinition(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      properties = new ArrayList<AgenticVirtualAgentPropertyDefinition>();
      statusCodes = new ArrayList<Integer>();
      _enum = new ArrayList<String>();
    }
  }

  
  /**
   * Type name.
   **/
  public AgenticVirtualAgentTypeDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "PaymentRecord", required = true, value = "Type name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Additional context that helps the virtual agent understand what this type is used for.
   **/
  public AgenticVirtualAgentTypeDefinition description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "Record of a processed payment transaction.", value = "Additional context that helps the virtual agent understand what this type is used for.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Intended direction of use for this type.
   **/
  public AgenticVirtualAgentTypeDefinition direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Intended direction of use for this type.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   * Type value. The applicable fields depend on this value and related fields.
   **/
  public AgenticVirtualAgentTypeDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "object", value = "Type value. The applicable fields depend on this value and related fields.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Whether values of this string type must be copied as a contiguous substring from recent user messages.
   **/
  public AgenticVirtualAgentTypeDefinition userUtteranceSubstring(Boolean userUtteranceSubstring) {
    this.userUtteranceSubstring = userUtteranceSubstring;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Whether values of this string type must be copied as a contiguous substring from recent user messages.")
  @JsonProperty("userUtteranceSubstring")
  public Boolean getUserUtteranceSubstring() {
    return userUtteranceSubstring;
  }
  public void setUserUtteranceSubstring(Boolean userUtteranceSubstring) {
    this.userUtteranceSubstring = userUtteranceSubstring;
  }


  /**
   * Whether values of this string type are hidden from the virtual agent and represented as opaque identifiers. Only valid when type is string.
   **/
  public AgenticVirtualAgentTypeDefinition undisclosed(Boolean undisclosed) {
    this.undisclosed = undisclosed;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Whether values of this string type are hidden from the virtual agent and represented as opaque identifiers. Only valid when type is string.")
  @JsonProperty("undisclosed")
  public Boolean getUndisclosed() {
    return undisclosed;
  }
  public void setUndisclosed(Boolean undisclosed) {
    this.undisclosed = undisclosed;
  }


  /**
   * Properties of this object type. Applies when type is object.
   **/
  public AgenticVirtualAgentTypeDefinition properties(List<AgenticVirtualAgentPropertyDefinition> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties of this object type. Applies when type is object.")
  @JsonProperty("properties")
  public List<AgenticVirtualAgentPropertyDefinition> getProperties() {
    return properties;
  }
  public void setProperties(List<AgenticVirtualAgentPropertyDefinition> properties) {
    this.properties = properties;
  }


  /**
   * Type of items in this array type. Applies when type is array.
   **/
  public AgenticVirtualAgentTypeDefinition items(String items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "PaymentRecord", value = "Type of items in this array type. Applies when type is array.")
  @JsonProperty("items")
  public String getItems() {
    return items;
  }
  public void setItems(String items) {
    this.items = items;
  }


  /**
   * HTTP 4xx or 5xx status codes this error type can handle. Applies when type is DataActionHttpError.
   **/
  public AgenticVirtualAgentTypeDefinition statusCodes(List<Integer> statusCodes) {
    this.statusCodes = statusCodes;
    return this;
  }
  
  @ApiModelProperty(example = "[400, 500]", value = "HTTP 4xx or 5xx status codes this error type can handle. Applies when type is DataActionHttpError.")
  @JsonProperty("statusCodes")
  public List<Integer> getStatusCodes() {
    return statusCodes;
  }
  public void setStatusCodes(List<Integer> statusCodes) {
    this.statusCodes = statusCodes;
  }


  /**
   * Default instruction for how the virtual agent should handle this error type when a tool references it without its own error instruction. Applies when type is DataActionHttpError.
   **/
  public AgenticVirtualAgentTypeDefinition defaultInstruction(String defaultInstruction) {
    this.defaultInstruction = defaultInstruction;
    return this;
  }
  
  @ApiModelProperty(example = "Tell the customer &#39;Please contact customer care via email or phone.&#39;", value = "Default instruction for how the virtual agent should handle this error type when a tool references it without its own error instruction. Applies when type is DataActionHttpError.")
  @JsonProperty("defaultInstruction")
  public String getDefaultInstruction() {
    return defaultInstruction;
  }
  public void setDefaultInstruction(String defaultInstruction) {
    this.defaultInstruction = defaultInstruction;
  }


  /**
   * Allowed enum values. Applies to enum types.
   **/
  public AgenticVirtualAgentTypeDefinition _enum(List<String> _enum) {
    this._enum = _enum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allowed enum values. Applies to enum types.")
  @JsonProperty("enum")
  public List<String> getEnum() {
    return _enum;
  }
  public void setEnum(List<String> _enum) {
    this._enum = _enum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentTypeDefinition agenticVirtualAgentTypeDefinition = (AgenticVirtualAgentTypeDefinition) o;

    return Objects.equals(this.name, agenticVirtualAgentTypeDefinition.name) &&
            Objects.equals(this.description, agenticVirtualAgentTypeDefinition.description) &&
            Objects.equals(this.direction, agenticVirtualAgentTypeDefinition.direction) &&
            Objects.equals(this.type, agenticVirtualAgentTypeDefinition.type) &&
            Objects.equals(this.userUtteranceSubstring, agenticVirtualAgentTypeDefinition.userUtteranceSubstring) &&
            Objects.equals(this.undisclosed, agenticVirtualAgentTypeDefinition.undisclosed) &&
            Objects.equals(this.properties, agenticVirtualAgentTypeDefinition.properties) &&
            Objects.equals(this.items, agenticVirtualAgentTypeDefinition.items) &&
            Objects.equals(this.statusCodes, agenticVirtualAgentTypeDefinition.statusCodes) &&
            Objects.equals(this.defaultInstruction, agenticVirtualAgentTypeDefinition.defaultInstruction) &&
            Objects.equals(this._enum, agenticVirtualAgentTypeDefinition._enum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, direction, type, userUtteranceSubstring, undisclosed, properties, items, statusCodes, defaultInstruction, _enum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentTypeDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userUtteranceSubstring: ").append(toIndentedString(userUtteranceSubstring)).append("\n");
    sb.append("    undisclosed: ").append(toIndentedString(undisclosed)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    statusCodes: ").append(toIndentedString(statusCodes)).append("\n");
    sb.append("    defaultInstruction: ").append(toIndentedString(defaultInstruction)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
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

