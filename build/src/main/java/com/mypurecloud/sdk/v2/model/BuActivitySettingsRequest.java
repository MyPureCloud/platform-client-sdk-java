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
 * BuActivitySettingsRequest
 */

public class BuActivitySettingsRequest  implements Serializable {
  
  private String defaultActivityCodeId = null;

  public BuActivitySettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the activity code. This is the activity code that will be used by default for agent development activities added to the schedule
   **/
  public BuActivitySettingsRequest defaultActivityCodeId(String defaultActivityCodeId) {
    this.defaultActivityCodeId = defaultActivityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the activity code. This is the activity code that will be used by default for agent development activities added to the schedule")
  @JsonProperty("defaultActivityCodeId")
  public String getDefaultActivityCodeId() {
    return defaultActivityCodeId;
  }
  public void setDefaultActivityCodeId(String defaultActivityCodeId) {
    this.defaultActivityCodeId = defaultActivityCodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuActivitySettingsRequest buActivitySettingsRequest = (BuActivitySettingsRequest) o;

    return Objects.equals(this.defaultActivityCodeId, buActivitySettingsRequest.defaultActivityCodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultActivityCodeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuActivitySettingsRequest {\n");
    
    sb.append("    defaultActivityCodeId: ").append(toIndentedString(defaultActivityCodeId)).append("\n");
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

