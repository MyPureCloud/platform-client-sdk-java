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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerContactlistConfigChangeContactPhoneNumberColumn
 */

public class DialerContactlistConfigChangeContactPhoneNumberColumn  implements Serializable {
  
  private String columnName = null;
  private String type = null;
  private String callableTimeColumn = null;
  private Map<String, Object> additionalProperties = null;

  public DialerContactlistConfigChangeContactPhoneNumberColumn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * name of the phone column
   **/
  public DialerContactlistConfigChangeContactPhoneNumberColumn columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "name of the phone column")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   * type of the phone column, for example, 'cell' or 'home'
   **/
  public DialerContactlistConfigChangeContactPhoneNumberColumn type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "type of the phone column, for example, 'cell' or 'home'")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * name of the column indicating the timezone to be considered for determining callable times
   **/
  public DialerContactlistConfigChangeContactPhoneNumberColumn callableTimeColumn(String callableTimeColumn) {
    this.callableTimeColumn = callableTimeColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "name of the column indicating the timezone to be considered for determining callable times")
  @JsonProperty("callableTimeColumn")
  public String getCallableTimeColumn() {
    return callableTimeColumn;
  }
  public void setCallableTimeColumn(String callableTimeColumn) {
    this.callableTimeColumn = callableTimeColumn;
  }


  /**
   **/
  public DialerContactlistConfigChangeContactPhoneNumberColumn additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerContactlistConfigChangeContactPhoneNumberColumn dialerContactlistConfigChangeContactPhoneNumberColumn = (DialerContactlistConfigChangeContactPhoneNumberColumn) o;

    return Objects.equals(this.columnName, dialerContactlistConfigChangeContactPhoneNumberColumn.columnName) &&
            Objects.equals(this.type, dialerContactlistConfigChangeContactPhoneNumberColumn.type) &&
            Objects.equals(this.callableTimeColumn, dialerContactlistConfigChangeContactPhoneNumberColumn.callableTimeColumn) &&
            Objects.equals(this.additionalProperties, dialerContactlistConfigChangeContactPhoneNumberColumn.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, type, callableTimeColumn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContactlistConfigChangeContactPhoneNumberColumn {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    callableTimeColumn: ").append(toIndentedString(callableTimeColumn)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

