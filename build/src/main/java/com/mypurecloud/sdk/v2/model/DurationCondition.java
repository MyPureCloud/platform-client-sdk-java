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
 * DurationCondition
 */

public class DurationCondition  implements Serializable {
  

  /**
   * Gets or Sets durationTarget
   */
  public enum DurationTargetEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DURATION("DURATION"),
    DURATION_RANGE("DURATION_RANGE");

    private String value;

    DurationTargetEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DurationTargetEnum fromString(String key) {
      if (key == null) return null;

      for (DurationTargetEnum value : DurationTargetEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DurationTargetEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DurationTargetEnum durationTarget = null;
  private String durationOperator = null;
  private String durationRange = null;

  
  /**
   **/
  public DurationCondition durationTarget(DurationTargetEnum durationTarget) {
    this.durationTarget = durationTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationTarget")
  public DurationTargetEnum getDurationTarget() {
    return durationTarget;
  }
  public void setDurationTarget(DurationTargetEnum durationTarget) {
    this.durationTarget = durationTarget;
  }

  
  /**
   **/
  public DurationCondition durationOperator(String durationOperator) {
    this.durationOperator = durationOperator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationOperator")
  public String getDurationOperator() {
    return durationOperator;
  }
  public void setDurationOperator(String durationOperator) {
    this.durationOperator = durationOperator;
  }

  
  /**
   **/
  public DurationCondition durationRange(String durationRange) {
    this.durationRange = durationRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationRange")
  public String getDurationRange() {
    return durationRange;
  }
  public void setDurationRange(String durationRange) {
    this.durationRange = durationRange;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DurationCondition durationCondition = (DurationCondition) o;
    return Objects.equals(this.durationTarget, durationCondition.durationTarget) &&
        Objects.equals(this.durationOperator, durationCondition.durationOperator) &&
        Objects.equals(this.durationRange, durationCondition.durationRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationTarget, durationOperator, durationRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationCondition {\n");
    
    sb.append("    durationTarget: ").append(toIndentedString(durationTarget)).append("\n");
    sb.append("    durationOperator: ").append(toIndentedString(durationOperator)).append("\n");
    sb.append("    durationRange: ").append(toIndentedString(durationRange)).append("\n");
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

