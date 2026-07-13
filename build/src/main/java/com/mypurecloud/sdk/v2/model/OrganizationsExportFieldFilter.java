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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OrganizationsExportFieldFilter
 */

public class OrganizationsExportFieldFilter  implements Serializable {
  

  private static class FieldEnumDeserializer extends StdDeserializer<FieldEnum> {
    public FieldEnumDeserializer() {
      super(FieldEnumDeserializer.class);
    }

    @Override
    public FieldEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FieldEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Field name to apply the filter
   */
 @JsonDeserialize(using = FieldEnumDeserializer.class)
  public enum FieldEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIVISIONID("DivisionId"),
    SCHEMAID("SchemaId"),
    SCHEMAVERSION("SchemaVersion");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FieldEnum fromString(String key) {
      if (key == null) return null;

      for (FieldEnum value : FieldEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FieldEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FieldEnum field = null;
  private String value = null;

  public OrganizationsExportFieldFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OrganizationsExportFieldFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Field name to apply the filter
   **/
  public OrganizationsExportFieldFilter field(FieldEnum field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Field name to apply the filter")
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }


  /**
   * Value to check field's value against
   **/
  public OrganizationsExportFieldFilter value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value to check field's value against")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsExportFieldFilter organizationsExportFieldFilter = (OrganizationsExportFieldFilter) o;

    return Objects.equals(this.field, organizationsExportFieldFilter.field) &&
            Objects.equals(this.value, organizationsExportFieldFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsExportFieldFilter {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

