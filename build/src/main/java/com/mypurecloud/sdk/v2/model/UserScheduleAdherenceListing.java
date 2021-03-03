package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserScheduleAdherenceListing
 */

public class UserScheduleAdherenceListing  implements Serializable {
  
  private List<UserScheduleAdherence> entities = new ArrayList<UserScheduleAdherence>();
  private String downloadUrl = null;

  
  /**
   **/
  public UserScheduleAdherenceListing entities(List<UserScheduleAdherence> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<UserScheduleAdherence> getEntities() {
    return entities;
  }
  public void setEntities(List<UserScheduleAdherence> entities) {
    this.entities = entities;
  }

  
  @ApiModelProperty(example = "null", value = "The downloadUrl if the response is too large to send directly via http response")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserScheduleAdherenceListing userScheduleAdherenceListing = (UserScheduleAdherenceListing) o;
    return Objects.equals(this.entities, userScheduleAdherenceListing.entities) &&
        Objects.equals(this.downloadUrl, userScheduleAdherenceListing.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserScheduleAdherenceListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

