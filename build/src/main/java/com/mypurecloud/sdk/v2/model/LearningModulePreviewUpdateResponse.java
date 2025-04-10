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
import com.mypurecloud.sdk.v2.model.LearningModulePreviewUpdateResponseAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Learning module preview update response
 */
@ApiModel(description = "Learning module preview update response")

public class LearningModulePreviewUpdateResponse  implements Serializable {
  
  private String id = null;
  private LearningModulePreviewUpdateResponseAssignment assignment = null;

  public LearningModulePreviewUpdateResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Learning Module id
   **/
  public LearningModulePreviewUpdateResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Learning Module id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The Assignment Preview
   **/
  public LearningModulePreviewUpdateResponse assignment(LearningModulePreviewUpdateResponseAssignment assignment) {
    this.assignment = assignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Assignment Preview")
  @JsonProperty("assignment")
  public LearningModulePreviewUpdateResponseAssignment getAssignment() {
    return assignment;
  }
  public void setAssignment(LearningModulePreviewUpdateResponseAssignment assignment) {
    this.assignment = assignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePreviewUpdateResponse learningModulePreviewUpdateResponse = (LearningModulePreviewUpdateResponse) o;

    return Objects.equals(this.id, learningModulePreviewUpdateResponse.id) &&
            Objects.equals(this.assignment, learningModulePreviewUpdateResponse.assignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePreviewUpdateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
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

