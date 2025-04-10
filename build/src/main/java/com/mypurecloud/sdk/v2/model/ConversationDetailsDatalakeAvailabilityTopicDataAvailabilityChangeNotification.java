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
import java.util.Date;

import java.io.Serializable;
/**
 * ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification
 */

public class ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification  implements Serializable {
  
  private Date dataAvailabilityDate = null;

  public ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Date and time before which data is guaranteed to be available in the datalake
   **/
  public ConversationDetailsDatalakeAvailabilityTopicDataAvailabilityChangeNotification dataAvailabilityDate(Date dataAvailabilityDate) {
    this.dataAvailabilityDate = dataAvailabilityDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date and time before which data is guaranteed to be available in the datalake")
  @JsonProperty("dataAvailabilityDate")
  public Date getDataAvailabilityDate() {
    return dataAvailabilityDate;
  }
  public void setDataAvailabilityDate(Date dataAvailabilityDate) {
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

