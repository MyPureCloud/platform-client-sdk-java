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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GamificationScorecardChangeTopicEvaluationDetail
 */

public class GamificationScorecardChangeTopicEvaluationDetail  implements Serializable {
  
  private String evaluationId = null;
  private String conversationId = null;
  private String conversationDate = null;
  private String formName = null;
  private Integer points = null;
  private Integer maxPoints = null;
  private Integer evaluationScore = null;
  private BigDecimal evaluationScoreDouble = null;
  private List<String> mediaTypes = new ArrayList<String>();

  
  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationId")
  public String getEvaluationId() {
    return evaluationId;
  }
  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail conversationDate(String conversationDate) {
    this.conversationDate = conversationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationDate")
  public String getConversationDate() {
    return conversationDate;
  }
  public void setConversationDate(String conversationDate) {
    this.conversationDate = conversationDate;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail formName(String formName) {
    this.formName = formName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("formName")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail points(Integer points) {
    this.points = points;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }
  public void setPoints(Integer points) {
    this.points = points;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail maxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxPoints")
  public Integer getMaxPoints() {
    return maxPoints;
  }
  public void setMaxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail evaluationScore(Integer evaluationScore) {
    this.evaluationScore = evaluationScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationScore")
  public Integer getEvaluationScore() {
    return evaluationScore;
  }
  public void setEvaluationScore(Integer evaluationScore) {
    this.evaluationScore = evaluationScore;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail evaluationScoreDouble(BigDecimal evaluationScoreDouble) {
    this.evaluationScoreDouble = evaluationScoreDouble;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationScoreDouble")
  public BigDecimal getEvaluationScoreDouble() {
    return evaluationScoreDouble;
  }
  public void setEvaluationScoreDouble(BigDecimal evaluationScoreDouble) {
    this.evaluationScoreDouble = evaluationScoreDouble;
  }


  /**
   **/
  public GamificationScorecardChangeTopicEvaluationDetail mediaTypes(List<String> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaTypes")
  public List<String> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<String> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamificationScorecardChangeTopicEvaluationDetail gamificationScorecardChangeTopicEvaluationDetail = (GamificationScorecardChangeTopicEvaluationDetail) o;

    return Objects.equals(this.evaluationId, gamificationScorecardChangeTopicEvaluationDetail.evaluationId) &&
            Objects.equals(this.conversationId, gamificationScorecardChangeTopicEvaluationDetail.conversationId) &&
            Objects.equals(this.conversationDate, gamificationScorecardChangeTopicEvaluationDetail.conversationDate) &&
            Objects.equals(this.formName, gamificationScorecardChangeTopicEvaluationDetail.formName) &&
            Objects.equals(this.points, gamificationScorecardChangeTopicEvaluationDetail.points) &&
            Objects.equals(this.maxPoints, gamificationScorecardChangeTopicEvaluationDetail.maxPoints) &&
            Objects.equals(this.evaluationScore, gamificationScorecardChangeTopicEvaluationDetail.evaluationScore) &&
            Objects.equals(this.evaluationScoreDouble, gamificationScorecardChangeTopicEvaluationDetail.evaluationScoreDouble) &&
            Objects.equals(this.mediaTypes, gamificationScorecardChangeTopicEvaluationDetail.mediaTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationId, conversationId, conversationDate, formName, points, maxPoints, evaluationScore, evaluationScoreDouble, mediaTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamificationScorecardChangeTopicEvaluationDetail {\n");
    
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationDate: ").append(toIndentedString(conversationDate)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    evaluationScore: ").append(toIndentedString(evaluationScore)).append("\n");
    sb.append("    evaluationScoreDouble: ").append(toIndentedString(evaluationScoreDouble)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
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

