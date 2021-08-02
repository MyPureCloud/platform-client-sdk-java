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
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowDivisionView
 */

public class FlowDivisionView  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableDivision division = null;

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("BOT"),
    COMMONMODULE("COMMONMODULE"),
    INBOUNDCALL("INBOUNDCALL"),
    INBOUNDCHAT("INBOUNDCHAT"),
    INBOUNDEMAIL("INBOUNDEMAIL"),
    INBOUNDSHORTMESSAGE("INBOUNDSHORTMESSAGE"),
    INQUEUECALL("INQUEUECALL"),
    INQUEUEEMAIL("INQUEUEEMAIL"),
    INQUEUESHORTMESSAGE("INQUEUESHORTMESSAGE"),
    OUTBOUNDCALL("OUTBOUNDCALL"),
    SECURECALL("SECURECALL"),
    SPEECH("SPEECH"),
    SURVEYINVITE("SURVEYINVITE"),
    VOICEMAIL("VOICEMAIL"),
    WORKFLOW("WORKFLOW"),
    WORKITEM("WORKITEM");

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
  private JsonSchemaDocument inputSchema = null;
  private JsonSchemaDocument outputSchema = null;
  private FlowVersion publishedVersion = null;
  private FlowVersion debugVersion = null;
  private String selfUri = null;

  
  /**
   * The flow identifier
   **/
  public FlowDivisionView id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The flow name
   **/
  public FlowDivisionView name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The flow name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The division to which this entity belongs.
   **/
  public FlowDivisionView division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableDivision division) {
    this.division = division;
  }

  
  /**
   **/
  public FlowDivisionView type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * json schema describing the inputs for the flow
   **/
  public FlowDivisionView inputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "json schema describing the inputs for the flow")
  @JsonProperty("inputSchema")
  public JsonSchemaDocument getInputSchema() {
    return inputSchema;
  }
  public void setInputSchema(JsonSchemaDocument inputSchema) {
    this.inputSchema = inputSchema;
  }

  
  /**
   * json schema describing the outputs for the flow
   **/
  public FlowDivisionView outputSchema(JsonSchemaDocument outputSchema) {
    this.outputSchema = outputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "json schema describing the outputs for the flow")
  @JsonProperty("outputSchema")
  public JsonSchemaDocument getOutputSchema() {
    return outputSchema;
  }
  public void setOutputSchema(JsonSchemaDocument outputSchema) {
    this.outputSchema = outputSchema;
  }

  
  /**
   * published version information if there is a published version
   **/
  public FlowDivisionView publishedVersion(FlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "published version information if there is a published version")
  @JsonProperty("publishedVersion")
  public FlowVersion getPublishedVersion() {
    return publishedVersion;
  }
  public void setPublishedVersion(FlowVersion publishedVersion) {
    this.publishedVersion = publishedVersion;
  }

  
  /**
   * debug version information if there is a debug version
   **/
  public FlowDivisionView debugVersion(FlowVersion debugVersion) {
    this.debugVersion = debugVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "debug version information if there is a debug version")
  @JsonProperty("debugVersion")
  public FlowVersion getDebugVersion() {
    return debugVersion;
  }
  public void setDebugVersion(FlowVersion debugVersion) {
    this.debugVersion = debugVersion;
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
    FlowDivisionView flowDivisionView = (FlowDivisionView) o;
    return Objects.equals(this.id, flowDivisionView.id) &&
        Objects.equals(this.name, flowDivisionView.name) &&
        Objects.equals(this.division, flowDivisionView.division) &&
        Objects.equals(this.type, flowDivisionView.type) &&
        Objects.equals(this.inputSchema, flowDivisionView.inputSchema) &&
        Objects.equals(this.outputSchema, flowDivisionView.outputSchema) &&
        Objects.equals(this.publishedVersion, flowDivisionView.publishedVersion) &&
        Objects.equals(this.debugVersion, flowDivisionView.debugVersion) &&
        Objects.equals(this.selfUri, flowDivisionView.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, type, inputSchema, outputSchema, publishedVersion, debugVersion, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowDivisionView {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inputSchema: ").append(toIndentedString(inputSchema)).append("\n");
    sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
    sb.append("    publishedVersion: ").append(toIndentedString(publishedVersion)).append("\n");
    sb.append("    debugVersion: ").append(toIndentedString(debugVersion)).append("\n");
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

