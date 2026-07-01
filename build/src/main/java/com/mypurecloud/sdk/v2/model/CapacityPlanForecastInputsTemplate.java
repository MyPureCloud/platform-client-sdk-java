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
import com.mypurecloud.sdk.v2.model.CapacityPlanForecastMetrics;
import com.mypurecloud.sdk.v2.model.ForecastInputPlanningGroupData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanForecastInputsTemplate
 */

public class CapacityPlanForecastInputsTemplate  implements Serializable {
  
  private LocalDate referenceBusinessUnitDate = null;

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
   * Granularity of the intervals
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private List<YearMonth> months = null;
  private List<ForecastInputPlanningGroupData> planningGroupsForecastData = null;
  private CapacityPlanForecastMetrics capacityPlanForecastSummary = null;

  public CapacityPlanForecastInputsTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      months = new ArrayList<YearMonth>();
      planningGroupsForecastData = new ArrayList<ForecastInputPlanningGroupData>();
    }
  }

  public CapacityPlanForecastInputsTemplate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      months = new ArrayList<YearMonth>();
      planningGroupsForecastData = new ArrayList<ForecastInputPlanningGroupData>();
    }
  }

  
  /**
   * The reference date for interval-based data relative to the business unit time zone for the forecast inputs. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanForecastInputsTemplate referenceBusinessUnitDate(LocalDate referenceBusinessUnitDate) {
    this.referenceBusinessUnitDate = referenceBusinessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The reference date for interval-based data relative to the business unit time zone for the forecast inputs. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("referenceBusinessUnitDate")
  public LocalDate getReferenceBusinessUnitDate() {
    return referenceBusinessUnitDate;
  }
  public void setReferenceBusinessUnitDate(LocalDate referenceBusinessUnitDate) {
    this.referenceBusinessUnitDate = referenceBusinessUnitDate;
  }


  /**
   * Granularity of the intervals
   **/
  public CapacityPlanForecastInputsTemplate granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Granularity of the intervals")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * The list of months covered by this capacity plan, formatted as yyyy-MM, populated for monthly granularity
   **/
  public CapacityPlanForecastInputsTemplate months(List<YearMonth> months) {
    this.months = months;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of months covered by this capacity plan, formatted as yyyy-MM, populated for monthly granularity")
  @JsonProperty("months")
  public List<YearMonth> getMonths() {
    return months;
  }
  public void setMonths(List<YearMonth> months) {
    this.months = months;
  }


  /**
   * The forecast data for the planning groups
   **/
  public CapacityPlanForecastInputsTemplate planningGroupsForecastData(List<ForecastInputPlanningGroupData> planningGroupsForecastData) {
    this.planningGroupsForecastData = planningGroupsForecastData;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The forecast data for the planning groups")
  @JsonProperty("planningGroupsForecastData")
  public List<ForecastInputPlanningGroupData> getPlanningGroupsForecastData() {
    return planningGroupsForecastData;
  }
  public void setPlanningGroupsForecastData(List<ForecastInputPlanningGroupData> planningGroupsForecastData) {
    this.planningGroupsForecastData = planningGroupsForecastData;
  }


  /**
   * The summary of forecast inputs for this capacity plan, for the selected granularity
   **/
  public CapacityPlanForecastInputsTemplate capacityPlanForecastSummary(CapacityPlanForecastMetrics capacityPlanForecastSummary) {
    this.capacityPlanForecastSummary = capacityPlanForecastSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The summary of forecast inputs for this capacity plan, for the selected granularity")
  @JsonProperty("capacityPlanForecastSummary")
  public CapacityPlanForecastMetrics getCapacityPlanForecastSummary() {
    return capacityPlanForecastSummary;
  }
  public void setCapacityPlanForecastSummary(CapacityPlanForecastMetrics capacityPlanForecastSummary) {
    this.capacityPlanForecastSummary = capacityPlanForecastSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastInputsTemplate capacityPlanForecastInputsTemplate = (CapacityPlanForecastInputsTemplate) o;

    return Objects.equals(this.referenceBusinessUnitDate, capacityPlanForecastInputsTemplate.referenceBusinessUnitDate) &&
            Objects.equals(this.granularity, capacityPlanForecastInputsTemplate.granularity) &&
            Objects.equals(this.months, capacityPlanForecastInputsTemplate.months) &&
            Objects.equals(this.planningGroupsForecastData, capacityPlanForecastInputsTemplate.planningGroupsForecastData) &&
            Objects.equals(this.capacityPlanForecastSummary, capacityPlanForecastInputsTemplate.capacityPlanForecastSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceBusinessUnitDate, granularity, months, planningGroupsForecastData, capacityPlanForecastSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastInputsTemplate {\n");
    
    sb.append("    referenceBusinessUnitDate: ").append(toIndentedString(referenceBusinessUnitDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    planningGroupsForecastData: ").append(toIndentedString(planningGroupsForecastData)).append("\n");
    sb.append("    capacityPlanForecastSummary: ").append(toIndentedString(capacityPlanForecastSummary)).append("\n");
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

