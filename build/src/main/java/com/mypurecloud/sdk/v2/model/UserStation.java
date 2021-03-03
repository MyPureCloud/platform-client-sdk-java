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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UserStation
 */

public class UserStation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private User associatedUser = null;
  private Date associatedDate = null;
  private User defaultUser = null;
  private Map<String, String> providerInfo = null;

  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for this station")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserStation name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public UserStation type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public UserStation associatedUser(User associatedUser) {
    this.associatedUser = associatedUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("associatedUser")
  public User getAssociatedUser() {
    return associatedUser;
  }
  public void setAssociatedUser(User associatedUser) {
    this.associatedUser = associatedUser;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserStation associatedDate(Date associatedDate) {
    this.associatedDate = associatedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("associatedDate")
  public Date getAssociatedDate() {
    return associatedDate;
  }
  public void setAssociatedDate(Date associatedDate) {
    this.associatedDate = associatedDate;
  }

  
  /**
   **/
  public UserStation defaultUser(User defaultUser) {
    this.defaultUser = defaultUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultUser")
  public User getDefaultUser() {
    return defaultUser;
  }
  public void setDefaultUser(User defaultUser) {
    this.defaultUser = defaultUser;
  }

  
  /**
   * Provider-specific info for this station, e.g. { \"edgeGroupId\": \"ffe7b15c-a9cc-4f4c-88f5-781327819a49\" }
   **/
  public UserStation providerInfo(Map<String, String> providerInfo) {
    this.providerInfo = providerInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provider-specific info for this station, e.g. { \"edgeGroupId\": \"ffe7b15c-a9cc-4f4c-88f5-781327819a49\" }")
  @JsonProperty("providerInfo")
  public Map<String, String> getProviderInfo() {
    return providerInfo;
  }
  public void setProviderInfo(Map<String, String> providerInfo) {
    this.providerInfo = providerInfo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStation userStation = (UserStation) o;
    return Objects.equals(this.id, userStation.id) &&
        Objects.equals(this.name, userStation.name) &&
        Objects.equals(this.type, userStation.type) &&
        Objects.equals(this.associatedUser, userStation.associatedUser) &&
        Objects.equals(this.associatedDate, userStation.associatedDate) &&
        Objects.equals(this.defaultUser, userStation.defaultUser) &&
        Objects.equals(this.providerInfo, userStation.providerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, associatedUser, associatedDate, defaultUser, providerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    associatedUser: ").append(toIndentedString(associatedUser)).append("\n");
    sb.append("    associatedDate: ").append(toIndentedString(associatedDate)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    providerInfo: ").append(toIndentedString(providerInfo)).append("\n");
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

