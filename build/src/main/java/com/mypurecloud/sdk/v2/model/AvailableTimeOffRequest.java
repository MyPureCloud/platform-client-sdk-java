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
import com.mypurecloud.sdk.v2.model.LocalDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AvailableTimeOffRequest
 */

public class AvailableTimeOffRequest  implements Serializable {
  
  private String activityCodeId = null;
  private List<LocalDateRange> dateRanges = null;

  private static class SupportedGranularitiesEnumDeserializer extends StdDeserializer<SupportedGranularitiesEnum> {
    public SupportedGranularitiesEnumDeserializer() {
      super(SupportedGranularitiesEnumDeserializer.class);
    }

    @Override
    public SupportedGranularitiesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SupportedGranularitiesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets supportedGranularities
   */
 @JsonDeserialize(using = SupportedGranularitiesEnumDeserializer.class)
  public enum SupportedGranularitiesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily"),
    FIFTEENMINUTES("FifteenMinutes");

    private String value;

    SupportedGranularitiesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SupportedGranularitiesEnum fromString(String key) {
      if (key == null) return null;

      for (SupportedGranularitiesEnum value : SupportedGranularitiesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SupportedGranularitiesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SupportedGranularitiesEnum> supportedGranularities = null;

  public AvailableTimeOffRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dateRanges = new ArrayList<LocalDateRange>();
      supportedGranularities = new ArrayList<SupportedGranularitiesEnum>();
    }
  }

  public AvailableTimeOffRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      dateRanges = new ArrayList<LocalDateRange>();
      supportedGranularities = new ArrayList<SupportedGranularitiesEnum>();
    }
  }

  
  /**
   * The ID for activity code to query available time off minutes
   **/
  public AvailableTimeOffRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID for activity code to query available time off minutes")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * A list of date ranges of available time off minutes. A maximum number of date ranges is 30. The maximum total number of days in all ranges is 366. If no ranges are specified, then only the presence of the associated time off limit object will be checked. In such case, if the association exists, then the response will contain a list with of a single element filled with timeOffLimitId only.
   **/
  public AvailableTimeOffRequest dateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of date ranges of available time off minutes. A maximum number of date ranges is 30. The maximum total number of days in all ranges is 366. If no ranges are specified, then only the presence of the associated time off limit object will be checked. In such case, if the association exists, then the response will contain a list with of a single element filled with timeOffLimitId only.")
  @JsonProperty("dateRanges")
  public List<LocalDateRange> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
  }


  /**
   * Granularity of time off limits supported to query availability information. Default is 'Daily'
   **/
  public AvailableTimeOffRequest supportedGranularities(List<SupportedGranularitiesEnum> supportedGranularities) {
    this.supportedGranularities = supportedGranularities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity of time off limits supported to query availability information. Default is 'Daily'")
  @JsonProperty("supportedGranularities")
  public List<SupportedGranularitiesEnum> getSupportedGranularities() {
    return supportedGranularities;
  }
  public void setSupportedGranularities(List<SupportedGranularitiesEnum> supportedGranularities) {
    this.supportedGranularities = supportedGranularities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableTimeOffRequest availableTimeOffRequest = (AvailableTimeOffRequest) o;

    return Objects.equals(this.activityCodeId, availableTimeOffRequest.activityCodeId) &&
            Objects.equals(this.dateRanges, availableTimeOffRequest.dateRanges) &&
            Objects.equals(this.supportedGranularities, availableTimeOffRequest.supportedGranularities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodeId, dateRanges, supportedGranularities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableTimeOffRequest {\n");
    
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    supportedGranularities: ").append(toIndentedString(supportedGranularities)).append("\n");
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

