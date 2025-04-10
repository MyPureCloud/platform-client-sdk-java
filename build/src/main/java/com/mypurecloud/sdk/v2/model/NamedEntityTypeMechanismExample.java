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
 * NamedEntityTypeMechanismExample
 */

public class NamedEntityTypeMechanismExample  implements Serializable {
  
  private String text = null;
  private String resolvedValue = null;

  public NamedEntityTypeMechanismExample() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Example input text
   **/
  public NamedEntityTypeMechanismExample text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Example input text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Resolved entity value
   **/
  public NamedEntityTypeMechanismExample resolvedValue(String resolvedValue) {
    this.resolvedValue = resolvedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Resolved entity value")
  @JsonProperty("resolvedValue")
  public String getResolvedValue() {
    return resolvedValue;
  }
  public void setResolvedValue(String resolvedValue) {
    this.resolvedValue = resolvedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedEntityTypeMechanismExample namedEntityTypeMechanismExample = (NamedEntityTypeMechanismExample) o;

    return Objects.equals(this.text, namedEntityTypeMechanismExample.text) &&
            Objects.equals(this.resolvedValue, namedEntityTypeMechanismExample.resolvedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, resolvedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedEntityTypeMechanismExample {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    resolvedValue: ").append(toIndentedString(resolvedValue)).append("\n");
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

