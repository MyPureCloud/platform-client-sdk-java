package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PredictionResults
 */

public class PredictionResults  implements Serializable {
  

  /**
   * Indicates the media type scope of this estimated wait time
   */
  public enum IntentEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("ALL"),
    CALL("CALL"),
    CALLBACK("CALLBACK"),
    CHAT("CHAT"),
    EMAIL("EMAIL"),
    SOCIALEXPRESSION("SOCIALEXPRESSION"),
    VIDEOCOMM("VIDEOCOMM");

    private String value;

    IntentEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IntentEnum fromString(String key) {
      if (key == null) return null;

      for (IntentEnum value : IntentEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IntentEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IntentEnum intent = null;

  /**
   * Indicates the estimated wait time Formula
   */
  public enum FormulaEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BEST("BEST"),
    SIMPLE("SIMPLE"),
    ABANDON("ABANDON"),
    PATIENCE_ABANDON("PATIENCE_ABANDON");

    private String value;

    FormulaEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FormulaEnum fromString(String key) {
      if (key == null) return null;

      for (FormulaEnum value : FormulaEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FormulaEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FormulaEnum formula = null;
  private Integer estimatedWaitTimeSeconds = null;

  
  /**
   * Indicates the media type scope of this estimated wait time
   **/
  public PredictionResults intent(IntentEnum intent) {
    this.intent = intent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the media type scope of this estimated wait time")
  @JsonProperty("intent")
  public IntentEnum getIntent() {
    return intent;
  }
  public void setIntent(IntentEnum intent) {
    this.intent = intent;
  }


  /**
   * Indicates the estimated wait time Formula
   **/
  public PredictionResults formula(FormulaEnum formula) {
    this.formula = formula;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates the estimated wait time Formula")
  @JsonProperty("formula")
  public FormulaEnum getFormula() {
    return formula;
  }
  public void setFormula(FormulaEnum formula) {
    this.formula = formula;
  }


  /**
   * Estimated wait time in seconds
   **/
  public PredictionResults estimatedWaitTimeSeconds(Integer estimatedWaitTimeSeconds) {
    this.estimatedWaitTimeSeconds = estimatedWaitTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Estimated wait time in seconds")
  @JsonProperty("estimatedWaitTimeSeconds")
  public Integer getEstimatedWaitTimeSeconds() {
    return estimatedWaitTimeSeconds;
  }
  public void setEstimatedWaitTimeSeconds(Integer estimatedWaitTimeSeconds) {
    this.estimatedWaitTimeSeconds = estimatedWaitTimeSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictionResults predictionResults = (PredictionResults) o;
    return Objects.equals(this.intent, predictionResults.intent) &&
        Objects.equals(this.formula, predictionResults.formula) &&
        Objects.equals(this.estimatedWaitTimeSeconds, predictionResults.estimatedWaitTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, formula, estimatedWaitTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictionResults {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    estimatedWaitTimeSeconds: ").append(toIndentedString(estimatedWaitTimeSeconds)).append("\n");
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

