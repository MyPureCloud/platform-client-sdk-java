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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Limit
 */

public class Limit  implements Serializable {
  
  private String key = null;

  private static class NamespaceEnumDeserializer extends StdDeserializer<NamespaceEnum> {
    public NamespaceEnumDeserializer() {
      super(NamespaceEnumDeserializer.class);
    }

    @Override
    public NamespaceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NamespaceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets namespace
   */
 @JsonDeserialize(using = NamespaceEnumDeserializer.class)
  public enum NamespaceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENT_ASSISTANT("agent.assistant"),
    ANALYTICS_AGENTS("analytics.agents"),
    ANALYTICS_ALERTING("analytics.alerting"),
    ANALYTICS("analytics"),
    ANALYTICS_REALTIME("analytics.realtime"),
    ANALYTICS_REPORTING_SETTINGS("analytics.reporting.settings"),
    ARCHITECT("architect"),
    AUDIOHOOK("audiohook"),
    AUDIT("audit"),
    AUTH_API("auth.api"),
    AUTHORIZATION("authorization"),
    AUTOMATION_TESTING("automation.testing"),
    BOTS("bots"),
    BOTS_VOICE("bots.voice"),
    BUSINESS_RULES("business.rules"),
    CALLBACK("callback"),
    COBROWSE("cobrowse"),
    CONTENT_MANAGEMENT("content.management"),
    CONVERSATION("conversation"),
    DATAACTIONS("dataactions"),
    DATATABLES("datatables"),
    DIRECTORY("directory"),
    DSAR("dsar"),
    EMAIL("email"),
    EMPLOYEE_ENGAGEMENT("employee.engagement"),
    EVENT_ORCHESTRATION("event.orchestration"),
    EXTERNAL_CONTACTS("external.contacts"),
    EXTERNAL_EVENTS_DATA_INGESTION("external.events.data.ingestion"),
    GAMIFICATION("gamification"),
    GCV("gcv"),
    GDPR("gdpr"),
    GROUPS("groups"),
    GUIDES("guides"),
    HISTORICAL_ADHERENCE("historical.adherence"),
    INFRASTRUCTUREASCODE("infrastructureascode"),
    INTEGRATIONS("integrations"),
    INTENT_MINER("intent.miner"),
    INTERNAL_MESSAGING("internal.messaging"),
    JOURNEY("journey"),
    KNOWLEDGE("knowledge"),
    LANGUAGE_UNDERSTANDING("language.understanding"),
    LEARNING("learning"),
    LIMIT_REGISTRY("limit.registry"),
    MARKETPLACE("marketplace"),
    MEDIA_COMMUNICATIONS("media.communications"),
    MESSAGING("messaging"),
    MICRO_FRONTEND("micro.frontend"),
    NOTIFICATIONS("notifications"),
    ONBOARDING("onboarding"),
    OUTBOUND("outbound"),
    PLATFORM_API("platform.api"),
    PREDICTIVE_ROUTING("predictive.routing"),
    PRESENCE("presence"),
    QUALITY("quality"),
    RECORDING("recording"),
    RESPONSE_MANAGEMENT("response.management"),
    ROUTING("routing"),
    SCIM("scim"),
    SEARCH("search"),
    SECONDARY_AUTOMATION_TESTING("secondary.automation.testing"),
    SKILLS("skills"),
    SOCIAL_MEDIA("social.media"),
    SPEECH_AND_TEXT_ANALYTICS("speech.and.text.analytics"),
    SPEECH_INTEGRATION("speech.integration"),
    SUPPORTABILITY("supportability"),
    TASK_MANAGEMENT("task.management"),
    TELEPHONY_CONFIGURATION("telephony.configuration"),
    USAGE("usage"),
    USERS("users"),
    WEB_DEPLOYMENTS("web.deployments"),
    WEB_MESSAGING("web.messaging"),
    WEBCHAT("webchat"),
    WEBHOOKS("webhooks"),
    WORKFORCE_MANAGEMENT_FORECAST("workforce.management.forecast"),
    WORKFORCE_MANAGEMENT("workforce.management"),
    SYSTEM("system");

    private String value;

    NamespaceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NamespaceEnum fromString(String key) {
      if (key == null) return null;

      for (NamespaceEnum value : NamespaceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NamespaceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NamespaceEnum namespace = null;
  private Long value = null;

  public Limit() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public Limit key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }


  /**
   **/
  public Limit namespace(NamespaceEnum namespace) {
    this.namespace = namespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("namespace")
  public NamespaceEnum getNamespace() {
    return namespace;
  }
  public void setNamespace(NamespaceEnum namespace) {
    this.namespace = namespace;
  }


  /**
   **/
  public Limit value(Long value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Limit limit = (Limit) o;

    return Objects.equals(this.key, limit.key) &&
            Objects.equals(this.namespace, limit.namespace) &&
            Objects.equals(this.value, limit.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, namespace, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limit {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

