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
import com.mypurecloud.sdk.v2.model.ActivityCodeReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuActivitySettingsResponse
 */

public class BuActivitySettingsResponse  implements Serializable {
  
  private ActivityCodeReference defaultActivityCode = null;

  
  /**
   * Default Activity Code settings
   **/
  public BuActivitySettingsResponse defaultActivityCode(ActivityCodeReference defaultActivityCode) {
    this.defaultActivityCode = defaultActivityCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default Activity Code settings")
  @JsonProperty("defaultActivityCode")
  public ActivityCodeReference getDefaultActivityCode() {
    return defaultActivityCode;
  }
  public void setDefaultActivityCode(ActivityCodeReference defaultActivityCode) {
    this.defaultActivityCode = defaultActivityCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuActivitySettingsResponse buActivitySettingsResponse = (BuActivitySettingsResponse) o;

    return Objects.equals(this.defaultActivityCode, buActivitySettingsResponse.defaultActivityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultActivityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuActivitySettingsResponse {\n");
    
    sb.append("    defaultActivityCode: ").append(toIndentedString(defaultActivityCode)).append("\n");
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

