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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ReportingExportMetadataJobResponse
 */

public class ReportingExportMetadataJobResponse  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * The view type of the export metadata
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
  private String dateLimitations = null;
  private List<String> requiredFilters = new ArrayList<String>();
  private List<String> supportedFilters = new ArrayList<String>();
  private List<String> requiredColumnIds = new ArrayList<String>();
  private Map<String, List<String>> dependentColumnIds = null;
  private List<String> availableColumnIds = new ArrayList<String>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ReportingExportMetadataJobResponse name(String name) {
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
   * The view type of the export metadata
   **/
  public ReportingExportMetadataJobResponse viewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The view type of the export metadata")
  @JsonProperty("viewType")
  public ViewTypeEnum getViewType() {
    return viewType;
  }
  public void setViewType(ViewTypeEnum viewType) {
    this.viewType = viewType;
  }

  
  /**
   * The date limitations of the export metadata
   **/
  public ReportingExportMetadataJobResponse dateLimitations(String dateLimitations) {
    this.dateLimitations = dateLimitations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date limitations of the export metadata")
  @JsonProperty("dateLimitations")
  public String getDateLimitations() {
    return dateLimitations;
  }
  public void setDateLimitations(String dateLimitations) {
    this.dateLimitations = dateLimitations;
  }

  
  /**
   * The list of required filters for the export metadata
   **/
  public ReportingExportMetadataJobResponse requiredFilters(List<String> requiredFilters) {
    this.requiredFilters = requiredFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of required filters for the export metadata")
  @JsonProperty("requiredFilters")
  public List<String> getRequiredFilters() {
    return requiredFilters;
  }
  public void setRequiredFilters(List<String> requiredFilters) {
    this.requiredFilters = requiredFilters;
  }

  
  /**
   * The list of supported filters for the export metadata
   **/
  public ReportingExportMetadataJobResponse supportedFilters(List<String> supportedFilters) {
    this.supportedFilters = supportedFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported filters for the export metadata")
  @JsonProperty("supportedFilters")
  public List<String> getSupportedFilters() {
    return supportedFilters;
  }
  public void setSupportedFilters(List<String> supportedFilters) {
    this.supportedFilters = supportedFilters;
  }

  
  /**
   * The list of required column ids for the export metadata
   **/
  public ReportingExportMetadataJobResponse requiredColumnIds(List<String> requiredColumnIds) {
    this.requiredColumnIds = requiredColumnIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of required column ids for the export metadata")
  @JsonProperty("requiredColumnIds")
  public List<String> getRequiredColumnIds() {
    return requiredColumnIds;
  }
  public void setRequiredColumnIds(List<String> requiredColumnIds) {
    this.requiredColumnIds = requiredColumnIds;
  }

  
  /**
   * The list of dependent column ids for the export metadata
   **/
  public ReportingExportMetadataJobResponse dependentColumnIds(Map<String, List<String>> dependentColumnIds) {
    this.dependentColumnIds = dependentColumnIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of dependent column ids for the export metadata")
  @JsonProperty("dependentColumnIds")
  public Map<String, List<String>> getDependentColumnIds() {
    return dependentColumnIds;
  }
  public void setDependentColumnIds(Map<String, List<String>> dependentColumnIds) {
    this.dependentColumnIds = dependentColumnIds;
  }

  
  /**
   * The list of available column ids for the export metadata
   **/
  public ReportingExportMetadataJobResponse availableColumnIds(List<String> availableColumnIds) {
    this.availableColumnIds = availableColumnIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of available column ids for the export metadata")
  @JsonProperty("availableColumnIds")
  public List<String> getAvailableColumnIds() {
    return availableColumnIds;
  }
  public void setAvailableColumnIds(List<String> availableColumnIds) {
    this.availableColumnIds = availableColumnIds;
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
    ReportingExportMetadataJobResponse reportingExportMetadataJobResponse = (ReportingExportMetadataJobResponse) o;
    return Objects.equals(this.id, reportingExportMetadataJobResponse.id) &&
        Objects.equals(this.name, reportingExportMetadataJobResponse.name) &&
        Objects.equals(this.viewType, reportingExportMetadataJobResponse.viewType) &&
        Objects.equals(this.dateLimitations, reportingExportMetadataJobResponse.dateLimitations) &&
        Objects.equals(this.requiredFilters, reportingExportMetadataJobResponse.requiredFilters) &&
        Objects.equals(this.supportedFilters, reportingExportMetadataJobResponse.supportedFilters) &&
        Objects.equals(this.requiredColumnIds, reportingExportMetadataJobResponse.requiredColumnIds) &&
        Objects.equals(this.dependentColumnIds, reportingExportMetadataJobResponse.dependentColumnIds) &&
        Objects.equals(this.availableColumnIds, reportingExportMetadataJobResponse.availableColumnIds) &&
        Objects.equals(this.selfUri, reportingExportMetadataJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, viewType, dateLimitations, requiredFilters, supportedFilters, requiredColumnIds, dependentColumnIds, availableColumnIds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingExportMetadataJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("    dateLimitations: ").append(toIndentedString(dateLimitations)).append("\n");
    sb.append("    requiredFilters: ").append(toIndentedString(requiredFilters)).append("\n");
    sb.append("    supportedFilters: ").append(toIndentedString(supportedFilters)).append("\n");
    sb.append("    requiredColumnIds: ").append(toIndentedString(requiredColumnIds)).append("\n");
    sb.append("    dependentColumnIds: ").append(toIndentedString(dependentColumnIds)).append("\n");
    sb.append("    availableColumnIds: ").append(toIndentedString(availableColumnIds)).append("\n");
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

