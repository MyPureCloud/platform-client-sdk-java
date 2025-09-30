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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicDispositionAmdTimeout;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicDispositionSilentCallTimeout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Call resolution data for Dialer bulk make calls commands.
 */
@ApiModel(description = "Call resolution data for Dialer bulk make calls commands.")

public class QueueConversationEventTopicDisposition  implements Serializable {
  
  private String name = null;
  private String analyzer = null;
  private QueueConversationEventTopicDispositionAmdTimeout amdTimeout = null;
  private QueueConversationEventTopicDispositionSilentCallTimeout silentCallTimeout = null;

  public QueueConversationEventTopicDisposition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the disposition. Either a platform predefined value, or the name of the disposition in the disposition table..
   **/
  public QueueConversationEventTopicDisposition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the disposition. Either a platform predefined value, or the name of the disposition in the disposition table..")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The final media analyzer result that triggered the disposition result, if any.
   **/
  public QueueConversationEventTopicDisposition analyzer(String analyzer) {
    this.analyzer = analyzer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The final media analyzer result that triggered the disposition result, if any.")
  @JsonProperty("analyzer")
  public String getAnalyzer() {
    return analyzer;
  }
  public void setAnalyzer(String analyzer) {
    this.analyzer = analyzer;
  }


  /**
   **/
  public QueueConversationEventTopicDisposition amdTimeout(QueueConversationEventTopicDispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("amdTimeout")
  public QueueConversationEventTopicDispositionAmdTimeout getAmdTimeout() {
    return amdTimeout;
  }
  public void setAmdTimeout(QueueConversationEventTopicDispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
  }


  /**
   **/
  public QueueConversationEventTopicDisposition silentCallTimeout(QueueConversationEventTopicDispositionSilentCallTimeout silentCallTimeout) {
    this.silentCallTimeout = silentCallTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("silentCallTimeout")
  public QueueConversationEventTopicDispositionSilentCallTimeout getSilentCallTimeout() {
    return silentCallTimeout;
  }
  public void setSilentCallTimeout(QueueConversationEventTopicDispositionSilentCallTimeout silentCallTimeout) {
    this.silentCallTimeout = silentCallTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicDisposition queueConversationEventTopicDisposition = (QueueConversationEventTopicDisposition) o;

    return Objects.equals(this.name, queueConversationEventTopicDisposition.name) &&
            Objects.equals(this.analyzer, queueConversationEventTopicDisposition.analyzer) &&
            Objects.equals(this.amdTimeout, queueConversationEventTopicDisposition.amdTimeout) &&
            Objects.equals(this.silentCallTimeout, queueConversationEventTopicDisposition.silentCallTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, analyzer, amdTimeout, silentCallTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicDisposition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    analyzer: ").append(toIndentedString(analyzer)).append("\n");
    sb.append("    amdTimeout: ").append(toIndentedString(amdTimeout)).append("\n");
    sb.append("    silentCallTimeout: ").append(toIndentedString(silentCallTimeout)).append("\n");
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

