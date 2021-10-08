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
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Defines the phone numbers, operating hours, and the Architect flows to execute for an IVR.
 */
@ApiModel(description = "Defines the phone numbers, operating hours, and the Architect flows to execute for an IVR.")

public class IVR  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private String description = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String modifiedBy = null;
  private String createdBy = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates if the resource is active, inactive, or deleted.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String modifiedByApp = null;
  private String createdByApp = null;
  private List<String> dnis = new ArrayList<String>();
  private DomainEntityRef openHoursFlow = null;
  private DomainEntityRef closedHoursFlow = null;
  private DomainEntityRef holidayHoursFlow = null;
  private DomainEntityRef scheduleGroup = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the entity.
   **/
  public IVR name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the entity.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The division to which this entity belongs.
   **/
  public IVR division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }

  
  /**
   * The resource's description.
   **/
  public IVR description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The resource's description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The current version of the resource.
   **/
  public IVR version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current version of the resource.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public IVR dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public IVR dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * The ID of the user that last modified the resource.
   **/
  public IVR modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the user that last modified the resource.")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * The ID of the user that created the resource.
   **/
  public IVR createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the user that created the resource.")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates if the resource is active, inactive, or deleted.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  
  /**
   * The application that last modified the resource.
   **/
  public IVR modifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The application that last modified the resource.")
  @JsonProperty("modifiedByApp")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }

  
  /**
   * The application that created the resource.
   **/
  public IVR createdByApp(String createdByApp) {
    this.createdByApp = createdByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The application that created the resource.")
  @JsonProperty("createdByApp")
  public String getCreatedByApp() {
    return createdByApp;
  }
  public void setCreatedByApp(String createdByApp) {
    this.createdByApp = createdByApp;
  }

  
  /**
   * The phone number(s) to contact the IVR by.  Each phone number must be unique and not in use by another resource.  For example, a user and an iVR cannot have the same phone number.
   **/
  public IVR dnis(List<String> dnis) {
    this.dnis = dnis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number(s) to contact the IVR by.  Each phone number must be unique and not in use by another resource.  For example, a user and an iVR cannot have the same phone number.")
  @JsonProperty("dnis")
  public List<String> getDnis() {
    return dnis;
  }
  public void setDnis(List<String> dnis) {
    this.dnis = dnis;
  }

  
  /**
   * The Architect flow to execute during the hours an organization is open.
   **/
  public IVR openHoursFlow(DomainEntityRef openHoursFlow) {
    this.openHoursFlow = openHoursFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Architect flow to execute during the hours an organization is open.")
  @JsonProperty("openHoursFlow")
  public DomainEntityRef getOpenHoursFlow() {
    return openHoursFlow;
  }
  public void setOpenHoursFlow(DomainEntityRef openHoursFlow) {
    this.openHoursFlow = openHoursFlow;
  }

  
  /**
   * The Architect flow to execute during the hours an organization is closed.
   **/
  public IVR closedHoursFlow(DomainEntityRef closedHoursFlow) {
    this.closedHoursFlow = closedHoursFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Architect flow to execute during the hours an organization is closed.")
  @JsonProperty("closedHoursFlow")
  public DomainEntityRef getClosedHoursFlow() {
    return closedHoursFlow;
  }
  public void setClosedHoursFlow(DomainEntityRef closedHoursFlow) {
    this.closedHoursFlow = closedHoursFlow;
  }

  
  /**
   * The Architect flow to execute during an organization's holiday hours.
   **/
  public IVR holidayHoursFlow(DomainEntityRef holidayHoursFlow) {
    this.holidayHoursFlow = holidayHoursFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Architect flow to execute during an organization's holiday hours.")
  @JsonProperty("holidayHoursFlow")
  public DomainEntityRef getHolidayHoursFlow() {
    return holidayHoursFlow;
  }
  public void setHolidayHoursFlow(DomainEntityRef holidayHoursFlow) {
    this.holidayHoursFlow = holidayHoursFlow;
  }

  
  /**
   * The schedule group defining the open and closed hours for an organization.  If this is provided, an open flow and a closed flow must be specified as well.
   **/
  public IVR scheduleGroup(DomainEntityRef scheduleGroup) {
    this.scheduleGroup = scheduleGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule group defining the open and closed hours for an organization.  If this is provided, an open flow and a closed flow must be specified as well.")
  @JsonProperty("scheduleGroup")
  public DomainEntityRef getScheduleGroup() {
    return scheduleGroup;
  }
  public void setScheduleGroup(DomainEntityRef scheduleGroup) {
    this.scheduleGroup = scheduleGroup;
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
    IVR IVR = (IVR) o;
    return Objects.equals(this.id, IVR.id) &&
        Objects.equals(this.name, IVR.name) &&
        Objects.equals(this.division, IVR.division) &&
        Objects.equals(this.description, IVR.description) &&
        Objects.equals(this.version, IVR.version) &&
        Objects.equals(this.dateCreated, IVR.dateCreated) &&
        Objects.equals(this.dateModified, IVR.dateModified) &&
        Objects.equals(this.modifiedBy, IVR.modifiedBy) &&
        Objects.equals(this.createdBy, IVR.createdBy) &&
        Objects.equals(this.state, IVR.state) &&
        Objects.equals(this.modifiedByApp, IVR.modifiedByApp) &&
        Objects.equals(this.createdByApp, IVR.createdByApp) &&
        Objects.equals(this.dnis, IVR.dnis) &&
        Objects.equals(this.openHoursFlow, IVR.openHoursFlow) &&
        Objects.equals(this.closedHoursFlow, IVR.closedHoursFlow) &&
        Objects.equals(this.holidayHoursFlow, IVR.holidayHoursFlow) &&
        Objects.equals(this.scheduleGroup, IVR.scheduleGroup) &&
        Objects.equals(this.selfUri, IVR.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, dnis, openHoursFlow, closedHoursFlow, holidayHoursFlow, scheduleGroup, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IVR {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    modifiedByApp: ").append(toIndentedString(modifiedByApp)).append("\n");
    sb.append("    createdByApp: ").append(toIndentedString(createdByApp)).append("\n");
    sb.append("    dnis: ").append(toIndentedString(dnis)).append("\n");
    sb.append("    openHoursFlow: ").append(toIndentedString(openHoursFlow)).append("\n");
    sb.append("    closedHoursFlow: ").append(toIndentedString(closedHoursFlow)).append("\n");
    sb.append("    holidayHoursFlow: ").append(toIndentedString(holidayHoursFlow)).append("\n");
    sb.append("    scheduleGroup: ").append(toIndentedString(scheduleGroup)).append("\n");
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

