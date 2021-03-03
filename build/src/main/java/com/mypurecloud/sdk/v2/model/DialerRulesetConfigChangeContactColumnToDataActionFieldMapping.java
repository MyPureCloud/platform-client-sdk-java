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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DialerRulesetConfigChangeContactColumnToDataActionFieldMapping
 */

public class DialerRulesetConfigChangeContactColumnToDataActionFieldMapping  implements Serializable {
  
  private String contactColumnName = null;
  private String dataActionField = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerRulesetConfigChangeContactColumnToDataActionFieldMapping contactColumnName(String contactColumnName) {
    this.contactColumnName = contactColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactColumnName")
  public String getContactColumnName() {
    return contactColumnName;
  }
  public void setContactColumnName(String contactColumnName) {
    this.contactColumnName = contactColumnName;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeContactColumnToDataActionFieldMapping dataActionField(String dataActionField) {
    this.dataActionField = dataActionField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataActionField")
  public String getDataActionField() {
    return dataActionField;
  }
  public void setDataActionField(String dataActionField) {
    this.dataActionField = dataActionField;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeContactColumnToDataActionFieldMapping additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
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
    DialerRulesetConfigChangeContactColumnToDataActionFieldMapping dialerRulesetConfigChangeContactColumnToDataActionFieldMapping = (DialerRulesetConfigChangeContactColumnToDataActionFieldMapping) o;
    return Objects.equals(this.contactColumnName, dialerRulesetConfigChangeContactColumnToDataActionFieldMapping.contactColumnName) &&
        Objects.equals(this.dataActionField, dialerRulesetConfigChangeContactColumnToDataActionFieldMapping.dataActionField) &&
        Objects.equals(this.additionalProperties, dialerRulesetConfigChangeContactColumnToDataActionFieldMapping.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactColumnName, dataActionField, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeContactColumnToDataActionFieldMapping {\n");
    
    sb.append("    contactColumnName: ").append(toIndentedString(contactColumnName)).append("\n");
    sb.append("    dataActionField: ").append(toIndentedString(dataActionField)).append("\n");
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

