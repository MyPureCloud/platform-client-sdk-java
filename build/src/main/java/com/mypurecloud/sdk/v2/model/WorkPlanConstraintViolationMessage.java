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
import com.mypurecloud.sdk.v2.model.UnavailableTimesViolationMessageArgument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanConstraintViolationMessage
 */

public class WorkPlanConstraintViolationMessage  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of the work plan constraint in this message.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MINIMUMWEEKLYWORKDAYS("MinimumWeeklyWorkDays"),
    MINIMUMWEEKLYPAIDTIME("MinimumWeeklyPaidTime"),
    REQUIREDSHIFT("RequiredShift"),
    MAXIMUMDAYSOFFPERPLANNINGPERIOD("MaximumDaysOffPerPlanningPeriod"),
    MINIMUMPAIDTIMEPERPLANNINGPERIOD("MinimumPaidTimePerPlanningPeriod"),
    MINIMUMSHIFTCOUNTPERPLANNINGPERIOD("MinimumShiftCountPerPlanningPeriod");

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
  private List<UnavailableTimesViolationMessageArgument> arguments = null;

  public WorkPlanConstraintViolationMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      arguments = new ArrayList<UnavailableTimesViolationMessageArgument>();
    }
  }

  
  /**
   * Type of the work plan constraint in this message.
   **/
  public WorkPlanConstraintViolationMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the work plan constraint in this message.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Arguments of the message that provide information about the constraint that is being conflicted with such as the value of the constraint.
   **/
  public WorkPlanConstraintViolationMessage arguments(List<UnavailableTimesViolationMessageArgument> arguments) {
    this.arguments = arguments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Arguments of the message that provide information about the constraint that is being conflicted with such as the value of the constraint.")
  @JsonProperty("arguments")
  public List<UnavailableTimesViolationMessageArgument> getArguments() {
    return arguments;
  }
  public void setArguments(List<UnavailableTimesViolationMessageArgument> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkPlanConstraintViolationMessage workPlanConstraintViolationMessage = (WorkPlanConstraintViolationMessage) o;

    return Objects.equals(this.type, workPlanConstraintViolationMessage.type) &&
            Objects.equals(this.arguments, workPlanConstraintViolationMessage.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanConstraintViolationMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

