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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CustomerIntentResponse
 */

public class CustomerIntentResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Integer expiryTime = null;
  private AddressableEntityRef category = null;
  private Date dateCreated = null;
  private String selfUri = null;

  public CustomerIntentResponse() {
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
  public CustomerIntentResponse name(String name) {
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
  public CustomerIntentResponse description(String description) {
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
  public CustomerIntentResponse expiryTime(Integer expiryTime) {
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


  @ApiModelProperty(example = "null", value = "Category of the customer intent")
  @JsonProperty("category")
  public AddressableEntityRef getCategory() {
    return category;
  }


  @ApiModelProperty(example = "null", value = "Creation date of the customer intent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
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
    CustomerIntentResponse customerIntentResponse = (CustomerIntentResponse) o;

    return Objects.equals(this.id, customerIntentResponse.id) &&
            Objects.equals(this.name, customerIntentResponse.name) &&
            Objects.equals(this.description, customerIntentResponse.description) &&
            Objects.equals(this.expiryTime, customerIntentResponse.expiryTime) &&
            Objects.equals(this.category, customerIntentResponse.category) &&
            Objects.equals(this.dateCreated, customerIntentResponse.dateCreated) &&
            Objects.equals(this.selfUri, customerIntentResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, expiryTime, category, dateCreated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerIntentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
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

