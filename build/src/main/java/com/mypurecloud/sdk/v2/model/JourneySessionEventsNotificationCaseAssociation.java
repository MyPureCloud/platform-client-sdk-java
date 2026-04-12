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
import java.util.Date;

import java.io.Serializable;
/**
 * JourneySessionEventsNotificationCaseAssociation
 */

public class JourneySessionEventsNotificationCaseAssociation  implements Serializable {
  
  private String caseId = null;
  private String caseReference = null;
  private Date dateAssociated = null;

  public JourneySessionEventsNotificationCaseAssociation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneySessionEventsNotificationCaseAssociation caseId(String caseId) {
    this.caseId = caseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("caseId")
  public String getCaseId() {
    return caseId;
  }
  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }


  /**
   **/
  public JourneySessionEventsNotificationCaseAssociation caseReference(String caseReference) {
    this.caseReference = caseReference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("caseReference")
  public String getCaseReference() {
    return caseReference;
  }
  public void setCaseReference(String caseReference) {
    this.caseReference = caseReference;
  }


  /**
   **/
  public JourneySessionEventsNotificationCaseAssociation dateAssociated(Date dateAssociated) {
    this.dateAssociated = dateAssociated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateAssociated")
  public Date getDateAssociated() {
    return dateAssociated;
  }
  public void setDateAssociated(Date dateAssociated) {
    this.dateAssociated = dateAssociated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneySessionEventsNotificationCaseAssociation journeySessionEventsNotificationCaseAssociation = (JourneySessionEventsNotificationCaseAssociation) o;

    return Objects.equals(this.caseId, journeySessionEventsNotificationCaseAssociation.caseId) &&
            Objects.equals(this.caseReference, journeySessionEventsNotificationCaseAssociation.caseReference) &&
            Objects.equals(this.dateAssociated, journeySessionEventsNotificationCaseAssociation.dateAssociated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseId, caseReference, dateAssociated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySessionEventsNotificationCaseAssociation {\n");
    
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    caseReference: ").append(toIndentedString(caseReference)).append("\n");
    sb.append("    dateAssociated: ").append(toIndentedString(dateAssociated)).append("\n");
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

