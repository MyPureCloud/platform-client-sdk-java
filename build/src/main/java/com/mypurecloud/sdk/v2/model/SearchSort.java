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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SearchSort
 */

public class SearchSort  implements Serializable {
  

  private static class SortOrderEnumDeserializer extends StdDeserializer<SortOrderEnum> {
    public SortOrderEnumDeserializer() {
      super(SortOrderEnumDeserializer.class);
    }

    @Override
    public SortOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The sort order for results
   */
 @JsonDeserialize(using = SortOrderEnumDeserializer.class)
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("ASC"),
    DESC("DESC"),
    SCORE("SCORE");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (SortOrderEnum value : SortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortOrderEnum sortOrder = null;
  private String sortBy = null;

  
  /**
   * The sort order for results
   **/
  public SearchSort sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort order for results")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  
  /**
   * The field in the resource that you want to sort the results by
   **/
  public SearchSort sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field in the resource that you want to sort the results by")
  @JsonProperty("sortBy")
  public String getSortBy() {
    return sortBy;
  }
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSort searchSort = (SearchSort) o;
    return Objects.equals(this.sortOrder, searchSort.sortOrder) &&
        Objects.equals(this.sortBy, searchSort.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSort {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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

