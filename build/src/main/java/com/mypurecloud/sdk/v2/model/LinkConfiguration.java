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
 * LinkConfiguration
 */

public class LinkConfiguration  implements Serializable {
  
  private String uriTemplate = null;

  
  /**
   **/
  public LinkConfiguration uriTemplate(String uriTemplate) {
    this.uriTemplate = uriTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uriTemplate")
  public String getUriTemplate() {
    return uriTemplate;
  }
  public void setUriTemplate(String uriTemplate) {
    this.uriTemplate = uriTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkConfiguration linkConfiguration = (LinkConfiguration) o;

    return Objects.equals(this.uriTemplate, linkConfiguration.uriTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uriTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkConfiguration {\n");
    
    sb.append("    uriTemplate: ").append(toIndentedString(uriTemplate)).append("\n");
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

