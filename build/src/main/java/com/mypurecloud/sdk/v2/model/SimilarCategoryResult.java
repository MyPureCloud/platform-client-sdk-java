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
import com.mypurecloud.sdk.v2.model.CustomerIntentUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SimilarCategoryResult
 */

public class SimilarCategoryResult  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Date dateCreated = null;
  private List<CustomerIntentUsage> usage = null;
  private Double distance = null;
  private String selfUri = null;

  public SimilarCategoryResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      usage = new ArrayList<CustomerIntentUsage>();
    }
  }

  public SimilarCategoryResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      usage = new ArrayList<CustomerIntentUsage>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Name of the category
   **/
  public SimilarCategoryResult name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the category")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Description of the category
   **/
  public SimilarCategoryResult description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description of the category")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "Creation date of the category. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Places where the category is used. Omitted when usage tracking is off or includeUsage is false or omitted. Otherwise, empty when unused or populated with usage entries.")
  @JsonProperty("usage")
  public List<CustomerIntentUsage> getUsage() {
    return usage;
  }


  /**
   * The distance score indicating similarity (lower is more similar)
   **/
  public SimilarCategoryResult distance(Double distance) {
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
    SimilarCategoryResult similarCategoryResult = (SimilarCategoryResult) o;

    return Objects.equals(this.id, similarCategoryResult.id) &&
            Objects.equals(this.name, similarCategoryResult.name) &&
            Objects.equals(this.description, similarCategoryResult.description) &&
            Objects.equals(this.dateCreated, similarCategoryResult.dateCreated) &&
            Objects.equals(this.usage, similarCategoryResult.usage) &&
            Objects.equals(this.distance, similarCategoryResult.distance) &&
            Objects.equals(this.selfUri, similarCategoryResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateCreated, usage, distance, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarCategoryResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

