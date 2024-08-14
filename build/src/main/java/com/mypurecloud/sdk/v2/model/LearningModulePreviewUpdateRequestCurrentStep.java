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
import com.mypurecloud.sdk.v2.model.LearningShareableContentObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Learning module preview update request current step
 */
@ApiModel(description = "Learning module preview update request current step")

public class LearningModulePreviewUpdateRequestCurrentStep  implements Serializable {
  
  private String id = null;
  private Float completionPercentage = null;
  private LearningShareableContentObject shareableContentObject = null;

  
  /**
   * The id of this step
   **/
  public LearningModulePreviewUpdateRequestCurrentStep id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of this step")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The completion percentage for this step
   **/
  public LearningModulePreviewUpdateRequestCurrentStep completionPercentage(Float completionPercentage) {
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


  /**
   * The SCO (Shareable Content Object) data
   **/
  public LearningModulePreviewUpdateRequestCurrentStep shareableContentObject(LearningShareableContentObject shareableContentObject) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePreviewUpdateRequestCurrentStep learningModulePreviewUpdateRequestCurrentStep = (LearningModulePreviewUpdateRequestCurrentStep) o;

    return Objects.equals(this.id, learningModulePreviewUpdateRequestCurrentStep.id) &&
            Objects.equals(this.completionPercentage, learningModulePreviewUpdateRequestCurrentStep.completionPercentage) &&
            Objects.equals(this.shareableContentObject, learningModulePreviewUpdateRequestCurrentStep.shareableContentObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, completionPercentage, shareableContentObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewUpdateRequestCurrentStep {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    shareableContentObject: ").append(toIndentedString(shareableContentObject)).append("\n");
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

