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
 * WorkitemQueryJobSort
 */

public class WorkitemQueryJobSort  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specify an attribute for sorting. Use 'customFields' to sort by a custom field, in which case the customField property is required.
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DATEDUE("dateDue"),
    DATECREATED("dateCreated"),
    PRIORITY("priority"),
    CUSTOMFIELDS("customFields");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;
  private Boolean ascending = null;
  private String customField = null;

  public WorkitemQueryJobSort() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WorkitemQueryJobSort(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Specify an attribute for sorting. Use 'customFields' to sort by a custom field, in which case the customField property is required.
   **/
  public WorkitemQueryJobSort name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify an attribute for sorting. Use 'customFields' to sort by a custom field, in which case the customField property is required.")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }


  /**
   * Sort Ascending
   **/
  public WorkitemQueryJobSort ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sort Ascending")
  @JsonProperty("ascending")
  public Boolean getAscending() {
    return ascending;
  }
  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }


  /**
   * The key of the custom field to sort by. Required when name is 'customFields' and must not be set otherwise.
   **/
  public WorkitemQueryJobSort customField(String customField) {
    this.customField = customField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key of the custom field to sort by. Required when name is 'customFields' and must not be set otherwise.")
  @JsonProperty("customField")
  public String getCustomField() {
    return customField;
  }
  public void setCustomField(String customField) {
    this.customField = customField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemQueryJobSort workitemQueryJobSort = (WorkitemQueryJobSort) o;

    return Objects.equals(this.name, workitemQueryJobSort.name) &&
            Objects.equals(this.ascending, workitemQueryJobSort.ascending) &&
            Objects.equals(this.customField, workitemQueryJobSort.customField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ascending, customField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemQueryJobSort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
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

