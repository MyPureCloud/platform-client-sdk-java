package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Response for Historical Adherence Query, intended to tell the client what to listen for on a notification topic
 */
@ApiModel(description = "Response for Historical Adherence Query, intended to tell the client what to listen for on a notification topic")

public class WfmHistoricalAdherenceResponse  implements Serializable {
  
  private String id = null;
  private String downloadUrl = null;

  /**
   * The state of the adherence query
   */
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
   * The uri to query to GET the results of the Historical Adherence query. This will return unpopulated but will be populated in the notification
   **/
  public WfmHistoricalAdherenceResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The uri to query to GET the results of the Historical Adherence query. This will return unpopulated but will be populated in the notification")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
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
        Objects.equals(this.queryState, wfmHistoricalAdherenceResponse.queryState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadUrl, queryState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

