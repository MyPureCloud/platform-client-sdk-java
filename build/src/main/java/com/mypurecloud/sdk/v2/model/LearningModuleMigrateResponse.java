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
import com.mypurecloud.sdk.v2.model.LearningModuleAutoAssignResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Migrate response
 */
@ApiModel(description = "Migrate response")

public class LearningModuleMigrateResponse  implements Serializable {
  
  private LearningModuleAutoAssignResponse autoAssign = null;

  public LearningModuleMigrateResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The autoAssign Response
   **/
  public LearningModuleMigrateResponse autoAssign(LearningModuleAutoAssignResponse autoAssign) {
    this.autoAssign = autoAssign;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The autoAssign Response")
  @JsonProperty("autoAssign")
  public LearningModuleAutoAssignResponse getAutoAssign() {
    return autoAssign;
  }
  public void setAutoAssign(LearningModuleAutoAssignResponse autoAssign) {
    this.autoAssign = autoAssign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleMigrateResponse learningModuleMigrateResponse = (LearningModuleMigrateResponse) o;

    return Objects.equals(this.autoAssign, learningModuleMigrateResponse.autoAssign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoAssign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleMigrateResponse {\n");
    
    sb.append("    autoAssign: ").append(toIndentedString(autoAssign)).append("\n");
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

