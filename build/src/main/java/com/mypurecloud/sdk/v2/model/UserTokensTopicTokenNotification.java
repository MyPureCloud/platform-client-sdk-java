package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
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
  private String sessionId = null;
  private String clientId = null;
  private String tokenHash = null;

  
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

  
  /**
   **/
  public UserTokensTopicTokenNotification sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   **/
  public UserTokensTopicTokenNotification clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   **/
  public UserTokensTopicTokenNotification tokenHash(String tokenHash) {
    this.tokenHash = tokenHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tokenHash")
  public String getTokenHash() {
    return tokenHash;
  }
  public void setTokenHash(String tokenHash) {
    this.tokenHash = tokenHash;
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
        Objects.equals(this.tokenExpirationDate, userTokensTopicTokenNotification.tokenExpirationDate) &&
        Objects.equals(this.sessionId, userTokensTopicTokenNotification.sessionId) &&
        Objects.equals(this.clientId, userTokensTopicTokenNotification.clientId) &&
        Objects.equals(this.tokenHash, userTokensTopicTokenNotification.tokenHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, ipAddress, dateCreated, tokenExpirationDate, sessionId, clientId, tokenHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTokensTopicTokenNotification {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    tokenExpirationDate: ").append(toIndentedString(tokenExpirationDate)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    tokenHash: ").append(toIndentedString(tokenHash)).append("\n");
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

