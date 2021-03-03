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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsUserPresenceRecord
 */

public class AnalyticsUserPresenceRecord  implements Serializable {
  
  private Date startTime = null;
  private Date endTime = null;

  private static class SystemPresenceEnumDeserializer extends StdDeserializer<SystemPresenceEnum> {
    public SystemPresenceEnumDeserializer() {
      super(SystemPresenceEnumDeserializer.class);
    }

    @Override
    public SystemPresenceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemPresenceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user's system presence
   */
 @JsonDeserialize(using = SystemPresenceEnumDeserializer.class)
  public enum SystemPresenceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVAILABLE("AVAILABLE"),
    AWAY("AWAY"),
    BUSY("BUSY"),
    OFFLINE("OFFLINE"),
    IDLE("IDLE"),
    ON_QUEUE("ON_QUEUE"),
    MEAL("MEAL"),
    TRAINING("TRAINING"),
    MEETING("MEETING"),
    BREAK("BREAK");

    private String value;

    SystemPresenceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemPresenceEnum fromString(String key) {
      if (key == null) return null;

      for (SystemPresenceEnum value : SystemPresenceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemPresenceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemPresenceEnum systemPresence = null;
  private String organizationPresenceId = null;

  
  /**
   * The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsUserPresenceRecord startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsUserPresenceRecord endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The user's system presence
   **/
  public AnalyticsUserPresenceRecord systemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's system presence")
  @JsonProperty("systemPresence")
  public SystemPresenceEnum getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
  }

  
  /**
   * The identifier for the user's organization presence
   **/
  public AnalyticsUserPresenceRecord organizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier for the user's organization presence")
  @JsonProperty("organizationPresenceId")
  public String getOrganizationPresenceId() {
    return organizationPresenceId;
  }
  public void setOrganizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsUserPresenceRecord analyticsUserPresenceRecord = (AnalyticsUserPresenceRecord) o;
    return Objects.equals(this.startTime, analyticsUserPresenceRecord.startTime) &&
        Objects.equals(this.endTime, analyticsUserPresenceRecord.endTime) &&
        Objects.equals(this.systemPresence, analyticsUserPresenceRecord.systemPresence) &&
        Objects.equals(this.organizationPresenceId, analyticsUserPresenceRecord.organizationPresenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, systemPresence, organizationPresenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsUserPresenceRecord {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    organizationPresenceId: ").append(toIndentedString(organizationPresenceId)).append("\n");
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

