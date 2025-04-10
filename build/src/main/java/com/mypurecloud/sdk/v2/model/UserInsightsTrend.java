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
import com.mypurecloud.sdk.v2.model.UserInsightsTrendMetricItem;
import com.mypurecloud.sdk.v2.model.UserInsightsTrendTotalItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkdayPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserInsightsTrend
 */

public class UserInsightsTrend  implements Serializable {
  
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
  private UserReference user = null;
  private List<UserInsightsTrendMetricItem> entities = null;
  private UserInsightsTrendTotalItem total = null;

  public UserInsightsTrend() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<UserInsightsTrendMetricItem>();
    }
  }

  
  /**
   * The performance profile
   **/
  public UserInsightsTrend performanceProfile(AddressableEntityRef performanceProfile) {
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
  public UserInsightsTrend division(DivisionReference division) {
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
  public UserInsightsTrend granularity(GranularityEnum granularity) {
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
  public UserInsightsTrend comparativePeriod(WorkdayPeriod comparativePeriod) {
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
  public UserInsightsTrend primaryPeriod(WorkdayPeriod primaryPeriod) {
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
   * The query user
   **/
  public UserInsightsTrend user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The query user")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The list of insights trend for each metric
   **/
  public UserInsightsTrend entities(List<UserInsightsTrendMetricItem> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of insights trend for each metric")
  @JsonProperty("entities")
  public List<UserInsightsTrendMetricItem> getEntities() {
    return entities;
  }
  public void setEntities(List<UserInsightsTrendMetricItem> entities) {
    this.entities = entities;
  }


  /**
   * The insights trend in total
   **/
  public UserInsightsTrend total(UserInsightsTrendTotalItem total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The insights trend in total")
  @JsonProperty("total")
  public UserInsightsTrendTotalItem getTotal() {
    return total;
  }
  public void setTotal(UserInsightsTrendTotalItem total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInsightsTrend userInsightsTrend = (UserInsightsTrend) o;

    return Objects.equals(this.performanceProfile, userInsightsTrend.performanceProfile) &&
            Objects.equals(this.division, userInsightsTrend.division) &&
            Objects.equals(this.granularity, userInsightsTrend.granularity) &&
            Objects.equals(this.comparativePeriod, userInsightsTrend.comparativePeriod) &&
            Objects.equals(this.primaryPeriod, userInsightsTrend.primaryPeriod) &&
            Objects.equals(this.user, userInsightsTrend.user) &&
            Objects.equals(this.entities, userInsightsTrend.entities) &&
            Objects.equals(this.total, userInsightsTrend.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(performanceProfile, division, granularity, comparativePeriod, primaryPeriod, user, entities, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInsightsTrend {\n");
    
    sb.append("    performanceProfile: ").append(toIndentedString(performanceProfile)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    comparativePeriod: ").append(toIndentedString(comparativePeriod)).append("\n");
    sb.append("    primaryPeriod: ").append(toIndentedString(primaryPeriod)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

