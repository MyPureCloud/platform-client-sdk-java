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
import com.mypurecloud.sdk.v2.model.EmailAddress;
import com.mypurecloud.sdk.v2.model.QueueEmailAddress;
import com.mypurecloud.sdk.v2.model.Signature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * InboundRoute
 */

public class InboundRoute  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String pattern = null;
  private DomainEntityRef queue = null;
  private Integer priority = null;
  private List<DomainEntityRef> skills = null;
  private DomainEntityRef language = null;
  private String fromName = null;
  private String fromEmail = null;
  private DomainEntityRef flow = null;
  private QueueEmailAddress replyEmailAddress = null;
  private List<EmailAddress> autoBcc = null;
  private DomainEntityRef spamFlow = null;
  private Signature signature = null;

  private static class HistoryInclusionEnumDeserializer extends StdDeserializer<HistoryInclusionEnum> {
    public HistoryInclusionEnumDeserializer() {
      super(HistoryInclusionEnumDeserializer.class);
    }

    @Override
    public HistoryInclusionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return HistoryInclusionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The configuration to indicate how the history of a conversation has to be included in a draft
   */
 @JsonDeserialize(using = HistoryInclusionEnumDeserializer.class)
  public enum HistoryInclusionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INCLUDE("Include"),
    EXCLUDE("Exclude"),
    OPTIONAL("Optional");

    private String value;

    HistoryInclusionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static HistoryInclusionEnum fromString(String key) {
      if (key == null) return null;

      for (HistoryInclusionEnum value : HistoryInclusionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return HistoryInclusionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private HistoryInclusionEnum historyInclusion = null;
  private Boolean allowMultipleActions = null;
  private String selfUri = null;

  public InboundRoute() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skills = new ArrayList<DomainEntityRef>();
      autoBcc = new ArrayList<EmailAddress>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public InboundRoute name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The search pattern that the mailbox name should match.
   **/
  public InboundRoute pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The search pattern that the mailbox name should match.")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  /**
   * The queue to route the emails to.
   **/
  public InboundRoute queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue to route the emails to.")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }


  /**
   * The priority to use for routing.
   **/
  public InboundRoute priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to use for routing.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * The skills to use for routing.
   **/
  public InboundRoute skills(List<DomainEntityRef> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skills to use for routing.")
  @JsonProperty("skills")
  public List<DomainEntityRef> getSkills() {
    return skills;
  }
  public void setSkills(List<DomainEntityRef> skills) {
    this.skills = skills;
  }


  /**
   * The language to use for routing.
   **/
  public InboundRoute language(DomainEntityRef language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language to use for routing.")
  @JsonProperty("language")
  public DomainEntityRef getLanguage() {
    return language;
  }
  public void setLanguage(DomainEntityRef language) {
    this.language = language;
  }


  /**
   * The sender name to use for outgoing replies.
   **/
  public InboundRoute fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sender name to use for outgoing replies.")
  @JsonProperty("fromName")
  public String getFromName() {
    return fromName;
  }
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }


  /**
   * The sender email to use for outgoing replies.
   **/
  public InboundRoute fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sender email to use for outgoing replies.")
  @JsonProperty("fromEmail")
  public String getFromEmail() {
    return fromEmail;
  }
  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }


  /**
   * The flow to use for processing the email.
   **/
  public InboundRoute flow(DomainEntityRef flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow to use for processing the email.")
  @JsonProperty("flow")
  public DomainEntityRef getFlow() {
    return flow;
  }
  public void setFlow(DomainEntityRef flow) {
    this.flow = flow;
  }


  /**
   * The route to use for email replies.
   **/
  public InboundRoute replyEmailAddress(QueueEmailAddress replyEmailAddress) {
    this.replyEmailAddress = replyEmailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The route to use for email replies.")
  @JsonProperty("replyEmailAddress")
  public QueueEmailAddress getReplyEmailAddress() {
    return replyEmailAddress;
  }
  public void setReplyEmailAddress(QueueEmailAddress replyEmailAddress) {
    this.replyEmailAddress = replyEmailAddress;
  }


  /**
   * The recipients that should be automatically blind copied on outbound emails associated with this InboundRoute.
   **/
  public InboundRoute autoBcc(List<EmailAddress> autoBcc) {
    this.autoBcc = autoBcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipients that should be automatically blind copied on outbound emails associated with this InboundRoute.")
  @JsonProperty("autoBcc")
  public List<EmailAddress> getAutoBcc() {
    return autoBcc;
  }
  public void setAutoBcc(List<EmailAddress> autoBcc) {
    this.autoBcc = autoBcc;
  }


  /**
   * The flow to use for processing inbound emails that have been marked as spam.
   **/
  public InboundRoute spamFlow(DomainEntityRef spamFlow) {
    this.spamFlow = spamFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flow to use for processing inbound emails that have been marked as spam.")
  @JsonProperty("spamFlow")
  public DomainEntityRef getSpamFlow() {
    return spamFlow;
  }
  public void setSpamFlow(DomainEntityRef spamFlow) {
    this.spamFlow = spamFlow;
  }


  /**
   * The configuration for the canned response signature that will be appended to outbound emails sent via this route
   **/
  public InboundRoute signature(Signature signature) {
    this.signature = signature;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration for the canned response signature that will be appended to outbound emails sent via this route")
  @JsonProperty("signature")
  public Signature getSignature() {
    return signature;
  }
  public void setSignature(Signature signature) {
    this.signature = signature;
  }


  /**
   * The configuration to indicate how the history of a conversation has to be included in a draft
   **/
  public InboundRoute historyInclusion(HistoryInclusionEnum historyInclusion) {
    this.historyInclusion = historyInclusion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration to indicate how the history of a conversation has to be included in a draft")
  @JsonProperty("historyInclusion")
  public HistoryInclusionEnum getHistoryInclusion() {
    return historyInclusion;
  }
  public void setHistoryInclusion(HistoryInclusionEnum historyInclusion) {
    this.historyInclusion = historyInclusion;
  }


  /**
   * Control if multiple actions are allowed on this route. When true the disconnect has to be done manually. When false a conversation will be disconnected by the system after every action
   **/
  public InboundRoute allowMultipleActions(Boolean allowMultipleActions) {
    this.allowMultipleActions = allowMultipleActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Control if multiple actions are allowed on this route. When true the disconnect has to be done manually. When false a conversation will be disconnected by the system after every action")
  @JsonProperty("allowMultipleActions")
  public Boolean getAllowMultipleActions() {
    return allowMultipleActions;
  }
  public void setAllowMultipleActions(Boolean allowMultipleActions) {
    this.allowMultipleActions = allowMultipleActions;
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
    InboundRoute inboundRoute = (InboundRoute) o;

    return Objects.equals(this.id, inboundRoute.id) &&
            Objects.equals(this.name, inboundRoute.name) &&
            Objects.equals(this.pattern, inboundRoute.pattern) &&
            Objects.equals(this.queue, inboundRoute.queue) &&
            Objects.equals(this.priority, inboundRoute.priority) &&
            Objects.equals(this.skills, inboundRoute.skills) &&
            Objects.equals(this.language, inboundRoute.language) &&
            Objects.equals(this.fromName, inboundRoute.fromName) &&
            Objects.equals(this.fromEmail, inboundRoute.fromEmail) &&
            Objects.equals(this.flow, inboundRoute.flow) &&
            Objects.equals(this.replyEmailAddress, inboundRoute.replyEmailAddress) &&
            Objects.equals(this.autoBcc, inboundRoute.autoBcc) &&
            Objects.equals(this.spamFlow, inboundRoute.spamFlow) &&
            Objects.equals(this.signature, inboundRoute.signature) &&
            Objects.equals(this.historyInclusion, inboundRoute.historyInclusion) &&
            Objects.equals(this.allowMultipleActions, inboundRoute.allowMultipleActions) &&
            Objects.equals(this.selfUri, inboundRoute.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pattern, queue, priority, skills, language, fromName, fromEmail, flow, replyEmailAddress, autoBcc, spamFlow, signature, historyInclusion, allowMultipleActions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundRoute {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    replyEmailAddress: ").append(toIndentedString(replyEmailAddress)).append("\n");
    sb.append("    autoBcc: ").append(toIndentedString(autoBcc)).append("\n");
    sb.append("    spamFlow: ").append(toIndentedString(spamFlow)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    historyInclusion: ").append(toIndentedString(historyInclusion)).append("\n");
    sb.append("    allowMultipleActions: ").append(toIndentedString(allowMultipleActions)).append("\n");
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

