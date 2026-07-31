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

import java.io.Serializable;
/**
 * BuCreateTimeOffLimitRequest
 */

public class BuCreateTimeOffLimitRequest  implements Serializable {
  
  private String staffingGroupId = null;
  private String managementUnitId = null;

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
   * Granularity choice for time off limit
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily"),
    FIFTEENMINUTES("FifteenMinutes");

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
  private String fullDayTimeOffStartTime = null;

  public BuCreateTimeOffLimitRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BuCreateTimeOffLimitRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the staffing group to which this time-off limit is associated. It can be either management unit or business unit level staffing group. One of managementUnitId or staffingGroupId must be set. This must not be set if managementUnitId has value
   **/
  public BuCreateTimeOffLimitRequest staffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the staffing group to which this time-off limit is associated. It can be either management unit or business unit level staffing group. One of managementUnitId or staffingGroupId must be set. This must not be set if managementUnitId has value")
  @JsonProperty("staffingGroupId")
  public String getStaffingGroupId() {
    return staffingGroupId;
  }
  public void setStaffingGroupId(String staffingGroupId) {
    this.staffingGroupId = staffingGroupId;
  }


  /**
   * The ID of the management unit to which this time-off limit is associated. One of managementUnitId or staffingGroupId must be set. This must not be set if staffingGroupId has value
   **/
  public BuCreateTimeOffLimitRequest managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the management unit to which this time-off limit is associated. One of managementUnitId or staffingGroupId must be set. This must not be set if staffingGroupId has value")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * Granularity choice for time off limit
   **/
  public BuCreateTimeOffLimitRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity choice for time off limit")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * The start time of full day time off requests associated with this limit interval in HH:mm format.Setting this value is allowed only for time-off limit with fifteen minutes granularity
   **/
  public BuCreateTimeOffLimitRequest fullDayTimeOffStartTime(String fullDayTimeOffStartTime) {
    this.fullDayTimeOffStartTime = fullDayTimeOffStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "09:00", value = "The start time of full day time off requests associated with this limit interval in HH:mm format.Setting this value is allowed only for time-off limit with fifteen minutes granularity")
  @JsonProperty("fullDayTimeOffStartTime")
  public String getFullDayTimeOffStartTime() {
    return fullDayTimeOffStartTime;
  }
  public void setFullDayTimeOffStartTime(String fullDayTimeOffStartTime) {
    this.fullDayTimeOffStartTime = fullDayTimeOffStartTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuCreateTimeOffLimitRequest buCreateTimeOffLimitRequest = (BuCreateTimeOffLimitRequest) o;

    return Objects.equals(this.staffingGroupId, buCreateTimeOffLimitRequest.staffingGroupId) &&
            Objects.equals(this.managementUnitId, buCreateTimeOffLimitRequest.managementUnitId) &&
            Objects.equals(this.granularity, buCreateTimeOffLimitRequest.granularity) &&
            Objects.equals(this.fullDayTimeOffStartTime, buCreateTimeOffLimitRequest.fullDayTimeOffStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffingGroupId, managementUnitId, granularity, fullDayTimeOffStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuCreateTimeOffLimitRequest {\n");
    
    sb.append("    staffingGroupId: ").append(toIndentedString(staffingGroupId)).append("\n");
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    fullDayTimeOffStartTime: ").append(toIndentedString(fullDayTimeOffStartTime)).append("\n");
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

