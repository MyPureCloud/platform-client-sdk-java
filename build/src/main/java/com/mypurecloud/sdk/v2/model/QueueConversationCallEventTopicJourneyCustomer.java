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
 * A subset of the Journey System&#39;s customer data at a point-in-time (for external linkage and internal usage/context)
 */
@ApiModel(description = "A subset of the Journey System's customer data at a point-in-time (for external linkage and internal usage/context)")

public class QueueConversationCallEventTopicJourneyCustomer  implements Serializable {
  
  private String id = null;
  private String idType = null;

  public QueueConversationCallEventTopicJourneyCustomer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * An ID of a customer within the Journey System at a point-in-time.  Note that a customer entity can have multiple customerIds based on the stitching process.  Depending on the context within the PureCloud conversation, this may or may not be mutable.
   **/
  public QueueConversationCallEventTopicJourneyCustomer id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ID of a customer within the Journey System at a point-in-time.  Note that a customer entity can have multiple customerIds based on the stitching process.  Depending on the context within the PureCloud conversation, this may or may not be mutable.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The type of the customerId within the Journey System (e.g. cookie).
   **/
  public QueueConversationCallEventTopicJourneyCustomer idType(String idType) {
    this.idType = idType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the customerId within the Journey System (e.g. cookie).")
  @JsonProperty("idType")
  public String getIdType() {
    return idType;
  }
  public void setIdType(String idType) {
    this.idType = idType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallEventTopicJourneyCustomer queueConversationCallEventTopicJourneyCustomer = (QueueConversationCallEventTopicJourneyCustomer) o;

    return Objects.equals(this.id, queueConversationCallEventTopicJourneyCustomer.id) &&
            Objects.equals(this.idType, queueConversationCallEventTopicJourneyCustomer.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicJourneyCustomer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

