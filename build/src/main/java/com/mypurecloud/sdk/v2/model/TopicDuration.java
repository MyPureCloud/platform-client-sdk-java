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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TopicDuration
 */

public class TopicDuration  implements Serializable {
  
  private Long totalMilliseconds = null;

  
  @ApiModelProperty(example = "null", value = "The total duration of the topic phrase within the conversation")
  @JsonProperty("totalMilliseconds")
  public Long getTotalMilliseconds() {
    return totalMilliseconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicDuration topicDuration = (TopicDuration) o;
    return Objects.equals(this.totalMilliseconds, topicDuration.totalMilliseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalMilliseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicDuration {\n");
    
    sb.append("    totalMilliseconds: ").append(toIndentedString(totalMilliseconds)).append("\n");
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

