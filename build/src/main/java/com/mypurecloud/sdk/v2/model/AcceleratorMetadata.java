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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Metadata for a CX infrastructure as code accelerator
 */
@ApiModel(description = "Metadata for a CX infrastructure as code accelerator")

public class AcceleratorMetadata  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;

  private static class OriginEnumDeserializer extends StdDeserializer<OriginEnum> {
    public OriginEnumDeserializer() {
      super(OriginEnumDeserializer.class);
    }

    @Override
    public OriginEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * where the accelerator originated
   */
 @JsonDeserialize(using = OriginEnumDeserializer.class)
  public enum OriginEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMMUNITY("Community"),
    PARTNER("Partner"),
    GENESYS("Genesys");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginEnum fromString(String key) {
      if (key == null) return null;

      for (OriginEnum value : OriginEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OriginEnum origin = null;

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
   * type of the artifact
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MODULE("Module"),
    ACCELERATOR("Accelerator"),
    BLUEPRINT("Blueprint");

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
  private String classification = null;
  private List<String> tags = new ArrayList<String>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "name of this accelerator")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  @ApiModelProperty(example = "null", value = "a description of the general purpose of this accelerator")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  @ApiModelProperty(example = "null", value = "where the accelerator originated")
  @JsonProperty("origin")
  public OriginEnum getOrigin() {
    return origin;
  }


  @ApiModelProperty(example = "null", value = "type of the artifact")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "architectural classification into which the accelerator belongs")
  @JsonProperty("classification")
  public String getClassification() {
    return classification;
  }


  @ApiModelProperty(example = "null", value = "tags")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
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
    AcceleratorMetadata acceleratorMetadata = (AcceleratorMetadata) o;

    return Objects.equals(this.id, acceleratorMetadata.id) &&
            Objects.equals(this.name, acceleratorMetadata.name) &&
            Objects.equals(this.description, acceleratorMetadata.description) &&
            Objects.equals(this.origin, acceleratorMetadata.origin) &&
            Objects.equals(this.type, acceleratorMetadata.type) &&
            Objects.equals(this.classification, acceleratorMetadata.classification) &&
            Objects.equals(this.tags, acceleratorMetadata.tags) &&
            Objects.equals(this.selfUri, acceleratorMetadata.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, origin, type, classification, tags, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceleratorMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

