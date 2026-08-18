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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AggregatedExportSnapshotJobRequest
 */

public class AggregatedExportSnapshotJobRequest  implements Serializable {
  

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
   * Granularity of the exported data, defaults to day
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FIFTEENMINUTES("FifteenMinutes"),
    THIRTYMINUTES("ThirtyMinutes"),
    SIXTYMINUTES("SixtyMinutes"),
    DAY("Day"),
    WEEK("Week");

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
  private String timeZone = null;
  private String delimiter = null;
  private List<String> planningGroupIds = null;
  private Date dateStart = null;
  private Date dateEnd = null;

  private static class SnapshotIdEnumDeserializer extends StdDeserializer<SnapshotIdEnum> {
    public SnapshotIdEnumDeserializer() {
      super(SnapshotIdEnumDeserializer.class);
    }

    @Override
    public SnapshotIdEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SnapshotIdEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The ID of the snapshot to export
   */
 @JsonDeserialize(using = SnapshotIdEnumDeserializer.class)
  public enum SnapshotIdEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONEDAYAGO("OneDayAgo"),
    ONEWEEKAGO("OneWeekAgo"),
    ONEMONTHAGO("OneMonthAgo"),
    THREEMONTHSAGO("ThreeMonthsAgo"),
    SIXMONTHSAGO("SixMonthsAgo"),
    ONEYEARAGO("OneYearAgo"),
    EIGHTEENMONTHSAGO("EighteenMonthsAgo"),
    TWOYEARSAGO("TwoYearsAgo");

    private String value;

    SnapshotIdEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SnapshotIdEnum fromString(String key) {
      if (key == null) return null;

      for (SnapshotIdEnum value : SnapshotIdEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SnapshotIdEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SnapshotIdEnum snapshotId = null;

  public AggregatedExportSnapshotJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      planningGroupIds = new ArrayList<String>();
    }
  }

  public AggregatedExportSnapshotJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      planningGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * Granularity of the exported data, defaults to day
   **/
  public AggregatedExportSnapshotJobRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity of the exported data, defaults to day")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * The requested time zone of the exported data, in Olson format. Defaults to business unit time zone
   **/
  public AggregatedExportSnapshotJobRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The requested time zone of the exported data, in Olson format. Defaults to business unit time zone")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * The delimiter to use between fields in the export, defaults to comma
   **/
  public AggregatedExportSnapshotJobRequest delimiter(String delimiter) {
    this.delimiter = delimiter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The delimiter to use between fields in the export, defaults to comma")
  @JsonProperty("delimiter")
  public String getDelimiter() {
    return delimiter;
  }
  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }


  /**
   * The IDs of the planning groups to include in the export, defaults to all planning groups in the business unit
   **/
  public AggregatedExportSnapshotJobRequest planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the planning groups to include in the export, defaults to all planning groups in the business unit")
  @JsonProperty("planningGroupIds")
  public List<String> getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }


  /**
   * Start date-time of the export range in ISO-8601 format
   **/
  public AggregatedExportSnapshotJobRequest dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start date-time of the export range in ISO-8601 format")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * End date-time of the export range in ISO-8601 format
   **/
  public AggregatedExportSnapshotJobRequest dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End date-time of the export range in ISO-8601 format")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * The ID of the snapshot to export
   **/
  public AggregatedExportSnapshotJobRequest snapshotId(SnapshotIdEnum snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the snapshot to export")
  @JsonProperty("snapshotId")
  public SnapshotIdEnum getSnapshotId() {
    return snapshotId;
  }
  public void setSnapshotId(SnapshotIdEnum snapshotId) {
    this.snapshotId = snapshotId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedExportSnapshotJobRequest aggregatedExportSnapshotJobRequest = (AggregatedExportSnapshotJobRequest) o;

    return Objects.equals(this.granularity, aggregatedExportSnapshotJobRequest.granularity) &&
            Objects.equals(this.timeZone, aggregatedExportSnapshotJobRequest.timeZone) &&
            Objects.equals(this.delimiter, aggregatedExportSnapshotJobRequest.delimiter) &&
            Objects.equals(this.planningGroupIds, aggregatedExportSnapshotJobRequest.planningGroupIds) &&
            Objects.equals(this.dateStart, aggregatedExportSnapshotJobRequest.dateStart) &&
            Objects.equals(this.dateEnd, aggregatedExportSnapshotJobRequest.dateEnd) &&
            Objects.equals(this.snapshotId, aggregatedExportSnapshotJobRequest.snapshotId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularity, timeZone, delimiter, planningGroupIds, dateStart, dateEnd, snapshotId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedExportSnapshotJobRequest {\n");
    
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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

