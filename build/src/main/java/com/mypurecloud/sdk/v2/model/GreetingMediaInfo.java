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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GreetingMediaInfo
 */

public class GreetingMediaInfo  implements Serializable {
  
  private String id = null;
  private String mediaFileUri = null;
  private String mediaImageUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public GreetingMediaInfo mediaFileUri(String mediaFileUri) {
    this.mediaFileUri = mediaFileUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaFileUri")
  public String getMediaFileUri() {
    return mediaFileUri;
  }
  public void setMediaFileUri(String mediaFileUri) {
    this.mediaFileUri = mediaFileUri;
  }

  
  /**
   **/
  public GreetingMediaInfo mediaImageUri(String mediaImageUri) {
    this.mediaImageUri = mediaImageUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaImageUri")
  public String getMediaImageUri() {
    return mediaImageUri;
  }
  public void setMediaImageUri(String mediaImageUri) {
    this.mediaImageUri = mediaImageUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GreetingMediaInfo greetingMediaInfo = (GreetingMediaInfo) o;
    return Objects.equals(this.id, greetingMediaInfo.id) &&
        Objects.equals(this.mediaFileUri, greetingMediaInfo.mediaFileUri) &&
        Objects.equals(this.mediaImageUri, greetingMediaInfo.mediaImageUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaFileUri, mediaImageUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GreetingMediaInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaFileUri: ").append(toIndentedString(mediaFileUri)).append("\n");
    sb.append("    mediaImageUri: ").append(toIndentedString(mediaImageUri)).append("\n");
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

