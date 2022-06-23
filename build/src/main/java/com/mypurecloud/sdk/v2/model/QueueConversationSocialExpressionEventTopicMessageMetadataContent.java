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

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicMessageMetadataContent
 */

public class QueueConversationSocialExpressionEventTopicMessageMetadataContent  implements Serializable {
  
  private String contentType = null;
  private String subType = null;

  
  /**
   * Type of this content element.
   **/
  public QueueConversationSocialExpressionEventTopicMessageMetadataContent contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of this content element.")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  /**
   * Content subtype, if any
   **/
  public QueueConversationSocialExpressionEventTopicMessageMetadataContent subType(String subType) {
    this.subType = subType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content subtype, if any")
  @JsonProperty("subType")
  public String getSubType() {
    return subType;
  }
  public void setSubType(String subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicMessageMetadataContent queueConversationSocialExpressionEventTopicMessageMetadataContent = (QueueConversationSocialExpressionEventTopicMessageMetadataContent) o;

    return Objects.equals(this.contentType, queueConversationSocialExpressionEventTopicMessageMetadataContent.contentType) &&
            Objects.equals(this.subType, queueConversationSocialExpressionEventTopicMessageMetadataContent.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicMessageMetadataContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

