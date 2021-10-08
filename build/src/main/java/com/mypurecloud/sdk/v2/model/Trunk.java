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
import com.mypurecloud.sdk.v2.model.TrunkConnectedStatus;
import com.mypurecloud.sdk.v2.model.TrunkMetricsNetworkTypeIp;
import com.mypurecloud.sdk.v2.model.TrunkMetricsOptions;
import com.mypurecloud.sdk.v2.model.TrunkMetricsRegisters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Trunk
 */

public class Trunk  implements Serializable {
  
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

  private static class TrunkTypeEnumDeserializer extends StdDeserializer<TrunkTypeEnum> {
    public TrunkTypeEnumDeserializer() {
      super(TrunkTypeEnumDeserializer.class);
    }

    @Override
    public TrunkTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TrunkTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of this trunk.
   */
 @JsonDeserialize(using = TrunkTypeEnumDeserializer.class)
  public enum TrunkTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXTERNAL("EXTERNAL"),
    PHONE("PHONE"),
    EDGE("EDGE");

    private String value;

    TrunkTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TrunkTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TrunkTypeEnum value : TrunkTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TrunkTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TrunkTypeEnum trunkType = null;
  private DomainEntityRef edge = null;
  private DomainEntityRef trunkBase = null;
  private DomainEntityRef trunkMetabase = null;
  private DomainEntityRef edgeGroup = null;
  private Boolean inService = null;
  private Boolean enabled = null;
  private DomainEntityRef logicalInterface = null;
  private TrunkConnectedStatus connectedStatus = null;
  private List<TrunkMetricsOptions> optionsStatus = new ArrayList<TrunkMetricsOptions>();
  private List<TrunkMetricsRegisters> registersStatus = new ArrayList<TrunkMetricsRegisters>();
  private TrunkMetricsNetworkTypeIp ipStatus = null;

  private static class OptionsEnabledStatusEnumDeserializer extends StdDeserializer<OptionsEnabledStatusEnum> {
    public OptionsEnabledStatusEnumDeserializer() {
      super(OptionsEnabledStatusEnumDeserializer.class);
    }

    @Override
    public OptionsEnabledStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OptionsEnabledStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Returns Enabled when the trunk base supports the availability interval and it has a value greater than 0.
   */
 @JsonDeserialize(using = OptionsEnabledStatusEnumDeserializer.class)
  public enum OptionsEnabledStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    NOT_SUPPORTED("NOT_SUPPORTED");

    private String value;

    OptionsEnabledStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OptionsEnabledStatusEnum fromString(String key) {
      if (key == null) return null;

      for (OptionsEnabledStatusEnum value : OptionsEnabledStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OptionsEnabledStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OptionsEnabledStatusEnum optionsEnabledStatus = null;

  private static class RegistersEnabledStatusEnumDeserializer extends StdDeserializer<RegistersEnabledStatusEnum> {
    public RegistersEnabledStatusEnumDeserializer() {
      super(RegistersEnabledStatusEnumDeserializer.class);
    }

    @Override
    public RegistersEnabledStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RegistersEnabledStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Returns Enabled when the trunk base supports the registration interval and it has a value greater than 0.
   */
 @JsonDeserialize(using = RegistersEnabledStatusEnumDeserializer.class)
  public enum RegistersEnabledStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    NOT_SUPPORTED("NOT_SUPPORTED");

    private String value;

    RegistersEnabledStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RegistersEnabledStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RegistersEnabledStatusEnum value : RegistersEnabledStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RegistersEnabledStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RegistersEnabledStatusEnum registersEnabledStatus = null;
  private Integer family = null;
  private List<String> proxyAddressList = new ArrayList<String>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the entity.
   **/
  public Trunk name(String name) {
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
  public Trunk division(Division division) {
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
  public Trunk description(String description) {
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
  public Trunk version(Integer version) {
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
  public Trunk dateCreated(Date dateCreated) {
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
  public Trunk dateModified(Date dateModified) {
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
  public Trunk modifiedBy(String modifiedBy) {
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
  public Trunk createdBy(String createdBy) {
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
  public Trunk modifiedByApp(String modifiedByApp) {
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
  public Trunk createdByApp(String createdByApp) {
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
   * The type of this trunk.
   **/
  public Trunk trunkType(TrunkTypeEnum trunkType) {
    this.trunkType = trunkType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of this trunk.")
  @JsonProperty("trunkType")
  public TrunkTypeEnum getTrunkType() {
    return trunkType;
  }
  public void setTrunkType(TrunkTypeEnum trunkType) {
    this.trunkType = trunkType;
  }

  
  /**
   * The Edge using this trunk.
   **/
  public Trunk edge(DomainEntityRef edge) {
    this.edge = edge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Edge using this trunk.")
  @JsonProperty("edge")
  public DomainEntityRef getEdge() {
    return edge;
  }
  public void setEdge(DomainEntityRef edge) {
    this.edge = edge;
  }

  
  /**
   * The trunk base configuration used on this trunk.
   **/
  public Trunk trunkBase(DomainEntityRef trunkBase) {
    this.trunkBase = trunkBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The trunk base configuration used on this trunk.")
  @JsonProperty("trunkBase")
  public DomainEntityRef getTrunkBase() {
    return trunkBase;
  }
  public void setTrunkBase(DomainEntityRef trunkBase) {
    this.trunkBase = trunkBase;
  }

  
  /**
   * The metabase used to create this trunk.
   **/
  public Trunk trunkMetabase(DomainEntityRef trunkMetabase) {
    this.trunkMetabase = trunkMetabase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metabase used to create this trunk.")
  @JsonProperty("trunkMetabase")
  public DomainEntityRef getTrunkMetabase() {
    return trunkMetabase;
  }
  public void setTrunkMetabase(DomainEntityRef trunkMetabase) {
    this.trunkMetabase = trunkMetabase;
  }

  
  /**
   * The edge group associated with this trunk.
   **/
  public Trunk edgeGroup(DomainEntityRef edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The edge group associated with this trunk.")
  @JsonProperty("edgeGroup")
  public DomainEntityRef getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(DomainEntityRef edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  
  @ApiModelProperty(example = "null", value = "True if this trunk is in-service.  This comes from the trunk_enabled property of the referenced trunk base.")
  @JsonProperty("inService")
  public Boolean getInService() {
    return inService;
  }

  
  /**
   * True if the Edge used by this trunk is in-service
   **/
  public Trunk enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the Edge used by this trunk is in-service")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  @ApiModelProperty(example = "null", value = "The Logical Interface on the Edge to which the trunk is assigned.")
  @JsonProperty("logicalInterface")
  public DomainEntityRef getLogicalInterface() {
    return logicalInterface;
  }

  
  @ApiModelProperty(example = "null", value = "The connected status of the trunk")
  @JsonProperty("connectedStatus")
  public TrunkConnectedStatus getConnectedStatus() {
    return connectedStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The trunk optionsStatus")
  @JsonProperty("optionsStatus")
  public List<TrunkMetricsOptions> getOptionsStatus() {
    return optionsStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The trunk registersStatus")
  @JsonProperty("registersStatus")
  public List<TrunkMetricsRegisters> getRegistersStatus() {
    return registersStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The trunk ipStatus")
  @JsonProperty("ipStatus")
  public TrunkMetricsNetworkTypeIp getIpStatus() {
    return ipStatus;
  }

  
  @ApiModelProperty(example = "null", value = "Returns Enabled when the trunk base supports the availability interval and it has a value greater than 0.")
  @JsonProperty("optionsEnabledStatus")
  public OptionsEnabledStatusEnum getOptionsEnabledStatus() {
    return optionsEnabledStatus;
  }

  
  @ApiModelProperty(example = "null", value = "Returns Enabled when the trunk base supports the registration interval and it has a value greater than 0.")
  @JsonProperty("registersEnabledStatus")
  public RegistersEnabledStatusEnum getRegistersEnabledStatus() {
    return registersEnabledStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The IP Network Family of the trunk")
  @JsonProperty("family")
  public Integer getFamily() {
    return family;
  }

  
  @ApiModelProperty(example = "null", value = "The list of proxy addresses (ports if provided) for the trunk")
  @JsonProperty("proxyAddressList")
  public List<String> getProxyAddressList() {
    return proxyAddressList;
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
    Trunk trunk = (Trunk) o;
    return Objects.equals(this.id, trunk.id) &&
        Objects.equals(this.name, trunk.name) &&
        Objects.equals(this.division, trunk.division) &&
        Objects.equals(this.description, trunk.description) &&
        Objects.equals(this.version, trunk.version) &&
        Objects.equals(this.dateCreated, trunk.dateCreated) &&
        Objects.equals(this.dateModified, trunk.dateModified) &&
        Objects.equals(this.modifiedBy, trunk.modifiedBy) &&
        Objects.equals(this.createdBy, trunk.createdBy) &&
        Objects.equals(this.state, trunk.state) &&
        Objects.equals(this.modifiedByApp, trunk.modifiedByApp) &&
        Objects.equals(this.createdByApp, trunk.createdByApp) &&
        Objects.equals(this.trunkType, trunk.trunkType) &&
        Objects.equals(this.edge, trunk.edge) &&
        Objects.equals(this.trunkBase, trunk.trunkBase) &&
        Objects.equals(this.trunkMetabase, trunk.trunkMetabase) &&
        Objects.equals(this.edgeGroup, trunk.edgeGroup) &&
        Objects.equals(this.inService, trunk.inService) &&
        Objects.equals(this.enabled, trunk.enabled) &&
        Objects.equals(this.logicalInterface, trunk.logicalInterface) &&
        Objects.equals(this.connectedStatus, trunk.connectedStatus) &&
        Objects.equals(this.optionsStatus, trunk.optionsStatus) &&
        Objects.equals(this.registersStatus, trunk.registersStatus) &&
        Objects.equals(this.ipStatus, trunk.ipStatus) &&
        Objects.equals(this.optionsEnabledStatus, trunk.optionsEnabledStatus) &&
        Objects.equals(this.registersEnabledStatus, trunk.registersEnabledStatus) &&
        Objects.equals(this.family, trunk.family) &&
        Objects.equals(this.proxyAddressList, trunk.proxyAddressList) &&
        Objects.equals(this.selfUri, trunk.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, trunkType, edge, trunkBase, trunkMetabase, edgeGroup, inService, enabled, logicalInterface, connectedStatus, optionsStatus, registersStatus, ipStatus, optionsEnabledStatus, registersEnabledStatus, family, proxyAddressList, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trunk {\n");
    
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
    sb.append("    trunkType: ").append(toIndentedString(trunkType)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    trunkBase: ").append(toIndentedString(trunkBase)).append("\n");
    sb.append("    trunkMetabase: ").append(toIndentedString(trunkMetabase)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    inService: ").append(toIndentedString(inService)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    logicalInterface: ").append(toIndentedString(logicalInterface)).append("\n");
    sb.append("    connectedStatus: ").append(toIndentedString(connectedStatus)).append("\n");
    sb.append("    optionsStatus: ").append(toIndentedString(optionsStatus)).append("\n");
    sb.append("    registersStatus: ").append(toIndentedString(registersStatus)).append("\n");
    sb.append("    ipStatus: ").append(toIndentedString(ipStatus)).append("\n");
    sb.append("    optionsEnabledStatus: ").append(toIndentedString(optionsEnabledStatus)).append("\n");
    sb.append("    registersEnabledStatus: ").append(toIndentedString(registersEnabledStatus)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    proxyAddressList: ").append(toIndentedString(proxyAddressList)).append("\n");
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

