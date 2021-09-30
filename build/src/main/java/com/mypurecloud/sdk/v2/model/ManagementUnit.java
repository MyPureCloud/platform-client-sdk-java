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
import com.mypurecloud.sdk.v2.model.BusinessUnitReference;
import com.mypurecloud.sdk.v2.model.DivisionReference;
import com.mypurecloud.sdk.v2.model.ManagementUnitSettingsResponse;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Management Unit object for Workforce Management
 */
@ApiModel(description = "Management Unit object for Workforce Management")

public class ManagementUnit  implements Serializable {
  
  private String id = null;
  private String name = null;
  private BusinessUnitReference businessUnit = null;

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
   * Start day of week for scheduling and forecasting purposes. Moving to Business Unit
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
  private String timeZone = null;
  private ManagementUnitSettingsResponse settings = null;
  private WfmVersionedEntityMetadata metadata = null;
  private DivisionReference division = null;
  private Integer version = null;
  private Date dateModified = null;
  private UserReference modifiedBy = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ManagementUnit name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The business unit to which this management unit belongs
   **/
  public ManagementUnit businessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The business unit to which this management unit belongs")
  @JsonProperty("businessUnit")
  public BusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
  }

  
  /**
   * Start day of week for scheduling and forecasting purposes. Moving to Business Unit
   **/
  public ManagementUnit startDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start day of week for scheduling and forecasting purposes. Moving to Business Unit")
  @JsonProperty("startDayOfWeek")
  public StartDayOfWeekEnum getStartDayOfWeek() {
    return startDayOfWeek;
  }
  public void setStartDayOfWeek(StartDayOfWeekEnum startDayOfWeek) {
    this.startDayOfWeek = startDayOfWeek;
  }

  
  /**
   * The time zone for the management unit in standard Olson format.  Moving to Business Unit
   **/
  public ManagementUnit timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone for the management unit in standard Olson format.  Moving to Business Unit")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The configuration settings for this management unit
   **/
  public ManagementUnit settings(ManagementUnitSettingsResponse settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration settings for this management unit")
  @JsonProperty("settings")
  public ManagementUnitSettingsResponse getSettings() {
    return settings;
  }
  public void setSettings(ManagementUnitSettingsResponse settings) {
    this.settings = settings;
  }

  
  /**
   * Version info metadata for this management unit. Deprecated, use settings.metadata
   **/
  public ManagementUnit metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version info metadata for this management unit. Deprecated, use settings.metadata")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * The division to which this entity belongs.
   **/
  public ManagementUnit division(DivisionReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public DivisionReference getDivision() {
    return division;
  }
  public void setDivision(DivisionReference division) {
    this.division = division;
  }

  
  @ApiModelProperty(example = "null", value = "The version of the underlying entity.  Deprecated, use field from settings.metadata instead")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  
  @ApiModelProperty(example = "null", value = "The date and time at which this entity was last modified.  Deprecated, use field from settings.metadata instead. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "The user who last modified this entity.  Deprecated, use field from settings.metadata instead")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementUnit managementUnit = (ManagementUnit) o;
    return Objects.equals(this.id, managementUnit.id) &&
        Objects.equals(this.name, managementUnit.name) &&
        Objects.equals(this.businessUnit, managementUnit.businessUnit) &&
        Objects.equals(this.startDayOfWeek, managementUnit.startDayOfWeek) &&
        Objects.equals(this.timeZone, managementUnit.timeZone) &&
        Objects.equals(this.settings, managementUnit.settings) &&
        Objects.equals(this.metadata, managementUnit.metadata) &&
        Objects.equals(this.division, managementUnit.division) &&
        Objects.equals(this.version, managementUnit.version) &&
        Objects.equals(this.dateModified, managementUnit.dateModified) &&
        Objects.equals(this.modifiedBy, managementUnit.modifiedBy) &&
        Objects.equals(this.selfUri, managementUnit.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, businessUnit, startDayOfWeek, timeZone, settings, metadata, division, version, dateModified, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementUnit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

