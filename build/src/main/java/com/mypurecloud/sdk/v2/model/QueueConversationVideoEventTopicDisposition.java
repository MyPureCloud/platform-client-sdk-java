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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicDispositionAmdTimeout;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicDispositionSilentCallTimeout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Call resolution data for Dialer bulk make calls commands.
 */
@ApiModel(description = "Call resolution data for Dialer bulk make calls commands.")

public class QueueConversationVideoEventTopicDisposition  implements Serializable {
  
  private String name = null;
  private String analyzer = null;
  private QueueConversationVideoEventTopicDispositionAmdTimeout amdTimeout = null;
  private QueueConversationVideoEventTopicDispositionSilentCallTimeout silentCallTimeout = null;

  public QueueConversationVideoEventTopicDisposition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the disposition. Either a platform predefined value, or the name of the disposition in the disposition table..
   **/
  public QueueConversationVideoEventTopicDisposition name(String name) {
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
  public QueueConversationVideoEventTopicDisposition analyzer(String analyzer) {
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
  public QueueConversationVideoEventTopicDisposition amdTimeout(QueueConversationVideoEventTopicDispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("amdTimeout")
  public QueueConversationVideoEventTopicDispositionAmdTimeout getAmdTimeout() {
    return amdTimeout;
  }
  public void setAmdTimeout(QueueConversationVideoEventTopicDispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
  }


  /**
   **/
  public QueueConversationVideoEventTopicDisposition silentCallTimeout(QueueConversationVideoEventTopicDispositionSilentCallTimeout silentCallTimeout) {
    this.silentCallTimeout = silentCallTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("silentCallTimeout")
  public QueueConversationVideoEventTopicDispositionSilentCallTimeout getSilentCallTimeout() {
    return silentCallTimeout;
  }
  public void setSilentCallTimeout(QueueConversationVideoEventTopicDispositionSilentCallTimeout silentCallTimeout) {
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
    QueueConversationVideoEventTopicDisposition queueConversationVideoEventTopicDisposition = (QueueConversationVideoEventTopicDisposition) o;

    return Objects.equals(this.name, queueConversationVideoEventTopicDisposition.name) &&
            Objects.equals(this.analyzer, queueConversationVideoEventTopicDisposition.analyzer) &&
            Objects.equals(this.amdTimeout, queueConversationVideoEventTopicDisposition.amdTimeout) &&
            Objects.equals(this.silentCallTimeout, queueConversationVideoEventTopicDisposition.silentCallTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, analyzer, amdTimeout, silentCallTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicDisposition {\n");
    
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

