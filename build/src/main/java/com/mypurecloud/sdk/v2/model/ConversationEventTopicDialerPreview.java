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
import com.mypurecloud.sdk.v2.model.ConversationEventTopicPhoneNumberColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationEventTopicDialerPreview
 */

public class ConversationEventTopicDialerPreview  implements Serializable {
  
  private String id = null;
  private String contactId = null;
  private String contactListId = null;
  private String campaignId = null;
  private List<ConversationEventTopicPhoneNumberColumn> phoneNumberColumns = new ArrayList<ConversationEventTopicPhoneNumberColumn>();
  private Object additionalProperties = null;

  
  /**
   **/
  public ConversationEventTopicDialerPreview id(String id) {
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
  public ConversationEventTopicDialerPreview contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactId")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  
  /**
   **/
  public ConversationEventTopicDialerPreview contactListId(String contactListId) {
    this.contactListId = contactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactListId")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }

  
  /**
   **/
  public ConversationEventTopicDialerPreview campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaignId")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  
  /**
   **/
  public ConversationEventTopicDialerPreview phoneNumberColumns(List<ConversationEventTopicPhoneNumberColumn> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneNumberColumns")
  public List<ConversationEventTopicPhoneNumberColumn> getPhoneNumberColumns() {
    return phoneNumberColumns;
  }
  public void setPhoneNumberColumns(List<ConversationEventTopicPhoneNumberColumn> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
  }

  
  /**
   **/
  public ConversationEventTopicDialerPreview additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventTopicDialerPreview conversationEventTopicDialerPreview = (ConversationEventTopicDialerPreview) o;
    return Objects.equals(this.id, conversationEventTopicDialerPreview.id) &&
        Objects.equals(this.contactId, conversationEventTopicDialerPreview.contactId) &&
        Objects.equals(this.contactListId, conversationEventTopicDialerPreview.contactListId) &&
        Objects.equals(this.campaignId, conversationEventTopicDialerPreview.campaignId) &&
        Objects.equals(this.phoneNumberColumns, conversationEventTopicDialerPreview.phoneNumberColumns) &&
        Objects.equals(this.additionalProperties, conversationEventTopicDialerPreview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactId, contactListId, campaignId, phoneNumberColumns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicDialerPreview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    phoneNumberColumns: ").append(toIndentedString(phoneNumberColumns)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

