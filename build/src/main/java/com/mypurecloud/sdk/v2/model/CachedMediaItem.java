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
import java.util.Date;

import java.io.Serializable;
/**
 * Defines an external media that has been ingested and cached by Genesys Cloud for conversation messaging
 */
@ApiModel(description = "Defines an external media that has been ingested and cached by Genesys Cloud for conversation messaging")

public class CachedMediaItem  implements Serializable {
  
  private String id = null;
  private String url = null;
  private String downloadUrl = null;
  private String mediaType = null;
  private Integer contentLengthBytes = null;
  private Date dateCreated = null;
  private Date dateExpires = null;
  private String selfUri = null;

  public CachedMediaItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The unique identifier for the cached media.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The URL that represents the external media that has been cached")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }


  @ApiModelProperty(example = "null", value = "A URL to fetch the cached media")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }


  @ApiModelProperty(example = "null", value = "The media type for the URL")
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }


  @ApiModelProperty(example = "null", value = "The content length of the media represented by the URL, in bytes.")
  @JsonProperty("contentLengthBytes")
  public Integer getContentLengthBytes() {
    return contentLengthBytes;
  }


  @ApiModelProperty(example = "null", value = "The date the cached item was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date the cached item expires and will be removed from the cache. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
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
    CachedMediaItem cachedMediaItem = (CachedMediaItem) o;

    return Objects.equals(this.id, cachedMediaItem.id) &&
            Objects.equals(this.url, cachedMediaItem.url) &&
            Objects.equals(this.downloadUrl, cachedMediaItem.downloadUrl) &&
            Objects.equals(this.mediaType, cachedMediaItem.mediaType) &&
            Objects.equals(this.contentLengthBytes, cachedMediaItem.contentLengthBytes) &&
            Objects.equals(this.dateCreated, cachedMediaItem.dateCreated) &&
            Objects.equals(this.dateExpires, cachedMediaItem.dateExpires) &&
            Objects.equals(this.selfUri, cachedMediaItem.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, downloadUrl, mediaType, contentLengthBytes, dateCreated, dateExpires, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CachedMediaItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    contentLengthBytes: ").append(toIndentedString(contentLengthBytes)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
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

