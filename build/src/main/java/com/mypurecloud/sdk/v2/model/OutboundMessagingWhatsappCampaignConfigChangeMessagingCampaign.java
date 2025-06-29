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
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeContactSort;
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeEmailConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeErrorDetail;
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeSmsConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeUriReference;
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignConfigChangeWhatsAppConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign
 */

public class OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign  implements Serializable {
  

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
  private OutboundMessagingWhatsappCampaignConfigChangeUriReference callableTimeSet = null;
  private OutboundMessagingWhatsappCampaignConfigChangeUriReference contactList = null;
  private List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> dncLists = null;
  private List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> contactListFilters = null;
  private Boolean alwaysRunning = null;
  private List<OutboundMessagingWhatsappCampaignConfigChangeContactSort> contactSorts = null;
  private Long messagesPerMinute = null;
  private List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> ruleSets = null;
  private OutboundMessagingWhatsappCampaignConfigChangeSmsConfig smsConfig = null;
  private OutboundMessagingWhatsappCampaignConfigChangeEmailConfig emailConfig = null;
  private OutboundMessagingWhatsappCampaignConfigChangeWhatsAppConfig whatsAppConfig = null;
  private List<OutboundMessagingWhatsappCampaignConfigChangeErrorDetail> errors = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;
  private OutboundMessagingWhatsappCampaignConfigChangeUriReference division = null;

  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dncLists = new ArrayList<OutboundMessagingWhatsappCampaignConfigChangeUriReference>();
      contactListFilters = new ArrayList<OutboundMessagingWhatsappCampaignConfigChangeUriReference>();
      contactSorts = new ArrayList<OutboundMessagingWhatsappCampaignConfigChangeContactSort>();
      ruleSets = new ArrayList<OutboundMessagingWhatsappCampaignConfigChangeUriReference>();
      errors = new ArrayList<OutboundMessagingWhatsappCampaignConfigChangeErrorDetail>();
    }
  }

  
  /**
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign campaignStatus(CampaignStatusEnum campaignStatus) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign callableTimeSet(OutboundMessagingWhatsappCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callableTimeSet")
  public OutboundMessagingWhatsappCampaignConfigChangeUriReference getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(OutboundMessagingWhatsappCampaignConfigChangeUriReference callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }


  /**
   * A UriReference for a resource
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign contactList(OutboundMessagingWhatsappCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("contactList")
  public OutboundMessagingWhatsappCampaignConfigChangeUriReference getContactList() {
    return contactList;
  }
  public void setContactList(OutboundMessagingWhatsappCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
  }


  /**
   * The dnc lists to check before sending a message for this messaging campaign.
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign dncLists(List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dnc lists to check before sending a message for this messaging campaign.")
  @JsonProperty("dncLists")
  public List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
  }


  /**
   * The contact list filters to check before sending a message for this messaging campaign.
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign contactListFilters(List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact list filters to check before sending a message for this messaging campaign.")
  @JsonProperty("contactListFilters")
  public List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> getContactListFilters() {
    return contactListFilters;
  }
  public void setContactListFilters(List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
  }


  /**
   * Whether this messaging campaign is always running.
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign alwaysRunning(Boolean alwaysRunning) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign contactSorts(List<OutboundMessagingWhatsappCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which to sort contacts for dialing, based on up to four columns.")
  @JsonProperty("contactSorts")
  public List<OutboundMessagingWhatsappCampaignConfigChangeContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<OutboundMessagingWhatsappCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }


  /**
   * How many messages this messaging campaign will send per minute.
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign messagesPerMinute(Long messagesPerMinute) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign ruleSets(List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ruleSets")
  public List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> getRuleSets() {
    return ruleSets;
  }
  public void setRuleSets(List<OutboundMessagingWhatsappCampaignConfigChangeUriReference> ruleSets) {
    this.ruleSets = ruleSets;
  }


  /**
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign smsConfig(OutboundMessagingWhatsappCampaignConfigChangeSmsConfig smsConfig) {
    this.smsConfig = smsConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("smsConfig")
  public OutboundMessagingWhatsappCampaignConfigChangeSmsConfig getSmsConfig() {
    return smsConfig;
  }
  public void setSmsConfig(OutboundMessagingWhatsappCampaignConfigChangeSmsConfig smsConfig) {
    this.smsConfig = smsConfig;
  }


  /**
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign emailConfig(OutboundMessagingWhatsappCampaignConfigChangeEmailConfig emailConfig) {
    this.emailConfig = emailConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailConfig")
  public OutboundMessagingWhatsappCampaignConfigChangeEmailConfig getEmailConfig() {
    return emailConfig;
  }
  public void setEmailConfig(OutboundMessagingWhatsappCampaignConfigChangeEmailConfig emailConfig) {
    this.emailConfig = emailConfig;
  }


  /**
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign whatsAppConfig(OutboundMessagingWhatsappCampaignConfigChangeWhatsAppConfig whatsAppConfig) {
    this.whatsAppConfig = whatsAppConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppConfig")
  public OutboundMessagingWhatsappCampaignConfigChangeWhatsAppConfig getWhatsAppConfig() {
    return whatsAppConfig;
  }
  public void setWhatsAppConfig(OutboundMessagingWhatsappCampaignConfigChangeWhatsAppConfig whatsAppConfig) {
    this.whatsAppConfig = whatsAppConfig;
  }


  /**
   * A list of current error conditions associated with this messaging campaign
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign errors(List<OutboundMessagingWhatsappCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of current error conditions associated with this messaging campaign")
  @JsonProperty("errors")
  public List<OutboundMessagingWhatsappCampaignConfigChangeErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<OutboundMessagingWhatsappCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign id(String id) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign name(String name) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign dateCreated(Date dateCreated) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign dateModified(Date dateModified) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign version(Long version) {
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
  public OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign division(OutboundMessagingWhatsappCampaignConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("division")
  public OutboundMessagingWhatsappCampaignConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(OutboundMessagingWhatsappCampaignConfigChangeUriReference division) {
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
    OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign = (OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign) o;

    return Objects.equals(this.campaignStatus, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.campaignStatus) &&
            Objects.equals(this.callableTimeSet, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.callableTimeSet) &&
            Objects.equals(this.contactList, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.contactList) &&
            Objects.equals(this.dncLists, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.dncLists) &&
            Objects.equals(this.contactListFilters, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.contactListFilters) &&
            Objects.equals(this.alwaysRunning, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.alwaysRunning) &&
            Objects.equals(this.contactSorts, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.contactSorts) &&
            Objects.equals(this.messagesPerMinute, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.messagesPerMinute) &&
            Objects.equals(this.ruleSets, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.ruleSets) &&
            Objects.equals(this.smsConfig, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.smsConfig) &&
            Objects.equals(this.emailConfig, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.emailConfig) &&
            Objects.equals(this.whatsAppConfig, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.whatsAppConfig) &&
            Objects.equals(this.errors, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.errors) &&
            Objects.equals(this.id, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.id) &&
            Objects.equals(this.name, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.name) &&
            Objects.equals(this.dateCreated, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.dateCreated) &&
            Objects.equals(this.dateModified, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.dateModified) &&
            Objects.equals(this.version, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.version) &&
            Objects.equals(this.division, outboundMessagingWhatsappCampaignConfigChangeMessagingCampaign.division);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignStatus, callableTimeSet, contactList, dncLists, contactListFilters, alwaysRunning, contactSorts, messagesPerMinute, ruleSets, smsConfig, emailConfig, whatsAppConfig, errors, id, name, dateCreated, dateModified, version, division);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingWhatsappCampaignConfigChangeMessagingCampaign {\n");
    
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

