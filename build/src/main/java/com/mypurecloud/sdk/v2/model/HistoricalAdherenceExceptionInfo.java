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
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HistoricalAdherenceExceptionInfo
 */

public class HistoricalAdherenceExceptionInfo  implements Serializable {
  
  private Integer startOffsetSeconds = null;
  private Integer endOffsetSeconds = null;
  private String scheduledActivityCodeId = null;

  private static class ScheduledActivityCategoryEnumDeserializer extends StdDeserializer<ScheduledActivityCategoryEnum> {
    public ScheduledActivityCategoryEnumDeserializer() {
      super(ScheduledActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ScheduledActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScheduledActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Activity for which the user is scheduled
   */
 @JsonDeserialize(using = ScheduledActivityCategoryEnumDeserializer.class)
  public enum ScheduledActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

    private String value;

    ScheduledActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScheduledActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ScheduledActivityCategoryEnum value : ScheduledActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScheduledActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScheduledActivityCategoryEnum scheduledActivityCategory = null;

  private static class ActualActivityCategoryEnumDeserializer extends StdDeserializer<ActualActivityCategoryEnum> {
    public ActualActivityCategoryEnumDeserializer() {
      super(ActualActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ActualActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActualActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Activity for which the user is actually engaged
   */
 @JsonDeserialize(using = ActualActivityCategoryEnumDeserializer.class)
  public enum ActualActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

    private String value;

    ActualActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActualActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ActualActivityCategoryEnum value : ActualActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActualActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActualActivityCategoryEnum actualActivityCategory = null;

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
   * Actual underlying system presence value
   */
 @JsonDeserialize(using = SystemPresenceEnumDeserializer.class)
  public enum SystemPresenceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVAILABLE("Available"),
    AWAY("Away"),
    BUSY("Busy"),
    OFFLINE("Offline"),
    IDLE("Idle"),
    ONQUEUE("OnQueue"),
    MEAL("Meal"),
    TRAINING("Training"),
    MEETING("Meeting"),
    BREAK("Break");

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
  private RoutingStatus routingStatus = null;

  private static class ImpactEnumDeserializer extends StdDeserializer<ImpactEnum> {
    public ImpactEnumDeserializer() {
      super(ImpactEnumDeserializer.class);
    }

    @Override
    public ImpactEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ImpactEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The impact of the current adherence state for this user
   */
 @JsonDeserialize(using = ImpactEnumDeserializer.class)
  public enum ImpactEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    POSITIVE("Positive"),
    NEGATIVE("Negative"),
    NEUTRAL("Neutral"),
    UNKNOWN("Unknown");

    private String value;

    ImpactEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ImpactEnum fromString(String key) {
      if (key == null) return null;

      for (ImpactEnum value : ImpactEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ImpactEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ImpactEnum impact = null;
  private String secondaryPresenceLookupId = null;

  
  /**
   * Exception start offset in seconds relative to query start time
   **/
  public HistoricalAdherenceExceptionInfo startOffsetSeconds(Integer startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exception start offset in seconds relative to query start time")
  @JsonProperty("startOffsetSeconds")
  public Integer getStartOffsetSeconds() {
    return startOffsetSeconds;
  }
  public void setStartOffsetSeconds(Integer startOffsetSeconds) {
    this.startOffsetSeconds = startOffsetSeconds;
  }

  
  /**
   * Exception end offset in seconds relative to query start time
   **/
  public HistoricalAdherenceExceptionInfo endOffsetSeconds(Integer endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Exception end offset in seconds relative to query start time")
  @JsonProperty("endOffsetSeconds")
  public Integer getEndOffsetSeconds() {
    return endOffsetSeconds;
  }
  public void setEndOffsetSeconds(Integer endOffsetSeconds) {
    this.endOffsetSeconds = endOffsetSeconds;
  }

  
  /**
   * The ID of the scheduled activity for this user
   **/
  public HistoricalAdherenceExceptionInfo scheduledActivityCodeId(String scheduledActivityCodeId) {
    this.scheduledActivityCodeId = scheduledActivityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the scheduled activity for this user")
  @JsonProperty("scheduledActivityCodeId")
  public String getScheduledActivityCodeId() {
    return scheduledActivityCodeId;
  }
  public void setScheduledActivityCodeId(String scheduledActivityCodeId) {
    this.scheduledActivityCodeId = scheduledActivityCodeId;
  }

  
  /**
   * Activity for which the user is scheduled
   **/
  public HistoricalAdherenceExceptionInfo scheduledActivityCategory(ScheduledActivityCategoryEnum scheduledActivityCategory) {
    this.scheduledActivityCategory = scheduledActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activity for which the user is scheduled")
  @JsonProperty("scheduledActivityCategory")
  public ScheduledActivityCategoryEnum getScheduledActivityCategory() {
    return scheduledActivityCategory;
  }
  public void setScheduledActivityCategory(ScheduledActivityCategoryEnum scheduledActivityCategory) {
    this.scheduledActivityCategory = scheduledActivityCategory;
  }

  
  /**
   * Activity for which the user is actually engaged
   **/
  public HistoricalAdherenceExceptionInfo actualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activity for which the user is actually engaged")
  @JsonProperty("actualActivityCategory")
  public ActualActivityCategoryEnum getActualActivityCategory() {
    return actualActivityCategory;
  }
  public void setActualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
  }

  
  /**
   * Actual underlying system presence value
   **/
  public HistoricalAdherenceExceptionInfo systemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actual underlying system presence value")
  @JsonProperty("systemPresence")
  public SystemPresenceEnum getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
  }

  
  /**
   * Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue
   **/
  public HistoricalAdherenceExceptionInfo routingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue")
  @JsonProperty("routingStatus")
  public RoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }

  
  /**
   * The impact of the current adherence state for this user
   **/
  public HistoricalAdherenceExceptionInfo impact(ImpactEnum impact) {
    this.impact = impact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The impact of the current adherence state for this user")
  @JsonProperty("impact")
  public ImpactEnum getImpact() {
    return impact;
  }
  public void setImpact(ImpactEnum impact) {
    this.impact = impact;
  }

  
  /**
   * The lookup ID used to retrieve secondary status from map of lookup ID to corresponding secondary presence ID
   **/
  public HistoricalAdherenceExceptionInfo secondaryPresenceLookupId(String secondaryPresenceLookupId) {
    this.secondaryPresenceLookupId = secondaryPresenceLookupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The lookup ID used to retrieve secondary status from map of lookup ID to corresponding secondary presence ID")
  @JsonProperty("secondaryPresenceLookupId")
  public String getSecondaryPresenceLookupId() {
    return secondaryPresenceLookupId;
  }
  public void setSecondaryPresenceLookupId(String secondaryPresenceLookupId) {
    this.secondaryPresenceLookupId = secondaryPresenceLookupId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalAdherenceExceptionInfo historicalAdherenceExceptionInfo = (HistoricalAdherenceExceptionInfo) o;
    return Objects.equals(this.startOffsetSeconds, historicalAdherenceExceptionInfo.startOffsetSeconds) &&
        Objects.equals(this.endOffsetSeconds, historicalAdherenceExceptionInfo.endOffsetSeconds) &&
        Objects.equals(this.scheduledActivityCodeId, historicalAdherenceExceptionInfo.scheduledActivityCodeId) &&
        Objects.equals(this.scheduledActivityCategory, historicalAdherenceExceptionInfo.scheduledActivityCategory) &&
        Objects.equals(this.actualActivityCategory, historicalAdherenceExceptionInfo.actualActivityCategory) &&
        Objects.equals(this.systemPresence, historicalAdherenceExceptionInfo.systemPresence) &&
        Objects.equals(this.routingStatus, historicalAdherenceExceptionInfo.routingStatus) &&
        Objects.equals(this.impact, historicalAdherenceExceptionInfo.impact) &&
        Objects.equals(this.secondaryPresenceLookupId, historicalAdherenceExceptionInfo.secondaryPresenceLookupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startOffsetSeconds, endOffsetSeconds, scheduledActivityCodeId, scheduledActivityCategory, actualActivityCategory, systemPresence, routingStatus, impact, secondaryPresenceLookupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalAdherenceExceptionInfo {\n");
    
    sb.append("    startOffsetSeconds: ").append(toIndentedString(startOffsetSeconds)).append("\n");
    sb.append("    endOffsetSeconds: ").append(toIndentedString(endOffsetSeconds)).append("\n");
    sb.append("    scheduledActivityCodeId: ").append(toIndentedString(scheduledActivityCodeId)).append("\n");
    sb.append("    scheduledActivityCategory: ").append(toIndentedString(scheduledActivityCategory)).append("\n");
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    secondaryPresenceLookupId: ").append(toIndentedString(secondaryPresenceLookupId)).append("\n");
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

