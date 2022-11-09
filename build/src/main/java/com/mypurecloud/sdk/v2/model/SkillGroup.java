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
import com.mypurecloud.sdk.v2.model.SkillGroupCondition;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SkillGroup
 */

public class SkillGroup  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableDivision division = null;
  private String description = null;
  private Long memberCount = null;
  private Date dateModified = null;
  private Date dateCreated = null;
  private List<SkillGroupCondition> skillConditions = new ArrayList<SkillGroupCondition>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The group name.
   **/
  public SkillGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The group name.")
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
  public SkillGroup division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableDivision division) {
    this.division = division;
  }


  /**
   * Group description
   **/
  public SkillGroup description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "Estimated number of members in this group. It can take some time for the count to be updated after expressions are changed.")
  @JsonProperty("memberCount")
  public Long getMemberCount() {
    return memberCount;
  }


  @ApiModelProperty(example = "null", value = "Last modified date/time of the skill group. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "Created date/time of the skill group. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  /**
   * Conditions for this group
   **/
  public SkillGroup skillConditions(List<SkillGroupCondition> skillConditions) {
    this.skillConditions = skillConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conditions for this group")
  @JsonProperty("skillConditions")
  public List<SkillGroupCondition> getSkillConditions() {
    return skillConditions;
  }
  public void setSkillConditions(List<SkillGroupCondition> skillConditions) {
    this.skillConditions = skillConditions;
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
    SkillGroup skillGroup = (SkillGroup) o;

    return Objects.equals(this.id, skillGroup.id) &&
            Objects.equals(this.name, skillGroup.name) &&
            Objects.equals(this.division, skillGroup.division) &&
            Objects.equals(this.description, skillGroup.description) &&
            Objects.equals(this.memberCount, skillGroup.memberCount) &&
            Objects.equals(this.dateModified, skillGroup.dateModified) &&
            Objects.equals(this.dateCreated, skillGroup.dateCreated) &&
            Objects.equals(this.skillConditions, skillGroup.skillConditions) &&
            Objects.equals(this.selfUri, skillGroup.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, memberCount, dateModified, dateCreated, skillConditions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    skillConditions: ").append(toIndentedString(skillConditions)).append("\n");
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

