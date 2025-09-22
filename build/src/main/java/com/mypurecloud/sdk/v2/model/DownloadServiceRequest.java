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
 * DownloadServiceRequest
 */

public class DownloadServiceRequest  implements Serializable {
  
  private List<String> files = null;

  public DownloadServiceRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      files = new ArrayList<String>();
    }
  }

  
  /**
   * List of file names to download
   **/
  public DownloadServiceRequest files(List<String> files) {
    this.files = files;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of file names to download")
  @JsonProperty("files")
  public List<String> getFiles() {
    return files;
  }
  public void setFiles(List<String> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadServiceRequest downloadServiceRequest = (DownloadServiceRequest) o;

    return Objects.equals(this.files, downloadServiceRequest.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadServiceRequest {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

