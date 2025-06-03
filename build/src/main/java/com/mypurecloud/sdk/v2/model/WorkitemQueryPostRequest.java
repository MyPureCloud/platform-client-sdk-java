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
import com.mypurecloud.sdk.v2.model.WorkitemFilter;
import com.mypurecloud.sdk.v2.model.WorkitemQuerySort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkitemQueryPostRequest
 */

public class WorkitemQueryPostRequest  implements Serializable {
  
  private Integer pageSize = null;

  private static class SelectEnumDeserializer extends StdDeserializer<SelectEnum> {
    public SelectEnumDeserializer() {
      super(SelectEnumDeserializer.class);
    }

    @Override
    public SelectEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SelectEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specify the value 'Count' for this parameter in order to return only the record count.
   */
 @JsonDeserialize(using = SelectEnumDeserializer.class)
  public enum SelectEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COUNT("Count");

    private String value;

    SelectEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SelectEnum fromString(String key) {
      if (key == null) return null;

      for (SelectEnum value : SelectEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SelectEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SelectEnum select = null;
  private List<WorkitemFilter> filters = null;
  private List<String> attributes = null;
  private String after = null;
  private WorkitemQuerySort sort = null;

  private static class ExpandsEnumDeserializer extends StdDeserializer<ExpandsEnum> {
    public ExpandsEnumDeserializer() {
      super(ExpandsEnumDeserializer.class);
    }

    @Override
    public ExpandsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExpandsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets expands
   */
 @JsonDeserialize(using = ExpandsEnumDeserializer.class)
  public enum ExpandsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TYPE("type"),
    WORKBIN("workbin"),
    STATUS("status"),
    ASSIGNEE("assignee"),
    REPORTER("reporter"),
    QUEUE("queue");

    private String value;

    ExpandsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExpandsEnum fromString(String key) {
      if (key == null) return null;

      for (ExpandsEnum value : ExpandsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExpandsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ExpandsEnum> expands = null;

  public WorkitemQueryPostRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      filters = new ArrayList<WorkitemFilter>();
      attributes = new ArrayList<String>();
      expands = new ArrayList<ExpandsEnum>();
    }
  }

  
  /**
   * Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.
   **/
  public WorkitemQueryPostRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Limit the number of entities to return. It is not guaranteed that the requested number of entities will be filled in a single request. If an `after` key is returned as part of the response it is possible that more entities that match the filter criteria exist. Maximum of 200.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * Specify the value 'Count' for this parameter in order to return only the record count.
   **/
  public WorkitemQueryPostRequest select(SelectEnum select) {
    this.select = select;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify the value 'Count' for this parameter in order to return only the record count.")
  @JsonProperty("select")
  public SelectEnum getSelect() {
    return select;
  }
  public void setSelect(SelectEnum select) {
    this.select = select;
  }


  /**
   * List of filter objects to be used in the search.
   **/
  public WorkitemQueryPostRequest filters(List<WorkitemFilter> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of filter objects to be used in the search.")
  @JsonProperty("filters")
  public List<WorkitemFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<WorkitemFilter> filters) {
    this.filters = filters;
  }


  /**
   * List of entity attributes to be retrieved in the result.
   **/
  public WorkitemQueryPostRequest attributes(List<String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of entity attributes to be retrieved in the result.")
  @JsonProperty("attributes")
  public List<String> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }


  /**
   * The cursor that points to the end of the set of entities that has been returned.
   **/
  public WorkitemQueryPostRequest after(String after) {
    this.after = after;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cursor that points to the end of the set of entities that has been returned.")
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }
  public void setAfter(String after) {
    this.after = after;
  }


  /**
   * Sort
   **/
  public WorkitemQueryPostRequest sort(WorkitemQuerySort sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sort")
  @JsonProperty("sort")
  public WorkitemQuerySort getSort() {
    return sort;
  }
  public void setSort(WorkitemQuerySort sort) {
    this.sort = sort;
  }


  /**
   * List of entity attributes to be expanded in the result.
   **/
  public WorkitemQueryPostRequest expands(List<ExpandsEnum> expands) {
    this.expands = expands;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of entity attributes to be expanded in the result.")
  @JsonProperty("expands")
  public List<ExpandsEnum> getExpands() {
    return expands;
  }
  public void setExpands(List<ExpandsEnum> expands) {
    this.expands = expands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemQueryPostRequest workitemQueryPostRequest = (WorkitemQueryPostRequest) o;

    return Objects.equals(this.pageSize, workitemQueryPostRequest.pageSize) &&
            Objects.equals(this.select, workitemQueryPostRequest.select) &&
            Objects.equals(this.filters, workitemQueryPostRequest.filters) &&
            Objects.equals(this.attributes, workitemQueryPostRequest.attributes) &&
            Objects.equals(this.after, workitemQueryPostRequest.after) &&
            Objects.equals(this.sort, workitemQueryPostRequest.sort) &&
            Objects.equals(this.expands, workitemQueryPostRequest.expands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, select, filters, attributes, after, sort, expands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemQueryPostRequest {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    select: ").append(toIndentedString(select)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    expands: ").append(toIndentedString(expands)).append("\n");
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

