package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmHistoricalDataUploadRequestStatusTopicDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate
 */

public class WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate  implements Serializable {
  
  private String requestId = null;
  private WfmHistoricalDataUploadRequestStatusTopicDateTime dateImportStarted = null;
  private WfmHistoricalDataUploadRequestStatusTopicDateTime dateImportEnded = null;
  private WfmHistoricalDataUploadRequestStatusTopicDateTime dateCreated = null;
  private WfmHistoricalDataUploadRequestStatusTopicDateTime dateModified = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INITIATED("Initiated"),
    INPROGRESS("InProgress"),
    PENDING("Pending"),
    SUCCESS("Success"),
    FAILED("Failed"),
    CANCELLED("Cancelled"),
    PURGED("Purged"),
    PURGEPENDING("PurgePending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String error = null;
  private Boolean active = null;

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateImportStarted(WfmHistoricalDataUploadRequestStatusTopicDateTime dateImportStarted) {
    this.dateImportStarted = dateImportStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateImportStarted")
  public WfmHistoricalDataUploadRequestStatusTopicDateTime getDateImportStarted() {
    return dateImportStarted;
  }
  public void setDateImportStarted(WfmHistoricalDataUploadRequestStatusTopicDateTime dateImportStarted) {
    this.dateImportStarted = dateImportStarted;
  }

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateImportEnded(WfmHistoricalDataUploadRequestStatusTopicDateTime dateImportEnded) {
    this.dateImportEnded = dateImportEnded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateImportEnded")
  public WfmHistoricalDataUploadRequestStatusTopicDateTime getDateImportEnded() {
    return dateImportEnded;
  }
  public void setDateImportEnded(WfmHistoricalDataUploadRequestStatusTopicDateTime dateImportEnded) {
    this.dateImportEnded = dateImportEnded;
  }

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateCreated(WfmHistoricalDataUploadRequestStatusTopicDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public WfmHistoricalDataUploadRequestStatusTopicDateTime getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(WfmHistoricalDataUploadRequestStatusTopicDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateModified(WfmHistoricalDataUploadRequestStatusTopicDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public WfmHistoricalDataUploadRequestStatusTopicDateTime getDateModified() {
    return dateModified;
  }
  public void setDateModified(WfmHistoricalDataUploadRequestStatusTopicDateTime dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate error(String error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate = (WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate) o;
    return Objects.equals(this.requestId, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.requestId) &&
        Objects.equals(this.dateImportStarted, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.dateImportStarted) &&
        Objects.equals(this.dateImportEnded, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.dateImportEnded) &&
        Objects.equals(this.dateCreated, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.dateCreated) &&
        Objects.equals(this.dateModified, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.dateModified) &&
        Objects.equals(this.status, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.status) &&
        Objects.equals(this.error, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.error) &&
        Objects.equals(this.active, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, dateImportStarted, dateImportEnded, dateCreated, dateModified, status, error, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    dateImportStarted: ").append(toIndentedString(dateImportStarted)).append("\n");
    sb.append("    dateImportEnded: ").append(toIndentedString(dateImportEnded)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

