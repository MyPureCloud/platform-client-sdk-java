package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserTokensTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserTokensTopicTokenNotification
 */

public class UserTokensTopicTokenNotification  implements Serializable {
  
  private UserTokensTopicUriReference user = null;
  private String ipAddress = null;
  private String dateCreated = null;
  private String tokenExpirationDate = null;

  
  /**
   **/
  public UserTokensTopicTokenNotification user(UserTokensTopicUriReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public UserTokensTopicUriReference getUser() {
    return user;
  }
  public void setUser(UserTokensTopicUriReference user) {
    this.user = user;
  }

  
  /**
   **/
  public UserTokensTopicTokenNotification ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipAddress")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   **/
  public UserTokensTopicTokenNotification dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public String getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public UserTokensTopicTokenNotification tokenExpirationDate(String tokenExpirationDate) {
    this.tokenExpirationDate = tokenExpirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tokenExpirationDate")
  public String getTokenExpirationDate() {
    return tokenExpirationDate;
  }
  public void setTokenExpirationDate(String tokenExpirationDate) {
    this.tokenExpirationDate = tokenExpirationDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTokensTopicTokenNotification userTokensTopicTokenNotification = (UserTokensTopicTokenNotification) o;
    return Objects.equals(this.user, userTokensTopicTokenNotification.user) &&
        Objects.equals(this.ipAddress, userTokensTopicTokenNotification.ipAddress) &&
        Objects.equals(this.dateCreated, userTokensTopicTokenNotification.dateCreated) &&
        Objects.equals(this.tokenExpirationDate, userTokensTopicTokenNotification.tokenExpirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, ipAddress, dateCreated, tokenExpirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokensTopicTokenNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    tokenExpirationDate: ").append(toIndentedString(tokenExpirationDate)).append("\n");
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

