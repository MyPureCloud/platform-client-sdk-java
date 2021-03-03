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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditQueryEntity
 */

public class AuditQueryEntity  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Name of the Entity
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DOCUMENT("Document"),
    QUEUE("Queue"),
    RECORDING("Recording"),
    ROLE("Role"),
    VOICEMAILUSERPOLICY("VoicemailUserPolicy"),
    USERPRESENCE("UserPresence"),
    WRAPUPCODE("WrapupCode"),
    MAXORGROUTINGUTILIZATIONCAPACITY("MaxOrgRoutingUtilizationCapacity"),
    ACCESSTOKEN("AccessToken"),
    OAUTHCLIENT("OAuthClient"),
    OAUTHCLIENTAUTHORIZATION("OAuthClientAuthorization"),
    AUTHORGANIZATION("AuthOrganization"),
    AUTHUSER("AuthUser"),
    ORGANIZATIONAUTHORIZATIONTRUST("OrganizationAuthorizationTrust"),
    ORGANIZATIONAUTHORIZATIONUSERTRUST("OrganizationAuthorizationUserTrust"),
    BULKACTIONS("BulkActions"),
    FEEDBACK("Feedback"),
    TOPIC("Topic"),
    PROGRAM("Program"),
    SEGMENT("Segment"),
    OUTCOME("Outcome"),
    SESSIONTYPE("SessionType"),
    EVENTTYPE("EventType"),
    CLICKSTREAMSETTINGS("ClickstreamSettings"),
    SCHEDULE("Schedule"),
    SCHEDULEGROUP("ScheduleGroup"),
    EMERGENCYGROUP("EmergencyGroup"),
    IVR("IVR"),
    TRIGGER("Trigger"),
    RESPONSE("Response"),
    DEPENDENCYTRACKINGBUILD("DependencyTrackingBuild"),
    FLOW("Flow"),
    PROMPT("Prompt"),
    PROMPTRESOURCE("PromptResource"),
    FLOWOUTCOME("FlowOutcome"),
    FLOWMILESTONE("FlowMilestone"),
    TEAM("Team"),
    EDGE("Edge"),
    EDGEGROUP("EdgeGroup"),
    TRUNK("Trunk"),
    TRUNKBASE("TrunkBase"),
    DID("DID"),
    DIDPOOL("DIDPool"),
    EXTENSION("Extension"),
    EXTENSIONPOOL("ExtensionPool"),
    PHONE("Phone"),
    PHONEBASE("PhoneBase"),
    LINE("Line"),
    LINEBASE("LineBase"),
    OUTBOUNDROUTE("OutboundRoute"),
    NUMBERPLAN("NumberPlan"),
    SITE("Site"),
    ATTEMPTLIMITS("AttemptLimits"),
    CALLABLETIMESET("CallableTimeSet"),
    CAMPAIGN("Campaign"),
    CAMPAIGNRULE("CampaignRule"),
    SEQUENCE("Sequence"),
    CONTACTLIST("ContactList"),
    CONTACTLISTFILTER("ContactListFilter"),
    DNCLIST("DNCList"),
    CALLANALYSISRESPONSESET("CallAnalysisResponseSet"),
    RULESET("RuleSet"),
    TRANSCRIPTIONSETTINGS("TranscriptionSettings"),
    SPEECHTEXTANALYTICSSETTINGS("SpeechTextAnalyticsSettings");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;

  private static class ActionsEnumDeserializer extends StdDeserializer<ActionsEnum> {
    public ActionsEnumDeserializer() {
      super(ActionsEnumDeserializer.class);
    }

    @Override
    public ActionsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets actions
   */
 @JsonDeserialize(using = ActionsEnumDeserializer.class)
  public enum ActionsEnum {
    CREATE("Create"),
    VIEW("View"),
    UPDATE("Update"),
    DELETE("Delete"),
    DOWNLOAD("Download"),
    UPLOAD("Upload"),
    MEMBERADD("MemberAdd"),
    MEMBERUPDATE("MemberUpdate"),
    MEMBERREMOVE("MemberRemove"),
    READ("Read"),
    APPLYPROTECTION("ApplyProtection"),
    REVOKEPROTECTION("RevokeProtection"),
    UPDATERETENTION("UpdateRetention"),
    READALL("ReadAll"),
    EXECUTE("Execute"),
    PUBLISH("Publish"),
    UNPUBLISH("Unpublish"),
    ACTIVATE("Activate"),
    CHECKIN("Checkin"),
    CHECKOUT("Checkout"),
    DEACTIVATE("Deactivate"),
    DEBUG("Debug"),
    SAVE("Save"),
    REVERT("Revert"),
    TRANSCODE("Transcode"),
    ENABLE("Enable"),
    DISABLE("Disable"),
    AUTHORIZE("Authorize"),
    DEAUTHORIZE("Deauthorize"),
    AUTHENTICATE("Authenticate"),
    CHANGEPASSWORD("ChangePassword"),
    REVOKE("Revoke"),
    EXPORT("Export"),
    APPEND("Append"),
    RECYCLE("Recycle");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionsEnum fromString(String key) {
      if (key == null) return null;

      for (ActionsEnum value : ActionsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ActionsEnum> actions = new ArrayList<ActionsEnum>();

  
  /**
   * Name of the Entity
   **/
  public AuditQueryEntity name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Entity")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  
  /**
   * List of Actions
   **/
  public AuditQueryEntity actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Actions")
  @JsonProperty("actions")
  public List<ActionsEnum> getActions() {
    return actions;
  }
  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditQueryEntity auditQueryEntity = (AuditQueryEntity) o;
    return Objects.equals(this.name, auditQueryEntity.name) &&
        Objects.equals(this.actions, auditQueryEntity.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditQueryEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

