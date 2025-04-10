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
import com.mypurecloud.sdk.v2.model.EntityReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeGuestSearchClientApplication
 */

public class KnowledgeGuestSearchClientApplication  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Application type.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSISTANT("Assistant"),
    BOTFLOW("BotFlow"),
    MESSENGERKNOWLEDGEAPP("MessengerKnowledgeApp"),
    SMARTADVISOR("SmartAdvisor"),
    SUPPORTCENTER("SupportCenter");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private EntityReference deployment = null;
  private EntityReference botFlow = null;
  private EntityReference assistant = null;

  public KnowledgeGuestSearchClientApplication() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Application type.
   **/
  public KnowledgeGuestSearchClientApplication type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Application type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Application details when type is MessengerKnowledgeApp or SupportCenter.
   **/
  public KnowledgeGuestSearchClientApplication deployment(EntityReference deployment) {
    this.deployment = deployment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application details when type is MessengerKnowledgeApp or SupportCenter.")
  @JsonProperty("deployment")
  public EntityReference getDeployment() {
    return deployment;
  }
  public void setDeployment(EntityReference deployment) {
    this.deployment = deployment;
  }


  /**
   * Application details when type is BotFlow.
   **/
  public KnowledgeGuestSearchClientApplication botFlow(EntityReference botFlow) {
    this.botFlow = botFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application details when type is BotFlow.")
  @JsonProperty("botFlow")
  public EntityReference getBotFlow() {
    return botFlow;
  }
  public void setBotFlow(EntityReference botFlow) {
    this.botFlow = botFlow;
  }


  /**
   * Application details when type is Assistant.
   **/
  public KnowledgeGuestSearchClientApplication assistant(EntityReference assistant) {
    this.assistant = assistant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application details when type is Assistant.")
  @JsonProperty("assistant")
  public EntityReference getAssistant() {
    return assistant;
  }
  public void setAssistant(EntityReference assistant) {
    this.assistant = assistant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestSearchClientApplication knowledgeGuestSearchClientApplication = (KnowledgeGuestSearchClientApplication) o;

    return Objects.equals(this.type, knowledgeGuestSearchClientApplication.type) &&
            Objects.equals(this.deployment, knowledgeGuestSearchClientApplication.deployment) &&
            Objects.equals(this.botFlow, knowledgeGuestSearchClientApplication.botFlow) &&
            Objects.equals(this.assistant, knowledgeGuestSearchClientApplication.assistant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, deployment, botFlow, assistant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestSearchClientApplication {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
    sb.append("    botFlow: ").append(toIndentedString(botFlow)).append("\n");
    sb.append("    assistant: ").append(toIndentedString(assistant)).append("\n");
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

