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
 * AvailableMediaType
 */

public class AvailableMediaType  implements Serializable {
  
  private String mediaType = null;
  private List<String> availableSubTypes = null;

  public AvailableMediaType() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      availableSubTypes = new ArrayList<String>();
    }
  }

  
  /**
   * Name of the available media type
   **/
  public AvailableMediaType mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the available media type")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * List of available subtypes for this media type
   **/
  public AvailableMediaType availableSubTypes(List<String> availableSubTypes) {
    this.availableSubTypes = availableSubTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of available subtypes for this media type")
  @JsonProperty("availableSubTypes")
  public List<String> getAvailableSubTypes() {
    return availableSubTypes;
  }
  public void setAvailableSubTypes(List<String> availableSubTypes) {
    this.availableSubTypes = availableSubTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableMediaType availableMediaType = (AvailableMediaType) o;

    return Objects.equals(this.mediaType, availableMediaType.mediaType) &&
            Objects.equals(this.availableSubTypes, availableMediaType.availableSubTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, availableSubTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableMediaType {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    availableSubTypes: ").append(toIndentedString(availableSubTypes)).append("\n");
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

