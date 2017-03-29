package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareUpdateDto;
import com.mypurecloud.sdk.v2.model.EdgeGroup;
import com.mypurecloud.sdk.v2.model.EdgeInterface;
import com.mypurecloud.sdk.v2.model.Site;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Edge
 */

public class Edge  implements Serializable {
  
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
  private List<EdgeInterface> interfaces = new ArrayList<EdgeInterface>();
  private String make = null;
  private String model = null;
  private String apiVersion = null;
  private String softwareVersion = null;
  private String softwareVersionTimestamp = null;
  private String softwareVersionPlatform = null;
  private String softwareVersionConfiguration = null;
  private String fullSoftwareVersion = null;
  private String pairingId = null;
  private String fingerprint = null;
  private String fingerprintHint = null;
  private String currentVersion = null;
  private String stagedVersion = null;
  private String patch = null;

  /**
   * Gets or Sets statusCode
   */
  public enum StatusCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEW("NEW"),
    AWAITING_CONNECTION("AWAITING_CONNECTION"),
    AWAITING_FINGERPRINT("AWAITING_FINGERPRINT"),
    AWAITING_FINGERPRINT_VERIFICATION("AWAITING_FINGERPRINT_VERIFICATION"),
    FINGERPRINT_VERIFIED("FINGERPRINT_VERIFIED"),
    AWAITING_BOOTSTRAP("AWAITING_BOOTSTRAP"),
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    RMA("RMA"),
    UNPAIRING("UNPAIRING"),
    UNPAIRED("UNPAIRED");

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusCodeEnum fromString(String key) {
      if (key == null) return null;

      for (StatusCodeEnum value : StatusCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusCodeEnum statusCode = null;
  private EdgeGroup edgeGroup = null;
  private Site site = null;
  private DomainEdgeSoftwareUpdateDto softwareStatus = null;

  /**
   * Gets or Sets onlineStatus
   */
  public enum OnlineStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONLINE("ONLINE"),
    OFFLINE("OFFLINE");

    private String value;

    OnlineStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OnlineStatusEnum fromString(String key) {
      if (key == null) return null;

      for (OnlineStatusEnum value : OnlineStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OnlineStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OnlineStatusEnum onlineStatus = null;
  private String serialNumber = null;
  private Boolean physicalEdge = null;
  private Boolean managed = null;

  /**
   * Gets or Sets edgeDeploymentType
   */
  public enum EdgeDeploymentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HARDWARE("HARDWARE"),
    LDM("LDM"),
    CDM("CDM"),
    INVALID("INVALID");

    private String value;

    EdgeDeploymentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EdgeDeploymentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EdgeDeploymentTypeEnum value : EdgeDeploymentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EdgeDeploymentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EdgeDeploymentTypeEnum edgeDeploymentType = null;

  /**
   * Gets or Sets callDrainingState
   */
  public enum CallDrainingStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("NONE"),
    WAIT("WAIT"),
    WAIT_TIMEOUT("WAIT_TIMEOUT"),
    TERMINATE("TERMINATE"),
    COMPLETE("COMPLETE");

    private String value;

    CallDrainingStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CallDrainingStateEnum fromString(String key) {
      if (key == null) return null;

      for (CallDrainingStateEnum value : CallDrainingStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CallDrainingStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CallDrainingStateEnum callDrainingState = null;
  private Integer conversationCount = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the entity.
   **/
  public Edge name(String name) {
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
  public Edge description(String description) {
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
  public Edge version(Integer version) {
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
  public Edge dateCreated(Date dateCreated) {
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
  public Edge dateModified(Date dateModified) {
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
  public Edge modifiedBy(String modifiedBy) {
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
  public Edge createdBy(String createdBy) {
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
  public Edge state(StateEnum state) {
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
  public Edge modifiedByApp(String modifiedByApp) {
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
  public Edge createdByApp(String createdByApp) {
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
   **/
  public Edge interfaces(List<EdgeInterface> interfaces) {
    this.interfaces = interfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaces")
  public List<EdgeInterface> getInterfaces() {
    return interfaces;
  }
  public void setInterfaces(List<EdgeInterface> interfaces) {
    this.interfaces = interfaces;
  }


  /**
   **/
  public Edge make(String make) {
    this.make = make;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("make")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }


  /**
   **/
  public Edge model(String model) {
    this.model = model;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  /**
   **/
  public Edge apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  /**
   **/
  public Edge softwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("softwareVersion")
  public String getSoftwareVersion() {
    return softwareVersion;
  }
  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }


  /**
   **/
  public Edge softwareVersionTimestamp(String softwareVersionTimestamp) {
    this.softwareVersionTimestamp = softwareVersionTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("softwareVersionTimestamp")
  public String getSoftwareVersionTimestamp() {
    return softwareVersionTimestamp;
  }
  public void setSoftwareVersionTimestamp(String softwareVersionTimestamp) {
    this.softwareVersionTimestamp = softwareVersionTimestamp;
  }


  /**
   **/
  public Edge softwareVersionPlatform(String softwareVersionPlatform) {
    this.softwareVersionPlatform = softwareVersionPlatform;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("softwareVersionPlatform")
  public String getSoftwareVersionPlatform() {
    return softwareVersionPlatform;
  }
  public void setSoftwareVersionPlatform(String softwareVersionPlatform) {
    this.softwareVersionPlatform = softwareVersionPlatform;
  }


  /**
   **/
  public Edge softwareVersionConfiguration(String softwareVersionConfiguration) {
    this.softwareVersionConfiguration = softwareVersionConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("softwareVersionConfiguration")
  public String getSoftwareVersionConfiguration() {
    return softwareVersionConfiguration;
  }
  public void setSoftwareVersionConfiguration(String softwareVersionConfiguration) {
    this.softwareVersionConfiguration = softwareVersionConfiguration;
  }


  /**
   **/
  public Edge fullSoftwareVersion(String fullSoftwareVersion) {
    this.fullSoftwareVersion = fullSoftwareVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullSoftwareVersion")
  public String getFullSoftwareVersion() {
    return fullSoftwareVersion;
  }
  public void setFullSoftwareVersion(String fullSoftwareVersion) {
    this.fullSoftwareVersion = fullSoftwareVersion;
  }


  /**
   * The pairing Id for a hardware Edge in the format: 00000-00000-00000-00000-00000. This field is only required when creating an Edge with a deployment type of HARDWARE.
   **/
  public Edge pairingId(String pairingId) {
    this.pairingId = pairingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pairing Id for a hardware Edge in the format: 00000-00000-00000-00000-00000. This field is only required when creating an Edge with a deployment type of HARDWARE.")
  @JsonProperty("pairingId")
  public String getPairingId() {
    return pairingId;
  }
  public void setPairingId(String pairingId) {
    this.pairingId = pairingId;
  }


  /**
   **/
  public Edge fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  /**
   **/
  public Edge fingerprintHint(String fingerprintHint) {
    this.fingerprintHint = fingerprintHint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fingerprintHint")
  public String getFingerprintHint() {
    return fingerprintHint;
  }
  public void setFingerprintHint(String fingerprintHint) {
    this.fingerprintHint = fingerprintHint;
  }


  /**
   **/
  public Edge currentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentVersion")
  public String getCurrentVersion() {
    return currentVersion;
  }
  public void setCurrentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
  }


  /**
   **/
  public Edge stagedVersion(String stagedVersion) {
    this.stagedVersion = stagedVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stagedVersion")
  public String getStagedVersion() {
    return stagedVersion;
  }
  public void setStagedVersion(String stagedVersion) {
    this.stagedVersion = stagedVersion;
  }


  /**
   **/
  public Edge patch(String patch) {
    this.patch = patch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("patch")
  public String getPatch() {
    return patch;
  }
  public void setPatch(String patch) {
    this.patch = patch;
  }


  /**
   **/
  public Edge statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusCode")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }


  /**
   **/
  public Edge edgeGroup(EdgeGroup edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeGroup")
  public EdgeGroup getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(EdgeGroup edgeGroup) {
    this.edgeGroup = edgeGroup;
  }


  /**
   * The Site to which the Edge is assigned.
   **/
  public Edge site(Site site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Site to which the Edge is assigned.")
  @JsonProperty("site")
  public Site getSite() {
    return site;
  }
  public void setSite(Site site) {
    this.site = site;
  }


  /**
   **/
  public Edge softwareStatus(DomainEdgeSoftwareUpdateDto softwareStatus) {
    this.softwareStatus = softwareStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("softwareStatus")
  public DomainEdgeSoftwareUpdateDto getSoftwareStatus() {
    return softwareStatus;
  }
  public void setSoftwareStatus(DomainEdgeSoftwareUpdateDto softwareStatus) {
    this.softwareStatus = softwareStatus;
  }


  /**
   **/
  public Edge onlineStatus(OnlineStatusEnum onlineStatus) {
    this.onlineStatus = onlineStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onlineStatus")
  public OnlineStatusEnum getOnlineStatus() {
    return onlineStatus;
  }
  public void setOnlineStatus(OnlineStatusEnum onlineStatus) {
    this.onlineStatus = onlineStatus;
  }


  /**
   **/
  public Edge serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  /**
   **/
  public Edge physicalEdge(Boolean physicalEdge) {
    this.physicalEdge = physicalEdge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("physicalEdge")
  public Boolean getPhysicalEdge() {
    return physicalEdge;
  }
  public void setPhysicalEdge(Boolean physicalEdge) {
    this.physicalEdge = physicalEdge;
  }


  /**
   **/
  public Edge managed(Boolean managed) {
    this.managed = managed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("managed")
  public Boolean getManaged() {
    return managed;
  }
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  /**
   **/
  public Edge edgeDeploymentType(EdgeDeploymentTypeEnum edgeDeploymentType) {
    this.edgeDeploymentType = edgeDeploymentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeDeploymentType")
  public EdgeDeploymentTypeEnum getEdgeDeploymentType() {
    return edgeDeploymentType;
  }
  public void setEdgeDeploymentType(EdgeDeploymentTypeEnum edgeDeploymentType) {
    this.edgeDeploymentType = edgeDeploymentType;
  }


  /**
   **/
  public Edge callDrainingState(CallDrainingStateEnum callDrainingState) {
    this.callDrainingState = callDrainingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callDrainingState")
  public CallDrainingStateEnum getCallDrainingState() {
    return callDrainingState;
  }
  public void setCallDrainingState(CallDrainingStateEnum callDrainingState) {
    this.callDrainingState = callDrainingState;
  }


  /**
   **/
  public Edge conversationCount(Integer conversationCount) {
    this.conversationCount = conversationCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationCount")
  public Integer getConversationCount() {
    return conversationCount;
  }
  public void setConversationCount(Integer conversationCount) {
    this.conversationCount = conversationCount;
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
    Edge edge = (Edge) o;
    return Objects.equals(this.id, edge.id) &&
        Objects.equals(this.name, edge.name) &&
        Objects.equals(this.description, edge.description) &&
        Objects.equals(this.version, edge.version) &&
        Objects.equals(this.dateCreated, edge.dateCreated) &&
        Objects.equals(this.dateModified, edge.dateModified) &&
        Objects.equals(this.modifiedBy, edge.modifiedBy) &&
        Objects.equals(this.createdBy, edge.createdBy) &&
        Objects.equals(this.state, edge.state) &&
        Objects.equals(this.modifiedByApp, edge.modifiedByApp) &&
        Objects.equals(this.createdByApp, edge.createdByApp) &&
        Objects.equals(this.interfaces, edge.interfaces) &&
        Objects.equals(this.make, edge.make) &&
        Objects.equals(this.model, edge.model) &&
        Objects.equals(this.apiVersion, edge.apiVersion) &&
        Objects.equals(this.softwareVersion, edge.softwareVersion) &&
        Objects.equals(this.softwareVersionTimestamp, edge.softwareVersionTimestamp) &&
        Objects.equals(this.softwareVersionPlatform, edge.softwareVersionPlatform) &&
        Objects.equals(this.softwareVersionConfiguration, edge.softwareVersionConfiguration) &&
        Objects.equals(this.fullSoftwareVersion, edge.fullSoftwareVersion) &&
        Objects.equals(this.pairingId, edge.pairingId) &&
        Objects.equals(this.fingerprint, edge.fingerprint) &&
        Objects.equals(this.fingerprintHint, edge.fingerprintHint) &&
        Objects.equals(this.currentVersion, edge.currentVersion) &&
        Objects.equals(this.stagedVersion, edge.stagedVersion) &&
        Objects.equals(this.patch, edge.patch) &&
        Objects.equals(this.statusCode, edge.statusCode) &&
        Objects.equals(this.edgeGroup, edge.edgeGroup) &&
        Objects.equals(this.site, edge.site) &&
        Objects.equals(this.softwareStatus, edge.softwareStatus) &&
        Objects.equals(this.onlineStatus, edge.onlineStatus) &&
        Objects.equals(this.serialNumber, edge.serialNumber) &&
        Objects.equals(this.physicalEdge, edge.physicalEdge) &&
        Objects.equals(this.managed, edge.managed) &&
        Objects.equals(this.edgeDeploymentType, edge.edgeDeploymentType) &&
        Objects.equals(this.callDrainingState, edge.callDrainingState) &&
        Objects.equals(this.conversationCount, edge.conversationCount) &&
        Objects.equals(this.selfUri, edge.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, interfaces, make, model, apiVersion, softwareVersion, softwareVersionTimestamp, softwareVersionPlatform, softwareVersionConfiguration, fullSoftwareVersion, pairingId, fingerprint, fingerprintHint, currentVersion, stagedVersion, patch, statusCode, edgeGroup, site, softwareStatus, onlineStatus, serialNumber, physicalEdge, managed, edgeDeploymentType, callDrainingState, conversationCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Edge {\n");
    
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
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    softwareVersionTimestamp: ").append(toIndentedString(softwareVersionTimestamp)).append("\n");
    sb.append("    softwareVersionPlatform: ").append(toIndentedString(softwareVersionPlatform)).append("\n");
    sb.append("    softwareVersionConfiguration: ").append(toIndentedString(softwareVersionConfiguration)).append("\n");
    sb.append("    fullSoftwareVersion: ").append(toIndentedString(fullSoftwareVersion)).append("\n");
    sb.append("    pairingId: ").append(toIndentedString(pairingId)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    fingerprintHint: ").append(toIndentedString(fingerprintHint)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    stagedVersion: ").append(toIndentedString(stagedVersion)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    softwareStatus: ").append(toIndentedString(softwareStatus)).append("\n");
    sb.append("    onlineStatus: ").append(toIndentedString(onlineStatus)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    physicalEdge: ").append(toIndentedString(physicalEdge)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    edgeDeploymentType: ").append(toIndentedString(edgeDeploymentType)).append("\n");
    sb.append("    callDrainingState: ").append(toIndentedString(callDrainingState)).append("\n");
    sb.append("    conversationCount: ").append(toIndentedString(conversationCount)).append("\n");
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

