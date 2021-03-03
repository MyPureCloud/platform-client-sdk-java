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
import com.mypurecloud.sdk.v2.model.WorkPlanValidationMessageArgument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkPlanConstraintConflictMessage
 */

public class WorkPlanConstraintConflictMessage  implements Serializable {
  

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
   * Type of constraint conflict that can be resolved by clients in order to generate agent schedules
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWNFIX("UnknownFix"),
    WITHPOTENTIALFIXES("WithPotentialFixes");

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
  private List<WorkPlanValidationMessageArgument> arguments = new ArrayList<WorkPlanValidationMessageArgument>();

  
  /**
   * Type of constraint conflict that can be resolved by clients in order to generate agent schedules
   **/
  public WorkPlanConstraintConflictMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of constraint conflict that can be resolved by clients in order to generate agent schedules")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The arguments to the type of the message that can help clients resolve validation issues
   **/
  public WorkPlanConstraintConflictMessage arguments(List<WorkPlanValidationMessageArgument> arguments) {
    this.arguments = arguments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The arguments to the type of the message that can help clients resolve validation issues")
  @JsonProperty("arguments")
  public List<WorkPlanValidationMessageArgument> getArguments() {
    return arguments;
  }
  public void setArguments(List<WorkPlanValidationMessageArgument> arguments) {
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
    WorkPlanConstraintConflictMessage workPlanConstraintConflictMessage = (WorkPlanConstraintConflictMessage) o;
    return Objects.equals(this.type, workPlanConstraintConflictMessage.type) &&
        Objects.equals(this.arguments, workPlanConstraintConflictMessage.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkPlanConstraintConflictMessage {\n");
    
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

