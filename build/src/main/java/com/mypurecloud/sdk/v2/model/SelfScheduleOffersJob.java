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
import com.mypurecloud.sdk.v2.model.SelfScheduleOffersResultTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SelfScheduleOffersJob
 */

public class SelfScheduleOffersJob  implements Serializable {
  
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
   * The status of the job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

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
  private SelfScheduleOffersResultTemplate downloadResultTemplate = null;
  private ErrorBody error = null;
  private String selfUri = null;

  public SelfScheduleOffersJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SelfScheduleOffersJob(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public SelfScheduleOffersJob id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The status of the job
   **/
  public SelfScheduleOffersJob status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * URL from which to fetch results for requests. Populated if status == ‘Complete'. The downloaded data will conform to the schema defined in downloadResultTemplate
   **/
  public SelfScheduleOffersJob downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL from which to fetch results for requests. Populated if status == ‘Complete'. The downloaded data will conform to the schema defined in downloadResultTemplate")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Schema template for deserializing lookup offers results returned from the downloadUrl
   **/
  public SelfScheduleOffersJob downloadResultTemplate(SelfScheduleOffersResultTemplate downloadResultTemplate) {
    this.downloadResultTemplate = downloadResultTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schema template for deserializing lookup offers results returned from the downloadUrl")
  @JsonProperty("downloadResultTemplate")
  public SelfScheduleOffersResultTemplate getDownloadResultTemplate() {
    return downloadResultTemplate;
  }
  public void setDownloadResultTemplate(SelfScheduleOffersResultTemplate downloadResultTemplate) {
    this.downloadResultTemplate = downloadResultTemplate;
  }


  /**
   * Any error information, only set if the status == 'Error'
   **/
  public SelfScheduleOffersJob error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any error information, only set if the status == 'Error'")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
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
    SelfScheduleOffersJob selfScheduleOffersJob = (SelfScheduleOffersJob) o;

    return Objects.equals(this.id, selfScheduleOffersJob.id) &&
            Objects.equals(this.status, selfScheduleOffersJob.status) &&
            Objects.equals(this.downloadUrl, selfScheduleOffersJob.downloadUrl) &&
            Objects.equals(this.downloadResultTemplate, selfScheduleOffersJob.downloadResultTemplate) &&
            Objects.equals(this.error, selfScheduleOffersJob.error) &&
            Objects.equals(this.selfUri, selfScheduleOffersJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, downloadUrl, downloadResultTemplate, error, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleOffersJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadResultTemplate: ").append(toIndentedString(downloadResultTemplate)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

