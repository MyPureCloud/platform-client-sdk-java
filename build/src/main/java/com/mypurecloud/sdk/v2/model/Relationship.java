package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ExternalDataSource;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.WritableStarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Relationship
 */

public class Relationship  implements Serializable {
  
  private String id = null;
  private WritableStarrableDivision division = null;
  private User user = null;
  private ExternalOrganization externalOrganization = null;
  private String relationship = null;
  private List<ExternalDataSource> externalDataSources = null;
  private String selfUri = null;

  public Relationship() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      externalDataSources = new ArrayList<ExternalDataSource>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The division to which this entity belongs.
   **/
  public Relationship division(WritableStarrableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableStarrableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableStarrableDivision division) {
    this.division = division;
  }


  /**
   * The user associated with the external organization. When creating or updating a relationship, only User.id is required. User object is fully populated when expanding a note.
   **/
  public Relationship user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user associated with the external organization. When creating or updating a relationship, only User.id is required. User object is fully populated when expanding a note.")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }


  /**
   * The external organization this relationship is attached to
   **/
  public Relationship externalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external organization this relationship is attached to")
  @JsonProperty("externalOrganization")
  public ExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   * The relationship or role of the user to this external organization.Examples: Account Manager, Sales Engineer, Implementation Consultant
   **/
  public Relationship relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The relationship or role of the user to this external organization.Examples: Account Manager, Sales Engineer, Implementation Consultant")
  @JsonProperty("relationship")
  public String getRelationship() {
    return relationship;
  }
  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  @ApiModelProperty(example = "null", value = "Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param.")
  @JsonProperty("externalDataSources")
  public List<ExternalDataSource> getExternalDataSources() {
    return externalDataSources;
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
    Relationship relationship = (Relationship) o;

    return Objects.equals(this.id, relationship.id) &&
            Objects.equals(this.division, relationship.division) &&
            Objects.equals(this.user, relationship.user) &&
            Objects.equals(this.externalOrganization, relationship.externalOrganization) &&
            Objects.equals(this.relationship, relationship.relationship) &&
            Objects.equals(this.externalDataSources, relationship.externalDataSources) &&
            Objects.equals(this.selfUri, relationship.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, user, externalOrganization, relationship, externalDataSources, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    externalDataSources: ").append(toIndentedString(externalDataSources)).append("\n");
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

