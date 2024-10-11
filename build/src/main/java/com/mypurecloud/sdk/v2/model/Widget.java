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
import com.mypurecloud.sdk.v2.model.ViewFilter;
import com.mypurecloud.sdk.v2.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Widget
 */

public class Widget  implements Serializable {
  
  private Integer row = null;
  private Integer column = null;
  private String title = null;

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
   * The type of dashboard widget configuration.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    METRIC("METRIC"),
    CHART("CHART"),
    PIE("PIE"),
    HEAT_MAP("HEAT_MAP"),
    FREE_TEXT("FREE_TEXT"),
    AGENT_STATUS("AGENT_STATUS"),
    REALTIME_ADHERENCE("REALTIME_ADHERENCE"),
    WEB_CONTENT_URL("WEB_CONTENT_URL");

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

  private static class MetricsEnumDeserializer extends StdDeserializer<MetricsEnum> {
    public MetricsEnumDeserializer() {
      super(MetricsEnumDeserializer.class);
    }

    @Override
    public MetricsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets metrics
   */
 @JsonDeserialize(using = MetricsEnumDeserializer.class)
  public enum MetricsEnum {
    AVG_TALK_TIME("AVG_TALK_TIME"),
    AVG_HOLD_TIME("AVG_HOLD_TIME"),
    AVG_ACW_TIME("AVG_ACW_TIME"),
    AVG_WAIT_TIME("AVG_WAIT_TIME"),
    AVG_HANDLE_TIME("AVG_HANDLE_TIME"),
    AVG_ALERT_TIME("AVG_ALERT_TIME"),
    AVG_ANSWER_TIME("AVG_ANSWER_TIME"),
    AVG_ABANDON_TIME("AVG_ABANDON_TIME"),
    TOTAL_TALK_TIME("TOTAL_TALK_TIME"),
    TOTAL_HANDLE_TIME("TOTAL_HANDLE_TIME"),
    TOTAL_HOLD_TIME("TOTAL_HOLD_TIME"),
    TOTAL_ACW_TIME("TOTAL_ACW_TIME"),
    TOTAL_ALERT_TIME("TOTAL_ALERT_TIME"),
    MAX_ABANDON_TIME("MAX_ABANDON_TIME"),
    MAX_WAIT_TIME("MAX_WAIT_TIME"),
    MAX_TALK_TIME("MAX_TALK_TIME"),
    MAX_HOLD_TIME("MAX_HOLD_TIME"),
    MAX_ACW_TIME("MAX_ACW_TIME"),
    MIN_ABANDON_TIME("MIN_ABANDON_TIME"),
    MIN_WAIT_TIME("MIN_WAIT_TIME"),
    MIN_TALK_TIME("MIN_TALK_TIME"),
    MIN_HOLD_TIME("MIN_HOLD_TIME"),
    MIN_ACW_TIME("MIN_ACW_TIME"),
    ALERT_COUNT("ALERT_COUNT"),
    OFFERED_COUNT("OFFERED_COUNT"),
    ABANDONED_COUNT("ABANDONED_COUNT"),
    ABANDONED_PERCENT("ABANDONED_PERCENT"),
    SHORT_ABANDONED_COUNT("SHORT_ABANDONED_COUNT"),
    SHORT_ABANDONED_PERCENT("SHORT_ABANDONED_PERCENT"),
    ABANDONED_NO_SHORT_COUNT("ABANDONED_NO_SHORT_COUNT"),
    ABANDONED_NO_SHORT_PERCENT("ABANDONED_NO_SHORT_PERCENT"),
    ANSWERED_COUNT("ANSWERED_COUNT"),
    ANSWERED_PERCENT("ANSWERED_PERCENT"),
    FLOWOUT_COUNT("FLOWOUT_COUNT"),
    FLOWOUT_PERCENT("FLOWOUT_PERCENT"),
    OUTBOUND_COUNT("OUTBOUND_COUNT"),
    OUTBOUND_ATTEMPTED_COUNT("OUTBOUND_ATTEMPTED_COUNT"),
    VOICEMAIL_COUNT("VOICEMAIL_COUNT"),
    HANDLED_COUNT("HANDLED_COUNT"),
    HELD_COUNT("HELD_COUNT"),
    TRANSFERRED_COUNT("TRANSFERRED_COUNT"),
    TRANSFERRED_PERCENT("TRANSFERRED_PERCENT"),
    WAITING_CURRENT("WAITING_CURRENT"),
    INTERACTING_CURRENT("INTERACTING_CURRENT"),
    HELD_CURRENT("HELD_CURRENT"),
    ALERTING_CURRENT("ALERTING_CURRENT"),
    SERVICE_LEVEL("SERVICE_LEVEL"),
    OVER_SERVICE_LEVEL("OVER_SERVICE_LEVEL"),
    ONLINE_AGENTS("ONLINE_AGENTS"),
    AVAILABLE_AGENTS("AVAILABLE_AGENTS"),
    AWAY_AGENTS("AWAY_AGENTS"),
    BREAK_AGENTS("BREAK_AGENTS"),
    MEAL_AGENTS("MEAL_AGENTS"),
    TRAINING_AGENTS("TRAINING_AGENTS"),
    BUSY_AGENTS("BUSY_AGENTS"),
    MEETING_AGENTS("MEETING_AGENTS"),
    SYSTEM_AWAY_AGENTS("SYSTEM_AWAY_AGENTS"),
    OFFLINE_AGENTS("OFFLINE_AGENTS"),
    ON_QUEUE_AGENTS("ON_QUEUE_AGENTS"),
    OFF_QUEUE_AGENTS("OFF_QUEUE_AGENTS"),
    INTERACTING_AGENTS("INTERACTING_AGENTS"),
    ACW_AGENTS("ACW_AGENTS"),
    COMMUNICATING_AGENTS("COMMUNICATING_AGENTS"),
    IDLE_AGENTS("IDLE_AGENTS"),
    NOT_RESPONDING_AGENTS("NOT_RESPONDING_AGENTS"),
    LONGEST_WAITING("LONGEST_WAITING"),
    LONGEST_INTERACTING("LONGEST_INTERACTING"),
    FLOW_ACTIVE_LONGEST("FLOW_ACTIVE_LONGEST"),
    FLOW_ACTIVE_CURRENT("FLOW_ACTIVE_CURRENT"),
    FLOW_ENTRIES_COUNT("FLOW_ENTRIES_COUNT"),
    FLOW_TOTAL_DURATION("FLOW_TOTAL_DURATION"),
    FLOW_MAX_DURATION("FLOW_MAX_DURATION"),
    FLOW_AVG_DURATION("FLOW_AVG_DURATION"),
    FLOW_DISCONNECT_COUNT("FLOW_DISCONNECT_COUNT"),
    FLOW_DISCONNECT_PERCENT("FLOW_DISCONNECT_PERCENT"),
    FLOW_TOTAL_DISCONNECT_DURATION("FLOW_TOTAL_DISCONNECT_DURATION"),
    FLOW_AVG_DISCONNECT_DURATION("FLOW_AVG_DISCONNECT_DURATION"),
    FLOW_MAX_DISCONNECT_DURATION("FLOW_MAX_DISCONNECT_DURATION"),
    FLOW_FLOW_DISCONNECT("FLOW_FLOW_DISCONNECT"),
    FLOW_FLOW_DISCONNECT_PERCENT("FLOW_FLOW_DISCONNECT_PERCENT"),
    FLOW_SYSTEM_ERROR_DISCONNECT("FLOW_SYSTEM_ERROR_DISCONNECT"),
    FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT("FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT"),
    FLOW_CUSTOMER_DISCONNECT("FLOW_CUSTOMER_DISCONNECT"),
    FLOW_CUSTOMER_DISCONNECT_PERCENT("FLOW_CUSTOMER_DISCONNECT_PERCENT"),
    FLOW_SHORT_DISCONNECT("FLOW_SHORT_DISCONNECT"),
    FLOW_SHORT_DISCONNECT_PERCENT("FLOW_SHORT_DISCONNECT_PERCENT"),
    FLOW_EXIT_COUNT("FLOW_EXIT_COUNT"),
    FLOW_EXIT_PERCENT("FLOW_EXIT_PERCENT"),
    FLOW_TOTAL_EXIT_DURATION("FLOW_TOTAL_EXIT_DURATION"),
    FLOW_MAX_EXIT_DURATION("FLOW_MAX_EXIT_DURATION"),
    FLOW_AVG_EXIT_DURATION("FLOW_AVG_EXIT_DURATION"),
    FLOW_ACD_EXIT_COUNT("FLOW_ACD_EXIT_COUNT"),
    FLOW_ACD_EXIT_PERCENT("FLOW_ACD_EXIT_PERCENT"),
    FLOW_GROUP_EXIT_COUNT("FLOW_GROUP_EXIT_COUNT"),
    FLOW_GROUP_EXIT_PERCENT("FLOW_GROUP_EXIT_PERCENT"),
    FLOW_NUMBER_EXIT_COUNT("FLOW_NUMBER_EXIT_COUNT"),
    FLOW_NUMBER_EXIT_PERCENT("FLOW_NUMBER_EXIT_PERCENT"),
    FLOW_USER_EXIT_COUNT("FLOW_USER_EXIT_COUNT"),
    FLOW_USER_EXIT_PERCENT("FLOW_USER_EXIT_PERCENT"),
    FLOW_FLOW_EXIT_COUNT("FLOW_FLOW_EXIT_COUNT"),
    FLOW_FLOW_EXIT_PERCENT("FLOW_FLOW_EXIT_PERCENT"),
    FLOW_SECURE_FLOW_EXIT_COUNT("FLOW_SECURE_FLOW_EXIT_COUNT"),
    FLOW_SECURE_FLOW_EXIT_PERCENT("FLOW_SECURE_FLOW_EXIT_PERCENT"),
    FLOW_ACD_VOICEMAIL_EXIT_COUNT("FLOW_ACD_VOICEMAIL_EXIT_COUNT"),
    FLOW_ACD_VOICEMAIL_EXIT_PERCENT("FLOW_ACD_VOICEMAIL_EXIT_PERCENT"),
    FLOW_USER_VOICEMAIL_EXIT_COUNT("FLOW_USER_VOICEMAIL_EXIT_COUNT"),
    FLOW_USER_VOICEMAIL_EXIT_PERCENT("FLOW_USER_VOICEMAIL_EXIT_PERCENT"),
    FLOW_OUTCOME_COUNT("FLOW_OUTCOME_COUNT"),
    FLOW_AVG_OUTCOME_DECIMAL("FLOW_AVG_OUTCOME_DECIMAL"),
    FLOW_OUTCOME_FAILURE_COUNT("FLOW_OUTCOME_FAILURE_COUNT"),
    FLOW_OUTCOME_FAILURE_PERCENT("FLOW_OUTCOME_FAILURE_PERCENT"),
    FLOW_OUTCOME_SUCCESS_COUNT("FLOW_OUTCOME_SUCCESS_COUNT"),
    FLOW_OUTCOME_SUCCESS_PERCENT("FLOW_OUTCOME_SUCCESS_PERCENT"),
    FLOW_OUTCOME_TOTAL_DURATION("FLOW_OUTCOME_TOTAL_DURATION"),
    FLOW_OUTCOME_MAX_DURATION("FLOW_OUTCOME_MAX_DURATION"),
    FLOW_OUTCOME_AVG_DURATION("FLOW_OUTCOME_AVG_DURATION"),
    FLOW_OUTCOME_MIN_DURATION("FLOW_OUTCOME_MIN_DURATION"),
    OFF_QUEUE_TIME("OFF_QUEUE_TIME"),
    OFF_QUEUE_PERCENT("OFF_QUEUE_PERCENT"),
    AVAILABLE_TIME("AVAILABLE_TIME"),
    AVAILABLE_PERCENT("AVAILABLE_PERCENT"),
    BUSY_TIME("BUSY_TIME"),
    BUSY_PERCENT("BUSY_PERCENT"),
    AWAY_TIME("AWAY_TIME"),
    AWAY_PERCENT("AWAY_PERCENT"),
    BREAK_TIME("BREAK_TIME"),
    BREAK_PERCENT("BREAK_PERCENT"),
    MEAL_TIME("MEAL_TIME"),
    MEAL_PERCENT("MEAL_PERCENT"),
    MEETING_TIME("MEETING_TIME"),
    MEETING_PERCENT("MEETING_PERCENT"),
    TRAINING_TIME("TRAINING_TIME"),
    TRAINING_PERCENT("TRAINING_PERCENT"),
    INTERACTING_TIME("INTERACTING_TIME"),
    INTERACTING_PERCENT("INTERACTING_PERCENT"),
    COMMUNICATING_TIME("COMMUNICATING_TIME"),
    COMMUNICATING_PERCENT("COMMUNICATING_PERCENT"),
    SYSTEM_AWAY_TIME("SYSTEM_AWAY_TIME"),
    SYSTEM_AWAY_PERCENT("SYSTEM_AWAY_PERCENT"),
    ON_QUEUE_TIME("ON_QUEUE_TIME"),
    ON_QUEUE_PERCENT("ON_QUEUE_PERCENT"),
    IDLE_TIME("IDLE_TIME"),
    IDLE_PERCENT("IDLE_PERCENT"),
    NOT_RESPONDING_TIME("NOT_RESPONDING_TIME"),
    NOT_RESPONDING_PERCENT("NOT_RESPONDING_PERCENT"),
    LOGGED_IN_TIME("LOGGED_IN_TIME"),
    OCCUPANCY_PERCENT("OCCUPANCY_PERCENT"),
    MIN_ALERT_TIME("MIN_ALERT_TIME"),
    MAX_ALERT_TIME("MAX_ALERT_TIME"),
    MIN_HANDLE_TIME("MIN_HANDLE_TIME"),
    MAX_HANDLE_TIME("MAX_HANDLE_TIME"),
    MIN_ANSWERED_TIME("MIN_ANSWERED_TIME"),
    MAX_ANSWERED_TIME("MAX_ANSWERED_TIME"),
    MIN_NOT_RESPONDING_TIME("MIN_NOT_RESPONDING_TIME"),
    MAX_NOT_RESPONDING_TIME("MAX_NOT_RESPONDING_TIME"),
    MET_SERVICE_LEVEL("MET_SERVICE_LEVEL"),
    WFM_ADHERENCE_STATUS("WFM_ADHERENCE_STATUS"),
    WFM_SCHEDULED_ACTIVITY("WFM_SCHEDULED_ACTIVITY"),
    WFM_ADHERENCE_DURATION("WFM_ADHERENCE_DURATION"),
    AGENT_TITLE("AGENT_TITLE"),
    AGENT_DEPARTMENT("AGENT_DEPARTMENT"),
    AGENT_EXTENSION("AGENT_EXTENSION"),
    AGENT_SKILLS("AGENT_SKILLS"),
    AGENT_LOCATION("AGENT_LOCATION"),
    AGENT_REPORTS_TO("AGENT_REPORTS_TO"),
    AGENT_EMAIL("AGENT_EMAIL"),
    AGENT_ROLE("AGENT_ROLE"),
    AGENT_GROUP("AGENT_GROUP"),
    AGENT_TIME_IN_STATUS("AGENT_TIME_IN_STATUS"),
    AGENT_TIME_IN_ROUTING_STATUS("AGENT_TIME_IN_ROUTING_STATUS"),
    AGENT_STATUS("AGENT_STATUS"),
    AGENT_SECONDARY_STATUS("AGENT_SECONDARY_STATUS"),
    AGENT_ROUTING_STATUS("AGENT_ROUTING_STATUS"),
    AGENT_MEDIA_TYPES("AGENT_MEDIA_TYPES"),
    ACW_COUNT("ACW_COUNT"),
    ANSWER_TRANSFERRED_PERCENT("ANSWER_TRANSFERRED_PERCENT"),
    FLOW_AVG_MILESTONE_DECIMAL("FLOW_AVG_MILESTONE_DECIMAL"),
    NOT_RESPONDING_COUNT("NOT_RESPONDING_COUNT"),
    AVG_ACW_HANDLED("AVG_ACW_HANDLED"),
    AVG_CONTACTING_TIME("AVG_CONTACTING_TIME"),
    AVG_DIALING_TIME("AVG_DIALING_TIME"),
    AVG_FLOWOUT_TIME("AVG_FLOWOUT_TIME"),
    AVG_HOLD_HANDLED("AVG_HOLD_HANDLED"),
    AVG_MONITOR("AVG_MONITOR"),
    BLIND_TRANSFER_COUNT("BLIND_TRANSFER_COUNT"),
    BLIND_TRANSFER_PERCENT("BLIND_TRANSFER_PERCENT"),
    CONNECTED_COUNT("CONNECTED_COUNT"),
    CONSULT_COUNT("CONSULT_COUNT"),
    CONSULT_TRANSFER_COUNT("CONSULT_TRANSFER_COUNT"),
    CONSULT_TRANSFER_PERCENT("CONSULT_TRANSFER_PERCENT"),
    CONTACTING_COUNT("CONTACTING_COUNT"),
    DIALING_COUNT("DIALING_COUNT"),
    ERROR_COUNT("ERROR_COUNT"),
    EXTERNAL_MEDIA_COUNT("EXTERNAL_MEDIA_COUNT"),
    MAX_CONTACTING_TIME("MAX_CONTACTING_TIME"),
    MAX_DIALING_TIME("MAX_DIALING_TIME"),
    MAX_FLOWOUT_TIME("MAX_FLOWOUT_TIME"),
    FLOW_MILESTONE_COUNT("FLOW_MILESTONE_COUNT"),
    MIN_FLOWOUT_TIME("MIN_FLOWOUT_TIME"),
    MAX_MONITOR("MAX_MONITOR"),
    MIN_CONTACTING_TIME("MIN_CONTACTING_TIME"),
    MIN_DIALING_TIME("MIN_DIALING_TIME"),
    MIN_MONITOR("MIN_MONITOR"),
    MONITOR_COUNT("MONITOR_COUNT"),
    MEDIA_COUNT("MEDIA_COUNT"),
    SERVICE_LEVEL_TARGET("SERVICE_LEVEL_TARGET"),
    SERVICE_LEVEL_TARGET_CURRENT("SERVICE_LEVEL_TARGET_CURRENT"),
    TALK_COUNT("TALK_COUNT"),
    TOTAL_ABANDON_TIME("TOTAL_ABANDON_TIME"),
    TOTAL_NOT_RESPONDING_TIME("TOTAL_NOT_RESPONDING_TIME"),
    TOTAL_CONTACTING("TOTAL_CONTACTING"),
    TOTAL_DIALING("TOTAL_DIALING"),
    TOTAL_MONITOR("TOTAL_MONITOR"),
    TOTAL_WAIT_TIME("TOTAL_WAIT_TIME"),
    WAIT_COUNT("WAIT_COUNT"),
    PARK_COUNT("PARK_COUNT"),
    AVG_PARK_TIME("AVG_PARK_TIME"),
    TOTAL_PARK_TIME("TOTAL_PARK_TIME"),
    MIN_PARK_TIME("MIN_PARK_TIME"),
    MAX_PARK_TIME("MAX_PARK_TIME");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricsEnum fromString(String key) {
      if (key == null) return null;

      for (MetricsEnum value : MetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MetricsEnum> metrics = new ArrayList<MetricsEnum>();
  private String displayText = null;
  private String displayTextColor = null;
  private String webContentUrl = null;
  private Boolean splitFilters = null;
  private Boolean splitByMediaType = null;
  private Boolean showLongest = null;
  private Boolean displayAsTable = null;
  private Boolean showDuration = null;

  private static class SortOrderEnumDeserializer extends StdDeserializer<SortOrderEnum> {
    public SortOrderEnumDeserializer() {
      super(SortOrderEnumDeserializer.class);
    }

    @Override
    public SortOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The sort order of the table.
   */
 @JsonDeserialize(using = SortOrderEnumDeserializer.class)
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASCENDING("ascending"),
    DESCENDING("descending");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (SortOrderEnum value : SortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortOrderEnum sortOrder = null;

  private static class SortKeyEnumDeserializer extends StdDeserializer<SortKeyEnum> {
    public SortKeyEnumDeserializer() {
      super(SortKeyEnumDeserializer.class);
    }

    @Override
    public SortKeyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortKeyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The sort key of the table.
   */
 @JsonDeserialize(using = SortKeyEnumDeserializer.class)
  public enum SortKeyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NAME("Name"),
    DURATION("Duration");

    private String value;

    SortKeyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortKeyEnum fromString(String key) {
      if (key == null) return null;

      for (SortKeyEnum value : SortKeyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortKeyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortKeyEnum sortKey = null;
  private Integer entityLimit = null;
  private Boolean displayAggregates = null;
  private Boolean isFullWidth = null;
  private Boolean showPercentageChange = null;
  private Boolean showProfilePicture = null;
  private ViewFilter filter = null;

  private static class PeriodsEnumDeserializer extends StdDeserializer<PeriodsEnum> {
    public PeriodsEnumDeserializer() {
      super(PeriodsEnumDeserializer.class);
    }

    @Override
    public PeriodsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PeriodsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets periods
   */
 @JsonDeserialize(using = PeriodsEnumDeserializer.class)
  public enum PeriodsEnum {
    NONE("NONE"),
    CURRENT_HALF_HOUR("CURRENT_HALF_HOUR"),
    TODAY("TODAY"),
    YESTERDAY("YESTERDAY"),
    THIS_WEEK("THIS_WEEK"),
    LAST_WEEK("LAST_WEEK"),
    THIS_MONTH("THIS_MONTH"),
    LAST_MONTH("LAST_MONTH"),
    PRIOR_7_DAYS("PRIOR_7_DAYS"),
    PAST_7_DAYS_TO_DATE("PAST_7_DAYS_TO_DATE"),
    PRIOR_30_DAYS("PRIOR_30_DAYS"),
    PAST_30_DAYS_TO_DATE("PAST_30_DAYS_TO_DATE"),
    PRIOR_3_MONTHS("PRIOR_3_MONTHS");

    private String value;

    PeriodsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PeriodsEnum fromString(String key) {
      if (key == null) return null;

      for (PeriodsEnum value : PeriodsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PeriodsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<PeriodsEnum> periods = new ArrayList<PeriodsEnum>();

  private static class MediaTypesEnumDeserializer extends StdDeserializer<MediaTypesEnum> {
    public MediaTypesEnumDeserializer() {
      super(MediaTypesEnumDeserializer.class);
    }

    @Override
    public MediaTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaTypes
   */
 @JsonDeserialize(using = MediaTypesEnumDeserializer.class)
  public enum MediaTypesEnum {
    CALLBACK("callback"),
    CHAT("chat"),
    COBROWSE("cobrowse"),
    EMAIL("email"),
    INTERNALMESSAGE("internalmessage"),
    MESSAGE("message"),
    SCREENSHARE("screenshare"),
    UNKNOWN("unknown"),
    VIDEO("video"),
    VOICE("voice");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();
  private List<Warning> warnings = new ArrayList<Warning>();
  private Boolean showTimeInStatus = null;
  private Boolean showOfflineAgents = null;

  private static class SelectedStatusesEnumDeserializer extends StdDeserializer<SelectedStatusesEnum> {
    public SelectedStatusesEnumDeserializer() {
      super(SelectedStatusesEnumDeserializer.class);
    }

    @Override
    public SelectedStatusesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SelectedStatusesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets selectedStatuses
   */
 @JsonDeserialize(using = SelectedStatusesEnumDeserializer.class)
  public enum SelectedStatusesEnum {
    AVAILABLE("Available"),
    AWAY("Away"),
    BUSY("Busy"),
    BREAK("Break"),
    MEETING("Meeting"),
    TRAINING("Training"),
    MEAL("Meal"),
    SYSTEMAWAY("SystemAway"),
    ONQUEUE("OnQueue"),
    INTERACTING("Interacting"),
    NOTRESPONDING("NotResponding"),
    IDLE("Idle"),
    COMMUNICATING("Communicating"),
    OFFQUEUE("OffQueue"),
    ONLINE("Online"),
    OFFLINE("Offline");

    private String value;

    SelectedStatusesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SelectedStatusesEnum fromString(String key) {
      if (key == null) return null;

      for (SelectedStatusesEnum value : SelectedStatusesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SelectedStatusesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SelectedStatusesEnum> selectedStatuses = new ArrayList<SelectedStatusesEnum>();

  private static class AgentInteractionSortOrderEnumDeserializer extends StdDeserializer<AgentInteractionSortOrderEnum> {
    public AgentInteractionSortOrderEnumDeserializer() {
      super(AgentInteractionSortOrderEnumDeserializer.class);
    }

    @Override
    public AgentInteractionSortOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AgentInteractionSortOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The sort order of the interactions in the agent status widget.
   */
 @JsonDeserialize(using = AgentInteractionSortOrderEnumDeserializer.class)
  public enum AgentInteractionSortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASCENDING("ascending"),
    DESCENDING("descending");

    private String value;

    AgentInteractionSortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AgentInteractionSortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (AgentInteractionSortOrderEnum value : AgentInteractionSortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AgentInteractionSortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AgentInteractionSortOrderEnum agentInteractionSortOrder = null;

  
  /**
   * The row number for the specific dashboard widget configuration.
   **/
  public Widget row(Integer row) {
    this.row = row;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The row number for the specific dashboard widget configuration.")
  @JsonProperty("row")
  public Integer getRow() {
    return row;
  }
  public void setRow(Integer row) {
    this.row = row;
  }


  /**
   * The column number for the specific dashboard widget configuration.
   **/
  public Widget column(Integer column) {
    this.column = column;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column number for the specific dashboard widget configuration.")
  @JsonProperty("column")
  public Integer getColumn() {
    return column;
  }
  public void setColumn(Integer column) {
    this.column = column;
  }


  /**
   * The title for the dashboard widget configuration.
   **/
  public Widget title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The title for the dashboard widget configuration.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The type of dashboard widget configuration.
   **/
  public Widget type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of dashboard widget configuration.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The list of metrics for the dashboard widget configuration.
   **/
  public Widget metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of metrics for the dashboard widget configuration.")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }


  /**
   * The display text for the dashboard widget configuration.
   **/
  public Widget displayText(String displayText) {
    this.displayText = displayText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display text for the dashboard widget configuration.")
  @JsonProperty("displayText")
  public String getDisplayText() {
    return displayText;
  }
  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }


  /**
   * The color of the display text for the dashboard widget configuration in RGB hexadecimal format (for example \"#FF0000\" represents red).
   **/
  public Widget displayTextColor(String displayTextColor) {
    this.displayTextColor = displayTextColor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The color of the display text for the dashboard widget configuration in RGB hexadecimal format (for example \"#FF0000\" represents red).")
  @JsonProperty("displayTextColor")
  public String getDisplayTextColor() {
    return displayTextColor;
  }
  public void setDisplayTextColor(String displayTextColor) {
    this.displayTextColor = displayTextColor;
  }


  /**
   * The external web URL for the dashboard widget configuration.
   **/
  public Widget webContentUrl(String webContentUrl) {
    this.webContentUrl = webContentUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external web URL for the dashboard widget configuration.")
  @JsonProperty("webContentUrl")
  public String getWebContentUrl() {
    return webContentUrl;
  }
  public void setWebContentUrl(String webContentUrl) {
    this.webContentUrl = webContentUrl;
  }


  /**
   * Indicates each filter to be displayed individually.
   **/
  public Widget splitFilters(Boolean splitFilters) {
    this.splitFilters = splitFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates each filter to be displayed individually.")
  @JsonProperty("splitFilters")
  public Boolean getSplitFilters() {
    return splitFilters;
  }
  public void setSplitFilters(Boolean splitFilters) {
    this.splitFilters = splitFilters;
  }


  /**
   * Indicates that data for each media type should be shown individually.
   **/
  public Widget splitByMediaType(Boolean splitByMediaType) {
    this.splitByMediaType = splitByMediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that data for each media type should be shown individually.")
  @JsonProperty("splitByMediaType")
  public Boolean getSplitByMediaType() {
    return splitByMediaType;
  }
  public void setSplitByMediaType(Boolean splitByMediaType) {
    this.splitByMediaType = splitByMediaType;
  }


  /**
   * Indicates the display be the longest time.
   **/
  public Widget showLongest(Boolean showLongest) {
    this.showLongest = showLongest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the display be the longest time.")
  @JsonProperty("showLongest")
  public Boolean getShowLongest() {
    return showLongest;
  }
  public void setShowLongest(Boolean showLongest) {
    this.showLongest = showLongest;
  }


  /**
   * Indicates the widget to be displayed as table.
   **/
  public Widget displayAsTable(Boolean displayAsTable) {
    this.displayAsTable = displayAsTable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the widget to be displayed as table.")
  @JsonProperty("displayAsTable")
  public Boolean getDisplayAsTable() {
    return displayAsTable;
  }
  public void setDisplayAsTable(Boolean displayAsTable) {
    this.displayAsTable = displayAsTable;
  }


  /**
   * Indicates the display to include duration.
   **/
  public Widget showDuration(Boolean showDuration) {
    this.showDuration = showDuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the display to include duration.")
  @JsonProperty("showDuration")
  public Boolean getShowDuration() {
    return showDuration;
  }
  public void setShowDuration(Boolean showDuration) {
    this.showDuration = showDuration;
  }


  /**
   * The sort order of the table.
   **/
  public Widget sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort order of the table.")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  /**
   * The sort key of the table.
   **/
  public Widget sortKey(SortKeyEnum sortKey) {
    this.sortKey = sortKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort key of the table.")
  @JsonProperty("sortKey")
  public SortKeyEnum getSortKey() {
    return sortKey;
  }
  public void setSortKey(SortKeyEnum sortKey) {
    this.sortKey = sortKey;
  }


  /**
   * Indicates the limit of displayed entities.
   **/
  public Widget entityLimit(Integer entityLimit) {
    this.entityLimit = entityLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the limit of displayed entities.")
  @JsonProperty("entityLimit")
  public Integer getEntityLimit() {
    return entityLimit;
  }
  public void setEntityLimit(Integer entityLimit) {
    this.entityLimit = entityLimit;
  }


  /**
   * Indicates whether to display aggregate across all entity and media type combination.
   **/
  public Widget displayAggregates(Boolean displayAggregates) {
    this.displayAggregates = displayAggregates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether to display aggregate across all entity and media type combination.")
  @JsonProperty("displayAggregates")
  public Boolean getDisplayAggregates() {
    return displayAggregates;
  }
  public void setDisplayAggregates(Boolean displayAggregates) {
    this.displayAggregates = displayAggregates;
  }


  /**
   * Indicates whether a widget should take the full width of a dashboard or be shown only in a single slot.
   **/
  public Widget isFullWidth(Boolean isFullWidth) {
    this.isFullWidth = isFullWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether a widget should take the full width of a dashboard or be shown only in a single slot.")
  @JsonProperty("isFullWidth")
  public Boolean getIsFullWidth() {
    return isFullWidth;
  }
  public void setIsFullWidth(Boolean isFullWidth) {
    this.isFullWidth = isFullWidth;
  }


  /**
   * Indicates whether a widget should show the percentage diff between two values.
   **/
  public Widget showPercentageChange(Boolean showPercentageChange) {
    this.showPercentageChange = showPercentageChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether a widget should show the percentage diff between two values.")
  @JsonProperty("showPercentageChange")
  public Boolean getShowPercentageChange() {
    return showPercentageChange;
  }
  public void setShowPercentageChange(Boolean showPercentageChange) {
    this.showPercentageChange = showPercentageChange;
  }


  /**
   * Indicates whether a widget should show the profile picture of an agent.
   **/
  public Widget showProfilePicture(Boolean showProfilePicture) {
    this.showProfilePicture = showProfilePicture;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether a widget should show the profile picture of an agent.")
  @JsonProperty("showProfilePicture")
  public Boolean getShowProfilePicture() {
    return showProfilePicture;
  }
  public void setShowProfilePicture(Boolean showProfilePicture) {
    this.showProfilePicture = showProfilePicture;
  }


  /**
   * The filters to be applied for dashboard widget configuration
   **/
  public Widget filter(ViewFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The filters to be applied for dashboard widget configuration")
  @JsonProperty("filter")
  public ViewFilter getFilter() {
    return filter;
  }
  public void setFilter(ViewFilter filter) {
    this.filter = filter;
  }


  /**
   * The list of periods for the dashboard widget configuration
   **/
  public Widget periods(List<PeriodsEnum> periods) {
    this.periods = periods;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of periods for the dashboard widget configuration")
  @JsonProperty("periods")
  public List<PeriodsEnum> getPeriods() {
    return periods;
  }
  public void setPeriods(List<PeriodsEnum> periods) {
    this.periods = periods;
  }


  /**
   * The list of media types for the dashboard widget configuration
   **/
  public Widget mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of media types for the dashboard widget configuration")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }


  /**
   * List of warnings for dashboard widget configuration
   **/
  public Widget warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of warnings for dashboard widget configuration")
  @JsonProperty("warnings")
  public List<Warning> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  /**
   * Indicates the show time in status of a widget configuration.
   **/
  public Widget showTimeInStatus(Boolean showTimeInStatus) {
    this.showTimeInStatus = showTimeInStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the show time in status of a widget configuration.")
  @JsonProperty("showTimeInStatus")
  public Boolean getShowTimeInStatus() {
    return showTimeInStatus;
  }
  public void setShowTimeInStatus(Boolean showTimeInStatus) {
    this.showTimeInStatus = showTimeInStatus;
  }


  /**
   * Indicates to show offline agent widget.
   **/
  public Widget showOfflineAgents(Boolean showOfflineAgents) {
    this.showOfflineAgents = showOfflineAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates to show offline agent widget.")
  @JsonProperty("showOfflineAgents")
  public Boolean getShowOfflineAgents() {
    return showOfflineAgents;
  }
  public void setShowOfflineAgents(Boolean showOfflineAgents) {
    this.showOfflineAgents = showOfflineAgents;
  }


  /**
   * Indicates the selected statuses used to filter the agent widget in the dashboard.
   **/
  public Widget selectedStatuses(List<SelectedStatusesEnum> selectedStatuses) {
    this.selectedStatuses = selectedStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the selected statuses used to filter the agent widget in the dashboard.")
  @JsonProperty("selectedStatuses")
  public List<SelectedStatusesEnum> getSelectedStatuses() {
    return selectedStatuses;
  }
  public void setSelectedStatuses(List<SelectedStatusesEnum> selectedStatuses) {
    this.selectedStatuses = selectedStatuses;
  }


  /**
   * The sort order of the interactions in the agent status widget.
   **/
  public Widget agentInteractionSortOrder(AgentInteractionSortOrderEnum agentInteractionSortOrder) {
    this.agentInteractionSortOrder = agentInteractionSortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort order of the interactions in the agent status widget.")
  @JsonProperty("agentInteractionSortOrder")
  public AgentInteractionSortOrderEnum getAgentInteractionSortOrder() {
    return agentInteractionSortOrder;
  }
  public void setAgentInteractionSortOrder(AgentInteractionSortOrderEnum agentInteractionSortOrder) {
    this.agentInteractionSortOrder = agentInteractionSortOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Widget widget = (Widget) o;

    return Objects.equals(this.row, widget.row) &&
            Objects.equals(this.column, widget.column) &&
            Objects.equals(this.title, widget.title) &&
            Objects.equals(this.type, widget.type) &&
            Objects.equals(this.metrics, widget.metrics) &&
            Objects.equals(this.displayText, widget.displayText) &&
            Objects.equals(this.displayTextColor, widget.displayTextColor) &&
            Objects.equals(this.webContentUrl, widget.webContentUrl) &&
            Objects.equals(this.splitFilters, widget.splitFilters) &&
            Objects.equals(this.splitByMediaType, widget.splitByMediaType) &&
            Objects.equals(this.showLongest, widget.showLongest) &&
            Objects.equals(this.displayAsTable, widget.displayAsTable) &&
            Objects.equals(this.showDuration, widget.showDuration) &&
            Objects.equals(this.sortOrder, widget.sortOrder) &&
            Objects.equals(this.sortKey, widget.sortKey) &&
            Objects.equals(this.entityLimit, widget.entityLimit) &&
            Objects.equals(this.displayAggregates, widget.displayAggregates) &&
            Objects.equals(this.isFullWidth, widget.isFullWidth) &&
            Objects.equals(this.showPercentageChange, widget.showPercentageChange) &&
            Objects.equals(this.showProfilePicture, widget.showProfilePicture) &&
            Objects.equals(this.filter, widget.filter) &&
            Objects.equals(this.periods, widget.periods) &&
            Objects.equals(this.mediaTypes, widget.mediaTypes) &&
            Objects.equals(this.warnings, widget.warnings) &&
            Objects.equals(this.showTimeInStatus, widget.showTimeInStatus) &&
            Objects.equals(this.showOfflineAgents, widget.showOfflineAgents) &&
            Objects.equals(this.selectedStatuses, widget.selectedStatuses) &&
            Objects.equals(this.agentInteractionSortOrder, widget.agentInteractionSortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, column, title, type, metrics, displayText, displayTextColor, webContentUrl, splitFilters, splitByMediaType, showLongest, displayAsTable, showDuration, sortOrder, sortKey, entityLimit, displayAggregates, isFullWidth, showPercentageChange, showProfilePicture, filter, periods, mediaTypes, warnings, showTimeInStatus, showOfflineAgents, selectedStatuses, agentInteractionSortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Widget {\n");
    
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
    sb.append("    displayTextColor: ").append(toIndentedString(displayTextColor)).append("\n");
    sb.append("    webContentUrl: ").append(toIndentedString(webContentUrl)).append("\n");
    sb.append("    splitFilters: ").append(toIndentedString(splitFilters)).append("\n");
    sb.append("    splitByMediaType: ").append(toIndentedString(splitByMediaType)).append("\n");
    sb.append("    showLongest: ").append(toIndentedString(showLongest)).append("\n");
    sb.append("    displayAsTable: ").append(toIndentedString(displayAsTable)).append("\n");
    sb.append("    showDuration: ").append(toIndentedString(showDuration)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
    sb.append("    entityLimit: ").append(toIndentedString(entityLimit)).append("\n");
    sb.append("    displayAggregates: ").append(toIndentedString(displayAggregates)).append("\n");
    sb.append("    isFullWidth: ").append(toIndentedString(isFullWidth)).append("\n");
    sb.append("    showPercentageChange: ").append(toIndentedString(showPercentageChange)).append("\n");
    sb.append("    showProfilePicture: ").append(toIndentedString(showProfilePicture)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    showTimeInStatus: ").append(toIndentedString(showTimeInStatus)).append("\n");
    sb.append("    showOfflineAgents: ").append(toIndentedString(showOfflineAgents)).append("\n");
    sb.append("    selectedStatuses: ").append(toIndentedString(selectedStatuses)).append("\n");
    sb.append("    agentInteractionSortOrder: ").append(toIndentedString(agentInteractionSortOrder)).append("\n");
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

