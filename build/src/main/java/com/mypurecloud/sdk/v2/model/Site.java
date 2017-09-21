package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Contact;
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.EdgeAutoUpdateConfig;
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Site
 */

public class Site  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Integer version = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String modifiedBy = null;
  private String createdBy = null;

  /**
   * Indicates if the resource is active, inactive, or deleted.
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
  private List<UriReference> primarySites = new ArrayList<UriReference>();
  private List<UriReference> secondarySites = new ArrayList<UriReference>();
  private List<Edge> primaryEdges = new ArrayList<Edge>();
  private List<Edge> secondaryEdges = new ArrayList<Edge>();
  private List<Contact> addresses = new ArrayList<Contact>();
  private List<Edge> edges = new ArrayList<Edge>();
  private EdgeAutoUpdateConfig edgeAutoUpdateConfig = null;
  private LocationDefinition location = null;
  private Boolean managed = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the entity.
   **/
  public Site name(String name) {
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
   * The resource's description.
   **/
  public Site description(String description) {
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
  public Site version(Integer version) {
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
   * The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Site dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Site dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
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
  public Site modifiedBy(String modifiedBy) {
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
  public Site createdBy(String createdBy) {
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
  public Site modifiedByApp(String modifiedByApp) {
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
  public Site createdByApp(String createdByApp) {
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
  public Site primarySites(List<UriReference> primarySites) {
    this.primarySites = primarySites;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primarySites")
  public List<UriReference> getPrimarySites() {
    return primarySites;
  }
  public void setPrimarySites(List<UriReference> primarySites) {
    this.primarySites = primarySites;
  }

  
  /**
   **/
  public Site secondarySites(List<UriReference> secondarySites) {
    this.secondarySites = secondarySites;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondarySites")
  public List<UriReference> getSecondarySites() {
    return secondarySites;
  }
  public void setSecondarySites(List<UriReference> secondarySites) {
    this.secondarySites = secondarySites;
  }

  
  /**
   **/
  public Site primaryEdges(List<Edge> primaryEdges) {
    this.primaryEdges = primaryEdges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primaryEdges")
  public List<Edge> getPrimaryEdges() {
    return primaryEdges;
  }
  public void setPrimaryEdges(List<Edge> primaryEdges) {
    this.primaryEdges = primaryEdges;
  }

  
  /**
   **/
  public Site secondaryEdges(List<Edge> secondaryEdges) {
    this.secondaryEdges = secondaryEdges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryEdges")
  public List<Edge> getSecondaryEdges() {
    return secondaryEdges;
  }
  public void setSecondaryEdges(List<Edge> secondaryEdges) {
    this.secondaryEdges = secondaryEdges;
  }

  
  /**
   **/
  public Site addresses(List<Contact> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addresses")
  public List<Contact> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Contact> addresses) {
    this.addresses = addresses;
  }

  
  /**
   **/
  public Site edges(List<Edge> edges) {
    this.edges = edges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edges")
  public List<Edge> getEdges() {
    return edges;
  }
  public void setEdges(List<Edge> edges) {
    this.edges = edges;
  }

  
  /**
   * Recurrance rule, time zone, and start/end settings for automatic edge updates for this site
   **/
  public Site edgeAutoUpdateConfig(EdgeAutoUpdateConfig edgeAutoUpdateConfig) {
    this.edgeAutoUpdateConfig = edgeAutoUpdateConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Recurrance rule, time zone, and start/end settings for automatic edge updates for this site")
  @JsonProperty("edgeAutoUpdateConfig")
  public EdgeAutoUpdateConfig getEdgeAutoUpdateConfig() {
    return edgeAutoUpdateConfig;
  }
  public void setEdgeAutoUpdateConfig(EdgeAutoUpdateConfig edgeAutoUpdateConfig) {
    this.edgeAutoUpdateConfig = edgeAutoUpdateConfig;
  }

  
  /**
   * Location
   **/
  public Site location(LocationDefinition location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Location")
  @JsonProperty("location")
  public LocationDefinition getLocation() {
    return location;
  }
  public void setLocation(LocationDefinition location) {
    this.location = location;
  }

  
  /**
   **/
  public Site managed(Boolean managed) {
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
    Site site = (Site) o;
    return Objects.equals(this.id, site.id) &&
        Objects.equals(this.name, site.name) &&
        Objects.equals(this.description, site.description) &&
        Objects.equals(this.version, site.version) &&
        Objects.equals(this.dateCreated, site.dateCreated) &&
        Objects.equals(this.dateModified, site.dateModified) &&
        Objects.equals(this.modifiedBy, site.modifiedBy) &&
        Objects.equals(this.createdBy, site.createdBy) &&
        Objects.equals(this.state, site.state) &&
        Objects.equals(this.modifiedByApp, site.modifiedByApp) &&
        Objects.equals(this.createdByApp, site.createdByApp) &&
        Objects.equals(this.primarySites, site.primarySites) &&
        Objects.equals(this.secondarySites, site.secondarySites) &&
        Objects.equals(this.primaryEdges, site.primaryEdges) &&
        Objects.equals(this.secondaryEdges, site.secondaryEdges) &&
        Objects.equals(this.addresses, site.addresses) &&
        Objects.equals(this.edges, site.edges) &&
        Objects.equals(this.edgeAutoUpdateConfig, site.edgeAutoUpdateConfig) &&
        Objects.equals(this.location, site.location) &&
        Objects.equals(this.managed, site.managed) &&
        Objects.equals(this.selfUri, site.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, primarySites, secondarySites, primaryEdges, secondaryEdges, addresses, edges, edgeAutoUpdateConfig, location, managed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    
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
    sb.append("    primarySites: ").append(toIndentedString(primarySites)).append("\n");
    sb.append("    secondarySites: ").append(toIndentedString(secondarySites)).append("\n");
    sb.append("    primaryEdges: ").append(toIndentedString(primaryEdges)).append("\n");
    sb.append("    secondaryEdges: ").append(toIndentedString(secondaryEdges)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    edges: ").append(toIndentedString(edges)).append("\n");
    sb.append("    edgeAutoUpdateConfig: ").append(toIndentedString(edgeAutoUpdateConfig)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
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

