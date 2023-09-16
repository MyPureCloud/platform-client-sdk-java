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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.AlertSummaryEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AlertSummary
 */

public class AlertSummary  implements Serializable {
  
  private List<AlertSummaryEntity> entities = new ArrayList<AlertSummaryEntity>();
  private AddressableEntityRef conversation = null;

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
   * The metric type that is monitored.
   */
 @JsonDeserialize(using = MetricTypeEnumDeserializer.class)
  public enum MetricTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERVAL("Interval"),
    INSTANCE("Instance");

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
  private Boolean entitiesAreTeamMembers = null;

  
  /**
   * The entities who violated the rule condition over the duration of the alert.
   **/
  public AlertSummary entities(List<AlertSummaryEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The entities who violated the rule condition over the duration of the alert.")
  @JsonProperty("entities")
  public List<AlertSummaryEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<AlertSummaryEntity> entities) {
    this.entities = entities;
  }


  /**
   * The id of the conversation that triggered the alert.  Only used for alerts based on instance-based conversation metrics.
   **/
  public AlertSummary conversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the conversation that triggered the alert.  Only used for alerts based on instance-based conversation metrics.")
  @JsonProperty("conversation")
  public AddressableEntityRef getConversation() {
    return conversation;
  }
  public void setConversation(AddressableEntityRef conversation) {
    this.conversation = conversation;
  }


  /**
   * The metric type that is monitored.
   **/
  public AlertSummary metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metric type that is monitored.")
  @JsonProperty("metricType")
  public MetricTypeEnum getMetricType() {
    return metricType;
  }
  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }


  /**
   * Flag that indicated whether or not the alert is for a rule with a condition for all members of a team.
   **/
  public AlertSummary entitiesAreTeamMembers(Boolean entitiesAreTeamMembers) {
    this.entitiesAreTeamMembers = entitiesAreTeamMembers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Flag that indicated whether or not the alert is for a rule with a condition for all members of a team.")
  @JsonProperty("entitiesAreTeamMembers")
  public Boolean getEntitiesAreTeamMembers() {
    return entitiesAreTeamMembers;
  }
  public void setEntitiesAreTeamMembers(Boolean entitiesAreTeamMembers) {
    this.entitiesAreTeamMembers = entitiesAreTeamMembers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSummary alertSummary = (AlertSummary) o;

    return Objects.equals(this.entities, alertSummary.entities) &&
            Objects.equals(this.conversation, alertSummary.conversation) &&
            Objects.equals(this.metricType, alertSummary.metricType) &&
            Objects.equals(this.entitiesAreTeamMembers, alertSummary.entitiesAreTeamMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, conversation, metricType, entitiesAreTeamMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSummary {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    entitiesAreTeamMembers: ").append(toIndentedString(entitiesAreTeamMembers)).append("\n");
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

