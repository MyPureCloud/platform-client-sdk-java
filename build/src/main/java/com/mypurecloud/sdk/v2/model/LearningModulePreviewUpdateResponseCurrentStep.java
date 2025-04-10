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
import com.mypurecloud.sdk.v2.model.LearningShareableContentObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Learning module preview update response current step
 */
@ApiModel(description = "Learning module preview update response current step")

public class LearningModulePreviewUpdateResponseCurrentStep  implements Serializable {
  
  private LearningShareableContentObject shareableContentObject = null;

  public LearningModulePreviewUpdateResponseCurrentStep() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The SCO (Shareable Content Object) data
   **/
  public LearningModulePreviewUpdateResponseCurrentStep shareableContentObject(LearningShareableContentObject shareableContentObject) {
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
    LearningModulePreviewUpdateResponseCurrentStep learningModulePreviewUpdateResponseCurrentStep = (LearningModulePreviewUpdateResponseCurrentStep) o;

    return Objects.equals(this.shareableContentObject, learningModulePreviewUpdateResponseCurrentStep.shareableContentObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareableContentObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewUpdateResponseCurrentStep {\n");
    
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

