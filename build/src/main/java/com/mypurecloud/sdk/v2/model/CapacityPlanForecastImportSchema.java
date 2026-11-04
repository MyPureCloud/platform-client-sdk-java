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
import com.mypurecloud.sdk.v2.model.CapacityPlanForecastPlanningGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CapacityPlanForecastImportSchema
 */

public class CapacityPlanForecastImportSchema  implements Serializable {
  

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
   * The granularity at which forecast values are provided for each planning group
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HOURLY("Hourly"),
    DAILY("Daily");

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
  private LocalDate businessUnitStartDate = null;
  private List<CapacityPlanForecastPlanningGroup> planningGroups = null;

  public CapacityPlanForecastImportSchema() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      planningGroups = new ArrayList<CapacityPlanForecastPlanningGroup>();
    }
  }

  public CapacityPlanForecastImportSchema(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      planningGroups = new ArrayList<CapacityPlanForecastPlanningGroup>();
    }
  }

  
  /**
   * The granularity at which forecast values are provided for each planning group
   **/
  public CapacityPlanForecastImportSchema granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The granularity at which forecast values are provided for each planning group")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * The first day of the forecast relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public CapacityPlanForecastImportSchema businessUnitStartDate(LocalDate businessUnitStartDate) {
    this.businessUnitStartDate = businessUnitStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The first day of the forecast relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("businessUnitStartDate")
  public LocalDate getBusinessUnitStartDate() {
    return businessUnitStartDate;
  }
  public void setBusinessUnitStartDate(LocalDate businessUnitStartDate) {
    this.businessUnitStartDate = businessUnitStartDate;
  }


  /**
   * The forecast data for the planning groups included in this forecast
   **/
  public CapacityPlanForecastImportSchema planningGroups(List<CapacityPlanForecastPlanningGroup> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The forecast data for the planning groups included in this forecast")
  @JsonProperty("planningGroups")
  public List<CapacityPlanForecastPlanningGroup> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<CapacityPlanForecastPlanningGroup> planningGroups) {
    this.planningGroups = planningGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastImportSchema capacityPlanForecastImportSchema = (CapacityPlanForecastImportSchema) o;

    return Objects.equals(this.granularity, capacityPlanForecastImportSchema.granularity) &&
            Objects.equals(this.businessUnitStartDate, capacityPlanForecastImportSchema.businessUnitStartDate) &&
            Objects.equals(this.planningGroups, capacityPlanForecastImportSchema.planningGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularity, businessUnitStartDate, planningGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastImportSchema {\n");
    
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    businessUnitStartDate: ").append(toIndentedString(businessUnitStartDate)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
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

