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
import com.mypurecloud.sdk.v2.model.MetadataDocumentation;
import com.mypurecloud.sdk.v2.model.MetadataPresentation;
import com.mypurecloud.sdk.v2.model.MetadataResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Metadata for a CX infrastructure as code accelerator
 */
@ApiModel(description = "Metadata for a CX infrastructure as code accelerator")

public class AcceleratorSpecification  implements Serializable {
  
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
  private List<String> permissions = new ArrayList<String>();
  private List<String> products = new ArrayList<String>();
  private List<MetadataDocumentation> documentation = new ArrayList<MetadataDocumentation>();
  private List<MetadataPresentation> presentation = new ArrayList<MetadataPresentation>();
  private MetadataResults results = null;
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


  @ApiModelProperty(example = "null", value = "Genesys Cloud permissions required to install the accelerator")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }


  @ApiModelProperty(example = "null", value = "Genesys Cloud products required to install the accelerator")
  @JsonProperty("products")
  public List<String> getProducts() {
    return products;
  }


  @ApiModelProperty(example = "null", value = "additional documentation about the artifact")
  @JsonProperty("documentation")
  public List<MetadataDocumentation> getDocumentation() {
    return documentation;
  }


  @ApiModelProperty(example = "null", value = "presentation of data fields to be gathered for the accelerator")
  @JsonProperty("presentation")
  public List<MetadataPresentation> getPresentation() {
    return presentation;
  }


  @ApiModelProperty(example = "null", value = "resources created or modified as a result of running the accelerator")
  @JsonProperty("results")
  public MetadataResults getResults() {
    return results;
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
    AcceleratorSpecification acceleratorSpecification = (AcceleratorSpecification) o;

    return Objects.equals(this.id, acceleratorSpecification.id) &&
            Objects.equals(this.name, acceleratorSpecification.name) &&
            Objects.equals(this.description, acceleratorSpecification.description) &&
            Objects.equals(this.origin, acceleratorSpecification.origin) &&
            Objects.equals(this.type, acceleratorSpecification.type) &&
            Objects.equals(this.classification, acceleratorSpecification.classification) &&
            Objects.equals(this.tags, acceleratorSpecification.tags) &&
            Objects.equals(this.permissions, acceleratorSpecification.permissions) &&
            Objects.equals(this.products, acceleratorSpecification.products) &&
            Objects.equals(this.documentation, acceleratorSpecification.documentation) &&
            Objects.equals(this.presentation, acceleratorSpecification.presentation) &&
            Objects.equals(this.results, acceleratorSpecification.results) &&
            Objects.equals(this.selfUri, acceleratorSpecification.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, origin, type, classification, tags, permissions, products, documentation, presentation, results, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceleratorSpecification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    presentation: ").append(toIndentedString(presentation)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

