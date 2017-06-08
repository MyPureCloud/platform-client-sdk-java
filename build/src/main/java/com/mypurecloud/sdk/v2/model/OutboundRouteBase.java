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
 * OutboundRouteBase
 */

public class OutboundRouteBase  implements Serializable {
  
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
  private List<String> classificationTypes = new ArrayList<String>();
  private Boolean enabled = null;

  /**
   * Gets or Sets distribution
   */
  public enum DistributionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SEQUENTIAL("SEQUENTIAL"),
    RANDOM("RANDOM");

    private String value;

    DistributionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DistributionEnum fromString(String key) {
      if (key == null) return null;

      for (DistributionEnum value : DistributionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DistributionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DistributionEnum distribution = null;
  private List<UriReference> externalTrunkBases = new ArrayList<UriReference>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the entity.
   **/
  public OutboundRouteBase name(String name) {
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
  public OutboundRouteBase description(String description) {
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
  public OutboundRouteBase version(Integer version) {
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
  public OutboundRouteBase dateCreated(Date dateCreated) {
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
  public OutboundRouteBase dateModified(Date dateModified) {
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
  public OutboundRouteBase modifiedBy(String modifiedBy) {
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
  public OutboundRouteBase createdBy(String createdBy) {
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
  public OutboundRouteBase state(StateEnum state) {
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
  public OutboundRouteBase modifiedByApp(String modifiedByApp) {
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
  public OutboundRouteBase createdByApp(String createdByApp) {
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
   * The site associated to the outbound route.
   **/
  public OutboundRouteBase classificationTypes(List<String> classificationTypes) {
    this.classificationTypes = classificationTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The site associated to the outbound route.")
  @JsonProperty("classificationTypes")
  public List<String> getClassificationTypes() {
    return classificationTypes;
  }
  public void setClassificationTypes(List<String> classificationTypes) {
    this.classificationTypes = classificationTypes;
  }

  
  /**
   **/
  public OutboundRouteBase enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  public OutboundRouteBase distribution(DistributionEnum distribution) {
    this.distribution = distribution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distribution")
  public DistributionEnum getDistribution() {
    return distribution;
  }
  public void setDistribution(DistributionEnum distribution) {
    this.distribution = distribution;
  }

  
  /**
   * Trunk base settings of trunkType \"EXTERNAL\".  This base must also be set on an edge logical interface for correct routing.
   **/
  public OutboundRouteBase externalTrunkBases(List<UriReference> externalTrunkBases) {
    this.externalTrunkBases = externalTrunkBases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Trunk base settings of trunkType \"EXTERNAL\".  This base must also be set on an edge logical interface for correct routing.")
  @JsonProperty("externalTrunkBases")
  public List<UriReference> getExternalTrunkBases() {
    return externalTrunkBases;
  }
  public void setExternalTrunkBases(List<UriReference> externalTrunkBases) {
    this.externalTrunkBases = externalTrunkBases;
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
    OutboundRouteBase outboundRouteBase = (OutboundRouteBase) o;
    return Objects.equals(this.id, outboundRouteBase.id) &&
        Objects.equals(this.name, outboundRouteBase.name) &&
        Objects.equals(this.description, outboundRouteBase.description) &&
        Objects.equals(this.version, outboundRouteBase.version) &&
        Objects.equals(this.dateCreated, outboundRouteBase.dateCreated) &&
        Objects.equals(this.dateModified, outboundRouteBase.dateModified) &&
        Objects.equals(this.modifiedBy, outboundRouteBase.modifiedBy) &&
        Objects.equals(this.createdBy, outboundRouteBase.createdBy) &&
        Objects.equals(this.state, outboundRouteBase.state) &&
        Objects.equals(this.modifiedByApp, outboundRouteBase.modifiedByApp) &&
        Objects.equals(this.createdByApp, outboundRouteBase.createdByApp) &&
        Objects.equals(this.classificationTypes, outboundRouteBase.classificationTypes) &&
        Objects.equals(this.enabled, outboundRouteBase.enabled) &&
        Objects.equals(this.distribution, outboundRouteBase.distribution) &&
        Objects.equals(this.externalTrunkBases, outboundRouteBase.externalTrunkBases) &&
        Objects.equals(this.selfUri, outboundRouteBase.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, classificationTypes, enabled, distribution, externalTrunkBases, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundRouteBase {\n");
    
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
    sb.append("    classificationTypes: ").append(toIndentedString(classificationTypes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    externalTrunkBases: ").append(toIndentedString(externalTrunkBases)).append("\n");
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

