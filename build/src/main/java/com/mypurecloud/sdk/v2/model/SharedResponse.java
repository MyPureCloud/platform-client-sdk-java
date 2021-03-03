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
import com.mypurecloud.sdk.v2.model.Document;
import com.mypurecloud.sdk.v2.model.Share;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SharedResponse
 */

public class SharedResponse  implements Serializable {
  
  private String id = null;
  private String downloadUri = null;
  private String viewUri = null;
  private Document document = null;
  private Share share = null;

  
  /**
   **/
  public SharedResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public SharedResponse downloadUri(String downloadUri) {
    this.downloadUri = downloadUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUri")
  public String getDownloadUri() {
    return downloadUri;
  }
  public void setDownloadUri(String downloadUri) {
    this.downloadUri = downloadUri;
  }

  
  /**
   **/
  public SharedResponse viewUri(String viewUri) {
    this.viewUri = viewUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("viewUri")
  public String getViewUri() {
    return viewUri;
  }
  public void setViewUri(String viewUri) {
    this.viewUri = viewUri;
  }

  
  /**
   **/
  public SharedResponse document(Document document) {
    this.document = document;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("document")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
  }

  
  /**
   **/
  public SharedResponse share(Share share) {
    this.share = share;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("share")
  public Share getShare() {
    return share;
  }
  public void setShare(Share share) {
    this.share = share;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedResponse sharedResponse = (SharedResponse) o;
    return Objects.equals(this.id, sharedResponse.id) &&
        Objects.equals(this.downloadUri, sharedResponse.downloadUri) &&
        Objects.equals(this.viewUri, sharedResponse.viewUri) &&
        Objects.equals(this.document, sharedResponse.document) &&
        Objects.equals(this.share, sharedResponse.share);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadUri, viewUri, document, share);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadUri: ").append(toIndentedString(downloadUri)).append("\n");
    sb.append("    viewUri: ").append(toIndentedString(viewUri)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
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

