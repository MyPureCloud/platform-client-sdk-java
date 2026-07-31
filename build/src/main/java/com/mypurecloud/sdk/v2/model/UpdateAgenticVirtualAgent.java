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
 * UpdateAgenticVirtualAgent
 */

public class UpdateAgenticVirtualAgent  implements Serializable {
  
  private String name = null;
  private String imageUri = null;

  public UpdateAgenticVirtualAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UpdateAgenticVirtualAgent(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the virtual agent.
   **/
  public UpdateAgenticVirtualAgent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the virtual agent.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The URI of the image for the virtual agent.
   **/
  public UpdateAgenticVirtualAgent imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the image for the virtual agent.")
  @JsonProperty("imageUri")
  public String getImageUri() {
    return imageUri;
  }
  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAgenticVirtualAgent updateAgenticVirtualAgent = (UpdateAgenticVirtualAgent) o;

    return Objects.equals(this.name, updateAgenticVirtualAgent.name) &&
            Objects.equals(this.imageUri, updateAgenticVirtualAgent.imageUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imageUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAgenticVirtualAgent {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
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

