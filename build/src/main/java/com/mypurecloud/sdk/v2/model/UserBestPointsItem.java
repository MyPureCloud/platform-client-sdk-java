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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * UserBestPointsItem
 */

public class UserBestPointsItem  implements Serializable {
  

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
  private Integer points = null;
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;
  private Integer rank = null;

  
  @ApiModelProperty(example = "null", value = "Best points aggregation interval granularity")
  @JsonProperty("granularityType")
  public GranularityTypeEnum getGranularityType() {
    return granularityType;
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

  
  @ApiModelProperty(example = "null", value = "The rank of this user")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBestPointsItem userBestPointsItem = (UserBestPointsItem) o;
    return Objects.equals(this.granularityType, userBestPointsItem.granularityType) &&
        Objects.equals(this.points, userBestPointsItem.points) &&
        Objects.equals(this.dateStartWorkday, userBestPointsItem.dateStartWorkday) &&
        Objects.equals(this.dateEndWorkday, userBestPointsItem.dateEndWorkday) &&
        Objects.equals(this.rank, userBestPointsItem.rank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularityType, points, dateStartWorkday, dateEndWorkday, rank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBestPointsItem {\n");
    
    sb.append("    granularityType: ").append(toIndentedString(granularityType)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
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

