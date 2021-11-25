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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DataSchema
 */

public class DataSchema  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer version = null;

  private static class AppliesToEnumDeserializer extends StdDeserializer<AppliesToEnum> {
    public AppliesToEnumDeserializer() {
      super(AppliesToEnumDeserializer.class);
    }

    @Override
    public AppliesToEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AppliesToEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets appliesTo
   */
 @JsonDeserialize(using = AppliesToEnumDeserializer.class)
  public enum AppliesToEnum {
    CONTACT("CONTACT"),
    EXTERNAL_ORGANIZATION("EXTERNAL_ORGANIZATION"),
    OPEN_ACTION("OPEN_ACTION");

    private String value;

    AppliesToEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AppliesToEnum fromString(String key) {
      if (key == null) return null;

      for (AppliesToEnum value : AppliesToEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AppliesToEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<AppliesToEnum> appliesTo = new ArrayList<AppliesToEnum>();
  private Boolean enabled = null;
  private DomainEntityRef createdBy = null;
  private Date dateCreated = null;
  private JsonSchemaDocument jsonSchema = null;
  private String selfUri = null;

  
  /**
   * The globally unique identifier for the schema.  Only required if a schema is used for custom fields during external entity creation or updates.
   **/
  public DataSchema id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the schema.  Only required if a schema is used for custom fields during external entity creation or updates.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public DataSchema name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The schema's version, a positive integer. Required for updates.
   **/
  public DataSchema version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schema's version, a positive integer. Required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  @ApiModelProperty(example = "null", value = "One of \"CONTACT\" or \"EXTERNAL_ORGANIZATION\".  Indicates the built-in entity type to which this schema applies.")
  @JsonProperty("appliesTo")
  public List<AppliesToEnum> getAppliesTo() {
    return appliesTo;
  }

  
  /**
   * The schema's enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists.
   **/
  public DataSchema enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema's enabled/disabled status. A disabled schema cannot be assigned to any other entities, but the data on those entities from the schema still exists.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "The URI of the user that created this schema.")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date and time this schema was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * A JSON schema defining the extension to the built-in entity type.
   **/
  public DataSchema jsonSchema(JsonSchemaDocument jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A JSON schema defining the extension to the built-in entity type.")
  @JsonProperty("jsonSchema")
  public JsonSchemaDocument getJsonSchema() {
    return jsonSchema;
  }
  public void setJsonSchema(JsonSchemaDocument jsonSchema) {
    this.jsonSchema = jsonSchema;
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
    DataSchema dataSchema = (DataSchema) o;
    return Objects.equals(this.id, dataSchema.id) &&
        Objects.equals(this.name, dataSchema.name) &&
        Objects.equals(this.version, dataSchema.version) &&
        Objects.equals(this.appliesTo, dataSchema.appliesTo) &&
        Objects.equals(this.enabled, dataSchema.enabled) &&
        Objects.equals(this.createdBy, dataSchema.createdBy) &&
        Objects.equals(this.dateCreated, dataSchema.dateCreated) &&
        Objects.equals(this.jsonSchema, dataSchema.jsonSchema) &&
        Objects.equals(this.selfUri, dataSchema.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, appliesTo, enabled, createdBy, dateCreated, jsonSchema, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

