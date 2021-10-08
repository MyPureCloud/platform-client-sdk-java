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
import com.mypurecloud.sdk.v2.model.DomainCapabilities;
import com.mypurecloud.sdk.v2.model.DomainNetworkAddress;
import com.mypurecloud.sdk.v2.model.DomainNetworkCommandResponse;
import com.mypurecloud.sdk.v2.model.DomainNetworkRoute;
import com.mypurecloud.sdk.v2.model.TrunkBaseAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DomainLogicalInterface
 */

public class DomainLogicalInterface  implements Serializable {
  
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
  private String edgeUri = null;
  private String edgeAssignedId = null;
  private String friendlyName = null;
  private Integer vlanTagId = null;
  private String hardwareAddress = null;
  private String physicalAdapterId = null;
  private String ifStatus = null;

  private static class InterfaceTypeEnumDeserializer extends StdDeserializer<InterfaceTypeEnum> {
    public InterfaceTypeEnumDeserializer() {
      super(InterfaceTypeEnumDeserializer.class);
    }

    @Override
    public InterfaceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InterfaceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of this network interface.
   */
 @JsonDeserialize(using = InterfaceTypeEnumDeserializer.class)
  public enum InterfaceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIAGNOSTIC("DIAGNOSTIC"),
    SYSTEM("SYSTEM");

    private String value;

    InterfaceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InterfaceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (InterfaceTypeEnum value : InterfaceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InterfaceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InterfaceTypeEnum interfaceType = null;
  private String publicNatAddressIpV4 = null;
  private String publicNatAddressIpV6 = null;
  private List<DomainNetworkRoute> routes = new ArrayList<DomainNetworkRoute>();
  private List<DomainNetworkAddress> addresses = new ArrayList<DomainNetworkAddress>();
  private DomainCapabilities ipv4Capabilities = null;
  private DomainCapabilities ipv6Capabilities = null;

  private static class CurrentStateEnumDeserializer extends StdDeserializer<CurrentStateEnum> {
    public CurrentStateEnumDeserializer() {
      super(CurrentStateEnumDeserializer.class);
    }

    @Override
    public CurrentStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CurrentStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets currentState
   */
 @JsonDeserialize(using = CurrentStateEnumDeserializer.class)
  public enum CurrentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INIT("INIT"),
    CREATING("CREATING"),
    UPDATING("UPDATING"),
    OK("OK"),
    EXCEPTION("EXCEPTION"),
    DELETING("DELETING");

    private String value;

    CurrentStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CurrentStateEnum fromString(String key) {
      if (key == null) return null;

      for (CurrentStateEnum value : CurrentStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CurrentStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CurrentStateEnum currentState = null;
  private String lastModifiedUserId = null;
  private String lastModifiedCorrelationId = null;
  private List<DomainNetworkCommandResponse> commandResponses = new ArrayList<DomainNetworkCommandResponse>();
  private Boolean inheritPhoneTrunkBasesIPv4 = null;
  private Boolean inheritPhoneTrunkBasesIPv6 = null;
  private Boolean useForInternalEdgeCommunication = null;
  private Boolean useForIndirectEdgeCommunication = null;
  private Boolean useForCloudProxyEdgeCommunication = null;
  private Boolean useForWanInterface = null;
  private List<TrunkBaseAssignment> externalTrunkBaseAssignments = new ArrayList<TrunkBaseAssignment>();
  private List<TrunkBaseAssignment> phoneTrunkBaseAssignments = new ArrayList<TrunkBaseAssignment>();
  private Boolean traceEnabled = null;
  private Date startDate = null;
  private Date endDate = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the entity.
   **/
  public DomainLogicalInterface name(String name) {
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
  public DomainLogicalInterface division(Division division) {
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
  public DomainLogicalInterface description(String description) {
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
  public DomainLogicalInterface version(Integer version) {
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
  public DomainLogicalInterface dateCreated(Date dateCreated) {
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
  public DomainLogicalInterface dateModified(Date dateModified) {
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
  public DomainLogicalInterface modifiedBy(String modifiedBy) {
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
  public DomainLogicalInterface createdBy(String createdBy) {
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
  public DomainLogicalInterface modifiedByApp(String modifiedByApp) {
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
  public DomainLogicalInterface createdByApp(String createdByApp) {
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
   **/
  public DomainLogicalInterface edgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeUri")
  public String getEdgeUri() {
    return edgeUri;
  }
  public void setEdgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
  }

  
  /**
   **/
  public DomainLogicalInterface edgeAssignedId(String edgeAssignedId) {
    this.edgeAssignedId = edgeAssignedId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeAssignedId")
  public String getEdgeAssignedId() {
    return edgeAssignedId;
  }
  public void setEdgeAssignedId(String edgeAssignedId) {
    this.edgeAssignedId = edgeAssignedId;
  }

  
  /**
   * Friendly Name
   **/
  public DomainLogicalInterface friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Friendly Name")
  @JsonProperty("friendlyName")
  public String getFriendlyName() {
    return friendlyName;
  }
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  
  /**
   **/
  public DomainLogicalInterface vlanTagId(Integer vlanTagId) {
    this.vlanTagId = vlanTagId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vlanTagId")
  public Integer getVlanTagId() {
    return vlanTagId;
  }
  public void setVlanTagId(Integer vlanTagId) {
    this.vlanTagId = vlanTagId;
  }

  
  /**
   * Hardware Address
   **/
  public DomainLogicalInterface hardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Hardware Address")
  @JsonProperty("hardwareAddress")
  public String getHardwareAddress() {
    return hardwareAddress;
  }
  public void setHardwareAddress(String hardwareAddress) {
    this.hardwareAddress = hardwareAddress;
  }

  
  /**
   * Physical Adapter Id
   **/
  public DomainLogicalInterface physicalAdapterId(String physicalAdapterId) {
    this.physicalAdapterId = physicalAdapterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Physical Adapter Id")
  @JsonProperty("physicalAdapterId")
  public String getPhysicalAdapterId() {
    return physicalAdapterId;
  }
  public void setPhysicalAdapterId(String physicalAdapterId) {
    this.physicalAdapterId = physicalAdapterId;
  }

  
  /**
   **/
  public DomainLogicalInterface ifStatus(String ifStatus) {
    this.ifStatus = ifStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ifStatus")
  public String getIfStatus() {
    return ifStatus;
  }
  public void setIfStatus(String ifStatus) {
    this.ifStatus = ifStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The type of this network interface.")
  @JsonProperty("interfaceType")
  public InterfaceTypeEnum getInterfaceType() {
    return interfaceType;
  }

  
  /**
   * IPv4 NENT IP Address
   **/
  public DomainLogicalInterface publicNatAddressIpV4(String publicNatAddressIpV4) {
    this.publicNatAddressIpV4 = publicNatAddressIpV4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv4 NENT IP Address")
  @JsonProperty("publicNatAddressIpV4")
  public String getPublicNatAddressIpV4() {
    return publicNatAddressIpV4;
  }
  public void setPublicNatAddressIpV4(String publicNatAddressIpV4) {
    this.publicNatAddressIpV4 = publicNatAddressIpV4;
  }

  
  /**
   * IPv6 NENT IP Address
   **/
  public DomainLogicalInterface publicNatAddressIpV6(String publicNatAddressIpV6) {
    this.publicNatAddressIpV6 = publicNatAddressIpV6;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv6 NENT IP Address")
  @JsonProperty("publicNatAddressIpV6")
  public String getPublicNatAddressIpV6() {
    return publicNatAddressIpV6;
  }
  public void setPublicNatAddressIpV6(String publicNatAddressIpV6) {
    this.publicNatAddressIpV6 = publicNatAddressIpV6;
  }

  
  /**
   * The list of routes assigned to this interface.
   **/
  public DomainLogicalInterface routes(List<DomainNetworkRoute> routes) {
    this.routes = routes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of routes assigned to this interface.")
  @JsonProperty("routes")
  public List<DomainNetworkRoute> getRoutes() {
    return routes;
  }
  public void setRoutes(List<DomainNetworkRoute> routes) {
    this.routes = routes;
  }

  
  /**
   * The list of IP addresses on this interface.  Priority of dns addresses are based on order in the list.
   **/
  public DomainLogicalInterface addresses(List<DomainNetworkAddress> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of IP addresses on this interface.  Priority of dns addresses are based on order in the list.")
  @JsonProperty("addresses")
  public List<DomainNetworkAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<DomainNetworkAddress> addresses) {
    this.addresses = addresses;
  }

  
  /**
   * IPv4 interface settings.
   **/
  public DomainLogicalInterface ipv4Capabilities(DomainCapabilities ipv4Capabilities) {
    this.ipv4Capabilities = ipv4Capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv4 interface settings.")
  @JsonProperty("ipv4Capabilities")
  public DomainCapabilities getIpv4Capabilities() {
    return ipv4Capabilities;
  }
  public void setIpv4Capabilities(DomainCapabilities ipv4Capabilities) {
    this.ipv4Capabilities = ipv4Capabilities;
  }

  
  /**
   * IPv6 interface settings.
   **/
  public DomainLogicalInterface ipv6Capabilities(DomainCapabilities ipv6Capabilities) {
    this.ipv6Capabilities = ipv6Capabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv6 interface settings.")
  @JsonProperty("ipv6Capabilities")
  public DomainCapabilities getIpv6Capabilities() {
    return ipv6Capabilities;
  }
  public void setIpv6Capabilities(DomainCapabilities ipv6Capabilities) {
    this.ipv6Capabilities = ipv6Capabilities;
  }

  
  /**
   **/
  public DomainLogicalInterface currentState(CurrentStateEnum currentState) {
    this.currentState = currentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("currentState")
  public CurrentStateEnum getCurrentState() {
    return currentState;
  }
  public void setCurrentState(CurrentStateEnum currentState) {
    this.currentState = currentState;
  }

  
  /**
   **/
  public DomainLogicalInterface lastModifiedUserId(String lastModifiedUserId) {
    this.lastModifiedUserId = lastModifiedUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastModifiedUserId")
  public String getLastModifiedUserId() {
    return lastModifiedUserId;
  }
  public void setLastModifiedUserId(String lastModifiedUserId) {
    this.lastModifiedUserId = lastModifiedUserId;
  }

  
  /**
   **/
  public DomainLogicalInterface lastModifiedCorrelationId(String lastModifiedCorrelationId) {
    this.lastModifiedCorrelationId = lastModifiedCorrelationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastModifiedCorrelationId")
  public String getLastModifiedCorrelationId() {
    return lastModifiedCorrelationId;
  }
  public void setLastModifiedCorrelationId(String lastModifiedCorrelationId) {
    this.lastModifiedCorrelationId = lastModifiedCorrelationId;
  }

  
  /**
   **/
  public DomainLogicalInterface commandResponses(List<DomainNetworkCommandResponse> commandResponses) {
    this.commandResponses = commandResponses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commandResponses")
  public List<DomainNetworkCommandResponse> getCommandResponses() {
    return commandResponses;
  }
  public void setCommandResponses(List<DomainNetworkCommandResponse> commandResponses) {
    this.commandResponses = commandResponses;
  }

  
  /**
   * The IPv4 phone trunk base assignment will be inherited from the Edge Group.
   **/
  public DomainLogicalInterface inheritPhoneTrunkBasesIPv4(Boolean inheritPhoneTrunkBasesIPv4) {
    this.inheritPhoneTrunkBasesIPv4 = inheritPhoneTrunkBasesIPv4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IPv4 phone trunk base assignment will be inherited from the Edge Group.")
  @JsonProperty("inheritPhoneTrunkBasesIPv4")
  public Boolean getInheritPhoneTrunkBasesIPv4() {
    return inheritPhoneTrunkBasesIPv4;
  }
  public void setInheritPhoneTrunkBasesIPv4(Boolean inheritPhoneTrunkBasesIPv4) {
    this.inheritPhoneTrunkBasesIPv4 = inheritPhoneTrunkBasesIPv4;
  }

  
  /**
   * The IPv6 phone trunk base assignment will be inherited from the Edge Group.
   **/
  public DomainLogicalInterface inheritPhoneTrunkBasesIPv6(Boolean inheritPhoneTrunkBasesIPv6) {
    this.inheritPhoneTrunkBasesIPv6 = inheritPhoneTrunkBasesIPv6;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IPv6 phone trunk base assignment will be inherited from the Edge Group.")
  @JsonProperty("inheritPhoneTrunkBasesIPv6")
  public Boolean getInheritPhoneTrunkBasesIPv6() {
    return inheritPhoneTrunkBasesIPv6;
  }
  public void setInheritPhoneTrunkBasesIPv6(Boolean inheritPhoneTrunkBasesIPv6) {
    this.inheritPhoneTrunkBasesIPv6 = inheritPhoneTrunkBasesIPv6;
  }

  
  /**
   * This interface will be used for all internal edge-to-edge communication using settings from the edgeTrunkBaseAssignment on the Edge Group.
   **/
  public DomainLogicalInterface useForInternalEdgeCommunication(Boolean useForInternalEdgeCommunication) {
    this.useForInternalEdgeCommunication = useForInternalEdgeCommunication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This interface will be used for all internal edge-to-edge communication using settings from the edgeTrunkBaseAssignment on the Edge Group.")
  @JsonProperty("useForInternalEdgeCommunication")
  public Boolean getUseForInternalEdgeCommunication() {
    return useForInternalEdgeCommunication;
  }
  public void setUseForInternalEdgeCommunication(Boolean useForInternalEdgeCommunication) {
    this.useForInternalEdgeCommunication = useForInternalEdgeCommunication;
  }

  
  /**
   * Site Interconnects using the \"Indirect\" method will communicate using the Public IP Address specified on the interface. Use this option when a NAT enabled firewall is between the Edge and the far end.
   **/
  public DomainLogicalInterface useForIndirectEdgeCommunication(Boolean useForIndirectEdgeCommunication) {
    this.useForIndirectEdgeCommunication = useForIndirectEdgeCommunication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Site Interconnects using the \"Indirect\" method will communicate using the Public IP Address specified on the interface. Use this option when a NAT enabled firewall is between the Edge and the far end.")
  @JsonProperty("useForIndirectEdgeCommunication")
  public Boolean getUseForIndirectEdgeCommunication() {
    return useForIndirectEdgeCommunication;
  }
  public void setUseForIndirectEdgeCommunication(Boolean useForIndirectEdgeCommunication) {
    this.useForIndirectEdgeCommunication = useForIndirectEdgeCommunication;
  }

  
  /**
   * Site Interconnects using the \"Cloud Proxy\" method will broker the connection between them with a Cloud Proxy. This method is required for connections between one or more Sites using Cloud Media, but can optionally be used between two premises Sites if Direct or Indirect are not an option.
   **/
  public DomainLogicalInterface useForCloudProxyEdgeCommunication(Boolean useForCloudProxyEdgeCommunication) {
    this.useForCloudProxyEdgeCommunication = useForCloudProxyEdgeCommunication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Site Interconnects using the \"Cloud Proxy\" method will broker the connection between them with a Cloud Proxy. This method is required for connections between one or more Sites using Cloud Media, but can optionally be used between two premises Sites if Direct or Indirect are not an option.")
  @JsonProperty("useForCloudProxyEdgeCommunication")
  public Boolean getUseForCloudProxyEdgeCommunication() {
    return useForCloudProxyEdgeCommunication;
  }
  public void setUseForCloudProxyEdgeCommunication(Boolean useForCloudProxyEdgeCommunication) {
    this.useForCloudProxyEdgeCommunication = useForCloudProxyEdgeCommunication;
  }

  
  @ApiModelProperty(example = "null", value = "This interface will be used for all communication with the internet.")
  @JsonProperty("useForWanInterface")
  public Boolean getUseForWanInterface() {
    return useForWanInterface;
  }

  
  /**
   * External trunk base settings to use for external communication from this interface.
   **/
  public DomainLogicalInterface externalTrunkBaseAssignments(List<TrunkBaseAssignment> externalTrunkBaseAssignments) {
    this.externalTrunkBaseAssignments = externalTrunkBaseAssignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External trunk base settings to use for external communication from this interface.")
  @JsonProperty("externalTrunkBaseAssignments")
  public List<TrunkBaseAssignment> getExternalTrunkBaseAssignments() {
    return externalTrunkBaseAssignments;
  }
  public void setExternalTrunkBaseAssignments(List<TrunkBaseAssignment> externalTrunkBaseAssignments) {
    this.externalTrunkBaseAssignments = externalTrunkBaseAssignments;
  }

  
  /**
   * Phone trunk base settings to use for phone communication from this interface.  These settings will be ignored when \"inheritPhoneTrunkBases\" is true.
   **/
  public DomainLogicalInterface phoneTrunkBaseAssignments(List<TrunkBaseAssignment> phoneTrunkBaseAssignments) {
    this.phoneTrunkBaseAssignments = phoneTrunkBaseAssignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone trunk base settings to use for phone communication from this interface.  These settings will be ignored when \"inheritPhoneTrunkBases\" is true.")
  @JsonProperty("phoneTrunkBaseAssignments")
  public List<TrunkBaseAssignment> getPhoneTrunkBaseAssignments() {
    return phoneTrunkBaseAssignments;
  }
  public void setPhoneTrunkBaseAssignments(List<TrunkBaseAssignment> phoneTrunkBaseAssignments) {
    this.phoneTrunkBaseAssignments = phoneTrunkBaseAssignments;
  }

  
  /**
   **/
  public DomainLogicalInterface traceEnabled(Boolean traceEnabled) {
    this.traceEnabled = traceEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("traceEnabled")
  public Boolean getTraceEnabled() {
    return traceEnabled;
  }
  public void setTraceEnabled(Boolean traceEnabled) {
    this.traceEnabled = traceEnabled;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DomainLogicalInterface startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DomainLogicalInterface endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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
    DomainLogicalInterface domainLogicalInterface = (DomainLogicalInterface) o;
    return Objects.equals(this.id, domainLogicalInterface.id) &&
        Objects.equals(this.name, domainLogicalInterface.name) &&
        Objects.equals(this.division, domainLogicalInterface.division) &&
        Objects.equals(this.description, domainLogicalInterface.description) &&
        Objects.equals(this.version, domainLogicalInterface.version) &&
        Objects.equals(this.dateCreated, domainLogicalInterface.dateCreated) &&
        Objects.equals(this.dateModified, domainLogicalInterface.dateModified) &&
        Objects.equals(this.modifiedBy, domainLogicalInterface.modifiedBy) &&
        Objects.equals(this.createdBy, domainLogicalInterface.createdBy) &&
        Objects.equals(this.state, domainLogicalInterface.state) &&
        Objects.equals(this.modifiedByApp, domainLogicalInterface.modifiedByApp) &&
        Objects.equals(this.createdByApp, domainLogicalInterface.createdByApp) &&
        Objects.equals(this.edgeUri, domainLogicalInterface.edgeUri) &&
        Objects.equals(this.edgeAssignedId, domainLogicalInterface.edgeAssignedId) &&
        Objects.equals(this.friendlyName, domainLogicalInterface.friendlyName) &&
        Objects.equals(this.vlanTagId, domainLogicalInterface.vlanTagId) &&
        Objects.equals(this.hardwareAddress, domainLogicalInterface.hardwareAddress) &&
        Objects.equals(this.physicalAdapterId, domainLogicalInterface.physicalAdapterId) &&
        Objects.equals(this.ifStatus, domainLogicalInterface.ifStatus) &&
        Objects.equals(this.interfaceType, domainLogicalInterface.interfaceType) &&
        Objects.equals(this.publicNatAddressIpV4, domainLogicalInterface.publicNatAddressIpV4) &&
        Objects.equals(this.publicNatAddressIpV6, domainLogicalInterface.publicNatAddressIpV6) &&
        Objects.equals(this.routes, domainLogicalInterface.routes) &&
        Objects.equals(this.addresses, domainLogicalInterface.addresses) &&
        Objects.equals(this.ipv4Capabilities, domainLogicalInterface.ipv4Capabilities) &&
        Objects.equals(this.ipv6Capabilities, domainLogicalInterface.ipv6Capabilities) &&
        Objects.equals(this.currentState, domainLogicalInterface.currentState) &&
        Objects.equals(this.lastModifiedUserId, domainLogicalInterface.lastModifiedUserId) &&
        Objects.equals(this.lastModifiedCorrelationId, domainLogicalInterface.lastModifiedCorrelationId) &&
        Objects.equals(this.commandResponses, domainLogicalInterface.commandResponses) &&
        Objects.equals(this.inheritPhoneTrunkBasesIPv4, domainLogicalInterface.inheritPhoneTrunkBasesIPv4) &&
        Objects.equals(this.inheritPhoneTrunkBasesIPv6, domainLogicalInterface.inheritPhoneTrunkBasesIPv6) &&
        Objects.equals(this.useForInternalEdgeCommunication, domainLogicalInterface.useForInternalEdgeCommunication) &&
        Objects.equals(this.useForIndirectEdgeCommunication, domainLogicalInterface.useForIndirectEdgeCommunication) &&
        Objects.equals(this.useForCloudProxyEdgeCommunication, domainLogicalInterface.useForCloudProxyEdgeCommunication) &&
        Objects.equals(this.useForWanInterface, domainLogicalInterface.useForWanInterface) &&
        Objects.equals(this.externalTrunkBaseAssignments, domainLogicalInterface.externalTrunkBaseAssignments) &&
        Objects.equals(this.phoneTrunkBaseAssignments, domainLogicalInterface.phoneTrunkBaseAssignments) &&
        Objects.equals(this.traceEnabled, domainLogicalInterface.traceEnabled) &&
        Objects.equals(this.startDate, domainLogicalInterface.startDate) &&
        Objects.equals(this.endDate, domainLogicalInterface.endDate) &&
        Objects.equals(this.selfUri, domainLogicalInterface.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, edgeUri, edgeAssignedId, friendlyName, vlanTagId, hardwareAddress, physicalAdapterId, ifStatus, interfaceType, publicNatAddressIpV4, publicNatAddressIpV6, routes, addresses, ipv4Capabilities, ipv6Capabilities, currentState, lastModifiedUserId, lastModifiedCorrelationId, commandResponses, inheritPhoneTrunkBasesIPv4, inheritPhoneTrunkBasesIPv6, useForInternalEdgeCommunication, useForIndirectEdgeCommunication, useForCloudProxyEdgeCommunication, useForWanInterface, externalTrunkBaseAssignments, phoneTrunkBaseAssignments, traceEnabled, startDate, endDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainLogicalInterface {\n");
    
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
    sb.append("    edgeUri: ").append(toIndentedString(edgeUri)).append("\n");
    sb.append("    edgeAssignedId: ").append(toIndentedString(edgeAssignedId)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    vlanTagId: ").append(toIndentedString(vlanTagId)).append("\n");
    sb.append("    hardwareAddress: ").append(toIndentedString(hardwareAddress)).append("\n");
    sb.append("    physicalAdapterId: ").append(toIndentedString(physicalAdapterId)).append("\n");
    sb.append("    ifStatus: ").append(toIndentedString(ifStatus)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    publicNatAddressIpV4: ").append(toIndentedString(publicNatAddressIpV4)).append("\n");
    sb.append("    publicNatAddressIpV6: ").append(toIndentedString(publicNatAddressIpV6)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    ipv4Capabilities: ").append(toIndentedString(ipv4Capabilities)).append("\n");
    sb.append("    ipv6Capabilities: ").append(toIndentedString(ipv6Capabilities)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    lastModifiedUserId: ").append(toIndentedString(lastModifiedUserId)).append("\n");
    sb.append("    lastModifiedCorrelationId: ").append(toIndentedString(lastModifiedCorrelationId)).append("\n");
    sb.append("    commandResponses: ").append(toIndentedString(commandResponses)).append("\n");
    sb.append("    inheritPhoneTrunkBasesIPv4: ").append(toIndentedString(inheritPhoneTrunkBasesIPv4)).append("\n");
    sb.append("    inheritPhoneTrunkBasesIPv6: ").append(toIndentedString(inheritPhoneTrunkBasesIPv6)).append("\n");
    sb.append("    useForInternalEdgeCommunication: ").append(toIndentedString(useForInternalEdgeCommunication)).append("\n");
    sb.append("    useForIndirectEdgeCommunication: ").append(toIndentedString(useForIndirectEdgeCommunication)).append("\n");
    sb.append("    useForCloudProxyEdgeCommunication: ").append(toIndentedString(useForCloudProxyEdgeCommunication)).append("\n");
    sb.append("    useForWanInterface: ").append(toIndentedString(useForWanInterface)).append("\n");
    sb.append("    externalTrunkBaseAssignments: ").append(toIndentedString(externalTrunkBaseAssignments)).append("\n");
    sb.append("    phoneTrunkBaseAssignments: ").append(toIndentedString(phoneTrunkBaseAssignments)).append("\n");
    sb.append("    traceEnabled: ").append(toIndentedString(traceEnabled)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

