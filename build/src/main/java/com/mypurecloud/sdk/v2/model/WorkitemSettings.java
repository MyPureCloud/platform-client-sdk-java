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
 * WorkitemSettings
 */

public class WorkitemSettings  implements Serializable {
  
  private String worktypeId = null;

  public WorkitemSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WorkitemSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The UUID of the Worktype.
   **/
  public WorkitemSettings worktypeId(String worktypeId) {
    this.worktypeId = worktypeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UUID of the Worktype.")
  @JsonProperty("worktypeId")
  public String getWorktypeId() {
    return worktypeId;
  }
  public void setWorktypeId(String worktypeId) {
    this.worktypeId = worktypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemSettings workitemSettings = (WorkitemSettings) o;

    return Objects.equals(this.worktypeId, workitemSettings.worktypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worktypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemSettings {\n");
    
    sb.append("    worktypeId: ").append(toIndentedString(worktypeId)).append("\n");
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

