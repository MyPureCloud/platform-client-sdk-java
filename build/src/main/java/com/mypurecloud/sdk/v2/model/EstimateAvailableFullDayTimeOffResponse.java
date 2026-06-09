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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * EstimateAvailableFullDayTimeOffResponse
 */

public class EstimateAvailableFullDayTimeOffResponse  implements Serializable {
  
  private LocalDate date = null;
  private Integer durationMinutes = null;
  private Integer payableMinutes = null;
  private Boolean flexible = null;

  private static class OverrideDateTypeEnumDeserializer extends StdDeserializer<OverrideDateTypeEnum> {
    public OverrideDateTypeEnumDeserializer() {
      super(OverrideDateTypeEnumDeserializer.class);
    }

    @Override
    public OverrideDateTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OverrideDateTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The override date type, if the requested day is an override date
   */
 @JsonDeserialize(using = OverrideDateTypeEnumDeserializer.class)
  public enum OverrideDateTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BLOCKED("Blocked"),
    MANUALREVIEW("ManualReview");

    private String value;

    OverrideDateTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OverrideDateTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OverrideDateTypeEnum value : OverrideDateTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OverrideDateTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OverrideDateTypeEnum overrideDateType = null;

  public EstimateAvailableFullDayTimeOffResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public EstimateAvailableFullDayTimeOffResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Date in yyyy-MM-dd format for full day request. Should be interpreted in the business unit's configured time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public EstimateAvailableFullDayTimeOffResponse date(LocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date in yyyy-MM-dd format for full day request. Should be interpreted in the business unit's configured time zone. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }


  /**
   * An estimation of time off request length in minutes
   **/
  public EstimateAvailableFullDayTimeOffResponse durationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An estimation of time off request length in minutes")
  @JsonProperty("durationMinutes")
  public Integer getDurationMinutes() {
    return durationMinutes;
  }
  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  /**
   * An estimation of payable part of time off request in minutes
   **/
  public EstimateAvailableFullDayTimeOffResponse payableMinutes(Integer payableMinutes) {
    this.payableMinutes = payableMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An estimation of payable part of time off request in minutes")
  @JsonProperty("payableMinutes")
  public Integer getPayableMinutes() {
    return payableMinutes;
  }
  public void setPayableMinutes(Integer payableMinutes) {
    this.payableMinutes = payableMinutes;
  }


  /**
   * Whether there is flexibility for a user to choose different hours than the system estimated
   **/
  public EstimateAvailableFullDayTimeOffResponse flexible(Boolean flexible) {
    this.flexible = flexible;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether there is flexibility for a user to choose different hours than the system estimated")
  @JsonProperty("flexible")
  public Boolean getFlexible() {
    return flexible;
  }
  public void setFlexible(Boolean flexible) {
    this.flexible = flexible;
  }


  /**
   * The override date type, if the requested day is an override date
   **/
  public EstimateAvailableFullDayTimeOffResponse overrideDateType(OverrideDateTypeEnum overrideDateType) {
    this.overrideDateType = overrideDateType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The override date type, if the requested day is an override date")
  @JsonProperty("overrideDateType")
  public OverrideDateTypeEnum getOverrideDateType() {
    return overrideDateType;
  }
  public void setOverrideDateType(OverrideDateTypeEnum overrideDateType) {
    this.overrideDateType = overrideDateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateAvailableFullDayTimeOffResponse estimateAvailableFullDayTimeOffResponse = (EstimateAvailableFullDayTimeOffResponse) o;

    return Objects.equals(this.date, estimateAvailableFullDayTimeOffResponse.date) &&
            Objects.equals(this.durationMinutes, estimateAvailableFullDayTimeOffResponse.durationMinutes) &&
            Objects.equals(this.payableMinutes, estimateAvailableFullDayTimeOffResponse.payableMinutes) &&
            Objects.equals(this.flexible, estimateAvailableFullDayTimeOffResponse.flexible) &&
            Objects.equals(this.overrideDateType, estimateAvailableFullDayTimeOffResponse.overrideDateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, durationMinutes, payableMinutes, flexible, overrideDateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateAvailableFullDayTimeOffResponse {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    payableMinutes: ").append(toIndentedString(payableMinutes)).append("\n");
    sb.append("    flexible: ").append(toIndentedString(flexible)).append("\n");
    sb.append("    overrideDateType: ").append(toIndentedString(overrideDateType)).append("\n");
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

