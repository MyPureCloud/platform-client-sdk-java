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
import com.mypurecloud.sdk.v2.model.WfmBuScheduleRunTopicLocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuScheduleRunTopicBuScheduleReference
 */

public class WfmBuScheduleRunTopicBuScheduleReference  implements Serializable {
  
  private String id = null;
  private WfmBuScheduleRunTopicLocalDate weekDate = null;

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicBuScheduleReference weekDate(WfmBuScheduleRunTopicLocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public WfmBuScheduleRunTopicLocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(WfmBuScheduleRunTopicLocalDate weekDate) {
    this.weekDate = weekDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleRunTopicBuScheduleReference wfmBuScheduleRunTopicBuScheduleReference = (WfmBuScheduleRunTopicBuScheduleReference) o;
    return Objects.equals(this.id, wfmBuScheduleRunTopicBuScheduleReference.id) &&
        Objects.equals(this.weekDate, wfmBuScheduleRunTopicBuScheduleReference.weekDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleRunTopicBuScheduleReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
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

