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
import java.util.Date;

import java.io.Serializable;
/**
 * StatusChange
 */

public class StatusChange  implements Serializable {
  
  private Date dateStatusChanged = null;

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
   * The status the change request transitioned to
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

  private static class PreviousStatusEnumDeserializer extends StdDeserializer<PreviousStatusEnum> {
    public PreviousStatusEnumDeserializer() {
      super(PreviousStatusEnumDeserializer.class);
    }

    @Override
    public PreviousStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PreviousStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status the change request transitioned from
   */
 @JsonDeserialize(using = PreviousStatusEnumDeserializer.class)
  public enum PreviousStatusEnum {
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

    PreviousStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PreviousStatusEnum fromString(String key) {
      if (key == null) return null;

      for (PreviousStatusEnum value : PreviousStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PreviousStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PreviousStatusEnum previousStatus = null;

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
   * The namespace for the status change
   */
 @JsonDeserialize(using = NamespaceEnumDeserializer.class)
  public enum NamespaceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONTACTS("contacts"),
    AGENT_ASSISTANT("agent.assistant"),
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
    COBROWSE("cobrowse"),
    CONTENT_MANAGEMENT("content.management"),
    CONVERSATION("conversation"),
    DATAACTIONS("dataactions"),
    DATATABLES("datatables"),
    DIRECTORY("directory"),
    EMAIL("email"),
    EVENT_ORCHESTRATION("event.orchestration"),
    EXTERNAL_CONTACTS("external.contacts"),
    GCV("gcv"),
    GDPR("gdpr"),
    GROUPS("groups"),
    HISTORICAL_ADHERENCE("historical.adherence"),
    INFRASTRUCTUREASCODE("infrastructureascode"),
    INTEGRATIONS("integrations"),
    INTENT_MINER("intent.miner"),
    JOURNEY("journey"),
    KNOWLEDGE("knowledge"),
    LANGUAGE_UNDERSTANDING("language.understanding"),
    LIMIT_REGISTRY("limit.registry"),
    MARKETPLACE("marketplace"),
    MESSAGING("messaging"),
    NOTIFICATIONS("notifications"),
    ONBOARDING("onboarding"),
    OUTBOUND("outbound"),
    PLATFORM_API("platform.api"),
    PREDICTIVE_ROUTING("predictive.routing"),
    QUALITY("quality"),
    RECORDING("recording"),
    RESPONSE_MANAGEMENT("response.management"),
    ROUTING("routing"),
    SCIM("scim"),
    SEARCH("search"),
    SKILLS("skills"),
    SPEECH_AND_TEXT_ANALYTICS("speech.and.text.analytics"),
    SPEECH_INTEGRATION("speech.integration"),
    SUPPORTABILITY("supportability"),
    TASK_MANAGEMENT("task.management"),
    TELEPHONY_CONFIGURATION("telephony.configuration"),
    WEB_DEPLOYMENTS("web.deployments"),
    WEB_MESSAGING("web.messaging"),
    WEBCHAT("webchat"),
    WEBHOOKS("webhooks"),
    WORKFORCE_MANAGEMENT("workforce.management");

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
  private String message = null;

  private static class RejectReasonEnumDeserializer extends StdDeserializer<RejectReasonEnum> {
    public RejectReasonEnumDeserializer() {
      super(RejectReasonEnumDeserializer.class);
    }

    @Override
    public RejectReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RejectReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason for rejecting the limit override request
   */
 @JsonDeserialize(using = RejectReasonEnumDeserializer.class)
  public enum RejectReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALTERNATIVEEXISTS("AlternativeExists"),
    INCREASENOTREQUIRED("IncreaseNotRequired"),
    PLATFORMMISUSE("PlatformMisuse"),
    PLATFORMSTABILITY("PlatformStability"),
    OTHERREASON("OtherReason");

    private String value;

    RejectReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RejectReasonEnum fromString(String key) {
      if (key == null) return null;

      for (RejectReasonEnum value : RejectReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RejectReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RejectReasonEnum rejectReason = null;

  
  @ApiModelProperty(example = "null", value = "The date of this status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStatusChanged")
  public Date getDateStatusChanged() {
    return dateStatusChanged;
  }


  @ApiModelProperty(example = "null", value = "The status the change request transitioned to")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The status the change request transitioned from")
  @JsonProperty("previousStatus")
  public PreviousStatusEnum getPreviousStatus() {
    return previousStatus;
  }


  @ApiModelProperty(example = "null", value = "The namespace for the status change")
  @JsonProperty("namespace")
  public NamespaceEnum getNamespace() {
    return namespace;
  }


  @ApiModelProperty(example = "null", value = "A short message describing the status change")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }


  @ApiModelProperty(example = "null", value = "The reason for rejecting the limit override request")
  @JsonProperty("rejectReason")
  public RejectReasonEnum getRejectReason() {
    return rejectReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusChange statusChange = (StatusChange) o;

    return Objects.equals(this.dateStatusChanged, statusChange.dateStatusChanged) &&
            Objects.equals(this.status, statusChange.status) &&
            Objects.equals(this.previousStatus, statusChange.previousStatus) &&
            Objects.equals(this.namespace, statusChange.namespace) &&
            Objects.equals(this.message, statusChange.message) &&
            Objects.equals(this.rejectReason, statusChange.rejectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStatusChanged, status, previousStatus, namespace, message, rejectReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusChange {\n");
    
    sb.append("    dateStatusChanged: ").append(toIndentedString(dateStatusChanged)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    previousStatus: ").append(toIndentedString(previousStatus)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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

