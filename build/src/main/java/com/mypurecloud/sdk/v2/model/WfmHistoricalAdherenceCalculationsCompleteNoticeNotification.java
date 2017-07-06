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
 * WfmHistoricalAdherenceCalculationsCompleteNoticeNotification
 */

public class WfmHistoricalAdherenceCalculationsCompleteNoticeNotification  implements Serializable {
  
  private String id = null;
  private String downloadUrl = null;

  /**
   * Gets or Sets queryState
   */
  public enum QueryStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETE("COMPLETE"),
    ERROR("ERROR"),
    PROCESSING("PROCESSING");

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
   **/
  public WfmHistoricalAdherenceCalculationsCompleteNoticeNotification id(String id) {
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
  public WfmHistoricalAdherenceCalculationsCompleteNoticeNotification downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  
  /**
   **/
  public WfmHistoricalAdherenceCalculationsCompleteNoticeNotification queryState(QueryStateEnum queryState) {
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
    WfmHistoricalAdherenceCalculationsCompleteNoticeNotification wfmHistoricalAdherenceCalculationsCompleteNoticeNotification = (WfmHistoricalAdherenceCalculationsCompleteNoticeNotification) o;
    return Objects.equals(this.id, wfmHistoricalAdherenceCalculationsCompleteNoticeNotification.id) &&
        Objects.equals(this.downloadUrl, wfmHistoricalAdherenceCalculationsCompleteNoticeNotification.downloadUrl) &&
        Objects.equals(this.queryState, wfmHistoricalAdherenceCalculationsCompleteNoticeNotification.queryState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, downloadUrl, queryState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceCalculationsCompleteNoticeNotification {\n");
    
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

