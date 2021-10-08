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

  private static class StatusCodeEnumDeserializer extends StdDeserializer<StatusCodeEnum> {
    public StatusCodeEnumDeserializer() {
      super(StatusCodeEnumDeserializer.class);
    }

    @Override
    public StatusCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current status of the Edge.
   */
 @JsonDeserialize(using = StatusCodeEnumDeserializer.class)
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
    UNPAIRED("UNPAIRED"),
    INITIALIZING("INITIALIZING");

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

  private static class OnlineStatusEnumDeserializer extends StdDeserializer<OnlineStatusEnum> {
    public OnlineStatusEnumDeserializer() {
      super(OnlineStatusEnumDeserializer.class);
    }

    @Override
    public OnlineStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OnlineStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets onlineStatus
   */
 @JsonDeserialize(using = OnlineStatusEnumDeserializer.class)
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

  private static class EdgeDeploymentTypeEnumDeserializer extends StdDeserializer<EdgeDeploymentTypeEnum> {
    public EdgeDeploymentTypeEnumDeserializer() {
      super(EdgeDeploymentTypeEnumDeserializer.class);
    }

    @Override
    public EdgeDeploymentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EdgeDeploymentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets edgeDeploymentType
   */
 @JsonDeserialize(using = EdgeDeploymentTypeEnumDeserializer.class)
  public enum EdgeDeploymentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HARDWARE("HARDWARE"),
    LDM("LDM"),
    CDM("CDM"),
    CHS("CHS"),
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

  private static class CallDrainingStateEnumDeserializer extends StdDeserializer<CallDrainingStateEnum> {
    public CallDrainingStateEnumDeserializer() {
      super(CallDrainingStateEnumDeserializer.class);
    }

    @Override
    public CallDrainingStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CallDrainingStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The current state of the Edge's call draining process before it can be safely rebooted or updated.
   */
 @JsonDeserialize(using = CallDrainingStateEnumDeserializer.class)
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
  private String proxy = null;
  private Boolean offlineConfigCalled = null;
  private String osName = null;
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
   * The division to which this entity belongs.
   **/
  public Edge division(Division division) {
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
  public Edge description(String description) {
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
  public Edge version(Integer version) {
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
  public Edge dateCreated(Date dateCreated) {
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
  public Edge dateModified(Date dateModified) {
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
  public Edge modifiedBy(String modifiedBy) {
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
  public Edge createdBy(String createdBy) {
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
  public Edge modifiedByApp(String modifiedByApp) {
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
  public Edge createdByApp(String createdByApp) {
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
   * The list of interfaces for the edge. (Deprecated) Replaced by configuring trunks/ip info on the logical interface instead
   **/
  public Edge interfaces(List<EdgeInterface> interfaces) {
    this.interfaces = interfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of interfaces for the edge. (Deprecated) Replaced by configuring trunks/ip info on the logical interface instead")
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
   * The current status of the Edge.
   **/
  public Edge statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current status of the Edge.")
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
   * Details about an in-progress or recently in-progress Edge software upgrade. This node appears only if a software upgrade was recently initiated for this Edge.
   **/
  public Edge softwareStatus(DomainEdgeSoftwareUpdateDto softwareStatus) {
    this.softwareStatus = softwareStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about an in-progress or recently in-progress Edge software upgrade. This node appears only if a software upgrade was recently initiated for this Edge.")
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

  
  @ApiModelProperty(example = "null", value = "The current state of the Edge's call draining process before it can be safely rebooted or updated.")
  @JsonProperty("callDrainingState")
  public CallDrainingStateEnum getCallDrainingState() {
    return callDrainingState;
  }

  
  @ApiModelProperty(example = "null", value = "The remaining number of conversations the Edge has to drain before it can be safely rebooted or updated. When an Edge is not draining conversations, this will be NULL or 0.")
  @JsonProperty("conversationCount")
  public Integer getConversationCount() {
    return conversationCount;
  }

  
  /**
   * Edge HTTP proxy configuration for the WAN port. The field can be a hostname, FQDN, IPv4 or IPv6 address. If port is not included, port 80 is assumed.
   **/
  public Edge proxy(String proxy) {
    this.proxy = proxy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Edge HTTP proxy configuration for the WAN port. The field can be a hostname, FQDN, IPv4 or IPv6 address. If port is not included, port 80 is assumed.")
  @JsonProperty("proxy")
  public String getProxy() {
    return proxy;
  }
  public void setProxy(String proxy) {
    this.proxy = proxy;
  }

  
  @ApiModelProperty(example = "null", value = "True if the offline edge configuration endpoint has been called for this edge.")
  @JsonProperty("offlineConfigCalled")
  public Boolean getOfflineConfigCalled() {
    return offlineConfigCalled;
  }

  
  @ApiModelProperty(example = "null", value = "The name provided by the operating system of the Edge.")
  @JsonProperty("osName")
  public String getOsName() {
    return osName;
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
        Objects.equals(this.division, edge.division) &&
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
        Objects.equals(this.proxy, edge.proxy) &&
        Objects.equals(this.offlineConfigCalled, edge.offlineConfigCalled) &&
        Objects.equals(this.osName, edge.osName) &&
        Objects.equals(this.selfUri, edge.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, interfaces, make, model, apiVersion, softwareVersion, softwareVersionTimestamp, softwareVersionPlatform, softwareVersionConfiguration, fullSoftwareVersion, pairingId, fingerprint, fingerprintHint, currentVersion, stagedVersion, patch, statusCode, edgeGroup, site, softwareStatus, onlineStatus, serialNumber, physicalEdge, managed, edgeDeploymentType, callDrainingState, conversationCount, proxy, offlineConfigCalled, osName, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Edge {\n");
    
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
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    offlineConfigCalled: ").append(toIndentedString(offlineConfigCalled)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
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

