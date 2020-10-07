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
 * WorkPlanValidationMessageArgument
 */

public class WorkPlanValidationMessageArgument  implements Serializable {
  

  /**
   * The type of the argument associated with violation messages
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COUNT("Count"),
    MAXSHIFTCOUNT("MaxShiftCount"),
    MINUTES("Minutes"),
    SHIFTID("ShiftId");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String value = null;

  
  /**
   * The type of the argument associated with violation messages
   **/
  public WorkPlanValidationMessageArgument type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the argument associated with violation messages")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The value of the argument
   **/
  public WorkPlanValidationMessageArgument value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the argument")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanValidationMessageArgument workPlanValidationMessageArgument = (WorkPlanValidationMessageArgument) o;
    return Objects.equals(this.type, workPlanValidationMessageArgument.type) &&
        Objects.equals(this.value, workPlanValidationMessageArgument.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanValidationMessageArgument {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

