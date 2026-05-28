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

import java.io.Serializable;
/**
 * BulkOpportunitiesError
 */

public class BulkOpportunitiesError  implements Serializable {
  

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
   * The error code for the failed operation
   */
 @JsonDeserialize(using = ErrorCodeEnumDeserializer.class)
  public enum ErrorCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVITYCHANGED("ActivityChanged"),
    AGENTENROLLMENTSHOURLYLIMITEXCEEDED("AgentEnrollmentsHourlyLimitExceeded"),
    BATCHLIMITEXCEEDED("BatchLimitExceeded"),
    BUSINESSUNITENROLLMENTSHOURLYLIMITEXCEEDED("BusinessUnitEnrollmentsHourlyLimitExceeded"),
    BUSINESSUNITNOTFOUND("BusinessUnitNotFound"),
    BUSINESSUNITOPPORTUNITYHOURLYLIMITEXCEEDED("BusinessUnitOpportunityHourlyLimitExceeded"),
    CAPACITYFULL("CapacityFull"),
    CONFLICT("Conflict"),
    DATEMUSTBEINFUTURE("DateMustBeInFuture"),
    DEADLINEMUSTBEAFTEROPENTIME("DeadlineMustBeAfterOpenTime"),
    DEADLINEMUSTBEBEFOREOREQUALTOSTARTTIME("DeadlineMustBeBeforeOrEqualToStartTime"),
    ENDTIMEMUSTBEAFTERSTARTTIME("EndTimeMustBeAfterStartTime"),
    ENROLLMENTNOTFOUND("EnrollmentNotFound"),
    INTERNALERROR("InternalError"),
    INTERNALERRORAUTOAPPROVAL("InternalErrorAutoApproval"),
    INTERNALERRORDENIAL("InternalErrorDenial"),
    INTERNALERRORSCHEDULEUPDATE("InternalErrorScheduleUpdate"),
    INVALIDOPPORTUNITYLENGTH("InvalidOpportunityLength"),
    INVALIDOPPORTUNITYSTATUS("InvalidOpportunityStatus"),
    INVALIDREQUEST("InvalidRequest"),
    INVALIDSTATUSTRANSITION("InvalidStatusTransition"),
    INVALIDTIME("InvalidTime"),
    NOINVITATIONSFORPUBLISH("NoInvitationsForPublish"),
    OPENTIMEMUSTBEBEFORESTARTTIME("OpenTimeMustBeBeforeStartTime"),
    OPPORTUNITYCLOSED("OpportunityClosed"),
    OPPORTUNITYNOTFOUND("OpportunityNotFound"),
    OPPORTUNITYNOTOPEN("OpportunityNotOpen"),
    SCHEDULECONFLICT("ScheduleConflict"),
    SCHEDULENOTFOUND("ScheduleNotFound"),
    SERVICEUNAVAILABLE("ServiceUnavailable"),
    STARTTIMEMUSTBEWITHINONEYEAR("StartTimeMustBeWithinOneYear"),
    STATUSNOTDRAFT("StatusNotDraft");

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

  public BulkOpportunitiesError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BulkOpportunitiesError(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The error code for the failed operation
   **/
  public BulkOpportunitiesError errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The error code for the failed operation")
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
    BulkOpportunitiesError bulkOpportunitiesError = (BulkOpportunitiesError) o;

    return Objects.equals(this.errorCode, bulkOpportunitiesError.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOpportunitiesError {\n");
    
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

