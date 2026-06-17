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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WhatsAppColumn
 */

public class WhatsAppColumn  implements Serializable {
  
  private String columnName = null;
  private String type = null;
  private String contactableTimeColumnName = null;
  private String contactableTimeColumn = null;

  public WhatsAppColumn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WhatsAppColumn(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the whatsApp column.
   **/
  public WhatsAppColumn columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the whatsApp column.")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   * Indicates the type of the whatsApp column. For example, 'work' or 'personal'.
   **/
  public WhatsAppColumn type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the type of the whatsApp column. For example, 'work' or 'personal'.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * A name of the contactableTimeColumn
   **/
  public WhatsAppColumn contactableTimeColumnName(String contactableTimeColumnName) {
    this.contactableTimeColumnName = contactableTimeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A name of the contactableTimeColumn")
  @JsonProperty("contactableTimeColumnName")
  public String getContactableTimeColumnName() {
    return contactableTimeColumnName;
  }
  public void setContactableTimeColumnName(String contactableTimeColumnName) {
    this.contactableTimeColumnName = contactableTimeColumnName;
  }


  /**
   * A column that indicates the timezone to use for a given contact when checking contactable times.
   **/
  public WhatsAppColumn contactableTimeColumn(String contactableTimeColumn) {
    this.contactableTimeColumn = contactableTimeColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A column that indicates the timezone to use for a given contact when checking contactable times.")
  @JsonProperty("contactableTimeColumn")
  public String getContactableTimeColumn() {
    return contactableTimeColumn;
  }
  public void setContactableTimeColumn(String contactableTimeColumn) {
    this.contactableTimeColumn = contactableTimeColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppColumn whatsAppColumn = (WhatsAppColumn) o;

    return Objects.equals(this.columnName, whatsAppColumn.columnName) &&
            Objects.equals(this.type, whatsAppColumn.type) &&
            Objects.equals(this.contactableTimeColumnName, whatsAppColumn.contactableTimeColumnName) &&
            Objects.equals(this.contactableTimeColumn, whatsAppColumn.contactableTimeColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, type, contactableTimeColumnName, contactableTimeColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppColumn {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contactableTimeColumnName: ").append(toIndentedString(contactableTimeColumnName)).append("\n");
    sb.append("    contactableTimeColumn: ").append(toIndentedString(contactableTimeColumn)).append("\n");
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

