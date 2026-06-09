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
import com.mypurecloud.sdk.v2.model.V3SourceRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V3SynchronizationRef
 */

public class V3SynchronizationRef  implements Serializable {
  
  private String id = null;
  private V3SourceRef source = null;
  private String selfUri = null;

  public V3SynchronizationRef() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V3SynchronizationRef(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Synchronization Id.
   **/
  public V3SynchronizationRef id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Synchronization Id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Source.
   **/
  public V3SynchronizationRef source(V3SourceRef source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Source.")
  @JsonProperty("source")
  public V3SourceRef getSource() {
    return source;
  }
  public void setSource(V3SourceRef source) {
    this.source = source;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SynchronizationRef v3SynchronizationRef = (V3SynchronizationRef) o;

    return Objects.equals(this.id, v3SynchronizationRef.id) &&
            Objects.equals(this.source, v3SynchronizationRef.source) &&
            Objects.equals(this.selfUri, v3SynchronizationRef.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SynchronizationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

