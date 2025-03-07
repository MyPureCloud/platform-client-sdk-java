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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArchitectFlowReference
 */

public class ArchitectFlowReference  implements Serializable {
  
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
   * The flow type.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("BOT"),
    COMMONMODULE("COMMONMODULE"),
    DIGITALBOT("DIGITALBOT"),
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
    VOICE("VOICE"),
    VOICEMAIL("VOICEMAIL"),
    VOICESURVEY("VOICESURVEY"),
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
  private String version = null;

  
  /**
   * The flow identifier.
   **/
  public ArchitectFlowReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow identifier.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The flow name.
   **/
  public ArchitectFlowReference name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The flow type.
   **/
  public ArchitectFlowReference type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The flow version.
   **/
  public ArchitectFlowReference version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow version.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectFlowReference architectFlowReference = (ArchitectFlowReference) o;

    return Objects.equals(this.id, architectFlowReference.id) &&
            Objects.equals(this.name, architectFlowReference.name) &&
            Objects.equals(this.type, architectFlowReference.type) &&
            Objects.equals(this.version, architectFlowReference.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectFlowReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

