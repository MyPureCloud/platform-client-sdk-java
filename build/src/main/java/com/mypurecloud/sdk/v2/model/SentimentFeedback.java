package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SentimentFeedback
 */

public class SentimentFeedback  implements Serializable {
  
  private String id = null;
  private String phrase = null;
  private String dialect = null;

  private static class FeedbackValueEnumDeserializer extends StdDeserializer<FeedbackValueEnum> {
    public FeedbackValueEnumDeserializer() {
      super(FeedbackValueEnumDeserializer.class);
    }

    @Override
    public FeedbackValueEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FeedbackValueEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The sentiment feedback value for the given phrase
   */
 @JsonDeserialize(using = FeedbackValueEnumDeserializer.class)
  public enum FeedbackValueEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEUTRAL("Neutral"),
    POSITIVE("Positive"),
    NEGATIVE("Negative");

    private String value;

    FeedbackValueEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FeedbackValueEnum fromString(String key) {
      if (key == null) return null;

      for (FeedbackValueEnum value : FeedbackValueEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FeedbackValueEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FeedbackValueEnum feedbackValue = null;
  private Date dateCreated = null;
  private AddressableEntityRef createdBy = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The phrase for which sentiment feedback is provided
   **/
  public SentimentFeedback phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phrase for which sentiment feedback is provided")
  @JsonProperty("phrase")
  public String getPhrase() {
    return phrase;
  }
  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  
  /**
   * The dialect for the given phrase, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
   **/
  public SentimentFeedback dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "en-US", required = true, value = "The dialect for the given phrase, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }

  
  /**
   * The sentiment feedback value for the given phrase
   **/
  public SentimentFeedback feedbackValue(FeedbackValueEnum feedbackValue) {
    this.feedbackValue = feedbackValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sentiment feedback value for the given phrase")
  @JsonProperty("feedbackValue")
  public FeedbackValueEnum getFeedbackValue() {
    return feedbackValue;
  }
  public void setFeedbackValue(FeedbackValueEnum feedbackValue) {
    this.feedbackValue = feedbackValue;
  }

  
  @ApiModelProperty(example = "null", value = "The Timestamp when sentiment feedback created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The Id of user who created the sentiment feedback")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentimentFeedback sentimentFeedback = (SentimentFeedback) o;
    return Objects.equals(this.id, sentimentFeedback.id) &&
        Objects.equals(this.phrase, sentimentFeedback.phrase) &&
        Objects.equals(this.dialect, sentimentFeedback.dialect) &&
        Objects.equals(this.feedbackValue, sentimentFeedback.feedbackValue) &&
        Objects.equals(this.dateCreated, sentimentFeedback.dateCreated) &&
        Objects.equals(this.createdBy, sentimentFeedback.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, phrase, dialect, feedbackValue, dateCreated, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentFeedback {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    feedbackValue: ").append(toIndentedString(feedbackValue)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

