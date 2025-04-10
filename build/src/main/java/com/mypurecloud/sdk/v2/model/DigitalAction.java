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
import com.mypurecloud.sdk.v2.model.AppendToDncActionSettings;
import com.mypurecloud.sdk.v2.model.MarkContactUncontactableActionSettings;
import com.mypurecloud.sdk.v2.model.SetContentTemplateActionSettings;
import com.mypurecloud.sdk.v2.model.SetSmsPhoneNumberActionSettings;
import com.mypurecloud.sdk.v2.model.UpdateContactColumnActionSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DigitalAction
 */

public class DigitalAction  implements Serializable {
  
  private UpdateContactColumnActionSettings updateContactColumnActionSettings = null;
  private Object doNotSendActionSettings = null;
  private AppendToDncActionSettings appendToDncActionSettings = null;
  private MarkContactUncontactableActionSettings markContactUncontactableActionSettings = null;
  private Object markContactAddressUncontactableActionSettings = null;
  private SetContentTemplateActionSettings setContentTemplateActionSettings = null;
  private SetSmsPhoneNumberActionSettings setSmsPhoneNumberActionSettings = null;

  public DigitalAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The settings for an 'update contact column' action.
   **/
  public DigitalAction updateContactColumnActionSettings(UpdateContactColumnActionSettings updateContactColumnActionSettings) {
    this.updateContactColumnActionSettings = updateContactColumnActionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for an 'update contact column' action.")
  @JsonProperty("updateContactColumnActionSettings")
  public UpdateContactColumnActionSettings getUpdateContactColumnActionSettings() {
    return updateContactColumnActionSettings;
  }
  public void setUpdateContactColumnActionSettings(UpdateContactColumnActionSettings updateContactColumnActionSettings) {
    this.updateContactColumnActionSettings = updateContactColumnActionSettings;
  }


  /**
   * The settings for a 'do not send' action.
   **/
  public DigitalAction doNotSendActionSettings(Object doNotSendActionSettings) {
    this.doNotSendActionSettings = doNotSendActionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'do not send' action.")
  @JsonProperty("doNotSendActionSettings")
  public Object getDoNotSendActionSettings() {
    return doNotSendActionSettings;
  }
  public void setDoNotSendActionSettings(Object doNotSendActionSettings) {
    this.doNotSendActionSettings = doNotSendActionSettings;
  }


  /**
   * The settings for an 'Append to DNC' action.
   **/
  public DigitalAction appendToDncActionSettings(AppendToDncActionSettings appendToDncActionSettings) {
    this.appendToDncActionSettings = appendToDncActionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for an 'Append to DNC' action.")
  @JsonProperty("appendToDncActionSettings")
  public AppendToDncActionSettings getAppendToDncActionSettings() {
    return appendToDncActionSettings;
  }
  public void setAppendToDncActionSettings(AppendToDncActionSettings appendToDncActionSettings) {
    this.appendToDncActionSettings = appendToDncActionSettings;
  }


  /**
   * The settings for a 'mark contact uncontactable' action.
   **/
  public DigitalAction markContactUncontactableActionSettings(MarkContactUncontactableActionSettings markContactUncontactableActionSettings) {
    this.markContactUncontactableActionSettings = markContactUncontactableActionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'mark contact uncontactable' action.")
  @JsonProperty("markContactUncontactableActionSettings")
  public MarkContactUncontactableActionSettings getMarkContactUncontactableActionSettings() {
    return markContactUncontactableActionSettings;
  }
  public void setMarkContactUncontactableActionSettings(MarkContactUncontactableActionSettings markContactUncontactableActionSettings) {
    this.markContactUncontactableActionSettings = markContactUncontactableActionSettings;
  }


  /**
   * The settings for an 'mark contact address uncontactable' action.
   **/
  public DigitalAction markContactAddressUncontactableActionSettings(Object markContactAddressUncontactableActionSettings) {
    this.markContactAddressUncontactableActionSettings = markContactAddressUncontactableActionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for an 'mark contact address uncontactable' action.")
  @JsonProperty("markContactAddressUncontactableActionSettings")
  public Object getMarkContactAddressUncontactableActionSettings() {
    return markContactAddressUncontactableActionSettings;
  }
  public void setMarkContactAddressUncontactableActionSettings(Object markContactAddressUncontactableActionSettings) {
    this.markContactAddressUncontactableActionSettings = markContactAddressUncontactableActionSettings;
  }


  /**
   * The settings for a 'Set content template' action.
   **/
  public DigitalAction setContentTemplateActionSettings(SetContentTemplateActionSettings setContentTemplateActionSettings) {
    this.setContentTemplateActionSettings = setContentTemplateActionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'Set content template' action.")
  @JsonProperty("setContentTemplateActionSettings")
  public SetContentTemplateActionSettings getSetContentTemplateActionSettings() {
    return setContentTemplateActionSettings;
  }
  public void setSetContentTemplateActionSettings(SetContentTemplateActionSettings setContentTemplateActionSettings) {
    this.setContentTemplateActionSettings = setContentTemplateActionSettings;
  }


  /**
   * The settings for a 'set sms phone number' action.
   **/
  public DigitalAction setSmsPhoneNumberActionSettings(SetSmsPhoneNumberActionSettings setSmsPhoneNumberActionSettings) {
    this.setSmsPhoneNumberActionSettings = setSmsPhoneNumberActionSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings for a 'set sms phone number' action.")
  @JsonProperty("setSmsPhoneNumberActionSettings")
  public SetSmsPhoneNumberActionSettings getSetSmsPhoneNumberActionSettings() {
    return setSmsPhoneNumberActionSettings;
  }
  public void setSetSmsPhoneNumberActionSettings(SetSmsPhoneNumberActionSettings setSmsPhoneNumberActionSettings) {
    this.setSmsPhoneNumberActionSettings = setSmsPhoneNumberActionSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalAction digitalAction = (DigitalAction) o;

    return Objects.equals(this.updateContactColumnActionSettings, digitalAction.updateContactColumnActionSettings) &&
            Objects.equals(this.doNotSendActionSettings, digitalAction.doNotSendActionSettings) &&
            Objects.equals(this.appendToDncActionSettings, digitalAction.appendToDncActionSettings) &&
            Objects.equals(this.markContactUncontactableActionSettings, digitalAction.markContactUncontactableActionSettings) &&
            Objects.equals(this.markContactAddressUncontactableActionSettings, digitalAction.markContactAddressUncontactableActionSettings) &&
            Objects.equals(this.setContentTemplateActionSettings, digitalAction.setContentTemplateActionSettings) &&
            Objects.equals(this.setSmsPhoneNumberActionSettings, digitalAction.setSmsPhoneNumberActionSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateContactColumnActionSettings, doNotSendActionSettings, appendToDncActionSettings, markContactUncontactableActionSettings, markContactAddressUncontactableActionSettings, setContentTemplateActionSettings, setSmsPhoneNumberActionSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalAction {\n");
    
    sb.append("    updateContactColumnActionSettings: ").append(toIndentedString(updateContactColumnActionSettings)).append("\n");
    sb.append("    doNotSendActionSettings: ").append(toIndentedString(doNotSendActionSettings)).append("\n");
    sb.append("    appendToDncActionSettings: ").append(toIndentedString(appendToDncActionSettings)).append("\n");
    sb.append("    markContactUncontactableActionSettings: ").append(toIndentedString(markContactUncontactableActionSettings)).append("\n");
    sb.append("    markContactAddressUncontactableActionSettings: ").append(toIndentedString(markContactAddressUncontactableActionSettings)).append("\n");
    sb.append("    setContentTemplateActionSettings: ").append(toIndentedString(setContentTemplateActionSettings)).append("\n");
    sb.append("    setSmsPhoneNumberActionSettings: ").append(toIndentedString(setSmsPhoneNumberActionSettings)).append("\n");
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

