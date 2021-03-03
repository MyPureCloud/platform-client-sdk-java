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
import com.mypurecloud.sdk.v2.model.WebChatMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WebChatMessageEntityList
 */

public class WebChatMessageEntityList  implements Serializable {
  
  private Integer pageSize = null;
  private List<WebChatMessage> entities = new ArrayList<WebChatMessage>();
  private String previousPage = null;
  private String next = null;
  private String selfUri = null;

  
  /**
   **/
  public WebChatMessageEntityList pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   **/
  public WebChatMessageEntityList entities(List<WebChatMessage> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WebChatMessage> getEntities() {
    return entities;
  }
  public void setEntities(List<WebChatMessage> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public WebChatMessageEntityList previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousPage")
  public String getPreviousPage() {
    return previousPage;
  }
  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }

  
  /**
   **/
  public WebChatMessageEntityList next(String next) {
    this.next = next;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  
  /**
   **/
  public WebChatMessageEntityList selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebChatMessageEntityList webChatMessageEntityList = (WebChatMessageEntityList) o;
    return Objects.equals(this.pageSize, webChatMessageEntityList.pageSize) &&
        Objects.equals(this.entities, webChatMessageEntityList.entities) &&
        Objects.equals(this.previousPage, webChatMessageEntityList.previousPage) &&
        Objects.equals(this.next, webChatMessageEntityList.next) &&
        Objects.equals(this.selfUri, webChatMessageEntityList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, entities, previousPage, next, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatMessageEntityList {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

