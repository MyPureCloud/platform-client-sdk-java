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
import com.mypurecloud.sdk.v2.model.ExternalSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ExternalId
 */

public class ExternalId  implements Serializable {
  
  private ExternalSource externalSource = null;
  private String value = null;

  
  /**
   **/
  public ExternalId externalSource(ExternalSource externalSource) {
    this.externalSource = externalSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalSource")
  public ExternalSource getExternalSource() {
    return externalSource;
  }
  public void setExternalSource(ExternalSource externalSource) {
    this.externalSource = externalSource;
  }


  /**
   **/
  public ExternalId value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    ExternalId externalId = (ExternalId) o;

    return Objects.equals(this.externalSource, externalId.externalSource) &&
            Objects.equals(this.value, externalId.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalSource, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalId {\n");
    
    sb.append("    externalSource: ").append(toIndentedString(externalSource)).append("\n");
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

