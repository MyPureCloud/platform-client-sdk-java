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
 * ContestPrizes
 */

public class ContestPrizes  implements Serializable {
  
  private Integer tier = null;
  private String name = null;
  private String description = null;
  private String imageId = null;
  private String imageUrl = null;
  private Integer winnersCount = null;

  public ContestPrizes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Contest Prize tier
   **/
  public ContestPrizes tier(Integer tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest Prize tier")
  @JsonProperty("tier")
  public Integer getTier() {
    return tier;
  }
  public void setTier(Integer tier) {
    this.tier = tier;
  }


  /**
   * The Contest Prize name
   **/
  public ContestPrizes name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest Prize name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The Contest Prize description
   **/
  public ContestPrizes description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest Prize description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The Contest Prize image id
   **/
  public ContestPrizes imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest Prize image id")
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  @ApiModelProperty(example = "null", value = "The Contest Prize image url")
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }


  /**
   * The Contest Prize winner Count
   **/
  public ContestPrizes winnersCount(Integer winnersCount) {
    this.winnersCount = winnersCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest Prize winner Count")
  @JsonProperty("winnersCount")
  public Integer getWinnersCount() {
    return winnersCount;
  }
  public void setWinnersCount(Integer winnersCount) {
    this.winnersCount = winnersCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestPrizes contestPrizes = (ContestPrizes) o;

    return Objects.equals(this.tier, contestPrizes.tier) &&
            Objects.equals(this.name, contestPrizes.name) &&
            Objects.equals(this.description, contestPrizes.description) &&
            Objects.equals(this.imageId, contestPrizes.imageId) &&
            Objects.equals(this.imageUrl, contestPrizes.imageUrl) &&
            Objects.equals(this.winnersCount, contestPrizes.winnersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, name, description, imageId, imageUrl, winnersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestPrizes {\n");
    
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    winnersCount: ").append(toIndentedString(winnersCount)).append("\n");
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

