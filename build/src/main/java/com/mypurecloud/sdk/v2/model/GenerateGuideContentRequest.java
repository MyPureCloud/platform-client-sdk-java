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
 * Request body for generating the content of a guide
 */
@ApiModel(description = "Request body for generating the content of a guide")

public class GenerateGuideContentRequest  implements Serializable {
  
  private String description = null;
  private String url = null;

  public GenerateGuideContentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The description that you wish to use to generate the guide content from.
   **/
  public GenerateGuideContentRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "Generate a guide to help a Customer return a product.", value = "The description that you wish to use to generate the guide content from.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The URL of the file you wish to use to generate the guide content from.
   **/
  public GenerateGuideContentRequest url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "https://fileupload.genesys.com/orgs/123/456.1001847777_1001848412_a33bc09383e53314a3be61ca.sasf?X-Amz-Algorithm&#x3D;AWS4-HMAC-SHA256", value = "The URL of the file you wish to use to generate the guide content from.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateGuideContentRequest generateGuideContentRequest = (GenerateGuideContentRequest) o;

    return Objects.equals(this.description, generateGuideContentRequest.description) &&
            Objects.equals(this.url, generateGuideContentRequest.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGuideContentRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

