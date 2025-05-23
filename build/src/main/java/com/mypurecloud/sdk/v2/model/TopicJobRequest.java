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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TopicJobRequest
 */

public class TopicJobRequest  implements Serializable {
  
  private List<String> topicIds = null;

  public TopicJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      topicIds = new ArrayList<String>();
    }
  }

  
  /**
   * The ids of the topics used for this job
   **/
  public TopicJobRequest topicIds(List<String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids of the topics used for this job")
  @JsonProperty("topicIds")
  public List<String> getTopicIds() {
    return topicIds;
  }
  public void setTopicIds(List<String> topicIds) {
    this.topicIds = topicIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicJobRequest topicJobRequest = (TopicJobRequest) o;

    return Objects.equals(this.topicIds, topicJobRequest.topicIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicJobRequest {\n");
    
    sb.append("    topicIds: ").append(toIndentedString(topicIds)).append("\n");
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

