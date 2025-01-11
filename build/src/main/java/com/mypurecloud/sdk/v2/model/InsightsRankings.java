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
import com.mypurecloud.sdk.v2.model.InsightsSummaryUserItem;
import com.mypurecloud.sdk.v2.model.WorkdayPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * InsightsRankings
 */

public class InsightsRankings  implements Serializable {
  
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
  private List<InsightsSummaryUserItem> leaders = new ArrayList<InsightsSummaryUserItem>();
  private List<InsightsSummaryUserItem> trailers = new ArrayList<InsightsSummaryUserItem>();

  
  /**
   * The performance profile
   **/
  public InsightsRankings performanceProfile(AddressableEntityRef performanceProfile) {
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
  public InsightsRankings division(DivisionReference division) {
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
  public InsightsRankings granularity(GranularityEnum granularity) {
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
  public InsightsRankings comparativePeriod(WorkdayPeriod comparativePeriod) {
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
  public InsightsRankings primaryPeriod(WorkdayPeriod primaryPeriod) {
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
   * The leaders users
   **/
  public InsightsRankings leaders(List<InsightsSummaryUserItem> leaders) {
    this.leaders = leaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The leaders users")
  @JsonProperty("leaders")
  public List<InsightsSummaryUserItem> getLeaders() {
    return leaders;
  }
  public void setLeaders(List<InsightsSummaryUserItem> leaders) {
    this.leaders = leaders;
  }


  /**
   * The trailing users
   **/
  public InsightsRankings trailers(List<InsightsSummaryUserItem> trailers) {
    this.trailers = trailers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The trailing users")
  @JsonProperty("trailers")
  public List<InsightsSummaryUserItem> getTrailers() {
    return trailers;
  }
  public void setTrailers(List<InsightsSummaryUserItem> trailers) {
    this.trailers = trailers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightsRankings insightsRankings = (InsightsRankings) o;

    return Objects.equals(this.performanceProfile, insightsRankings.performanceProfile) &&
            Objects.equals(this.division, insightsRankings.division) &&
            Objects.equals(this.granularity, insightsRankings.granularity) &&
            Objects.equals(this.comparativePeriod, insightsRankings.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, insightsRankings.primaryPeriod) &&
            Objects.equals(this.leaders, insightsRankings.leaders) &&
            Objects.equals(this.trailers, insightsRankings.trailers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceProfile, division, granularity, comparativePeriod, primaryPeriod, leaders, trailers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightsRankings {\n");
    
    sb.append("    performanceProfile: ").append(toIndentedString(performanceProfile)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    comparativePeriod: ").append(toIndentedString(comparativePeriod)).append("\n");
    sb.append("    primaryPeriod: ").append(toIndentedString(primaryPeriod)).append("\n");
    sb.append("    leaders: ").append(toIndentedString(leaders)).append("\n");
    sb.append("    trailers: ").append(toIndentedString(trailers)).append("\n");
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

