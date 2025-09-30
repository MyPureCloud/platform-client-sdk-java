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
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicDispositionAmdTimeout;
import com.mypurecloud.sdk.v2.model.QueueConversationCallEventTopicDispositionSilentCallTimeout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicDisposition
 */

public class QueueConversationCallEventTopicDisposition  implements Serializable {
  
  private String name = null;
  private String analyzer = null;
  private QueueConversationCallEventTopicDispositionAmdTimeout amdTimeout = null;
  private QueueConversationCallEventTopicDispositionSilentCallTimeout silentCallTimeout = null;

  public QueueConversationCallEventTopicDisposition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the disposition. Either a platform predefined value, or the name of the disposition in the disposition table..
   **/
  public QueueConversationCallEventTopicDisposition name(String name) {
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
  public QueueConversationCallEventTopicDisposition analyzer(String analyzer) {
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
  public QueueConversationCallEventTopicDisposition amdTimeout(QueueConversationCallEventTopicDispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("amdTimeout")
  public QueueConversationCallEventTopicDispositionAmdTimeout getAmdTimeout() {
    return amdTimeout;
  }
  public void setAmdTimeout(QueueConversationCallEventTopicDispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
  }


  /**
   **/
  public QueueConversationCallEventTopicDisposition silentCallTimeout(QueueConversationCallEventTopicDispositionSilentCallTimeout silentCallTimeout) {
    this.silentCallTimeout = silentCallTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("silentCallTimeout")
  public QueueConversationCallEventTopicDispositionSilentCallTimeout getSilentCallTimeout() {
    return silentCallTimeout;
  }
  public void setSilentCallTimeout(QueueConversationCallEventTopicDispositionSilentCallTimeout silentCallTimeout) {
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
    QueueConversationCallEventTopicDisposition queueConversationCallEventTopicDisposition = (QueueConversationCallEventTopicDisposition) o;

    return Objects.equals(this.name, queueConversationCallEventTopicDisposition.name) &&
            Objects.equals(this.analyzer, queueConversationCallEventTopicDisposition.analyzer) &&
            Objects.equals(this.amdTimeout, queueConversationCallEventTopicDisposition.amdTimeout) &&
            Objects.equals(this.silentCallTimeout, queueConversationCallEventTopicDisposition.silentCallTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, analyzer, amdTimeout, silentCallTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicDisposition {\n");
    
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

