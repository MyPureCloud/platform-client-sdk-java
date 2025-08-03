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
import com.mypurecloud.sdk.v2.model.CapacityPlanningRequirementsResultTopicBusinessUnit;
import com.mypurecloud.sdk.v2.model.CapacityPlanningRequirementsResultTopicCapacityPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification
 */

public class CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification  implements Serializable {
  
  private CapacityPlanningRequirementsResultTopicCapacityPlanReference capacityPlan = null;
  private CapacityPlanningRequirementsResultTopicBusinessUnit businessUnit = null;

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
    CANCELED("Canceled"),
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
  private Date referenceBusinessUnitDate = null;

  private static class GranularityEnumDeserializer extends StdDeserializer<GranularityEnum> {
    public GranularityEnumDeserializer() {
      super(GranularityEnumDeserializer.class);
    }

    @Override
    public GranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets granularity
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WEEKLY("Weekly");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityEnum value : GranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityEnum granularity = null;
  private String downloadUrl = null;

  private static class ErrorCodeEnumDeserializer extends StdDeserializer<ErrorCodeEnum> {
    public ErrorCodeEnumDeserializer() {
      super(ErrorCodeEnumDeserializer.class);
    }

    @Override
    public ErrorCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ErrorCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets errorCode
   */
 @JsonDeserialize(using = ErrorCodeEnumDeserializer.class)
  public enum ErrorCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TIMEDOUT("TimedOut"),
    NODATA("NoData"),
    CLIENTDATAINVALID("ClientDataInvalid"),
    CONFIGURATIONINVALID("ConfigurationInvalid"),
    REQUIREMENTSFAILED("RequirementsFailed");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ErrorCodeEnum fromString(String key) {
      if (key == null) return null;

      for (ErrorCodeEnum value : ErrorCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ErrorCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ErrorCodeEnum errorCode = null;

  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification capacityPlan(CapacityPlanningRequirementsResultTopicCapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("capacityPlan")
  public CapacityPlanningRequirementsResultTopicCapacityPlanReference getCapacityPlan() {
    return capacityPlan;
  }
  public void setCapacityPlan(CapacityPlanningRequirementsResultTopicCapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
  }


  /**
   **/
  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification businessUnit(CapacityPlanningRequirementsResultTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnit")
  public CapacityPlanningRequirementsResultTopicBusinessUnit getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(CapacityPlanningRequirementsResultTopicBusinessUnit businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   **/
  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification status(StatusEnum status) {
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
  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification referenceBusinessUnitDate(Date referenceBusinessUnitDate) {
    this.referenceBusinessUnitDate = referenceBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceBusinessUnitDate")
  public Date getReferenceBusinessUnitDate() {
    return referenceBusinessUnitDate;
  }
  public void setReferenceBusinessUnitDate(Date referenceBusinessUnitDate) {
    this.referenceBusinessUnitDate = referenceBusinessUnitDate;
  }


  /**
   **/
  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   **/
  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification downloadUrl(String downloadUrl) {
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
  public CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorCode")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification capacityPlanningRequirementsResultTopicStaffingRequirementsNotification = (CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification) o;

    return Objects.equals(this.capacityPlan, capacityPlanningRequirementsResultTopicStaffingRequirementsNotification.capacityPlan) &&
            Objects.equals(this.businessUnit, capacityPlanningRequirementsResultTopicStaffingRequirementsNotification.businessUnit) &&
            Objects.equals(this.status, capacityPlanningRequirementsResultTopicStaffingRequirementsNotification.status) &&
            Objects.equals(this.referenceBusinessUnitDate, capacityPlanningRequirementsResultTopicStaffingRequirementsNotification.referenceBusinessUnitDate) &&
            Objects.equals(this.granularity, capacityPlanningRequirementsResultTopicStaffingRequirementsNotification.granularity) &&
            Objects.equals(this.downloadUrl, capacityPlanningRequirementsResultTopicStaffingRequirementsNotification.downloadUrl) &&
            Objects.equals(this.errorCode, capacityPlanningRequirementsResultTopicStaffingRequirementsNotification.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityPlan, businessUnit, status, referenceBusinessUnitDate, granularity, downloadUrl, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification {\n");
    
    sb.append("    capacityPlan: ").append(toIndentedString(capacityPlan)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceBusinessUnitDate: ").append(toIndentedString(referenceBusinessUnitDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

