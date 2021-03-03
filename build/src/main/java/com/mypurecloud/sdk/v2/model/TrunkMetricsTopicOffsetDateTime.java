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
import com.mypurecloud.sdk.v2.model.TrunkMetricsTopicLocalDateTime;
import com.mypurecloud.sdk.v2.model.TrunkMetricsTopicZoneOffset;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrunkMetricsTopicOffsetDateTime
 */

public class TrunkMetricsTopicOffsetDateTime  implements Serializable {
  
  private TrunkMetricsTopicLocalDateTime dateTime = null;
  private TrunkMetricsTopicZoneOffset offset = null;

  
  /**
   **/
  public TrunkMetricsTopicOffsetDateTime dateTime(TrunkMetricsTopicLocalDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateTime")
  public TrunkMetricsTopicLocalDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(TrunkMetricsTopicLocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  
  /**
   **/
  public TrunkMetricsTopicOffsetDateTime offset(TrunkMetricsTopicZoneOffset offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offset")
  public TrunkMetricsTopicZoneOffset getOffset() {
    return offset;
  }
  public void setOffset(TrunkMetricsTopicZoneOffset offset) {
    this.offset = offset;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkMetricsTopicOffsetDateTime trunkMetricsTopicOffsetDateTime = (TrunkMetricsTopicOffsetDateTime) o;
    return Objects.equals(this.dateTime, trunkMetricsTopicOffsetDateTime.dateTime) &&
        Objects.equals(this.offset, trunkMetricsTopicOffsetDateTime.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsTopicOffsetDateTime {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

