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
import com.mypurecloud.sdk.v2.model.FreeTrialNamespace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FreeTrialLimitDocs
 */

public class FreeTrialLimitDocs  implements Serializable {
  
  private List<FreeTrialNamespace> namespaces = null;

  public FreeTrialLimitDocs() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      namespaces = new ArrayList<FreeTrialNamespace>();
    }
  }

  
  /**
   **/
  public FreeTrialLimitDocs namespaces(List<FreeTrialNamespace> namespaces) {
    this.namespaces = namespaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("namespaces")
  public List<FreeTrialNamespace> getNamespaces() {
    return namespaces;
  }
  public void setNamespaces(List<FreeTrialNamespace> namespaces) {
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
    FreeTrialLimitDocs freeTrialLimitDocs = (FreeTrialLimitDocs) o;

    return Objects.equals(this.namespaces, freeTrialLimitDocs.namespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTrialLimitDocs {\n");
    
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

