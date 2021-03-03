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
import com.mypurecloud.sdk.v2.model.DialerRule;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RuleSet
 */

public class RuleSet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DomainEntityRef contactList = null;
  private DomainEntityRef queue = null;
  private List<DialerRule> rules = new ArrayList<DialerRule>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the RuleSet.
   **/
  public RuleSet name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the RuleSet.")
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
  public RuleSet version(Integer version) {
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
   * A ContactList to provide user-interface suggestions for contact columns on relevant conditions and actions.
   **/
  public RuleSet contactList(DomainEntityRef contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A ContactList to provide user-interface suggestions for contact columns on relevant conditions and actions.")
  @JsonProperty("contactList")
  public DomainEntityRef getContactList() {
    return contactList;
  }
  public void setContactList(DomainEntityRef contactList) {
    this.contactList = contactList;
  }

  
  /**
   * A Queue to provide user-interface suggestions for wrap-up codes on relevant conditions and actions.
   **/
  public RuleSet queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Queue to provide user-interface suggestions for wrap-up codes on relevant conditions and actions.")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }

  
  /**
   * The list of rules.
   **/
  public RuleSet rules(List<DialerRule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of rules.")
  @JsonProperty("rules")
  public List<DialerRule> getRules() {
    return rules;
  }
  public void setRules(List<DialerRule> rules) {
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
    RuleSet ruleSet = (RuleSet) o;
    return Objects.equals(this.id, ruleSet.id) &&
        Objects.equals(this.name, ruleSet.name) &&
        Objects.equals(this.dateCreated, ruleSet.dateCreated) &&
        Objects.equals(this.dateModified, ruleSet.dateModified) &&
        Objects.equals(this.version, ruleSet.version) &&
        Objects.equals(this.contactList, ruleSet.contactList) &&
        Objects.equals(this.queue, ruleSet.queue) &&
        Objects.equals(this.rules, ruleSet.rules) &&
        Objects.equals(this.selfUri, ruleSet.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, queue, rules, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

