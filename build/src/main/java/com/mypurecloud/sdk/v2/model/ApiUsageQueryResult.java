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
import com.mypurecloud.sdk.v2.model.ApiUsageRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ApiUsageQueryResult
 */

public class ApiUsageQueryResult  implements Serializable {
  
  private List<ApiUsageRow> results = new ArrayList<ApiUsageRow>();

  private static class QueryStatusEnumDeserializer extends StdDeserializer<QueryStatusEnum> {
    public QueryStatusEnumDeserializer() {
      super(QueryStatusEnumDeserializer.class);
    }

    @Override
    public QueryStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QueryStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Query status
   */
 @JsonDeserialize(using = QueryStatusEnumDeserializer.class)
  public enum QueryStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("Complete"),
    FAILED("Failed"),
    RUNNING("Running");

    private String value;

    QueryStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QueryStatusEnum fromString(String key) {
      if (key == null) return null;

      for (QueryStatusEnum value : QueryStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QueryStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QueryStatusEnum queryStatus = null;

  
  /**
   * Query results
   **/
  public ApiUsageQueryResult results(List<ApiUsageRow> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query results")
  @JsonProperty("results")
  public List<ApiUsageRow> getResults() {
    return results;
  }
  public void setResults(List<ApiUsageRow> results) {
    this.results = results;
  }

  
  /**
   * Query status
   **/
  public ApiUsageQueryResult queryStatus(QueryStatusEnum queryStatus) {
    this.queryStatus = queryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query status")
  @JsonProperty("queryStatus")
  public QueryStatusEnum getQueryStatus() {
    return queryStatus;
  }
  public void setQueryStatus(QueryStatusEnum queryStatus) {
    this.queryStatus = queryStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUsageQueryResult apiUsageQueryResult = (ApiUsageQueryResult) o;
    return Objects.equals(this.results, apiUsageQueryResult.results) &&
        Objects.equals(this.queryStatus, apiUsageQueryResult.queryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, queryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUsageQueryResult {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    queryStatus: ").append(toIndentedString(queryStatus)).append("\n");
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

