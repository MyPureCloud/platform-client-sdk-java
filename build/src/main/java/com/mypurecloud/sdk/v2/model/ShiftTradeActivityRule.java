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

import java.io.Serializable;
/**
 * ShiftTradeActivityRule
 */

public class ShiftTradeActivityRule  implements Serializable {
  

  private static class ActivityCategoryEnumDeserializer extends StdDeserializer<ActivityCategoryEnum> {
    public ActivityCategoryEnumDeserializer() {
      super(ActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The activity category to which to apply this rule
   */
 @JsonDeserialize(using = ActivityCategoryEnumDeserializer.class)
  public enum ActivityCategoryEnum {
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

    ActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ActivityCategoryEnum value : ActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivityCategoryEnum activityCategory = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The action this rule invokes
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REPLACE("Replace"),
    DONOTALLOWTRADE("DoNotAllowTrade"),
    KEEPWITHSCHEDULE("KeepWithSchedule");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;
  private String activityCodeIdReplacement = null;

  
  /**
   * The activity category to which to apply this rule
   **/
  public ShiftTradeActivityRule activityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity category to which to apply this rule")
  @JsonProperty("activityCategory")
  public ActivityCategoryEnum getActivityCategory() {
    return activityCategory;
  }
  public void setActivityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
  }

  
  /**
   * The action this rule invokes
   **/
  public ShiftTradeActivityRule action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action this rule invokes")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * The activity code ID with which to replace activities belonging to the original category if applicable (required if action == Replace, must be a default activity code ID)
   **/
  public ShiftTradeActivityRule activityCodeIdReplacement(String activityCodeIdReplacement) {
    this.activityCodeIdReplacement = activityCodeIdReplacement;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activity code ID with which to replace activities belonging to the original category if applicable (required if action == Replace, must be a default activity code ID)")
  @JsonProperty("activityCodeIdReplacement")
  public String getActivityCodeIdReplacement() {
    return activityCodeIdReplacement;
  }
  public void setActivityCodeIdReplacement(String activityCodeIdReplacement) {
    this.activityCodeIdReplacement = activityCodeIdReplacement;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeActivityRule shiftTradeActivityRule = (ShiftTradeActivityRule) o;
    return Objects.equals(this.activityCategory, shiftTradeActivityRule.activityCategory) &&
        Objects.equals(this.action, shiftTradeActivityRule.action) &&
        Objects.equals(this.activityCodeIdReplacement, shiftTradeActivityRule.activityCodeIdReplacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCategory, action, activityCodeIdReplacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeActivityRule {\n");
    
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activityCodeIdReplacement: ").append(toIndentedString(activityCodeIdReplacement)).append("\n");
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

