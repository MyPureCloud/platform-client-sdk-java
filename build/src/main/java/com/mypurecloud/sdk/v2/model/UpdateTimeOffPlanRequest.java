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
import com.mypurecloud.sdk.v2.model.SetWrapperString;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateTimeOffPlanRequest
 */

public class UpdateTimeOffPlanRequest  implements Serializable {
  
  private String name = null;
  private SetWrapperString activityCodeIds = null;
  private SetWrapperString timeOffLimitIds = null;

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
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The name of this time off plan.
   **/
  public UpdateTimeOffPlanRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of this time off plan.")
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
  public UpdateTimeOffPlanRequest activityCodeIds(SetWrapperString activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of activity code IDs to associate with this time off plan.")
  @JsonProperty("activityCodeIds")
  public SetWrapperString getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(SetWrapperString activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }

  
  /**
   * The set of time off limit IDs to associate with this time off plan.
   **/
  public UpdateTimeOffPlanRequest timeOffLimitIds(SetWrapperString timeOffLimitIds) {
    this.timeOffLimitIds = timeOffLimitIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of time off limit IDs to associate with this time off plan.")
  @JsonProperty("timeOffLimitIds")
  public SetWrapperString getTimeOffLimitIds() {
    return timeOffLimitIds;
  }
  public void setTimeOffLimitIds(SetWrapperString timeOffLimitIds) {
    this.timeOffLimitIds = timeOffLimitIds;
  }

  
  /**
   * Auto approval rule for the time off plan.
   **/
  public UpdateTimeOffPlanRequest autoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auto approval rule for the time off plan.")
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
  public UpdateTimeOffPlanRequest daysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
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
  public UpdateTimeOffPlanRequest active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this time off plan should be used by agents.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * Version metadata for the time off plan
   **/
  public UpdateTimeOffPlanRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the time off plan")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTimeOffPlanRequest updateTimeOffPlanRequest = (UpdateTimeOffPlanRequest) o;
    return Objects.equals(this.name, updateTimeOffPlanRequest.name) &&
        Objects.equals(this.activityCodeIds, updateTimeOffPlanRequest.activityCodeIds) &&
        Objects.equals(this.timeOffLimitIds, updateTimeOffPlanRequest.timeOffLimitIds) &&
        Objects.equals(this.autoApprovalRule, updateTimeOffPlanRequest.autoApprovalRule) &&
        Objects.equals(this.daysBeforeStartToExpireFromWaitlist, updateTimeOffPlanRequest.daysBeforeStartToExpireFromWaitlist) &&
        Objects.equals(this.active, updateTimeOffPlanRequest.active) &&
        Objects.equals(this.metadata, updateTimeOffPlanRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, activityCodeIds, timeOffLimitIds, autoApprovalRule, daysBeforeStartToExpireFromWaitlist, active, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTimeOffPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    timeOffLimitIds: ").append(toIndentedString(timeOffLimitIds)).append("\n");
    sb.append("    autoApprovalRule: ").append(toIndentedString(autoApprovalRule)).append("\n");
    sb.append("    daysBeforeStartToExpireFromWaitlist: ").append(toIndentedString(daysBeforeStartToExpireFromWaitlist)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

