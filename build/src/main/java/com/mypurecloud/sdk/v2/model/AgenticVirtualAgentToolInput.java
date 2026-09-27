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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Input for a tool.
 */
@ApiModel(description = "Input for a tool.")

public class AgenticVirtualAgentToolInput  implements Serializable {
  
  private String targetName = null;
  private String type = null;

  private static class SourceEnumDeserializer extends StdDeserializer<SourceEnum> {
    public SourceEnumDeserializer() {
      super(SourceEnumDeserializer.class);
    }

    @Override
    public SourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Source of the input value.
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    TOOLINPUT("ToolInput"),
    TOOLOUTPUT("ToolOutput"),
    EXTERNAL("External");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceEnum fromString(String key) {
      if (key == null) return null;

      for (SourceEnum value : SourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceEnum source = null;
  private Boolean required = null;
  private Boolean fallbackToUser = null;
  private List<Object> mapping = null;

  public AgenticVirtualAgentToolInput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mapping = new ArrayList<Object>();
    }
  }

  public AgenticVirtualAgentToolInput(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      mapping = new ArrayList<Object>();
    }
  }

  
  /**
   * The unique name that identifies this input parameter within the tool
   **/
  public AgenticVirtualAgentToolInput targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }
  
  @ApiModelProperty(example = "orderId", required = true, value = "The unique name that identifies this input parameter within the tool")
  @JsonProperty("targetName")
  public String getTargetName() {
    return targetName;
  }
  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  /**
   * Input type name. The valid referenced type depends on the input source.
   **/
  public AgenticVirtualAgentToolInput type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "OrderId", required = true, value = "Input type name. The valid referenced type depends on the input source.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Source of the input value.
   **/
  public AgenticVirtualAgentToolInput source(SourceEnum source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Source of the input value.")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  /**
   * Whether this input must be supplied.
   **/
  public AgenticVirtualAgentToolInput required(Boolean required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this input must be supplied.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }


  /**
   * Whether the virtual agent should ask the user for this input value when it is not available from the configured source.
   **/
  public AgenticVirtualAgentToolInput fallbackToUser(Boolean fallbackToUser) {
    this.fallbackToUser = fallbackToUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the virtual agent should ask the user for this input value when it is not available from the configured source.")
  @JsonProperty("fallbackToUser")
  public Boolean getFallbackToUser() {
    return fallbackToUser;
  }
  public void setFallbackToUser(Boolean fallbackToUser) {
    this.fallbackToUser = fallbackToUser;
  }


  /**
   * Path used to extract this input from a previous tool output. Only valid when source is 'ToolOutput'. The path starts with a tool output type name, may contain only string property names or integer array indexes, and must resolve to a primitive value.
   **/
  public AgenticVirtualAgentToolInput mapping(List<Object> mapping) {
    this.mapping = mapping;
    return this;
  }
  
  @ApiModelProperty(example = "[&quot;Order&quot;, 0, &quot;id&quot;]", value = "Path used to extract this input from a previous tool output. Only valid when source is 'ToolOutput'. The path starts with a tool output type name, may contain only string property names or integer array indexes, and must resolve to a primitive value.")
  @JsonProperty("mapping")
  public List<Object> getMapping() {
    return mapping;
  }
  public void setMapping(List<Object> mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentToolInput agenticVirtualAgentToolInput = (AgenticVirtualAgentToolInput) o;

    return Objects.equals(this.targetName, agenticVirtualAgentToolInput.targetName) &&
            Objects.equals(this.type, agenticVirtualAgentToolInput.type) &&
            Objects.equals(this.source, agenticVirtualAgentToolInput.source) &&
            Objects.equals(this.required, agenticVirtualAgentToolInput.required) &&
            Objects.equals(this.fallbackToUser, agenticVirtualAgentToolInput.fallbackToUser) &&
            Objects.equals(this.mapping, agenticVirtualAgentToolInput.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetName, type, source, required, fallbackToUser, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentToolInput {\n");
    
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    fallbackToUser: ").append(toIndentedString(fallbackToUser)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

