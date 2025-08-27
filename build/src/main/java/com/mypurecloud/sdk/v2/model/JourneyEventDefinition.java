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
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * An event definition used when creating journey views
 */
@ApiModel(description = "An event definition used when creating journey views")

public class JourneyEventDefinition  implements Serializable {
  
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
   * The source of the event definition
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NATIVE("Native"),
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
  private Integer rank = null;
  private String displayName = null;
  private String description = null;
  private JsonSchemaDocument jsonSchema = null;
  private String selfUri = null;

  public JourneyEventDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", required = true, value = "The name of the event definition")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  @ApiModelProperty(example = "null", required = true, value = "The source of the event definition")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }


  @ApiModelProperty(example = "null", value = "The rank of the event definition")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }


  @ApiModelProperty(example = "null", value = "The display name of the event definition")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }


  @ApiModelProperty(example = "null", required = true, value = "The description of this event definition")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  @ApiModelProperty(example = "null", required = true, value = "The JSON schema of this event definition")
  @JsonProperty("jsonSchema")
  public JsonSchemaDocument getJsonSchema() {
    return jsonSchema;
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
    JourneyEventDefinition journeyEventDefinition = (JourneyEventDefinition) o;

    return Objects.equals(this.id, journeyEventDefinition.id) &&
            Objects.equals(this.name, journeyEventDefinition.name) &&
            Objects.equals(this.source, journeyEventDefinition.source) &&
            Objects.equals(this.rank, journeyEventDefinition.rank) &&
            Objects.equals(this.displayName, journeyEventDefinition.displayName) &&
            Objects.equals(this.description, journeyEventDefinition.description) &&
            Objects.equals(this.jsonSchema, journeyEventDefinition.jsonSchema) &&
            Objects.equals(this.selfUri, journeyEventDefinition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, source, rank, displayName, description, jsonSchema, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyEventDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
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

