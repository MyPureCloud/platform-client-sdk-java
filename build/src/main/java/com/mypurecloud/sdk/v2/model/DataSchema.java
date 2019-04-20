package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.UriReference;
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

  /**
   * Gets or Sets appliesTo
   */
  public enum AppliesToEnum {
    CONTACT("CONTACT"),
    EXTERNAL_ORGANIZATION("EXTERNAL_ORGANIZATION");

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
  private Boolean deleted = null;
  private UriReference createdBy = null;
  private Date dateCreated = null;
  private JsonSchemaDocument jsonSchema = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
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
   * The schema's version. Required for updates.
   **/
  public DataSchema version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schema's version. Required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The PureCloud data this schema extends.
   **/
  public DataSchema appliesTo(List<AppliesToEnum> appliesTo) {
    this.appliesTo = appliesTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud data this schema extends.")
  @JsonProperty("appliesTo")
  public List<AppliesToEnum> getAppliesTo() {
    return appliesTo;
  }
  public void setAppliesTo(List<AppliesToEnum> appliesTo) {
    this.appliesTo = appliesTo;
  }

  
  /**
   * The schema's current enabled/disabled status. A disabled schema cannot be assigned to any other objects, but the data on those objects from the schemas still exists
   **/
  public DataSchema enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema's current enabled/disabled status. A disabled schema cannot be assigned to any other objects, but the data on those objects from the schemas still exists")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The schema's deleted status. A deleted schema can not be used by any records or updated. All records using a deleted schema will eventually have their schema-based data removed.
   **/
  public DataSchema deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schema's deleted status. A deleted schema can not be used by any records or updated. All records using a deleted schema will eventually have their schema-based data removed.")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  
  /**
   * The user that created this schema.
   **/
  public DataSchema createdBy(UriReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that created this schema.")
  @JsonProperty("createdBy")
  public UriReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UriReference createdBy) {
    this.createdBy = createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "The date and time this schema was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  /**
   * The JSON schema defining the data extension.
   **/
  public DataSchema jsonSchema(JsonSchemaDocument jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The JSON schema defining the data extension.")
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
        Objects.equals(this.deleted, dataSchema.deleted) &&
        Objects.equals(this.createdBy, dataSchema.createdBy) &&
        Objects.equals(this.dateCreated, dataSchema.dateCreated) &&
        Objects.equals(this.jsonSchema, dataSchema.jsonSchema) &&
        Objects.equals(this.selfUri, dataSchema.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, appliesTo, enabled, deleted, createdBy, dateCreated, jsonSchema, selfUri);
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
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

