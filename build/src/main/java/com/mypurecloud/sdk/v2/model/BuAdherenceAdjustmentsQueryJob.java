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
import com.mypurecloud.sdk.v2.model.AdherenceAdjustmentsListing;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuAdherenceAdjustmentsQueryJob
 */

public class BuAdherenceAdjustmentsQueryJob  implements Serializable {
  
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
   * The status of the adherence adjustments query job
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
  private ErrorBody error = null;
  private AdherenceAdjustmentsListing result = null;
  private String selfUri = null;

  public BuAdherenceAdjustmentsQueryJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuAdherenceAdjustmentsQueryJob(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public BuAdherenceAdjustmentsQueryJob id(String id) {
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
   * The status of the adherence adjustments query job
   **/
  public BuAdherenceAdjustmentsQueryJob status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the adherence adjustments query job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * A URL to fetch results of the job. Only set if status == 'Complete'
   **/
  public BuAdherenceAdjustmentsQueryJob downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URL to fetch results of the job. Only set if status == 'Complete'")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Error details if status == 'Error'
   **/
  public BuAdherenceAdjustmentsQueryJob error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details if status == 'Error'")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  /**
   * Schema template for deserializing data returned from the downloadUrl. Will always be null on the response
   **/
  public BuAdherenceAdjustmentsQueryJob result(AdherenceAdjustmentsListing result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schema template for deserializing data returned from the downloadUrl. Will always be null on the response")
  @JsonProperty("result")
  public AdherenceAdjustmentsListing getResult() {
    return result;
  }
  public void setResult(AdherenceAdjustmentsListing result) {
    this.result = result;
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
    BuAdherenceAdjustmentsQueryJob buAdherenceAdjustmentsQueryJob = (BuAdherenceAdjustmentsQueryJob) o;

    return Objects.equals(this.id, buAdherenceAdjustmentsQueryJob.id) &&
            Objects.equals(this.status, buAdherenceAdjustmentsQueryJob.status) &&
            Objects.equals(this.downloadUrl, buAdherenceAdjustmentsQueryJob.downloadUrl) &&
            Objects.equals(this.error, buAdherenceAdjustmentsQueryJob.error) &&
            Objects.equals(this.result, buAdherenceAdjustmentsQueryJob.result) &&
            Objects.equals(this.selfUri, buAdherenceAdjustmentsQueryJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, downloadUrl, error, result, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAdherenceAdjustmentsQueryJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

