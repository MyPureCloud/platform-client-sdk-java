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
import com.mypurecloud.sdk.v2.model.FormIntroduction;
import com.mypurecloud.sdk.v2.model.FormMessage;
import com.mypurecloud.sdk.v2.model.FormPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Form configuration for response management
 */
@ApiModel(description = "Form configuration for response management")

public class Form  implements Serializable {
  
  private String formDescription = null;
  private FormMessage receivedMessage = null;
  private FormMessage replyMessage = null;
  private FormIntroduction introduction = null;
  private List<FormPage> formPages = null;
  private Boolean showSummary = null;

  public Form() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      formPages = new ArrayList<FormPage>();
    }
  }

  
  /**
   * Description of the form
   **/
  public Form formDescription(String formDescription) {
    this.formDescription = formDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description of the form")
  @JsonProperty("formDescription")
  public String getFormDescription() {
    return formDescription;
  }
  public void setFormDescription(String formDescription) {
    this.formDescription = formDescription;
  }


  /**
   * Message displayed when response is received
   **/
  public Form receivedMessage(FormMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message displayed when response is received")
  @JsonProperty("receivedMessage")
  public FormMessage getReceivedMessage() {
    return receivedMessage;
  }
  public void setReceivedMessage(FormMessage receivedMessage) {
    this.receivedMessage = receivedMessage;
  }


  /**
   * Message displayed as reply
   **/
  public Form replyMessage(FormMessage replyMessage) {
    this.replyMessage = replyMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message displayed as reply")
  @JsonProperty("replyMessage")
  public FormMessage getReplyMessage() {
    return replyMessage;
  }
  public void setReplyMessage(FormMessage replyMessage) {
    this.replyMessage = replyMessage;
  }


  /**
   * Introduction section of the form
   **/
  public Form introduction(FormIntroduction introduction) {
    this.introduction = introduction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Introduction section of the form")
  @JsonProperty("introduction")
  public FormIntroduction getIntroduction() {
    return introduction;
  }
  public void setIntroduction(FormIntroduction introduction) {
    this.introduction = introduction;
  }


  /**
   * Pages of the form
   **/
  public Form formPages(List<FormPage> formPages) {
    this.formPages = formPages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Pages of the form")
  @JsonProperty("formPages")
  public List<FormPage> getFormPages() {
    return formPages;
  }
  public void setFormPages(List<FormPage> formPages) {
    this.formPages = formPages;
  }


  /**
   * Whether to show a summary after form completion
   **/
  public Form showSummary(Boolean showSummary) {
    this.showSummary = showSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to show a summary after form completion")
  @JsonProperty("showSummary")
  public Boolean getShowSummary() {
    return showSummary;
  }
  public void setShowSummary(Boolean showSummary) {
    this.showSummary = showSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;

    return Objects.equals(this.formDescription, form.formDescription) &&
            Objects.equals(this.receivedMessage, form.receivedMessage) &&
            Objects.equals(this.replyMessage, form.replyMessage) &&
            Objects.equals(this.introduction, form.introduction) &&
            Objects.equals(this.formPages, form.formPages) &&
            Objects.equals(this.showSummary, form.showSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formDescription, receivedMessage, replyMessage, introduction, formPages, showSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    
    sb.append("    formDescription: ").append(toIndentedString(formDescription)).append("\n");
    sb.append("    receivedMessage: ").append(toIndentedString(receivedMessage)).append("\n");
    sb.append("    replyMessage: ").append(toIndentedString(replyMessage)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    formPages: ").append(toIndentedString(formPages)).append("\n");
    sb.append("    showSummary: ").append(toIndentedString(showSummary)).append("\n");
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

