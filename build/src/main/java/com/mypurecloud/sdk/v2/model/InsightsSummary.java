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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DivisionReference;
import com.mypurecloud.sdk.v2.model.InsightsSummaryUserItem;
import com.mypurecloud.sdk.v2.model.WorkdayPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * InsightsSummary
 */

public class InsightsSummary  implements Serializable {
  
  private List<InsightsSummaryUserItem> entities = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
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
  private WorkdayPeriod comparativePeriod = null;
  private WorkdayPeriod primaryPeriod = null;
  private Integer pageCount = null;

  public InsightsSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<InsightsSummaryUserItem>();
    }
  }

  
  /**
   **/
  public InsightsSummary entities(List<InsightsSummaryUserItem> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<InsightsSummaryUserItem> getEntities() {
    return entities;
  }
  public void setEntities(List<InsightsSummaryUserItem> entities) {
    this.entities = entities;
  }


  /**
   **/
  public InsightsSummary pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   **/
  public InsightsSummary pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   **/
  public InsightsSummary total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   * The performance profile
   **/
  public InsightsSummary performanceProfile(AddressableEntityRef performanceProfile) {
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
  public InsightsSummary division(DivisionReference division) {
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
  public InsightsSummary granularity(GranularityEnum granularity) {
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
   * The comparative period work day date range
   **/
  public InsightsSummary comparativePeriod(WorkdayPeriod comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comparative period work day date range")
  @JsonProperty("comparativePeriod")
  public WorkdayPeriod getComparativePeriod() {
    return comparativePeriod;
  }
  public void setComparativePeriod(WorkdayPeriod comparativePeriod) {
    this.comparativePeriod = comparativePeriod;
  }


  /**
   * The primary period work day date range
   **/
  public InsightsSummary primaryPeriod(WorkdayPeriod primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The primary period work day date range")
  @JsonProperty("primaryPeriod")
  public WorkdayPeriod getPrimaryPeriod() {
    return primaryPeriod;
  }
  public void setPrimaryPeriod(WorkdayPeriod primaryPeriod) {
    this.primaryPeriod = primaryPeriod;
  }


  /**
   **/
  public InsightsSummary pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsSummary insightsSummary = (InsightsSummary) o;

    return Objects.equals(this.entities, insightsSummary.entities) &&
            Objects.equals(this.pageSize, insightsSummary.pageSize) &&
            Objects.equals(this.pageNumber, insightsSummary.pageNumber) &&
            Objects.equals(this.total, insightsSummary.total) &&
            Objects.equals(this.performanceProfile, insightsSummary.performanceProfile) &&
            Objects.equals(this.division, insightsSummary.division) &&
            Objects.equals(this.granularity, insightsSummary.granularity) &&
            Objects.equals(this.comparativePeriod, insightsSummary.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, insightsSummary.primaryPeriod) &&
            Objects.equals(this.pageCount, insightsSummary.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, performanceProfile, division, granularity, comparativePeriod, primaryPeriod, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsSummary {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    performanceProfile: ").append(toIndentedString(performanceProfile)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    comparativePeriod: ").append(toIndentedString(comparativePeriod)).append("\n");
    sb.append("    primaryPeriod: ").append(toIndentedString(primaryPeriod)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

