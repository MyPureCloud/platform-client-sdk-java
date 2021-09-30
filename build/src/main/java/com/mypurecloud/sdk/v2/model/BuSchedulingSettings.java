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
import com.mypurecloud.sdk.v2.model.SchedulerMessageTypeSeverity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuSchedulingSettings
 */

public class BuSchedulingSettings  implements Serializable {
  
  private List<SchedulerMessageTypeSeverity> messageSeverities = new ArrayList<SchedulerMessageTypeSeverity>();

  
  /**
   * Schedule generation message severity configuration
   **/
  public BuSchedulingSettings messageSeverities(List<SchedulerMessageTypeSeverity> messageSeverities) {
    this.messageSeverities = messageSeverities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule generation message severity configuration")
  @JsonProperty("messageSeverities")
  public List<SchedulerMessageTypeSeverity> getMessageSeverities() {
    return messageSeverities;
  }
  public void setMessageSeverities(List<SchedulerMessageTypeSeverity> messageSeverities) {
    this.messageSeverities = messageSeverities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuSchedulingSettings buSchedulingSettings = (BuSchedulingSettings) o;
    return Objects.equals(this.messageSeverities, buSchedulingSettings.messageSeverities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSeverities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuSchedulingSettings {\n");
    
    sb.append("    messageSeverities: ").append(toIndentedString(messageSeverities)).append("\n");
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

