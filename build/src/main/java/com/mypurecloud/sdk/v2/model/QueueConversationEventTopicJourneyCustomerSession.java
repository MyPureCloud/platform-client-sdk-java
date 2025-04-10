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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A subset of the Journey System&#39;s tracked customer session data at a point-in-time (for external linkage and internal usage/context)
 */
@ApiModel(description = "A subset of the Journey System's tracked customer session data at a point-in-time (for external linkage and internal usage/context)")

public class QueueConversationEventTopicJourneyCustomerSession  implements Serializable {
  
  private String id = null;
  private String type = null;

  public QueueConversationEventTopicJourneyCustomerSession() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * An ID of a Customer/User's session within the Journey System at a point-in-time
   **/
  public QueueConversationEventTopicJourneyCustomerSession id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ID of a Customer/User's session within the Journey System at a point-in-time")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The type of the Customer/User's session within the Journey System (e.g. web, app)
   **/
  public QueueConversationEventTopicJourneyCustomerSession type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the Customer/User's session within the Journey System (e.g. web, app)")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicJourneyCustomerSession queueConversationEventTopicJourneyCustomerSession = (QueueConversationEventTopicJourneyCustomerSession) o;

    return Objects.equals(this.id, queueConversationEventTopicJourneyCustomerSession.id) &&
            Objects.equals(this.type, queueConversationEventTopicJourneyCustomerSession.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicJourneyCustomerSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

