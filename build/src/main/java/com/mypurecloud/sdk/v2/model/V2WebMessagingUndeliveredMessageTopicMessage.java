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
 * V2WebMessagingUndeliveredMessageTopicMessage
 */

public class V2WebMessagingUndeliveredMessageTopicMessage  implements Serializable {
  
  private String id = null;
  private Integer eventTimeMs = null;

  
  /**
   **/
  public V2WebMessagingUndeliveredMessageTopicMessage id(String id) {
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
  public V2WebMessagingUndeliveredMessageTopicMessage eventTimeMs(Integer eventTimeMs) {
    this.eventTimeMs = eventTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTimeMs")
  public Integer getEventTimeMs() {
    return eventTimeMs;
  }
  public void setEventTimeMs(Integer eventTimeMs) {
    this.eventTimeMs = eventTimeMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WebMessagingUndeliveredMessageTopicMessage v2WebMessagingUndeliveredMessageTopicMessage = (V2WebMessagingUndeliveredMessageTopicMessage) o;

    return Objects.equals(this.id, v2WebMessagingUndeliveredMessageTopicMessage.id) &&
            Objects.equals(this.eventTimeMs, v2WebMessagingUndeliveredMessageTopicMessage.eventTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WebMessagingUndeliveredMessageTopicMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventTimeMs: ").append(toIndentedString(eventTimeMs)).append("\n");
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

