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
 * ExternalSegment
 */

public class ExternalSegment  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * The external system where the segment originates from.
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADOBEEXPERIENCEPLATFORM("AdobeExperiencePlatform"),
    CUSTOM("Custom");

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

  
  /**
   * Identifier for the external segment in the system where it originates from.
   **/
  public ExternalSegment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier for the external segment in the system where it originates from.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name for the external segment in the system where it originates from.
   **/
  public ExternalSegment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name for the external segment in the system where it originates from.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The external system where the segment originates from.
   **/
  public ExternalSegment source(SourceEnum source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external system where the segment originates from.")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalSegment externalSegment = (ExternalSegment) o;
    return Objects.equals(this.id, externalSegment.id) &&
        Objects.equals(this.name, externalSegment.name) &&
        Objects.equals(this.source, externalSegment.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalSegment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

