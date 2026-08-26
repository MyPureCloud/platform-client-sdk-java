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
import com.mypurecloud.sdk.v2.model.ContactVertex;
import com.mypurecloud.sdk.v2.model.IdentifierVertex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GraphVertices
 */

public class GraphVertices  implements Serializable {
  
  private List<ContactVertex> contacts = null;
  private List<IdentifierVertex> identifiers = null;

  public GraphVertices() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contacts = new ArrayList<ContactVertex>();
      identifiers = new ArrayList<IdentifierVertex>();
    }
  }

  public GraphVertices(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      contacts = new ArrayList<ContactVertex>();
      identifiers = new ArrayList<IdentifierVertex>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The list of contact vertices in the cluster")
  @JsonProperty("contacts")
  public List<ContactVertex> getContacts() {
    return contacts;
  }


  @ApiModelProperty(example = "null", value = "The list of identifier vertices in the cluster")
  @JsonProperty("identifiers")
  public List<IdentifierVertex> getIdentifiers() {
    return identifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphVertices graphVertices = (GraphVertices) o;

    return Objects.equals(this.contacts, graphVertices.contacts) &&
            Objects.equals(this.identifiers, graphVertices.identifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts, identifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphVertices {\n");
    
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
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

