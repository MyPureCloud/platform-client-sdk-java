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
import com.mypurecloud.sdk.v2.model.CollaborateChatGroupMessageEventTopicCollaborateChatEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CollaborateChatGroupMessageEventTopicCollaborateChatMessage
 */

public class CollaborateChatGroupMessageEventTopicCollaborateChatMessage  implements Serializable {
  
  private String messageId = null;
  private String created = null;

  private static class ActionTypeEnumDeserializer extends StdDeserializer<ActionTypeEnum> {
    public ActionTypeEnumDeserializer() {
      super(ActionTypeEnumDeserializer.class);
    }

    @Override
    public ActionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actionType
   */
 @JsonDeserialize(using = ActionTypeEnumDeserializer.class)
  public enum ActionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("Create"),
    EDIT("Edit"),
    DELETE("Delete");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActionTypeEnum value : ActionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionTypeEnum actionType = null;
  private String body = null;
  private CollaborateChatGroupMessageEventTopicCollaborateChatEntity from = null;
  private CollaborateChatGroupMessageEventTopicCollaborateChatEntity to = null;
  private List<CollaborateChatGroupMessageEventTopicCollaborateChatEntity> mentions = null;
  private Boolean notifyAll = null;
  private Map<String, List<String>> reactions = null;

  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mentions = new ArrayList<CollaborateChatGroupMessageEventTopicCollaborateChatEntity>();
    }
  }

  
  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage created(String created) {
    this.created = created;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionType")
  public ActionTypeEnum getActionType() {
    return actionType;
  }
  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage from(CollaborateChatGroupMessageEventTopicCollaborateChatEntity from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public CollaborateChatGroupMessageEventTopicCollaborateChatEntity getFrom() {
    return from;
  }
  public void setFrom(CollaborateChatGroupMessageEventTopicCollaborateChatEntity from) {
    this.from = from;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage to(CollaborateChatGroupMessageEventTopicCollaborateChatEntity to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public CollaborateChatGroupMessageEventTopicCollaborateChatEntity getTo() {
    return to;
  }
  public void setTo(CollaborateChatGroupMessageEventTopicCollaborateChatEntity to) {
    this.to = to;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage mentions(List<CollaborateChatGroupMessageEventTopicCollaborateChatEntity> mentions) {
    this.mentions = mentions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mentions")
  public List<CollaborateChatGroupMessageEventTopicCollaborateChatEntity> getMentions() {
    return mentions;
  }
  public void setMentions(List<CollaborateChatGroupMessageEventTopicCollaborateChatEntity> mentions) {
    this.mentions = mentions;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage notifyAll(Boolean notifyAll) {
    this.notifyAll = notifyAll;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notifyAll")
  public Boolean getNotifyAll() {
    return notifyAll;
  }
  public void setNotifyAll(Boolean notifyAll) {
    this.notifyAll = notifyAll;
  }


  /**
   **/
  public CollaborateChatGroupMessageEventTopicCollaborateChatMessage reactions(Map<String, List<String>> reactions) {
    this.reactions = reactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reactions")
  public Map<String, List<String>> getReactions() {
    return reactions;
  }
  public void setReactions(Map<String, List<String>> reactions) {
    this.reactions = reactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaborateChatGroupMessageEventTopicCollaborateChatMessage collaborateChatGroupMessageEventTopicCollaborateChatMessage = (CollaborateChatGroupMessageEventTopicCollaborateChatMessage) o;

    return Objects.equals(this.messageId, collaborateChatGroupMessageEventTopicCollaborateChatMessage.messageId) &&
            Objects.equals(this.created, collaborateChatGroupMessageEventTopicCollaborateChatMessage.created) &&
            Objects.equals(this.actionType, collaborateChatGroupMessageEventTopicCollaborateChatMessage.actionType) &&
            Objects.equals(this.body, collaborateChatGroupMessageEventTopicCollaborateChatMessage.body) &&
            Objects.equals(this.from, collaborateChatGroupMessageEventTopicCollaborateChatMessage.from) &&
            Objects.equals(this.to, collaborateChatGroupMessageEventTopicCollaborateChatMessage.to) &&
            Objects.equals(this.mentions, collaborateChatGroupMessageEventTopicCollaborateChatMessage.mentions) &&
            Objects.equals(this.notifyAll, collaborateChatGroupMessageEventTopicCollaborateChatMessage.notifyAll) &&
            Objects.equals(this.reactions, collaborateChatGroupMessageEventTopicCollaborateChatMessage.reactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, created, actionType, body, from, to, mentions, notifyAll, reactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollaborateChatGroupMessageEventTopicCollaborateChatMessage {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    notifyAll: ").append(toIndentedString(notifyAll)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
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

