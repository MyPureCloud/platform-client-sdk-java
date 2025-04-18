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
import com.mypurecloud.sdk.v2.model.NamespaceDocs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LimitDocumentation
 */

public class LimitDocumentation  implements Serializable {
  
  private String url = null;
  private List<NamespaceDocs> namespaces = null;

  public LimitDocumentation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      namespaces = new ArrayList<NamespaceDocs>();
    }
  }

  
  /**
   **/
  public LimitDocumentation url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   **/
  public LimitDocumentation namespaces(List<NamespaceDocs> namespaces) {
    this.namespaces = namespaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("namespaces")
  public List<NamespaceDocs> getNamespaces() {
    return namespaces;
  }
  public void setNamespaces(List<NamespaceDocs> namespaces) {
    this.namespaces = namespaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitDocumentation limitDocumentation = (LimitDocumentation) o;

    return Objects.equals(this.url, limitDocumentation.url) &&
            Objects.equals(this.namespaces, limitDocumentation.namespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, namespaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitDocumentation {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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

