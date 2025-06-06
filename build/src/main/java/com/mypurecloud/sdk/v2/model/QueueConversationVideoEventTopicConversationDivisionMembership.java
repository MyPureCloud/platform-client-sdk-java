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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicDivisionEntityRef;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicDomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicConversationDivisionMembership
 */

public class QueueConversationVideoEventTopicConversationDivisionMembership  implements Serializable {
  
  private QueueConversationVideoEventTopicDomainEntityRef division = null;
  private List<QueueConversationVideoEventTopicDivisionEntityRef> entities = null;

  public QueueConversationVideoEventTopicConversationDivisionMembership() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<QueueConversationVideoEventTopicDivisionEntityRef>();
    }
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicConversationDivisionMembership division(QueueConversationVideoEventTopicDomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public QueueConversationVideoEventTopicDomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(QueueConversationVideoEventTopicDomainEntityRef division) {
    this.division = division;
  }


  /**
   **/
  public QueueConversationVideoEventTopicConversationDivisionMembership entities(List<QueueConversationVideoEventTopicDivisionEntityRef> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<QueueConversationVideoEventTopicDivisionEntityRef> getEntities() {
    return entities;
  }
  public void setEntities(List<QueueConversationVideoEventTopicDivisionEntityRef> entities) {
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
    QueueConversationVideoEventTopicConversationDivisionMembership queueConversationVideoEventTopicConversationDivisionMembership = (QueueConversationVideoEventTopicConversationDivisionMembership) o;

    return Objects.equals(this.division, queueConversationVideoEventTopicConversationDivisionMembership.division) &&
            Objects.equals(this.entities, queueConversationVideoEventTopicConversationDivisionMembership.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicConversationDivisionMembership {\n");
    
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

