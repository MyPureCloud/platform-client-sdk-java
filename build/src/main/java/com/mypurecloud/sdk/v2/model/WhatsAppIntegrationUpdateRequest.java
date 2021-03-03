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
 * WhatsAppIntegrationUpdateRequest
 */

public class WhatsAppIntegrationUpdateRequest  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * The action used to activate and then confirm a WhatsApp Integration.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVATE("Activate"),
    CONFIRM("Confirm");

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

  private static class AuthenticationMethodEnumDeserializer extends StdDeserializer<AuthenticationMethodEnum> {
    public AuthenticationMethodEnumDeserializer() {
      super(AuthenticationMethodEnumDeserializer.class);
    }

    @Override
    public AuthenticationMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AuthenticationMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The authentication method used to confirm a WhatsApp Integration activation. If action is set to Activate, then authenticationMethod is a required field. 
   */
 @JsonDeserialize(using = AuthenticationMethodEnumDeserializer.class)
  public enum AuthenticationMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("Sms"),
    VOICE("Voice");

    private String value;

    AuthenticationMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AuthenticationMethodEnum fromString(String key) {
      if (key == null) return null;

      for (AuthenticationMethodEnum value : AuthenticationMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AuthenticationMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AuthenticationMethodEnum authenticationMethod = null;
  private String confirmationCode = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "WhatsApp Integration name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  /**
   * The action used to activate and then confirm a WhatsApp Integration.
   **/
  public WhatsAppIntegrationUpdateRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action used to activate and then confirm a WhatsApp Integration.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * The authentication method used to confirm a WhatsApp Integration activation. If action is set to Activate, then authenticationMethod is a required field. 
   **/
  public WhatsAppIntegrationUpdateRequest authenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The authentication method used to confirm a WhatsApp Integration activation. If action is set to Activate, then authenticationMethod is a required field. ")
  @JsonProperty("authenticationMethod")
  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }
  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  
  /**
   * The confirmation code sent by Whatsapp to you during the activation step. If action is set to Confirm, then confirmationCode is a required field.
   **/
  public WhatsAppIntegrationUpdateRequest confirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confirmation code sent by Whatsapp to you during the activation step. If action is set to Confirm, then confirmationCode is a required field.")
  @JsonProperty("confirmationCode")
  public String getConfirmationCode() {
    return confirmationCode;
  }
  public void setConfirmationCode(String confirmationCode) {
    this.confirmationCode = confirmationCode;
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
    WhatsAppIntegrationUpdateRequest whatsAppIntegrationUpdateRequest = (WhatsAppIntegrationUpdateRequest) o;
    return Objects.equals(this.id, whatsAppIntegrationUpdateRequest.id) &&
        Objects.equals(this.name, whatsAppIntegrationUpdateRequest.name) &&
        Objects.equals(this.action, whatsAppIntegrationUpdateRequest.action) &&
        Objects.equals(this.authenticationMethod, whatsAppIntegrationUpdateRequest.authenticationMethod) &&
        Objects.equals(this.confirmationCode, whatsAppIntegrationUpdateRequest.confirmationCode) &&
        Objects.equals(this.selfUri, whatsAppIntegrationUpdateRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, action, authenticationMethod, confirmationCode, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppIntegrationUpdateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    confirmationCode: ").append(toIndentedString(confirmationCode)).append("\n");
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

