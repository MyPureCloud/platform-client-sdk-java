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
import com.mypurecloud.sdk.v2.model.CreateManagementUnitSettingsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Create Management Unit
 */
@ApiModel(description = "Create Management Unit")

public class CreateManagementUnitApiRequest  implements Serializable {
  
  private String name = null;
  private String timeZone = null;

  private static class StartDayOfWeekEnumDeserializer extends StdDeserializer<StartDayOfWeekEnum> {
    public StartDayOfWeekEnumDeserializer() {
      super(StartDayOfWeekEnumDeserializer.class);
    }

    @Override
    public StartDayOfWeekEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StartDayOfWeekEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The configured first day of the week for scheduling and forecasting purposes. Moving to Business Unit
   */
 @JsonDeserialize(using = StartDayOfWeekEnumDeserializer.class)
  public enum StartDayOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    StartDayOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartDayOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (StartDayOfWeekEnum value : StartDayOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartDayOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartDayOfWeekEnum startDayOfWeek = null;
  private CreateManagementUnitSettingsRequest settings = null;
  private String divisionId = null;
  private String businessUnitId = null;

  
  /**
   * The name of the management unit
   **/
  public CreateManagementUnitApiRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the management unit")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The default time zone to use for this management unit.  Moving to Business Unit
   **/
  public CreateManagementUnitApiRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default time zone to use for this management unit.  Moving to Business Unit")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The configured first day of the week for scheduling and forecasting purposes. Moving to Business Unit
   **/
  public CreateManagementUnitApiRequest startDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configured first day of the week for scheduling and forecasting purposes. Moving to Business Unit")
  @JsonProperty("startDayOfWeek")
  public StartDayOfWeekEnum getStartDayOfWeek() {
    return startDayOfWeek;
  }
  public void setStartDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
  }

  
  /**
   * The configuration for the management unit.  If omitted, reasonable defaults will be assigned
   **/
  public CreateManagementUnitApiRequest settings(CreateManagementUnitSettingsRequest settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration for the management unit.  If omitted, reasonable defaults will be assigned")
  @JsonProperty("settings")
  public CreateManagementUnitSettingsRequest getSettings() {
    return settings;
  }
  public void setSettings(CreateManagementUnitSettingsRequest settings) {
    this.settings = settings;
  }

  
  /**
   * The id of the division to which this management unit belongs.  Defaults to home division ID
   **/
  public CreateManagementUnitApiRequest divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the division to which this management unit belongs.  Defaults to home division ID")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }

  
  /**
   * The id of the business unit to which this management unit belongs
   **/
  public CreateManagementUnitApiRequest businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the business unit to which this management unit belongs")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateManagementUnitApiRequest createManagementUnitApiRequest = (CreateManagementUnitApiRequest) o;
    return Objects.equals(this.name, createManagementUnitApiRequest.name) &&
        Objects.equals(this.timeZone, createManagementUnitApiRequest.timeZone) &&
        Objects.equals(this.startDayOfWeek, createManagementUnitApiRequest.startDayOfWeek) &&
        Objects.equals(this.settings, createManagementUnitApiRequest.settings) &&
        Objects.equals(this.divisionId, createManagementUnitApiRequest.divisionId) &&
        Objects.equals(this.businessUnitId, createManagementUnitApiRequest.businessUnitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timeZone, startDayOfWeek, settings, divisionId, businessUnitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateManagementUnitApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
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

