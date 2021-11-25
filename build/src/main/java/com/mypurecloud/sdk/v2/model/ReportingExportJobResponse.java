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
import com.mypurecloud.sdk.v2.model.SelectedColumns;
import com.mypurecloud.sdk.v2.model.ViewFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ReportingExportJobResponse
 */

public class ReportingExportJobResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String runId = null;

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
   * The current status of the export request
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUBMITTED("SUBMITTED"),
    RUNNING("RUNNING"),
    CANCELLING("CANCELLING"),
    CANCELLED("CANCELLED"),
    COMPLETED("COMPLETED"),
    COMPLETED_WITH_PARTIAL_RESULTS("COMPLETED_WITH_PARTIAL_RESULTS"),
    FAILED("FAILED");

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
  private String timeZone = null;

  private static class ExportFormatEnumDeserializer extends StdDeserializer<ExportFormatEnum> {
    public ExportFormatEnumDeserializer() {
      super(ExportFormatEnumDeserializer.class);
    }

    @Override
    public ExportFormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExportFormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The requested format of the exported data
   */
 @JsonDeserialize(using = ExportFormatEnumDeserializer.class)
  public enum ExportFormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CSV("CSV"),
    PDF("PDF");

    private String value;

    ExportFormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExportFormatEnum fromString(String key) {
      if (key == null) return null;

      for (ExportFormatEnum value : ExportFormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExportFormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExportFormatEnum exportFormat = null;
  private String interval = null;
  private String downloadUrl = null;

  private static class ViewTypeEnumDeserializer extends StdDeserializer<ViewTypeEnum> {
    public ViewTypeEnumDeserializer() {
      super(ViewTypeEnumDeserializer.class);
    }

    @Override
    public ViewTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ViewTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of view export job to be created
   */
 @JsonDeserialize(using = ViewTypeEnumDeserializer.class)
  public enum ViewTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUE_PERFORMANCE_SUMMARY_VIEW("QUEUE_PERFORMANCE_SUMMARY_VIEW"),
    QUEUE_PERFORMANCE_DETAIL_VIEW("QUEUE_PERFORMANCE_DETAIL_VIEW"),
    INTERACTION_SEARCH_VIEW("INTERACTION_SEARCH_VIEW"),
    AGENT_PERFORMANCE_SUMMARY_VIEW("AGENT_PERFORMANCE_SUMMARY_VIEW"),
    AGENT_PERFORMANCE_DETAIL_VIEW("AGENT_PERFORMANCE_DETAIL_VIEW"),
    AGENT_STATUS_SUMMARY_VIEW("AGENT_STATUS_SUMMARY_VIEW"),
    AGENT_STATUS_DETAIL_VIEW("AGENT_STATUS_DETAIL_VIEW"),
    AGENT_EVALUATION_SUMMARY_VIEW("AGENT_EVALUATION_SUMMARY_VIEW"),
    AGENT_EVALUATION_DETAIL_VIEW("AGENT_EVALUATION_DETAIL_VIEW"),
    AGENT_QUEUE_DETAIL_VIEW("AGENT_QUEUE_DETAIL_VIEW"),
    AGENT_INTERACTION_DETAIL_VIEW("AGENT_INTERACTION_DETAIL_VIEW"),
    ABANDON_INSIGHTS_VIEW("ABANDON_INSIGHTS_VIEW"),
    SKILLS_PERFORMANCE_VIEW("SKILLS_PERFORMANCE_VIEW"),
    SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW("SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW"),
    SURVEY_FORM_PERFORMANCE_DETAIL_VIEW("SURVEY_FORM_PERFORMANCE_DETAIL_VIEW"),
    DNIS_PERFORMANCE_SUMMARY_VIEW("DNIS_PERFORMANCE_SUMMARY_VIEW"),
    DNIS_PERFORMANCE_DETAIL_VIEW("DNIS_PERFORMANCE_DETAIL_VIEW"),
    WRAP_UP_PERFORMANCE_SUMMARY_VIEW("WRAP_UP_PERFORMANCE_SUMMARY_VIEW"),
    AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW("AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW"),
    QUEUE_ACTIVITY_SUMMARY_VIEW("QUEUE_ACTIVITY_SUMMARY_VIEW"),
    QUEUE_ACTIVITY_DETAIL_VIEW("QUEUE_ACTIVITY_DETAIL_VIEW"),
    AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW("AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW"),
    QUEUE_AGENT_DETAIL_VIEW("QUEUE_AGENT_DETAIL_VIEW"),
    QUEUE_INTERACTION_DETAIL_VIEW("QUEUE_INTERACTION_DETAIL_VIEW"),
    AGENT_SCHEDULE_DETAIL_VIEW("AGENT_SCHEDULE_DETAIL_VIEW"),
    IVR_PERFORMANCE_SUMMARY_VIEW("IVR_PERFORMANCE_SUMMARY_VIEW"),
    IVR_PERFORMANCE_DETAIL_VIEW("IVR_PERFORMANCE_DETAIL_VIEW"),
    ANSWER_INSIGHTS_VIEW("ANSWER_INSIGHTS_VIEW"),
    HANDLE_INSIGHTS_VIEW("HANDLE_INSIGHTS_VIEW"),
    TALK_INSIGHTS_VIEW("TALK_INSIGHTS_VIEW"),
    HOLD_INSIGHTS_VIEW("HOLD_INSIGHTS_VIEW"),
    ACW_INSIGHTS_VIEW("ACW_INSIGHTS_VIEW"),
    WAIT_INSIGHTS_VIEW("WAIT_INSIGHTS_VIEW"),
    AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW("AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW"),
    FLOW_OUTCOME_SUMMARY_VIEW("FLOW_OUTCOME_SUMMARY_VIEW"),
    FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW("FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW"),
    FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW("FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW"),
    FLOW_DESTINATION_SUMMARY_VIEW("FLOW_DESTINATION_SUMMARY_VIEW"),
    FLOW_DESTINATION_DETAIL_VIEW("FLOW_DESTINATION_DETAIL_VIEW"),
    API_USAGE_VIEW("API_USAGE_VIEW"),
    SCHEDULED_CALLBACKS_VIEW("SCHEDULED_CALLBACKS_VIEW"),
    CONTENT_SEARCH_VIEW("CONTENT_SEARCH_VIEW"),
    LANDING_PAGE("LANDING_PAGE"),
    DASHBOARD_SUMMARY("DASHBOARD_SUMMARY"),
    DASHBOARD_DETAIL("DASHBOARD_DETAIL"),
    JOURNEY_ACTION_MAP_SUMMARY_VIEW("JOURNEY_ACTION_MAP_SUMMARY_VIEW"),
    JOURNEY_OUTCOME_SUMMARY_VIEW("JOURNEY_OUTCOME_SUMMARY_VIEW"),
    JOURNEY_SEGMENT_SUMMARY_VIEW("JOURNEY_SEGMENT_SUMMARY_VIEW"),
    AGENT_DEVELOPMENT_DETAIL_VIEW("AGENT_DEVELOPMENT_DETAIL_VIEW"),
    AGENT_DEVELOPMENT_DETAIL_ME_VIEW("AGENT_DEVELOPMENT_DETAIL_ME_VIEW"),
    AGENT_DEVELOPMENT_SUMMARY_VIEW("AGENT_DEVELOPMENT_SUMMARY_VIEW"),
    AGENT_PERFORMANCE_ME_VIEW("AGENT_PERFORMANCE_ME_VIEW"),
    AGENT_STATUS_ME_VIEW("AGENT_STATUS_ME_VIEW"),
    AGENT_EVALUATION_ME_VIEW("AGENT_EVALUATION_ME_VIEW"),
    AGENT_SCORECARD_VIEW("AGENT_SCORECARD_VIEW"),
    AGENT_SCORECARD_ME_VIEW("AGENT_SCORECARD_ME_VIEW"),
    AGENT_GAMIFICATION_LEADERSHIP_VIEW("AGENT_GAMIFICATION_LEADERSHIP_VIEW"),
    AGENT_SCHEDULE_ME_VIEW("AGENT_SCHEDULE_ME_VIEW"),
    BOT_PERFORMANCE_SUMMARY_VIEW("BOT_PERFORMANCE_SUMMARY_VIEW"),
    BOT_PERFORMANCE_DETAIL_VIEW("BOT_PERFORMANCE_DETAIL_VIEW"),
    SCHEDULED_EXPORTS_VIEW("SCHEDULED_EXPORTS_VIEW"),
    TOPIC_TREND_SUMMARY_VIEW("TOPIC_TREND_SUMMARY_VIEW"),
    TOPIC_TREND_DETAIL_VIEW("TOPIC_TREND_DETAIL_VIEW"),
    ACTION_MAP_BLOCKED_CONSTRAINTS_DETAIL_VIEW("ACTION_MAP_BLOCKED_CONSTRAINTS_DETAIL_VIEW"),
    ACTION_MAP_BLOCKED_CONSTRAINTS_INTERVAL_DETAIL_VIEW("ACTION_MAP_BLOCKED_CONSTRAINTS_INTERVAL_DETAIL_VIEW"),
    FLOW_MILESTONE_PERFORMANCE_DETAIL_VIEW("FLOW_MILESTONE_PERFORMANCE_DETAIL_VIEW"),
    FLOW_MILESTONE_PERFORMANCE_INTERVAL_DETAIL_VIEW("FLOW_MILESTONE_PERFORMANCE_INTERVAL_DETAIL_VIEW"),
    AGENT_TOPIC_SUMMARY_VIEW("AGENT_TOPIC_SUMMARY_VIEW"),
    AGENT_TOPIC_DETAIL_VIEW("AGENT_TOPIC_DETAIL_VIEW"),
    QUEUE_TOPIC_SUMMARY_VIEW("QUEUE_TOPIC_SUMMARY_VIEW"),
    QUEUE_TOPIC_DETAIL_VIEW("QUEUE_TOPIC_DETAIL_VIEW"),
    FLOW_TOPIC_SUMMARY_VIEW("FLOW_TOPIC_SUMMARY_VIEW"),
    FLOW_TOPIC_DETAIL_VIEW("FLOW_TOPIC_DETAIL_VIEW"),
    AGENT_INTERACTIONS_ME_VIEW("AGENT_INTERACTIONS_ME_VIEW"),
    ALERT_RULES_VIEW("ALERT_RULES_VIEW"),
    CONFIGURE_ALERT_RULE_VIEW("CONFIGURE_ALERT_RULE_VIEW");

    private String value;

    ViewTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ViewTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ViewTypeEnum value : ViewTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ViewTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ViewTypeEnum viewType = null;

  private static class ExportErrorMessagesTypeEnumDeserializer extends StdDeserializer<ExportErrorMessagesTypeEnum> {
    public ExportErrorMessagesTypeEnumDeserializer() {
      super(ExportErrorMessagesTypeEnumDeserializer.class);
    }

    @Override
    public ExportErrorMessagesTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ExportErrorMessagesTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The error message in case the export request failed
   */
 @JsonDeserialize(using = ExportErrorMessagesTypeEnumDeserializer.class)
  public enum ExportErrorMessagesTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FAILED_CONVERTING_EXPORT_JOB("FAILED_CONVERTING_EXPORT_JOB"),
    FAILED_NO_DATA_EXPORT_JOB_FOUND("FAILED_NO_DATA_EXPORT_JOB_FOUND"),
    FAILED_GETTING_DATA_FROM_SERVICE("FAILED_GETTING_DATA_FROM_SERVICE"),
    FAILED_GENERATING_TEMP_FILE("FAILED_GENERATING_TEMP_FILE"),
    FAILED_SAVING_FILE_TO_S3("FAILED_SAVING_FILE_TO_S3"),
    FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD("FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD"),
    FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE("FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE"),
    FAILED_CONVERTING_EXPORT_JOB_TO_QUEUE_PERFORMANCE_JOB("FAILED_CONVERTING_EXPORT_JOB_TO_QUEUE_PERFORMANCE_JOB"),
    EXPORT_TYPE_NOT_IMPLEMENTED("EXPORT_TYPE_NOT_IMPLEMENTED"),
    REACHED_MAXIMUM_ATTEMPT_OF_RETRY("REACHED_MAXIMUM_ATTEMPT_OF_RETRY"),
    FAILED_LONG_RUNNING_EXPORT("FAILED_LONG_RUNNING_EXPORT"),
    TOO_MANY_REQUESTS_FROM_AN_ORGANIZATION("TOO_MANY_REQUESTS_FROM_AN_ORGANIZATION"),
    FAILED_AS_EXPORT_FILE_SIZE_IS_GREATER_THAN_10MB("FAILED_AS_EXPORT_FILE_SIZE_IS_GREATER_THAN_10MB"),
    NOT_AUTHORIZED_TO_VIEW_EXPORT("NOT_AUTHORIZED_TO_VIEW_EXPORT");

    private String value;

    ExportErrorMessagesTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ExportErrorMessagesTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ExportErrorMessagesTypeEnum value : ExportErrorMessagesTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ExportErrorMessagesTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ExportErrorMessagesTypeEnum exportErrorMessagesType = null;
  private String period = null;
  private ViewFilter filter = null;
  private Boolean read = null;
  private Date createdDateTime = null;
  private Date modifiedDateTime = null;
  private String locale = null;
  private Double percentageComplete = null;
  private Boolean hasFormatDurations = null;
  private Boolean hasSplitFilters = null;
  private Boolean excludeEmptyRows = null;
  private Boolean hasSplitByMedia = null;
  private Boolean hasSummaryRow = null;

  private static class CsvDelimiterEnumDeserializer extends StdDeserializer<CsvDelimiterEnum> {
    public CsvDelimiterEnumDeserializer() {
      super(CsvDelimiterEnumDeserializer.class);
    }

    @Override
    public CsvDelimiterEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CsvDelimiterEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The user supplied csv delimiter string value either of type 'comma' or 'semicolon' permitted for the export request
   */
 @JsonDeserialize(using = CsvDelimiterEnumDeserializer.class)
  public enum CsvDelimiterEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SEMICOLON("SEMICOLON"),
    COMMA("COMMA");

    private String value;

    CsvDelimiterEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CsvDelimiterEnum fromString(String key) {
      if (key == null) return null;

      for (CsvDelimiterEnum value : CsvDelimiterEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CsvDelimiterEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CsvDelimiterEnum csvDelimiter = null;
  private List<SelectedColumns> selectedColumns = new ArrayList<SelectedColumns>();
  private Boolean hasCustomParticipantAttributes = null;
  private List<String> recipientEmails = new ArrayList<String>();

  private static class InnerEnumDeserializer extends StdDeserializer<InnerEnum> {
    public InnerEnumDeserializer() {
      super(InnerEnumDeserializer.class);
    }

    @Override
    public InnerEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InnerEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets inner
   */
 @JsonDeserialize(using = InnerEnumDeserializer.class)
  public enum InnerEnum {
    SENT("Sent"),
    PENDING("Pending"),
    FAILED("Failed");

    private String value;

    InnerEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InnerEnum fromString(String key) {
      if (key == null) return null;

      for (InnerEnum value : InnerEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InnerEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private Map<String, String> emailStatuses = null;
  private String emailErrorDescription = null;
  private Boolean enabled = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ReportingExportJobResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The unique run id of the export schedule execute
   **/
  public ReportingExportJobResponse runId(String runId) {
    this.runId = runId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique run id of the export schedule execute")
  @JsonProperty("runId")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

  
  /**
   * The current status of the export request
   **/
  public ReportingExportJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current status of the export request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * The requested timezone of the exported data. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public ReportingExportJobResponse timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The requested timezone of the exported data. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The requested format of the exported data
   **/
  public ReportingExportJobResponse exportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The requested format of the exported data")
  @JsonProperty("exportFormat")
  public ExportFormatEnum getExportFormat() {
    return exportFormat;
  }
  public void setExportFormat(ExportFormatEnum exportFormat) {
    this.exportFormat = exportFormat;
  }

  
  /**
   * The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public ReportingExportJobResponse interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * The url to download the request if it's status is completed
   **/
  public ReportingExportJobResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url to download the request if it's status is completed")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  
  /**
   * The type of view export job to be created
   **/
  public ReportingExportJobResponse viewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of view export job to be created")
  @JsonProperty("viewType")
  public ViewTypeEnum getViewType() {
    return viewType;
  }
  public void setViewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
  }

  
  /**
   * The error message in case the export request failed
   **/
  public ReportingExportJobResponse exportErrorMessagesType(ExportErrorMessagesTypeEnum exportErrorMessagesType) {
    this.exportErrorMessagesType = exportErrorMessagesType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error message in case the export request failed")
  @JsonProperty("exportErrorMessagesType")
  public ExportErrorMessagesTypeEnum getExportErrorMessagesType() {
    return exportErrorMessagesType;
  }
  public void setExportErrorMessagesType(ExportErrorMessagesTypeEnum exportErrorMessagesType) {
    this.exportErrorMessagesType = exportErrorMessagesType;
  }

  
  /**
   * The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public ReportingExportJobResponse period(String period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("period")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }

  
  /**
   * Filters to apply to create the view
   **/
  public ReportingExportJobResponse filter(ViewFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filters to apply to create the view")
  @JsonProperty("filter")
  public ViewFilter getFilter() {
    return filter;
  }
  public void setFilter(ViewFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Indicates if the request has been marked as read
   **/
  public ReportingExportJobResponse read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if the request has been marked as read")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  
  /**
   * The created date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportingExportJobResponse createdDateTime(Date createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The created date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDateTime")
  public Date getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(Date createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   * The last modified date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReportingExportJobResponse modifiedDateTime(Date modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last modified date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDateTime")
  public Date getModifiedDateTime() {
    return modifiedDateTime;
  }
  public void setModifiedDateTime(Date modifiedDateTime) {
    this.modifiedDateTime = modifiedDateTime;
  }

  
  /**
   * The locale use for localization of the exported data, i.e. en-us, es-mx  
   **/
  public ReportingExportJobResponse locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The locale use for localization of the exported data, i.e. en-us, es-mx  ")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   * The percentage of the job that has completed processing
   **/
  public ReportingExportJobResponse percentageComplete(Double percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The percentage of the job that has completed processing")
  @JsonProperty("percentageComplete")
  public Double getPercentageComplete() {
    return percentageComplete;
  }
  public void setPercentageComplete(Double percentageComplete) {
    this.percentageComplete = percentageComplete;
  }

  
  /**
   * Indicates if durations are formatted in hh:mm:ss format instead of ms
   **/
  public ReportingExportJobResponse hasFormatDurations(Boolean hasFormatDurations) {
    this.hasFormatDurations = hasFormatDurations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if durations are formatted in hh:mm:ss format instead of ms")
  @JsonProperty("hasFormatDurations")
  public Boolean getHasFormatDurations() {
    return hasFormatDurations;
  }
  public void setHasFormatDurations(Boolean hasFormatDurations) {
    this.hasFormatDurations = hasFormatDurations;
  }

  
  /**
   * Indicates if filters will be split in aggregate detail exports
   **/
  public ReportingExportJobResponse hasSplitFilters(Boolean hasSplitFilters) {
    this.hasSplitFilters = hasSplitFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if filters will be split in aggregate detail exports")
  @JsonProperty("hasSplitFilters")
  public Boolean getHasSplitFilters() {
    return hasSplitFilters;
  }
  public void setHasSplitFilters(Boolean hasSplitFilters) {
    this.hasSplitFilters = hasSplitFilters;
  }

  
  /**
   * Excludes empty rows from the exports
   **/
  public ReportingExportJobResponse excludeEmptyRows(Boolean excludeEmptyRows) {
    this.excludeEmptyRows = excludeEmptyRows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Excludes empty rows from the exports")
  @JsonProperty("excludeEmptyRows")
  public Boolean getExcludeEmptyRows() {
    return excludeEmptyRows;
  }
  public void setExcludeEmptyRows(Boolean excludeEmptyRows) {
    this.excludeEmptyRows = excludeEmptyRows;
  }

  
  /**
   * Indicates if media type will be split in aggregate detail exports
   **/
  public ReportingExportJobResponse hasSplitByMedia(Boolean hasSplitByMedia) {
    this.hasSplitByMedia = hasSplitByMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if media type will be split in aggregate detail exports")
  @JsonProperty("hasSplitByMedia")
  public Boolean getHasSplitByMedia() {
    return hasSplitByMedia;
  }
  public void setHasSplitByMedia(Boolean hasSplitByMedia) {
    this.hasSplitByMedia = hasSplitByMedia;
  }

  
  /**
   * Indicates if summary row needs to be present in exports
   **/
  public ReportingExportJobResponse hasSummaryRow(Boolean hasSummaryRow) {
    this.hasSummaryRow = hasSummaryRow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if summary row needs to be present in exports")
  @JsonProperty("hasSummaryRow")
  public Boolean getHasSummaryRow() {
    return hasSummaryRow;
  }
  public void setHasSummaryRow(Boolean hasSummaryRow) {
    this.hasSummaryRow = hasSummaryRow;
  }

  
  /**
   * The user supplied csv delimiter string value either of type 'comma' or 'semicolon' permitted for the export request
   **/
  public ReportingExportJobResponse csvDelimiter(CsvDelimiterEnum csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user supplied csv delimiter string value either of type 'comma' or 'semicolon' permitted for the export request")
  @JsonProperty("csvDelimiter")
  public CsvDelimiterEnum getCsvDelimiter() {
    return csvDelimiter;
  }
  public void setCsvDelimiter(CsvDelimiterEnum csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
  }

  
  /**
   * The list of ordered selected columns from the export view by the user
   **/
  public ReportingExportJobResponse selectedColumns(List<SelectedColumns> selectedColumns) {
    this.selectedColumns = selectedColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of ordered selected columns from the export view by the user")
  @JsonProperty("selectedColumns")
  public List<SelectedColumns> getSelectedColumns() {
    return selectedColumns;
  }
  public void setSelectedColumns(List<SelectedColumns> selectedColumns) {
    this.selectedColumns = selectedColumns;
  }

  
  /**
   * Indicates if custom participant attributes will be exported
   **/
  public ReportingExportJobResponse hasCustomParticipantAttributes(Boolean hasCustomParticipantAttributes) {
    this.hasCustomParticipantAttributes = hasCustomParticipantAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if custom participant attributes will be exported")
  @JsonProperty("hasCustomParticipantAttributes")
  public Boolean getHasCustomParticipantAttributes() {
    return hasCustomParticipantAttributes;
  }
  public void setHasCustomParticipantAttributes(Boolean hasCustomParticipantAttributes) {
    this.hasCustomParticipantAttributes = hasCustomParticipantAttributes;
  }

  
  /**
   * The list of email recipients for the exports
   **/
  public ReportingExportJobResponse recipientEmails(List<String> recipientEmails) {
    this.recipientEmails = recipientEmails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of email recipients for the exports")
  @JsonProperty("recipientEmails")
  public List<String> getRecipientEmails() {
    return recipientEmails;
  }
  public void setRecipientEmails(List<String> recipientEmails) {
    this.recipientEmails = recipientEmails;
  }

  
  /**
   * The status of individual email addresses as a map
   **/
  public ReportingExportJobResponse emailStatuses(Map<String, String> emailStatuses) {
    this.emailStatuses = emailStatuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of individual email addresses as a map")
  @JsonProperty("emailStatuses")
  public Map<String, String> getEmailStatuses() {
    return emailStatuses;
  }
  public void setEmailStatuses(Map<String, String> emailStatuses) {
    this.emailStatuses = emailStatuses;
  }

  
  /**
   * The optional error message in case the export fail to email
   **/
  public ReportingExportJobResponse emailErrorDescription(String emailErrorDescription) {
    this.emailErrorDescription = emailErrorDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The optional error message in case the export fail to email")
  @JsonProperty("emailErrorDescription")
  public String getEmailErrorDescription() {
    return emailErrorDescription;
  }
  public void setEmailErrorDescription(String emailErrorDescription) {
    this.emailErrorDescription = emailErrorDescription;
  }

  
  /**
   **/
  public ReportingExportJobResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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
    ReportingExportJobResponse reportingExportJobResponse = (ReportingExportJobResponse) o;
    return Objects.equals(this.id, reportingExportJobResponse.id) &&
        Objects.equals(this.name, reportingExportJobResponse.name) &&
        Objects.equals(this.runId, reportingExportJobResponse.runId) &&
        Objects.equals(this.status, reportingExportJobResponse.status) &&
        Objects.equals(this.timeZone, reportingExportJobResponse.timeZone) &&
        Objects.equals(this.exportFormat, reportingExportJobResponse.exportFormat) &&
        Objects.equals(this.interval, reportingExportJobResponse.interval) &&
        Objects.equals(this.downloadUrl, reportingExportJobResponse.downloadUrl) &&
        Objects.equals(this.viewType, reportingExportJobResponse.viewType) &&
        Objects.equals(this.exportErrorMessagesType, reportingExportJobResponse.exportErrorMessagesType) &&
        Objects.equals(this.period, reportingExportJobResponse.period) &&
        Objects.equals(this.filter, reportingExportJobResponse.filter) &&
        Objects.equals(this.read, reportingExportJobResponse.read) &&
        Objects.equals(this.createdDateTime, reportingExportJobResponse.createdDateTime) &&
        Objects.equals(this.modifiedDateTime, reportingExportJobResponse.modifiedDateTime) &&
        Objects.equals(this.locale, reportingExportJobResponse.locale) &&
        Objects.equals(this.percentageComplete, reportingExportJobResponse.percentageComplete) &&
        Objects.equals(this.hasFormatDurations, reportingExportJobResponse.hasFormatDurations) &&
        Objects.equals(this.hasSplitFilters, reportingExportJobResponse.hasSplitFilters) &&
        Objects.equals(this.excludeEmptyRows, reportingExportJobResponse.excludeEmptyRows) &&
        Objects.equals(this.hasSplitByMedia, reportingExportJobResponse.hasSplitByMedia) &&
        Objects.equals(this.hasSummaryRow, reportingExportJobResponse.hasSummaryRow) &&
        Objects.equals(this.csvDelimiter, reportingExportJobResponse.csvDelimiter) &&
        Objects.equals(this.selectedColumns, reportingExportJobResponse.selectedColumns) &&
        Objects.equals(this.hasCustomParticipantAttributes, reportingExportJobResponse.hasCustomParticipantAttributes) &&
        Objects.equals(this.recipientEmails, reportingExportJobResponse.recipientEmails) &&
        Objects.equals(this.emailStatuses, reportingExportJobResponse.emailStatuses) &&
        Objects.equals(this.emailErrorDescription, reportingExportJobResponse.emailErrorDescription) &&
        Objects.equals(this.enabled, reportingExportJobResponse.enabled) &&
        Objects.equals(this.selfUri, reportingExportJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, runId, status, timeZone, exportFormat, interval, downloadUrl, viewType, exportErrorMessagesType, period, filter, read, createdDateTime, modifiedDateTime, locale, percentageComplete, hasFormatDurations, hasSplitFilters, excludeEmptyRows, hasSplitByMedia, hasSummaryRow, csvDelimiter, selectedColumns, hasCustomParticipantAttributes, recipientEmails, emailStatuses, emailErrorDescription, enabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingExportJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    exportErrorMessagesType: ").append(toIndentedString(exportErrorMessagesType)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    modifiedDateTime: ").append(toIndentedString(modifiedDateTime)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    hasFormatDurations: ").append(toIndentedString(hasFormatDurations)).append("\n");
    sb.append("    hasSplitFilters: ").append(toIndentedString(hasSplitFilters)).append("\n");
    sb.append("    excludeEmptyRows: ").append(toIndentedString(excludeEmptyRows)).append("\n");
    sb.append("    hasSplitByMedia: ").append(toIndentedString(hasSplitByMedia)).append("\n");
    sb.append("    hasSummaryRow: ").append(toIndentedString(hasSummaryRow)).append("\n");
    sb.append("    csvDelimiter: ").append(toIndentedString(csvDelimiter)).append("\n");
    sb.append("    selectedColumns: ").append(toIndentedString(selectedColumns)).append("\n");
    sb.append("    hasCustomParticipantAttributes: ").append(toIndentedString(hasCustomParticipantAttributes)).append("\n");
    sb.append("    recipientEmails: ").append(toIndentedString(recipientEmails)).append("\n");
    sb.append("    emailStatuses: ").append(toIndentedString(emailStatuses)).append("\n");
    sb.append("    emailErrorDescription: ").append(toIndentedString(emailErrorDescription)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

