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
import com.mypurecloud.sdk.v2.model.ValueWrapperLocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TimeOffSettingsRequest
 */

public class TimeOffSettingsRequest  implements Serializable {
  
  private Boolean submissionRangeEnforced = null;

  private static class SubmissionRangeTypeEnumDeserializer extends StdDeserializer<SubmissionRangeTypeEnum> {
    public SubmissionRangeTypeEnumDeserializer() {
      super(SubmissionRangeTypeEnumDeserializer.class);
    }

    @Override
    public SubmissionRangeTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubmissionRangeTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the submission range
   */
 @JsonDeserialize(using = SubmissionRangeTypeEnumDeserializer.class)
  public enum SubmissionRangeTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RELATIVE("Relative"),
    FIXEDEND("FixedEnd");

    private String value;

    SubmissionRangeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubmissionRangeTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SubmissionRangeTypeEnum value : SubmissionRangeTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubmissionRangeTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubmissionRangeTypeEnum submissionRangeType = null;
  private Integer submissionEarliestDaysFromNow = null;
  private Integer submissionLatestDaysFromNow = null;
  private ValueWrapperLocalDate submissionLatestDate = null;

  public TimeOffSettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether to enforce a submission range for agent time off requests
   **/
  public TimeOffSettingsRequest submissionRangeEnforced(Boolean submissionRangeEnforced) {
    this.submissionRangeEnforced = submissionRangeEnforced;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enforce a submission range for agent time off requests")
  @JsonProperty("submissionRangeEnforced")
  public Boolean getSubmissionRangeEnforced() {
    return submissionRangeEnforced;
  }
  public void setSubmissionRangeEnforced(Boolean submissionRangeEnforced) {
    this.submissionRangeEnforced = submissionRangeEnforced;
  }


  /**
   * The type of the submission range
   **/
  public TimeOffSettingsRequest submissionRangeType(SubmissionRangeTypeEnum submissionRangeType) {
    this.submissionRangeType = submissionRangeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the submission range")
  @JsonProperty("submissionRangeType")
  public SubmissionRangeTypeEnum getSubmissionRangeType() {
    return submissionRangeType;
  }
  public void setSubmissionRangeType(SubmissionRangeTypeEnum submissionRangeType) {
    this.submissionRangeType = submissionRangeType;
  }


  /**
   * The earliest number of days from now for which an agent can submit a time off request.  Use negative numbers to indicate days in the past
   **/
  public TimeOffSettingsRequest submissionEarliestDaysFromNow(Integer submissionEarliestDaysFromNow) {
    this.submissionEarliestDaysFromNow = submissionEarliestDaysFromNow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The earliest number of days from now for which an agent can submit a time off request.  Use negative numbers to indicate days in the past")
  @JsonProperty("submissionEarliestDaysFromNow")
  public Integer getSubmissionEarliestDaysFromNow() {
    return submissionEarliestDaysFromNow;
  }
  public void setSubmissionEarliestDaysFromNow(Integer submissionEarliestDaysFromNow) {
    this.submissionEarliestDaysFromNow = submissionEarliestDaysFromNow;
  }


  /**
   * The latest number of days from now for which an agent can submit a time off request
   **/
  public TimeOffSettingsRequest submissionLatestDaysFromNow(Integer submissionLatestDaysFromNow) {
    this.submissionLatestDaysFromNow = submissionLatestDaysFromNow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The latest number of days from now for which an agent can submit a time off request")
  @JsonProperty("submissionLatestDaysFromNow")
  public Integer getSubmissionLatestDaysFromNow() {
    return submissionLatestDaysFromNow;
  }
  public void setSubmissionLatestDaysFromNow(Integer submissionLatestDaysFromNow) {
    this.submissionLatestDaysFromNow = submissionLatestDaysFromNow;
  }


  /**
   * The latest date for the time off request submission interpreted in the business unit time zone in yyyy-MM-dd format
   **/
  public TimeOffSettingsRequest submissionLatestDate(ValueWrapperLocalDate submissionLatestDate) {
    this.submissionLatestDate = submissionLatestDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The latest date for the time off request submission interpreted in the business unit time zone in yyyy-MM-dd format")
  @JsonProperty("submissionLatestDate")
  public ValueWrapperLocalDate getSubmissionLatestDate() {
    return submissionLatestDate;
  }
  public void setSubmissionLatestDate(ValueWrapperLocalDate submissionLatestDate) {
    this.submissionLatestDate = submissionLatestDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffSettingsRequest timeOffSettingsRequest = (TimeOffSettingsRequest) o;

    return Objects.equals(this.submissionRangeEnforced, timeOffSettingsRequest.submissionRangeEnforced) &&
            Objects.equals(this.submissionRangeType, timeOffSettingsRequest.submissionRangeType) &&
            Objects.equals(this.submissionEarliestDaysFromNow, timeOffSettingsRequest.submissionEarliestDaysFromNow) &&
            Objects.equals(this.submissionLatestDaysFromNow, timeOffSettingsRequest.submissionLatestDaysFromNow) &&
            Objects.equals(this.submissionLatestDate, timeOffSettingsRequest.submissionLatestDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionRangeEnforced, submissionRangeType, submissionEarliestDaysFromNow, submissionLatestDaysFromNow, submissionLatestDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffSettingsRequest {\n");
    
    sb.append("    submissionRangeEnforced: ").append(toIndentedString(submissionRangeEnforced)).append("\n");
    sb.append("    submissionRangeType: ").append(toIndentedString(submissionRangeType)).append("\n");
    sb.append("    submissionEarliestDaysFromNow: ").append(toIndentedString(submissionEarliestDaysFromNow)).append("\n");
    sb.append("    submissionLatestDaysFromNow: ").append(toIndentedString(submissionLatestDaysFromNow)).append("\n");
    sb.append("    submissionLatestDate: ").append(toIndentedString(submissionLatestDate)).append("\n");
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

