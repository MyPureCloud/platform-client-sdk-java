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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactVertex
 */

public class ContactVertex  implements Serializable {
  
  private String vertexId = null;
  private ExternalContact contact = null;

  public ContactVertex() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ContactVertex(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The ID of the vertex in the cluster graph. This ID is only unique within the graph!")
  @JsonProperty("vertexId")
  public String getVertexId() {
    return vertexId;
  }


  @ApiModelProperty(example = "null", value = "The contact found")
  @JsonProperty("contact")
  public ExternalContact getContact() {
    return contact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactVertex contactVertex = (ContactVertex) o;

    return Objects.equals(this.vertexId, contactVertex.vertexId) &&
            Objects.equals(this.contact, contactVertex.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertexId, contact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactVertex {\n");
    
    sb.append("    vertexId: ").append(toIndentedString(vertexId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

