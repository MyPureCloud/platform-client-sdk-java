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
 * DataActionContactColumnFieldMapping
 */

public class DataActionContactColumnFieldMapping  implements Serializable {
  
  private String contactColumnName = null;
  private String dataActionField = null;

  public DataActionContactColumnFieldMapping() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of a contact column whose data will be passed to the data action
   **/
  public DataActionContactColumnFieldMapping contactColumnName(String contactColumnName) {
    this.contactColumnName = contactColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of a contact column whose data will be passed to the data action")
  @JsonProperty("contactColumnName")
  public String getContactColumnName() {
    return contactColumnName;
  }
  public void setContactColumnName(String contactColumnName) {
    this.contactColumnName = contactColumnName;
  }


  /**
   * The name of an input field from the data action that the contact column data will be passed to
   **/
  public DataActionContactColumnFieldMapping dataActionField(String dataActionField) {
    this.dataActionField = dataActionField;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of an input field from the data action that the contact column data will be passed to")
  @JsonProperty("dataActionField")
  public String getDataActionField() {
    return dataActionField;
  }
  public void setDataActionField(String dataActionField) {
    this.dataActionField = dataActionField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataActionContactColumnFieldMapping dataActionContactColumnFieldMapping = (DataActionContactColumnFieldMapping) o;

    return Objects.equals(this.contactColumnName, dataActionContactColumnFieldMapping.contactColumnName) &&
            Objects.equals(this.dataActionField, dataActionContactColumnFieldMapping.dataActionField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactColumnName, dataActionField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataActionContactColumnFieldMapping {\n");
    
    sb.append("    contactColumnName: ").append(toIndentedString(contactColumnName)).append("\n");
    sb.append("    dataActionField: ").append(toIndentedString(dataActionField)).append("\n");
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

