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
import java.util.List;

import java.io.Serializable;
/**
 * ReportingExportJobRequest
 */

public class ReportingExportJobRequest  implements Serializable {
  
  private String name = null;
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
  private String period = null;

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
  private ViewFilter filter = null;
  private Boolean read = null;
  private String locale = null;
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

  
  /**
   * The user supplied name of the export request
   **/
  public ReportingExportJobRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user supplied name of the export request")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The requested timezone of the exported data. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public ReportingExportJobRequest timeZone(String timeZone) {
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
  public ReportingExportJobRequest exportFormat(ExportFormatEnum exportFormat) {
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
  public ReportingExportJobRequest interval(String interval) {
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
   * The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public ReportingExportJobRequest period(String period) {
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
   * The type of view export job to be created
   **/
  public ReportingExportJobRequest viewType(ViewTypeEnum viewType) {
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
   * Filters to apply to create the view
   **/
  public ReportingExportJobRequest filter(ViewFilter filter) {
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
  public ReportingExportJobRequest read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the request has been marked as read")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  
  /**
   * The locale use for localization of the exported data, i.e. en-us, es-mx  
   **/
  public ReportingExportJobRequest locale(String locale) {
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
   * Indicates if durations are formatted in hh:mm:ss format instead of ms
   **/
  public ReportingExportJobRequest hasFormatDurations(Boolean hasFormatDurations) {
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
  public ReportingExportJobRequest hasSplitFilters(Boolean hasSplitFilters) {
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
  public ReportingExportJobRequest excludeEmptyRows(Boolean excludeEmptyRows) {
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
  public ReportingExportJobRequest hasSplitByMedia(Boolean hasSplitByMedia) {
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
  public ReportingExportJobRequest hasSummaryRow(Boolean hasSummaryRow) {
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
  public ReportingExportJobRequest csvDelimiter(CsvDelimiterEnum csvDelimiter) {
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
  public ReportingExportJobRequest selectedColumns(List<SelectedColumns> selectedColumns) {
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
  public ReportingExportJobRequest hasCustomParticipantAttributes(Boolean hasCustomParticipantAttributes) {
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
  public ReportingExportJobRequest recipientEmails(List<String> recipientEmails) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingExportJobRequest reportingExportJobRequest = (ReportingExportJobRequest) o;
    return Objects.equals(this.name, reportingExportJobRequest.name) &&
        Objects.equals(this.timeZone, reportingExportJobRequest.timeZone) &&
        Objects.equals(this.exportFormat, reportingExportJobRequest.exportFormat) &&
        Objects.equals(this.interval, reportingExportJobRequest.interval) &&
        Objects.equals(this.period, reportingExportJobRequest.period) &&
        Objects.equals(this.viewType, reportingExportJobRequest.viewType) &&
        Objects.equals(this.filter, reportingExportJobRequest.filter) &&
        Objects.equals(this.read, reportingExportJobRequest.read) &&
        Objects.equals(this.locale, reportingExportJobRequest.locale) &&
        Objects.equals(this.hasFormatDurations, reportingExportJobRequest.hasFormatDurations) &&
        Objects.equals(this.hasSplitFilters, reportingExportJobRequest.hasSplitFilters) &&
        Objects.equals(this.excludeEmptyRows, reportingExportJobRequest.excludeEmptyRows) &&
        Objects.equals(this.hasSplitByMedia, reportingExportJobRequest.hasSplitByMedia) &&
        Objects.equals(this.hasSummaryRow, reportingExportJobRequest.hasSummaryRow) &&
        Objects.equals(this.csvDelimiter, reportingExportJobRequest.csvDelimiter) &&
        Objects.equals(this.selectedColumns, reportingExportJobRequest.selectedColumns) &&
        Objects.equals(this.hasCustomParticipantAttributes, reportingExportJobRequest.hasCustomParticipantAttributes) &&
        Objects.equals(this.recipientEmails, reportingExportJobRequest.recipientEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timeZone, exportFormat, interval, period, viewType, filter, read, locale, hasFormatDurations, hasSplitFilters, excludeEmptyRows, hasSplitByMedia, hasSummaryRow, csvDelimiter, selectedColumns, hasCustomParticipantAttributes, recipientEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingExportJobRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    exportFormat: ").append(toIndentedString(exportFormat)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    hasFormatDurations: ").append(toIndentedString(hasFormatDurations)).append("\n");
    sb.append("    hasSplitFilters: ").append(toIndentedString(hasSplitFilters)).append("\n");
    sb.append("    excludeEmptyRows: ").append(toIndentedString(excludeEmptyRows)).append("\n");
    sb.append("    hasSplitByMedia: ").append(toIndentedString(hasSplitByMedia)).append("\n");
    sb.append("    hasSummaryRow: ").append(toIndentedString(hasSummaryRow)).append("\n");
    sb.append("    csvDelimiter: ").append(toIndentedString(csvDelimiter)).append("\n");
    sb.append("    selectedColumns: ").append(toIndentedString(selectedColumns)).append("\n");
    sb.append("    hasCustomParticipantAttributes: ").append(toIndentedString(hasCustomParticipantAttributes)).append("\n");
    sb.append("    recipientEmails: ").append(toIndentedString(recipientEmails)).append("\n");
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

