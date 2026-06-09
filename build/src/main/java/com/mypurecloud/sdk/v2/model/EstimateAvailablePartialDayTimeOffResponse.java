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
import java.util.Date;

import java.io.Serializable;
/**
 * EstimateAvailablePartialDayTimeOffResponse
 */

public class EstimateAvailablePartialDayTimeOffResponse  implements Serializable {
  
  private Date date = null;
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
   * The override date type, if the partial day request overlaps with an override date
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

  public EstimateAvailablePartialDayTimeOffResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public EstimateAvailablePartialDayTimeOffResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Start date-time in ISO-8601 format for partial day request
   **/
  public EstimateAvailablePartialDayTimeOffResponse date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date-time in ISO-8601 format for partial day request")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  /**
   * An estimation of time off request length in minutes
   **/
  public EstimateAvailablePartialDayTimeOffResponse durationMinutes(Integer durationMinutes) {
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
  public EstimateAvailablePartialDayTimeOffResponse payableMinutes(Integer payableMinutes) {
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
  public EstimateAvailablePartialDayTimeOffResponse flexible(Boolean flexible) {
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
   * The override date type, if the partial day request overlaps with an override date
   **/
  public EstimateAvailablePartialDayTimeOffResponse overrideDateType(OverrideDateTypeEnum overrideDateType) {
    this.overrideDateType = overrideDateType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The override date type, if the partial day request overlaps with an override date")
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
    EstimateAvailablePartialDayTimeOffResponse estimateAvailablePartialDayTimeOffResponse = (EstimateAvailablePartialDayTimeOffResponse) o;

    return Objects.equals(this.date, estimateAvailablePartialDayTimeOffResponse.date) &&
            Objects.equals(this.durationMinutes, estimateAvailablePartialDayTimeOffResponse.durationMinutes) &&
            Objects.equals(this.payableMinutes, estimateAvailablePartialDayTimeOffResponse.payableMinutes) &&
            Objects.equals(this.flexible, estimateAvailablePartialDayTimeOffResponse.flexible) &&
            Objects.equals(this.overrideDateType, estimateAvailablePartialDayTimeOffResponse.overrideDateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, durationMinutes, payableMinutes, flexible, overrideDateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateAvailablePartialDayTimeOffResponse {\n");
    
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

