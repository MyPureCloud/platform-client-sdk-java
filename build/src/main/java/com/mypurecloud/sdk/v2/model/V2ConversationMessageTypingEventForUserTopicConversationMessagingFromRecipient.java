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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationRecipientAdditionalIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient
 */

public class V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient  implements Serializable {
  
  private String nickname = null;
  private String id = null;

  private static class IdTypeEnumDeserializer extends StdDeserializer<IdTypeEnum> {
    public IdTypeEnumDeserializer() {
      super(IdTypeEnumDeserializer.class);
    }

    @Override
    public IdTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IdTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets idType
   */
 @JsonDeserialize(using = IdTypeEnumDeserializer.class)
  public enum IdTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMAIL("Email"),
    PHONE("Phone"),
    OPAQUE("Opaque");

    private String value;

    IdTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IdTypeEnum fromString(String key) {
      if (key == null) return null;

      for (IdTypeEnum value : IdTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IdTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IdTypeEnum idType = null;
  private String image = null;
  private String firstName = null;
  private String lastName = null;
  private String email = null;
  private List<V2ConversationMessageTypingEventForUserTopicConversationRecipientAdditionalIdentifier> additionalIds = null;

  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      additionalIds = new ArrayList<V2ConversationMessageTypingEventForUserTopicConversationRecipientAdditionalIdentifier>();
    }
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient idType(IdTypeEnum idType) {
    this.idType = idType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idType")
  public IdTypeEnum getIdType() {
    return idType;
  }
  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient additionalIds(List<V2ConversationMessageTypingEventForUserTopicConversationRecipientAdditionalIdentifier> additionalIds) {
    this.additionalIds = additionalIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalIds")
  public List<V2ConversationMessageTypingEventForUserTopicConversationRecipientAdditionalIdentifier> getAdditionalIds() {
    return additionalIds;
  }
  public void setAdditionalIds(List<V2ConversationMessageTypingEventForUserTopicConversationRecipientAdditionalIdentifier> additionalIds) {
    this.additionalIds = additionalIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient = (V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient) o;

    return Objects.equals(this.nickname, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.nickname) &&
            Objects.equals(this.id, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.id) &&
            Objects.equals(this.idType, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.idType) &&
            Objects.equals(this.image, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.image) &&
            Objects.equals(this.firstName, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.firstName) &&
            Objects.equals(this.lastName, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.lastName) &&
            Objects.equals(this.email, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.email) &&
            Objects.equals(this.additionalIds, v2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient.additionalIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname, id, idType, image, firstName, lastName, email, additionalIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient {\n");
    
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    additionalIds: ").append(toIndentedString(additionalIds)).append("\n");
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

