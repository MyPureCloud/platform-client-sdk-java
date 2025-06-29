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
import com.mypurecloud.sdk.v2.model.ReceivedReplyMessage;
import com.mypurecloud.sdk.v2.model.RecordingFormPage;
import com.mypurecloud.sdk.v2.model.RecordingFormResponseComponent;
import com.mypurecloud.sdk.v2.model.RecordingIntroduction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingForm
 */

public class RecordingForm  implements Serializable {
  
  private RecordingIntroduction introduction = null;
  private List<RecordingFormPage> formPages = null;
  private ReceivedReplyMessage receivedMessage = null;
  private ReceivedReplyMessage replyMessage = null;
  private List<RecordingFormResponseComponent> response = null;
  private String originatingMessageId = null;
  private String cannedResponseId = null;

  public RecordingForm() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      formPages = new ArrayList<RecordingFormPage>();
      response = new ArrayList<RecordingFormResponseComponent>();
    }
  }

  
  /**
   * The introduction component, used to give an intro into what the form entails.
   **/
  public RecordingForm introduction(RecordingIntroduction introduction) {
    this.introduction = introduction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The introduction component, used to give an intro into what the form entails.")
  @JsonProperty("introduction")
  public RecordingIntroduction getIntroduction() {
    return introduction;
  }
  public void setIntroduction(RecordingIntroduction introduction) {
    this.introduction = introduction;
  }


  /**
   * Form pages.
   **/
  public RecordingForm formPages(List<RecordingFormPage> formPages) {
    this.formPages = formPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Form pages.")
  @JsonProperty("formPages")
  public List<RecordingFormPage> getFormPages() {
    return formPages;
  }
  public void setFormPages(List<RecordingFormPage> formPages) {
    this.formPages = formPages;
  }


  /**
   * Defines the initial prompt message structure containing title and subtitle fields that are displayed to the end user when a form requires completion.
   **/
  public RecordingForm receivedMessage(ReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the initial prompt message structure containing title and subtitle fields that are displayed to the end user when a form requires completion.")
  @JsonProperty("receivedMessage")
  public ReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * The reply message after the user has filled out the form received.
   **/
  public RecordingForm replyMessage(ReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reply message after the user has filled out the form received.")
  @JsonProperty("replyMessage")
  public ReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * Content of the payload included in the Form response.
   **/
  public RecordingForm response(List<RecordingFormResponseComponent> response) {
    this.response = response;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the payload included in the Form response.")
  @JsonProperty("response")
  public List<RecordingFormResponseComponent> getResponse() {
    return response;
  }
  public void setResponse(List<RecordingFormResponseComponent> response) {
    this.response = response;
  }


  /**
   * Reference to the id of the original message.
   **/
  public RecordingForm originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to the id of the original message.")
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
  public RecordingForm cannedResponseId(String cannedResponseId) {
    this.cannedResponseId = cannedResponseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the canned response which was used to create the form.")
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
    RecordingForm recordingForm = (RecordingForm) o;

    return Objects.equals(this.introduction, recordingForm.introduction) &&
            Objects.equals(this.formPages, recordingForm.formPages) &&
            Objects.equals(this.receivedMessage, recordingForm.receivedMessage) &&
            Objects.equals(this.replyMessage, recordingForm.replyMessage) &&
            Objects.equals(this.response, recordingForm.response) &&
            Objects.equals(this.originatingMessageId, recordingForm.originatingMessageId) &&
            Objects.equals(this.cannedResponseId, recordingForm.cannedResponseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(introduction, formPages, receivedMessage, replyMessage, response, originatingMessageId, cannedResponseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingForm {\n");
    
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    formPages: ").append(toIndentedString(formPages)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
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

