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
import com.mypurecloud.sdk.v2.model.CaseQueryJobFilter;
import com.mypurecloud.sdk.v2.model.CaseQueryJobSort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CaseQueryJobCreate
 */

public class CaseQueryJobCreate  implements Serializable {
  
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<CaseQueryJobFilter> filters = null;
  private CaseQueryJobSort sort = null;

  private static class AttributesEnumDeserializer extends StdDeserializer<AttributesEnum> {
    public AttributesEnumDeserializer() {
      super(AttributesEnumDeserializer.class);
    }

    @Override
    public AttributesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AttributesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets attributes
   */
 @JsonDeserialize(using = AttributesEnumDeserializer.class)
  public enum AttributesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ID("id"),
    REFERENCE("reference"),
    CASEPLANID("caseplanId"),
    CASEPLANVERSION("caseplanVersion"),
    OWNER("owner"),
    STATUS("status"),
    PRIORITY("priority"),
    EXTERNALCONTACTID("externalContactId"),
    CUSTOMERINTENT("customerIntent"),
    DIVISION("division"),
    DATEDUE("dateDue"),
    DATESTARTED("dateStarted"),
    DATECLOSED("dateClosed"),
    DATECREATED("dateCreated"),
    DATEMODIFIED("dateModified"),
    MODIFIEDBY("modifiedBy"),
    SUMMARY("summary"),
    VERSION("version"),
    TTLSECONDS("ttlSeconds"),
    CREATIONSTATUS("creationStatus");

    private String value;

    AttributesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AttributesEnum fromString(String key) {
      if (key == null) return null;

      for (AttributesEnum value : AttributesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AttributesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<AttributesEnum> attributes = null;

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
    CASEPLAN("caseplan"),
    OWNER("owner"),
    MODIFIEDBY("modifiedBy"),
    EXTERNALCONTACT("externalContact"),
    CUSTOMERINTENT("customerIntent");

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

  public CaseQueryJobCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      filters = new ArrayList<CaseQueryJobFilter>();
      attributes = new ArrayList<AttributesEnum>();
      expands = new ArrayList<ExpandsEnum>();
    }
  }

  public CaseQueryJobCreate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      filters = new ArrayList<CaseQueryJobFilter>();
      attributes = new ArrayList<AttributesEnum>();
      expands = new ArrayList<ExpandsEnum>();
    }
  }

  
  /**
   * The total page size requested (default 25).
   * minimum: 1
   * maximum: 100
   **/
  public CaseQueryJobCreate pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total page size requested (default 25).")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * The requested page number.
   * minimum: 1
   **/
  public CaseQueryJobCreate pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The requested page number.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * List of filter objects to be used in the search. Use an empty list to run the query with no filters.
   **/
  public CaseQueryJobCreate filters(List<CaseQueryJobFilter> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of filter objects to be used in the search. Use an empty list to run the query with no filters.")
  @JsonProperty("filters")
  public List<CaseQueryJobFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<CaseQueryJobFilter> filters) {
    this.filters = filters;
  }


  /**
   * Sort order for results.
   **/
  public CaseQueryJobCreate sort(CaseQueryJobSort sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sort order for results.")
  @JsonProperty("sort")
  public CaseQueryJobSort getSort() {
    return sort;
  }
  public void setSort(CaseQueryJobSort sort) {
    this.sort = sort;
  }


  /**
   * List of entity attributes to be retrieved in the result.
   **/
  public CaseQueryJobCreate attributes(List<AttributesEnum> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of entity attributes to be retrieved in the result.")
  @JsonProperty("attributes")
  public List<AttributesEnum> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<AttributesEnum> attributes) {
    this.attributes = attributes;
  }


  /**
   * Attributes to expand on each case in the job results. Expands are stored on the job and enriched by PubAPI when results are fetched.
   **/
  public CaseQueryJobCreate expands(List<ExpandsEnum> expands) {
    this.expands = expands;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attributes to expand on each case in the job results. Expands are stored on the job and enriched by PubAPI when results are fetched.")
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
    CaseQueryJobCreate caseQueryJobCreate = (CaseQueryJobCreate) o;

    return Objects.equals(this.pageSize, caseQueryJobCreate.pageSize) &&
            Objects.equals(this.pageNumber, caseQueryJobCreate.pageNumber) &&
            Objects.equals(this.filters, caseQueryJobCreate.filters) &&
            Objects.equals(this.sort, caseQueryJobCreate.sort) &&
            Objects.equals(this.attributes, caseQueryJobCreate.attributes) &&
            Objects.equals(this.expands, caseQueryJobCreate.expands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, filters, sort, attributes, expands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseQueryJobCreate {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

