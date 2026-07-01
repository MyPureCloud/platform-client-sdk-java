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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ResponseAssetBulkRequest
 */

public class ResponseAssetBulkRequest  implements Serializable {
  
  private List<String> assetIds = null;
  private String sortBy = null;

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
    ASC("asc"),
    DESC("desc");

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

  public ResponseAssetBulkRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      assetIds = new ArrayList<String>();
    }
  }

  public ResponseAssetBulkRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      assetIds = new ArrayList<String>();
    }
  }

  
  /**
   * List of Response Asset IDs (max 50)
   **/
  public ResponseAssetBulkRequest assetIds(List<String> assetIds) {
    this.assetIds = assetIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of Response Asset IDs (max 50)")
  @JsonProperty("assetIds")
  public List<String> getAssetIds() {
    return assetIds;
  }
  public void setAssetIds(List<String> assetIds) {
    this.assetIds = assetIds;
  }


  /**
   * The field in the resource that you want to sort the results by. Allowed values: name, dateCreated, dateModified, contentLength
   **/
  public ResponseAssetBulkRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field in the resource that you want to sort the results by. Allowed values: name, dateCreated, dateModified, contentLength")
  @JsonProperty("sortBy")
  public String getSortBy() {
    return sortBy;
  }
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }


  /**
   * The sort order for results
   **/
  public ResponseAssetBulkRequest sortOrder(SortOrderEnum sortOrder) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAssetBulkRequest responseAssetBulkRequest = (ResponseAssetBulkRequest) o;

    return Objects.equals(this.assetIds, responseAssetBulkRequest.assetIds) &&
            Objects.equals(this.sortBy, responseAssetBulkRequest.sortBy) &&
            Objects.equals(this.sortOrder, responseAssetBulkRequest.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIds, sortBy, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAssetBulkRequest {\n");
    
    sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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

