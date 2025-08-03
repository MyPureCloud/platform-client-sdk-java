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
import com.mypurecloud.sdk.v2.model.BusinessUnitReference;
import com.mypurecloud.sdk.v2.model.CapacityPlanReference;
import com.mypurecloud.sdk.v2.model.StaffingRequirementResultResponseTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * CapacityPlanStaffingRequirementResult
 */

public class CapacityPlanStaffingRequirementResult  implements Serializable {
  
  private BusinessUnitReference businessUnit = null;
  private CapacityPlanReference capacityPlan = null;

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
   * The status of the requirement generation of the capacity plan
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
  private LocalDate referenceBusinessUnitDate = null;

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
   * Granularity of the intervals
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
   * The error code when status is 'Failed'
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
  private String downloadUrl = null;
  private StaffingRequirementResultResponseTemplate downloadTemplate = null;

  public CapacityPlanStaffingRequirementResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The business unit to which the capacity plan belongs
   **/
  public CapacityPlanStaffingRequirementResult businessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The business unit to which the capacity plan belongs")
  @JsonProperty("businessUnit")
  public BusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   * The capacity plan for which requirements are generated
   **/
  public CapacityPlanStaffingRequirementResult capacityPlan(CapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity plan for which requirements are generated")
  @JsonProperty("capacityPlan")
  public CapacityPlanReference getCapacityPlan() {
    return capacityPlan;
  }
  public void setCapacityPlan(CapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
  }


  /**
   * The status of the requirement generation of the capacity plan
   **/
  public CapacityPlanStaffingRequirementResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the requirement generation of the capacity plan")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The reference date for interval-based data for the requirements. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanStaffingRequirementResult referenceBusinessUnitDate(LocalDate referenceBusinessUnitDate) {
    this.referenceBusinessUnitDate = referenceBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference date for interval-based data for the requirements. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("referenceBusinessUnitDate")
  public LocalDate getReferenceBusinessUnitDate() {
    return referenceBusinessUnitDate;
  }
  public void setReferenceBusinessUnitDate(LocalDate referenceBusinessUnitDate) {
    this.referenceBusinessUnitDate = referenceBusinessUnitDate;
  }


  /**
   * Granularity of the intervals
   **/
  public CapacityPlanStaffingRequirementResult granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Granularity of the intervals")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * The error code when status is 'Failed'
   **/
  public CapacityPlanStaffingRequirementResult errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error code when status is 'Failed'")
  @JsonProperty("errorCode")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * The URL to get the requirements results for the capacity plan. It will be populated if the status is 'Complete'
   **/
  public CapacityPlanStaffingRequirementResult downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL to get the requirements results for the capacity plan. It will be populated if the status is 'Complete'")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Staffing requirement results always come through downloadUrl, the schema included here is just for documentation
   **/
  public CapacityPlanStaffingRequirementResult downloadTemplate(StaffingRequirementResultResponseTemplate downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Staffing requirement results always come through downloadUrl, the schema included here is just for documentation")
  @JsonProperty("downloadTemplate")
  public StaffingRequirementResultResponseTemplate getDownloadTemplate() {
    return downloadTemplate;
  }
  public void setDownloadTemplate(StaffingRequirementResultResponseTemplate downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanStaffingRequirementResult capacityPlanStaffingRequirementResult = (CapacityPlanStaffingRequirementResult) o;

    return Objects.equals(this.businessUnit, capacityPlanStaffingRequirementResult.businessUnit) &&
            Objects.equals(this.capacityPlan, capacityPlanStaffingRequirementResult.capacityPlan) &&
            Objects.equals(this.status, capacityPlanStaffingRequirementResult.status) &&
            Objects.equals(this.referenceBusinessUnitDate, capacityPlanStaffingRequirementResult.referenceBusinessUnitDate) &&
            Objects.equals(this.granularity, capacityPlanStaffingRequirementResult.granularity) &&
            Objects.equals(this.errorCode, capacityPlanStaffingRequirementResult.errorCode) &&
            Objects.equals(this.downloadUrl, capacityPlanStaffingRequirementResult.downloadUrl) &&
            Objects.equals(this.downloadTemplate, capacityPlanStaffingRequirementResult.downloadTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnit, capacityPlan, status, referenceBusinessUnitDate, granularity, errorCode, downloadUrl, downloadTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanStaffingRequirementResult {\n");
    
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    capacityPlan: ").append(toIndentedString(capacityPlan)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceBusinessUnitDate: ").append(toIndentedString(referenceBusinessUnitDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadTemplate: ").append(toIndentedString(downloadTemplate)).append("\n");
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

