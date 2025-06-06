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
import com.mypurecloud.sdk.v2.model.SessionMetaDataResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SessionMetaData
 */

public class SessionMetaData  implements Serializable {
  
  private String downloadUrl = null;
  private SessionMetaDataResult downloadResult = null;

  public SessionMetaData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * URL to fetch the meta data information. This field is populated only if session state is Complete
   **/
  public SessionMetaData downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL to fetch the meta data information. This field is populated only if session state is Complete")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Result will always come via downloadUrls; however the schema is included for documentation
   **/
  public SessionMetaData downloadResult(SessionMetaDataResult downloadResult) {
    this.downloadResult = downloadResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Result will always come via downloadUrls; however the schema is included for documentation")
  @JsonProperty("downloadResult")
  public SessionMetaDataResult getDownloadResult() {
    return downloadResult;
  }
  public void setDownloadResult(SessionMetaDataResult downloadResult) {
    this.downloadResult = downloadResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionMetaData sessionMetaData = (SessionMetaData) o;

    return Objects.equals(this.downloadUrl, sessionMetaData.downloadUrl) &&
            Objects.equals(this.downloadResult, sessionMetaData.downloadResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl, downloadResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionMetaData {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadResult: ").append(toIndentedString(downloadResult)).append("\n");
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

