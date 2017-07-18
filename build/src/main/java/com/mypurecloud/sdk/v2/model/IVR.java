package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UriReference;
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
  private String description = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String modifiedBy = null;
  private String createdBy = null;

  /**
   * Gets or Sets state
   */
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
  private UriReference openHoursFlow = null;
  private UriReference closedHoursFlow = null;
  private UriReference scheduleGroup = null;
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
   **/
  public IVR description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public IVR version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public IVR dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public IVR dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public IVR modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   **/
  public IVR createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public IVR state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public IVR modifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedByApp")
  public String getModifiedByApp() {
    return modifiedByApp;
  }
  public void setModifiedByApp(String modifiedByApp) {
    this.modifiedByApp = modifiedByApp;
  }

  
  /**
   **/
  public IVR createdByApp(String createdByApp) {
    this.createdByApp = createdByApp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public IVR openHoursFlow(UriReference openHoursFlow) {
    this.openHoursFlow = openHoursFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Architect flow to execute during the hours an organization is open.")
  @JsonProperty("openHoursFlow")
  public UriReference getOpenHoursFlow() {
    return openHoursFlow;
  }
  public void setOpenHoursFlow(UriReference openHoursFlow) {
    this.openHoursFlow = openHoursFlow;
  }

  
  /**
   * The Architect flow to execute during the hours an organization is closed.
   **/
  public IVR closedHoursFlow(UriReference closedHoursFlow) {
    this.closedHoursFlow = closedHoursFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Architect flow to execute during the hours an organization is closed.")
  @JsonProperty("closedHoursFlow")
  public UriReference getClosedHoursFlow() {
    return closedHoursFlow;
  }
  public void setClosedHoursFlow(UriReference closedHoursFlow) {
    this.closedHoursFlow = closedHoursFlow;
  }

  
  /**
   * The schedule group defining the open and closed hours for an organization.  If this is provided, an open flow and a closed flow must be specified as well.
   **/
  public IVR scheduleGroup(UriReference scheduleGroup) {
    this.scheduleGroup = scheduleGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule group defining the open and closed hours for an organization.  If this is provided, an open flow and a closed flow must be specified as well.")
  @JsonProperty("scheduleGroup")
  public UriReference getScheduleGroup() {
    return scheduleGroup;
  }
  public void setScheduleGroup(UriReference scheduleGroup) {
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
        Objects.equals(this.scheduleGroup, IVR.scheduleGroup) &&
        Objects.equals(this.selfUri, IVR.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, dnis, openHoursFlow, closedHoursFlow, scheduleGroup, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IVR {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

