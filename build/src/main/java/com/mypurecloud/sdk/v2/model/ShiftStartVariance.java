package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Variance in minutes among start times of shifts in work plan
 */
@ApiModel(description = "Variance in minutes among start times of shifts in work plan")

public class ShiftStartVariance  implements Serializable {
  

  private static class ApplicableDaysEnumDeserializer extends StdDeserializer<ApplicableDaysEnum> {
    public ApplicableDaysEnumDeserializer() {
      super(ApplicableDaysEnumDeserializer.class);
    }

    @Override
    public ApplicableDaysEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ApplicableDaysEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets applicableDays
   */
 @JsonDeserialize(using = ApplicableDaysEnumDeserializer.class)
  public enum ApplicableDaysEnum {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    ApplicableDaysEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ApplicableDaysEnum fromString(String key) {
      if (key == null) return null;

      for (ApplicableDaysEnum value : ApplicableDaysEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ApplicableDaysEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ApplicableDaysEnum> applicableDays = new ArrayList<ApplicableDaysEnum>();
  private Integer maxShiftStartVarianceMinutes = null;

  
  /**
   * Days for which shift start variance is configured
   **/
  public ShiftStartVariance applicableDays(List<ApplicableDaysEnum> applicableDays) {
    this.applicableDays = applicableDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Days for which shift start variance is configured")
  @JsonProperty("applicableDays")
  public List<ApplicableDaysEnum> getApplicableDays() {
    return applicableDays;
  }
  public void setApplicableDays(List<ApplicableDaysEnum> applicableDays) {
    this.applicableDays = applicableDays;
  }

  
  /**
   * Maximum variance in minutes across shift starts
   **/
  public ShiftStartVariance maxShiftStartVarianceMinutes(Integer maxShiftStartVarianceMinutes) {
    this.maxShiftStartVarianceMinutes = maxShiftStartVarianceMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximum variance in minutes across shift starts")
  @JsonProperty("maxShiftStartVarianceMinutes")
  public Integer getMaxShiftStartVarianceMinutes() {
    return maxShiftStartVarianceMinutes;
  }
  public void setMaxShiftStartVarianceMinutes(Integer maxShiftStartVarianceMinutes) {
    this.maxShiftStartVarianceMinutes = maxShiftStartVarianceMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftStartVariance shiftStartVariance = (ShiftStartVariance) o;
    return Objects.equals(this.applicableDays, shiftStartVariance.applicableDays) &&
        Objects.equals(this.maxShiftStartVarianceMinutes, shiftStartVariance.maxShiftStartVarianceMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableDays, maxShiftStartVarianceMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftStartVariance {\n");
    
    sb.append("    applicableDays: ").append(toIndentedString(applicableDays)).append("\n");
    sb.append("    maxShiftStartVarianceMinutes: ").append(toIndentedString(maxShiftStartVarianceMinutes)).append("\n");
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

