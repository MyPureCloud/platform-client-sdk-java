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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UploadAttachmentResponse
 */

public class UploadAttachmentResponse  implements Serializable {
  
  private String attachmentId = null;
  private String name = null;
  private String url = null;
  private Map<String, String> headers = null;
  private String conversationId = null;

  public UploadAttachmentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UploadAttachmentResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The attachment ID
   **/
  public UploadAttachmentResponse attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attachment ID")
  @JsonProperty("attachmentId")
  public String getAttachmentId() {
    return attachmentId;
  }
  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  /**
   * The name of the attachment file
   **/
  public UploadAttachmentResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the attachment file")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Pre-signed URL to upload the file
   **/
  public UploadAttachmentResponse url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pre-signed URL to upload the file")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Required headers when uploading a file through PUT request to the URL
   **/
  public UploadAttachmentResponse headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required headers when uploading a file through PUT request to the URL")
  @JsonProperty("headers")
  public Map<String, String> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  /**
   * The conversation ID
   **/
  public UploadAttachmentResponse conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation ID")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadAttachmentResponse uploadAttachmentResponse = (UploadAttachmentResponse) o;

    return Objects.equals(this.attachmentId, uploadAttachmentResponse.attachmentId) &&
            Objects.equals(this.name, uploadAttachmentResponse.name) &&
            Objects.equals(this.url, uploadAttachmentResponse.url) &&
            Objects.equals(this.headers, uploadAttachmentResponse.headers) &&
            Objects.equals(this.conversationId, uploadAttachmentResponse.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, name, url, headers, conversationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadAttachmentResponse {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

