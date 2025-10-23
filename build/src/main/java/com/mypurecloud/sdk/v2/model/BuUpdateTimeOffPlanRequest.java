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
import com.mypurecloud.sdk.v2.model.SetWrapperString;
import com.mypurecloud.sdk.v2.model.UpdateTimeOffPlanBusinessUnitAssociation;
import com.mypurecloud.sdk.v2.model.UpdateTimeOffPlanManagementUnitAssociation;
import com.mypurecloud.sdk.v2.model.ValueWrapperHrisTimeOffType;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuUpdateTimeOffPlanRequest
 */

public class BuUpdateTimeOffPlanRequest  implements Serializable {
  
  private String name = null;
  private SetWrapperString activityCodeIds = null;

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
   * Auto approval rule for this time-off plan
   */
 @JsonDeserialize(using = AutoApprovalRuleEnumDeserializer.class)
  public enum AutoApprovalRuleEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEVER("Never"),
    ALWAYS("Always"),
    CHECKLIMITS("CheckLimits"),
    CHECKACTIVITYCODES("CheckActivityCodes"),
    CHECKLIMITSANDACTIVITYCODES("CheckLimitsAndActivityCodes");

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
  private Boolean autoPublishApprovedTimeOffRequests = null;
  private SetWrapperString restrictedActivityCodeIds = null;
  private ValueWrapperHrisTimeOffType hrisTimeOffType = null;
  private Boolean enabled = null;
  private Boolean countAgainstTimeOffLimits = null;
  private UpdateTimeOffPlanBusinessUnitAssociation businessUnitAssociation = null;
  private UpdateTimeOffPlanManagementUnitAssociation managementUnitAssociation = null;
  private WfmVersionedEntityMetadata metadata = null;

  public BuUpdateTimeOffPlanRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of this time-off plan
   **/
  public BuUpdateTimeOffPlanRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of this time-off plan")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The IDs of activity codes to associate with this time-off plan
   **/
  public BuUpdateTimeOffPlanRequest activityCodeIds(SetWrapperString activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of activity codes to associate with this time-off plan")
  @JsonProperty("activityCodeIds")
  public SetWrapperString getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(SetWrapperString activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }


  /**
   * Auto approval rule for this time-off plan
   **/
  public BuUpdateTimeOffPlanRequest autoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auto approval rule for this time-off plan")
  @JsonProperty("autoApprovalRule")
  public AutoApprovalRuleEnum getAutoApprovalRule() {
    return autoApprovalRule;
  }
  public void setAutoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
  }


