package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Edge;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Line
 */

public class Line  implements Serializable {
  
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
  private Map<String, Object> properties = null;
  private UriReference edgeGroup = null;
  private UriReference template = null;
  private UriReference site = null;
  private UriReference lineBaseSettings = null;
  private Edge primaryEdge = null;
  private Edge secondaryEdge = null;
  private UriReference loggedInUser = null;
  private UriReference defaultForUser = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the entity.
   **/
  public Line name(String name) {
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
  public Line description(String description) {
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
  public Line version(Integer version) {
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
  public Line dateCreated(Date dateCreated) {
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
  public Line dateModified(Date dateModified) {
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
  public Line modifiedBy(String modifiedBy) {
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
  public Line createdBy(String createdBy) {
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
  public Line modifiedByApp(String modifiedByApp) {
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
  public Line createdByApp(String createdByApp) {
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
  public Line properties(Map<String, Object> properties) {
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
  public Line edgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeGroup")
  public UriReference getEdgeGroup() {
    return edgeGroup;
  }
  public void setEdgeGroup(UriReference edgeGroup) {
    this.edgeGroup = edgeGroup;
  }

  
  /**
   **/
  public Line template(UriReference template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("template")
  public UriReference getTemplate() {
    return template;
  }
  public void setTemplate(UriReference template) {
    this.template = template;
  }

  
  /**
   **/
  public Line site(UriReference site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("site")
  public UriReference getSite() {
    return site;
  }
  public void setSite(UriReference site) {
    this.site = site;
  }

  
  /**
   **/
  public Line lineBaseSettings(UriReference lineBaseSettings) {
    this.lineBaseSettings = lineBaseSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lineBaseSettings")
  public UriReference getLineBaseSettings() {
    return lineBaseSettings;
  }
  public void setLineBaseSettings(UriReference lineBaseSettings) {
    this.lineBaseSettings = lineBaseSettings;
  }

  
  /**
   * The primary edge associated to the line. (Deprecated)
   **/
  public Line primaryEdge(Edge primaryEdge) {
    this.primaryEdge = primaryEdge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The primary edge associated to the line. (Deprecated)")
  @JsonProperty("primaryEdge")
  public Edge getPrimaryEdge() {
    return primaryEdge;
  }
  public void setPrimaryEdge(Edge primaryEdge) {
    this.primaryEdge = primaryEdge;
  }

  
  /**
   * The secondary edge associated to the line. (Deprecated)
   **/
  public Line secondaryEdge(Edge secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The secondary edge associated to the line. (Deprecated)")
  @JsonProperty("secondaryEdge")
  public Edge getSecondaryEdge() {
    return secondaryEdge;
  }
  public void setSecondaryEdge(Edge secondaryEdge) {
    this.secondaryEdge = secondaryEdge;
  }

  
  /**
   **/
  public Line loggedInUser(UriReference loggedInUser) {
    this.loggedInUser = loggedInUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("loggedInUser")
  public UriReference getLoggedInUser() {
    return loggedInUser;
  }
  public void setLoggedInUser(UriReference loggedInUser) {
    this.loggedInUser = loggedInUser;
  }

  
  /**
   **/
  public Line defaultForUser(UriReference defaultForUser) {
    this.defaultForUser = defaultForUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultForUser")
  public UriReference getDefaultForUser() {
    return defaultForUser;
  }
  public void setDefaultForUser(UriReference defaultForUser) {
    this.defaultForUser = defaultForUser;
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
    Line line = (Line) o;
    return Objects.equals(this.id, line.id) &&
        Objects.equals(this.name, line.name) &&
        Objects.equals(this.description, line.description) &&
        Objects.equals(this.version, line.version) &&
        Objects.equals(this.dateCreated, line.dateCreated) &&
        Objects.equals(this.dateModified, line.dateModified) &&
        Objects.equals(this.modifiedBy, line.modifiedBy) &&
        Objects.equals(this.createdBy, line.createdBy) &&
        Objects.equals(this.state, line.state) &&
        Objects.equals(this.modifiedByApp, line.modifiedByApp) &&
        Objects.equals(this.createdByApp, line.createdByApp) &&
        Objects.equals(this.properties, line.properties) &&
        Objects.equals(this.edgeGroup, line.edgeGroup) &&
        Objects.equals(this.template, line.template) &&
        Objects.equals(this.site, line.site) &&
        Objects.equals(this.lineBaseSettings, line.lineBaseSettings) &&
        Objects.equals(this.primaryEdge, line.primaryEdge) &&
        Objects.equals(this.secondaryEdge, line.secondaryEdge) &&
        Objects.equals(this.loggedInUser, line.loggedInUser) &&
        Objects.equals(this.defaultForUser, line.defaultForUser) &&
        Objects.equals(this.selfUri, line.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, dateCreated, dateModified, modifiedBy, createdBy, state, modifiedByApp, createdByApp, properties, edgeGroup, template, site, lineBaseSettings, primaryEdge, secondaryEdge, loggedInUser, defaultForUser, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Line {\n");
    
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
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    edgeGroup: ").append(toIndentedString(edgeGroup)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    lineBaseSettings: ").append(toIndentedString(lineBaseSettings)).append("\n");
    sb.append("    primaryEdge: ").append(toIndentedString(primaryEdge)).append("\n");
    sb.append("    secondaryEdge: ").append(toIndentedString(secondaryEdge)).append("\n");
    sb.append("    loggedInUser: ").append(toIndentedString(loggedInUser)).append("\n");
    sb.append("    defaultForUser: ").append(toIndentedString(defaultForUser)).append("\n");
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

