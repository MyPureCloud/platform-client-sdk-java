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
import com.mypurecloud.sdk.v2.model.ForecastPlanningGroupResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A list of IntradayPlanningGroup objects
 */
@ApiModel(description = "A list of IntradayPlanningGroup objects")

public class WfmIntradayPlanningGroupListing  implements Serializable {
  
  private List<ForecastPlanningGroupResponse> entities = new ArrayList<ForecastPlanningGroupResponse>();

  private static class NoDataReasonEnumDeserializer extends StdDeserializer<NoDataReasonEnum> {
    public NoDataReasonEnumDeserializer() {
      super(NoDataReasonEnumDeserializer.class);
    }

    @Override
    public NoDataReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NoDataReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason there was no data for the request
   */
 @JsonDeserialize(using = NoDataReasonEnumDeserializer.class)
  public enum NoDataReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOPUBLISHEDSCHEDULE("NoPublishedSchedule"),
    NOSOURCEFORECAST("NoSourceForecast");

    private String value;

    NoDataReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NoDataReasonEnum fromString(String key) {
      if (key == null) return null;

      for (NoDataReasonEnum value : NoDataReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NoDataReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NoDataReasonEnum noDataReason = null;

  
  /**
   **/
  public WfmIntradayPlanningGroupListing entities(List<ForecastPlanningGroupResponse> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ForecastPlanningGroupResponse> getEntities() {
    return entities;
  }
  public void setEntities(List<ForecastPlanningGroupResponse> entities) {
    this.entities = entities;
  }

  
  /**
   * The reason there was no data for the request
   **/
  public WfmIntradayPlanningGroupListing noDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reason there was no data for the request")
  @JsonProperty("noDataReason")
  public NoDataReasonEnum getNoDataReason() {
    return noDataReason;
  }
  public void setNoDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmIntradayPlanningGroupListing wfmIntradayPlanningGroupListing = (WfmIntradayPlanningGroupListing) o;
    return Objects.equals(this.entities, wfmIntradayPlanningGroupListing.entities) &&
        Objects.equals(this.noDataReason, wfmIntradayPlanningGroupListing.noDataReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, noDataReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayPlanningGroupListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    noDataReason: ").append(toIndentedString(noDataReason)).append("\n");
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

