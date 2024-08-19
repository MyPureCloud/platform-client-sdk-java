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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AiAnswer
 */

public class AiAnswer  implements Serializable {
  
  private String answerId = null;
  private String explanation = null;

  private static class FailureTypeEnumDeserializer extends StdDeserializer<FailureTypeEnum> {
    public FailureTypeEnumDeserializer() {
      super(FailureTypeEnumDeserializer.class);
    }

    @Override
    public FailureTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FailureTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Describes the type of error associated with the AI answer.
   */
 @JsonDeserialize(using = FailureTypeEnumDeserializer.class)
  public enum FailureTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOWCONFIDENCEERROR("LowConfidenceError"),
    PARSINGERROR("ParsingError"),
    SERVICEERROR("ServiceError"),
    LOWHISTORICALACCURACYERROR("LowHistoricalAccuracyError");

    private String value;

    FailureTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FailureTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FailureTypeEnum value : FailureTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FailureTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FailureTypeEnum failureType = null;

  
  /**
   * The unique identifier of the suggested AI answer.
   **/
  public AiAnswer answerId(String answerId) {
    this.answerId = answerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the suggested AI answer.")
  @JsonProperty("answerId")
  public String getAnswerId() {
    return answerId;
  }
  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }


  /**
   * An explanation providing the reasoning behind the suggested answer.
   **/
  public AiAnswer explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An explanation providing the reasoning behind the suggested answer.")
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }
  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  /**
   * Describes the type of error associated with the AI answer.
   **/
  public AiAnswer failureType(FailureTypeEnum failureType) {
    this.failureType = failureType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the type of error associated with the AI answer.")
  @JsonProperty("failureType")
  public FailureTypeEnum getFailureType() {
    return failureType;
  }
  public void setFailureType(FailureTypeEnum failureType) {
    this.failureType = failureType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiAnswer aiAnswer = (AiAnswer) o;

    return Objects.equals(this.answerId, aiAnswer.answerId) &&
            Objects.equals(this.explanation, aiAnswer.explanation) &&
            Objects.equals(this.failureType, aiAnswer.failureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answerId, explanation, failureType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiAnswer {\n");
    
    sb.append("    answerId: ").append(toIndentedString(answerId)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    failureType: ").append(toIndentedString(failureType)).append("\n");
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

