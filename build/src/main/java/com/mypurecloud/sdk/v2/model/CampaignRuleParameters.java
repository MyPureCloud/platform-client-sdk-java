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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * CampaignRuleParameters
 */

public class CampaignRuleParameters  implements Serializable {
  

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operator for comparison. Required for a CampaignRuleCondition.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("equals"),
    GREATERTHAN("greaterThan"),
    GREATERTHANEQUALTO("greaterThanEqualTo"),
    LESSTHAN("lessThan"),
    LESSTHANEQUALTO("lessThanEqualTo");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;

  private static class PriorityEnumDeserializer extends StdDeserializer<PriorityEnum> {
    public PriorityEnumDeserializer() {
      super(PriorityEnumDeserializer.class);
    }

    @Override
    public PriorityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PriorityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The priority to set a campaign to. Required for the 'setCampaignPriority' action.
   */
 @JsonDeserialize(using = PriorityEnumDeserializer.class)
  public enum PriorityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    _1("1"),
    _2("2"),
    _3("3"),
    _4("4"),
    _5("5");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PriorityEnum fromString(String key) {
      if (key == null) return null;

      for (PriorityEnum value : PriorityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PriorityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PriorityEnum priority = null;

  private static class DialingModeEnumDeserializer extends StdDeserializer<DialingModeEnum> {
    public DialingModeEnumDeserializer() {
      super(DialingModeEnumDeserializer.class);
    }

    @Override
    public DialingModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DialingModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action.
   */
 @JsonDeserialize(using = DialingModeEnumDeserializer.class)
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTLESS("agentless"),
    PREVIEW("preview"),
    POWER("power"),
    PREDICTIVE("predictive"),
    PROGRESSIVE("progressive"),
    EXTERNAL("external");

    private String value;

    DialingModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DialingModeEnum fromString(String key) {
      if (key == null) return null;

      for (DialingModeEnum value : DialingModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DialingModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DialingModeEnum dialingMode = null;
  private BigDecimal abandonRate = null;
  private Integer outboundLineCount = null;
  private Integer relativeWeight = null;
  private BigDecimal maxCallsPerAgent = null;
  private DomainEntityRef queue = null;
  private Integer messagesPerMinute = null;
  private Integer smsMessagesPerMinute = null;
  private Integer emailMessagesPerMinute = null;
  private DomainEntityRef smsContentTemplate = null;
  private DomainEntityRef emailContentTemplate = null;

  public CampaignRuleParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The operator for comparison. Required for a CampaignRuleCondition.
   **/
  public CampaignRuleParameters operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator for comparison. Required for a CampaignRuleCondition.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The value for comparison. Required for a CampaignRuleCondition.
   **/
  public CampaignRuleParameters value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for comparison. Required for a CampaignRuleCondition.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * The priority to set a campaign to. Required for the 'setCampaignPriority' action.
   **/
  public CampaignRuleParameters priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to set a campaign to. Required for the 'setCampaignPriority' action.")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  /**
   * The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action.
   **/
  public CampaignRuleParameters dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dialing mode to set a campaign to. Required for the 'setCampaignDialingMode' action.")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }


  /**
   * The abandon rate to set a campaign to. Required for the 'setCampaignAbandonRate' action.
   **/
  public CampaignRuleParameters abandonRate(BigDecimal abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The abandon rate to set a campaign to. Required for the 'setCampaignAbandonRate' action.")
  @JsonProperty("abandonRate")
  public BigDecimal getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(BigDecimal abandonRate) {
    this.abandonRate = abandonRate;
  }


  /**
   * The  number of outbound lines to set a campaign to. Required for the 'setCampaignNumberOfLines' action.
   **/
  public CampaignRuleParameters outboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The  number of outbound lines to set a campaign to. Required for the 'setCampaignNumberOfLines' action.")
  @JsonProperty("outboundLineCount")
  public Integer getOutboundLineCount() {
    return outboundLineCount;
  }
  public void setOutboundLineCount(Integer outboundLineCount) {
    this.outboundLineCount = outboundLineCount;
  }


  /**
   * The relative weight to set a campaign to. Required for the 'setCampaignWeight' action.
   **/
  public CampaignRuleParameters relativeWeight(Integer relativeWeight) {
    this.relativeWeight = relativeWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The relative weight to set a campaign to. Required for the 'setCampaignWeight' action.")
  @JsonProperty("relativeWeight")
  public Integer getRelativeWeight() {
    return relativeWeight;
  }
  public void setRelativeWeight(Integer relativeWeight) {
    this.relativeWeight = relativeWeight;
  }


  /**
   * The maximum number of calls per agent to set a campaign to. Required for the 'setCampaignMaxCallsPerAgent' action.
   **/
  public CampaignRuleParameters maxCallsPerAgent(BigDecimal maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of calls per agent to set a campaign to. Required for the 'setCampaignMaxCallsPerAgent' action.")
  @JsonProperty("maxCallsPerAgent")
  public BigDecimal getMaxCallsPerAgent() {
    return maxCallsPerAgent;
  }
  public void setMaxCallsPerAgent(BigDecimal maxCallsPerAgent) {
    this.maxCallsPerAgent = maxCallsPerAgent;
  }


  /**
   * The queue a campaign to. Required for the 'changeCampaignQueue' action.
   **/
  public CampaignRuleParameters queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue a campaign to. Required for the 'changeCampaignQueue' action.")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }


  /**
   * The number of messages per minute to set a messaging campaign to.
   **/
  public CampaignRuleParameters messagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of messages per minute to set a messaging campaign to.")
  @JsonProperty("messagesPerMinute")
  public Integer getMessagesPerMinute() {
    return messagesPerMinute;
  }
  public void setMessagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
  }


  /**
   * The number of messages per minute to set a SMS messaging campaign to.
   **/
  public CampaignRuleParameters smsMessagesPerMinute(Integer smsMessagesPerMinute) {
    this.smsMessagesPerMinute = smsMessagesPerMinute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of messages per minute to set a SMS messaging campaign to.")
  @JsonProperty("smsMessagesPerMinute")
  public Integer getSmsMessagesPerMinute() {
    return smsMessagesPerMinute;
  }
  public void setSmsMessagesPerMinute(Integer smsMessagesPerMinute) {
    this.smsMessagesPerMinute = smsMessagesPerMinute;
  }


  /**
   * The number of messages per minute to set a Email messaging campaign to.
   **/
  public CampaignRuleParameters emailMessagesPerMinute(Integer emailMessagesPerMinute) {
    this.emailMessagesPerMinute = emailMessagesPerMinute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of messages per minute to set a Email messaging campaign to.")
  @JsonProperty("emailMessagesPerMinute")
  public Integer getEmailMessagesPerMinute() {
    return emailMessagesPerMinute;
  }
  public void setEmailMessagesPerMinute(Integer emailMessagesPerMinute) {
    this.emailMessagesPerMinute = emailMessagesPerMinute;
  }


  /**
   * The content template to set a SMS campaign to.
   **/
  public CampaignRuleParameters smsContentTemplate(DomainEntityRef smsContentTemplate) {
    this.smsContentTemplate = smsContentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content template to set a SMS campaign to.")
  @JsonProperty("smsContentTemplate")
  public DomainEntityRef getSmsContentTemplate() {
    return smsContentTemplate;
  }
  public void setSmsContentTemplate(DomainEntityRef smsContentTemplate) {
    this.smsContentTemplate = smsContentTemplate;
  }


  /**
   * The content template to set a Email campaign to.
   **/
  public CampaignRuleParameters emailContentTemplate(DomainEntityRef emailContentTemplate) {
    this.emailContentTemplate = emailContentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content template to set a Email campaign to.")
  @JsonProperty("emailContentTemplate")
  public DomainEntityRef getEmailContentTemplate() {
    return emailContentTemplate;
  }
  public void setEmailContentTemplate(DomainEntityRef emailContentTemplate) {
    this.emailContentTemplate = emailContentTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleParameters campaignRuleParameters = (CampaignRuleParameters) o;

    return Objects.equals(this.operator, campaignRuleParameters.operator) &&
            Objects.equals(this.value, campaignRuleParameters.value) &&
            Objects.equals(this.priority, campaignRuleParameters.priority) &&
            Objects.equals(this.dialingMode, campaignRuleParameters.dialingMode) &&
            Objects.equals(this.abandonRate, campaignRuleParameters.abandonRate) &&
            Objects.equals(this.outboundLineCount, campaignRuleParameters.outboundLineCount) &&
            Objects.equals(this.relativeWeight, campaignRuleParameters.relativeWeight) &&
            Objects.equals(this.maxCallsPerAgent, campaignRuleParameters.maxCallsPerAgent) &&
            Objects.equals(this.queue, campaignRuleParameters.queue) &&
            Objects.equals(this.messagesPerMinute, campaignRuleParameters.messagesPerMinute) &&
            Objects.equals(this.smsMessagesPerMinute, campaignRuleParameters.smsMessagesPerMinute) &&
            Objects.equals(this.emailMessagesPerMinute, campaignRuleParameters.emailMessagesPerMinute) &&
            Objects.equals(this.smsContentTemplate, campaignRuleParameters.smsContentTemplate) &&
            Objects.equals(this.emailContentTemplate, campaignRuleParameters.emailContentTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value, priority, dialingMode, abandonRate, outboundLineCount, relativeWeight, maxCallsPerAgent, queue, messagesPerMinute, smsMessagesPerMinute, emailMessagesPerMinute, smsContentTemplate, emailContentTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleParameters {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
    sb.append("    outboundLineCount: ").append(toIndentedString(outboundLineCount)).append("\n");
    sb.append("    relativeWeight: ").append(toIndentedString(relativeWeight)).append("\n");
    sb.append("    maxCallsPerAgent: ").append(toIndentedString(maxCallsPerAgent)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    messagesPerMinute: ").append(toIndentedString(messagesPerMinute)).append("\n");
    sb.append("    smsMessagesPerMinute: ").append(toIndentedString(smsMessagesPerMinute)).append("\n");
    sb.append("    emailMessagesPerMinute: ").append(toIndentedString(emailMessagesPerMinute)).append("\n");
    sb.append("    smsContentTemplate: ").append(toIndentedString(smsContentTemplate)).append("\n");
    sb.append("    emailContentTemplate: ").append(toIndentedString(emailContentTemplate)).append("\n");
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

