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
import com.mypurecloud.sdk.v2.model.LearningAssignmentStepScoStructure;
import com.mypurecloud.sdk.v2.model.LearningAssignmentStepSignedCookie;
import com.mypurecloud.sdk.v2.model.LearningModuleInformStep;
import com.mypurecloud.sdk.v2.model.LearningShareableContentObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning assignment step
 */
@ApiModel(description = "Learning assignment step")

public class LearningAssignmentStep  implements Serializable {
  
  private String id = null;
  private LearningModuleInformStep moduleStep = null;
  private List<LearningAssignmentStepScoStructure> structure = new ArrayList<LearningAssignmentStepScoStructure>();

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
  private LearningShareableContentObject shareableContentObject = null;
  private LearningAssignmentStepSignedCookie signedCookie = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The ID of the learning assignment step")
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
  public List<LearningAssignmentStepScoStructure> getStructure() {
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
  public LearningAssignmentStep completionPercentage(Float completionPercentage) {
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


  /**
   * The SCO (Shareable Content Object) data
   **/
  public LearningAssignmentStep shareableContentObject(LearningShareableContentObject shareableContentObject) {
    this.shareableContentObject = shareableContentObject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The SCO (Shareable Content Object) data")
  @JsonProperty("shareableContentObject")
  public LearningShareableContentObject getShareableContentObject() {
    return shareableContentObject;
  }
  public void setShareableContentObject(LearningShareableContentObject shareableContentObject) {
    this.shareableContentObject = shareableContentObject;
  }


  @ApiModelProperty(example = "null", value = "The signed cookie information needed to access the content of this step (if required)")
  @JsonProperty("signedCookie")
  public LearningAssignmentStepSignedCookie getSignedCookie() {
    return signedCookie;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentStep learningAssignmentStep = (LearningAssignmentStep) o;

    return Objects.equals(this.id, learningAssignmentStep.id) &&
            Objects.equals(this.moduleStep, learningAssignmentStep.moduleStep) &&
            Objects.equals(this.structure, learningAssignmentStep.structure) &&
            Objects.equals(this.successStatus, learningAssignmentStep.successStatus) &&
            Objects.equals(this.completionStatus, learningAssignmentStep.completionStatus) &&
            Objects.equals(this.completionPercentage, learningAssignmentStep.completionPercentage) &&
            Objects.equals(this.percentageScore, learningAssignmentStep.percentageScore) &&
            Objects.equals(this.shareableContentObject, learningAssignmentStep.shareableContentObject) &&
            Objects.equals(this.signedCookie, learningAssignmentStep.signedCookie) &&
            Objects.equals(this.selfUri, learningAssignmentStep.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, moduleStep, structure, successStatus, completionStatus, completionPercentage, percentageScore, shareableContentObject, signedCookie, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentStep {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    moduleStep: ").append(toIndentedString(moduleStep)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
    sb.append("    successStatus: ").append(toIndentedString(successStatus)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    shareableContentObject: ").append(toIndentedString(shareableContentObject)).append("\n");
    sb.append("    signedCookie: ").append(toIndentedString(signedCookie)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

