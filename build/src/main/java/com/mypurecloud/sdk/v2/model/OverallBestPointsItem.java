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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OverallBestPointsItem
 */

public class OverallBestPointsItem  implements Serializable {
  

  private static class GranularityTypeEnumDeserializer extends StdDeserializer<GranularityTypeEnum> {
    public GranularityTypeEnumDeserializer() {
      super(GranularityTypeEnumDeserializer.class);
    }

    @Override
    public GranularityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Best points aggregation interval granularity
   */
 @JsonDeserialize(using = GranularityTypeEnumDeserializer.class)
  public enum GranularityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MONTHLY("Monthly"),
    WEEKLY("Weekly"),
    DAILY("Daily");

    private String value;

    GranularityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityTypeEnum value : GranularityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityTypeEnum granularityType = null;
  private List<UserReference> users = new ArrayList<UserReference>();
  private Integer count = null;
  private Integer points = null;
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;

  
  @ApiModelProperty(example = "null", value = "Best points aggregation interval granularity")
  @JsonProperty("granularityType")
  public GranularityTypeEnum getGranularityType() {
    return granularityType;
  }

  
  @ApiModelProperty(example = "null", value = "List of associated users with the equal points.")
  @JsonProperty("users")
  public List<UserReference> getUsers() {
    return users;
  }

  
  @ApiModelProperty(example = "null", value = "The count of the user IDs in the list")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  
  @ApiModelProperty(example = "null", value = "Gamification points")
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }

  
  @ApiModelProperty(example = "null", value = "Start workday of the best points aggregation interval. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }

  
  @ApiModelProperty(example = "null", value = "End workday of the best points aggregation interval. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverallBestPointsItem overallBestPointsItem = (OverallBestPointsItem) o;
    return Objects.equals(this.granularityType, overallBestPointsItem.granularityType) &&
        Objects.equals(this.users, overallBestPointsItem.users) &&
        Objects.equals(this.count, overallBestPointsItem.count) &&
        Objects.equals(this.points, overallBestPointsItem.points) &&
        Objects.equals(this.dateStartWorkday, overallBestPointsItem.dateStartWorkday) &&
        Objects.equals(this.dateEndWorkday, overallBestPointsItem.dateEndWorkday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularityType, users, count, points, dateStartWorkday, dateEndWorkday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverallBestPointsItem {\n");
    
    sb.append("    granularityType: ").append(toIndentedString(granularityType)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
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

