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
import com.mypurecloud.sdk.v2.model.DetectedNamedEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IntentFeedback
 */

public class IntentFeedback  implements Serializable {
  
  private String name = null;
  private Double probability = null;
  private List<DetectedNamedEntity> entities = new ArrayList<DetectedNamedEntity>();

  private static class AssessmentEnumDeserializer extends StdDeserializer<AssessmentEnum> {
    public AssessmentEnumDeserializer() {
      super(AssessmentEnumDeserializer.class);
    }

    @Override
    public AssessmentEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssessmentEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The assessment on the detection for feedback text.
   */
 @JsonDeserialize(using = AssessmentEnumDeserializer.class)
  public enum AssessmentEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INCORRECT("Incorrect"),
    CORRECT("Correct"),
    UNKNOWN("Unknown"),
    DISABLED("Disabled");

    private String value;

    AssessmentEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssessmentEnum fromString(String key) {
      if (key == null) return null;

      for (AssessmentEnum value : AssessmentEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssessmentEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssessmentEnum assessment = null;

  
  @ApiModelProperty(example = "null", value = "The name of the detected intent.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The probability of the detected intent.")
  @JsonProperty("probability")
  public Double getProbability() {
    return probability;
  }

  
  @ApiModelProperty(example = "null", value = "The collection of named entities detected.")
  @JsonProperty("entities")
  public List<DetectedNamedEntity> getEntities() {
    return entities;
  }

  
  /**
   * The assessment on the detection for feedback text.
   **/
  public IntentFeedback assessment(AssessmentEnum assessment) {
    this.assessment = assessment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The assessment on the detection for feedback text.")
  @JsonProperty("assessment")
  public AssessmentEnum getAssessment() {
    return assessment;
  }
  public void setAssessment(AssessmentEnum assessment) {
    this.assessment = assessment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentFeedback intentFeedback = (IntentFeedback) o;
    return Objects.equals(this.name, intentFeedback.name) &&
        Objects.equals(this.probability, intentFeedback.probability) &&
        Objects.equals(this.entities, intentFeedback.entities) &&
        Objects.equals(this.assessment, intentFeedback.assessment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, probability, entities, assessment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentFeedback {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
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

