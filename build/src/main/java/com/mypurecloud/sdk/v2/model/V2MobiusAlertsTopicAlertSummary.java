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
import com.mypurecloud.sdk.v2.model.V2MobiusAlertsTopicAlertSummaryEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2MobiusAlertsTopicAlertSummary
 */

public class V2MobiusAlertsTopicAlertSummary  implements Serializable {
  
  private List<V2MobiusAlertsTopicAlertSummaryEntity> entities = new ArrayList<V2MobiusAlertsTopicAlertSummaryEntity>();
  private String conversationId = null;

  private static class MetricTypeEnumDeserializer extends StdDeserializer<MetricTypeEnum> {
    public MetricTypeEnumDeserializer() {
      super(MetricTypeEnumDeserializer.class);
    }

    @Override
    public MetricTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets metricType
   */
 @JsonDeserialize(using = MetricTypeEnumDeserializer.class)
  public enum MetricTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERVAL("Interval"),
    INSTANCE("Instance"),
    UNKNOWN("Unknown");

    private String value;

    MetricTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MetricTypeEnum value : MetricTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricTypeEnum metricType = null;
  private Boolean isTeamMemberRuleSummary = null;
  private Boolean teamMemberRuleSummary = null;

  
  /**
   **/
  public V2MobiusAlertsTopicAlertSummary entities(List<V2MobiusAlertsTopicAlertSummaryEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<V2MobiusAlertsTopicAlertSummaryEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<V2MobiusAlertsTopicAlertSummaryEntity> entities) {
    this.entities = entities;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummary conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummary metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metricType")
  public MetricTypeEnum getMetricType() {
    return metricType;
  }
  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummary isTeamMemberRuleSummary(Boolean isTeamMemberRuleSummary) {
    this.isTeamMemberRuleSummary = isTeamMemberRuleSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isTeamMemberRuleSummary")
  public Boolean getIsTeamMemberRuleSummary() {
    return isTeamMemberRuleSummary;
  }
  public void setIsTeamMemberRuleSummary(Boolean isTeamMemberRuleSummary) {
    this.isTeamMemberRuleSummary = isTeamMemberRuleSummary;
  }


  /**
   **/
  public V2MobiusAlertsTopicAlertSummary teamMemberRuleSummary(Boolean teamMemberRuleSummary) {
    this.teamMemberRuleSummary = teamMemberRuleSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("teamMemberRuleSummary")
  public Boolean getTeamMemberRuleSummary() {
    return teamMemberRuleSummary;
  }
  public void setTeamMemberRuleSummary(Boolean teamMemberRuleSummary) {
    this.teamMemberRuleSummary = teamMemberRuleSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2MobiusAlertsTopicAlertSummary v2MobiusAlertsTopicAlertSummary = (V2MobiusAlertsTopicAlertSummary) o;

    return Objects.equals(this.entities, v2MobiusAlertsTopicAlertSummary.entities) &&
            Objects.equals(this.conversationId, v2MobiusAlertsTopicAlertSummary.conversationId) &&
            Objects.equals(this.metricType, v2MobiusAlertsTopicAlertSummary.metricType) &&
            Objects.equals(this.isTeamMemberRuleSummary, v2MobiusAlertsTopicAlertSummary.isTeamMemberRuleSummary) &&
            Objects.equals(this.teamMemberRuleSummary, v2MobiusAlertsTopicAlertSummary.teamMemberRuleSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, conversationId, metricType, isTeamMemberRuleSummary, teamMemberRuleSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusAlertsTopicAlertSummary {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    isTeamMemberRuleSummary: ").append(toIndentedString(isTeamMemberRuleSummary)).append("\n");
    sb.append("    teamMemberRuleSummary: ").append(toIndentedString(teamMemberRuleSummary)).append("\n");
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

