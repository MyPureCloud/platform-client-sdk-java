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
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicDivisionEntityRef;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicDomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationMessageEventTopicConversationDivisionMembership
 */

public class QueueConversationMessageEventTopicConversationDivisionMembership  implements Serializable {
  
  private QueueConversationMessageEventTopicDomainEntityRef division = null;
  private List<QueueConversationMessageEventTopicDivisionEntityRef> entities = new ArrayList<QueueConversationMessageEventTopicDivisionEntityRef>();

  
  /**
   **/
  public QueueConversationMessageEventTopicConversationDivisionMembership division(QueueConversationMessageEventTopicDomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public QueueConversationMessageEventTopicDomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(QueueConversationMessageEventTopicDomainEntityRef division) {
    this.division = division;
  }


  /**
   **/
  public QueueConversationMessageEventTopicConversationDivisionMembership entities(List<QueueConversationMessageEventTopicDivisionEntityRef> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<QueueConversationMessageEventTopicDivisionEntityRef> getEntities() {
    return entities;
  }
  public void setEntities(List<QueueConversationMessageEventTopicDivisionEntityRef> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationMessageEventTopicConversationDivisionMembership queueConversationMessageEventTopicConversationDivisionMembership = (QueueConversationMessageEventTopicConversationDivisionMembership) o;

    return Objects.equals(this.division, queueConversationMessageEventTopicConversationDivisionMembership.division) &&
            Objects.equals(this.entities, queueConversationMessageEventTopicConversationDivisionMembership.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicConversationDivisionMembership {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

