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
 * IgnorePhrasesResponse
 */

public class IgnorePhrasesResponse  implements Serializable {
  
  private Integer totalPhrases = null;
  private Integer addedPhrases = null;
  private Integer updatedPhrases = null;

  public IgnorePhrasesResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Total number of phrases in current org
   **/
  public IgnorePhrasesResponse totalPhrases(Integer totalPhrases) {
    this.totalPhrases = totalPhrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of phrases in current org")
  @JsonProperty("totalPhrases")
  public Integer getTotalPhrases() {
    return totalPhrases;
  }
  public void setTotalPhrases(Integer totalPhrases) {
    this.totalPhrases = totalPhrases;
  }


  /**
   * Number of phrases added in current request
   **/
  public IgnorePhrasesResponse addedPhrases(Integer addedPhrases) {
    this.addedPhrases = addedPhrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of phrases added in current request")
  @JsonProperty("addedPhrases")
  public Integer getAddedPhrases() {
    return addedPhrases;
  }
  public void setAddedPhrases(Integer addedPhrases) {
    this.addedPhrases = addedPhrases;
  }


  /**
   * Number of phrases updated in current request
   **/
  public IgnorePhrasesResponse updatedPhrases(Integer updatedPhrases) {
    this.updatedPhrases = updatedPhrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Number of phrases updated in current request")
  @JsonProperty("updatedPhrases")
  public Integer getUpdatedPhrases() {
    return updatedPhrases;
  }
  public void setUpdatedPhrases(Integer updatedPhrases) {
    this.updatedPhrases = updatedPhrases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IgnorePhrasesResponse ignorePhrasesResponse = (IgnorePhrasesResponse) o;

    return Objects.equals(this.totalPhrases, ignorePhrasesResponse.totalPhrases) &&
            Objects.equals(this.addedPhrases, ignorePhrasesResponse.addedPhrases) &&
            Objects.equals(this.updatedPhrases, ignorePhrasesResponse.updatedPhrases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPhrases, addedPhrases, updatedPhrases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IgnorePhrasesResponse {\n");
    
    sb.append("    totalPhrases: ").append(toIndentedString(totalPhrases)).append("\n");
    sb.append("    addedPhrases: ").append(toIndentedString(addedPhrases)).append("\n");
    sb.append("    updatedPhrases: ").append(toIndentedString(updatedPhrases)).append("\n");
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

