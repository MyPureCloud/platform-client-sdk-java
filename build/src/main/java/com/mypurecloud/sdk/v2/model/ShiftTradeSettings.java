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
import com.mypurecloud.sdk.v2.model.ShiftTradeActivityRule;
import com.mypurecloud.sdk.v2.model.ShiftTradeExternalActivityRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ShiftTradeSettings
 */

public class ShiftTradeSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean autoReview = null;
  private Boolean allowDirectTrades = null;
  private Integer minHoursInFuture = null;

  private static class UnequalPaidEnumDeserializer extends StdDeserializer<UnequalPaidEnum> {
    public UnequalPaidEnumDeserializer() {
      super(UnequalPaidEnumDeserializer.class);
    }

    @Override
    public UnequalPaidEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnequalPaidEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to handle shift trades which involve unequal paid times
   */
 @JsonDeserialize(using = UnequalPaidEnumDeserializer.class)
  public enum UnequalPaidEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("Allow"),
    DISALLOW("Disallow"),
    ADMINREVIEW("AdminReview");

    private String value;

    UnequalPaidEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnequalPaidEnum fromString(String key) {
      if (key == null) return null;

      for (UnequalPaidEnum value : UnequalPaidEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnequalPaidEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnequalPaidEnum unequalPaid = null;

  private static class OneSidedEnumDeserializer extends StdDeserializer<OneSidedEnum> {
    public OneSidedEnumDeserializer() {
      super(OneSidedEnumDeserializer.class);
    }

    @Override
    public OneSidedEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OneSidedEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to handle one-sided shift trades
   */
 @JsonDeserialize(using = OneSidedEnumDeserializer.class)
  public enum OneSidedEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("Allow"),
    DISALLOW("Disallow"),
    ADMINREVIEW("AdminReview");

    private String value;

    OneSidedEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OneSidedEnum fromString(String key) {
      if (key == null) return null;

      for (OneSidedEnum value : OneSidedEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OneSidedEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OneSidedEnum oneSided = null;

  private static class WeeklyMinPaidViolationsEnumDeserializer extends StdDeserializer<WeeklyMinPaidViolationsEnum> {
    public WeeklyMinPaidViolationsEnumDeserializer() {
      super(WeeklyMinPaidViolationsEnumDeserializer.class);
    }

    @Override
    public WeeklyMinPaidViolationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WeeklyMinPaidViolationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to handle shift trades which result in violations of weekly minimum paid time constraint
   */
 @JsonDeserialize(using = WeeklyMinPaidViolationsEnumDeserializer.class)
  public enum WeeklyMinPaidViolationsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("Allow"),
    DISALLOW("Disallow"),
    ADMINREVIEW("AdminReview");

    private String value;

    WeeklyMinPaidViolationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WeeklyMinPaidViolationsEnum fromString(String key) {
      if (key == null) return null;

      for (WeeklyMinPaidViolationsEnum value : WeeklyMinPaidViolationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WeeklyMinPaidViolationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WeeklyMinPaidViolationsEnum weeklyMinPaidViolations = null;

  private static class WeeklyMaxPaidViolationsEnumDeserializer extends StdDeserializer<WeeklyMaxPaidViolationsEnum> {
    public WeeklyMaxPaidViolationsEnumDeserializer() {
      super(WeeklyMaxPaidViolationsEnumDeserializer.class);
    }

    @Override
    public WeeklyMaxPaidViolationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WeeklyMaxPaidViolationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to handle shift trades which result in violations of weekly maximum paid time constraint
   */
 @JsonDeserialize(using = WeeklyMaxPaidViolationsEnumDeserializer.class)
  public enum WeeklyMaxPaidViolationsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("Allow"),
    DISALLOW("Disallow"),
    ADMINREVIEW("AdminReview");

    private String value;

    WeeklyMaxPaidViolationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WeeklyMaxPaidViolationsEnum fromString(String key) {
      if (key == null) return null;

      for (WeeklyMaxPaidViolationsEnum value : WeeklyMaxPaidViolationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WeeklyMaxPaidViolationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WeeklyMaxPaidViolationsEnum weeklyMaxPaidViolations = null;
  private Boolean requiresMatchingQueues = null;
  private Boolean requiresMatchingLanguages = null;
  private Boolean requiresMatchingSkills = null;
  private Boolean requiresMatchingPlanningGroups = null;
  private List<ShiftTradeActivityRule> activityCategoryRules = null;
  private List<ShiftTradeExternalActivityRule> externalActivityRules = null;
  private Boolean externalActivityRuleIgnoresActivityCategoryRule = null;
  private Integer maxTradeSpanWeeks = null;
  private Integer maxTradesPerAgentPerWeek = null;
  private Integer minMinutesBetweenShifts = null;

  private static class PlanningPeriodMinPaidViolationsEnumDeserializer extends StdDeserializer<PlanningPeriodMinPaidViolationsEnum> {
    public PlanningPeriodMinPaidViolationsEnumDeserializer() {
      super(PlanningPeriodMinPaidViolationsEnumDeserializer.class);
    }

    @Override
    public PlanningPeriodMinPaidViolationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PlanningPeriodMinPaidViolationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to handle shift trades which result in violations of planning period minimum paid time constraint
   */
 @JsonDeserialize(using = PlanningPeriodMinPaidViolationsEnumDeserializer.class)
  public enum PlanningPeriodMinPaidViolationsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("Allow"),
    DISALLOW("Disallow"),
    ADMINREVIEW("AdminReview");

    private String value;

    PlanningPeriodMinPaidViolationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PlanningPeriodMinPaidViolationsEnum fromString(String key) {
      if (key == null) return null;

      for (PlanningPeriodMinPaidViolationsEnum value : PlanningPeriodMinPaidViolationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PlanningPeriodMinPaidViolationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PlanningPeriodMinPaidViolationsEnum planningPeriodMinPaidViolations = null;

  private static class PlanningPeriodMaxPaidViolationsEnumDeserializer extends StdDeserializer<PlanningPeriodMaxPaidViolationsEnum> {
    public PlanningPeriodMaxPaidViolationsEnumDeserializer() {
      super(PlanningPeriodMaxPaidViolationsEnumDeserializer.class);
    }

    @Override
    public PlanningPeriodMaxPaidViolationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PlanningPeriodMaxPaidViolationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to handle shift trades which result in violations of planning period maximum paid time constraint
   */
 @JsonDeserialize(using = PlanningPeriodMaxPaidViolationsEnumDeserializer.class)
  public enum PlanningPeriodMaxPaidViolationsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("Allow"),
    DISALLOW("Disallow"),
    ADMINREVIEW("AdminReview");

    private String value;

    PlanningPeriodMaxPaidViolationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PlanningPeriodMaxPaidViolationsEnum fromString(String key) {
      if (key == null) return null;

      for (PlanningPeriodMaxPaidViolationsEnum value : PlanningPeriodMaxPaidViolationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PlanningPeriodMaxPaidViolationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PlanningPeriodMaxPaidViolationsEnum planningPeriodMaxPaidViolations = null;

  private static class MinMinutesBetweenShiftsViolationsEnumDeserializer extends StdDeserializer<MinMinutesBetweenShiftsViolationsEnum> {
    public MinMinutesBetweenShiftsViolationsEnumDeserializer() {
      super(MinMinutesBetweenShiftsViolationsEnumDeserializer.class);
    }

    @Override
    public MinMinutesBetweenShiftsViolationsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MinMinutesBetweenShiftsViolationsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to handle shift trades which result in violations of minimum number of minutes between shifts constraint
   */
 @JsonDeserialize(using = MinMinutesBetweenShiftsViolationsEnumDeserializer.class)
  public enum MinMinutesBetweenShiftsViolationsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("Allow"),
    DISALLOW("Disallow"),
    ADMINREVIEW("AdminReview");

    private String value;

    MinMinutesBetweenShiftsViolationsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MinMinutesBetweenShiftsViolationsEnum fromString(String key) {
      if (key == null) return null;

      for (MinMinutesBetweenShiftsViolationsEnum value : MinMinutesBetweenShiftsViolationsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MinMinutesBetweenShiftsViolationsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MinMinutesBetweenShiftsViolationsEnum minMinutesBetweenShiftsViolations = null;

  public ShiftTradeSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activityCategoryRules = new ArrayList<ShiftTradeActivityRule>();
      externalActivityRules = new ArrayList<ShiftTradeExternalActivityRule>();
    }
  }

  
  /**
   * Whether shift trading is enabled for this management unit
   **/
  public ShiftTradeSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether shift trading is enabled for this management unit")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Whether automatic shift trade review is enabled according to the rules defined in for this management unit
   **/
  public ShiftTradeSettings autoReview(Boolean autoReview) {
    this.autoReview = autoReview;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether automatic shift trade review is enabled according to the rules defined in for this management unit")
  @JsonProperty("autoReview")
  public Boolean getAutoReview() {
    return autoReview;
  }
  public void setAutoReview(Boolean autoReview) {
    this.autoReview = autoReview;
  }


  /**
   * Whether direct shift trades between agents are allowed
   **/
  public ShiftTradeSettings allowDirectTrades(Boolean allowDirectTrades) {
    this.allowDirectTrades = allowDirectTrades;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether direct shift trades between agents are allowed")
  @JsonProperty("allowDirectTrades")
  public Boolean getAllowDirectTrades() {
    return allowDirectTrades;
  }
  public void setAllowDirectTrades(Boolean allowDirectTrades) {
    this.allowDirectTrades = allowDirectTrades;
  }


  /**
   * The minimum number of hours in the future shift trades are allowed
   **/
  public ShiftTradeSettings minHoursInFuture(Integer minHoursInFuture) {
    this.minHoursInFuture = minHoursInFuture;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum number of hours in the future shift trades are allowed")
  @JsonProperty("minHoursInFuture")
  public Integer getMinHoursInFuture() {
    return minHoursInFuture;
  }
  public void setMinHoursInFuture(Integer minHoursInFuture) {
    this.minHoursInFuture = minHoursInFuture;
  }


  /**
   * How to handle shift trades which involve unequal paid times
   **/
  public ShiftTradeSettings unequalPaid(UnequalPaidEnum unequalPaid) {
    this.unequalPaid = unequalPaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to handle shift trades which involve unequal paid times")
  @JsonProperty("unequalPaid")
  public UnequalPaidEnum getUnequalPaid() {
    return unequalPaid;
  }
  public void setUnequalPaid(UnequalPaidEnum unequalPaid) {
    this.unequalPaid = unequalPaid;
  }


  /**
   * How to handle one-sided shift trades
   **/
  public ShiftTradeSettings oneSided(OneSidedEnum oneSided) {
    this.oneSided = oneSided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to handle one-sided shift trades")
  @JsonProperty("oneSided")
  public OneSidedEnum getOneSided() {
    return oneSided;
  }
  public void setOneSided(OneSidedEnum oneSided) {
    this.oneSided = oneSided;
  }


  /**
   * How to handle shift trades which result in violations of weekly minimum paid time constraint
   **/
  public ShiftTradeSettings weeklyMinPaidViolations(WeeklyMinPaidViolationsEnum weeklyMinPaidViolations) {
    this.weeklyMinPaidViolations = weeklyMinPaidViolations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to handle shift trades which result in violations of weekly minimum paid time constraint")
  @JsonProperty("weeklyMinPaidViolations")
  public WeeklyMinPaidViolationsEnum getWeeklyMinPaidViolations() {
    return weeklyMinPaidViolations;
  }
  public void setWeeklyMinPaidViolations(WeeklyMinPaidViolationsEnum weeklyMinPaidViolations) {
    this.weeklyMinPaidViolations = weeklyMinPaidViolations;
  }


  /**
   * How to handle shift trades which result in violations of weekly maximum paid time constraint
   **/
  public ShiftTradeSettings weeklyMaxPaidViolations(WeeklyMaxPaidViolationsEnum weeklyMaxPaidViolations) {
    this.weeklyMaxPaidViolations = weeklyMaxPaidViolations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to handle shift trades which result in violations of weekly maximum paid time constraint")
  @JsonProperty("weeklyMaxPaidViolations")
  public WeeklyMaxPaidViolationsEnum getWeeklyMaxPaidViolations() {
    return weeklyMaxPaidViolations;
  }
  public void setWeeklyMaxPaidViolations(WeeklyMaxPaidViolationsEnum weeklyMaxPaidViolations) {
    this.weeklyMaxPaidViolations = weeklyMaxPaidViolations;
  }


  /**
   * Whether to constrain shift trades to agents with matching queues
   **/
  public ShiftTradeSettings requiresMatchingQueues(Boolean requiresMatchingQueues) {
    this.requiresMatchingQueues = requiresMatchingQueues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to constrain shift trades to agents with matching queues")
  @JsonProperty("requiresMatchingQueues")
  public Boolean getRequiresMatchingQueues() {
    return requiresMatchingQueues;
  }
  public void setRequiresMatchingQueues(Boolean requiresMatchingQueues) {
    this.requiresMatchingQueues = requiresMatchingQueues;
  }


  /**
   * Whether to constrain shift trades to agents with matching languages
   **/
  public ShiftTradeSettings requiresMatchingLanguages(Boolean requiresMatchingLanguages) {
    this.requiresMatchingLanguages = requiresMatchingLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to constrain shift trades to agents with matching languages")
  @JsonProperty("requiresMatchingLanguages")
  public Boolean getRequiresMatchingLanguages() {
    return requiresMatchingLanguages;
  }
  public void setRequiresMatchingLanguages(Boolean requiresMatchingLanguages) {
    this.requiresMatchingLanguages = requiresMatchingLanguages;
  }


  /**
   * Whether to constrain shift trades to agents with matching skills
   **/
  public ShiftTradeSettings requiresMatchingSkills(Boolean requiresMatchingSkills) {
    this.requiresMatchingSkills = requiresMatchingSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to constrain shift trades to agents with matching skills")
  @JsonProperty("requiresMatchingSkills")
  public Boolean getRequiresMatchingSkills() {
    return requiresMatchingSkills;
  }
  public void setRequiresMatchingSkills(Boolean requiresMatchingSkills) {
    this.requiresMatchingSkills = requiresMatchingSkills;
  }


  /**
   * Whether to constrain shift trades to agents with matching planning groups
   **/
  public ShiftTradeSettings requiresMatchingPlanningGroups(Boolean requiresMatchingPlanningGroups) {
    this.requiresMatchingPlanningGroups = requiresMatchingPlanningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to constrain shift trades to agents with matching planning groups")
  @JsonProperty("requiresMatchingPlanningGroups")
  public Boolean getRequiresMatchingPlanningGroups() {
    return requiresMatchingPlanningGroups;
  }
  public void setRequiresMatchingPlanningGroups(Boolean requiresMatchingPlanningGroups) {
    this.requiresMatchingPlanningGroups = requiresMatchingPlanningGroups;
  }


  /**
   * Rules that specify what to do with activity categories that are part of a shift defined in a trade
   **/
  public ShiftTradeSettings activityCategoryRules(List<ShiftTradeActivityRule> activityCategoryRules) {
    this.activityCategoryRules = activityCategoryRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rules that specify what to do with activity categories that are part of a shift defined in a trade")
  @JsonProperty("activityCategoryRules")
  public List<ShiftTradeActivityRule> getActivityCategoryRules() {
    return activityCategoryRules;
  }
  public void setActivityCategoryRules(List<ShiftTradeActivityRule> activityCategoryRules) {
    this.activityCategoryRules = activityCategoryRules;
  }


  /**
   * Rules that specify what to do with external activities that are part of a shift
   **/
  public ShiftTradeSettings externalActivityRules(List<ShiftTradeExternalActivityRule> externalActivityRules) {
    this.externalActivityRules = externalActivityRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rules that specify what to do with external activities that are part of a shift")
  @JsonProperty("externalActivityRules")
  public List<ShiftTradeExternalActivityRule> getExternalActivityRules() {
    return externalActivityRules;
  }
  public void setExternalActivityRules(List<ShiftTradeExternalActivityRule> externalActivityRules) {
    this.externalActivityRules = externalActivityRules;
  }


  /**
   * Whether external activity rules ignore activity category rules
   **/
  public ShiftTradeSettings externalActivityRuleIgnoresActivityCategoryRule(Boolean externalActivityRuleIgnoresActivityCategoryRule) {
    this.externalActivityRuleIgnoresActivityCategoryRule = externalActivityRuleIgnoresActivityCategoryRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether external activity rules ignore activity category rules")
  @JsonProperty("externalActivityRuleIgnoresActivityCategoryRule")
  public Boolean getExternalActivityRuleIgnoresActivityCategoryRule() {
    return externalActivityRuleIgnoresActivityCategoryRule;
  }
  public void setExternalActivityRuleIgnoresActivityCategoryRule(Boolean externalActivityRuleIgnoresActivityCategoryRule) {
    this.externalActivityRuleIgnoresActivityCategoryRule = externalActivityRuleIgnoresActivityCategoryRule;
  }


  /**
   * The maximum number of weeks a shift trade can span
   **/
  public ShiftTradeSettings maxTradeSpanWeeks(Integer maxTradeSpanWeeks) {
    this.maxTradeSpanWeeks = maxTradeSpanWeeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of weeks a shift trade can span")
  @JsonProperty("maxTradeSpanWeeks")
  public Integer getMaxTradeSpanWeeks() {
    return maxTradeSpanWeeks;
  }
  public void setMaxTradeSpanWeeks(Integer maxTradeSpanWeeks) {
    this.maxTradeSpanWeeks = maxTradeSpanWeeks;
  }


  /**
   * The maximum number of shift trades an agent can submit per week
   **/
  public ShiftTradeSettings maxTradesPerAgentPerWeek(Integer maxTradesPerAgentPerWeek) {
    this.maxTradesPerAgentPerWeek = maxTradesPerAgentPerWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of shift trades an agent can submit per week")
  @JsonProperty("maxTradesPerAgentPerWeek")
  public Integer getMaxTradesPerAgentPerWeek() {
    return maxTradesPerAgentPerWeek;
  }
  public void setMaxTradesPerAgentPerWeek(Integer maxTradesPerAgentPerWeek) {
    this.maxTradesPerAgentPerWeek = maxTradesPerAgentPerWeek;
  }


  /**
   * The minimum number of minutes between shifts
   **/
  public ShiftTradeSettings minMinutesBetweenShifts(Integer minMinutesBetweenShifts) {
    this.minMinutesBetweenShifts = minMinutesBetweenShifts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum number of minutes between shifts")
  @JsonProperty("minMinutesBetweenShifts")
  public Integer getMinMinutesBetweenShifts() {
    return minMinutesBetweenShifts;
  }
  public void setMinMinutesBetweenShifts(Integer minMinutesBetweenShifts) {
    this.minMinutesBetweenShifts = minMinutesBetweenShifts;
  }


  /**
   * How to handle shift trades which result in violations of planning period minimum paid time constraint
   **/
  public ShiftTradeSettings planningPeriodMinPaidViolations(PlanningPeriodMinPaidViolationsEnum planningPeriodMinPaidViolations) {
    this.planningPeriodMinPaidViolations = planningPeriodMinPaidViolations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to handle shift trades which result in violations of planning period minimum paid time constraint")
  @JsonProperty("planningPeriodMinPaidViolations")
  public PlanningPeriodMinPaidViolationsEnum getPlanningPeriodMinPaidViolations() {
    return planningPeriodMinPaidViolations;
  }
  public void setPlanningPeriodMinPaidViolations(PlanningPeriodMinPaidViolationsEnum planningPeriodMinPaidViolations) {
    this.planningPeriodMinPaidViolations = planningPeriodMinPaidViolations;
  }


  /**
   * How to handle shift trades which result in violations of planning period maximum paid time constraint
   **/
  public ShiftTradeSettings planningPeriodMaxPaidViolations(PlanningPeriodMaxPaidViolationsEnum planningPeriodMaxPaidViolations) {
    this.planningPeriodMaxPaidViolations = planningPeriodMaxPaidViolations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to handle shift trades which result in violations of planning period maximum paid time constraint")
  @JsonProperty("planningPeriodMaxPaidViolations")
  public PlanningPeriodMaxPaidViolationsEnum getPlanningPeriodMaxPaidViolations() {
    return planningPeriodMaxPaidViolations;
  }
  public void setPlanningPeriodMaxPaidViolations(PlanningPeriodMaxPaidViolationsEnum planningPeriodMaxPaidViolations) {
    this.planningPeriodMaxPaidViolations = planningPeriodMaxPaidViolations;
  }


  /**
   * How to handle shift trades which result in violations of minimum number of minutes between shifts constraint
   **/
  public ShiftTradeSettings minMinutesBetweenShiftsViolations(MinMinutesBetweenShiftsViolationsEnum minMinutesBetweenShiftsViolations) {
    this.minMinutesBetweenShiftsViolations = minMinutesBetweenShiftsViolations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to handle shift trades which result in violations of minimum number of minutes between shifts constraint")
  @JsonProperty("minMinutesBetweenShiftsViolations")
  public MinMinutesBetweenShiftsViolationsEnum getMinMinutesBetweenShiftsViolations() {
    return minMinutesBetweenShiftsViolations;
  }
  public void setMinMinutesBetweenShiftsViolations(MinMinutesBetweenShiftsViolationsEnum minMinutesBetweenShiftsViolations) {
    this.minMinutesBetweenShiftsViolations = minMinutesBetweenShiftsViolations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeSettings shiftTradeSettings = (ShiftTradeSettings) o;

    return Objects.equals(this.enabled, shiftTradeSettings.enabled) &&
            Objects.equals(this.autoReview, shiftTradeSettings.autoReview) &&
            Objects.equals(this.allowDirectTrades, shiftTradeSettings.allowDirectTrades) &&
            Objects.equals(this.minHoursInFuture, shiftTradeSettings.minHoursInFuture) &&
            Objects.equals(this.unequalPaid, shiftTradeSettings.unequalPaid) &&
            Objects.equals(this.oneSided, shiftTradeSettings.oneSided) &&
            Objects.equals(this.weeklyMinPaidViolations, shiftTradeSettings.weeklyMinPaidViolations) &&
            Objects.equals(this.weeklyMaxPaidViolations, shiftTradeSettings.weeklyMaxPaidViolations) &&
            Objects.equals(this.requiresMatchingQueues, shiftTradeSettings.requiresMatchingQueues) &&
            Objects.equals(this.requiresMatchingLanguages, shiftTradeSettings.requiresMatchingLanguages) &&
            Objects.equals(this.requiresMatchingSkills, shiftTradeSettings.requiresMatchingSkills) &&
            Objects.equals(this.requiresMatchingPlanningGroups, shiftTradeSettings.requiresMatchingPlanningGroups) &&
            Objects.equals(this.activityCategoryRules, shiftTradeSettings.activityCategoryRules) &&
            Objects.equals(this.externalActivityRules, shiftTradeSettings.externalActivityRules) &&
            Objects.equals(this.externalActivityRuleIgnoresActivityCategoryRule, shiftTradeSettings.externalActivityRuleIgnoresActivityCategoryRule) &&
            Objects.equals(this.maxTradeSpanWeeks, shiftTradeSettings.maxTradeSpanWeeks) &&
            Objects.equals(this.maxTradesPerAgentPerWeek, shiftTradeSettings.maxTradesPerAgentPerWeek) &&
            Objects.equals(this.minMinutesBetweenShifts, shiftTradeSettings.minMinutesBetweenShifts) &&
            Objects.equals(this.planningPeriodMinPaidViolations, shiftTradeSettings.planningPeriodMinPaidViolations) &&
            Objects.equals(this.planningPeriodMaxPaidViolations, shiftTradeSettings.planningPeriodMaxPaidViolations) &&
            Objects.equals(this.minMinutesBetweenShiftsViolations, shiftTradeSettings.minMinutesBetweenShiftsViolations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, autoReview, allowDirectTrades, minHoursInFuture, unequalPaid, oneSided, weeklyMinPaidViolations, weeklyMaxPaidViolations, requiresMatchingQueues, requiresMatchingLanguages, requiresMatchingSkills, requiresMatchingPlanningGroups, activityCategoryRules, externalActivityRules, externalActivityRuleIgnoresActivityCategoryRule, maxTradeSpanWeeks, maxTradesPerAgentPerWeek, minMinutesBetweenShifts, planningPeriodMinPaidViolations, planningPeriodMaxPaidViolations, minMinutesBetweenShiftsViolations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    autoReview: ").append(toIndentedString(autoReview)).append("\n");
    sb.append("    allowDirectTrades: ").append(toIndentedString(allowDirectTrades)).append("\n");
    sb.append("    minHoursInFuture: ").append(toIndentedString(minHoursInFuture)).append("\n");
    sb.append("    unequalPaid: ").append(toIndentedString(unequalPaid)).append("\n");
    sb.append("    oneSided: ").append(toIndentedString(oneSided)).append("\n");
    sb.append("    weeklyMinPaidViolations: ").append(toIndentedString(weeklyMinPaidViolations)).append("\n");
    sb.append("    weeklyMaxPaidViolations: ").append(toIndentedString(weeklyMaxPaidViolations)).append("\n");
    sb.append("    requiresMatchingQueues: ").append(toIndentedString(requiresMatchingQueues)).append("\n");
    sb.append("    requiresMatchingLanguages: ").append(toIndentedString(requiresMatchingLanguages)).append("\n");
    sb.append("    requiresMatchingSkills: ").append(toIndentedString(requiresMatchingSkills)).append("\n");
    sb.append("    requiresMatchingPlanningGroups: ").append(toIndentedString(requiresMatchingPlanningGroups)).append("\n");
    sb.append("    activityCategoryRules: ").append(toIndentedString(activityCategoryRules)).append("\n");
    sb.append("    externalActivityRules: ").append(toIndentedString(externalActivityRules)).append("\n");
    sb.append("    externalActivityRuleIgnoresActivityCategoryRule: ").append(toIndentedString(externalActivityRuleIgnoresActivityCategoryRule)).append("\n");
    sb.append("    maxTradeSpanWeeks: ").append(toIndentedString(maxTradeSpanWeeks)).append("\n");
    sb.append("    maxTradesPerAgentPerWeek: ").append(toIndentedString(maxTradesPerAgentPerWeek)).append("\n");
    sb.append("    minMinutesBetweenShifts: ").append(toIndentedString(minMinutesBetweenShifts)).append("\n");
    sb.append("    planningPeriodMinPaidViolations: ").append(toIndentedString(planningPeriodMinPaidViolations)).append("\n");
    sb.append("    planningPeriodMaxPaidViolations: ").append(toIndentedString(planningPeriodMaxPaidViolations)).append("\n");
    sb.append("    minMinutesBetweenShiftsViolations: ").append(toIndentedString(minMinutesBetweenShiftsViolations)).append("\n");
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

