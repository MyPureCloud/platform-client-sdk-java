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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.BuTimeOffLimitReference;
import com.mypurecloud.sdk.v2.model.HrisTimeOffType;
import com.mypurecloud.sdk.v2.model.TimeOffPlanBusinessUnitAssociation;
import com.mypurecloud.sdk.v2.model.TimeOffPlanManagementUnitAssociation;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * BuTimeOffPlanResponse
 */

public class BuTimeOffPlanResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<String> activityCodeIds = new ArrayList<String>();
  private List<BuTimeOffLimitReference> timeOffLimits = new ArrayList<BuTimeOffLimitReference>();

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
  private HrisTimeOffType hrisTimeOffType = null;
  private Boolean enabled = null;
  private Boolean countAgainstTimeOffLimits = null;
  private TimeOffPlanBusinessUnitAssociation businessUnitAssociation = null;
  private TimeOffPlanManagementUnitAssociation managementUnitAssociation = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of this time-off plan
   **/
  public BuTimeOffPlanResponse name(String name) {
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
   * The IDs of activity codes associated with this time-off plan
   **/
  public BuTimeOffPlanResponse activityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of activity codes associated with this time-off plan")
  @JsonProperty("activityCodeIds")
  public List<String> getActivityCodeIds() {
    return activityCodeIds;
  }
  public void setActivityCodeIds(List<String> activityCodeIds) {
    this.activityCodeIds = activityCodeIds;
  }


  /**
   * The IDs of time-off limits associated with this time-off plan
   **/
  public BuTimeOffPlanResponse timeOffLimits(List<BuTimeOffLimitReference> timeOffLimits) {
    this.timeOffLimits = timeOffLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of time-off limits associated with this time-off plan")
  @JsonProperty("timeOffLimits")
  public List<BuTimeOffLimitReference> getTimeOffLimits() {
    return timeOffLimits;
  }
  public void setTimeOffLimits(List<BuTimeOffLimitReference> timeOffLimits) {
    this.timeOffLimits = timeOffLimits;
  }


  /**
   * Auto approval rule for this time-off plan
   **/
  public BuTimeOffPlanResponse autoApprovalRule(AutoApprovalRuleEnum autoApprovalRule) {
    this.autoApprovalRule = autoApprovalRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Auto approval rule for this time-off plan")
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
  public BuTimeOffPlanResponse daysBeforeStartToExpireFromWaitlist(Integer daysBeforeStartToExpireFromWaitlist) {
    this.daysBeforeStartToExpireFromWaitlist = daysBeforeStartToExpireFromWaitlist;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of days before the time-off request start date for when the request will be expired from the waitlist")
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
  public BuTimeOffPlanResponse hrisTimeOffType(HrisTimeOffType hrisTimeOffType) {
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
   * Whether this time-off plan is currently being used by agents
   **/
  public BuTimeOffPlanResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this time-off plan is currently being used by agents")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Whether this time-off plan counts against time-off limits
   **/
  public BuTimeOffPlanResponse countAgainstTimeOffLimits(Boolean countAgainstTimeOffLimits) {
    this.countAgainstTimeOffLimits = countAgainstTimeOffLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this time-off plan counts against time-off limits")
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
  public BuTimeOffPlanResponse businessUnitAssociation(TimeOffPlanBusinessUnitAssociation businessUnitAssociation) {
    this.businessUnitAssociation = businessUnitAssociation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Business unit association, if the time-off plan belongs to a business unit. managementUnitAssociation must not be set if this is populated")
  @JsonProperty("businessUnitAssociation")
  public TimeOffPlanBusinessUnitAssociation getBusinessUnitAssociation() {
    return businessUnitAssociation;
  }
  public void setBusinessUnitAssociation(TimeOffPlanBusinessUnitAssociation businessUnitAssociation) {
    this.businessUnitAssociation = businessUnitAssociation;
  }


  /**
   * Management Unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated
   **/
  public BuTimeOffPlanResponse managementUnitAssociation(TimeOffPlanManagementUnitAssociation managementUnitAssociation) {
    this.managementUnitAssociation = managementUnitAssociation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Management Unit association, if the time-off plan belongs to a management unit. businessUnitAssociation must not be set if this is populated")
  @JsonProperty("managementUnitAssociation")
  public TimeOffPlanManagementUnitAssociation getManagementUnitAssociation() {
    return managementUnitAssociation;
  }
  public void setManagementUnitAssociation(TimeOffPlanManagementUnitAssociation managementUnitAssociation) {
    this.managementUnitAssociation = managementUnitAssociation;
  }


  /**
   * Version metadata for the time-off plan
   **/
  public BuTimeOffPlanResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the time-off plan")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuTimeOffPlanResponse buTimeOffPlanResponse = (BuTimeOffPlanResponse) o;

    return Objects.equals(this.id, buTimeOffPlanResponse.id) &&
            Objects.equals(this.name, buTimeOffPlanResponse.name) &&
            Objects.equals(this.activityCodeIds, buTimeOffPlanResponse.activityCodeIds) &&
            Objects.equals(this.timeOffLimits, buTimeOffPlanResponse.timeOffLimits) &&
            Objects.equals(this.autoApprovalRule, buTimeOffPlanResponse.autoApprovalRule) &&
            Objects.equals(this.daysBeforeStartToExpireFromWaitlist, buTimeOffPlanResponse.daysBeforeStartToExpireFromWaitlist) &&
            Objects.equals(this.hrisTimeOffType, buTimeOffPlanResponse.hrisTimeOffType) &&
            Objects.equals(this.enabled, buTimeOffPlanResponse.enabled) &&
            Objects.equals(this.countAgainstTimeOffLimits, buTimeOffPlanResponse.countAgainstTimeOffLimits) &&
            Objects.equals(this.businessUnitAssociation, buTimeOffPlanResponse.businessUnitAssociation) &&
            Objects.equals(this.managementUnitAssociation, buTimeOffPlanResponse.managementUnitAssociation) &&
            Objects.equals(this.metadata, buTimeOffPlanResponse.metadata) &&
            Objects.equals(this.selfUri, buTimeOffPlanResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, activityCodeIds, timeOffLimits, autoApprovalRule, daysBeforeStartToExpireFromWaitlist, hrisTimeOffType, enabled, countAgainstTimeOffLimits, businessUnitAssociation, managementUnitAssociation, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuTimeOffPlanResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityCodeIds: ").append(toIndentedString(activityCodeIds)).append("\n");
    sb.append("    timeOffLimits: ").append(toIndentedString(timeOffLimits)).append("\n");
    sb.append("    autoApprovalRule: ").append(toIndentedString(autoApprovalRule)).append("\n");
    sb.append("    daysBeforeStartToExpireFromWaitlist: ").append(toIndentedString(daysBeforeStartToExpireFromWaitlist)).append("\n");
    sb.append("    hrisTimeOffType: ").append(toIndentedString(hrisTimeOffType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    countAgainstTimeOffLimits: ").append(toIndentedString(countAgainstTimeOffLimits)).append("\n");
    sb.append("    businessUnitAssociation: ").append(toIndentedString(businessUnitAssociation)).append("\n");
    sb.append("    managementUnitAssociation: ").append(toIndentedString(managementUnitAssociation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

