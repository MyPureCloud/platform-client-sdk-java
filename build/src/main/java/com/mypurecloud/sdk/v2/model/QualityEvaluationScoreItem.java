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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QualityEvaluationScoreItem
 */

public class QualityEvaluationScoreItem  implements Serializable {
  
  private String evaluationId = null;
  private String conversationId = null;
  private Date conversationDate = null;
  private Date conversationEndDate = null;
  private String formName = null;
  private Integer points = null;
  private Double evaluationScore = null;
  private Integer maxPoints = null;

  private static class MediaTypesEnumDeserializer extends StdDeserializer<MediaTypesEnum> {
    public MediaTypesEnumDeserializer() {
      super(MediaTypesEnumDeserializer.class);
    }

    @Override
    public MediaTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaTypes
   */
 @JsonDeserialize(using = MediaTypesEnumDeserializer.class)
  public enum MediaTypesEnum {
    CALLBACK("callback"),
    CHAT("chat"),
    COBROWSE("cobrowse"),
    EMAIL("email"),
    MESSAGE("message"),
    SCREENSHARE("screenshare"),
    UNKNOWN("unknown"),
    VIDEO("video"),
    VOICE("voice");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();

  
  @ApiModelProperty(example = "null", value = "The id of evaluation")
  @JsonProperty("evaluationId")
  public String getEvaluationId() {
    return evaluationId;
  }


  @ApiModelProperty(example = "null", value = "The id of conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }


  @ApiModelProperty(example = "null", value = "The date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationDate")
  public Date getConversationDate() {
    return conversationDate;
  }


  @ApiModelProperty(example = "null", value = "The end date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationEndDate")
  public Date getConversationEndDate() {
    return conversationEndDate;
  }


  @ApiModelProperty(example = "null", value = "The name of form")
  @JsonProperty("formName")
  public String getFormName() {
    return formName;
  }


  @ApiModelProperty(example = "null", value = "Gamification points earned for this metric")
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }


  @ApiModelProperty(example = "null", value = "The quality score of evaluation as a percentage")
  @JsonProperty("evaluationScore")
  public Double getEvaluationScore() {
    return evaluationScore;
  }


  @ApiModelProperty(example = "null", value = "The maximum Gamification points a user may earn for this metric")
  @JsonProperty("maxPoints")
  public Integer getMaxPoints() {
    return maxPoints;
  }


  /**
   * A list of media types for the metric
   **/
  public QualityEvaluationScoreItem mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of media types for the metric")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
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
    QualityEvaluationScoreItem qualityEvaluationScoreItem = (QualityEvaluationScoreItem) o;

    return Objects.equals(this.evaluationId, qualityEvaluationScoreItem.evaluationId) &&
            Objects.equals(this.conversationId, qualityEvaluationScoreItem.conversationId) &&
            Objects.equals(this.conversationDate, qualityEvaluationScoreItem.conversationDate) &&
            Objects.equals(this.conversationEndDate, qualityEvaluationScoreItem.conversationEndDate) &&
            Objects.equals(this.formName, qualityEvaluationScoreItem.formName) &&
            Objects.equals(this.points, qualityEvaluationScoreItem.points) &&
            Objects.equals(this.evaluationScore, qualityEvaluationScoreItem.evaluationScore) &&
            Objects.equals(this.maxPoints, qualityEvaluationScoreItem.maxPoints) &&
            Objects.equals(this.mediaTypes, qualityEvaluationScoreItem.mediaTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationId, conversationId, conversationDate, conversationEndDate, formName, points, evaluationScore, maxPoints, mediaTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityEvaluationScoreItem {\n");
    
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationDate: ").append(toIndentedString(conversationDate)).append("\n");
    sb.append("    conversationEndDate: ").append(toIndentedString(conversationEndDate)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    evaluationScore: ").append(toIndentedString(evaluationScore)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
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

