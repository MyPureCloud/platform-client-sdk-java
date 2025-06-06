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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationParticipantSearchCriteria;
import com.mypurecloud.sdk.v2.model.SearchSort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationParticipantSearchRequest
 */

public class ConversationParticipantSearchRequest  implements Serializable {
  

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
  private List<SearchSort> sort = null;
  private List<String> returnFields = null;
  private List<ConversationParticipantSearchCriteria> query = null;
  private String cursor = null;

  public ConversationParticipantSearchRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sort = new ArrayList<SearchSort>();
      returnFields = new ArrayList<String>();
      query = new ArrayList<ConversationParticipantSearchCriteria>();
    }
  }

  
  /**
   * The sort order for results
   **/
  public ConversationParticipantSearchRequest sortOrder(SortOrderEnum sortOrder) {
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
  public ConversationParticipantSearchRequest sortBy(String sortBy) {
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


  /**
   * Multi-value sort order, list of multiple sort values
   **/
  public ConversationParticipantSearchRequest sort(List<SearchSort> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Multi-value sort order, list of multiple sort values")
  @JsonProperty("sort")
  public List<SearchSort> getSort() {
    return sort;
  }
  public void setSort(List<SearchSort> sort) {
    this.sort = sort;
  }


  /**
   **/
  public ConversationParticipantSearchRequest returnFields(List<String> returnFields) {
    this.returnFields = returnFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("returnFields")
  public List<String> getReturnFields() {
    return returnFields;
  }
  public void setReturnFields(List<String> returnFields) {
    this.returnFields = returnFields;
  }


  /**
   **/
  public ConversationParticipantSearchRequest query(List<ConversationParticipantSearchCriteria> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("query")
  public List<ConversationParticipantSearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<ConversationParticipantSearchCriteria> query) {
    this.query = query;
  }


  /**
   **/
  public ConversationParticipantSearchRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cursor")
  public String getCursor() {
    return cursor;
  }
  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationParticipantSearchRequest conversationParticipantSearchRequest = (ConversationParticipantSearchRequest) o;

    return Objects.equals(this.sortOrder, conversationParticipantSearchRequest.sortOrder) &&
            Objects.equals(this.sortBy, conversationParticipantSearchRequest.sortBy) &&
            Objects.equals(this.sort, conversationParticipantSearchRequest.sort) &&
            Objects.equals(this.returnFields, conversationParticipantSearchRequest.returnFields) &&
            Objects.equals(this.query, conversationParticipantSearchRequest.query) &&
            Objects.equals(this.cursor, conversationParticipantSearchRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy, sort, returnFields, query, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationParticipantSearchRequest {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

