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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Learning module publish request
 */
@ApiModel(description = "Learning module publish request")

public class LearningModulePublishRequest  implements Serializable {
  
  private Boolean termsAndConditionsAccepted = null;

  public LearningModulePublishRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether the terms and conditions were accepted
   **/
  public LearningModulePublishRequest termsAndConditionsAccepted(Boolean termsAndConditionsAccepted) {
    this.termsAndConditionsAccepted = termsAndConditionsAccepted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the terms and conditions were accepted")
  @JsonProperty("termsAndConditionsAccepted")
  public Boolean getTermsAndConditionsAccepted() {
    return termsAndConditionsAccepted;
  }
  public void setTermsAndConditionsAccepted(Boolean termsAndConditionsAccepted) {
    this.termsAndConditionsAccepted = termsAndConditionsAccepted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModulePublishRequest learningModulePublishRequest = (LearningModulePublishRequest) o;

    return Objects.equals(this.termsAndConditionsAccepted, learningModulePublishRequest.termsAndConditionsAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termsAndConditionsAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModulePublishRequest {\n");
    
    sb.append("    termsAndConditionsAccepted: ").append(toIndentedString(termsAndConditionsAccepted)).append("\n");
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

