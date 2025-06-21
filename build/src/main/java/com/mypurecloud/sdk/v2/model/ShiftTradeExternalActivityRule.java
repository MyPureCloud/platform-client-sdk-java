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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ShiftTradeExternalActivityRule
 */

public class ShiftTradeExternalActivityRule  implements Serializable {
  

  private static class ExternalActivityTypeEnumDeserializer extends StdDeserializer<ExternalActivityTypeEnum> {
    public ExternalActivityTypeEnumDeserializer() {
      super(ExternalActivityTypeEnumDeserializer.class);
    }

    @Override
    public ExternalActivityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExternalActivityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The external activity type to which to apply this rule
   */
 @JsonDeserialize(using = ExternalActivityTypeEnumDeserializer.class)
  public enum ExternalActivityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVITYPLAN("ActivityPlan"),
    COACHING("Coaching"),
    LEARNING("Learning");

    private String value;

    ExternalActivityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExternalActivityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ExternalActivityTypeEnum value : ExternalActivityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExternalActivityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExternalActivityTypeEnum externalActivityType = null;

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
    DONOTALLOWTRADE("DoNotAllowTrade"),
    KEEPWITHAGENT("KeepWithAgent");

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

  public ShiftTradeExternalActivityRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The external activity type to which to apply this rule
   **/
  public ShiftTradeExternalActivityRule externalActivityType(ExternalActivityTypeEnum externalActivityType) {
    this.externalActivityType = externalActivityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external activity type to which to apply this rule")
  @JsonProperty("externalActivityType")
  public ExternalActivityTypeEnum getExternalActivityType() {
    return externalActivityType;
  }
  public void setExternalActivityType(ExternalActivityTypeEnum externalActivityType) {
    this.externalActivityType = externalActivityType;
  }


  /**
   * The action this rule invokes
   **/
  public ShiftTradeExternalActivityRule action(ActionEnum action) {
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
   * The ID of the activity code with which to replace to replace external activities (required if action == KeepWithAgent, must be a default activity code ID)
   **/
  public ShiftTradeExternalActivityRule activityCodeIdReplacement(String activityCodeIdReplacement) {
    this.activityCodeIdReplacement = activityCodeIdReplacement;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code with which to replace to replace external activities (required if action == KeepWithAgent, must be a default activity code ID)")
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
    ShiftTradeExternalActivityRule shiftTradeExternalActivityRule = (ShiftTradeExternalActivityRule) o;

    return Objects.equals(this.externalActivityType, shiftTradeExternalActivityRule.externalActivityType) &&
            Objects.equals(this.action, shiftTradeExternalActivityRule.action) &&
            Objects.equals(this.activityCodeIdReplacement, shiftTradeExternalActivityRule.activityCodeIdReplacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalActivityType, action, activityCodeIdReplacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeExternalActivityRule {\n");
    
    sb.append("    externalActivityType: ").append(toIndentedString(externalActivityType)).append("\n");
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

