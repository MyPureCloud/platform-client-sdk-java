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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConsultTransferResponse
 */

public class ConsultTransferResponse  implements Serializable {
  
  private String destinationParticipantId = null;

  
  /**
   * Participant ID to whom the call is being transferred.
   **/
  public ConsultTransferResponse destinationParticipantId(String destinationParticipantId) {
    this.destinationParticipantId = destinationParticipantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Participant ID to whom the call is being transferred.")
  @JsonProperty("destinationParticipantId")
  public String getDestinationParticipantId() {
    return destinationParticipantId;
  }
  public void setDestinationParticipantId(String destinationParticipantId) {
    this.destinationParticipantId = destinationParticipantId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultTransferResponse consultTransferResponse = (ConsultTransferResponse) o;
    return Objects.equals(this.destinationParticipantId, consultTransferResponse.destinationParticipantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationParticipantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultTransferResponse {\n");
    
    sb.append("    destinationParticipantId: ").append(toIndentedString(destinationParticipantId)).append("\n");
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

