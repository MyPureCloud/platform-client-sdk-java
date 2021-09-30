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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Check;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KeyPerformanceIndicatorAssessment
 */

public class KeyPerformanceIndicatorAssessment  implements Serializable {
  
  private String kpi = null;

  private static class AssessmentResultEnumDeserializer extends StdDeserializer<AssessmentResultEnum> {
    public AssessmentResultEnumDeserializer() {
      super(AssessmentResultEnumDeserializer.class);
    }

    @Override
    public AssessmentResultEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssessmentResultEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The overall result of the assessment for a key performance indicator.
   */
 @JsonDeserialize(using = AssessmentResultEnumDeserializer.class)
  public enum AssessmentResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    NOTSUPPORTED("NotSupported"),
    HIGH("High"),
    LOW("Low"),
    ERROR("Error");

    private String value;

    AssessmentResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssessmentResultEnum fromString(String key) {
      if (key == null) return null;

      for (AssessmentResultEnum value : AssessmentResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssessmentResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssessmentResultEnum assessmentResult = null;
  private List<Check> checks = new ArrayList<Check>();

  
  @ApiModelProperty(example = "null", value = "Name of the key performance indicator assessed.")
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }

  
  @ApiModelProperty(example = "null", value = "The overall result of the assessment for a key performance indicator.")
  @JsonProperty("assessmentResult")
  public AssessmentResultEnum getAssessmentResult() {
    return assessmentResult;
  }

  
  @ApiModelProperty(example = "null", value = "Set of checks executed as part of an assessment.")
  @JsonProperty("checks")
  public List<Check> getChecks() {
    return checks;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPerformanceIndicatorAssessment keyPerformanceIndicatorAssessment = (KeyPerformanceIndicatorAssessment) o;
    return Objects.equals(this.kpi, keyPerformanceIndicatorAssessment.kpi) &&
        Objects.equals(this.assessmentResult, keyPerformanceIndicatorAssessment.assessmentResult) &&
        Objects.equals(this.checks, keyPerformanceIndicatorAssessment.checks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kpi, assessmentResult, checks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPerformanceIndicatorAssessment {\n");
    
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    assessmentResult: ").append(toIndentedString(assessmentResult)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
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

