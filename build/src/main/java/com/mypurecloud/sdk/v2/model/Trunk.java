package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Trunk
 */

public class Trunk  implements Serializable {
  
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

  /**
   * The type of this trunk.
   */
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
  private UriReference edge = null;
  private UriReference trunkBase = null;
  private UriReference trunkMetabase = null;
  private UriReference edgeGroup = null;
  private Boolean inService = null;
  private Boolean enabled = null;
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
   **/
  public Trunk description(String description) {
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
  public Trunk version(Integer version) {
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
  public Trunk dateCreated(Date dateCreated) {
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
  public Trunk dateModified(Date dateModified) {
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
  public Trunk modifiedBy(String modifiedBy) {
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
  public Trunk createdBy(String createdBy) {
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
  public Trunk state(StateEnum state) {
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
  public Trunk modifiedByApp(String modifiedByApp) {
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
  public Trunk createdByApp(String createdByApp) {
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
  public Trunk edge(UriReference edge) {
    this.edge = edge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Edge using this trunk.")
  @JsonProperty("edge")
  public UriReference getEdge() {
    return edge;
  }
  public void setEdge(UriReference edge) {
    this.edge = edge;
  }

  
  /**
   * The trunk base configuration used on this trunk.
   **/
  public Trunk trunkBase(UriReference trunkBase) {
    this.trunkBase = trunkBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The trunk base configuration used on this trunk.")
  @JsonProperty("trunkBase")
  public UriReference getTrunkBase() {
    return trunkBase;
  }
  public void setTrunkBase(UriReference trunkBase) {
    this.trunkBase = trunkBase;
  }

  
  /**
   * The metabase used to create this trunk.
   **/
  public Trunk trunkMetabase(UriReference trunkMetabase) {
    this.trunkMetabase = trunkMetabase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metabase used to create this trunk.")
  @JsonProperty("trunkMetabase")
  public UriReference getTrunkMetabase() {
    return trunkMetabase;
  }
  public void setTrunkMetabase(UriReference trunkMetabase) {
    this.trunkMetabase = trunkMetabase;
  }

  
  /**
   * The edge group associated with this trunk.
   **/
  public Trunk edgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The edge group associated with this trunk.")
  @JsonProperty("edgeGroup")
  public UriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(UriReference edgeGroup) {
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
        Objects.equals(this.selfUri, trunk.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, trunkType, edge, trunkBase, trunkMetabase, edgeGroup, inService, enabled, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trunk {\n");
    
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
    sb.append("    trunkType: ").append(toIndentedString(trunkType)).append("\n");
    sb.append("    edge: ").append(toIndentedString(edge)).append("\n");
    sb.append("    trunkBase: ").append(toIndentedString(trunkBase)).append("\n");
    sb.append("    trunkMetabase: ").append(toIndentedString(trunkMetabase)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    inService: ").append(toIndentedString(inService)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

