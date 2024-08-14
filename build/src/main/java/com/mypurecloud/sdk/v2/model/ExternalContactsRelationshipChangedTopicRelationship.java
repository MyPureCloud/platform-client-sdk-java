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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicDivision;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalContactsRelationshipChangedTopicUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ExternalContactsRelationshipChangedTopicRelationship
 */

public class ExternalContactsRelationshipChangedTopicRelationship  implements Serializable {
  
  private String id = null;
  private ExternalContactsRelationshipChangedTopicDivision division = null;
  private ExternalContactsRelationshipChangedTopicUser user = null;
  private ExternalContactsRelationshipChangedTopicExternalOrganization externalOrganization = null;
  private String relationship = null;
  private Date createDate = null;
  private Date modifyDate = null;

  
  /**
   **/
  public ExternalContactsRelationshipChangedTopicRelationship id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicRelationship division(ExternalContactsRelationshipChangedTopicDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ExternalContactsRelationshipChangedTopicDivision getDivision() {
    return division;
  }
  public void setDivision(ExternalContactsRelationshipChangedTopicDivision division) {
    this.division = division;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicRelationship user(ExternalContactsRelationshipChangedTopicUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public ExternalContactsRelationshipChangedTopicUser getUser() {
    return user;
  }
  public void setUser(ExternalContactsRelationshipChangedTopicUser user) {
    this.user = user;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicRelationship externalOrganization(ExternalContactsRelationshipChangedTopicExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public ExternalContactsRelationshipChangedTopicExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalContactsRelationshipChangedTopicExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicRelationship relationship(String relationship) {
    this.relationship = relationship;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relationship")
  public String getRelationship() {
    return relationship;
  }
  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicRelationship createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  /**
   **/
  public ExternalContactsRelationshipChangedTopicRelationship modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsRelationshipChangedTopicRelationship externalContactsRelationshipChangedTopicRelationship = (ExternalContactsRelationshipChangedTopicRelationship) o;

    return Objects.equals(this.id, externalContactsRelationshipChangedTopicRelationship.id) &&
            Objects.equals(this.division, externalContactsRelationshipChangedTopicRelationship.division) &&
            Objects.equals(this.user, externalContactsRelationshipChangedTopicRelationship.user) &&
            Objects.equals(this.externalOrganization, externalContactsRelationshipChangedTopicRelationship.externalOrganization) &&
            Objects.equals(this.relationship, externalContactsRelationshipChangedTopicRelationship.relationship) &&
            Objects.equals(this.createDate, externalContactsRelationshipChangedTopicRelationship.createDate) &&
            Objects.equals(this.modifyDate, externalContactsRelationshipChangedTopicRelationship.modifyDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, user, externalOrganization, relationship, createDate, modifyDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsRelationshipChangedTopicRelationship {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
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

