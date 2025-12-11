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
 * ChecklistFinalizePayload
 */

public class ChecklistFinalizePayload  implements Serializable {
  
  private String exitReason = null;

  public ChecklistFinalizePayload() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Exit reason provided at the time of finalizing the checklist.
   **/
  public ChecklistFinalizePayload exitReason(String exitReason) {
    this.exitReason = exitReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Exit reason provided at the time of finalizing the checklist.")
  @JsonProperty("exitReason")
  public String getExitReason() {
    return exitReason;
  }
  public void setExitReason(String exitReason) {
    this.exitReason = exitReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecklistFinalizePayload checklistFinalizePayload = (ChecklistFinalizePayload) o;

    return Objects.equals(this.exitReason, checklistFinalizePayload.exitReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exitReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecklistFinalizePayload {\n");
    
    sb.append("    exitReason: ").append(toIndentedString(exitReason)).append("\n");
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

