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
 * MessageMediaUploadData
 */

public class MessageMediaUploadData  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String uploadUrl = null;
  private Map<String, String> uploadHeaders = null;
  private String selfUri = null;

  public MessageMediaUploadData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A unique media ID
   **/
  public MessageMediaUploadData id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A unique media ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the file
   **/
  public MessageMediaUploadData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the file")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * URL to upload the file
   **/
  public MessageMediaUploadData uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to upload the file")
  @JsonProperty("uploadUrl")
  public String getUploadUrl() {
    return uploadUrl;
  }
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  /**
   * Required headers when uploading a file with the upload URL
   **/
  public MessageMediaUploadData uploadHeaders(Map<String, String> uploadHeaders) {
    this.uploadHeaders = uploadHeaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required headers when uploading a file with the upload URL")
  @JsonProperty("uploadHeaders")
  public Map<String, String> getUploadHeaders() {
    return uploadHeaders;
  }
  public void setUploadHeaders(Map<String, String> uploadHeaders) {
    this.uploadHeaders = uploadHeaders;
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
    MessageMediaUploadData messageMediaUploadData = (MessageMediaUploadData) o;

    return Objects.equals(this.id, messageMediaUploadData.id) &&
            Objects.equals(this.name, messageMediaUploadData.name) &&
            Objects.equals(this.uploadUrl, messageMediaUploadData.uploadUrl) &&
            Objects.equals(this.uploadHeaders, messageMediaUploadData.uploadHeaders) &&
            Objects.equals(this.selfUri, messageMediaUploadData.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uploadUrl, uploadHeaders, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageMediaUploadData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
    sb.append("    uploadHeaders: ").append(toIndentedString(uploadHeaders)).append("\n");
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

