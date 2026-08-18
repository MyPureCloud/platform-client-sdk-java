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
 * AggregatedExportJobRequest
 */

public class AggregatedExportJobRequest  implements Serializable {
  

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

  public AggregatedExportJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      planningGroupIds = new ArrayList<String>();
    }
  }

  public AggregatedExportJobRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      planningGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   * Granularity of the exported data, defaults to day
   **/
  public AggregatedExportJobRequest granularity(GranularityEnum granularity) {
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
  public AggregatedExportJobRequest timeZone(String timeZone) {
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
  public AggregatedExportJobRequest delimiter(String delimiter) {
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
  public AggregatedExportJobRequest planningGroupIds(List<String> planningGroupIds) {
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
  public AggregatedExportJobRequest dateStart(Date dateStart) {
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
  public AggregatedExportJobRequest dateEnd(Date dateEnd) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedExportJobRequest aggregatedExportJobRequest = (AggregatedExportJobRequest) o;

    return Objects.equals(this.granularity, aggregatedExportJobRequest.granularity) &&
            Objects.equals(this.timeZone, aggregatedExportJobRequest.timeZone) &&
            Objects.equals(this.delimiter, aggregatedExportJobRequest.delimiter) &&
            Objects.equals(this.planningGroupIds, aggregatedExportJobRequest.planningGroupIds) &&
            Objects.equals(this.dateStart, aggregatedExportJobRequest.dateStart) &&
            Objects.equals(this.dateEnd, aggregatedExportJobRequest.dateEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularity, timeZone, delimiter, planningGroupIds, dateStart, dateEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedExportJobRequest {\n");
    
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
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

