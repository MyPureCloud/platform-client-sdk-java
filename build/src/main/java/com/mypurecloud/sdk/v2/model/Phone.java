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
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.Line;
import com.mypurecloud.sdk.v2.model.PhoneCapabilities;
import com.mypurecloud.sdk.v2.model.PhoneStatus;
import com.mypurecloud.sdk.v2.model.UserAgentInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Phone
 */

public class Phone  implements Serializable {
  
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
  private DomainEntityRef site = null;
  private DomainEntityRef phoneBaseSettings = null;
  private DomainEntityRef lineBaseSettings = null;
  private DomainEntityRef phoneMetaBase = null;
  private List<Line> lines = new ArrayList<Line>();
  private PhoneStatus status = null;
  private PhoneStatus secondaryStatus = null;
  private UserAgentInfo userAgentInfo = null;
  private Map<String, Object> properties = null;
  private PhoneCapabilities capabilities = null;
  private DomainEntityRef webRtcUser = null;
  private Edge primaryEdge = null;
  private Edge secondaryEdge = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the entity.
   **/
  public Phone name(String name) {
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
  public Phone division(Division division) {
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
  public Phone description(String description) {
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
  public Phone version(Integer version) {
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
  public Phone dateCreated(Date dateCreated) {
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
  public Phone dateModified(Date dateModified) {
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
  public Phone modifiedBy(String modifiedBy) {
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
  public Phone createdBy(String createdBy) {
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
  public Phone modifiedByApp(String modifiedByApp) {
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
  public Phone createdByApp(String createdByApp) {
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
   * The site associated to the phone.
   **/
  public Phone site(DomainEntityRef site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The site associated to the phone.")
  @JsonProperty("site")
  public DomainEntityRef getSite() {
    return site;
  }
  public void setSite(DomainEntityRef site) {
    this.site = site;
  }

  
  /**
   * Phone Base Settings
   **/
  public Phone phoneBaseSettings(DomainEntityRef phoneBaseSettings) {
    this.phoneBaseSettings = phoneBaseSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Phone Base Settings")
  @JsonProperty("phoneBaseSettings")
  public DomainEntityRef getPhoneBaseSettings() {
    return phoneBaseSettings;
  }
  public void setPhoneBaseSettings(DomainEntityRef phoneBaseSettings) {
    this.phoneBaseSettings = phoneBaseSettings;
  }

  
  /**
   **/
  public Phone lineBaseSettings(DomainEntityRef lineBaseSettings) {
    this.lineBaseSettings = lineBaseSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineBaseSettings")
  public DomainEntityRef getLineBaseSettings() {
    return lineBaseSettings;
  }
  public void setLineBaseSettings(DomainEntityRef lineBaseSettings) {
    this.lineBaseSettings = lineBaseSettings;
  }

  
  /**
   **/
  public Phone phoneMetaBase(DomainEntityRef phoneMetaBase) {
    this.phoneMetaBase = phoneMetaBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneMetaBase")
  public DomainEntityRef getPhoneMetaBase() {
    return phoneMetaBase;
  }
  public void setPhoneMetaBase(DomainEntityRef phoneMetaBase) {
    this.phoneMetaBase = phoneMetaBase;
  }

  
  /**
   * Lines
   **/
  public Phone lines(List<Line> lines) {
    this.lines = lines;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Lines")
  @JsonProperty("lines")
  public List<Line> getLines() {
    return lines;
  }
  public void setLines(List<Line> lines) {
    this.lines = lines;
  }

  
  /**
   * The status of the phone and lines from the primary Edge.
   **/
  public Phone status(PhoneStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the phone and lines from the primary Edge.")
  @JsonProperty("status")
  public PhoneStatus getStatus() {
    return status;
  }
  public void setStatus(PhoneStatus status) {
    this.status = status;
  }

  
  /**
   * The status of the phone and lines from the secondary Edge.
   **/
  public Phone secondaryStatus(PhoneStatus secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the phone and lines from the secondary Edge.")
  @JsonProperty("secondaryStatus")
  public PhoneStatus getSecondaryStatus() {
    return secondaryStatus;
  }
  public void setSecondaryStatus(PhoneStatus secondaryStatus) {
    this.secondaryStatus = secondaryStatus;
  }

  
  @ApiModelProperty(example = "null", value = "User Agent Information for this phone. This includes model, firmware version, and manufacturer.")
  @JsonProperty("userAgentInfo")
  public UserAgentInfo getUserAgentInfo() {
    return userAgentInfo;
  }

  
  /**
   **/
  public Phone properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  
  /**
   **/
  public Phone capabilities(PhoneCapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("capabilities")
  public PhoneCapabilities getCapabilities() {
    return capabilities;
  }
  public void setCapabilities(PhoneCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  
  /**
   * This is the user associated with a WebRTC type phone.  It is required for all WebRTC phones.
   **/
  public Phone webRtcUser(DomainEntityRef webRtcUser) {
    this.webRtcUser = webRtcUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the user associated with a WebRTC type phone.  It is required for all WebRTC phones.")
  @JsonProperty("webRtcUser")
  public DomainEntityRef getWebRtcUser() {
    return webRtcUser;
  }
  public void setWebRtcUser(DomainEntityRef webRtcUser) {
    this.webRtcUser = webRtcUser;
  }

  
  /**
   **/
  public Phone primaryEdge(Edge primaryEdge) {
    this.primaryEdge = primaryEdge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primaryEdge")
  public Edge getPrimaryEdge() {
    return primaryEdge;
  }
  public void setPrimaryEdge(Edge primaryEdge) {
    this.primaryEdge = primaryEdge;
  }

  
  /**
   **/
  public Phone secondaryEdge(Edge secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryEdge")
  public Edge getSecondaryEdge() {
    return secondaryEdge;
  }
  public void setSecondaryEdge(Edge secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
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
    Phone phone = (Phone) o;
    return Objects.equals(this.id, phone.id) &&
        Objects.equals(this.name, phone.name) &&
        Objects.equals(this.division, phone.division) &&
        Objects.equals(this.description, phone.description) &&
        Objects.equals(this.version, phone.version) &&
        Objects.equals(this.dateCreated, phone.dateCreated) &&
        Objects.equals(this.dateModified, phone.dateModified) &&
        Objects.equals(this.modifiedBy, phone.modifiedBy) &&
        Objects.equals(this.createdBy, phone.createdBy) &&
        Objects.equals(this.state, phone.state) &&
        Objects.equals(this.modifiedByApp, phone.modifiedByApp) &&
        Objects.equals(this.createdByApp, phone.createdByApp) &&
        Objects.equals(this.site, phone.site) &&
        Objects.equals(this.phoneBaseSettings, phone.phoneBaseSettings) &&
        Objects.equals(this.lineBaseSettings, phone.lineBaseSettings) &&
        Objects.equals(this.phoneMetaBase, phone.phoneMetaBase) &&
        Objects.equals(this.lines, phone.lines) &&
        Objects.equals(this.status, phone.status) &&
        Objects.equals(this.secondaryStatus, phone.secondaryStatus) &&
        Objects.equals(this.userAgentInfo, phone.userAgentInfo) &&
        Objects.equals(this.properties, phone.properties) &&
        Objects.equals(this.capabilities, phone.capabilities) &&
        Objects.equals(this.webRtcUser, phone.webRtcUser) &&
        Objects.equals(this.primaryEdge, phone.primaryEdge) &&
        Objects.equals(this.secondaryEdge, phone.secondaryEdge) &&
        Objects.equals(this.selfUri, phone.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, site, phoneBaseSettings, lineBaseSettings, phoneMetaBase, lines, status, secondaryStatus, userAgentInfo, properties, capabilities, webRtcUser, primaryEdge, secondaryEdge, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
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
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    phoneBaseSettings: ").append(toIndentedString(phoneBaseSettings)).append("\n");
    sb.append("    lineBaseSettings: ").append(toIndentedString(lineBaseSettings)).append("\n");
    sb.append("    phoneMetaBase: ").append(toIndentedString(phoneMetaBase)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    secondaryStatus: ").append(toIndentedString(secondaryStatus)).append("\n");
    sb.append("    userAgentInfo: ").append(toIndentedString(userAgentInfo)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    webRtcUser: ").append(toIndentedString(webRtcUser)).append("\n");
    sb.append("    primaryEdge: ").append(toIndentedString(primaryEdge)).append("\n");
    sb.append("    secondaryEdge: ").append(toIndentedString(secondaryEdge)).append("\n");
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

