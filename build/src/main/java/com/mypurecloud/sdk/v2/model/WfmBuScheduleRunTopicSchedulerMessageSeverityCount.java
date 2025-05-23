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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuScheduleRunTopicSchedulerMessageSeverityCount
 */

public class WfmBuScheduleRunTopicSchedulerMessageSeverityCount  implements Serializable {
  

  private static class SeverityEnumDeserializer extends StdDeserializer<SeverityEnum> {
    public SeverityEnumDeserializer() {
      super(SeverityEnumDeserializer.class);
    }

    @Override
    public SeverityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SeverityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets severity
   */
 @JsonDeserialize(using = SeverityEnumDeserializer.class)
  public enum SeverityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IGNORE("Ignore"),
    INFORMATION("Information"),
    WARNING("Warning"),
    ERROR("Error");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SeverityEnum fromString(String key) {
      if (key == null) return null;

      for (SeverityEnum value : SeverityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SeverityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SeverityEnum severity = null;
  private Long count = null;

  public WfmBuScheduleRunTopicSchedulerMessageSeverityCount() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicSchedulerMessageSeverityCount severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  /**
   **/
  public WfmBuScheduleRunTopicSchedulerMessageSeverityCount count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleRunTopicSchedulerMessageSeverityCount wfmBuScheduleRunTopicSchedulerMessageSeverityCount = (WfmBuScheduleRunTopicSchedulerMessageSeverityCount) o;

    return Objects.equals(this.severity, wfmBuScheduleRunTopicSchedulerMessageSeverityCount.severity) &&
            Objects.equals(this.count, wfmBuScheduleRunTopicSchedulerMessageSeverityCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleRunTopicSchedulerMessageSeverityCount {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

