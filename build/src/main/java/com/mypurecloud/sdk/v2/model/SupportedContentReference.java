package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.MediaTypes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Reference to supported content profile associated with the integration
 */
@ApiModel(description = "Reference to supported content profile associated with the integration")

public class SupportedContentReference  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String selfUri = null;
  private MediaTypes mediaTypes = null;

  
  /**
   * The SupportedContent unique identifier associated with this integration
   **/
  public SupportedContentReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The SupportedContent unique identifier associated with this integration")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  @ApiModelProperty(example = "null", value = "The SupportedContent profile name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The SupportedContent profile URI")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  @ApiModelProperty(example = "null", value = "Media types definition for the supported content")
  @JsonProperty("mediaTypes")
  public MediaTypes getMediaTypes() {
    return mediaTypes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedContentReference supportedContentReference = (SupportedContentReference) o;
    return Objects.equals(this.id, supportedContentReference.id) &&
        Objects.equals(this.name, supportedContentReference.name) &&
        Objects.equals(this.selfUri, supportedContentReference.selfUri) &&
        Objects.equals(this.mediaTypes, supportedContentReference.mediaTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, selfUri, mediaTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedContentReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
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

