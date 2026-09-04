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
import com.mypurecloud.sdk.v2.model.AnalyticsAgentStateAgentSessionResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsAgentStateAgentResponse
 */

public class AnalyticsAgentStateAgentResponse  implements Serializable {
  
  private String userId = null;
  private String divisionId = null;
  private String userName = null;
  private String managerId = null;
  private Integer sessionCount = null;
  private List<AnalyticsAgentStateAgentSessionResult> sessions = null;

  private static class SystemPresenceEnumDeserializer extends StdDeserializer<SystemPresenceEnum> {
    public SystemPresenceEnumDeserializer() {
      super(SystemPresenceEnumDeserializer.class);
    }

    @Override
    public SystemPresenceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemPresenceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user's system presence
   */
 @JsonDeserialize(using = SystemPresenceEnumDeserializer.class)
  public enum SystemPresenceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    AVAILABLE("AVAILABLE"),
    AWAY("AWAY"),
    BUSY("BUSY"),
    OFFLINE("OFFLINE"),
    IDLE("IDLE"),
    ON_QUEUE("ON_QUEUE"),
    MEAL("MEAL"),
    TRAINING("TRAINING"),
    MEETING("MEETING"),
    BREAK("BREAK");

    private String value;

    SystemPresenceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemPresenceEnum fromString(String key) {
      if (key == null) return null;

      for (SystemPresenceEnum value : SystemPresenceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemPresenceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemPresenceEnum systemPresence = null;
  private String organizationPresenceId = null;
  private Date presenceDate = null;

  private static class RoutingStatusEnumDeserializer extends StdDeserializer<RoutingStatusEnum> {
    public RoutingStatusEnumDeserializer() {
      super(RoutingStatusEnumDeserializer.class);
    }

    @Override
    public RoutingStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RoutingStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user's routing status
   */
 @JsonDeserialize(using = RoutingStatusEnumDeserializer.class)
  public enum RoutingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    OFF_QUEUE("OFF_QUEUE"),
    IDLE("IDLE"),
    INTERACTING("INTERACTING"),
    NOT_RESPONDING("NOT_RESPONDING"),
    COMMUNICATING("COMMUNICATING");

    private String value;

    RoutingStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoutingStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RoutingStatusEnum value : RoutingStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoutingStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoutingStatusEnum routingStatus = null;
  private Date routingStatusDate = null;
  private Boolean isOutOfOffice = null;
  private String managementUnitId = null;
  private String businessUnitId = null;

  private static class AdherenceStateEnumDeserializer extends StdDeserializer<AdherenceStateEnum> {
    public AdherenceStateEnumDeserializer() {
      super(AdherenceStateEnumDeserializer.class);
    }

    @Override
    public AdherenceStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AdherenceStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user's adherence state
   */
 @JsonDeserialize(using = AdherenceStateEnumDeserializer.class)
  public enum AdherenceStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INADHERENCE("InAdherence"),
    OUTOFADHERENCE("OutOfAdherence"),
    UNSCHEDULED("Unscheduled"),
    UNKNOWN("Unknown"),
    IGNORED("Ignored"),
    EXPLAINED("Explained");

    private String value;

    AdherenceStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AdherenceStateEnum fromString(String key) {
      if (key == null) return null;

      for (AdherenceStateEnum value : AdherenceStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AdherenceStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AdherenceStateEnum adherenceState = null;

  private static class AdherenceImpactEnumDeserializer extends StdDeserializer<AdherenceImpactEnum> {
    public AdherenceImpactEnumDeserializer() {
      super(AdherenceImpactEnumDeserializer.class);
    }

    @Override
    public AdherenceImpactEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AdherenceImpactEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user's adherence impact
   */
 @JsonDeserialize(using = AdherenceImpactEnumDeserializer.class)
  public enum AdherenceImpactEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    POSITIVE("Positive"),
    NEGATIVE("Negative"),
    NEUTRAL("Neutral"),
    UNKNOWN("Unknown");

    private String value;

    AdherenceImpactEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AdherenceImpactEnum fromString(String key) {
      if (key == null) return null;

      for (AdherenceImpactEnum value : AdherenceImpactEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AdherenceImpactEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AdherenceImpactEnum adherenceImpact = null;
  private Date adherenceDate = null;
  private String scheduledActivityCodeId = null;

  private static class ScheduledActivityCategoryEnumDeserializer extends StdDeserializer<ScheduledActivityCategoryEnum> {
    public ScheduledActivityCategoryEnumDeserializer() {
      super(ScheduledActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ScheduledActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScheduledActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user's scheduled activity category
   */
 @JsonDeserialize(using = ScheduledActivityCategoryEnumDeserializer.class)
  public enum ScheduledActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled"),
    UNKNOWN("Unknown");

    private String value;

    ScheduledActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScheduledActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ScheduledActivityCategoryEnum value : ScheduledActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScheduledActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScheduledActivityCategoryEnum scheduledActivityCategory = null;

  private static class ActualActivityCategoryEnumDeserializer extends StdDeserializer<ActualActivityCategoryEnum> {
    public ActualActivityCategoryEnumDeserializer() {
      super(ActualActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ActualActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActualActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user's actual activity category
   */
 @JsonDeserialize(using = ActualActivityCategoryEnumDeserializer.class)
  public enum ActualActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled"),
    UNKNOWN("Unknown");

    private String value;

    ActualActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActualActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ActualActivityCategoryEnum value : ActualActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActualActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActualActivityCategoryEnum actualActivityCategory = null;

  public AnalyticsAgentStateAgentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sessions = new ArrayList<AnalyticsAgentStateAgentSessionResult>();
    }
  }

  public AnalyticsAgentStateAgentResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sessions = new ArrayList<AnalyticsAgentStateAgentSessionResult>();
    }
  }

  
  /**
   * User Id - only returned if division is covered by agentStateNames permission
   **/
  public AnalyticsAgentStateAgentResponse userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Id - only returned if division is covered by agentStateNames permission")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Division Id
   **/
  public AnalyticsAgentStateAgentResponse divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Division Id")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * User name - only returned if division is covered by agentStateNames permission
   **/
  public AnalyticsAgentStateAgentResponse userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User name - only returned if division is covered by agentStateNames permission")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * The user that this user reports to
   **/
  public AnalyticsAgentStateAgentResponse managerId(String managerId) {
    this.managerId = managerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that this user reports to")
  @JsonProperty("managerId")
  public String getManagerId() {
    return managerId;
  }
  public void setManagerId(String managerId) {
    this.managerId = managerId;
  }


  /**
   * The count of sessions
   **/
  public AnalyticsAgentStateAgentResponse sessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of sessions")
  @JsonProperty("sessionCount")
  public Integer getSessionCount() {
    return sessionCount;
  }
  public void setSessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
  }


  /**
   * List of sessions
   **/
  public AnalyticsAgentStateAgentResponse sessions(List<AnalyticsAgentStateAgentSessionResult> sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of sessions")
  @JsonProperty("sessions")
  public List<AnalyticsAgentStateAgentSessionResult> getSessions() {
    return sessions;
  }
  public void setSessions(List<AnalyticsAgentStateAgentSessionResult> sessions) {
    this.sessions = sessions;
  }


  /**
   * The user's system presence
   **/
  public AnalyticsAgentStateAgentResponse systemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's system presence")
  @JsonProperty("systemPresence")
  public SystemPresenceEnum getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
  }


  /**
   * The identifier for the user's organization presence
   **/
  public AnalyticsAgentStateAgentResponse organizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier for the user's organization presence")
  @JsonProperty("organizationPresenceId")
  public String getOrganizationPresenceId() {
    return organizationPresenceId;
  }
  public void setOrganizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
  }


  /**
   * The timestamp for when the user's presence began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentResponse presenceDate(Date presenceDate) {
    this.presenceDate = presenceDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp for when the user's presence began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("presenceDate")
  public Date getPresenceDate() {
    return presenceDate;
  }
  public void setPresenceDate(Date presenceDate) {
    this.presenceDate = presenceDate;
  }


  /**
   * The user's routing status
   **/
  public AnalyticsAgentStateAgentResponse routingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's routing status")
  @JsonProperty("routingStatus")
  public RoutingStatusEnum getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
  }


  /**
   * The timestamp for when the user's routing status began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentResponse routingStatusDate(Date routingStatusDate) {
    this.routingStatusDate = routingStatusDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp for when the user's routing status began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("routingStatusDate")
  public Date getRoutingStatusDate() {
    return routingStatusDate;
  }
  public void setRoutingStatusDate(Date routingStatusDate) {
    this.routingStatusDate = routingStatusDate;
  }


  /**
   * Whether the user is out of office
   **/
  public AnalyticsAgentStateAgentResponse isOutOfOffice(Boolean isOutOfOffice) {
    this.isOutOfOffice = isOutOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the user is out of office")
  @JsonProperty("isOutOfOffice")
  public Boolean getIsOutOfOffice() {
    return isOutOfOffice;
  }
  public void setIsOutOfOffice(Boolean isOutOfOffice) {
    this.isOutOfOffice = isOutOfOffice;
  }


  /**
   * The id of the user's management unit
   **/
  public AnalyticsAgentStateAgentResponse managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the user's management unit")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * The id of the user's business unit
   **/
  public AnalyticsAgentStateAgentResponse businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the user's business unit")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }


  /**
   * The user's adherence state
   **/
  public AnalyticsAgentStateAgentResponse adherenceState(AdherenceStateEnum adherenceState) {
    this.adherenceState = adherenceState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's adherence state")
  @JsonProperty("adherenceState")
  public AdherenceStateEnum getAdherenceState() {
    return adherenceState;
  }
  public void setAdherenceState(AdherenceStateEnum adherenceState) {
    this.adherenceState = adherenceState;
  }


  /**
   * The user's adherence impact
   **/
  public AnalyticsAgentStateAgentResponse adherenceImpact(AdherenceImpactEnum adherenceImpact) {
    this.adherenceImpact = adherenceImpact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's adherence impact")
  @JsonProperty("adherenceImpact")
  public AdherenceImpactEnum getAdherenceImpact() {
    return adherenceImpact;
  }
  public void setAdherenceImpact(AdherenceImpactEnum adherenceImpact) {
    this.adherenceImpact = adherenceImpact;
  }


  /**
   * The timestamp for when the user's adherence state began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsAgentStateAgentResponse adherenceDate(Date adherenceDate) {
    this.adherenceDate = adherenceDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp for when the user's adherence state began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("adherenceDate")
  public Date getAdherenceDate() {
    return adherenceDate;
  }
  public void setAdherenceDate(Date adherenceDate) {
    this.adherenceDate = adherenceDate;
  }


  /**
   * The id of the user's scheduled activity code
   **/
  public AnalyticsAgentStateAgentResponse scheduledActivityCodeId(String scheduledActivityCodeId) {
    this.scheduledActivityCodeId = scheduledActivityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the user's scheduled activity code")
  @JsonProperty("scheduledActivityCodeId")
  public String getScheduledActivityCodeId() {
    return scheduledActivityCodeId;
  }
  public void setScheduledActivityCodeId(String scheduledActivityCodeId) {
    this.scheduledActivityCodeId = scheduledActivityCodeId;
  }


  /**
   * The user's scheduled activity category
   **/
  public AnalyticsAgentStateAgentResponse scheduledActivityCategory(ScheduledActivityCategoryEnum scheduledActivityCategory) {
    this.scheduledActivityCategory = scheduledActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's scheduled activity category")
  @JsonProperty("scheduledActivityCategory")
  public ScheduledActivityCategoryEnum getScheduledActivityCategory() {
    return scheduledActivityCategory;
  }
  public void setScheduledActivityCategory(ScheduledActivityCategoryEnum scheduledActivityCategory) {
    this.scheduledActivityCategory = scheduledActivityCategory;
  }


  /**
   * The user's actual activity category
   **/
  public AnalyticsAgentStateAgentResponse actualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's actual activity category")
  @JsonProperty("actualActivityCategory")
  public ActualActivityCategoryEnum getActualActivityCategory() {
    return actualActivityCategory;
  }
  public void setActualActivityCategory(ActualActivityCategoryEnum actualActivityCategory) {
    this.actualActivityCategory = actualActivityCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAgentStateAgentResponse analyticsAgentStateAgentResponse = (AnalyticsAgentStateAgentResponse) o;

    return Objects.equals(this.userId, analyticsAgentStateAgentResponse.userId) &&
            Objects.equals(this.divisionId, analyticsAgentStateAgentResponse.divisionId) &&
            Objects.equals(this.userName, analyticsAgentStateAgentResponse.userName) &&
            Objects.equals(this.managerId, analyticsAgentStateAgentResponse.managerId) &&
            Objects.equals(this.sessionCount, analyticsAgentStateAgentResponse.sessionCount) &&
            Objects.equals(this.sessions, analyticsAgentStateAgentResponse.sessions) &&
            Objects.equals(this.systemPresence, analyticsAgentStateAgentResponse.systemPresence) &&
            Objects.equals(this.organizationPresenceId, analyticsAgentStateAgentResponse.organizationPresenceId) &&
            Objects.equals(this.presenceDate, analyticsAgentStateAgentResponse.presenceDate) &&
            Objects.equals(this.routingStatus, analyticsAgentStateAgentResponse.routingStatus) &&
            Objects.equals(this.routingStatusDate, analyticsAgentStateAgentResponse.routingStatusDate) &&
            Objects.equals(this.isOutOfOffice, analyticsAgentStateAgentResponse.isOutOfOffice) &&
            Objects.equals(this.managementUnitId, analyticsAgentStateAgentResponse.managementUnitId) &&
            Objects.equals(this.businessUnitId, analyticsAgentStateAgentResponse.businessUnitId) &&
            Objects.equals(this.adherenceState, analyticsAgentStateAgentResponse.adherenceState) &&
            Objects.equals(this.adherenceImpact, analyticsAgentStateAgentResponse.adherenceImpact) &&
            Objects.equals(this.adherenceDate, analyticsAgentStateAgentResponse.adherenceDate) &&
            Objects.equals(this.scheduledActivityCodeId, analyticsAgentStateAgentResponse.scheduledActivityCodeId) &&
            Objects.equals(this.scheduledActivityCategory, analyticsAgentStateAgentResponse.scheduledActivityCategory) &&
            Objects.equals(this.actualActivityCategory, analyticsAgentStateAgentResponse.actualActivityCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, divisionId, userName, managerId, sessionCount, sessions, systemPresence, organizationPresenceId, presenceDate, routingStatus, routingStatusDate, isOutOfOffice, managementUnitId, businessUnitId, adherenceState, adherenceImpact, adherenceDate, scheduledActivityCodeId, scheduledActivityCategory, actualActivityCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAgentStateAgentResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    organizationPresenceId: ").append(toIndentedString(organizationPresenceId)).append("\n");
    sb.append("    presenceDate: ").append(toIndentedString(presenceDate)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    routingStatusDate: ").append(toIndentedString(routingStatusDate)).append("\n");
    sb.append("    isOutOfOffice: ").append(toIndentedString(isOutOfOffice)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    adherenceState: ").append(toIndentedString(adherenceState)).append("\n");
    sb.append("    adherenceImpact: ").append(toIndentedString(adherenceImpact)).append("\n");
    sb.append("    adherenceDate: ").append(toIndentedString(adherenceDate)).append("\n");
    sb.append("    scheduledActivityCodeId: ").append(toIndentedString(scheduledActivityCodeId)).append("\n");
    sb.append("    scheduledActivityCategory: ").append(toIndentedString(scheduledActivityCategory)).append("\n");
    sb.append("    actualActivityCategory: ").append(toIndentedString(actualActivityCategory)).append("\n");
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

