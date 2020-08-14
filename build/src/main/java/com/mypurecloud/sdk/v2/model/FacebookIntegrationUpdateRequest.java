package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FacebookIntegrationUpdateRequest
 */

public class FacebookIntegrationUpdateRequest  implements Serializable {
  
  private String pageAccessToken = null;
  private String userAccessToken = null;

  
  /**
   * The long-lived Page Access Token of a facebook page.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  Either pageAccessToken or userAccessToken should be provided.
   **/
  public FacebookIntegrationUpdateRequest pageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The long-lived Page Access Token of a facebook page.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  Either pageAccessToken or userAccessToken should be provided.")
  @JsonProperty("pageAccessToken")
  public String getPageAccessToken() {
    return pageAccessToken;
  }
  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }

  
  /**
   * The short-lived User Access Token of the facebook user logged into the facebook app.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  Either pageAccessToken or userAccessToken should be provided.
   **/
  public FacebookIntegrationUpdateRequest userAccessToken(String userAccessToken) {
    this.userAccessToken = userAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The short-lived User Access Token of the facebook user logged into the facebook app.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  Either pageAccessToken or userAccessToken should be provided.")
  @JsonProperty("userAccessToken")
  public String getUserAccessToken() {
    return userAccessToken;
  }
  public void setUserAccessToken(String userAccessToken) {
    this.userAccessToken = userAccessToken;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacebookIntegrationUpdateRequest facebookIntegrationUpdateRequest = (FacebookIntegrationUpdateRequest) o;
    return Objects.equals(this.pageAccessToken, facebookIntegrationUpdateRequest.pageAccessToken) &&
        Objects.equals(this.userAccessToken, facebookIntegrationUpdateRequest.userAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageAccessToken, userAccessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookIntegrationUpdateRequest {\n");
    
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    userAccessToken: ").append(toIndentedString(userAccessToken)).append("\n");
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

