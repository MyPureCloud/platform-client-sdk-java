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
 * SipDownloadResponse
 */

public class SipDownloadResponse  implements Serializable {
  
  private String downloadId = null;
  private String documentId = null;

  
  /**
   * unique id of the downloaded file
   **/
  public SipDownloadResponse downloadId(String downloadId) {
    this.downloadId = downloadId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "unique id of the downloaded file")
  @JsonProperty("downloadId")
  public String getDownloadId() {
    return downloadId;
  }
  public void setDownloadId(String downloadId) {
    this.downloadId = downloadId;
  }

  
  /**
   * Document id of pcap file
   **/
  public SipDownloadResponse documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document id of pcap file")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipDownloadResponse sipDownloadResponse = (SipDownloadResponse) o;
    return Objects.equals(this.downloadId, sipDownloadResponse.downloadId) &&
        Objects.equals(this.documentId, sipDownloadResponse.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadId, documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipDownloadResponse {\n");
    
    sb.append("    downloadId: ").append(toIndentedString(downloadId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

