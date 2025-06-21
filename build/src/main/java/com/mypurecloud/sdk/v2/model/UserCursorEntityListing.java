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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserCursorEntityListing
 */

public class UserCursorEntityListing  implements Serializable {
  
  private List<User> entities = null;
  private String nextUri = null;
  private String selfUri = null;
  private Integer results = null;
  private String cursor = null;

  public UserCursorEntityListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<User>();
    }
  }

  
  /**
   **/
  public UserCursorEntityListing entities(List<User> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<User> getEntities() {
    return entities;
  }
  public void setEntities(List<User> entities) {
    this.entities = entities;
  }


  /**
   * URI to next page of users
   **/
  public UserCursorEntityListing nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI to next page of users")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * URI of current page of users
   **/
  public UserCursorEntityListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URI of current page of users")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   * Number of users in response
   **/
  public UserCursorEntityListing results(Integer results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of users in response")
  @JsonProperty("results")
  public Integer getResults() {
    return results;
  }
  public void setResults(Integer results) {
    this.results = results;
  }


  /**
   * Cursor token to retrieve next page
   **/
  public UserCursorEntityListing cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cursor token to retrieve next page")
  @JsonProperty("cursor")
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCursorEntityListing userCursorEntityListing = (UserCursorEntityListing) o;

    return Objects.equals(this.entities, userCursorEntityListing.entities) &&
            Objects.equals(this.nextUri, userCursorEntityListing.nextUri) &&
            Objects.equals(this.selfUri, userCursorEntityListing.selfUri) &&
            Objects.equals(this.results, userCursorEntityListing.results) &&
            Objects.equals(this.cursor, userCursorEntityListing.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, nextUri, selfUri, results, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCursorEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

