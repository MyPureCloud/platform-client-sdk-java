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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialerRulesetConfigChangeContactColumnToDataActionFieldMapping
 */

public class DialerRulesetConfigChangeContactColumnToDataActionFieldMapping  implements Serializable {
  
  private String contactColumnName = null;
  private String dataActionField = null;

  
  /**
   * The name of a contact column whose data will be passed to the data action
   **/
  public DialerRulesetConfigChangeContactColumnToDataActionFieldMapping contactColumnName(String contactColumnName) {
    this.contactColumnName = contactColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of a contact column whose data will be passed to the data action")
  @JsonProperty("contactColumnName")
  public String getContactColumnName() {
    return contactColumnName;
  }
  public void setContactColumnName(String contactColumnName) {
    this.contactColumnName = contactColumnName;
  }


  /**
   * The name of an output field from the data action that the contact column data will be passed to
   **/
  public DialerRulesetConfigChangeContactColumnToDataActionFieldMapping dataActionField(String dataActionField) {
    this.dataActionField = dataActionField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of an output field from the data action that the contact column data will be passed to")
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
    DialerRulesetConfigChangeContactColumnToDataActionFieldMapping dialerRulesetConfigChangeContactColumnToDataActionFieldMapping = (DialerRulesetConfigChangeContactColumnToDataActionFieldMapping) o;

    return Objects.equals(this.contactColumnName, dialerRulesetConfigChangeContactColumnToDataActionFieldMapping.contactColumnName) &&
            Objects.equals(this.dataActionField, dialerRulesetConfigChangeContactColumnToDataActionFieldMapping.dataActionField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactColumnName, dataActionField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeContactColumnToDataActionFieldMapping {\n");
    
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

