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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * LearningAssignmentStepSignedCookie
 */

public class LearningAssignmentStepSignedCookie  implements Serializable {
  
  private String url = null;
  private Map<String, String> cookieValues = null;

  
  @ApiModelProperty(example = "null", value = "The base URL for the signed cookie")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }


  @ApiModelProperty(example = "null", value = "The cookie values required to access content from the base URL")
  @JsonProperty("cookieValues")
  public Map<String, String> getCookieValues() {
    return cookieValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentStepSignedCookie learningAssignmentStepSignedCookie = (LearningAssignmentStepSignedCookie) o;

    return Objects.equals(this.url, learningAssignmentStepSignedCookie.url) &&
            Objects.equals(this.cookieValues, learningAssignmentStepSignedCookie.cookieValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, cookieValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentStepSignedCookie {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    cookieValues: ").append(toIndentedString(cookieValues)).append("\n");
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

