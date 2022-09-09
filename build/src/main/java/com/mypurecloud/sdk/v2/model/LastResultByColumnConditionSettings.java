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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LastResultByColumnConditionSettings
 */

public class LastResultByColumnConditionSettings  implements Serializable {
  
  private String emailColumnName = null;
  private List<String> emailWrapupCodes = new ArrayList<String>();
  private String smsColumnName = null;
  private List<String> smsWrapupCodes = new ArrayList<String>();

  
  /**
   * The name of the contact column to evaluate for Email.
   **/
  public LastResultByColumnConditionSettings emailColumnName(String emailColumnName) {
    this.emailColumnName = emailColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the contact column to evaluate for Email.")
  @JsonProperty("emailColumnName")
  public String getEmailColumnName() {
    return emailColumnName;
  }
  public void setEmailColumnName(String emailColumnName) {
    this.emailColumnName = emailColumnName;
  }


  /**
   * A list of wrapup code identifiers to match for Email.
   **/
  public LastResultByColumnConditionSettings emailWrapupCodes(List<String> emailWrapupCodes) {
    this.emailWrapupCodes = emailWrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of wrapup code identifiers to match for Email.")
  @JsonProperty("emailWrapupCodes")
  public List<String> getEmailWrapupCodes() {
    return emailWrapupCodes;
  }
  public void setEmailWrapupCodes(List<String> emailWrapupCodes) {
    this.emailWrapupCodes = emailWrapupCodes;
  }


  /**
   * The name of the contact column to evaluate for SMS.
   **/
  public LastResultByColumnConditionSettings smsColumnName(String smsColumnName) {
    this.smsColumnName = smsColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the contact column to evaluate for SMS.")
  @JsonProperty("smsColumnName")
  public String getSmsColumnName() {
    return smsColumnName;
  }
  public void setSmsColumnName(String smsColumnName) {
    this.smsColumnName = smsColumnName;
  }


  /**
   * A list of wrapup code identifiers to match for SMS.
   **/
  public LastResultByColumnConditionSettings smsWrapupCodes(List<String> smsWrapupCodes) {
    this.smsWrapupCodes = smsWrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of wrapup code identifiers to match for SMS.")
  @JsonProperty("smsWrapupCodes")
  public List<String> getSmsWrapupCodes() {
    return smsWrapupCodes;
  }
  public void setSmsWrapupCodes(List<String> smsWrapupCodes) {
    this.smsWrapupCodes = smsWrapupCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastResultByColumnConditionSettings lastResultByColumnConditionSettings = (LastResultByColumnConditionSettings) o;

    return Objects.equals(this.emailColumnName, lastResultByColumnConditionSettings.emailColumnName) &&
            Objects.equals(this.emailWrapupCodes, lastResultByColumnConditionSettings.emailWrapupCodes) &&
            Objects.equals(this.smsColumnName, lastResultByColumnConditionSettings.smsColumnName) &&
            Objects.equals(this.smsWrapupCodes, lastResultByColumnConditionSettings.smsWrapupCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailColumnName, emailWrapupCodes, smsColumnName, smsWrapupCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastResultByColumnConditionSettings {\n");
    
    sb.append("    emailColumnName: ").append(toIndentedString(emailColumnName)).append("\n");
    sb.append("    emailWrapupCodes: ").append(toIndentedString(emailWrapupCodes)).append("\n");
    sb.append("    smsColumnName: ").append(toIndentedString(smsColumnName)).append("\n");
    sb.append("    smsWrapupCodes: ").append(toIndentedString(smsWrapupCodes)).append("\n");
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

