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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LibraryBatchRequest
 */

public class LibraryBatchRequest  implements Serializable {
  
  private List<String> libraryIds = null;

  public LibraryBatchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      libraryIds = new ArrayList<String>();
    }
  }

  
  /**
   * List of Library IDs
   **/
  public LibraryBatchRequest libraryIds(List<String> libraryIds) {
    this.libraryIds = libraryIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of Library IDs")
  @JsonProperty("libraryIds")
  public List<String> getLibraryIds() {
    return libraryIds;
  }
  public void setLibraryIds(List<String> libraryIds) {
    this.libraryIds = libraryIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryBatchRequest libraryBatchRequest = (LibraryBatchRequest) o;

    return Objects.equals(this.libraryIds, libraryBatchRequest.libraryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryBatchRequest {\n");
    
    sb.append("    libraryIds: ").append(toIndentedString(libraryIds)).append("\n");
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

