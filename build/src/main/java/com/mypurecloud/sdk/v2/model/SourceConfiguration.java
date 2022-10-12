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
 * SourceConfiguration
 */

public class SourceConfiguration  implements Serializable {
  
  private String sourceId = null;
  private String interactionId = null;
  private String tagId = null;

  
  /**
   * Identifies the external platform that is the source of the conversation.
   **/
  public SourceConfiguration sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifies the external platform that is the source of the conversation.")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * The customer's unique external identifier associated with the conversation that comes from the external platform.
   **/
  public SourceConfiguration interactionId(String interactionId) {
    this.interactionId = interactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The customer's unique external identifier associated with the conversation that comes from the external platform.")
  @JsonProperty("interactionId")
  public String getInteractionId() {
    return interactionId;
  }
  public void setInteractionId(String interactionId) {
    this.interactionId = interactionId;
  }


  /**
   * The customer's external identifier or tag associated with the conversation. If set, it will be used to tag the conversation.
   **/
  public SourceConfiguration tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer's external identifier or tag associated with the conversation. If set, it will be used to tag the conversation.")
  @JsonProperty("tagId")
  public String getTagId() {
    return tagId;
  }
  public void setTagId(String tagId) {
    this.tagId = tagId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceConfiguration sourceConfiguration = (SourceConfiguration) o;

    return Objects.equals(this.sourceId, sourceConfiguration.sourceId) &&
            Objects.equals(this.interactionId, sourceConfiguration.interactionId) &&
            Objects.equals(this.tagId, sourceConfiguration.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, interactionId, tagId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceConfiguration {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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

