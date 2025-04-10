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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SetContentTemplateActionSettings
 */

public class SetContentTemplateActionSettings  implements Serializable {
  
  private String smsContentTemplateId = null;
  private String emailContentTemplateId = null;

  public SetContentTemplateActionSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A string of sms contentTemplateId.
   **/
  public SetContentTemplateActionSettings smsContentTemplateId(String smsContentTemplateId) {
    this.smsContentTemplateId = smsContentTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A string of sms contentTemplateId.")
  @JsonProperty("smsContentTemplateId")
  public String getSmsContentTemplateId() {
    return smsContentTemplateId;
  }
  public void setSmsContentTemplateId(String smsContentTemplateId) {
    this.smsContentTemplateId = smsContentTemplateId;
  }


  /**
   * A string of email contentTemplateId.
   **/
  public SetContentTemplateActionSettings emailContentTemplateId(String emailContentTemplateId) {
    this.emailContentTemplateId = emailContentTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A string of email contentTemplateId.")
  @JsonProperty("emailContentTemplateId")
  public String getEmailContentTemplateId() {
    return emailContentTemplateId;
  }
  public void setEmailContentTemplateId(String emailContentTemplateId) {
    this.emailContentTemplateId = emailContentTemplateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetContentTemplateActionSettings setContentTemplateActionSettings = (SetContentTemplateActionSettings) o;

    return Objects.equals(this.smsContentTemplateId, setContentTemplateActionSettings.smsContentTemplateId) &&
            Objects.equals(this.emailContentTemplateId, setContentTemplateActionSettings.emailContentTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smsContentTemplateId, emailContentTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetContentTemplateActionSettings {\n");
    
    sb.append("    smsContentTemplateId: ").append(toIndentedString(smsContentTemplateId)).append("\n");
    sb.append("    emailContentTemplateId: ").append(toIndentedString(emailContentTemplateId)).append("\n");
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

