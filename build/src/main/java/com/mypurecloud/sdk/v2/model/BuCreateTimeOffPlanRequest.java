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
import com.mypurecloud.sdk.v2.model.CreateTimeOffPlanBusinessUnitAssociation;
import com.mypurecloud.sdk.v2.model.CreateTimeOffPlanManagementUnitAssociation;
import com.mypurecloud.sdk.v2.model.HrisTimeOffType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * BuCreateTimeOffPlanRequest
 */

public class BuCreateTimeOffPlanRequest  implements Serializable {
  
  private String name = null;
  private List<String> activityCodeIds = null;

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
   * Auto approval rule for this time-off plan. Default is Never
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
  private HrisTimeOffType hrisTimeOffType = null;
  private Boolean enabled = null;
  private Boolean countAgainstTimeOffLimits = null;
  private CreateTimeOffPlanBusinessUnitAssociation businessUnitAssociation = null;
  private CreateTimeOffPlanManagementUnitAssociation managementUnitAssociation = null;

  public BuCreateTimeOffPlanRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activityCodeIds = new ArrayList<String>();
    }
  }

  
  /**
   * The name of this time-off plan
   **/
  public BuCreateTimeOffPlanRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of this time-off plan")
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
  public BuCreateTimeOffPlanRequest activityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of activity codes to associate with this time-off plan")
  @JsonProperty("activityCodeIds")
  public List<String> getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }


  /**
   * Auto approval rule for this time-off plan. Default is Never
   **/
  public BuCreateTimeOffPlanRequest autoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Auto approval rule for this time-off plan. Default is Never")
  @JsonProperty("autoApprovalRule")
  public AutoApprovalRuleEnum getAutoApprovalRule() {
    return autoApprovalRule;
  }
  public void setAutoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
  }


  /**
   * The number of days before the time-off request start date for when the request will be expired from the waitlist. Default is 0
   **/
  public BuCreateTimeOffPlanRequest daysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
    this.daysBeforeStartToExpireFromWaitlist = daysBeforeStartToExpireFromWaitlist;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of days before the time-off request start date for when the request will be expired from the waitlist. Default is 0")
  @JsonProperty("daysBeforeStartToExpireFromWaitlist")
  public Integer getDaysBeforeStartToExpireFromWaitlist() {
    return daysBeforeStartToExpireFromWaitlist;
  }
  public void setDaysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
    this.daysBeforeStartToExpireFromWaitlist = daysBeforeStartToExpireFromWaitlist;
  }


  /**
   * Time-off type, if this time-off plan is associated with the integration
   **/
  public BuCreateTimeOffPlanRequest hrisTimeOffType(HrisTimeOffType hrisTimeOffType) {
    this.hrisTimeOffType = hrisTimeOffType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time-off type, if this time-off plan is associated with the integration")
  @JsonProperty("hrisTimeOffType")
  public HrisTimeOffType getHrisTimeOffType() {
    return hrisTimeOffType;
  }
  public void setHrisTimeOffType(HrisTimeOffType hrisTimeOffType) {
    this.hrisTimeOffType = hrisTimeOffType;
  }


  /**
   * Whether this time-off plan should be used by agents. Default is true
   **/
  public BuCreateTimeOffPlanRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this time-off plan should be used by agents. Default is true")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Whether this time-off plan should count against time-off limits. Default is false
   **/
  public BuCreateTimeOffPlanRequest countAgainstTimeOffLimits(Boolean countAgainstTimeOffLimits) {
    this.countAgainstTimeOffLimits = countAgainstTimeOffLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this time-off plan should count against time-off limits. Default is false")
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
  public BuCreateTimeOffPlanRequest businessUnitAssociation(CreateTimeOffPlanBusinessUnitAssociation businessUnitAssociation) {
    this.businessUnitAssociation = businessUnitAssociation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business unit association, if the time-off plan belongs to a business unit. managementUnitAssociation must not be set if this is populated")
  @JsonProperty("businessUnitAssociation")
  public CreateTimeOffPlanBusinessUnitAssociation getBusinessUnitAssociation() {
    return businessUnitAssociation;
  }
  public void setBusinessUnitAssociation(CreateTimeOffPlanBusinessUnitAssociation businessUnitAssociation) {
    this.businessUnitAssociation = businessUnitAssociation;
  }


  /**
   * Management unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated
   **/
  public BuCreateTimeOffPlanRequest managementUnitAssociation(CreateTimeOffPlanManagementUnitAssociation managementUnitAssociation) {
    this.managementUnitAssociation = managementUnitAssociation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Management unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated")
  @JsonProperty("managementUnitAssociation")
  public CreateTimeOffPlanManagementUnitAssociation getManagementUnitAssociation() {
    return managementUnitAssociation;
  }
  public void setManagementUnitAssociation(CreateTimeOffPlanManagementUnitAssociation managementUnitAssociation) {
    this.managementUnitAssociation = managementUnitAssociation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuCreateTimeOffPlanRequest buCreateTimeOffPlanRequest = (BuCreateTimeOffPlanRequest) o;

    return Objects.equals(this.name, buCreateTimeOffPlanRequest.name) &&
            Objects.equals(this.activityCodeIds, buCreateTimeOffPlanRequest.activityCodeIds) &&
            Objects.equals(this.autoApprovalRule, buCreateTimeOffPlanRequest.autoApprovalRule) &&
            Objects.equals(this.daysBeforeStartToExpireFromWaitlist, buCreateTimeOffPlanRequest.daysBeforeStartToExpireFromWaitlist) &&
            Objects.equals(this.hrisTimeOffType, buCreateTimeOffPlanRequest.hrisTimeOffType) &&
            Objects.equals(this.enabled, buCreateTimeOffPlanRequest.enabled) &&
            Objects.equals(this.countAgainstTimeOffLimits, buCreateTimeOffPlanRequest.countAgainstTimeOffLimits) &&
            Objects.equals(this.businessUnitAssociation, buCreateTimeOffPlanRequest.businessUnitAssociation) &&
            Objects.equals(this.managementUnitAssociation, buCreateTimeOffPlanRequest.managementUnitAssociation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, activityCodeIds, autoApprovalRule, daysBeforeStartToExpireFromWaitlist, hrisTimeOffType, enabled, countAgainstTimeOffLimits, businessUnitAssociation, managementUnitAssociation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuCreateTimeOffPlanRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    autoApprovalRule: ").append(toIndentedString(autoApprovalRule)).append("\n");
    sb.append("    daysBeforeStartToExpireFromWaitlist: ").append(toIndentedString(daysBeforeStartToExpireFromWaitlist)).append("\n");
    sb.append("    hrisTimeOffType: ").append(toIndentedString(hrisTimeOffType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    countAgainstTimeOffLimits: ").append(toIndentedString(countAgainstTimeOffLimits)).append("\n");
    sb.append("    businessUnitAssociation: ").append(toIndentedString(businessUnitAssociation)).append("\n");
    sb.append("    managementUnitAssociation: ").append(toIndentedString(managementUnitAssociation)).append("\n");
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

