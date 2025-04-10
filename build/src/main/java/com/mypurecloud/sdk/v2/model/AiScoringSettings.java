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
import com.mypurecloud.sdk.v2.model.QuestionGroupSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AiScoringSettings
 */

public class AiScoringSettings  implements Serializable {
  
  private String id = null;
  private List<QuestionGroupSettings> questionGroupSettings = null;
  private String selfUri = null;

  public AiScoringSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      questionGroupSettings = new ArrayList<QuestionGroupSettings>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public AiScoringSettings questionGroupSettings(List<QuestionGroupSettings> questionGroupSettings) {
    this.questionGroupSettings = questionGroupSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionGroupSettings")
  public List<QuestionGroupSettings> getQuestionGroupSettings() {
    return questionGroupSettings;
  }
  public void setQuestionGroupSettings(List<QuestionGroupSettings> questionGroupSettings) {
    this.questionGroupSettings = questionGroupSettings;
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
    AiScoringSettings aiScoringSettings = (AiScoringSettings) o;

    return Objects.equals(this.id, aiScoringSettings.id) &&
            Objects.equals(this.questionGroupSettings, aiScoringSettings.questionGroupSettings) &&
            Objects.equals(this.selfUri, aiScoringSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, questionGroupSettings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiScoringSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    questionGroupSettings: ").append(toIndentedString(questionGroupSettings)).append("\n");
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

