package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.NotificationTemplateBody;
import com.mypurecloud.sdk.v2.model.NotificationTemplateFooter;
import com.mypurecloud.sdk.v2.model.NotificationTemplateHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Template notification object
 */
@ApiModel(description = "Template notification object")

public class ContentNotificationTemplate  implements Serializable {
  
  private String id = null;
  private String language = null;
  private NotificationTemplateHeader header = null;
  private NotificationTemplateBody body = null;
  private NotificationTemplateFooter footer = null;

  
  /**
   * The messaging channel template id. For WhatsApp, 'namespace@name'
   **/
  public ContentNotificationTemplate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging channel template id. For WhatsApp, 'namespace@name'")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Template language
   **/
  public ContentNotificationTemplate language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template language")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   * Template header object
   **/
  public ContentNotificationTemplate header(NotificationTemplateHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template header object")
  @JsonProperty("header")
  public NotificationTemplateHeader getHeader() {
    return header;
  }
  public void setHeader(NotificationTemplateHeader header) {
    this.header = header;
  }

  
  /**
   * Template body object
   **/
  public ContentNotificationTemplate body(NotificationTemplateBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Template body object")
  @JsonProperty("body")
  public NotificationTemplateBody getBody() {
    return body;
  }
  public void setBody(NotificationTemplateBody body) {
    this.body = body;
  }

  
  /**
   * Template footer object
   **/
  public ContentNotificationTemplate footer(NotificationTemplateFooter footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template footer object")
  @JsonProperty("footer")
  public NotificationTemplateFooter getFooter() {
    return footer;
  }
  public void setFooter(NotificationTemplateFooter footer) {
    this.footer = footer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentNotificationTemplate contentNotificationTemplate = (ContentNotificationTemplate) o;
    return Objects.equals(this.id, contentNotificationTemplate.id) &&
        Objects.equals(this.language, contentNotificationTemplate.language) &&
        Objects.equals(this.header, contentNotificationTemplate.header) &&
        Objects.equals(this.body, contentNotificationTemplate.body) &&
        Objects.equals(this.footer, contentNotificationTemplate.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, header, body, footer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentNotificationTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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

