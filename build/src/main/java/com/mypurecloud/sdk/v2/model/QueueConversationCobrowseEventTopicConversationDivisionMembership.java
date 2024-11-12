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
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicDivisionEntityRef;
import com.mypurecloud.sdk.v2.model.QueueConversationCobrowseEventTopicDomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationCobrowseEventTopicConversationDivisionMembership
 */

public class QueueConversationCobrowseEventTopicConversationDivisionMembership  implements Serializable {
  
  private QueueConversationCobrowseEventTopicDomainEntityRef division = null;
  private List<QueueConversationCobrowseEventTopicDivisionEntityRef> entities = new ArrayList<QueueConversationCobrowseEventTopicDivisionEntityRef>();

  
  /**
   **/
  public QueueConversationCobrowseEventTopicConversationDivisionMembership division(QueueConversationCobrowseEventTopicDomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public QueueConversationCobrowseEventTopicDomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(QueueConversationCobrowseEventTopicDomainEntityRef division) {
    this.division = division;
  }


  /**
   **/
  public QueueConversationCobrowseEventTopicConversationDivisionMembership entities(List<QueueConversationCobrowseEventTopicDivisionEntityRef> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<QueueConversationCobrowseEventTopicDivisionEntityRef> getEntities() {
    return entities;
  }
  public void setEntities(List<QueueConversationCobrowseEventTopicDivisionEntityRef> entities) {
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
    QueueConversationCobrowseEventTopicConversationDivisionMembership queueConversationCobrowseEventTopicConversationDivisionMembership = (QueueConversationCobrowseEventTopicConversationDivisionMembership) o;

    return Objects.equals(this.division, queueConversationCobrowseEventTopicConversationDivisionMembership.division) &&
            Objects.equals(this.entities, queueConversationCobrowseEventTopicConversationDivisionMembership.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCobrowseEventTopicConversationDivisionMembership {\n");
    
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

