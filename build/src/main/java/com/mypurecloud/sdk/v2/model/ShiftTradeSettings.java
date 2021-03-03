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
import com.mypurecloud.sdk.v2.model.ShiftTradeActivityRule;
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
  private List<ShiftTradeActivityRule> activityCategoryRules = new ArrayList<ShiftTradeActivityRule>();

  
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
        Objects.equals(this.activityCategoryRules, shiftTradeSettings.activityCategoryRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, autoReview, allowDirectTrades, minHoursInFuture, unequalPaid, oneSided, weeklyMinPaidViolations, weeklyMaxPaidViolations, requiresMatchingQueues, requiresMatchingLanguages, requiresMatchingSkills, requiresMatchingPlanningGroups, activityCategoryRules);
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

