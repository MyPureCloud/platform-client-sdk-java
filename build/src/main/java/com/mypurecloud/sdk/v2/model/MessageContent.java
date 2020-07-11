package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContentAttachment;
import com.mypurecloud.sdk.v2.model.ContentGeneric;
import com.mypurecloud.sdk.v2.model.ContentList;
import com.mypurecloud.sdk.v2.model.ContentLocation;
import com.mypurecloud.sdk.v2.model.ContentNotificationTemplate;
import com.mypurecloud.sdk.v2.model.ContentQuickReply;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Message content element
 */
@ApiModel(description = "Message content element")

public class MessageContent  implements Serializable {
  

  /**
   * Type of this content element. If contentType = \"Attachment\" only one item is allowed.
   */
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTACHMENT("Attachment"),
    LOCATION("Location"),
    QUICKREPLY("QuickReply"),
    NOTIFICATION("Notification"),
    GENERICTEMPLATE("GenericTemplate"),
    LISTTEMPLATE("ListTemplate");

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
  private ContentLocation location = null;
  private ContentAttachment attachment = null;
  private ContentQuickReply quickReply = null;
  private ContentGeneric generic = null;
  private ContentList list = null;
  private ContentNotificationTemplate template = null;

  
  /**
   * Type of this content element. If contentType = \"Attachment\" only one item is allowed.
   **/
  public MessageContent contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of this content element. If contentType = \"Attachment\" only one item is allowed.")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  
  /**
   * Location object
   **/
  public MessageContent location(ContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Location object")
  @JsonProperty("location")
  public ContentLocation getLocation() {
    return location;
  }
  public void setLocation(ContentLocation location) {
    this.location = location;
  }

  
  /**
   * Attachment object
   **/
  public MessageContent attachment(ContentAttachment attachment) {
    this.attachment = attachment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Attachment object")
  @JsonProperty("attachment")
  public ContentAttachment getAttachment() {
    return attachment;
  }
  public void setAttachment(ContentAttachment attachment) {
    this.attachment = attachment;
  }

  
  /**
   * Quick reply object
   **/
  public MessageContent quickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quick reply object")
  @JsonProperty("quickReply")
  public ContentQuickReply getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(ContentQuickReply quickReply) {
    this.quickReply = quickReply;
  }

  
  /**
   * Generic content object
   **/
  public MessageContent generic(ContentGeneric generic) {
    this.generic = generic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Generic content object")
  @JsonProperty("generic")
  public ContentGeneric getGeneric() {
    return generic;
  }
  public void setGeneric(ContentGeneric generic) {
    this.generic = generic;
  }

  
  /**
   * List content object
   **/
  public MessageContent list(ContentList list) {
    this.list = list;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List content object")
  @JsonProperty("list")
  public ContentList getList() {
    return list;
  }
  public void setList(ContentList list) {
    this.list = list;
  }

  
  /**
   * Template notification object
   **/
  public MessageContent template(ContentNotificationTemplate template) {
    this.template = template;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template notification object")
  @JsonProperty("template")
  public ContentNotificationTemplate getTemplate() {
    return template;
  }
  public void setTemplate(ContentNotificationTemplate template) {
    this.template = template;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContent messageContent = (MessageContent) o;
    return Objects.equals(this.contentType, messageContent.contentType) &&
        Objects.equals(this.location, messageContent.location) &&
        Objects.equals(this.attachment, messageContent.attachment) &&
        Objects.equals(this.quickReply, messageContent.quickReply) &&
        Objects.equals(this.generic, messageContent.generic) &&
        Objects.equals(this.list, messageContent.list) &&
        Objects.equals(this.template, messageContent.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, location, attachment, quickReply, generic, list, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
    sb.append("    generic: ").append(toIndentedString(generic)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

