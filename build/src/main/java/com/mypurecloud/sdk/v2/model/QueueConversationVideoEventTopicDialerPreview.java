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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicPhoneNumberColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The preview data to be used when this callback is a Preview.
 */
@ApiModel(description = "The preview data to be used when this callback is a Preview.")

public class QueueConversationVideoEventTopicDialerPreview  implements Serializable {
  
  private String id = null;
  private String contactId = null;
  private String contactListId = null;
  private String campaignId = null;
  private List<QueueConversationVideoEventTopicPhoneNumberColumn> phoneNumberColumns = null;

  public QueueConversationVideoEventTopicDialerPreview() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      phoneNumberColumns = new ArrayList<QueueConversationVideoEventTopicPhoneNumberColumn>();
    }
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicDialerPreview id(String id) {
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
   * The contact associated with this preview data pop
   **/
  public QueueConversationVideoEventTopicDialerPreview contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact associated with this preview data pop")
  @JsonProperty("contactId")
  public String getContactId() {
    return contactId;
  }
  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  /**
   * The contactList associated with this preview data pop.
   **/
  public QueueConversationVideoEventTopicDialerPreview contactListId(String contactListId) {
    this.contactListId = contactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contactList associated with this preview data pop.")
  @JsonProperty("contactListId")
  public String getContactListId() {
    return contactListId;
  }
  public void setContactListId(String contactListId) {
    this.contactListId = contactListId;
  }


  /**
   * The campaignId associated with this preview data pop.
   **/
  public QueueConversationVideoEventTopicDialerPreview campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The campaignId associated with this preview data pop.")
  @JsonProperty("campaignId")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  /**
   * The phone number columns associated with this campaign
   **/
  public QueueConversationVideoEventTopicDialerPreview phoneNumberColumns(List<QueueConversationVideoEventTopicPhoneNumberColumn> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The phone number columns associated with this campaign")
  @JsonProperty("phoneNumberColumns")
  public List<QueueConversationVideoEventTopicPhoneNumberColumn> getPhoneNumberColumns() {
    return phoneNumberColumns;
  }
  public void setPhoneNumberColumns(List<QueueConversationVideoEventTopicPhoneNumberColumn> phoneNumberColumns) {
    this.phoneNumberColumns = phoneNumberColumns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationVideoEventTopicDialerPreview queueConversationVideoEventTopicDialerPreview = (QueueConversationVideoEventTopicDialerPreview) o;

    return Objects.equals(this.id, queueConversationVideoEventTopicDialerPreview.id) &&
            Objects.equals(this.contactId, queueConversationVideoEventTopicDialerPreview.contactId) &&
            Objects.equals(this.contactListId, queueConversationVideoEventTopicDialerPreview.contactListId) &&
            Objects.equals(this.campaignId, queueConversationVideoEventTopicDialerPreview.campaignId) &&
            Objects.equals(this.phoneNumberColumns, queueConversationVideoEventTopicDialerPreview.phoneNumberColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contactId, contactListId, campaignId, phoneNumberColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicDialerPreview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactListId: ").append(toIndentedString(contactListId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    phoneNumberColumns: ").append(toIndentedString(phoneNumberColumns)).append("\n");
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

