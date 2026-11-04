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
import com.mypurecloud.sdk.v2.model.SimilarEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SimilarCustomerIntentResult
 */

public class SimilarCustomerIntentResult  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Integer expiryTime = null;
  private Double distance = null;
  private SimilarEntityRef category = null;
  private Date dateCreated = null;
  private String selfUri = null;

  public SimilarCustomerIntentResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SimilarCustomerIntentResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
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
  public SimilarCustomerIntentResult name(String name) {
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
  public SimilarCustomerIntentResult description(String description) {
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
  public SimilarCustomerIntentResult expiryTime(Integer expiryTime) {
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
   * The distance score indicating similarity (lower is more similar)
   **/
  public SimilarCustomerIntentResult distance(Double distance) {
    this.distance = distance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The distance score indicating similarity (lower is more similar)")
  @JsonProperty("distance")
  public Double getDistance() {
    return distance;
  }
  public void setDistance(Double distance) {
    this.distance = distance;
  }


  /**
   * The category of the similar customer intent
   **/
  public SimilarCustomerIntentResult category(SimilarEntityRef category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of the similar customer intent")
  @JsonProperty("category")
  public SimilarEntityRef getCategory() {
    return category;
  }
  public void setCategory(SimilarEntityRef category) {
    this.category = category;
  }


  /**
   * Creation date of the customer intent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SimilarCustomerIntentResult dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation date of the customer intent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
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
    SimilarCustomerIntentResult similarCustomerIntentResult = (SimilarCustomerIntentResult) o;

    return Objects.equals(this.id, similarCustomerIntentResult.id) &&
            Objects.equals(this.name, similarCustomerIntentResult.name) &&
            Objects.equals(this.description, similarCustomerIntentResult.description) &&
            Objects.equals(this.expiryTime, similarCustomerIntentResult.expiryTime) &&
            Objects.equals(this.distance, similarCustomerIntentResult.distance) &&
            Objects.equals(this.category, similarCustomerIntentResult.category) &&
            Objects.equals(this.dateCreated, similarCustomerIntentResult.dateCreated) &&
            Objects.equals(this.selfUri, similarCustomerIntentResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, expiryTime, distance, category, dateCreated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarCustomerIntentResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

