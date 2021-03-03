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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContentSortItem
 */

public class ContentSortItem  implements Serializable {
  
  private String name = null;
  private Boolean ascending = null;

  
  /**
   **/
  public ContentSortItem name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public ContentSortItem ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ascending")
  public Boolean getAscending() {
    return ascending;
  }
  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentSortItem contentSortItem = (ContentSortItem) o;
    return Objects.equals(this.name, contentSortItem.name) &&
        Objects.equals(this.ascending, contentSortItem.ascending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ascending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSortItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
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

