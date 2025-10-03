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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ButtonResponse;
import com.mypurecloud.sdk.v2.model.Card;
import com.mypurecloud.sdk.v2.model.ConversationMessageEvent;
import com.mypurecloud.sdk.v2.model.DatePicker;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.InteractiveApplication;
import com.mypurecloud.sdk.v2.model.ListPicker;
import com.mypurecloud.sdk.v2.model.MessageMediaAttachment;
import com.mypurecloud.sdk.v2.model.MessageStickerAttachment;
import com.mypurecloud.sdk.v2.model.PaymentRequest;
import com.mypurecloud.sdk.v2.model.PaymentResponse;
import com.mypurecloud.sdk.v2.model.QuickReply;
import com.mypurecloud.sdk.v2.model.RecordingContentStory;
import com.mypurecloud.sdk.v2.model.RecordingNotificationTemplate;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingMessagingMessage
 */

public class RecordingMessagingMessage  implements Serializable {
  
  private String from = null;
  private User fromUser = null;
  private ExternalContact fromExternalContact = null;
  private String to = null;
  private Date timestamp = null;
  private String id = null;
  private String purpose = null;
  private String participantId = null;
  private AddressableEntityRef queue = null;
  private AddressableEntityRef workflow = null;
  private String messageText = null;
  private List<MessageMediaAttachment> messageMediaAttachments = null;
  private List<MessageStickerAttachment> messageStickerAttachments = null;
  private List<QuickReply> quickReplies = null;
  private ButtonResponse buttonResponse = null;
  private List<ButtonResponse> buttonResponses = null;
  private RecordingContentStory story = null;
  private List<Card> cards = null;
  private RecordingNotificationTemplate notificationTemplate = null;
  private DatePicker datePicker = null;
  private ListPicker listPicker = null;

  private static class ContentTypeEnumDeserializer extends StdDeserializer<ContentTypeEnum> {
    public ContentTypeEnumDeserializer() {
      super(ContentTypeEnumDeserializer.class);
    }

    @Override
    public ContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the content type for this message
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUICKREPLY("QuickReply"),
    STORY("Story"),
    CARD("Card"),
    CAROUSEL("Carousel"),
    ATTACHMENT("Attachment"),
    LOCATION("Location"),
    NOTIFICATION("Notification"),
    GENERICTEMPLATE("GenericTemplate"),
    LISTTEMPLATE("ListTemplate"),
    POSTBACK("Postback"),
    REACTIONS("Reactions"),
    MENTION("Mention"),
    BUTTONRESPONSE("ButtonResponse"),
    DATEPICKER("DatePicker"),
    LISTPICKER("ListPicker"),
    INTERACTIVEAPPLICATION("InteractiveApplication"),
    PAYMENTREQUEST("PaymentRequest"),
    PAYMENTRESPONSE("PaymentResponse"),
    FORM("Form"),
    ROADSIDEASSISTANCE("RoadsideAssistance");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContentTypeEnum value : ContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContentTypeEnum contentType = null;

  private static class SocialVisibilityEnumDeserializer extends StdDeserializer<SocialVisibilityEnum> {
    public SocialVisibilityEnumDeserializer() {
      super(SocialVisibilityEnumDeserializer.class);
    }

    @Override
    public SocialVisibilityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SocialVisibilityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * For social media messages, the visibility of the message in the originating social platform
   */
 @JsonDeserialize(using = SocialVisibilityEnumDeserializer.class)
  public enum SocialVisibilityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLIC("Public"),
    PRIVATE("Private");

    private String value;

    SocialVisibilityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SocialVisibilityEnum fromString(String key) {
      if (key == null) return null;

      for (SocialVisibilityEnum value : SocialVisibilityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SocialVisibilityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SocialVisibilityEnum socialVisibility = null;
  private List<ConversationMessageEvent> events = null;
  private InteractiveApplication interactiveApplication = null;
  private PaymentRequest paymentRequest = null;
  private PaymentResponse paymentResponse = null;

  public RecordingMessagingMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      messageMediaAttachments = new ArrayList<MessageMediaAttachment>();
      messageStickerAttachments = new ArrayList<MessageStickerAttachment>();
      quickReplies = new ArrayList<QuickReply>();
      buttonResponses = new ArrayList<ButtonResponse>();
      cards = new ArrayList<Card>();
      events = new ArrayList<ConversationMessageEvent>();
    }
  }

  
  /**
   * The message sender session id.
   **/
  public RecordingMessagingMessage from(String from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message sender session id.")
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }


