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
import com.mypurecloud.sdk.v2.model.StaffingGroupReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * StaffingGroupMetricChangeResponse
 */

public class StaffingGroupMetricChangeResponse  implements Serializable {
  
  private Integer numberOfWeeks = null;
  private Integer weekStartNumber = null;
  private Double value = null;

  private static class MetricEnumDeserializer extends StdDeserializer<MetricEnum> {
    public MetricEnumDeserializer() {
      super(MetricEnumDeserializer.class);
    }

    @Override
    public MetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The metric which is going to be modified for the selected staffing groups
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STARTINGWEEKLYFULLTIMEEQUIVALENTCOUNT("StartingWeeklyFullTimeEquivalentCount"),
    NEWHIRESFULLTIMEEQUIVALENTCOUNT("NewHiresFullTimeEquivalentCount"),
    ATTRITIONPERCENTAGE("AttritionPercentage"),
    SHRINKAGEPERCENTAGE("ShrinkagePercentage");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;
  private String notes = null;
  private List<StaffingGroupReference> staffingGroups = null;
  private UserReference createdBy = null;
  private Date createdDate = null;

  public StaffingGroupMetricChangeResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staffingGroups = new ArrayList<StaffingGroupReference>();
    }
  }

  
  /**
   * The number of weeks to which the metric change applies
   **/
  public StaffingGroupMetricChangeResponse numberOfWeeks(Integer numberOfWeeks) {
    this.numberOfWeeks = numberOfWeeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of weeks to which the metric change applies")
  @JsonProperty("numberOfWeeks")
  public Integer getNumberOfWeeks() {
    return numberOfWeeks;
  }
  public void setNumberOfWeeks(Integer numberOfWeeks) {
    this.numberOfWeeks = numberOfWeeks;
  }


  /**
   * The start number of the week (starting from 1) to which the metric change applies, related to numberOfWeeks
   **/
  public StaffingGroupMetricChangeResponse weekStartNumber(Integer weekStartNumber) {
    this.weekStartNumber = weekStartNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start number of the week (starting from 1) to which the metric change applies, related to numberOfWeeks")
  @JsonProperty("weekStartNumber")
  public Integer getWeekStartNumber() {
    return weekStartNumber;
  }
  public void setWeekStartNumber(Integer weekStartNumber) {
    this.weekStartNumber = weekStartNumber;
  }


  /**
   * The value of the metric
   **/
  public StaffingGroupMetricChangeResponse value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the metric")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  /**
   * The metric which is going to be modified for the selected staffing groups
   **/
  public StaffingGroupMetricChangeResponse metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metric which is going to be modified for the selected staffing groups")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * Notes about the staffing groups metric changes
   **/
  public StaffingGroupMetricChangeResponse notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes about the staffing groups metric changes")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   * The staffing groups affected by the metric change
   **/
  public StaffingGroupMetricChangeResponse staffingGroups(List<StaffingGroupReference> staffingGroups) {
    this.staffingGroups = staffingGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The staffing groups affected by the metric change")
  @JsonProperty("staffingGroups")
  public List<StaffingGroupReference> getStaffingGroups() {
    return staffingGroups;
  }
  public void setStaffingGroups(List<StaffingGroupReference> staffingGroups) {
    this.staffingGroups = staffingGroups;
  }


  /**
   * The user who created the metric change
   **/
  public StaffingGroupMetricChangeResponse createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who created the metric change")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The date the entity was created, in ISO-8601 format
   **/
  public StaffingGroupMetricChangeResponse createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the entity was created, in ISO-8601 format")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingGroupMetricChangeResponse staffingGroupMetricChangeResponse = (StaffingGroupMetricChangeResponse) o;

    return Objects.equals(this.numberOfWeeks, staffingGroupMetricChangeResponse.numberOfWeeks) &&
            Objects.equals(this.weekStartNumber, staffingGroupMetricChangeResponse.weekStartNumber) &&
            Objects.equals(this.value, staffingGroupMetricChangeResponse.value) &&
            Objects.equals(this.metric, staffingGroupMetricChangeResponse.metric) &&
            Objects.equals(this.notes, staffingGroupMetricChangeResponse.notes) &&
            Objects.equals(this.staffingGroups, staffingGroupMetricChangeResponse.staffingGroups) &&
            Objects.equals(this.createdBy, staffingGroupMetricChangeResponse.createdBy) &&
            Objects.equals(this.createdDate, staffingGroupMetricChangeResponse.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfWeeks, weekStartNumber, value, metric, notes, staffingGroups, createdBy, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingGroupMetricChangeResponse {\n");
    
    sb.append("    numberOfWeeks: ").append(toIndentedString(numberOfWeeks)).append("\n");
    sb.append("    weekStartNumber: ").append(toIndentedString(weekStartNumber)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    staffingGroups: ").append(toIndentedString(staffingGroups)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

