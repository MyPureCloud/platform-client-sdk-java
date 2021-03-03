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
import com.mypurecloud.sdk.v2.model.FieldConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FieldConfigs
 */

public class FieldConfigs  implements Serializable {
  
  private FieldConfig org = null;
  private FieldConfig person = null;
  private FieldConfig group = null;
  private FieldConfig externalContact = null;

  
  /**
   **/
  public FieldConfigs org(FieldConfig org) {
    this.org = org;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("org")
  public FieldConfig getOrg() {
    return org;
  }
  public void setOrg(FieldConfig org) {
    this.org = org;
  }

  
  /**
   **/
  public FieldConfigs person(FieldConfig person) {
    this.person = person;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("person")
  public FieldConfig getPerson() {
    return person;
  }
  public void setPerson(FieldConfig person) {
    this.person = person;
  }

  
  /**
   **/
  public FieldConfigs group(FieldConfig group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("group")
  public FieldConfig getGroup() {
    return group;
  }
  public void setGroup(FieldConfig group) {
    this.group = group;
  }

  
  /**
   **/
  public FieldConfigs externalContact(FieldConfig externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public FieldConfig getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(FieldConfig externalContact) {
    this.externalContact = externalContact;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigs fieldConfigs = (FieldConfigs) o;
    return Objects.equals(this.org, fieldConfigs.org) &&
        Objects.equals(this.person, fieldConfigs.person) &&
        Objects.equals(this.group, fieldConfigs.group) &&
        Objects.equals(this.externalContact, fieldConfigs.externalContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, person, group, externalContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigs {\n");
    
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
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

