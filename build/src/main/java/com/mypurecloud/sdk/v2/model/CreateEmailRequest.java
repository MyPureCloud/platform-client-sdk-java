package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CreateEmailRequest
 */

public class CreateEmailRequest  implements Serializable {
  
  private String queueId = null;
  private String provider = null;
  private List<String> skillIds = new ArrayList<String>();
  private String languageId = null;
  private Long priority = null;
  private Map<String, String> attributes = new HashMap<String, String>();
  private String toAddress = null;
  private String toName = null;
  private String fromAddress = null;
  private String fromName = null;
  private String subject = null;

  /**
   * Specify INBOUND to create an inbound email conversation to route to a queue, or OUTBOUND to send an email on behalf of a queue.
   */
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OUTBOUND("OUTBOUND"),
    INBOUND("INBOUND");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;

  
  /**
   * The ID of the queue to use for routing the chat conversation.
   **/
  public CreateEmailRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the queue to use for routing the chat conversation.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The name of the provider that is sourcing the web chat.
   **/
  public CreateEmailRequest provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the provider that is sourcing the web chat.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   * The list of skill ID's to use for routing.
   **/
  public CreateEmailRequest skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of skill ID's to use for routing.")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * The ID of the language to use for routing.
   **/
  public CreateEmailRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the language to use for routing.")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  
  /**
   * The priority to assign to the conversation for routing.
   **/
  public CreateEmailRequest priority(Long priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to assign to the conversation for routing.")
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }
  public void setPriority(Long priority) {
    this.priority = priority;
  }

  
  /**
   * The list of attributes to associate with the customer participant.
   **/
  public CreateEmailRequest attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of attributes to associate with the customer participant.")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  
  /**
   * The email address of the recipient of the email.
   **/
  public CreateEmailRequest toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address of the recipient of the email.")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   * The name of the recipient of the email.
   **/
  public CreateEmailRequest toName(String toName) {
    this.toName = toName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the recipient of the email.")
  @JsonProperty("toName")
  public String getToName() {
    return toName;
  }
  public void setToName(String toName) {
    this.toName = toName;
  }

  
  /**
   * The email address of the sender of the email.
   **/
  public CreateEmailRequest fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address of the sender of the email.")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   * The name of the sender of the email.
   **/
  public CreateEmailRequest fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the sender of the email.")
  @JsonProperty("fromName")
  public String getFromName() {
    return fromName;
  }
  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  
  /**
   * The subject of the email
   **/
  public CreateEmailRequest subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject of the email")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * Specify INBOUND to create an inbound email conversation to route to a queue, or OUTBOUND to send an email on behalf of a queue.
   **/
  public CreateEmailRequest direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify INBOUND to create an inbound email conversation to route to a queue, or OUTBOUND to send an email on behalf of a queue.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailRequest createEmailRequest = (CreateEmailRequest) o;
    return Objects.equals(this.queueId, createEmailRequest.queueId) &&
        Objects.equals(this.provider, createEmailRequest.provider) &&
        Objects.equals(this.skillIds, createEmailRequest.skillIds) &&
        Objects.equals(this.languageId, createEmailRequest.languageId) &&
        Objects.equals(this.priority, createEmailRequest.priority) &&
        Objects.equals(this.attributes, createEmailRequest.attributes) &&
        Objects.equals(this.toAddress, createEmailRequest.toAddress) &&
        Objects.equals(this.toName, createEmailRequest.toName) &&
        Objects.equals(this.fromAddress, createEmailRequest.fromAddress) &&
        Objects.equals(this.fromName, createEmailRequest.fromName) &&
        Objects.equals(this.subject, createEmailRequest.subject) &&
        Objects.equals(this.direction, createEmailRequest.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, provider, skillIds, languageId, priority, attributes, toAddress, toName, fromAddress, fromName, subject, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailRequest {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    toName: ").append(toIndentedString(toName)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

