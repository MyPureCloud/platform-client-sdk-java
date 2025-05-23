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
import com.mypurecloud.sdk.v2.model.DigitalRule;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DigitalRuleSet
 */

public class DigitalRuleSet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DomainEntityRef contactList = null;
  private List<DigitalRule> rules = null;
  private String selfUri = null;

  public DigitalRuleSet() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rules = new ArrayList<DigitalRule>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DigitalRuleSet name(String name) {
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


  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DigitalRuleSet version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * A ContactList to provide suggestions for contact columns on relevant conditions and actions.
   **/
  public DigitalRuleSet contactList(DomainEntityRef contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A ContactList to provide suggestions for contact columns on relevant conditions and actions.")
  @JsonProperty("contactList")
  public DomainEntityRef getContactList() {
    return contactList;
  }
  public void setContactList(DomainEntityRef contactList) {
    this.contactList = contactList;
  }


  /**
   * The list of rules.
   **/
  public DigitalRuleSet rules(List<DigitalRule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of rules.")
  @JsonProperty("rules")
  public List<DigitalRule> getRules() {
    return rules;
  }
  public void setRules(List<DigitalRule> rules) {
    this.rules = rules;
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
    DigitalRuleSet digitalRuleSet = (DigitalRuleSet) o;

    return Objects.equals(this.id, digitalRuleSet.id) &&
            Objects.equals(this.name, digitalRuleSet.name) &&
            Objects.equals(this.dateCreated, digitalRuleSet.dateCreated) &&
            Objects.equals(this.dateModified, digitalRuleSet.dateModified) &&
            Objects.equals(this.version, digitalRuleSet.version) &&
            Objects.equals(this.contactList, digitalRuleSet.contactList) &&
            Objects.equals(this.rules, digitalRuleSet.rules) &&
            Objects.equals(this.selfUri, digitalRuleSet.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, rules, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalRuleSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

