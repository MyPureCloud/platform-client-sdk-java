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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContactSort;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.RestErrorDetail;
import com.mypurecloud.sdk.v2.model.SmsConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * MessagingCampaign
 */

public class MessagingCampaign  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DomainEntityRef division = null;

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
   * The current status of the messaging campaign. A messaging campaign may be turned 'on' or 'off'.
   */
 @JsonDeserialize(using = CampaignStatusEnumDeserializer.class)
  public enum CampaignStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ON("on"),
    STOPPING("stopping"),
    OFF("off"),
    COMPLETE("complete"),
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
  private DomainEntityRef callableTimeSet = null;
  private DomainEntityRef contactList = null;
  private List<DomainEntityRef> dncLists = new ArrayList<DomainEntityRef>();
  private Boolean alwaysRunning = null;
  private List<ContactSort> contactSorts = new ArrayList<ContactSort>();
  private Integer messagesPerMinute = null;
  private List<RestErrorDetail> errors = new ArrayList<RestErrorDetail>();
  private SmsConfig smsConfig = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public MessagingCampaign name(String name) {
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
  public MessagingCampaign version(Integer version) {
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
   * The division this entity belongs to.
   **/
  public MessagingCampaign division(DomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division this entity belongs to.")
  @JsonProperty("division")
  public DomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(DomainEntityRef division) {
    this.division = division;
  }

  
  /**
   * The current status of the messaging campaign. A messaging campaign may be turned 'on' or 'off'.
   **/
  public MessagingCampaign campaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current status of the messaging campaign. A messaging campaign may be turned 'on' or 'off'.")
  @JsonProperty("campaignStatus")
  public CampaignStatusEnum getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(CampaignStatusEnum campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  
  /**
   * The callable time set for this messaging campaign.
   **/
  public MessagingCampaign callableTimeSet(DomainEntityRef callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The callable time set for this messaging campaign.")
  @JsonProperty("callableTimeSet")
  public DomainEntityRef getCallableTimeSet() {
    return callableTimeSet;
  }
  public void setCallableTimeSet(DomainEntityRef callableTimeSet) {
    this.callableTimeSet = callableTimeSet;
  }

  
  /**
   * The contact list that this messaging campaign will send messages for.
   **/
  public MessagingCampaign contactList(DomainEntityRef contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The contact list that this messaging campaign will send messages for.")
  @JsonProperty("contactList")
  public DomainEntityRef getContactList() {
    return contactList;
  }
  public void setContactList(DomainEntityRef contactList) {
    this.contactList = contactList;
  }

  
  /**
   * The dnc lists to check before sending a message for this messaging campaign.
   **/
  public MessagingCampaign dncLists(List<DomainEntityRef> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dnc lists to check before sending a message for this messaging campaign.")
  @JsonProperty("dncLists")
  public List<DomainEntityRef> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<DomainEntityRef> dncLists) {
    this.dncLists = dncLists;
  }

  
  /**
   * Whether this messaging campaign is always running
   **/
  public MessagingCampaign alwaysRunning(Boolean alwaysRunning) {
    this.alwaysRunning = alwaysRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this messaging campaign is always running")
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
  public MessagingCampaign contactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which to sort contacts for dialing, based on up to four columns.")
  @JsonProperty("contactSorts")
  public List<ContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<ContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }

  
  /**
   * How many messages this messaging campaign will send per minute.
   **/
  public MessagingCampaign messagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "How many messages this messaging campaign will send per minute.")
  @JsonProperty("messagesPerMinute")
  public Integer getMessagesPerMinute() {
    return messagesPerMinute;
  }
  public void setMessagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
  }

  
  /**
   * A list of current error conditions associated with this messaging campaign.
   **/
  public MessagingCampaign errors(List<RestErrorDetail> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of current error conditions associated with this messaging campaign.")
  @JsonProperty("errors")
  public List<RestErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<RestErrorDetail> errors) {
    this.errors = errors;
  }

  
  /**
   * Configuration for this messaging campaign to send SMS messages.
   **/
  public MessagingCampaign smsConfig(SmsConfig smsConfig) {
    this.smsConfig = smsConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration for this messaging campaign to send SMS messages.")
  @JsonProperty("smsConfig")
  public SmsConfig getSmsConfig() {
    return smsConfig;
  }
  public void setSmsConfig(SmsConfig smsConfig) {
    this.smsConfig = smsConfig;
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
    MessagingCampaign messagingCampaign = (MessagingCampaign) o;
    return Objects.equals(this.id, messagingCampaign.id) &&
        Objects.equals(this.name, messagingCampaign.name) &&
        Objects.equals(this.dateCreated, messagingCampaign.dateCreated) &&
        Objects.equals(this.dateModified, messagingCampaign.dateModified) &&
        Objects.equals(this.version, messagingCampaign.version) &&
        Objects.equals(this.division, messagingCampaign.division) &&
        Objects.equals(this.campaignStatus, messagingCampaign.campaignStatus) &&
        Objects.equals(this.callableTimeSet, messagingCampaign.callableTimeSet) &&
        Objects.equals(this.contactList, messagingCampaign.contactList) &&
        Objects.equals(this.dncLists, messagingCampaign.dncLists) &&
        Objects.equals(this.alwaysRunning, messagingCampaign.alwaysRunning) &&
        Objects.equals(this.contactSorts, messagingCampaign.contactSorts) &&
        Objects.equals(this.messagesPerMinute, messagingCampaign.messagesPerMinute) &&
        Objects.equals(this.errors, messagingCampaign.errors) &&
        Objects.equals(this.smsConfig, messagingCampaign.smsConfig) &&
        Objects.equals(this.selfUri, messagingCampaign.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, division, campaignStatus, callableTimeSet, contactList, dncLists, alwaysRunning, contactSorts, messagesPerMinute, errors, smsConfig, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingCampaign {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    callableTimeSet: ").append(toIndentedString(callableTimeSet)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    dncLists: ").append(toIndentedString(dncLists)).append("\n");
    sb.append("    alwaysRunning: ").append(toIndentedString(alwaysRunning)).append("\n");
    sb.append("    contactSorts: ").append(toIndentedString(contactSorts)).append("\n");
    sb.append("    messagesPerMinute: ").append(toIndentedString(messagesPerMinute)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    smsConfig: ").append(toIndentedString(smsConfig)).append("\n");
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

