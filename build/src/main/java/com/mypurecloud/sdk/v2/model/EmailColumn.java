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
 * EmailColumn
 */

public class EmailColumn  implements Serializable {
  
  private String columnName = null;
  private String type = null;
  private String contactableTimeColumn = null;

  public EmailColumn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the email column.
   **/
  public EmailColumn columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the email column.")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   * Indicates the type of the email column. For example, 'work' or 'personal'.
   **/
  public EmailColumn type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the type of the email column. For example, 'work' or 'personal'.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * A column that indicates the timezone to use for a given contact when checking contactable times.
   **/
  public EmailColumn contactableTimeColumn(String contactableTimeColumn) {
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
    EmailColumn emailColumn = (EmailColumn) o;

    return Objects.equals(this.columnName, emailColumn.columnName) &&
            Objects.equals(this.type, emailColumn.type) &&
            Objects.equals(this.contactableTimeColumn, emailColumn.contactableTimeColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, type, contactableTimeColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailColumn {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

