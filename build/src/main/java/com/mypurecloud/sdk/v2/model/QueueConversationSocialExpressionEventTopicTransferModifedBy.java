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
 * Fields identifying the entity that updated the command.
 */
@ApiModel(description = "Fields identifying the entity that updated the command.")

public class QueueConversationSocialExpressionEventTopicTransferModifedBy  implements Serializable {
  
  private String id = null;
  private String selfUri = null;

  
  /**
   * The id of the user if the updater is an internal user.
   **/
  public QueueConversationSocialExpressionEventTopicTransferModifedBy id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the user if the updater is an internal user.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The URI for the user if the updater is an internal user.
   **/
  public QueueConversationSocialExpressionEventTopicTransferModifedBy selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI for the user if the updater is an internal user.")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicTransferModifedBy queueConversationSocialExpressionEventTopicTransferModifedBy = (QueueConversationSocialExpressionEventTopicTransferModifedBy) o;

    return Objects.equals(this.id, queueConversationSocialExpressionEventTopicTransferModifedBy.id) &&
            Objects.equals(this.selfUri, queueConversationSocialExpressionEventTopicTransferModifedBy.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicTransferModifedBy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

