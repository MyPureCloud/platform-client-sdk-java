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
 * MeetingIdRecord
 */

public class MeetingIdRecord  implements Serializable {
  
  private String id = null;
  private Boolean ephemeral = null;
  private String conferenceId = null;
  private Date dateExpired = null;
  private String selfUri = null;

  public MeetingIdRecord() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Boolean flag for ephemeral status of the created record
   **/
  public MeetingIdRecord ephemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean flag for ephemeral status of the created record")
  @JsonProperty("ephemeral")
  public Boolean getEphemeral() {
    return ephemeral;
  }
  public void setEphemeral(Boolean ephemeral) {
    this.ephemeral = ephemeral;
  }


  /**
   * The conferenceId used to generate a meetingId
   **/
  public MeetingIdRecord conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conferenceId used to generate a meetingId")
  @JsonProperty("conferenceId")
  public String getConferenceId() {
    return conferenceId;
  }
  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  /**
   * Instant at which the meetingId record will no longer be considered active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MeetingIdRecord dateExpired(Date dateExpired) {
    this.dateExpired = dateExpired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Instant at which the meetingId record will no longer be considered active. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpired")
  public Date getDateExpired() {
    return dateExpired;
  }
  public void setDateExpired(Date dateExpired) {
    this.dateExpired = dateExpired;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeetingIdRecord meetingIdRecord = (MeetingIdRecord) o;

    return Objects.equals(this.id, meetingIdRecord.id) &&
            Objects.equals(this.ephemeral, meetingIdRecord.ephemeral) &&
            Objects.equals(this.conferenceId, meetingIdRecord.conferenceId) &&
            Objects.equals(this.dateExpired, meetingIdRecord.dateExpired) &&
            Objects.equals(this.selfUri, meetingIdRecord.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ephemeral, conferenceId, dateExpired, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeetingIdRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

