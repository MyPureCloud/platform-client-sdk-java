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
import com.mypurecloud.sdk.v2.model.DialerRulesetConfigChangeRule;
import com.mypurecloud.sdk.v2.model.DialerRulesetConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerRulesetConfigChangeRuleSet
 */

public class DialerRulesetConfigChangeRuleSet  implements Serializable {
  
  private DialerRulesetConfigChangeUriReference contactList = null;
  private DialerRulesetConfigChangeUriReference queue = null;
  private List<DialerRulesetConfigChangeRule> rules = new ArrayList<DialerRulesetConfigChangeRule>();
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;

  
  /**
   **/
  public DialerRulesetConfigChangeRuleSet contactList(DialerRulesetConfigChangeUriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactList")
  public DialerRulesetConfigChangeUriReference getContactList() {
    return contactList;
  }
  public void setContactList(DialerRulesetConfigChangeUriReference contactList) {
    this.contactList = contactList;
  }


  /**
   * A UriReference for a resource
   **/
  public DialerRulesetConfigChangeRuleSet queue(DialerRulesetConfigChangeUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("queue")
  public DialerRulesetConfigChangeUriReference getQueue() {
    return queue;
  }
  public void setQueue(DialerRulesetConfigChangeUriReference queue) {
    this.queue = queue;
  }


  /**
   **/
  public DialerRulesetConfigChangeRuleSet rules(List<DialerRulesetConfigChangeRule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rules")
  public List<DialerRulesetConfigChangeRule> getRules() {
    return rules;
  }
  public void setRules(List<DialerRulesetConfigChangeRule> rules) {
    this.rules = rules;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerRulesetConfigChangeRuleSet id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The UI-visible name of the object
   **/
  public DialerRulesetConfigChangeRuleSet name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI-visible name of the object")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation time of the entity
   **/
  public DialerRulesetConfigChangeRuleSet dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation time of the entity")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Last modified time of the entity
   **/
  public DialerRulesetConfigChangeRuleSet dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DialerRulesetConfigChangeRuleSet version(Integer version) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerRulesetConfigChangeRuleSet dialerRulesetConfigChangeRuleSet = (DialerRulesetConfigChangeRuleSet) o;

    return Objects.equals(this.contactList, dialerRulesetConfigChangeRuleSet.contactList) &&
            Objects.equals(this.queue, dialerRulesetConfigChangeRuleSet.queue) &&
            Objects.equals(this.rules, dialerRulesetConfigChangeRuleSet.rules) &&
            Objects.equals(this.id, dialerRulesetConfigChangeRuleSet.id) &&
            Objects.equals(this.name, dialerRulesetConfigChangeRuleSet.name) &&
            Objects.equals(this.dateCreated, dialerRulesetConfigChangeRuleSet.dateCreated) &&
            Objects.equals(this.dateModified, dialerRulesetConfigChangeRuleSet.dateModified) &&
            Objects.equals(this.version, dialerRulesetConfigChangeRuleSet.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactList, queue, rules, id, name, dateCreated, dateModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeRuleSet {\n");
    
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

