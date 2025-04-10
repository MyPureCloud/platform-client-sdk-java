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
import com.mypurecloud.sdk.v2.model.ComplianceResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OptInSettings
 */

public class OptInSettings  implements Serializable {
  
  private List<String> keyword = null;
  private ComplianceResponse response = null;

  public OptInSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      keyword = new ArrayList<String>();
    }
  }

  
  /**
   * List of keywords for compliance
   **/
  public OptInSettings keyword(List<String> keyword) {
    this.keyword = keyword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of keywords for compliance")
  @JsonProperty("keyword")
  public List<String> getKeyword() {
    return keyword;
  }
  public void setKeyword(List<String> keyword) {
    this.keyword = keyword;
  }


  /**
   * The response configuration for the keywords
   **/
  public OptInSettings response(ComplianceResponse response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The response configuration for the keywords")
  @JsonProperty("response")
  public ComplianceResponse getResponse() {
    return response;
  }
  public void setResponse(ComplianceResponse response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptInSettings optInSettings = (OptInSettings) o;

    return Objects.equals(this.keyword, optInSettings.keyword) &&
            Objects.equals(this.response, optInSettings.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptInSettings {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

