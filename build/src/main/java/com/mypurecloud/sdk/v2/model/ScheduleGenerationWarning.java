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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Schedule generation warning
 */
@ApiModel(description = "Schedule generation warning")

public class ScheduleGenerationWarning  implements Serializable {
  
  private String userId = null;
  private Boolean userNotLicensed = null;
  private Boolean unableToMeetMaxDays = null;

  private static class UnableToScheduleRequiredDaysEnumDeserializer extends StdDeserializer<UnableToScheduleRequiredDaysEnum> {
    public UnableToScheduleRequiredDaysEnumDeserializer() {
      super(UnableToScheduleRequiredDaysEnumDeserializer.class);
    }

    @Override
    public UnableToScheduleRequiredDaysEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnableToScheduleRequiredDaysEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets unableToScheduleRequiredDays
   */
 @JsonDeserialize(using = UnableToScheduleRequiredDaysEnumDeserializer.class)
  public enum UnableToScheduleRequiredDaysEnum {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    UnableToScheduleRequiredDaysEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnableToScheduleRequiredDaysEnum fromString(String key) {
      if (key == null) return null;

      for (UnableToScheduleRequiredDaysEnum value : UnableToScheduleRequiredDaysEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnableToScheduleRequiredDaysEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<UnableToScheduleRequiredDaysEnum> unableToScheduleRequiredDays = new ArrayList<UnableToScheduleRequiredDaysEnum>();
  private Boolean unableToMeetMinPaidForTheWeek = null;
  private Boolean unableToMeetMaxPaidForTheWeek = null;

  private static class NoNeedDaysEnumDeserializer extends StdDeserializer<NoNeedDaysEnum> {
    public NoNeedDaysEnumDeserializer() {
      super(NoNeedDaysEnumDeserializer.class);
    }

    @Override
    public NoNeedDaysEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NoNeedDaysEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets noNeedDays
   */
 @JsonDeserialize(using = NoNeedDaysEnumDeserializer.class)
  public enum NoNeedDaysEnum {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    NoNeedDaysEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NoNeedDaysEnum fromString(String key) {
      if (key == null) return null;

      for (NoNeedDaysEnum value : NoNeedDaysEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NoNeedDaysEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<NoNeedDaysEnum> noNeedDays = new ArrayList<NoNeedDaysEnum>();
  private Boolean shiftsTooCloseTogether = null;

  
  /**
   * ID of the user in the warning
   **/
  public ScheduleGenerationWarning userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the user in the warning")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Whether the user does not have the appropriate license to be scheduled
   **/
  public ScheduleGenerationWarning userNotLicensed(Boolean userNotLicensed) {
    this.userNotLicensed = userNotLicensed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the user does not have the appropriate license to be scheduled")
  @JsonProperty("userNotLicensed")
  public Boolean getUserNotLicensed() {
    return userNotLicensed;
  }
  public void setUserNotLicensed(Boolean userNotLicensed) {
    this.userNotLicensed = userNotLicensed;
  }

  
  /**
   * Whether the number of scheduled days exceeded the maximum days to schedule defined in the agent work plan
   **/
  public ScheduleGenerationWarning unableToMeetMaxDays(Boolean unableToMeetMaxDays) {
    this.unableToMeetMaxDays = unableToMeetMaxDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the number of scheduled days exceeded the maximum days to schedule defined in the agent work plan")
  @JsonProperty("unableToMeetMaxDays")
  public Boolean getUnableToMeetMaxDays() {
    return unableToMeetMaxDays;
  }
  public void setUnableToMeetMaxDays(Boolean unableToMeetMaxDays) {
    this.unableToMeetMaxDays = unableToMeetMaxDays;
  }

  
  /**
   * Days indicated as required to work in agent work plan where no viable shift was found to schedule
   **/
  public ScheduleGenerationWarning unableToScheduleRequiredDays(List<UnableToScheduleRequiredDaysEnum> unableToScheduleRequiredDays) {
    this.unableToScheduleRequiredDays = unableToScheduleRequiredDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days indicated as required to work in agent work plan where no viable shift was found to schedule")
  @JsonProperty("unableToScheduleRequiredDays")
  public List<UnableToScheduleRequiredDaysEnum> getUnableToScheduleRequiredDays() {
    return unableToScheduleRequiredDays;
  }
  public void setUnableToScheduleRequiredDays(List<UnableToScheduleRequiredDaysEnum> unableToScheduleRequiredDays) {
    this.unableToScheduleRequiredDays = unableToScheduleRequiredDays;
  }

  
  /**
   * Whether the schedule did not meet the minimum paid time for the week defined in the agent work plan
   **/
  public ScheduleGenerationWarning unableToMeetMinPaidForTheWeek(Boolean unableToMeetMinPaidForTheWeek) {
    this.unableToMeetMinPaidForTheWeek = unableToMeetMinPaidForTheWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the schedule did not meet the minimum paid time for the week defined in the agent work plan")
  @JsonProperty("unableToMeetMinPaidForTheWeek")
  public Boolean getUnableToMeetMinPaidForTheWeek() {
    return unableToMeetMinPaidForTheWeek;
  }
  public void setUnableToMeetMinPaidForTheWeek(Boolean unableToMeetMinPaidForTheWeek) {
    this.unableToMeetMinPaidForTheWeek = unableToMeetMinPaidForTheWeek;
  }

  
  /**
   * Whether the schedule exceeded the maximum paid time for the week defined in the agent work plan
   **/
  public ScheduleGenerationWarning unableToMeetMaxPaidForTheWeek(Boolean unableToMeetMaxPaidForTheWeek) {
    this.unableToMeetMaxPaidForTheWeek = unableToMeetMaxPaidForTheWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the schedule exceeded the maximum paid time for the week defined in the agent work plan")
  @JsonProperty("unableToMeetMaxPaidForTheWeek")
  public Boolean getUnableToMeetMaxPaidForTheWeek() {
    return unableToMeetMaxPaidForTheWeek;
  }
  public void setUnableToMeetMaxPaidForTheWeek(Boolean unableToMeetMaxPaidForTheWeek) {
    this.unableToMeetMaxPaidForTheWeek = unableToMeetMaxPaidForTheWeek;
  }

  
  /**
   * Days agent was scheduled but there was no need to meet. The scheduled days have no effect on service levels
   **/
  public ScheduleGenerationWarning noNeedDays(List<NoNeedDaysEnum> noNeedDays) {
    this.noNeedDays = noNeedDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days agent was scheduled but there was no need to meet. The scheduled days have no effect on service levels")
  @JsonProperty("noNeedDays")
  public List<NoNeedDaysEnum> getNoNeedDays() {
    return noNeedDays;
  }
  public void setNoNeedDays(List<NoNeedDaysEnum> noNeedDays) {
    this.noNeedDays = noNeedDays;
  }

  
  /**
   * Whether the schedule did not meet the minimum time between shifts defined in the agent work plan
   **/
  public ScheduleGenerationWarning shiftsTooCloseTogether(Boolean shiftsTooCloseTogether) {
    this.shiftsTooCloseTogether = shiftsTooCloseTogether;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the schedule did not meet the minimum time between shifts defined in the agent work plan")
  @JsonProperty("shiftsTooCloseTogether")
  public Boolean getShiftsTooCloseTogether() {
    return shiftsTooCloseTogether;
  }
  public void setShiftsTooCloseTogether(Boolean shiftsTooCloseTogether) {
    this.shiftsTooCloseTogether = shiftsTooCloseTogether;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleGenerationWarning scheduleGenerationWarning = (ScheduleGenerationWarning) o;
    return Objects.equals(this.userId, scheduleGenerationWarning.userId) &&
        Objects.equals(this.userNotLicensed, scheduleGenerationWarning.userNotLicensed) &&
        Objects.equals(this.unableToMeetMaxDays, scheduleGenerationWarning.unableToMeetMaxDays) &&
        Objects.equals(this.unableToScheduleRequiredDays, scheduleGenerationWarning.unableToScheduleRequiredDays) &&
        Objects.equals(this.unableToMeetMinPaidForTheWeek, scheduleGenerationWarning.unableToMeetMinPaidForTheWeek) &&
        Objects.equals(this.unableToMeetMaxPaidForTheWeek, scheduleGenerationWarning.unableToMeetMaxPaidForTheWeek) &&
        Objects.equals(this.noNeedDays, scheduleGenerationWarning.noNeedDays) &&
        Objects.equals(this.shiftsTooCloseTogether, scheduleGenerationWarning.shiftsTooCloseTogether);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userNotLicensed, unableToMeetMaxDays, unableToScheduleRequiredDays, unableToMeetMinPaidForTheWeek, unableToMeetMaxPaidForTheWeek, noNeedDays, shiftsTooCloseTogether);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleGenerationWarning {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userNotLicensed: ").append(toIndentedString(userNotLicensed)).append("\n");
    sb.append("    unableToMeetMaxDays: ").append(toIndentedString(unableToMeetMaxDays)).append("\n");
    sb.append("    unableToScheduleRequiredDays: ").append(toIndentedString(unableToScheduleRequiredDays)).append("\n");
    sb.append("    unableToMeetMinPaidForTheWeek: ").append(toIndentedString(unableToMeetMinPaidForTheWeek)).append("\n");
    sb.append("    unableToMeetMaxPaidForTheWeek: ").append(toIndentedString(unableToMeetMaxPaidForTheWeek)).append("\n");
    sb.append("    noNeedDays: ").append(toIndentedString(noNeedDays)).append("\n");
    sb.append("    shiftsTooCloseTogether: ").append(toIndentedString(shiftsTooCloseTogether)).append("\n");
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

