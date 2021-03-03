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
import com.mypurecloud.sdk.v2.model.Attribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentAttribute
 */

public class DocumentAttribute  implements Serializable {
  
  private Attribute attribute = null;
  private List<String> values = new ArrayList<String>();

  
  /**
   **/
  public DocumentAttribute attribute(Attribute attribute) {
    this.attribute = attribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attribute")
  public Attribute getAttribute() {
    return attribute;
  }
  public void setAttribute(Attribute attribute) {
    this.attribute = attribute;
  }

  
  /**
   **/
  public DocumentAttribute values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAttribute documentAttribute = (DocumentAttribute) o;
    return Objects.equals(this.attribute, documentAttribute.attribute) &&
        Objects.equals(this.values, documentAttribute.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAttribute {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

