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
import java.util.Date;

import java.io.Serializable;
/**
 * WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate
 */

public class WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate  implements Serializable {
  
  private String requestId = null;
  private Date dateImportStarted = null;
  private Date dateImportEnded = null;
  private Date dateCreated = null;
  private Date dateModified = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
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

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CSV("Csv"),
    JSON("Json");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String fileName = null;
  private Long fileSize = null;

  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
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
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateImportStarted(Date dateImportStarted) {
    this.dateImportStarted = dateImportStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateImportStarted")
  public Date getDateImportStarted() {
    return dateImportStarted;
  }
  public void setDateImportStarted(Date dateImportStarted) {
    this.dateImportStarted = dateImportStarted;
  }


  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateImportEnded(Date dateImportEnded) {
    this.dateImportEnded = dateImportEnded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateImportEnded")
  public Date getDateImportEnded() {
    return dateImportEnded;
  }
  public void setDateImportEnded(Date dateImportEnded) {
    this.dateImportEnded = dateImportEnded;
  }


  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
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


  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   **/
  public WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileSize")
  public Long getFileSize() {
    return fileSize;
  }
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
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
            Objects.equals(this.active, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.active) &&
            Objects.equals(this.type, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.type) &&
            Objects.equals(this.fileName, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.fileName) &&
            Objects.equals(this.fileSize, wfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, dateImportStarted, dateImportEnded, dateCreated, dateModified, status, error, active, type, fileName, fileSize);
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
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

