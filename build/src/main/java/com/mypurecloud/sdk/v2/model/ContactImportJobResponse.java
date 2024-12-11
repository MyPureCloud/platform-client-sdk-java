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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ContactImportJobMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ContactImportJobResponse
 */

public class ContactImportJobResponse  implements Serializable {
  
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
    CREATED("Created"),
    RUNNING("Running"),
    COMPLETED("Completed"),
    FAILED("Failed"),
    CANCELLED("Cancelled");

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
  private String statusDetails = null;

  private static class ExecutionStepEnumDeserializer extends StdDeserializer<ExecutionStepEnum> {
    public ExecutionStepEnumDeserializer() {
      super(ExecutionStepEnumDeserializer.class);
    }

    @Override
    public ExecutionStepEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExecutionStepEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Detailed description for the Job execution state
   */
 @JsonDeserialize(using = ExecutionStepEnumDeserializer.class)
  public enum ExecutionStepEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VALIDATING("Validating"),
    VALIDATED("Validated"),
    IMPORTING("Importing");

    private String value;

    ExecutionStepEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExecutionStepEnum fromString(String key) {
      if (key == null) return null;

      for (ExecutionStepEnum value : ExecutionStepEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExecutionStepEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExecutionStepEnum executionStep = null;
  private ContactImportJobMetadata metadata = null;
  private Date dateCreated = null;
  private String selfUri = null;
  private AddressableEntityRef settings = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ContactImportJobResponse status(StatusEnum status) {
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
   * Detailed description for JobStatus.
   **/
  public ContactImportJobResponse statusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed description for JobStatus.")
  @JsonProperty("statusDetails")
  public String getStatusDetails() {
    return statusDetails;
  }
  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }


  /**
   * Detailed description for the Job execution state
   **/
  public ContactImportJobResponse executionStep(ExecutionStepEnum executionStep) {
    this.executionStep = executionStep;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed description for the Job execution state")
  @JsonProperty("executionStep")
  public ExecutionStepEnum getExecutionStep() {
    return executionStep;
  }
  public void setExecutionStep(ExecutionStepEnum executionStep) {
    this.executionStep = executionStep;
  }


  /**
   * Metadata for the job
   **/
  public ContactImportJobResponse metadata(ContactImportJobMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata for the job")
  @JsonProperty("metadata")
  public ContactImportJobMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(ContactImportJobMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContactImportJobResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * Settings
   **/
  public ContactImportJobResponse settings(AddressableEntityRef settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings")
  @JsonProperty("settings")
  public AddressableEntityRef getSettings() {
    return settings;
  }
  public void setSettings(AddressableEntityRef settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactImportJobResponse contactImportJobResponse = (ContactImportJobResponse) o;

    return Objects.equals(this.id, contactImportJobResponse.id) &&
            Objects.equals(this.status, contactImportJobResponse.status) &&
            Objects.equals(this.statusDetails, contactImportJobResponse.statusDetails) &&
            Objects.equals(this.executionStep, contactImportJobResponse.executionStep) &&
            Objects.equals(this.metadata, contactImportJobResponse.metadata) &&
            Objects.equals(this.dateCreated, contactImportJobResponse.dateCreated) &&
            Objects.equals(this.selfUri, contactImportJobResponse.selfUri) &&
            Objects.equals(this.settings, contactImportJobResponse.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, statusDetails, executionStep, metadata, dateCreated, selfUri, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactImportJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    executionStep: ").append(toIndentedString(executionStep)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

