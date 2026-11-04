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
 * SimilarCustomerIntentsRequest
 */

public class SimilarCustomerIntentsRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String categoryId = null;

  public SimilarCustomerIntentsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SimilarCustomerIntentsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Name to find similar customer intents for
   **/
  public SimilarCustomerIntentsRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name to find similar customer intents for")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Description to find similar customer intents for
   **/
  public SimilarCustomerIntentsRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description to find similar customer intents for")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Optional category ID to scope the similarity search
   **/
  public SimilarCustomerIntentsRequest categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional category ID to scope the similarity search")
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarCustomerIntentsRequest similarCustomerIntentsRequest = (SimilarCustomerIntentsRequest) o;

    return Objects.equals(this.name, similarCustomerIntentsRequest.name) &&
            Objects.equals(this.description, similarCustomerIntentsRequest.description) &&
            Objects.equals(this.categoryId, similarCustomerIntentsRequest.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarCustomerIntentsRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

