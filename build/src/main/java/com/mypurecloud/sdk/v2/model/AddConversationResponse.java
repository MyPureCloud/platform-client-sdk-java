package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CoachingAppointmentReference;
import com.mypurecloud.sdk.v2.model.ConversationReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AddConversationResponse
 */

public class AddConversationResponse  implements Serializable {
  
  private ConversationReference conversation = null;
  private CoachingAppointmentReference appointment = null;

  
  @ApiModelProperty(example = "null", value = "The conversation reference")
  @JsonProperty("conversation")
  public ConversationReference getConversation() {
    return conversation;
  }

  
  @ApiModelProperty(example = "null", value = "The appointment reference")
  @JsonProperty("appointment")
  public CoachingAppointmentReference getAppointment() {
    return appointment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddConversationResponse addConversationResponse = (AddConversationResponse) o;
    return Objects.equals(this.conversation, addConversationResponse.conversation) &&
        Objects.equals(this.appointment, addConversationResponse.appointment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, appointment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddConversationResponse {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
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

