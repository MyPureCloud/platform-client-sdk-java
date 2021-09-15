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
import com.mypurecloud.sdk.v2.model.SearchSort;
import com.mypurecloud.sdk.v2.model.UserSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserSearchRequest
 */

public class UserSearchRequest  implements Serializable {
  

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
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<SearchSort> sort = new ArrayList<SearchSort>();
  private List<String> expand = new ArrayList<String>();
  private List<UserSearchCriteria> query = new ArrayList<UserSearchCriteria>();

  private static class IntegrationPresenceSourceEnumDeserializer extends StdDeserializer<IntegrationPresenceSourceEnum> {
    public IntegrationPresenceSourceEnumDeserializer() {
      super(IntegrationPresenceSourceEnumDeserializer.class);
    }

    @Override
    public IntegrationPresenceSourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IntegrationPresenceSourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\". When using this parameter the maximum number of users that can be returned is 100.
   */
 @JsonDeserialize(using = IntegrationPresenceSourceEnumDeserializer.class)
  public enum IntegrationPresenceSourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MICROSOFTTEAMS("MicrosoftTeams"),
    ZOOMPHONE("ZoomPhone"),
    RINGCENTRAL("RingCentral");

    private String value;

    IntegrationPresenceSourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IntegrationPresenceSourceEnum fromString(String key) {
      if (key == null) return null;

      for (IntegrationPresenceSourceEnum value : IntegrationPresenceSourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IntegrationPresenceSourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IntegrationPresenceSourceEnum integrationPresenceSource = null;
  private Boolean enforcePermissions = null;

  
  /**
   * The sort order for results
   **/
  public UserSearchRequest sortOrder(SortOrderEnum sortOrder) {
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
  public UserSearchRequest sortBy(String sortBy) {
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
   * The number of results per page
   **/
  public UserSearchRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results per page")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * The page of resources you want to retrieve
   **/
  public UserSearchRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page of resources you want to retrieve")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Multi-value sort order, list of multiple sort values
   **/
  public UserSearchRequest sort(List<SearchSort> sort) {
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
   * Provides more details about a specified resource
   **/
  public UserSearchRequest expand(List<String> expand) {
    this.expand = expand;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides more details about a specified resource")
  @JsonProperty("expand")
  public List<String> getExpand() {
    return expand;
  }
  public void setExpand(List<String> expand) {
    this.expand = expand;
  }

  
  /**
   **/
  public UserSearchRequest query(List<UserSearchCriteria> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("query")
  public List<UserSearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<UserSearchCriteria> query) {
    this.query = query;
  }

  
  /**
   * Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\". When using this parameter the maximum number of users that can be returned is 100.
   **/
  public UserSearchRequest integrationPresenceSource(IntegrationPresenceSourceEnum integrationPresenceSource) {
    this.integrationPresenceSource = integrationPresenceSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gets an integration presence for users instead of their defaults. This parameter will only be used when presence is provided as an \"expand\". When using this parameter the maximum number of users that can be returned is 100.")
  @JsonProperty("integrationPresenceSource")
  public IntegrationPresenceSourceEnum getIntegrationPresenceSource() {
    return integrationPresenceSource;
  }
  public void setIntegrationPresenceSource(IntegrationPresenceSourceEnum integrationPresenceSource) {
    this.integrationPresenceSource = integrationPresenceSource;
  }

  
  /**
   * This property only applies to api/v2/user/search; when set to true add additional search criteria to filter users by: directory:user:view
   **/
  public UserSearchRequest enforcePermissions(Boolean enforcePermissions) {
    this.enforcePermissions = enforcePermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property only applies to api/v2/user/search; when set to true add additional search criteria to filter users by: directory:user:view")
  @JsonProperty("enforcePermissions")
  public Boolean getEnforcePermissions() {
    return enforcePermissions;
  }
  public void setEnforcePermissions(Boolean enforcePermissions) {
    this.enforcePermissions = enforcePermissions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSearchRequest userSearchRequest = (UserSearchRequest) o;
    return Objects.equals(this.sortOrder, userSearchRequest.sortOrder) &&
        Objects.equals(this.sortBy, userSearchRequest.sortBy) &&
        Objects.equals(this.pageSize, userSearchRequest.pageSize) &&
        Objects.equals(this.pageNumber, userSearchRequest.pageNumber) &&
        Objects.equals(this.sort, userSearchRequest.sort) &&
        Objects.equals(this.expand, userSearchRequest.expand) &&
        Objects.equals(this.query, userSearchRequest.query) &&
        Objects.equals(this.integrationPresenceSource, userSearchRequest.integrationPresenceSource) &&
        Objects.equals(this.enforcePermissions, userSearchRequest.enforcePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy, pageSize, pageNumber, sort, expand, query, integrationPresenceSource, enforcePermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSearchRequest {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    integrationPresenceSource: ").append(toIndentedString(integrationPresenceSource)).append("\n");
    sb.append("    enforcePermissions: ").append(toIndentedString(enforcePermissions)).append("\n");
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

