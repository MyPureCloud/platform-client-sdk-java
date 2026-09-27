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
 * FieldMapping
 */

public class FieldMapping  implements Serializable {
  
  private String dataActionValueName = null;
  private String dataActionSynonymName = null;

  public FieldMapping() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public FieldMapping(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The data action output field name that maps to the list item values.
   **/
  public FieldMapping dataActionValueName(String dataActionValueName) {
    this.dataActionValueName = dataActionValueName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data action output field name that maps to the list item values.")
  @JsonProperty("dataActionValueName")
  public String getDataActionValueName() {
    return dataActionValueName;
  }
  public void setDataActionValueName(String dataActionValueName) {
    this.dataActionValueName = dataActionValueName;
  }


  /**
   * The data action output field name that maps to the list item synonyms. Optional if synonyms are not provided by the data action.
   **/
  public FieldMapping dataActionSynonymName(String dataActionSynonymName) {
    this.dataActionSynonymName = dataActionSynonymName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data action output field name that maps to the list item synonyms. Optional if synonyms are not provided by the data action.")
  @JsonProperty("dataActionSynonymName")
  public String getDataActionSynonymName() {
    return dataActionSynonymName;
  }
  public void setDataActionSynonymName(String dataActionSynonymName) {
    this.dataActionSynonymName = dataActionSynonymName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMapping fieldMapping = (FieldMapping) o;

    return Objects.equals(this.dataActionValueName, fieldMapping.dataActionValueName) &&
            Objects.equals(this.dataActionSynonymName, fieldMapping.dataActionSynonymName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataActionValueName, dataActionSynonymName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMapping {\n");
    
    sb.append("    dataActionValueName: ").append(toIndentedString(dataActionValueName)).append("\n");
    sb.append("    dataActionSynonymName: ").append(toIndentedString(dataActionSynonymName)).append("\n");
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

