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
import com.mypurecloud.sdk.v2.model.DivisionReference;
import com.mypurecloud.sdk.v2.model.InsightsAgentItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * InsightsAgents
 */

public class InsightsAgents  implements Serializable {
  
  private AddressableEntityRef performanceProfile = null;
  private DivisionReference division = null;

  private static class GranularityEnumDeserializer extends StdDeserializer<GranularityEnum> {
    public GranularityEnumDeserializer() {
      super(GranularityEnumDeserializer.class);
    }

    @Override
    public GranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Granularity
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityEnum value : GranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityEnum granularity = null;
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;
  private List<InsightsAgentItem> entities = new ArrayList<InsightsAgentItem>();

  
  /**
   * The performance profile
   **/
  public InsightsAgents performanceProfile(AddressableEntityRef performanceProfile) {
    this.performanceProfile = performanceProfile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The performance profile")
  @JsonProperty("performanceProfile")
  public AddressableEntityRef getPerformanceProfile() {
    return performanceProfile;
  }
  public void setPerformanceProfile(AddressableEntityRef performanceProfile) {
    this.performanceProfile = performanceProfile;
  }


  /**
   * The division
   **/
  public InsightsAgents division(DivisionReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division")
  @JsonProperty("division")
  public DivisionReference getDivision() {
    return division;
  }
  public void setDivision(DivisionReference division) {
    this.division = division;
  }


  /**
   * Granularity
   **/
  public InsightsAgents granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public InsightsAgents dateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }
  public void setDateStartWorkday(LocalDate dateStartWorkday) {
    this.dateStartWorkday = dateStartWorkday;
  }


  /**
   * End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public InsightsAgents dateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }
  public void setDateEndWorkday(LocalDate dateEndWorkday) {
    this.dateEndWorkday = dateEndWorkday;
  }


  /**
   * The list of insights agents
   **/
  public InsightsAgents entities(List<InsightsAgentItem> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of insights agents")
  @JsonProperty("entities")
  public List<InsightsAgentItem> getEntities() {
    return entities;
  }
  public void setEntities(List<InsightsAgentItem> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsAgents insightsAgents = (InsightsAgents) o;

    return Objects.equals(this.performanceProfile, insightsAgents.performanceProfile) &&
            Objects.equals(this.division, insightsAgents.division) &&
            Objects.equals(this.granularity, insightsAgents.granularity) &&
            Objects.equals(this.dateStartWorkday, insightsAgents.dateStartWorkday) &&
            Objects.equals(this.dateEndWorkday, insightsAgents.dateEndWorkday) &&
            Objects.equals(this.entities, insightsAgents.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceProfile, division, granularity, dateStartWorkday, dateEndWorkday, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsAgents {\n");
    
    sb.append("    performanceProfile: ").append(toIndentedString(performanceProfile)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

