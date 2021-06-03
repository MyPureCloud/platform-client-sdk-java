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
 * Information about the recipient the message is sent to or received from.
 */
@ApiModel(description = "Information about the recipient the message is sent to or received from.")

public class MessagingRecipient  implements Serializable {
  
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
   * The recipient ID type. This is used to indicate the format used for the ID.
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

  
  @ApiModelProperty(example = "null", value = "Nickname or display name of the recipient.")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  
  /**
   * The recipient ID specific to the provider.
   **/
  public MessagingRecipient id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recipient ID specific to the provider.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The recipient ID type. This is used to indicate the format used for the ID.
   **/
  public MessagingRecipient idType(IdTypeEnum idType) {
    this.idType = idType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient ID type. This is used to indicate the format used for the ID.")
  @JsonProperty("idType")
  public IdTypeEnum getIdType() {
    return idType;
  }
  public void setIdType(IdTypeEnum idType) {
    this.idType = idType;
  }

  
  @ApiModelProperty(example = "null", value = "URL of an image that represents the recipient.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  
  @ApiModelProperty(example = "null", value = "First name of the recipient.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  
  @ApiModelProperty(example = "null", value = "Last name of the recipient.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  
  @ApiModelProperty(example = "null", value = "E-mail address of the recipient.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingRecipient messagingRecipient = (MessagingRecipient) o;
    return Objects.equals(this.nickname, messagingRecipient.nickname) &&
        Objects.equals(this.id, messagingRecipient.id) &&
        Objects.equals(this.idType, messagingRecipient.idType) &&
        Objects.equals(this.image, messagingRecipient.image) &&
        Objects.equals(this.firstName, messagingRecipient.firstName) &&
        Objects.equals(this.lastName, messagingRecipient.lastName) &&
        Objects.equals(this.email, messagingRecipient.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname, id, idType, image, firstName, lastName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingRecipient {\n");
    
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

