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
import com.mypurecloud.sdk.v2.model.CollaborateChatAdhocMessageEventTopicCollaborateChatEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CollaborateChatAdhocMessageEventTopicCollaborateChatMessage
 */

public class CollaborateChatAdhocMessageEventTopicCollaborateChatMessage  implements Serializable {
  
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
  private CollaborateChatAdhocMessageEventTopicCollaborateChatEntity from = null;
  private CollaborateChatAdhocMessageEventTopicCollaborateChatEntity to = null;
  private List<CollaborateChatAdhocMessageEventTopicCollaborateChatEntity> mentions = new ArrayList<CollaborateChatAdhocMessageEventTopicCollaborateChatEntity>();

  
  /**
   **/
  public CollaborateChatAdhocMessageEventTopicCollaborateChatMessage messageId(String messageId) {
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
  public CollaborateChatAdhocMessageEventTopicCollaborateChatMessage created(String created) {
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
  public CollaborateChatAdhocMessageEventTopicCollaborateChatMessage actionType(ActionTypeEnum actionType) {
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
  public CollaborateChatAdhocMessageEventTopicCollaborateChatMessage body(String body) {
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
  public CollaborateChatAdhocMessageEventTopicCollaborateChatMessage from(CollaborateChatAdhocMessageEventTopicCollaborateChatEntity from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public CollaborateChatAdhocMessageEventTopicCollaborateChatEntity getFrom() {
    return from;
  }
  public void setFrom(CollaborateChatAdhocMessageEventTopicCollaborateChatEntity from) {
    this.from = from;
  }


  /**
   **/
  public CollaborateChatAdhocMessageEventTopicCollaborateChatMessage to(CollaborateChatAdhocMessageEventTopicCollaborateChatEntity to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public CollaborateChatAdhocMessageEventTopicCollaborateChatEntity getTo() {
    return to;
  }
  public void setTo(CollaborateChatAdhocMessageEventTopicCollaborateChatEntity to) {
    this.to = to;
  }


  /**
   **/
  public CollaborateChatAdhocMessageEventTopicCollaborateChatMessage mentions(List<CollaborateChatAdhocMessageEventTopicCollaborateChatEntity> mentions) {
    this.mentions = mentions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mentions")
  public List<CollaborateChatAdhocMessageEventTopicCollaborateChatEntity> getMentions() {
    return mentions;
  }
  public void setMentions(List<CollaborateChatAdhocMessageEventTopicCollaborateChatEntity> mentions) {
    this.mentions = mentions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollaborateChatAdhocMessageEventTopicCollaborateChatMessage collaborateChatAdhocMessageEventTopicCollaborateChatMessage = (CollaborateChatAdhocMessageEventTopicCollaborateChatMessage) o;

    return Objects.equals(this.messageId, collaborateChatAdhocMessageEventTopicCollaborateChatMessage.messageId) &&
            Objects.equals(this.created, collaborateChatAdhocMessageEventTopicCollaborateChatMessage.created) &&
            Objects.equals(this.actionType, collaborateChatAdhocMessageEventTopicCollaborateChatMessage.actionType) &&
            Objects.equals(this.body, collaborateChatAdhocMessageEventTopicCollaborateChatMessage.body) &&
            Objects.equals(this.from, collaborateChatAdhocMessageEventTopicCollaborateChatMessage.from) &&
            Objects.equals(this.to, collaborateChatAdhocMessageEventTopicCollaborateChatMessage.to) &&
            Objects.equals(this.mentions, collaborateChatAdhocMessageEventTopicCollaborateChatMessage.mentions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, created, actionType, body, from, to, mentions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollaborateChatAdhocMessageEventTopicCollaborateChatMessage {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
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

