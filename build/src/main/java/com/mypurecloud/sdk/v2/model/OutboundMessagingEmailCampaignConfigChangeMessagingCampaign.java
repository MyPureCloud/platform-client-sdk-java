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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeContactSort;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeEmailConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeErrorDetail;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeSmsConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OutboundMessagingEmailCampaignConfigChangeMessagingCampaign
 */

public class OutboundMessagingEmailCampaignConfigChangeMessagingCampaign  implements Serializable {
  

  private static class CampaignStatusEnumDeserializer extends StdDeserializer<CampaignStatusEnum> {
    public CampaignStatusEnumDeserializer() {
      super(CampaignStatusEnumDeserializer.class);
    }

    @Override
    public CampaignStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CampaignStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets campaignStatus
   */
 @JsonDeserialize(using = CampaignStatusEnumDeserializer.class)
  public enum CampaignStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("on"),
    OFF("off"),
    COMPLETE("complete"),
    STOPPING("stopping"),
    INVALID("invalid");

    private String value;

    CampaignStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CampaignStatusEnum fromString(String key) {
      if (key == null) return null;

      for (CampaignStatusEnum value : CampaignStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CampaignStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CampaignStatusEnum campaignStatus = null;
  private OutboundMessagingEmailCampaignConfigChangeUriReference callableTimeSet = null;
  private OutboundMessagingEmailCampaignConfigChangeUriReference contactList = null;
  private List<OutboundMessagingEmailCampaignConfigChangeUriReference> dncLists = new ArrayList<OutboundMessagingEmailCampaignConfigChangeUriReference>();
  private List<OutboundMessagingEmailCampaignConfigChangeUriReference> contactListFilters = new ArrayList<OutboundMessagingEmailCampaignConfigChangeUriReference>();
  private Boolean alwaysRunning = null;
  private List<OutboundMessagingEmailCampaignConfigChangeContactSort> contactSorts = new ArrayList<OutboundMessagingEmailCampaignConfigChangeContactSort>();
  private Integer messagesPerMinute = null;
  private List<OutboundMessagingEmailCampaignConfigChangeUriReference> ruleSets = new ArrayList<OutboundMessagingEmailCampaignConfigChangeUriReference>();
  private OutboundMessagingEmailCampaignConfigChangeSmsConfig smsConfig = null;
  private OutboundMessagingEmailCampaignConfigChangeEmailConfig emailConfig = null;
  private List<OutboundMessagingEmailCampaignConfigChangeErrorDetail> errors = new ArrayList<OutboundMessagingEmailCampaignConfigChangeErrorDetail>();
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private OutboundMessagingEmailCampaignConfigChangeUriReference division = null;

  
  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign campaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignStatus")
  public CampaignStatusEnum getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign callableTimeSet(OutboundMessagingEmailCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callableTimeSet")
  public OutboundMessagingEmailCampaignConfigChangeUriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(OutboundMessagingEmailCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }


  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign contactList(OutboundMessagingEmailCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("contactList")
  public OutboundMessagingEmailCampaignConfigChangeUriReference getContactList() {
    return contactList;
  }
  public void setContactList(OutboundMessagingEmailCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
  }


  /**
   * The dnc lists to check before sending a message for this messaging campaign.
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign dncLists(List<OutboundMessagingEmailCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dnc lists to check before sending a message for this messaging campaign.")
  @JsonProperty("dncLists")
  public List<OutboundMessagingEmailCampaignConfigChangeUriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<OutboundMessagingEmailCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
  }


  /**
   * The contact list filters to check before sending a message for this messaging campaign.
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign contactListFilters(List<OutboundMessagingEmailCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact list filters to check before sending a message for this messaging campaign.")
  @JsonProperty("contactListFilters")
  public List<OutboundMessagingEmailCampaignConfigChangeUriReference> getContactListFilters() {
    return contactListFilters;
  }
  public void setContactListFilters(List<OutboundMessagingEmailCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
  }


  /**
   * Whether this messaging campaign is always running.
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign alwaysRunning(Boolean alwaysRunning) {
    this.alwaysRunning = alwaysRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this messaging campaign is always running.")
  @JsonProperty("alwaysRunning")
  public Boolean getAlwaysRunning() {
    return alwaysRunning;
  }
  public void setAlwaysRunning(Boolean alwaysRunning) {
    this.alwaysRunning = alwaysRunning;
  }


  /**
   * The order in which to sort contacts for dialing, based on up to four columns.
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign contactSorts(List<OutboundMessagingEmailCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which to sort contacts for dialing, based on up to four columns.")
  @JsonProperty("contactSorts")
  public List<OutboundMessagingEmailCampaignConfigChangeContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<OutboundMessagingEmailCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }


  /**
   * How many messages this messaging campaign will send per minute.
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign messagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many messages this messaging campaign will send per minute.")
  @JsonProperty("messagesPerMinute")
  public Integer getMessagesPerMinute() {
    return messagesPerMinute;
  }
  public void setMessagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign ruleSets(List<OutboundMessagingEmailCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleSets")
  public List<OutboundMessagingEmailCampaignConfigChangeUriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<OutboundMessagingEmailCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign smsConfig(OutboundMessagingEmailCampaignConfigChangeSmsConfig smsConfig) {
    this.smsConfig = smsConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("smsConfig")
  public OutboundMessagingEmailCampaignConfigChangeSmsConfig getSmsConfig() {
    return smsConfig;
  }
  public void setSmsConfig(OutboundMessagingEmailCampaignConfigChangeSmsConfig smsConfig) {
    this.smsConfig = smsConfig;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign emailConfig(OutboundMessagingEmailCampaignConfigChangeEmailConfig emailConfig) {
    this.emailConfig = emailConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailConfig")
  public OutboundMessagingEmailCampaignConfigChangeEmailConfig getEmailConfig() {
    return emailConfig;
  }
  public void setEmailConfig(OutboundMessagingEmailCampaignConfigChangeEmailConfig emailConfig) {
    this.emailConfig = emailConfig;
  }


  /**
   * A list of current error conditions associated with this messaging campaign
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign errors(List<OutboundMessagingEmailCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of current error conditions associated with this messaging campaign")
  @JsonProperty("errors")
  public List<OutboundMessagingEmailCampaignConfigChangeErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<OutboundMessagingEmailCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign id(String id) {
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
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign name(String name) {
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
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign dateCreated(Date dateCreated) {
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
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign dateModified(Date dateModified) {
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
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign version(Integer version) {
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
   * A UriReference for a resource
   **/
  public OutboundMessagingEmailCampaignConfigChangeMessagingCampaign division(OutboundMessagingEmailCampaignConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("division")
  public OutboundMessagingEmailCampaignConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(OutboundMessagingEmailCampaignConfigChangeUriReference division) {
    this.division = division;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingEmailCampaignConfigChangeMessagingCampaign outboundMessagingEmailCampaignConfigChangeMessagingCampaign = (OutboundMessagingEmailCampaignConfigChangeMessagingCampaign) o;

    return Objects.equals(this.campaignStatus, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.campaignStatus) &&
            Objects.equals(this.callableTimeSet, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.callableTimeSet) &&
            Objects.equals(this.contactList, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.contactList) &&
            Objects.equals(this.dncLists, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.dncLists) &&
            Objects.equals(this.contactListFilters, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.contactListFilters) &&
            Objects.equals(this.alwaysRunning, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.alwaysRunning) &&
            Objects.equals(this.contactSorts, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.contactSorts) &&
            Objects.equals(this.messagesPerMinute, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.messagesPerMinute) &&
            Objects.equals(this.ruleSets, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.ruleSets) &&
            Objects.equals(this.smsConfig, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.smsConfig) &&
            Objects.equals(this.emailConfig, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.emailConfig) &&
            Objects.equals(this.errors, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.errors) &&
            Objects.equals(this.id, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.id) &&
            Objects.equals(this.name, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.name) &&
            Objects.equals(this.dateCreated, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.dateCreated) &&
            Objects.equals(this.dateModified, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.dateModified) &&
            Objects.equals(this.version, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.version) &&
            Objects.equals(this.division, outboundMessagingEmailCampaignConfigChangeMessagingCampaign.division);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignStatus, callableTimeSet, contactList, dncLists, contactListFilters, alwaysRunning, contactSorts, messagesPerMinute, ruleSets, smsConfig, emailConfig, errors, id, name, dateCreated, dateModified, version, division);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingEmailCampaignConfigChangeMessagingCampaign {\n");
    
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    callableTimeSet: ").append(toIndentedString(callableTimeSet)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    dncLists: ").append(toIndentedString(dncLists)).append("\n");
    sb.append("    contactListFilters: ").append(toIndentedString(contactListFilters)).append("\n");
    sb.append("    alwaysRunning: ").append(toIndentedString(alwaysRunning)).append("\n");
    sb.append("    contactSorts: ").append(toIndentedString(contactSorts)).append("\n");
    sb.append("    messagesPerMinute: ").append(toIndentedString(messagesPerMinute)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
    sb.append("    smsConfig: ").append(toIndentedString(smsConfig)).append("\n");
    sb.append("    emailConfig: ").append(toIndentedString(emailConfig)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
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

