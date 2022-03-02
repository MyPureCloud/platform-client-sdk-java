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
import com.mypurecloud.sdk.v2.model.TopicDuration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TranscriptTopic
 */

public class TranscriptTopic  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String topicPhrase = null;
  private String transcriptPhrase = null;
  private Integer confidence = null;
  private Long startTimeMilliseconds = null;
  private TopicDuration duration = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The name of the object.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The phrase which detected the topic. ")
  @JsonProperty("topicPhrase")
  public String getTopicPhrase() {
    return topicPhrase;
  }

  
  @ApiModelProperty(example = "null", value = "The transcript phrase which detected the topic.")
  @JsonProperty("transcriptPhrase")
  public String getTranscriptPhrase() {
    return transcriptPhrase;
  }

  
  @ApiModelProperty(example = "null", value = "The detection confidence of the topic.")
  @JsonProperty("confidence")
  public Integer getConfidence() {
    return confidence;
  }

  
  @ApiModelProperty(example = "null", value = "The start time of the topic phrase.")
  @JsonProperty("startTimeMilliseconds")
  public Long getStartTimeMilliseconds() {
    return startTimeMilliseconds;
  }

  
  /**
   **/
  public TranscriptTopic duration(TopicDuration duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("duration")
  public TopicDuration getDuration() {
    return duration;
  }
  public void setDuration(TopicDuration duration) {
    this.duration = duration;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptTopic transcriptTopic = (TranscriptTopic) o;
    return Objects.equals(this.id, transcriptTopic.id) &&
        Objects.equals(this.name, transcriptTopic.name) &&
        Objects.equals(this.topicPhrase, transcriptTopic.topicPhrase) &&
        Objects.equals(this.transcriptPhrase, transcriptTopic.transcriptPhrase) &&
        Objects.equals(this.confidence, transcriptTopic.confidence) &&
        Objects.equals(this.startTimeMilliseconds, transcriptTopic.startTimeMilliseconds) &&
        Objects.equals(this.duration, transcriptTopic.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, topicPhrase, transcriptPhrase, confidence, startTimeMilliseconds, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptTopic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    topicPhrase: ").append(toIndentedString(topicPhrase)).append("\n");
    sb.append("    transcriptPhrase: ").append(toIndentedString(transcriptPhrase)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    startTimeMilliseconds: ").append(toIndentedString(startTimeMilliseconds)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

