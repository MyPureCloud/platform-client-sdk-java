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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GetUploadSourceUrlJobStatusResponse
 */

public class GetUploadSourceUrlJobStatusResponse  implements Serializable {
  
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
   * Status of the upload job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATED("Created"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    FAILED("Failed");

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
  private String uploadKey = null;
  private ErrorBody errorInformation = null;
  private String selfUri = null;

  public GetUploadSourceUrlJobStatusResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Id of the upload from URL job.
   **/
  public GetUploadSourceUrlJobStatusResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the upload from URL job.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Status of the upload job
   **/
  public GetUploadSourceUrlJobStatusResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the upload job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Key that identifies the file in the storage including the file name
   **/
  public GetUploadSourceUrlJobStatusResponse uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Key that identifies the file in the storage including the file name")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   * Any error information, or null of the processing is not in failed state.
   **/
  public GetUploadSourceUrlJobStatusResponse errorInformation(ErrorBody errorInformation) {
    this.errorInformation = errorInformation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any error information, or null of the processing is not in failed state.")
  @JsonProperty("errorInformation")
  public ErrorBody getErrorInformation() {
    return errorInformation;
  }
  public void setErrorInformation(ErrorBody errorInformation) {
    this.errorInformation = errorInformation;
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
    GetUploadSourceUrlJobStatusResponse getUploadSourceUrlJobStatusResponse = (GetUploadSourceUrlJobStatusResponse) o;

    return Objects.equals(this.id, getUploadSourceUrlJobStatusResponse.id) &&
            Objects.equals(this.status, getUploadSourceUrlJobStatusResponse.status) &&
            Objects.equals(this.uploadKey, getUploadSourceUrlJobStatusResponse.uploadKey) &&
            Objects.equals(this.errorInformation, getUploadSourceUrlJobStatusResponse.errorInformation) &&
            Objects.equals(this.selfUri, getUploadSourceUrlJobStatusResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, uploadKey, errorInformation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUploadSourceUrlJobStatusResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    errorInformation: ").append(toIndentedString(errorInformation)).append("\n");
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

