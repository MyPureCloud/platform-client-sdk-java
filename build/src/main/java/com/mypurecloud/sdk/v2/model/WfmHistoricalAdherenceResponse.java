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
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResultWrapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Response for Historical Adherence Query, intended to tell the client what to listen for on a notification topic
 */
@ApiModel(description = "Response for Historical Adherence Query, intended to tell the client what to listen for on a notification topic")

public class WfmHistoricalAdherenceResponse  implements Serializable {
  
  private String id = null;
  private String downloadUrl = null;
  private WfmHistoricalAdherenceResultWrapper downloadResult = null;
  private List<String> downloadUrls = new ArrayList<String>();

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
   * The state of the adherence query
   */
 @JsonDeserialize(using = QueryStateEnumDeserializer.class)
  public enum QueryStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

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

  
  /**
   * The query ID to listen for
   **/
  public WfmHistoricalAdherenceResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The query ID to listen for")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Deprecated. Use downloadUrls instead.
   **/
  public WfmHistoricalAdherenceResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Deprecated. Use downloadUrls instead.")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  
  /**
   * Result will always come via downloadUrls; however the schema is included for documentation
   **/
  public WfmHistoricalAdherenceResponse downloadResult(WfmHistoricalAdherenceResultWrapper downloadResult) {
    this.downloadResult = downloadResult;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Result will always come via downloadUrls; however the schema is included for documentation")
  @JsonProperty("downloadResult")
  public WfmHistoricalAdherenceResultWrapper getDownloadResult() {
    return downloadResult;
  }
  public void setDownloadResult(WfmHistoricalAdherenceResultWrapper downloadResult) {
    this.downloadResult = downloadResult;
  }

  
  /**
   * The uri list to GET the results of the Historical Adherence query. For notification purposes only
   **/
  public WfmHistoricalAdherenceResponse downloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The uri list to GET the results of the Historical Adherence query. For notification purposes only")
  @JsonProperty("downloadUrls")
  public List<String> getDownloadUrls() {
    return downloadUrls;
  }
  public void setDownloadUrls(List<String> downloadUrls) {
    this.downloadUrls = downloadUrls;
  }

  
  /**
   * The state of the adherence query
   **/
  public WfmHistoricalAdherenceResponse queryState(QueryStateEnum queryState) {
    this.queryState = queryState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the adherence query")
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
    WfmHistoricalAdherenceResponse wfmHistoricalAdherenceResponse = (WfmHistoricalAdherenceResponse) o;
    return Objects.equals(this.id, wfmHistoricalAdherenceResponse.id) &&
        Objects.equals(this.downloadUrl, wfmHistoricalAdherenceResponse.downloadUrl) &&
        Objects.equals(this.downloadResult, wfmHistoricalAdherenceResponse.downloadResult) &&
        Objects.equals(this.downloadUrls, wfmHistoricalAdherenceResponse.downloadUrls) &&
        Objects.equals(this.queryState, wfmHistoricalAdherenceResponse.queryState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadUrl, downloadResult, downloadUrls, queryState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadResult: ").append(toIndentedString(downloadResult)).append("\n");
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

