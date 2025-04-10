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
 * GenerateMeetingIdRequest
 */

public class GenerateMeetingIdRequest  implements Serializable {
  
  private String conferenceId = null;
  private Boolean ephemeral = null;
  private Integer expireTimeDays = null;

  public GenerateMeetingIdRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The conferenceId for which to generate a meetingId
   **/
  public GenerateMeetingIdRequest conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conferenceId for which to generate a meetingId")
  @JsonProperty("conferenceId")
  public String getConferenceId() {
    return conferenceId;
  }
  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  /**
   * Boolean flag for ephemeral status of the created record
   **/
  public GenerateMeetingIdRequest ephemeral(Boolean ephemeral) {
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
   * Number of days the meetingId record will remain active
   **/
  public GenerateMeetingIdRequest expireTimeDays(Integer expireTimeDays) {
    this.expireTimeDays = expireTimeDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of days the meetingId record will remain active")
  @JsonProperty("expireTimeDays")
  public Integer getExpireTimeDays() {
    return expireTimeDays;
  }
  public void setExpireTimeDays(Integer expireTimeDays) {
    this.expireTimeDays = expireTimeDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateMeetingIdRequest generateMeetingIdRequest = (GenerateMeetingIdRequest) o;

    return Objects.equals(this.conferenceId, generateMeetingIdRequest.conferenceId) &&
            Objects.equals(this.ephemeral, generateMeetingIdRequest.ephemeral) &&
            Objects.equals(this.expireTimeDays, generateMeetingIdRequest.expireTimeDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conferenceId, ephemeral, expireTimeDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateMeetingIdRequest {\n");
    
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    expireTimeDays: ").append(toIndentedString(expireTimeDays)).append("\n");
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