  /**
   * The number of days before the time-off request start date for when the request will be expired from the waitlist
   **/
  public BuUpdateTimeOffPlanRequest daysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
    this.daysBeforeStartToExpireFromWaitlist = daysBeforeStartToExpireFromWaitlist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of days before the time-off request start date for when the request will be expired from the waitlist")
  @JsonProperty("daysBeforeStartToExpireFromWaitlist")
  public Integer getDaysBeforeStartToExpireFromWaitlist() {
    return daysBeforeStartToExpireFromWaitlist;
  }
  public void setDaysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
    this.daysBeforeStartToExpireFromWaitlist = daysBeforeStartToExpireFromWaitlist;
  }


  /**
   * Whether newly approved time-off requests with activity codes associated with this time-off plan should be automatically published to the schedule
   **/
  public BuUpdateTimeOffPlanRequest autoPublishApprovedTimeOffRequests(Boolean autoPublishApprovedTimeOffRequests) {
    this.autoPublishApprovedTimeOffRequests = autoPublishApprovedTimeOffRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether newly approved time-off requests with activity codes associated with this time-off plan should be automatically published to the schedule")
  @JsonProperty("autoPublishApprovedTimeOffRequests")
  public Boolean getAutoPublishApprovedTimeOffRequests() {
    return autoPublishApprovedTimeOffRequests;
  }
  public void setAutoPublishApprovedTimeOffRequests(Boolean autoPublishApprovedTimeOffRequests) {
    this.autoPublishApprovedTimeOffRequests = autoPublishApprovedTimeOffRequests;
  }


  /**
   * The IDs of non time-off activity codes to check for conflicts in case the auto approval rule specifies checking activity codes. If these activity codes are present in schedule and overlap with the time-off request duration, the request will not be auto approved
   **/
  public BuUpdateTimeOffPlanRequest restrictedActivityCodeIds(SetWrapperString restrictedActivityCodeIds) {
    this.restrictedActivityCodeIds = restrictedActivityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of non time-off activity codes to check for conflicts in case the auto approval rule specifies checking activity codes. If these activity codes are present in schedule and overlap with the time-off request duration, the request will not be auto approved")
  @JsonProperty("restrictedActivityCodeIds")
  public SetWrapperString getRestrictedActivityCodeIds() {
    return restrictedActivityCodeIds;
  }
  public void setRestrictedActivityCodeIds(SetWrapperString restrictedActivityCodeIds) {
    this.restrictedActivityCodeIds = restrictedActivityCodeIds;
  }


  /**
   * Time-off type, if this time-off plan is associated with the integration
   **/
  public BuUpdateTimeOffPlanRequest hrisTimeOffType(ValueWrapperHrisTimeOffType hrisTimeOffType) {
    this.hrisTimeOffType = hrisTimeOffType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time-off type, if this time-off plan is associated with the integration")
  @JsonProperty("hrisTimeOffType")
  public ValueWrapperHrisTimeOffType getHrisTimeOffType() {
    return hrisTimeOffType;
  }
  public void setHrisTimeOffType(ValueWrapperHrisTimeOffType hrisTimeOffType) {
    this.hrisTimeOffType = hrisTimeOffType;
  }


  /**
   * Whether this time-off plan should be used by agents
   **/
  public BuUpdateTimeOffPlanRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this time-off plan should be used by agents")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Whether this time-off plan should count against time-off limits
   **/
  public BuUpdateTimeOffPlanRequest countAgainstTimeOffLimits(Boolean countAgainstTimeOffLimits) {
    this.countAgainstTimeOffLimits = countAgainstTimeOffLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this time-off plan should count against time-off limits")
  @JsonProperty("countAgainstTimeOffLimits")
  public Boolean getCountAgainstTimeOffLimits() {
    return countAgainstTimeOffLimits;
  }
  public void setCountAgainstTimeOffLimits(Boolean countAgainstTimeOffLimits) {
    this.countAgainstTimeOffLimits = countAgainstTimeOffLimits;
  }


  /**
   * Business unit association, if the time-off plan belongs to a business unit. managementUnitAssociation must not be set if this is populated
   **/
  public BuUpdateTimeOffPlanRequest businessUnitAssociation(UpdateTimeOffPlanBusinessUnitAssociation businessUnitAssociation) {
    this.businessUnitAssociation = businessUnitAssociation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business unit association, if the time-off plan belongs to a business unit. managementUnitAssociation must not be set if this is populated")
  @JsonProperty("businessUnitAssociation")
  public UpdateTimeOffPlanBusinessUnitAssociation getBusinessUnitAssociation() {
    return businessUnitAssociation;
  }
  public void setBusinessUnitAssociation(UpdateTimeOffPlanBusinessUnitAssociation businessUnitAssociation) {
    this.businessUnitAssociation = businessUnitAssociation;
  }


  /**
   * Management unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated
   **/
  public BuUpdateTimeOffPlanRequest managementUnitAssociation(UpdateTimeOffPlanManagementUnitAssociation managementUnitAssociation) {
    this.managementUnitAssociation = managementUnitAssociation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Management unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated")
  @JsonProperty("managementUnitAssociation")
  public UpdateTimeOffPlanManagementUnitAssociation getManagementUnitAssociation() {
    return managementUnitAssociation;
  }
  public void setManagementUnitAssociation(UpdateTimeOffPlanManagementUnitAssociation managementUnitAssociation) {
    this.managementUnitAssociation = managementUnitAssociation;
  }


  /**
   * Version metadata for this time-off plan
   **/
  public BuUpdateTimeOffPlanRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this time-off plan")
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
    BuUpdateTimeOffPlanRequest buUpdateTimeOffPlanRequest = (BuUpdateTimeOffPlanRequest) o;

    return Objects.equals(this.name, buUpdateTimeOffPlanRequest.name) &&
            Objects.equals(this.activityCodeIds, buUpdateTimeOffPlanRequest.activityCodeIds) &&
            Objects.equals(this.autoApprovalRule, buUpdateTimeOffPlanRequest.autoApprovalRule) &&
            Objects.equals(this.daysBeforeStartToExpireFromWaitlist, buUpdateTimeOffPlanRequest.daysBeforeStartToExpireFromWaitlist) &&
            Objects.equals(this.autoPublishApprovedTimeOffRequests, buUpdateTimeOffPlanRequest.autoPublishApprovedTimeOffRequests) &&
            Objects.equals(this.restrictedActivityCodeIds, buUpdateTimeOffPlanRequest.restrictedActivityCodeIds) &&
            Objects.equals(this.hrisTimeOffType, buUpdateTimeOffPlanRequest.hrisTimeOffType) &&
            Objects.equals(this.enabled, buUpdateTimeOffPlanRequest.enabled) &&
            Objects.equals(this.countAgainstTimeOffLimits, buUpdateTimeOffPlanRequest.countAgainstTimeOffLimits) &&
            Objects.equals(this.businessUnitAssociation, buUpdateTimeOffPlanRequest.businessUnitAssociation) &&
            Objects.equals(this.managementUnitAssociation, buUpdateTimeOffPlanRequest.managementUnitAssociation) &&
            Objects.equals(this.metadata, buUpdateTimeOffPlanRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, activityCodeIds, autoApprovalRule, daysBeforeStartToExpireFromWaitlist, autoPublishApprovedTimeOffRequests, restrictedActivityCodeIds, hrisTimeOffType, enabled, countAgainstTimeOffLimits, businessUnitAssociation, managementUnitAssociation, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuUpdateTimeOffPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    autoApprovalRule: ").append(toIndentedString(autoApprovalRule)).append("\n");
    sb.append("    daysBeforeStartToExpireFromWaitlist: ").append(toIndentedString(daysBeforeStartToExpireFromWaitlist)).append("\n");
    sb.append("    autoPublishApprovedTimeOffRequests: ").append(toIndentedString(autoPublishApprovedTimeOffRequests)).append("\n");
    sb.append("    restrictedActivityCodeIds: ").append(toIndentedString(restrictedActivityCodeIds)).append("\n");
    sb.append("    hrisTimeOffType: ").append(toIndentedString(hrisTimeOffType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    countAgainstTimeOffLimits: ").append(toIndentedString(countAgainstTimeOffLimits)).append("\n");
    sb.append("    businessUnitAssociation: ").append(toIndentedString(businessUnitAssociation)).append("\n");
    sb.append("    managementUnitAssociation: ").append(toIndentedString(managementUnitAssociation)).append("\n");
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

