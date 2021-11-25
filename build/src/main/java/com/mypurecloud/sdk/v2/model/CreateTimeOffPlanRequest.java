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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CreateTimeOffPlanRequest
 */

public class CreateTimeOffPlanRequest  implements Serializable {
  
  private String name = null;
  private List<String> activityCodeIds = new ArrayList<String>();
  private List<String> timeOffLimitIds = new ArrayList<String>();

  private static class AutoApprovalRuleEnumDeserializer extends StdDeserializer<AutoApprovalRuleEnum> {
    public AutoApprovalRuleEnumDeserializer() {
      super(AutoApprovalRuleEnumDeserializer.class);
    }

    @Override
    public AutoApprovalRuleEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AutoApprovalRuleEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Auto approval rule for the time off plan.
   */
 @JsonDeserialize(using = AutoApprovalRuleEnumDeserializer.class)
  public enum AutoApprovalRuleEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEVER("Never"),
    ALWAYS("Always"),
    CHECKLIMITS("CheckLimits");

    private String value;

    AutoApprovalRuleEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AutoApprovalRuleEnum fromString(String key) {
      if (key == null) return null;

      for (AutoApprovalRuleEnum value : AutoApprovalRuleEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AutoApprovalRuleEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AutoApprovalRuleEnum autoApprovalRule = null;
  private Integer daysBeforeStartToExpireFromWaitlist = null;
  private Boolean active = null;

  
  /**
   * The name of this time off plan.
   **/
  public CreateTimeOffPlanRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of this time off plan.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The set of activity code IDs to associate with this time off plan.
   **/
  public CreateTimeOffPlanRequest activityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of activity code IDs to associate with this time off plan.")
  @JsonProperty("activityCodeIds")
  public List<String> getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }

  
  /**
   * The set of time off limit IDs to associate with this time off plan.
   **/
  public CreateTimeOffPlanRequest timeOffLimitIds(List<String> timeOffLimitIds) {
    this.timeOffLimitIds = timeOffLimitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of time off limit IDs to associate with this time off plan.")
  @JsonProperty("timeOffLimitIds")
  public List<String> getTimeOffLimitIds() {
    return timeOffLimitIds;
  }
  public void setTimeOffLimitIds(List<String> timeOffLimitIds) {
    this.timeOffLimitIds = timeOffLimitIds;
  }

  
  /**
   * Auto approval rule for the time off plan.
   **/
  public CreateTimeOffPlanRequest autoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Auto approval rule for the time off plan.")
  @JsonProperty("autoApprovalRule")
  public AutoApprovalRuleEnum getAutoApprovalRule() {
    return autoApprovalRule;
  }
  public void setAutoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
  }

  
  /**
   * The number of days before the time off request start date for when the request will be expired from the waitlist.
   **/
  public CreateTimeOffPlanRequest daysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
    this.daysBeforeStartToExpireFromWaitlist = daysBeforeStartToExpireFromWaitlist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of days before the time off request start date for when the request will be expired from the waitlist.")
  @JsonProperty("daysBeforeStartToExpireFromWaitlist")
  public Integer getDaysBeforeStartToExpireFromWaitlist() {
    return daysBeforeStartToExpireFromWaitlist;
  }
  public void setDaysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
    this.daysBeforeStartToExpireFromWaitlist = daysBeforeStartToExpireFromWaitlist;
  }

  
  /**
   * Whether this time off plan should be used by agents.
   **/
  public CreateTimeOffPlanRequest active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this time off plan should be used by agents.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTimeOffPlanRequest createTimeOffPlanRequest = (CreateTimeOffPlanRequest) o;
    return Objects.equals(this.name, createTimeOffPlanRequest.name) &&
        Objects.equals(this.activityCodeIds, createTimeOffPlanRequest.activityCodeIds) &&
        Objects.equals(this.timeOffLimitIds, createTimeOffPlanRequest.timeOffLimitIds) &&
        Objects.equals(this.autoApprovalRule, createTimeOffPlanRequest.autoApprovalRule) &&
        Objects.equals(this.daysBeforeStartToExpireFromWaitlist, createTimeOffPlanRequest.daysBeforeStartToExpireFromWaitlist) &&
        Objects.equals(this.active, createTimeOffPlanRequest.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, activityCodeIds, timeOffLimitIds, autoApprovalRule, daysBeforeStartToExpireFromWaitlist, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTimeOffPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    timeOffLimitIds: ").append(toIndentedString(timeOffLimitIds)).append("\n");
    sb.append("    autoApprovalRule: ").append(toIndentedString(autoApprovalRule)).append("\n");
    sb.append("    daysBeforeStartToExpireFromWaitlist: ").append(toIndentedString(daysBeforeStartToExpireFromWaitlist)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

