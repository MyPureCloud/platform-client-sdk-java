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
 * WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification
 */

public class WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification  implements Serializable {
  
  private String id = null;
  private List<String> downloadUrls = null;

  private static class QueryStateEnumDeserializer extends StdDeserializer<QueryStateEnum> {
    public QueryStateEnumDeserializer() {
      super(QueryStateEnumDeserializer.class);
    }

    @Override
    public QueryStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QueryStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets queryState
   */
 @JsonDeserialize(using = QueryStateEnumDeserializer.class)
  public enum QueryStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    COMPLETE("Complete"),
    ERROR("Error"),
    PROCESSING("Processing");

    private String value;

    QueryStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QueryStateEnum fromString(String key) {
      if (key == null) return null;

      for (QueryStateEnum value : QueryStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QueryStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QueryStateEnum queryState = null;

  public WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      downloadUrls = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrls")
  public List<String> getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
  }


  /**
   **/
  public WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification queryState(QueryStateEnum queryState) {
    this.queryState = queryState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queryState")
  public QueryStateEnum getQueryState() {
    return queryState;
  }
  public void setQueryState(QueryStateEnum queryState) {
    this.queryState = queryState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification wfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification = (WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification) o;

    return Objects.equals(this.id, wfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification.id) &&
            Objects.equals(this.downloadUrls, wfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification.downloadUrls) &&
            Objects.equals(this.queryState, wfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification.queryState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadUrls, queryState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceBulkCalculationsCompleteTopicWfmHistoricalAdherenceBulkCalculationsCompleteNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    queryState: ").append(toIndentedString(queryState)).append("\n");
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

