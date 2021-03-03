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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IntradayPlanningGroupRequest
 */

public class IntradayPlanningGroupRequest  implements Serializable {
  
  private LocalDate businessUnitDate = null;

  private static class CategoriesEnumDeserializer extends StdDeserializer<CategoriesEnum> {
    public CategoriesEnumDeserializer() {
      super(CategoriesEnumDeserializer.class);
    }

    @Override
    public CategoriesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CategoriesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets categories
   */
 @JsonDeserialize(using = CategoriesEnumDeserializer.class)
  public enum CategoriesEnum {
    FORECASTDATA("ForecastData"),
    SCHEDULEDATA("ScheduleData"),
    PERFORMANCEPREDICTIONDATA("PerformancePredictionData");

    private String value;

    CategoriesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoriesEnum fromString(String key) {
      if (key == null) return null;

      for (CategoriesEnum value : CategoriesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoriesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<CategoriesEnum> categories = new ArrayList<CategoriesEnum>();
  private List<String> planningGroupIds = new ArrayList<String>();
  private Integer intervalLengthMinutes = null;

  
  /**
   * Requested date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public IntradayPlanningGroupRequest businessUnitDate(LocalDate businessUnitDate) {
    this.businessUnitDate = businessUnitDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Requested date in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("businessUnitDate")
  public LocalDate getBusinessUnitDate() {
    return businessUnitDate;
  }
  public void setBusinessUnitDate(LocalDate businessUnitDate) {
    this.businessUnitDate = businessUnitDate;
  }

  
  /**
   * The metric categories
   **/
  public IntradayPlanningGroupRequest categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metric categories")
  @JsonProperty("categories")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }
  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  
  /**
   * The IDs of the planning groups for which to fetch data.  Omitting or passing an empty list will return all available planning groups
   **/
  public IntradayPlanningGroupRequest planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the planning groups for which to fetch data.  Omitting or passing an empty list will return all available planning groups")
  @JsonProperty("planningGroupIds")
  public List<String> getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }

  
  /**
   * The period/interval in minutes for which to aggregate the data. Required, defaults to 15
   **/
  public IntradayPlanningGroupRequest intervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The period/interval in minutes for which to aggregate the data. Required, defaults to 15")
  @JsonProperty("intervalLengthMinutes")
  public Integer getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayPlanningGroupRequest intradayPlanningGroupRequest = (IntradayPlanningGroupRequest) o;
    return Objects.equals(this.businessUnitDate, intradayPlanningGroupRequest.businessUnitDate) &&
        Objects.equals(this.categories, intradayPlanningGroupRequest.categories) &&
        Objects.equals(this.planningGroupIds, intradayPlanningGroupRequest.planningGroupIds) &&
        Objects.equals(this.intervalLengthMinutes, intradayPlanningGroupRequest.intervalLengthMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnitDate, categories, planningGroupIds, intervalLengthMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayPlanningGroupRequest {\n");
    
    sb.append("    businessUnitDate: ").append(toIndentedString(businessUnitDate)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
    sb.append("    intervalLengthMinutes: ").append(toIndentedString(intervalLengthMinutes)).append("\n");
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

