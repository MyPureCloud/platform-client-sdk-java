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
 * RecordingUploadReportRequest
 */

public class RecordingUploadReportRequest  implements Serializable {
  
  private Date dateSince = null;

  private static class UploadStatusEnumDeserializer extends StdDeserializer<UploadStatusEnum> {
    public UploadStatusEnumDeserializer() {
      super(UploadStatusEnumDeserializer.class);
    }

    @Override
    public UploadStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UploadStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Report will include uploads with this status
   */
 @JsonDeserialize(using = UploadStatusEnumDeserializer.class)
  public enum UploadStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    SUCCESS("Success"),
    FAILURE("Failure"),
    WAITFORCONVERSATION("WaitForConversation");

    private String value;

    UploadStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UploadStatusEnum fromString(String key) {
      if (key == null) return null;

      for (UploadStatusEnum value : UploadStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UploadStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UploadStatusEnum uploadStatus = null;

  public RecordingUploadReportRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Report will include uploads since this date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingUploadReportRequest dateSince(Date dateSince) {
    this.dateSince = dateSince;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Report will include uploads since this date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSince")
  public Date getDateSince() {
    return dateSince;
  }
  public void setDateSince(Date dateSince) {
    this.dateSince = dateSince;
  }


  /**
   * Report will include uploads with this status
   **/
  public RecordingUploadReportRequest uploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Report will include uploads with this status")
  @JsonProperty("uploadStatus")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingUploadReportRequest recordingUploadReportRequest = (RecordingUploadReportRequest) o;

    return Objects.equals(this.dateSince, recordingUploadReportRequest.dateSince) &&
            Objects.equals(this.uploadStatus, recordingUploadReportRequest.uploadStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateSince, uploadStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingUploadReportRequest {\n");
    
    sb.append("    dateSince: ").append(toIndentedString(dateSince)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
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

