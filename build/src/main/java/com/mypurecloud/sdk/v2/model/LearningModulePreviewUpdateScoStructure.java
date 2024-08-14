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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Learning module preview update SCO structure
 */
@ApiModel(description = "Learning module preview update SCO structure")

public class LearningModulePreviewUpdateScoStructure  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * The success status of this SCO
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
   * The completion status of this SCO
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
  private Float percentageScore = null;
  private List<LearningModulePreviewUpdateScoStructure> children = new ArrayList<LearningModulePreviewUpdateScoStructure>();

  
  /**
   * The id of this SCO in the course manifest
   **/
  public LearningModulePreviewUpdateScoStructure id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of this SCO in the course manifest")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of this SCO in the course manifest
   **/
  public LearningModulePreviewUpdateScoStructure name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of this SCO in the course manifest")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The success status of this SCO
   **/
  public LearningModulePreviewUpdateScoStructure successStatus(SuccessStatusEnum successStatus) {
    this.successStatus = successStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The success status of this SCO")
  @JsonProperty("successStatus")
  public SuccessStatusEnum getSuccessStatus() {
    return successStatus;
  }
  public void setSuccessStatus(SuccessStatusEnum successStatus) {
    this.successStatus = successStatus;
  }


  /**
   * The completion status of this SCO
   **/
  public LearningModulePreviewUpdateScoStructure completionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The completion status of this SCO")
  @JsonProperty("completionStatus")
  public CompletionStatusEnum getCompletionStatus() {
    return completionStatus;
  }
  public void setCompletionStatus(CompletionStatusEnum completionStatus) {
    this.completionStatus = completionStatus;
  }


  /**
   * Percentage Score
   **/
  public LearningModulePreviewUpdateScoStructure percentageScore(Float percentageScore) {
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
   * Child items belonging to this SCO in the course manifest
   **/
  public LearningModulePreviewUpdateScoStructure children(List<LearningModulePreviewUpdateScoStructure> children) {
    this.children = children;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Child items belonging to this SCO in the course manifest")
  @JsonProperty("children")
  public List<LearningModulePreviewUpdateScoStructure> getChildren() {
    return children;
  }
  public void setChildren(List<LearningModulePreviewUpdateScoStructure> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePreviewUpdateScoStructure learningModulePreviewUpdateScoStructure = (LearningModulePreviewUpdateScoStructure) o;

    return Objects.equals(this.id, learningModulePreviewUpdateScoStructure.id) &&
            Objects.equals(this.name, learningModulePreviewUpdateScoStructure.name) &&
            Objects.equals(this.successStatus, learningModulePreviewUpdateScoStructure.successStatus) &&
            Objects.equals(this.completionStatus, learningModulePreviewUpdateScoStructure.completionStatus) &&
            Objects.equals(this.percentageScore, learningModulePreviewUpdateScoStructure.percentageScore) &&
            Objects.equals(this.children, learningModulePreviewUpdateScoStructure.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, successStatus, completionStatus, percentageScore, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewUpdateScoStructure {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    successStatus: ").append(toIndentedString(successStatus)).append("\n");
    sb.append("    completionStatus: ").append(toIndentedString(completionStatus)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

