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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffRequestQueryBody
 */

public class TimeOffRequestQueryBody  implements Serializable {
  
  private List<String> ids = null;
  private List<String> userIds = null;

  private static class StatusesEnumDeserializer extends StdDeserializer<StatusesEnum> {
    public StatusesEnumDeserializer() {
      super(StatusesEnumDeserializer.class);
    }

    @Override
    public StatusesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets statuses
   */
 @JsonDeserialize(using = StatusesEnumDeserializer.class)
  public enum StatusesEnum {
    PENDING("PENDING");

    private String value;

    StatusesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusesEnum fromString(String key) {
      if (key == null) return null;

      for (StatusesEnum value : StatusesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<StatusesEnum> statuses = null;

  private static class SubstatusesEnumDeserializer extends StdDeserializer<SubstatusesEnum> {
    public SubstatusesEnumDeserializer() {
      super(SubstatusesEnumDeserializer.class);
    }

    @Override
    public SubstatusesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubstatusesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets substatuses
   */
 @JsonDeserialize(using = SubstatusesEnumDeserializer.class)
  public enum SubstatusesEnum {
    ADVANCETIMEELAPSED("AdvanceTimeElapsed"),
    AUTOAPPROVED("AutoApproved"),
    INSUFFICIENTBALANCE("InsufficientBalance"),
    INVALIDDAILYDURATION("InvalidDailyDuration"),
    OUTSIDESHIFT("OutsideShift"),
    REMOVEDFROMWAITLIST("RemovedFromWaitlist"),
    WAITLISTED("Waitlisted");

    private String value;

    SubstatusesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubstatusesEnum fromString(String key) {
      if (key == null) return null;

      for (SubstatusesEnum value : SubstatusesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubstatusesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SubstatusesEnum> substatuses = null;
  private DateRange dateRange = null;

  
  /**
   * The set of ids to filter time off requests
   **/
  public TimeOffRequestQueryBody ids(List<String> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of ids to filter time off requests")
  @JsonProperty("ids")
  public List<String> getIds() {
    return ids;
  }
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  /**
   * The set of user ids to filter time off requests
   **/
  public TimeOffRequestQueryBody userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of user ids to filter time off requests")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * The set of statuses to filter time off requests
   **/
  public TimeOffRequestQueryBody statuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of statuses to filter time off requests")
  @JsonProperty("statuses")
  public List<StatusesEnum> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
  }


  /**
   * The set of substatuses to filter time off requests
   **/
  public TimeOffRequestQueryBody substatuses(List<SubstatusesEnum> substatuses) {
    this.substatuses = substatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of substatuses to filter time off requests")
  @JsonProperty("substatuses")
  public List<SubstatusesEnum> getSubstatuses() {
    return substatuses;
  }
  public void setSubstatuses(List<SubstatusesEnum> substatuses) {
    this.substatuses = substatuses;
  }


  /**
   * The inclusive range of dates to filter time off requests
   **/
  public TimeOffRequestQueryBody dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The inclusive range of dates to filter time off requests")
  @JsonProperty("dateRange")
  public DateRange getDateRange() {
    return dateRange;
  }
  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequestQueryBody timeOffRequestQueryBody = (TimeOffRequestQueryBody) o;

    return Objects.equals(this.ids, timeOffRequestQueryBody.ids) &&
            Objects.equals(this.userIds, timeOffRequestQueryBody.userIds) &&
            Objects.equals(this.statuses, timeOffRequestQueryBody.statuses) &&
            Objects.equals(this.substatuses, timeOffRequestQueryBody.substatuses) &&
            Objects.equals(this.dateRange, timeOffRequestQueryBody.dateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, userIds, statuses, substatuses, dateRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestQueryBody {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    substatuses: ").append(toIndentedString(substatuses)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
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

