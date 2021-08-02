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
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeContactSort;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeEmailConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeErrorDetail;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeSmsConfig;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeUriReference;
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
  
  private String id = null;
  private OutboundMessagingMessagingCampaignConfigChangeUriReference division = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;

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
    ON("ON"),
    OFF("OFF"),
    COMPLETE("COMPLETE"),
    STOPPING("STOPPING"),
    INVALID("INVALID");

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
  private List<OutboundMessagingMessagingCampaignConfigChangeUriReference> dncLists = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeUriReference>();
  private List<OutboundMessagingMessagingCampaignConfigChangeUriReference> contactListFilters = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeUriReference>();
  private Boolean alwaysRunning = null;
  private List<OutboundMessagingMessagingCampaignConfigChangeContactSort> contactSorts = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeContactSort>();
  private Integer messagesPerMinute = null;
  private OutboundMessagingMessagingCampaignConfigChangeSmsConfig smsConfig = null;
  private OutboundMessagingMessagingCampaignConfigChangeEmailConfig emailConfig = null;
  private List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> errors = new ArrayList<OutboundMessagingMessagingCampaignConfigChangeErrorDetail>();

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign id(String id) {
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign division(OutboundMessagingMessagingCampaignConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public OutboundMessagingMessagingCampaignConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(OutboundMessagingMessagingCampaignConfigChangeUriReference division) {
    this.division = division;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign name(String name) {
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

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign contactList(OutboundMessagingMessagingCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactList")
  public OutboundMessagingMessagingCampaignConfigChangeUriReference getContactList() {
    return contactList;
  }
  public void setContactList(OutboundMessagingMessagingCampaignConfigChangeUriReference contactList) {
    this.contactList = contactList;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign dncLists(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dncLists")
  public List<OutboundMessagingMessagingCampaignConfigChangeUriReference> getDncLists() {
    return dncLists;
  }
  public void setDncLists(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> dncLists) {
    this.dncLists = dncLists;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign contactListFilters(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactListFilters")
  public List<OutboundMessagingMessagingCampaignConfigChangeUriReference> getContactListFilters() {
    return contactListFilters;
  }
  public void setContactListFilters(List<OutboundMessagingMessagingCampaignConfigChangeUriReference> contactListFilters) {
    this.contactListFilters = contactListFilters;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign alwaysRunning(Boolean alwaysRunning) {
    this.alwaysRunning = alwaysRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alwaysRunning")
  public Boolean getAlwaysRunning() {
    return alwaysRunning;
  }
  public void setAlwaysRunning(Boolean alwaysRunning) {
    this.alwaysRunning = alwaysRunning;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign contactSorts(List<OutboundMessagingMessagingCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactSorts")
  public List<OutboundMessagingMessagingCampaignConfigChangeContactSort> getContactSorts() {
    return contactSorts;
  }
  public void setContactSorts(List<OutboundMessagingMessagingCampaignConfigChangeContactSort> contactSorts) {
    this.contactSorts = contactSorts;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign messagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messagesPerMinute")
  public Integer getMessagesPerMinute() {
    return messagesPerMinute;
  }
  public void setMessagesPerMinute(Integer messagesPerMinute) {
    this.messagesPerMinute = messagesPerMinute;
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
  public OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign errors(List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> getErrors() {
    return errors;
  }
  public void setErrors(List<OutboundMessagingMessagingCampaignConfigChangeErrorDetail> errors) {
    this.errors = errors;
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
    return Objects.equals(this.id, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.id) &&
        Objects.equals(this.division, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.division) &&
        Objects.equals(this.name, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.name) &&
        Objects.equals(this.dateCreated, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.dateCreated) &&
        Objects.equals(this.dateModified, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.dateModified) &&
        Objects.equals(this.version, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.version) &&
        Objects.equals(this.campaignStatus, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.campaignStatus) &&
        Objects.equals(this.callableTimeSet, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.callableTimeSet) &&
        Objects.equals(this.contactList, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.contactList) &&
        Objects.equals(this.dncLists, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.dncLists) &&
        Objects.equals(this.contactListFilters, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.contactListFilters) &&
        Objects.equals(this.alwaysRunning, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.alwaysRunning) &&
        Objects.equals(this.contactSorts, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.contactSorts) &&
        Objects.equals(this.messagesPerMinute, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.messagesPerMinute) &&
        Objects.equals(this.smsConfig, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.smsConfig) &&
        Objects.equals(this.emailConfig, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.emailConfig) &&
        Objects.equals(this.errors, outboundMessagingMessagingCampaignConfigChangeMessagingCampaign.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, name, dateCreated, dateModified, version, campaignStatus, callableTimeSet, contactList, dncLists, contactListFilters, alwaysRunning, contactSorts, messagesPerMinute, smsConfig, emailConfig, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeMessagingCampaign {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    callableTimeSet: ").append(toIndentedString(callableTimeSet)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    dncLists: ").append(toIndentedString(dncLists)).append("\n");
    sb.append("    contactListFilters: ").append(toIndentedString(contactListFilters)).append("\n");
    sb.append("    alwaysRunning: ").append(toIndentedString(alwaysRunning)).append("\n");
    sb.append("    contactSorts: ").append(toIndentedString(contactSorts)).append("\n");
    sb.append("    messagesPerMinute: ").append(toIndentedString(messagesPerMinute)).append("\n");
    sb.append("    smsConfig: ").append(toIndentedString(smsConfig)).append("\n");
    sb.append("    emailConfig: ").append(toIndentedString(emailConfig)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

