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
import java.util.Date;

import java.io.Serializable;
/**
 * ConversationSocialExpressionEventTopicDivisionEntityRef
 */

public class ConversationSocialExpressionEventTopicDivisionEntityRef  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private Date dateDivisionUpdated = null;

  
  /**
   **/
  public ConversationSocialExpressionEventTopicDivisionEntityRef id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ConversationSocialExpressionEventTopicDivisionEntityRef selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   * The time the entity division was last updated.
   **/
  public ConversationSocialExpressionEventTopicDivisionEntityRef dateDivisionUpdated(Date dateDivisionUpdated) {
    this.dateDivisionUpdated = dateDivisionUpdated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the entity division was last updated.")
  @JsonProperty("dateDivisionUpdated")
  public Date getDateDivisionUpdated() {
    return dateDivisionUpdated;
  }
  public void setDateDivisionUpdated(Date dateDivisionUpdated) {
    this.dateDivisionUpdated = dateDivisionUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSocialExpressionEventTopicDivisionEntityRef conversationSocialExpressionEventTopicDivisionEntityRef = (ConversationSocialExpressionEventTopicDivisionEntityRef) o;

    return Objects.equals(this.id, conversationSocialExpressionEventTopicDivisionEntityRef.id) &&
            Objects.equals(this.selfUri, conversationSocialExpressionEventTopicDivisionEntityRef.selfUri) &&
            Objects.equals(this.dateDivisionUpdated, conversationSocialExpressionEventTopicDivisionEntityRef.dateDivisionUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, dateDivisionUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSocialExpressionEventTopicDivisionEntityRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    dateDivisionUpdated: ").append(toIndentedString(dateDivisionUpdated)).append("\n");
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

