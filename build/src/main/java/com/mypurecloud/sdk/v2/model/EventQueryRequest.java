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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EventQueryRequest
 */

public class EventQueryRequest  implements Serializable {
  
  private String interval = null;
  private List<String> eventDefinitionIds = new ArrayList<String>();
  private String searchTerm = null;

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
   * Order of results. Default order is DESC.
   */
 @JsonDeserialize(using = SortOrderEnumDeserializer.class)
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("ASC"),
    DESC("DESC");

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

  
  /**
   * Date and time range to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public EventQueryRequest interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date and time range to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * Filter events by a list of event definition ids
   **/
  public EventQueryRequest eventDefinitionIds(List<String> eventDefinitionIds) {
    this.eventDefinitionIds = eventDefinitionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter events by a list of event definition ids")
  @JsonProperty("eventDefinitionIds")
  public List<String> getEventDefinitionIds() {
    return eventDefinitionIds;
  }
  public void setEventDefinitionIds(List<String> eventDefinitionIds) {
    this.eventDefinitionIds = eventDefinitionIds;
  }


  /**
   * Only return events that contain the search term
   **/
  public EventQueryRequest searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Only return events that contain the search term")
  @JsonProperty("searchTerm")
  public String getSearchTerm() {
    return searchTerm;
  }
  public void setSearchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
  }


  /**
   * Order of results. Default order is DESC.
   **/
  public EventQueryRequest sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Order of results. Default order is DESC.")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventQueryRequest eventQueryRequest = (EventQueryRequest) o;

    return Objects.equals(this.interval, eventQueryRequest.interval) &&
            Objects.equals(this.eventDefinitionIds, eventQueryRequest.eventDefinitionIds) &&
            Objects.equals(this.searchTerm, eventQueryRequest.searchTerm) &&
            Objects.equals(this.sortOrder, eventQueryRequest.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, eventDefinitionIds, searchTerm, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventQueryRequest {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    eventDefinitionIds: ").append(toIndentedString(eventDefinitionIds)).append("\n");
    sb.append("    searchTerm: ").append(toIndentedString(searchTerm)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

