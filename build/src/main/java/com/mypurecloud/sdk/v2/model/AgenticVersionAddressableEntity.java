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
 * AgenticVersionAddressableEntity
 */

public class AgenticVersionAddressableEntity  implements Serializable {
  
  private String version = null;
  private String selfUri = null;

  public AgenticVersionAddressableEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVersionAddressableEntity(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The virtual agent version.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }


  /**
   **/
  public AgenticVersionAddressableEntity selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVersionAddressableEntity agenticVersionAddressableEntity = (AgenticVersionAddressableEntity) o;

    return Objects.equals(this.version, agenticVersionAddressableEntity.version) &&
            Objects.equals(this.selfUri, agenticVersionAddressableEntity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVersionAddressableEntity {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

