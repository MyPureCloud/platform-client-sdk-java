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
import com.mypurecloud.sdk.v2.model.V2WfmMainForecastExportHistoricalEventMainForecastErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2WfmMainForecastExportHistoricalEventMainForecastExportNotification
 */

public class V2WfmMainForecastExportHistoricalEventMainForecastExportNotification  implements Serializable {
  
  private String exportType = null;
  private String businessUnitId = null;
  private String id = null;

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
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error"),
    UNKNOWN("Unknown");

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
  private String downloadUrl = null;
  private V2WfmMainForecastExportHistoricalEventMainForecastErrorBody error = null;

  public V2WfmMainForecastExportHistoricalEventMainForecastExportNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2WfmMainForecastExportHistoricalEventMainForecastExportNotification exportType(String exportType) {
    this.exportType = exportType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exportType")
  public String getExportType() {
    return exportType;
  }
  public void setExportType(String exportType) {
    this.exportType = exportType;
  }


  /**
   **/
  public V2WfmMainForecastExportHistoricalEventMainForecastExportNotification businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   **/
  public V2WfmMainForecastExportHistoricalEventMainForecastExportNotification id(String id) {
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
  public V2WfmMainForecastExportHistoricalEventMainForecastExportNotification status(StatusEnum status) {
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
  public V2WfmMainForecastExportHistoricalEventMainForecastExportNotification downloadUrl(String downloadUrl) {
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
  public V2WfmMainForecastExportHistoricalEventMainForecastExportNotification error(V2WfmMainForecastExportHistoricalEventMainForecastErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("error")
  public V2WfmMainForecastExportHistoricalEventMainForecastErrorBody getError() {
    return error;
  }
  public void setError(V2WfmMainForecastExportHistoricalEventMainForecastErrorBody error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WfmMainForecastExportHistoricalEventMainForecastExportNotification v2WfmMainForecastExportHistoricalEventMainForecastExportNotification = (V2WfmMainForecastExportHistoricalEventMainForecastExportNotification) o;

    return Objects.equals(this.exportType, v2WfmMainForecastExportHistoricalEventMainForecastExportNotification.exportType) &&
            Objects.equals(this.businessUnitId, v2WfmMainForecastExportHistoricalEventMainForecastExportNotification.businessUnitId) &&
            Objects.equals(this.id, v2WfmMainForecastExportHistoricalEventMainForecastExportNotification.id) &&
            Objects.equals(this.status, v2WfmMainForecastExportHistoricalEventMainForecastExportNotification.status) &&
            Objects.equals(this.downloadUrl, v2WfmMainForecastExportHistoricalEventMainForecastExportNotification.downloadUrl) &&
            Objects.equals(this.error, v2WfmMainForecastExportHistoricalEventMainForecastExportNotification.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportType, businessUnitId, id, status, downloadUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WfmMainForecastExportHistoricalEventMainForecastExportNotification {\n");
    
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

