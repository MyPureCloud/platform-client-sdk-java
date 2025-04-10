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
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateScoStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module preview update assignment step
 */
@ApiModel(description = "Learning module preview update assignment step")

public class LearningModulePreviewUpdateStep  implements Serializable {
  
  private String id = null;

  private static class SuccessStatusEnumDeserializer extends StdDeserializer<SuccessStatusEnum> {
    public SuccessStatusEnumDeserializer() {
      super(SuccessStatusEnumDeserializer.class);
    }

    @Override
    public SuccessStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SuccessStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The success status of the step
   */
 @JsonDeserialize(using = SuccessStatusEnumDeserializer.class)
  public enum SuccessStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PASSED("Passed"),
    FAILED("Failed"),
    UNKNOWN("Unknown");

    private String value;

    SuccessStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SuccessStatusEnum fromString(String key) {
      if (key == null) return null;

      for (SuccessStatusEnum value : SuccessStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SuccessStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SuccessStatusEnum successStatus = null;

  private static class CompletionStatusEnumDeserializer extends StdDeserializer<CompletionStatusEnum> {
    public CompletionStatusEnumDeserializer() {
      super(CompletionStatusEnumDeserializer.class);
    }

    @Override
    public CompletionStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CompletionStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The completion status of the step
   */
 @JsonDeserialize(using = CompletionStatusEnumDeserializer.class)
  public enum CompletionStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETED("Completed"),
    INCOMPLETE("Incomplete"),
    NOTATTEMPTED("NotAttempted"),
    UNKNOWN("Unknown");

    private String value;

    CompletionStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CompletionStatusEnum fromString(String key) {
      if (key == null) return null;

      for (CompletionStatusEnum value : CompletionStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CompletionStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CompletionStatusEnum completionStatus = null;
  private Float completionPercentage = null;
  private Float percentageScore = null;
  private List<LearningModulePreviewUpdateScoStructure> structure = null;

  public LearningModulePreviewUpdateStep() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      structure = new ArrayList<LearningModulePreviewUpdateScoStructure>();
    }
  }

  
  /**
   * The id of the step
   **/
  public LearningModulePreviewUpdateStep id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the step")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The success status of the step
   **/
  public LearningModulePreviewUpdateStep successStatus(SuccessStatusEnum successStatus) {
    this.successStatus = successStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The success status of the step")
  @JsonProperty("successStatus")
  public SuccessStatusEnum getSuccessStatus() {
    return successStatus;
  }
  public void setSuccessStatus(SuccessStatusEnum successStatus) {
    this.successStatus = successStatus;
  }


  /**
   * The completion status of the step
   **/
  public LearningModulePreviewUpdateStep completionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The completion status of the step")
  @JsonProperty("completionStatus")
  public CompletionStatusEnum getCompletionStatus() {
    return completionStatus;
  }
  public void setCompletionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
  }


  /**
   * The completion percentage of the step
   **/
  public LearningModulePreviewUpdateStep completionPercentage(Float completionPercentage) {
    this.completionPercentage = completionPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The completion percentage of the step")
  @JsonProperty("completionPercentage")
  public Float getCompletionPercentage() {
    return completionPercentage;
  }
  public void setCompletionPercentage(Float completionPercentage) {
    this.completionPercentage = completionPercentage;
  }


  /**
   * Percentage Score
   **/
  public LearningModulePreviewUpdateStep percentageScore(Float percentageScore) {
    this.percentageScore = percentageScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage Score")
  @JsonProperty("percentageScore")
  public Float getPercentageScore() {
    return percentageScore;
  }
  public void setPercentageScore(Float percentageScore) {
    this.percentageScore = percentageScore;
  }


  /**
   * The structure for any SCO associated with this step
   **/
  public LearningModulePreviewUpdateStep structure(List<LearningModulePreviewUpdateScoStructure> structure) {
    this.structure = structure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The structure for any SCO associated with this step")
  @JsonProperty("structure")
  public List<LearningModulePreviewUpdateScoStructure> getStructure() {
    return structure;
  }
  public void setStructure(List<LearningModulePreviewUpdateScoStructure> structure) {
    this.structure = structure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePreviewUpdateStep learningModulePreviewUpdateStep = (LearningModulePreviewUpdateStep) o;

    return Objects.equals(this.id, learningModulePreviewUpdateStep.id) &&
            Objects.equals(this.successStatus, learningModulePreviewUpdateStep.successStatus) &&
            Objects.equals(this.completionStatus, learningModulePreviewUpdateStep.completionStatus) &&
            Objects.equals(this.completionPercentage, learningModulePreviewUpdateStep.completionPercentage) &&
            Objects.equals(this.percentageScore, learningModulePreviewUpdateStep.percentageScore) &&
            Objects.equals(this.structure, learningModulePreviewUpdateStep.structure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, successStatus, completionStatus, completionPercentage, percentageScore, structure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewUpdateStep {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    successStatus: ").append(toIndentedString(successStatus)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
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