  /**
   * The user who sent this message.
   **/
  public RecordingMessagingMessage fromUser(User fromUser) {
    this.fromUser = fromUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who sent this message.")
  @JsonProperty("fromUser")
  public User getFromUser() {
    return fromUser;
  }
  public void setFromUser(User fromUser) {
    this.fromUser = fromUser;
  }


  /**
   * The PureCloud external contact sender details.
   **/
  public RecordingMessagingMessage fromExternalContact(ExternalContact fromExternalContact) {
    this.fromExternalContact = fromExternalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The PureCloud external contact sender details.")
  @JsonProperty("fromExternalContact")
  public ExternalContact getFromExternalContact() {
    return fromExternalContact;
  }
  public void setFromExternalContact(ExternalContact fromExternalContact) {
    this.fromExternalContact = fromExternalContact;
  }


  /**
   * The message recipient.
   **/
  public RecordingMessagingMessage to(String to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message recipient.")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }


  /**
   * The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingMessagingMessage timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * A globally unique identifier for this communication.
   **/
  public RecordingMessagingMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for this communication.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * A well known string that specifies the purpose or type of the participant on this communication.
   **/
  public RecordingMessagingMessage purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A well known string that specifies the purpose or type of the participant on this communication.")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  /**
   * A globally unique identifier for the participant on this communication.
   **/
  public RecordingMessagingMessage participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the participant on this communication.")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }


  /**
   * A globally unique identifier for the queue involved in this communication.
   **/
  public RecordingMessagingMessage queue(AddressableEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the queue involved in this communication.")
  @JsonProperty("queue")
  public AddressableEntityRef getQueue() {
    return queue;
  }
  public void setQueue(AddressableEntityRef queue) {
    this.queue = queue;
  }


  /**
   * A globally unique identifier for the workflow involved in this communication.
   **/
  public RecordingMessagingMessage workflow(AddressableEntityRef workflow) {
    this.workflow = workflow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A globally unique identifier for the workflow involved in this communication.")
  @JsonProperty("workflow")
  public AddressableEntityRef getWorkflow() {
    return workflow;
  }
  public void setWorkflow(AddressableEntityRef workflow) {
    this.workflow = workflow;
  }


  /**
   * The content of this message.
   **/
  public RecordingMessagingMessage messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content of this message.")
  @JsonProperty("messageText")
  public String getMessageText() {
    return messageText;
  }
  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }


  /**
   * List of media objects attached  with this message.
   **/
  public RecordingMessagingMessage messageMediaAttachments(List<MessageMediaAttachment> messageMediaAttachments) {
    this.messageMediaAttachments = messageMediaAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of media objects attached  with this message.")
  @JsonProperty("messageMediaAttachments")
  public List<MessageMediaAttachment> getMessageMediaAttachments() {
    return messageMediaAttachments;
  }
  public void setMessageMediaAttachments(List<MessageMediaAttachment> messageMediaAttachments) {
    this.messageMediaAttachments = messageMediaAttachments;
  }


  /**
   * List of message stickers attached with this message.
   **/
  public RecordingMessagingMessage messageStickerAttachments(List<MessageStickerAttachment> messageStickerAttachments) {
    this.messageStickerAttachments = messageStickerAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of message stickers attached with this message.")
  @JsonProperty("messageStickerAttachments")
  public List<MessageStickerAttachment> getMessageStickerAttachments() {
    return messageStickerAttachments;
  }
  public void setMessageStickerAttachments(List<MessageStickerAttachment> messageStickerAttachments) {
    this.messageStickerAttachments = messageStickerAttachments;
  }


  /**
   * List of quick reply options offered with this message.
   **/
  public RecordingMessagingMessage quickReplies(List<QuickReply> quickReplies) {
    this.quickReplies = quickReplies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of quick reply options offered with this message.")
  @JsonProperty("quickReplies")
  public List<QuickReply> getQuickReplies() {
    return quickReplies;
  }
  public void setQuickReplies(List<QuickReply> quickReplies) {
    this.quickReplies = quickReplies;
  }


  /**
   * Button Response selected by user for this message.
   **/
  public RecordingMessagingMessage buttonResponse(ButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button Response selected by user for this message.")
  @JsonProperty("buttonResponse")
  public ButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }


  /**
   * List of Button Response selected by user for this message.
   **/
  public RecordingMessagingMessage buttonResponses(List<ButtonResponse> buttonResponses) {
    this.buttonResponses = buttonResponses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Button Response selected by user for this message.")
  @JsonProperty("buttonResponses")
  public List<ButtonResponse> getButtonResponses() {
    return buttonResponses;
  }
  public void setButtonResponses(List<ButtonResponse> buttonResponses) {
    this.buttonResponses = buttonResponses;
  }


  /**
   * Ephemeral story content.
   **/
  public RecordingMessagingMessage story(RecordingContentStory story) {
    this.story = story;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ephemeral story content.")
  @JsonProperty("story")
  public RecordingContentStory getStory() {
    return story;
  }
  public void setStory(RecordingContentStory story) {
    this.story = story;
  }


  /**
   * List of cards offered for this message
   **/
  public RecordingMessagingMessage cards(List<Card> cards) {
    this.cards = cards;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of cards offered for this message")
  @JsonProperty("cards")
  public List<Card> getCards() {
    return cards;
  }
  public void setCards(List<Card> cards) {
    this.cards = cards;
  }


  /**
   * Template notification content.
   **/
  public RecordingMessagingMessage notificationTemplate(RecordingNotificationTemplate notificationTemplate) {
    this.notificationTemplate = notificationTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template notification content.")
  @JsonProperty("notificationTemplate")
  public RecordingNotificationTemplate getNotificationTemplate() {
    return notificationTemplate;
  }
  public void setNotificationTemplate(RecordingNotificationTemplate notificationTemplate) {
    this.notificationTemplate = notificationTemplate;
  }


  /**
   * DatePicker content object.
   **/
  public RecordingMessagingMessage datePicker(DatePicker datePicker) {
    this.datePicker = datePicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DatePicker content object.")
  @JsonProperty("datePicker")
  public DatePicker getDatePicker() {
    return datePicker;
  }
  public void setDatePicker(DatePicker datePicker) {
    this.datePicker = datePicker;
  }


  /**
   * ListPicker content object.
   **/
  public RecordingMessagingMessage listPicker(ListPicker listPicker) {
    this.listPicker = listPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ListPicker content object.")
  @JsonProperty("listPicker")
  public ListPicker getListPicker() {
    return listPicker;
  }
  public void setListPicker(ListPicker listPicker) {
    this.listPicker = listPicker;
  }


  /**
   * Indicates the content type for this message
   **/
  public RecordingMessagingMessage contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the content type for this message")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  /**
   * For social media messages, the visibility of the message in the originating social platform
   **/
  public RecordingMessagingMessage socialVisibility(SocialVisibilityEnum socialVisibility) {
    this.socialVisibility = socialVisibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For social media messages, the visibility of the message in the originating social platform")
  @JsonProperty("socialVisibility")
  public SocialVisibilityEnum getSocialVisibility() {
    return socialVisibility;
  }
  public void setSocialVisibility(SocialVisibilityEnum socialVisibility) {
    this.socialVisibility = socialVisibility;
  }


  /**
   * List of event elements
   **/
  public RecordingMessagingMessage events(List<ConversationMessageEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of event elements")
  @JsonProperty("events")
  public List<ConversationMessageEvent> getEvents() {
    return events;
  }
  public void setEvents(List<ConversationMessageEvent> events) {
    this.events = events;
  }


  /**
   * InteractiveApplication content.
   **/
  public RecordingMessagingMessage interactiveApplication(InteractiveApplication interactiveApplication) {
    this.interactiveApplication = interactiveApplication;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "InteractiveApplication content.")
  @JsonProperty("interactiveApplication")
  public InteractiveApplication getInteractiveApplication() {
    return interactiveApplication;
  }
  public void setInteractiveApplication(InteractiveApplication interactiveApplication) {
    this.interactiveApplication = interactiveApplication;
  }


  /**
   * Payment request content.
   **/
  public RecordingMessagingMessage paymentRequest(PaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Payment request content.")
  @JsonProperty("paymentRequest")
  public PaymentRequest getPaymentRequest() {
    return paymentRequest;
  }
  public void setPaymentRequest(PaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }


  /**
   * Payment response content.
   **/
  public RecordingMessagingMessage paymentResponse(PaymentResponse paymentResponse) {
    this.paymentResponse = paymentResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Payment response content.")
  @JsonProperty("paymentResponse")
  public PaymentResponse getPaymentResponse() {
    return paymentResponse;
  }
  public void setPaymentResponse(PaymentResponse paymentResponse) {
    this.paymentResponse = paymentResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingMessagingMessage recordingMessagingMessage = (RecordingMessagingMessage) o;

    return Objects.equals(this.from, recordingMessagingMessage.from) &&
            Objects.equals(this.fromUser, recordingMessagingMessage.fromUser) &&
            Objects.equals(this.fromExternalContact, recordingMessagingMessage.fromExternalContact) &&
            Objects.equals(this.to, recordingMessagingMessage.to) &&
            Objects.equals(this.timestamp, recordingMessagingMessage.timestamp) &&
            Objects.equals(this.id, recordingMessagingMessage.id) &&
            Objects.equals(this.purpose, recordingMessagingMessage.purpose) &&
            Objects.equals(this.participantId, recordingMessagingMessage.participantId) &&
            Objects.equals(this.queue, recordingMessagingMessage.queue) &&
            Objects.equals(this.workflow, recordingMessagingMessage.workflow) &&
            Objects.equals(this.messageText, recordingMessagingMessage.messageText) &&
            Objects.equals(this.messageMediaAttachments, recordingMessagingMessage.messageMediaAttachments) &&
            Objects.equals(this.messageStickerAttachments, recordingMessagingMessage.messageStickerAttachments) &&
            Objects.equals(this.quickReplies, recordingMessagingMessage.quickReplies) &&
            Objects.equals(this.buttonResponse, recordingMessagingMessage.buttonResponse) &&
            Objects.equals(this.buttonResponses, recordingMessagingMessage.buttonResponses) &&
            Objects.equals(this.story, recordingMessagingMessage.story) &&
            Objects.equals(this.cards, recordingMessagingMessage.cards) &&
            Objects.equals(this.notificationTemplate, recordingMessagingMessage.notificationTemplate) &&
            Objects.equals(this.datePicker, recordingMessagingMessage.datePicker) &&
            Objects.equals(this.listPicker, recordingMessagingMessage.listPicker) &&
            Objects.equals(this.contentType, recordingMessagingMessage.contentType) &&
            Objects.equals(this.socialVisibility, recordingMessagingMessage.socialVisibility) &&
            Objects.equals(this.events, recordingMessagingMessage.events) &&
            Objects.equals(this.interactiveApplication, recordingMessagingMessage.interactiveApplication) &&
            Objects.equals(this.paymentRequest, recordingMessagingMessage.paymentRequest) &&
            Objects.equals(this.paymentResponse, recordingMessagingMessage.paymentResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, fromUser, fromExternalContact, to, timestamp, id, purpose, participantId, queue, workflow, messageText, messageMediaAttachments, messageStickerAttachments, quickReplies, buttonResponse, buttonResponses, story, cards, notificationTemplate, datePicker, listPicker, contentType, socialVisibility, events, interactiveApplication, paymentRequest, paymentResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingMessagingMessage {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromUser: ").append(toIndentedString(fromUser)).append("\n");
    sb.append("    fromExternalContact: ").append(toIndentedString(fromExternalContact)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    messageMediaAttachments: ").append(toIndentedString(messageMediaAttachments)).append("\n");
    sb.append("    messageStickerAttachments: ").append(toIndentedString(messageStickerAttachments)).append("\n");
    sb.append("    quickReplies: ").append(toIndentedString(quickReplies)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
    sb.append("    buttonResponses: ").append(toIndentedString(buttonResponses)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    notificationTemplate: ").append(toIndentedString(notificationTemplate)).append("\n");
    sb.append("    datePicker: ").append(toIndentedString(datePicker)).append("\n");
    sb.append("    listPicker: ").append(toIndentedString(listPicker)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    socialVisibility: ").append(toIndentedString(socialVisibility)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    interactiveApplication: ").append(toIndentedString(interactiveApplication)).append("\n");
    sb.append("    paymentRequest: ").append(toIndentedString(paymentRequest)).append("\n");
    sb.append("    paymentResponse: ").append(toIndentedString(paymentResponse)).append("\n");
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

