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
import com.mypurecloud.sdk.v2.model.ConversationContentListPickerSection;
import com.mypurecloud.sdk.v2.model.ConversationContentReceivedReplyMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List Picker object for presenting multiple sections of selectable items.
 */
@ApiModel(description = "List Picker object for presenting multiple sections of selectable items.")

public class ConversationContentListPicker  implements Serializable {
  
  private String id = null;
  private List<ConversationContentListPickerSection> sections = null;
  private ConversationContentReceivedReplyMessage replyMessage = null;
  private ConversationContentReceivedReplyMessage receivedMessage = null;

  public ConversationContentListPicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sections = new ArrayList<ConversationContentListPickerSection>();
    }
  }

  
  /**
   * Optional unique identifier to help map component replies to form messages where multiple ListPickers can be present.
   **/
  public ConversationContentListPicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unique identifier to help map component replies to form messages where multiple ListPickers can be present.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * An array of sections in the List Picker.
   **/
  public ConversationContentListPicker sections(List<ConversationContentListPickerSection> sections) {
    this.sections = sections;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of sections in the List Picker.")
  @JsonProperty("sections")
  public List<ConversationContentListPickerSection> getSections() {
    return sections;
  }
  public void setSections(List<ConversationContentListPickerSection> sections) {
    this.sections = sections;
  }


  /**
   * The reply message after the user has selected the options from the List Picker.
   **/
  public ConversationContentListPicker replyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reply message after the user has selected the options from the List Picker.")
  @JsonProperty("replyMessage")
  public ConversationContentReceivedReplyMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(ConversationContentReceivedReplyMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * The message prompt to select options in the List Picker sections.
   **/
  public ConversationContentListPicker receivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message prompt to select options in the List Picker sections.")
  @JsonProperty("receivedMessage")
  public ConversationContentReceivedReplyMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(ConversationContentReceivedReplyMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentListPicker conversationContentListPicker = (ConversationContentListPicker) o;

    return Objects.equals(this.id, conversationContentListPicker.id) &&
            Objects.equals(this.sections, conversationContentListPicker.sections) &&
            Objects.equals(this.replyMessage, conversationContentListPicker.replyMessage) &&
            Objects.equals(this.receivedMessage, conversationContentListPicker.receivedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sections, replyMessage, receivedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentListPicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
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

