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
import com.mypurecloud.sdk.v2.model.ConversationDetailsDatalakeAvailabilityTopicDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification
 */

public class ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification  implements Serializable {
  
  private ConversationDetailsDatalakeAvailabilityTopicDateTime dataAvailabilityDate = null;

  
  /**
   **/
  public ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification dataAvailabilityDate(ConversationDetailsDatalakeAvailabilityTopicDateTime dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAvailabilityDate")
  public ConversationDetailsDatalakeAvailabilityTopicDateTime getDataAvailabilityDate() {
    return dataAvailabilityDate;
  }
  public void setDataAvailabilityDate(ConversationDetailsDatalakeAvailabilityTopicDateTime dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification conversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification = (ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification) o;
    return Objects.equals(this.dataAvailabilityDate, conversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification.dataAvailabilityDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAvailabilityDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification {\n");
    
    sb.append("    dataAvailabilityDate: ").append(toIndentedString(dataAvailabilityDate)).append("\n");
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

