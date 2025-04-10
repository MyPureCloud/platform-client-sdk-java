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
 * CriteriaCategoryInfo
 */

public class CriteriaCategoryInfo  implements Serializable {
  
  private String categoryId = null;
  private Integer displayOrder = null;

  public CriteriaCategoryInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public CriteriaCategoryInfo categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  /**
   **/
  public CriteriaCategoryInfo displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayOrder")
  public Integer getDisplayOrder() {
    return displayOrder;
  }
  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriteriaCategoryInfo criteriaCategoryInfo = (CriteriaCategoryInfo) o;

    return Objects.equals(this.categoryId, criteriaCategoryInfo.categoryId) &&
            Objects.equals(this.displayOrder, criteriaCategoryInfo.displayOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, displayOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriteriaCategoryInfo {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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

