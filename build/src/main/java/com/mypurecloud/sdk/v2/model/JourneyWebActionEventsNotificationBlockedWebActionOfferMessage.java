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
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationActionMap;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationActionMapPageUrlCondition;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationActionTarget;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationEmergencyGroup;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationEventAction;
import com.mypurecloud.sdk.v2.model.JourneyWebActionEventsNotificationScheduleGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyWebActionEventsNotificationBlockedWebActionOfferMessage
 */

public class JourneyWebActionEventsNotificationBlockedWebActionOfferMessage  implements Serializable {
  
  private JourneyWebActionEventsNotificationEventAction action = null;
  private JourneyWebActionEventsNotificationActionMap actionMap = null;
  private JourneyWebActionEventsNotificationActionTarget actionTarget = null;

  private static class BlockingReasonEnumDeserializer extends StdDeserializer<BlockingReasonEnum> {
    public BlockingReasonEnumDeserializer() {
      super(BlockingReasonEnumDeserializer.class);
    }

    @Override
    public BlockingReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BlockingReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets blockingReason
   */
 @JsonDeserialize(using = BlockingReasonEnumDeserializer.class)
  public enum BlockingReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    PAGEURLCONDITIONSNOTMATCHING("PageUrlConditionsNotMatching"),
    SERVICELEVELTHROTTLING("ServiceLevelThrottling"),
    ALREADYEXISTINGOFFER("AlreadyExistingOffer"),
    TRIGGERDATEINFUTURE("TriggerDateInFuture"),
    MULTIPLESIMULTANEOUSOFFERS("MultipleSimultaneousOffers"),
    NOAVAILABLEAGENTS("NoAvailableAgents"),
    FREQUENCYCAPPING("FrequencyCapping"),
    OFFEREDOUTSIDESCHEDULE("OfferedOutsideSchedule");

    private String value;

    BlockingReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BlockingReasonEnum fromString(String key) {
      if (key == null) return null;

      for (BlockingReasonEnum value : BlockingReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BlockingReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BlockingReasonEnum blockingReason = null;
  private JourneyWebActionEventsNotificationActionMap blockingActionMap = null;
  private JourneyWebActionEventsNotificationEventAction blockingAction = null;

  private static class BlockingFrequencyCapBehaviourEnumDeserializer extends StdDeserializer<BlockingFrequencyCapBehaviourEnum> {
    public BlockingFrequencyCapBehaviourEnumDeserializer() {
      super(BlockingFrequencyCapBehaviourEnumDeserializer.class);
    }

    @Override
    public BlockingFrequencyCapBehaviourEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BlockingFrequencyCapBehaviourEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets blockingFrequencyCapBehaviour
   */
 @JsonDeserialize(using = BlockingFrequencyCapBehaviourEnumDeserializer.class)
  public enum BlockingFrequencyCapBehaviourEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    CAPONCEFINALIZED("CapOnceFinalized"),
    CAPONCEREJECTED("CapOnceRejected"),
    CAPFORPERIOD("CapForPeriod");

    private String value;

    BlockingFrequencyCapBehaviourEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BlockingFrequencyCapBehaviourEnum fromString(String key) {
      if (key == null) return null;

      for (BlockingFrequencyCapBehaviourEnum value : BlockingFrequencyCapBehaviourEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BlockingFrequencyCapBehaviourEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BlockingFrequencyCapBehaviourEnum blockingFrequencyCapBehaviour = null;
  private List<JourneyWebActionEventsNotificationActionMapPageUrlCondition> blockingPageUrlConditions = new ArrayList<JourneyWebActionEventsNotificationActionMapPageUrlCondition>();
  private JourneyWebActionEventsNotificationScheduleGroup blockingScheduleGroup = null;
  private JourneyWebActionEventsNotificationEmergencyGroup blockingEmergencyScheduleGroup = null;

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage action(JourneyWebActionEventsNotificationEventAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("action")
  public JourneyWebActionEventsNotificationEventAction getAction() {
    return action;
  }
  public void setAction(JourneyWebActionEventsNotificationEventAction action) {
    this.action = action;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage actionMap(JourneyWebActionEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public JourneyWebActionEventsNotificationActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(JourneyWebActionEventsNotificationActionMap actionMap) {
    this.actionMap = actionMap;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage actionTarget(JourneyWebActionEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionTarget")
  public JourneyWebActionEventsNotificationActionTarget getActionTarget() {
    return actionTarget;
  }
  public void setActionTarget(JourneyWebActionEventsNotificationActionTarget actionTarget) {
    this.actionTarget = actionTarget;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockingReason(BlockingReasonEnum blockingReason) {
    this.blockingReason = blockingReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockingReason")
  public BlockingReasonEnum getBlockingReason() {
    return blockingReason;
  }
  public void setBlockingReason(BlockingReasonEnum blockingReason) {
    this.blockingReason = blockingReason;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockingActionMap(JourneyWebActionEventsNotificationActionMap blockingActionMap) {
    this.blockingActionMap = blockingActionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockingActionMap")
  public JourneyWebActionEventsNotificationActionMap getBlockingActionMap() {
    return blockingActionMap;
  }
  public void setBlockingActionMap(JourneyWebActionEventsNotificationActionMap blockingActionMap) {
    this.blockingActionMap = blockingActionMap;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockingAction(JourneyWebActionEventsNotificationEventAction blockingAction) {
    this.blockingAction = blockingAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockingAction")
  public JourneyWebActionEventsNotificationEventAction getBlockingAction() {
    return blockingAction;
  }
  public void setBlockingAction(JourneyWebActionEventsNotificationEventAction blockingAction) {
    this.blockingAction = blockingAction;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockingFrequencyCapBehaviour(BlockingFrequencyCapBehaviourEnum blockingFrequencyCapBehaviour) {
    this.blockingFrequencyCapBehaviour = blockingFrequencyCapBehaviour;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockingFrequencyCapBehaviour")
  public BlockingFrequencyCapBehaviourEnum getBlockingFrequencyCapBehaviour() {
    return blockingFrequencyCapBehaviour;
  }
  public void setBlockingFrequencyCapBehaviour(BlockingFrequencyCapBehaviourEnum blockingFrequencyCapBehaviour) {
    this.blockingFrequencyCapBehaviour = blockingFrequencyCapBehaviour;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockingPageUrlConditions(List<JourneyWebActionEventsNotificationActionMapPageUrlCondition> blockingPageUrlConditions) {
    this.blockingPageUrlConditions = blockingPageUrlConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockingPageUrlConditions")
  public List<JourneyWebActionEventsNotificationActionMapPageUrlCondition> getBlockingPageUrlConditions() {
    return blockingPageUrlConditions;
  }
  public void setBlockingPageUrlConditions(List<JourneyWebActionEventsNotificationActionMapPageUrlCondition> blockingPageUrlConditions) {
    this.blockingPageUrlConditions = blockingPageUrlConditions;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockingScheduleGroup(JourneyWebActionEventsNotificationScheduleGroup blockingScheduleGroup) {
    this.blockingScheduleGroup = blockingScheduleGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockingScheduleGroup")
  public JourneyWebActionEventsNotificationScheduleGroup getBlockingScheduleGroup() {
    return blockingScheduleGroup;
  }
  public void setBlockingScheduleGroup(JourneyWebActionEventsNotificationScheduleGroup blockingScheduleGroup) {
    this.blockingScheduleGroup = blockingScheduleGroup;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBlockedWebActionOfferMessage blockingEmergencyScheduleGroup(JourneyWebActionEventsNotificationEmergencyGroup blockingEmergencyScheduleGroup) {
    this.blockingEmergencyScheduleGroup = blockingEmergencyScheduleGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("blockingEmergencyScheduleGroup")
  public JourneyWebActionEventsNotificationEmergencyGroup getBlockingEmergencyScheduleGroup() {
    return blockingEmergencyScheduleGroup;
  }
  public void setBlockingEmergencyScheduleGroup(JourneyWebActionEventsNotificationEmergencyGroup blockingEmergencyScheduleGroup) {
    this.blockingEmergencyScheduleGroup = blockingEmergencyScheduleGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyWebActionEventsNotificationBlockedWebActionOfferMessage journeyWebActionEventsNotificationBlockedWebActionOfferMessage = (JourneyWebActionEventsNotificationBlockedWebActionOfferMessage) o;
    return Objects.equals(this.action, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.action) &&
        Objects.equals(this.actionMap, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.actionMap) &&
        Objects.equals(this.actionTarget, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.actionTarget) &&
        Objects.equals(this.blockingReason, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.blockingReason) &&
        Objects.equals(this.blockingActionMap, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.blockingActionMap) &&
        Objects.equals(this.blockingAction, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.blockingAction) &&
        Objects.equals(this.blockingFrequencyCapBehaviour, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.blockingFrequencyCapBehaviour) &&
        Objects.equals(this.blockingPageUrlConditions, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.blockingPageUrlConditions) &&
        Objects.equals(this.blockingScheduleGroup, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.blockingScheduleGroup) &&
        Objects.equals(this.blockingEmergencyScheduleGroup, journeyWebActionEventsNotificationBlockedWebActionOfferMessage.blockingEmergencyScheduleGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionMap, actionTarget, blockingReason, blockingActionMap, blockingAction, blockingFrequencyCapBehaviour, blockingPageUrlConditions, blockingScheduleGroup, blockingEmergencyScheduleGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebActionEventsNotificationBlockedWebActionOfferMessage {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionMap: ").append(toIndentedString(actionMap)).append("\n");
    sb.append("    actionTarget: ").append(toIndentedString(actionTarget)).append("\n");
    sb.append("    blockingReason: ").append(toIndentedString(blockingReason)).append("\n");
    sb.append("    blockingActionMap: ").append(toIndentedString(blockingActionMap)).append("\n");
    sb.append("    blockingAction: ").append(toIndentedString(blockingAction)).append("\n");
    sb.append("    blockingFrequencyCapBehaviour: ").append(toIndentedString(blockingFrequencyCapBehaviour)).append("\n");
    sb.append("    blockingPageUrlConditions: ").append(toIndentedString(blockingPageUrlConditions)).append("\n");
    sb.append("    blockingScheduleGroup: ").append(toIndentedString(blockingScheduleGroup)).append("\n");
    sb.append("    blockingEmergencyScheduleGroup: ").append(toIndentedString(blockingEmergencyScheduleGroup)).append("\n");
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

