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
import com.mypurecloud.sdk.v2.model.LearningCoverArtThumbnail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module cover art response
 */
@ApiModel(description = "Learning module cover art response")

public class LearningModuleCoverArtResponse  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private String url = null;
  private List<LearningCoverArtThumbnail> thumbnails = null;

  public LearningModuleCoverArtResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      thumbnails = new ArrayList<LearningCoverArtThumbnail>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * The URL for the cover art
   **/
  public LearningModuleCoverArtResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL for the cover art")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Thumbnails for the cover art
   **/
  public LearningModuleCoverArtResponse thumbnails(List<LearningCoverArtThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Thumbnails for the cover art")
  @JsonProperty("thumbnails")
  public List<LearningCoverArtThumbnail> getThumbnails() {
    return thumbnails;
  }
  public void setThumbnails(List<LearningCoverArtThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleCoverArtResponse learningModuleCoverArtResponse = (LearningModuleCoverArtResponse) o;

    return Objects.equals(this.id, learningModuleCoverArtResponse.id) &&
            Objects.equals(this.selfUri, learningModuleCoverArtResponse.selfUri) &&
            Objects.equals(this.url, learningModuleCoverArtResponse.url) &&
            Objects.equals(this.thumbnails, learningModuleCoverArtResponse.thumbnails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, url, thumbnails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleCoverArtResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
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

