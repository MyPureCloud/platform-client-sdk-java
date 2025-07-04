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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeContactSort;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeEmailConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeErrorDetail;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeSmsConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeUriReference;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign
 */

public class OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign  implements Serializable {
  

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
    INVALID("invalid"),
    FORCED_OFF("forced_off"),
    FORCED_STOPPING("forced_stopping");

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
  private OutboundMessagingMessagingCampaignConfigChangeUriReference callableTimeSet = null;
  private OutboundMessagingMessagingCampaignConfigChangeUriReference contactList = null;
  private List<OutboundMessagingMessagingCampaignConfigChangeUriReference> dncLists = null;
  private List<OutboundMessagingMessagingCampaignConfigChangeUriReference> contactListFilters = null;
  private Boolean alwaysRunning = null;
  private List<OutboundMessagingMessagingCampaignConfigChangeContactSort> contactSorts = null;
  private Long messagesPerMinute = null;
  private List<OutboundMessagingMessagingCampaignConfigChangeUriReference> ruleSets = null;
  private OutboundMessagingMessagingCampaignConfigChangeSmsConfig smsConfig = null;
  private OutboundMessagingMessagingCampaignConfigChangeEmailConfig emailConfig = null;
  private OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig whatsAppConfig = null;
  private List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> errors = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;
  private OutboundMessagingMessagingCampaignConfigChangeUriReference division = null;

  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dncLists = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeUriReference>();
      contactListFilters = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeUriReference>();
      contactSorts = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeContactSort>();
      ruleSets = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeUriReference>();
      errors = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeErrorDetail>();
    }
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign campaignStatus(CampaignStatusEnum campaignStatus) {
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign callableTimeSet(OutboundMessagingMessagingCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callableTimeSet")
  public OutboundMessagingMessagingCampaignConfigChangeUriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(OutboundMessagingMessagingCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }


  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign contactList(OutboundMessagingMessagingCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("contactList")
  public OutboundMessagingMessagingCampaignConfigChangeUriReference getContactList() {
    return contactList;
  }
  public void setContactList(OutboundMessagingMessagingCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
  }


  /**
   * The dnc lists to check before sending a message for this messaging campaign.
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign dncLists(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dnc lists to check before sending a message for this messaging campaign.")
  @JsonProperty("dncLists")
  public List<OutboundMessagingMessagingCampaignConfigChangeUriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
  }


  /**
   * The contact list filters to check before sending a message for this messaging campaign.
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign contactListFilters(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact list filters to check before sending a message for this messaging campaign.")
  @JsonProperty("contactListFilters")
  public List<OutboundMessagingMessagingCampaignConfigChangeUriReference> getContactListFilters() {
    return contactListFilters;
  }
  public void setContactListFilters(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
  }


  /**
   * Whether this messaging campaign is always running.
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign alwaysRunning(Boolean alwaysRunning) {
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign contactSorts(List<OutboundMessagingMessagingCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which to sort contacts for dialing, based on up to four columns.")
  @JsonProperty("contactSorts")
  public List<OutboundMessagingMessagingCampaignConfigChangeContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<OutboundMessagingMessagingCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }


  /**
   * How many messages this messaging campaign will send per minute.
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign messagesPerMinute(Long messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many messages this messaging campaign will send per minute.")
  @JsonProperty("messagesPerMinute")
  public Long getMessagesPerMinute() {
    return messagesPerMinute;
  }
  public void setMessagesPerMinute(Long messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign ruleSets(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleSets")
  public List<OutboundMessagingMessagingCampaignConfigChangeUriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign smsConfig(OutboundMessagingMessagingCampaignConfigChangeSmsConfig smsConfig) {
    this.smsConfig = smsConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("smsConfig")
  public OutboundMessagingMessagingCampaignConfigChangeSmsConfig getSmsConfig() {
    return smsConfig;
  }
  public void setSmsConfig(OutboundMessagingMessagingCampaignConfigChangeSmsConfig smsConfig) {
    this.smsConfig = smsConfig;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign emailConfig(OutboundMessagingMessagingCampaignConfigChangeEmailConfig emailConfig) {
    this.emailConfig = emailConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailConfig")
  public OutboundMessagingMessagingCampaignConfigChangeEmailConfig getEmailConfig() {
    return emailConfig;
  }
  public void setEmailConfig(OutboundMessagingMessagingCampaignConfigChangeEmailConfig emailConfig) {
    this.emailConfig = emailConfig;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign whatsAppConfig(OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig whatsAppConfig) {
    this.whatsAppConfig = whatsAppConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppConfig")
  public OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig getWhatsAppConfig() {
    return whatsAppConfig;
  }
  public void setWhatsAppConfig(OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig whatsAppConfig) {
    this.whatsAppConfig = whatsAppConfig;
  }


  /**
   * A list of current error conditions associated with this messaging campaign
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign errors(List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of current error conditions associated with this messaging campaign")
  @JsonProperty("errors")
  public List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign id(String id) {
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign name(String name) {
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign dateCreated(Date dateCreated) {
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign dateModified(Date dateModified) {
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign division(OutboundMessagingMessagingCampaignConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("division")
  public OutboundMessagingMessagingCampaignConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(OutboundMessagingMessagingCampaignConfigChangeUriReference division) {
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
    OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign outboundMessagingMessagingCampaignConfigChangeMessagingCampaign = (OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign) o;

    return Objects.equals(this.campaignStatus, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.campaignStatus) &&
            Objects.equals(this.callableTimeSet, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.callableTimeSet) &&
            Objects.equals(this.contactList, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.contactList) &&
            Objects.equals(this.dncLists, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.dncLists) &&
            Objects.equals(this.contactListFilters, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.contactListFilters) &&
            Objects.equals(this.alwaysRunning, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.alwaysRunning) &&
            Objects.equals(this.contactSorts, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.contactSorts) &&
            Objects.equals(this.messagesPerMinute, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.messagesPerMinute) &&
            Objects.equals(this.ruleSets, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.ruleSets) &&
            Objects.equals(this.smsConfig, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.smsConfig) &&
            Objects.equals(this.emailConfig, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.emailConfig) &&
            Objects.equals(this.whatsAppConfig, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.whatsAppConfig) &&
            Objects.equals(this.errors, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.errors) &&
            Objects.equals(this.id, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.id) &&
            Objects.equals(this.name, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.name) &&
            Objects.equals(this.dateCreated, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.dateCreated) &&
            Objects.equals(this.dateModified, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.dateModified) &&
            Objects.equals(this.version, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.version) &&
            Objects.equals(this.division, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.division);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignStatus, callableTimeSet, contactList, dncLists, contactListFilters, alwaysRunning, contactSorts, messagesPerMinute, ruleSets, smsConfig, emailConfig, whatsAppConfig, errors, id, name, dateCreated, dateModified, version, division);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign {\n");
    
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
    sb.append("    whatsAppConfig: ").append(toIndentedString(whatsAppConfig)).append("\n");
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

