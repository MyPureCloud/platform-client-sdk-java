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

import java.io.Serializable;
/**
 * KnowledgeDocumentFeedbackUpdateRequest
 */

public class KnowledgeDocumentFeedbackUpdateRequest  implements Serializable {
  

  private static class RatingEnumDeserializer extends StdDeserializer<RatingEnum> {
    public RatingEnumDeserializer() {
      super(RatingEnumDeserializer.class);
    }

    @Override
    public RatingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RatingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Feedback rating.
   */
 @JsonDeserialize(using = RatingEnumDeserializer.class)
  public enum RatingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEGATIVE("Negative"),
    POSITIVE("Positive");

    private String value;

    RatingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RatingEnum fromString(String key) {
      if (key == null) return null;

      for (RatingEnum value : RatingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RatingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RatingEnum rating = null;

  private static class ReasonEnumDeserializer extends StdDeserializer<ReasonEnum> {
    public ReasonEnumDeserializer() {
      super(ReasonEnumDeserializer.class);
    }

    @Override
    public ReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Feedback reason
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DOCUMENTCONTENT("DocumentContent"),
    SEARCHRESULTS("SearchResults");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ReasonEnum value : ReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReasonEnum reason = null;
  private String comment = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Feedback state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    FINAL("Final");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  
  /**
   * Feedback rating.
   **/
  public KnowledgeDocumentFeedbackUpdateRequest rating(RatingEnum rating) {
    this.rating = rating;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Feedback rating.")
  @JsonProperty("rating")
  public RatingEnum getRating() {
    return rating;
  }
  public void setRating(RatingEnum rating) {
    this.rating = rating;
  }


  /**
   * Feedback reason
   **/
  public KnowledgeDocumentFeedbackUpdateRequest reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Feedback reason")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  /**
   * Feedback comment
   **/
  public KnowledgeDocumentFeedbackUpdateRequest comment(String comment) {
    this.comment = comment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Feedback comment")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }


  /**
   * Feedback state
   **/
  public KnowledgeDocumentFeedbackUpdateRequest state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Feedback state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentFeedbackUpdateRequest knowledgeDocumentFeedbackUpdateRequest = (KnowledgeDocumentFeedbackUpdateRequest) o;

    return Objects.equals(this.rating, knowledgeDocumentFeedbackUpdateRequest.rating) &&
            Objects.equals(this.reason, knowledgeDocumentFeedbackUpdateRequest.reason) &&
            Objects.equals(this.comment, knowledgeDocumentFeedbackUpdateRequest.comment) &&
            Objects.equals(this.state, knowledgeDocumentFeedbackUpdateRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, reason, comment, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentFeedbackUpdateRequest {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

