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
import com.mypurecloud.sdk.v2.model.ItemValidationLimits;
import com.mypurecloud.sdk.v2.model.Schema;
import com.mypurecloud.sdk.v2.model.ValidationLimits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Coretype
 */

public class Coretype  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Schema schema = null;
  private Boolean current = null;
  private List<String> validationFields = new ArrayList<String>();
  private ValidationLimits validationLimits = null;
  private List<String> itemValidationFields = new ArrayList<String>();
  private ItemValidationLimits itemValidationLimits = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Coretype name(String name) {
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
   * A positive integer denoting the core type's version
   **/
  public Coretype version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A positive integer denoting the core type's version")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The date the core type was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Coretype dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the core type was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The core type's built-in schema
   **/
  public Coretype schema(Schema schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The core type's built-in schema")
  @JsonProperty("schema")
  public Schema getSchema() {
    return schema;
  }
  public void setSchema(Schema schema) {
    this.schema = schema;
  }

  
  /**
   * A boolean indicating if the core type's version is the current one in use by the system
   **/
  public Coretype current(Boolean current) {
    this.current = current;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A boolean indicating if the core type's version is the current one in use by the system")
  @JsonProperty("current")
  public Boolean getCurrent() {
    return current;
  }
  public void setCurrent(Boolean current) {
    this.current = current;
  }

  
  /**
   * An array of strings naming the fields of the core type subject to validation.  Validation constraints are specified by a schema author using the core type.
   **/
  public Coretype validationFields(List<String> validationFields) {
    this.validationFields = validationFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of strings naming the fields of the core type subject to validation.  Validation constraints are specified by a schema author using the core type.")
  @JsonProperty("validationFields")
  public List<String> getValidationFields() {
    return validationFields;
  }
  public void setValidationFields(List<String> validationFields) {
    this.validationFields = validationFields;
  }

  
  /**
   * A structure denoting the system-imposed minimum and maximum string length (for text-based core types) or numeric values (for number-based) core types.  For example, the validationLimits for a text-based core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schemaauthor on a text field.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field.
   **/
  public Coretype validationLimits(ValidationLimits validationLimits) {
    this.validationLimits = validationLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A structure denoting the system-imposed minimum and maximum string length (for text-based core types) or numeric values (for number-based) core types.  For example, the validationLimits for a text-based core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schemaauthor on a text field.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field.")
  @JsonProperty("validationLimits")
  public ValidationLimits getValidationLimits() {
    return validationLimits;
  }
  public void setValidationLimits(ValidationLimits validationLimits) {
    this.validationLimits = validationLimits;
  }

  
  /**
   * Specific to the \"tag\" core type, this is an array of strings naming the tag item fields of the core type subject to validation
   **/
  public Coretype itemValidationFields(List<String> itemValidationFields) {
    this.itemValidationFields = itemValidationFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specific to the \"tag\" core type, this is an array of strings naming the tag item fields of the core type subject to validation")
  @JsonProperty("itemValidationFields")
  public List<String> getItemValidationFields() {
    return itemValidationFields;
  }
  public void setItemValidationFields(List<String> itemValidationFields) {
    this.itemValidationFields = itemValidationFields;
  }

  
  /**
   * A structure denoting the system-imposed minimum and maximum string length for string-array based core types such as \"tag\" and \"enum\".  Forexample, the validationLimits for a schema field using a tag core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schema author on individual tags.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field's tags.
   **/
  public Coretype itemValidationLimits(ItemValidationLimits itemValidationLimits) {
    this.itemValidationLimits = itemValidationLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A structure denoting the system-imposed minimum and maximum string length for string-array based core types such as \"tag\" and \"enum\".  Forexample, the validationLimits for a schema field using a tag core type specify the min/max values for a minimum string length (minLength) constraint supplied by a schema author on individual tags.  Similarly, the maxLength's min/max specifies maximum string length constraint supplied by a schema author for the same field's tags.")
  @JsonProperty("itemValidationLimits")
  public ItemValidationLimits getItemValidationLimits() {
    return itemValidationLimits;
  }
  public void setItemValidationLimits(ItemValidationLimits itemValidationLimits) {
    this.itemValidationLimits = itemValidationLimits;
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
    Coretype coretype = (Coretype) o;
    return Objects.equals(this.id, coretype.id) &&
        Objects.equals(this.name, coretype.name) &&
        Objects.equals(this.version, coretype.version) &&
        Objects.equals(this.dateCreated, coretype.dateCreated) &&
        Objects.equals(this.schema, coretype.schema) &&
        Objects.equals(this.current, coretype.current) &&
        Objects.equals(this.validationFields, coretype.validationFields) &&
        Objects.equals(this.validationLimits, coretype.validationLimits) &&
        Objects.equals(this.itemValidationFields, coretype.itemValidationFields) &&
        Objects.equals(this.itemValidationLimits, coretype.itemValidationLimits) &&
        Objects.equals(this.selfUri, coretype.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, dateCreated, schema, current, validationFields, validationLimits, itemValidationFields, itemValidationLimits, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coretype {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    validationFields: ").append(toIndentedString(validationFields)).append("\n");
    sb.append("    validationLimits: ").append(toIndentedString(validationLimits)).append("\n");
    sb.append("    itemValidationFields: ").append(toIndentedString(itemValidationFields)).append("\n");
    sb.append("    itemValidationLimits: ").append(toIndentedString(itemValidationLimits)).append("\n");
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

