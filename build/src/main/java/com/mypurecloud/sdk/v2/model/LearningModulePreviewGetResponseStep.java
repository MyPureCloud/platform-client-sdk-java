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
import com.mypurecloud.sdk.v2.model.LearningAssignmentStepSignedCookie;
import com.mypurecloud.sdk.v2.model.LearningModuleInformStep;
import com.mypurecloud.sdk.v2.model.LearningModulePreviewGetScoStructure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module preview get response assignment step
 */
@ApiModel(description = "Learning module preview get response assignment step")

public class LearningModulePreviewGetResponseStep  implements Serializable {
  
  private String id = null;
  private LearningModuleInformStep moduleStep = null;
  private List<LearningModulePreviewGetScoStructure> structure = new ArrayList<LearningModulePreviewGetScoStructure>();

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
   * The success status of this step
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
   * The completion status of the assignment step
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
  private LearningAssignmentStepSignedCookie signedCookie = null;

  
  @ApiModelProperty(example = "null", value = "The id of the step")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The module step data for this step")
  @JsonProperty("moduleStep")
  public LearningModuleInformStep getModuleStep() {
    return moduleStep;
  }


  @ApiModelProperty(example = "null", value = "The structure for any SCO associated with this step")
  @JsonProperty("structure")
  public List<LearningModulePreviewGetScoStructure> getStructure() {
    return structure;
  }


  @ApiModelProperty(example = "null", value = "The success status of this step")
  @JsonProperty("successStatus")
  public SuccessStatusEnum getSuccessStatus() {
    return successStatus;
  }


  @ApiModelProperty(example = "null", value = "The completion status of the assignment step")
  @JsonProperty("completionStatus")
  public CompletionStatusEnum getCompletionStatus() {
    return completionStatus;
  }


  /**
   * The completion percentage for this step
   **/
  public LearningModulePreviewGetResponseStep completionPercentage(Float completionPercentage) {
    this.completionPercentage = completionPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The completion percentage for this step")
  @JsonProperty("completionPercentage")
  public Float getCompletionPercentage() {
    return completionPercentage;
  }
  public void setCompletionPercentage(Float completionPercentage) {
    this.completionPercentage = completionPercentage;
  }


  @ApiModelProperty(example = "null", value = "The percentage score for this step")
  @JsonProperty("percentageScore")
  public Float getPercentageScore() {
    return percentageScore;
  }


  @ApiModelProperty(example = "null", value = "The signed cookie information needed to access the content of this step (if required)")
  @JsonProperty("signedCookie")
  public LearningAssignmentStepSignedCookie getSignedCookie() {
    return signedCookie;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePreviewGetResponseStep learningModulePreviewGetResponseStep = (LearningModulePreviewGetResponseStep) o;

    return Objects.equals(this.id, learningModulePreviewGetResponseStep.id) &&
            Objects.equals(this.moduleStep, learningModulePreviewGetResponseStep.moduleStep) &&
            Objects.equals(this.structure, learningModulePreviewGetResponseStep.structure) &&
            Objects.equals(this.successStatus, learningModulePreviewGetResponseStep.successStatus) &&
            Objects.equals(this.completionStatus, learningModulePreviewGetResponseStep.completionStatus) &&
            Objects.equals(this.completionPercentage, learningModulePreviewGetResponseStep.completionPercentage) &&
            Objects.equals(this.percentageScore, learningModulePreviewGetResponseStep.percentageScore) &&
            Objects.equals(this.signedCookie, learningModulePreviewGetResponseStep.signedCookie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, moduleStep, structure, successStatus, completionStatus, completionPercentage, percentageScore, signedCookie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewGetResponseStep {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    moduleStep: ").append(toIndentedString(moduleStep)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
    sb.append("    successStatus: ").append(toIndentedString(successStatus)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    signedCookie: ").append(toIndentedString(signedCookie)).append("\n");
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

