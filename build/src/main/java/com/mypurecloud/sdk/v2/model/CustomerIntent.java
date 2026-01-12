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
 * CustomerIntent
 */

public class CustomerIntent  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Integer expiryTime = null;
  private String categoryId = null;
  private String selfUri = null;

  public CustomerIntent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Name of the customer intent
   **/
  public CustomerIntent name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the customer intent")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Description of the customer intent
   **/
  public CustomerIntent description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description of the customer intent")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Expiry time in hours of the customer intent
   **/
  public CustomerIntent expiryTime(Integer expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Expiry time in hours of the customer intent")
  @JsonProperty("expiryTime")
  public Integer getExpiryTime() {
    return expiryTime;
  }
  public void setExpiryTime(Integer expiryTime) {
    this.expiryTime = expiryTime;
  }


  /**
   * CategoryId of the customer intent
   **/
  public CustomerIntent categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CategoryId of the customer intent")
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerIntent customerIntent = (CustomerIntent) o;

    return Objects.equals(this.id, customerIntent.id) &&
            Objects.equals(this.name, customerIntent.name) &&
            Objects.equals(this.description, customerIntent.description) &&
            Objects.equals(this.expiryTime, customerIntent.expiryTime) &&
            Objects.equals(this.categoryId, customerIntent.categoryId) &&
            Objects.equals(this.selfUri, customerIntent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, expiryTime, categoryId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerIntent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

