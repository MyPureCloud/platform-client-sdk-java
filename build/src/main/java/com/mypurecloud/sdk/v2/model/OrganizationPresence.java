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
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OrganizationPresence
 */

public class OrganizationPresence  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Map<String, String> languageLabels = null;
  private String systemPresence = null;
  private Boolean deactivated = null;
  private Boolean primary = null;
  private User createdBy = null;
  private Date createdDate = null;
  private User modifiedBy = null;
  private Date modifiedDate = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public OrganizationPresence name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The label used for the system presence in each specified language
   **/
  public OrganizationPresence languageLabels(Map<String, String> languageLabels) {
    this.languageLabels = languageLabels;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label used for the system presence in each specified language")
  @JsonProperty("languageLabels")
  public Map<String, String> getLanguageLabels() {
    return languageLabels;
  }
  public void setLanguageLabels(Map<String, String> languageLabels) {
    this.languageLabels = languageLabels;
  }

  
  /**
   **/
  public OrganizationPresence systemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("systemPresence")
  public String getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
  }

  
  /**
   **/
  public OrganizationPresence deactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deactivated")
  public Boolean getDeactivated() {
    return deactivated;
  }
  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
  }

  
  /**
   **/
  public OrganizationPresence primary(Boolean primary) {
    this.primary = primary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  
  /**
   **/
  public OrganizationPresence createdBy(User createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OrganizationPresence createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   **/
  public OrganizationPresence modifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public User getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OrganizationPresence modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
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
    OrganizationPresence organizationPresence = (OrganizationPresence) o;
    return Objects.equals(this.id, organizationPresence.id) &&
        Objects.equals(this.name, organizationPresence.name) &&
        Objects.equals(this.languageLabels, organizationPresence.languageLabels) &&
        Objects.equals(this.systemPresence, organizationPresence.systemPresence) &&
        Objects.equals(this.deactivated, organizationPresence.deactivated) &&
        Objects.equals(this.primary, organizationPresence.primary) &&
        Objects.equals(this.createdBy, organizationPresence.createdBy) &&
        Objects.equals(this.createdDate, organizationPresence.createdDate) &&
        Objects.equals(this.modifiedBy, organizationPresence.modifiedBy) &&
        Objects.equals(this.modifiedDate, organizationPresence.modifiedDate) &&
        Objects.equals(this.selfUri, organizationPresence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, languageLabels, systemPresence, deactivated, primary, createdBy, createdDate, modifiedBy, modifiedDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPresence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    languageLabels: ").append(toIndentedString(languageLabels)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

