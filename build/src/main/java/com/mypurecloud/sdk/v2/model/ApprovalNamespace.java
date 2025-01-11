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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ApprovalNamespace
 */

public class ApprovalNamespace  implements Serializable {
  

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
   * The namespace of the associated approvers.
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
    EMAIL("email"),
    EMPLOYEE_ENGAGEMENT("employee.engagement"),
    EVENT_ORCHESTRATION("event.orchestration"),
    EXTERNAL_CONTACTS("external.contacts"),
    GAMIFICATION("gamification"),
    GCV("gcv"),
    GDPR("gdpr"),
    GROUPS("groups"),
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

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current namespace approval status.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    REJECTED("Rejected"),
    ROLLBACK("Rollback"),
    PENDING("Pending"),
    OPEN("Open"),
    SECONDARYAPPROVALNAMESPACESADDED("SecondaryApprovalNamespacesAdded"),
    REVIEWERAPPROVED("ReviewerApproved"),
    REVIEWERREJECTED("ReviewerRejected"),
    REVIEWERROLLBACK("ReviewerRollback"),
    IMPLEMENTINGCHANGE("ImplementingChange"),
    CHANGEIMPLEMENTED("ChangeImplemented"),
    IMPLEMENTINGROLLBACK("ImplementingRollback"),
    ROLLBACKIMPLEMENTED("RollbackImplemented");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

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
   * The type of namespace approval.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PRIMARY("Primary"),
    SECONDARY("Secondary"),
    SYSTEM("System");

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

  
  @ApiModelProperty(example = "null", value = "The namespace of the associated approvers.")
  @JsonProperty("namespace")
  public NamespaceEnum getNamespace() {
    return namespace;
  }


  @ApiModelProperty(example = "null", value = "The current namespace approval status.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The type of namespace approval.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApprovalNamespace approvalNamespace = (ApprovalNamespace) o;

    return Objects.equals(this.namespace, approvalNamespace.namespace) &&
            Objects.equals(this.status, approvalNamespace.status) &&
            Objects.equals(this.type, approvalNamespace.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApprovalNamespace {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

