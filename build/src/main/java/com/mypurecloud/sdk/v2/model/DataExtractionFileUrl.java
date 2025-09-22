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

import java.io.Serializable;
/**
 * DataExtractionFileUrl
 */

public class DataExtractionFileUrl  implements Serializable {
  
  private String id = null;
  private String signedUrl = null;

  public DataExtractionFileUrl() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The unique identifier for the file
   **/
  public DataExtractionFileUrl id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the file")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Cloudfront URL for the file
   **/
  public DataExtractionFileUrl signedUrl(String signedUrl) {
    this.signedUrl = signedUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cloudfront URL for the file")
  @JsonProperty("signedUrl")
  public String getSignedUrl() {
    return signedUrl;
  }
  public void setSignedUrl(String signedUrl) {
    this.signedUrl = signedUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataExtractionFileUrl dataExtractionFileUrl = (DataExtractionFileUrl) o;

    return Objects.equals(this.id, dataExtractionFileUrl.id) &&
            Objects.equals(this.signedUrl, dataExtractionFileUrl.signedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, signedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataExtractionFileUrl {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    signedUrl: ").append(toIndentedString(signedUrl)).append("\n");
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

