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
 * DocumentQueryInterval
 */

public class DocumentQueryInterval  implements Serializable {
  

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
   * Specifies the date field to be used for date and time range.
   */
 @JsonDeserialize(using = FieldEnumDeserializer.class)
  public enum FieldEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DATECREATED("dateCreated"),
    DATEMODIFIED("dateModified"),
    DATEPUBLISHED("datePublished");

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

  public DocumentQueryInterval() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Specifies the date field to be used for date and time range.
   **/
  public DocumentQueryInterval field(FieldEnum field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the date field to be used for date and time range.")
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }


  /**
   * Specifies the date and time range for filtering the documents. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public DocumentQueryInterval value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the date and time range for filtering the documents. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
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
    DocumentQueryInterval documentQueryInterval = (DocumentQueryInterval) o;

    return Objects.equals(this.field, documentQueryInterval.field) &&
            Objects.equals(this.value, documentQueryInterval.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentQueryInterval {\n");
    
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

