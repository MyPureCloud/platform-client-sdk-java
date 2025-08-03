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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrganizationPublicApiUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OrganizationPublicApiUsageResultsResponse
 */

public class OrganizationPublicApiUsageResultsResponse  implements Serializable {
  
  private String name = null;

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
   * The status of the query.
   */
 @JsonDeserialize(using = QueryStatusEnumDeserializer.class)
  public enum QueryStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("Queued"),
    RUNNING("Running"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed"),
    CANCELLED("Cancelled");

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
  private ErrorBody errorBody = null;
  private String nextUri = null;
  private List<OrganizationPublicApiUsage> entities = null;
  private String selfUri = null;

  public OrganizationPublicApiUsageResultsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<OrganizationPublicApiUsage>();
    }
  }

  
  /**
   **/
  public OrganizationPublicApiUsageResultsResponse name(String name) {
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
   * The status of the query.
   **/
  public OrganizationPublicApiUsageResultsResponse queryStatus(QueryStatusEnum queryStatus) {
    this.queryStatus = queryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the query.")
  @JsonProperty("queryStatus")
  public QueryStatusEnum getQueryStatus() {
    return queryStatus;
  }
  public void setQueryStatus(QueryStatusEnum queryStatus) {
    this.queryStatus = queryStatus;
  }


  /**
   * The reason for the failure. This will only be present if the query is in a FAILURE state but may not be included even if the state is FAILURE
   **/
  public OrganizationPublicApiUsageResultsResponse errorBody(ErrorBody errorBody) {
    this.errorBody = errorBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason for the failure. This will only be present if the query is in a FAILURE state but may not be included even if the state is FAILURE")
  @JsonProperty("errorBody")
  public ErrorBody getErrorBody() {
    return errorBody;
  }
  public void setErrorBody(ErrorBody errorBody) {
    this.errorBody = errorBody;
  }


  /**
   * The uri to get the next set of results. Will only be included if there is another page to retrieve.
   **/
  public OrganizationPublicApiUsageResultsResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The uri to get the next set of results. Will only be included if there is another page to retrieve.")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   * The results of the query.
   **/
  public OrganizationPublicApiUsageResultsResponse entities(List<OrganizationPublicApiUsage> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results of the query.")
  @JsonProperty("entities")
  public List<OrganizationPublicApiUsage> getEntities() {
    return entities;
  }
  public void setEntities(List<OrganizationPublicApiUsage> entities) {
    this.entities = entities;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationPublicApiUsageResultsResponse organizationPublicApiUsageResultsResponse = (OrganizationPublicApiUsageResultsResponse) o;

    return Objects.equals(this.name, organizationPublicApiUsageResultsResponse.name) &&
            Objects.equals(this.queryStatus, organizationPublicApiUsageResultsResponse.queryStatus) &&
            Objects.equals(this.errorBody, organizationPublicApiUsageResultsResponse.errorBody) &&
            Objects.equals(this.nextUri, organizationPublicApiUsageResultsResponse.nextUri) &&
            Objects.equals(this.entities, organizationPublicApiUsageResultsResponse.entities) &&
            Objects.equals(this.selfUri, organizationPublicApiUsageResultsResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, queryStatus, errorBody, nextUri, entities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPublicApiUsageResultsResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryStatus: ").append(toIndentedString(queryStatus)).append("\n");
    sb.append("    errorBody: ").append(toIndentedString(errorBody)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

