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
import com.mypurecloud.sdk.v2.model.ConversationContentIntroduction;
import com.mypurecloud.sdk.v2.model.ConversationContentReceivedReplyMessage;
import com.mypurecloud.sdk.v2.model.ConversationFormPage;
import com.mypurecloud.sdk.v2.model.ConversationFormResponseComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Form content object.
 */
@ApiModel(description = "Form content object.")

public class ConversationContentForm  implements Serializable {
  
  private ConversationContentIntroduction introduction = null;
  private List<ConversationFormPage> formPages = null;
  private ConversationContentReceivedReplyMessage receivedMessage = null;
  private ConversationContentReceivedReplyMessage replyMessage = null;
  private Boolean showSummary = null;
  private List<ConversationFormResponseComponent> response = null;
  private String originatingMessageId = null;
  private String cannedResponseId = null;

  public ConversationContentForm() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      formPages = new ArrayList<ConversationFormPage>();
      response = new ArrayList<ConversationFormResponseComponent>();
    }
  }

  
  /**
   * The intro component, used to give an intro into what the form entails
   **/
  public ConversationContentForm introduction(ConversationContentIntroduction introduction) {
    this.introduction = introduction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intro component, used to give an intro into what the form entails")
  @JsonProperty("introduction")
  public ConversationContentIntroduction getIntroduction() {
    return introduction;
  }
  public void setIntroduction(ConversationContentIntroduction introduction) {
    this.introduction = introduction;
  }


  /**
   * Form pages
   **/
  public ConversationContentForm formPages(List<ConversationFormPage> formPages) {
    this.formPages = formPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Form pages")
  @JsonProperty("formPages")
  public List<ConversationFormPage> getFormPages() {
    return formPages;
  }
  public void setFormPages(List<ConversationFormPage> formPages) {
    this.formPages = formPages;
  }


  /**
   * The message prompt to fill out the form received.
   **/
  public ConversationContentForm receivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message prompt to fill out the form received.")
  @JsonProperty("receivedMessage")
  public ConversationContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The reply message after the user has filled out the form received.
   **/
  public ConversationContentForm replyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reply message after the user has filled out the form received.")
  @JsonProperty("replyMessage")
  public ConversationContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * Show summary at end of form submission.
   **/
  public ConversationContentForm showSummary(Boolean showSummary) {
    this.showSummary = showSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show summary at end of form submission.")
  @JsonProperty("showSummary")
  public Boolean getShowSummary() {
    return showSummary;
  }
  public void setShowSummary(Boolean showSummary) {
    this.showSummary = showSummary;
  }


  /**
   * Content of the payload included in the Form response.
   **/
  public ConversationContentForm response(List<ConversationFormResponseComponent> response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the payload included in the Form response.")
  @JsonProperty("response")
  public List<ConversationFormResponseComponent> getResponse() {
    return response;
  }
  public void setResponse(List<ConversationFormResponseComponent> response) {
    this.response = response;
  }


  /**
   * Reference to the ID of the original message.
   **/
  public ConversationContentForm originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to the ID of the original message.")
  @JsonProperty("originatingMessageId")
  public String getOriginatingMessageId() {
    return originatingMessageId;
  }
  public void setOriginatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
  }


  /**
   * The id of the canned response which was used to create the form.
   **/
  public ConversationContentForm cannedResponseId(String cannedResponseId) {
    this.cannedResponseId = cannedResponseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the canned response which was used to create the form.")
  @JsonProperty("cannedResponseId")
  public String getCannedResponseId() {
    return cannedResponseId;
  }
  public void setCannedResponseId(String cannedResponseId) {
    this.cannedResponseId = cannedResponseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentForm conversationContentForm = (ConversationContentForm) o;

    return Objects.equals(this.introduction, conversationContentForm.introduction) &&
            Objects.equals(this.formPages, conversationContentForm.formPages) &&
            Objects.equals(this.receivedMessage, conversationContentForm.receivedMessage) &&
            Objects.equals(this.replyMessage, conversationContentForm.replyMessage) &&
            Objects.equals(this.showSummary, conversationContentForm.showSummary) &&
            Objects.equals(this.response, conversationContentForm.response) &&
            Objects.equals(this.originatingMessageId, conversationContentForm.originatingMessageId) &&
            Objects.equals(this.cannedResponseId, conversationContentForm.cannedResponseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(introduction, formPages, receivedMessage, replyMessage, showSummary, response, originatingMessageId, cannedResponseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentForm {\n");
    
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    formPages: ").append(toIndentedString(formPages)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    showSummary: ").append(toIndentedString(showSummary)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    originatingMessageId: ").append(toIndentedString(originatingMessageId)).append("\n");
    sb.append("    cannedResponseId: ").append(toIndentedString(cannedResponseId)).append("\n");
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

