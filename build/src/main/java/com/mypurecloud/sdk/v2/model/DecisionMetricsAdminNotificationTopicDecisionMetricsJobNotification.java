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
import com.mypurecloud.sdk.v2.model.DecisionMetricsAdminNotificationTopicAddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DecisionMetricsAdminNotificationTopicDecisionMetricsUpdateError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification
 */

public class DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification  implements Serializable {
  
  private DecisionMetricsAdminNotificationTopicAddressableEntityRef job = null;

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
    UNKNOWN("Unknown"),
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
  private String uploadKey = null;
  private List<DecisionMetricsAdminNotificationTopicDecisionMetricsUpdateError> updateErrors = null;

  public DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      updateErrors = new ArrayList<DecisionMetricsAdminNotificationTopicDecisionMetricsUpdateError>();
    }
  }

  public DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      updateErrors = new ArrayList<DecisionMetricsAdminNotificationTopicDecisionMetricsUpdateError>();
    }
  }

  
  /**
   **/
  public DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification job(DecisionMetricsAdminNotificationTopicAddressableEntityRef job) {
    this.job = job;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("job")
  public DecisionMetricsAdminNotificationTopicAddressableEntityRef getJob() {
    return job;
  }
  public void setJob(DecisionMetricsAdminNotificationTopicAddressableEntityRef job) {
    this.job = job;
  }


  /**
   **/
  public DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification status(StatusEnum status) {
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
  public DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   **/
  public DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification updateErrors(List<DecisionMetricsAdminNotificationTopicDecisionMetricsUpdateError> updateErrors) {
    this.updateErrors = updateErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updateErrors")
  public List<DecisionMetricsAdminNotificationTopicDecisionMetricsUpdateError> getUpdateErrors() {
    return updateErrors;
  }
  public void setUpdateErrors(List<DecisionMetricsAdminNotificationTopicDecisionMetricsUpdateError> updateErrors) {
    this.updateErrors = updateErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification decisionMetricsAdminNotificationTopicDecisionMetricsJobNotification = (DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification) o;

    return Objects.equals(this.job, decisionMetricsAdminNotificationTopicDecisionMetricsJobNotification.job) &&
            Objects.equals(this.status, decisionMetricsAdminNotificationTopicDecisionMetricsJobNotification.status) &&
            Objects.equals(this.uploadKey, decisionMetricsAdminNotificationTopicDecisionMetricsJobNotification.uploadKey) &&
            Objects.equals(this.updateErrors, decisionMetricsAdminNotificationTopicDecisionMetricsJobNotification.updateErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, status, uploadKey, updateErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionMetricsAdminNotificationTopicDecisionMetricsJobNotification {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    updateErrors: ").append(toIndentedString(updateErrors)).append("\n");
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

