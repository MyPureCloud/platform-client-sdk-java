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
import com.mypurecloud.sdk.v2.model.NuanceBotVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Model for a Nuance bot transfer node
 */
@ApiModel(description = "Model for a Nuance bot transfer node")

public class NuanceBotTransferNode  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * The transfer node type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    END("End"),
    ESCALATE("Escalate");

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
  private String description = null;
  private List<NuanceBotVariable> requestVariables = null;

  public NuanceBotTransferNode() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      requestVariables = new ArrayList<NuanceBotVariable>();
    }
  }

  
  /**
   * The transfer node ID
   **/
  public NuanceBotTransferNode id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The transfer node ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The transfer node name
   **/
  public NuanceBotTransferNode name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The transfer node name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The transfer node type
   **/
  public NuanceBotTransferNode type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The transfer node type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The transfer node description
   **/
  public NuanceBotTransferNode description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The transfer node description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * List of variables associated with this transfer node
   **/
  public NuanceBotTransferNode requestVariables(List<NuanceBotVariable> requestVariables) {
    this.requestVariables = requestVariables;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of variables associated with this transfer node")
  @JsonProperty("requestVariables")
  public List<NuanceBotVariable> getRequestVariables() {
    return requestVariables;
  }
  public void setRequestVariables(List<NuanceBotVariable> requestVariables) {
    this.requestVariables = requestVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuanceBotTransferNode nuanceBotTransferNode = (NuanceBotTransferNode) o;

    return Objects.equals(this.id, nuanceBotTransferNode.id) &&
            Objects.equals(this.name, nuanceBotTransferNode.name) &&
            Objects.equals(this.type, nuanceBotTransferNode.type) &&
            Objects.equals(this.description, nuanceBotTransferNode.description) &&
            Objects.equals(this.requestVariables, nuanceBotTransferNode.requestVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, description, requestVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceBotTransferNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requestVariables: ").append(toIndentedString(requestVariables)).append("\n");
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

