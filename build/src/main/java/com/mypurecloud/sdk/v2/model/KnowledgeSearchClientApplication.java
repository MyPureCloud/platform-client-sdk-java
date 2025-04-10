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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeSearchClientApplication
 */

public class KnowledgeSearchClientApplication  implements Serializable {
  

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
  private AddressableEntityRef deployment = null;
  private AddressableEntityRef botFlow = null;
  private AddressableEntityRef assistant = null;

  public KnowledgeSearchClientApplication() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Application type.
   **/
  public KnowledgeSearchClientApplication type(TypeEnum type) {
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
  public KnowledgeSearchClientApplication deployment(AddressableEntityRef deployment) {
    this.deployment = deployment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application details when type is MessengerKnowledgeApp or SupportCenter.")
  @JsonProperty("deployment")
  public AddressableEntityRef getDeployment() {
    return deployment;
  }
  public void setDeployment(AddressableEntityRef deployment) {
    this.deployment = deployment;
  }


  /**
   * Application details when type is BotFlow.
   **/
  public KnowledgeSearchClientApplication botFlow(AddressableEntityRef botFlow) {
    this.botFlow = botFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application details when type is BotFlow.")
  @JsonProperty("botFlow")
  public AddressableEntityRef getBotFlow() {
    return botFlow;
  }
  public void setBotFlow(AddressableEntityRef botFlow) {
    this.botFlow = botFlow;
  }


  /**
   * Application details when type is Assistant.
   **/
  public KnowledgeSearchClientApplication assistant(AddressableEntityRef assistant) {
    this.assistant = assistant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Application details when type is Assistant.")
  @JsonProperty("assistant")
  public AddressableEntityRef getAssistant() {
    return assistant;
  }
  public void setAssistant(AddressableEntityRef assistant) {
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
    KnowledgeSearchClientApplication knowledgeSearchClientApplication = (KnowledgeSearchClientApplication) o;

    return Objects.equals(this.type, knowledgeSearchClientApplication.type) &&
            Objects.equals(this.deployment, knowledgeSearchClientApplication.deployment) &&
            Objects.equals(this.botFlow, knowledgeSearchClientApplication.botFlow) &&
            Objects.equals(this.assistant, knowledgeSearchClientApplication.assistant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, deployment, botFlow, assistant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchClientApplication {\n");
    
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

