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
import com.mypurecloud.sdk.v2.model.SettingDirection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TypingSetting
 */

public class TypingSetting  implements Serializable {
  
  private SettingDirection on = null;

  
  /**
   * Should typing indication Events be sent
   **/
  public TypingSetting on(SettingDirection on) {
    this.on = on;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Should typing indication Events be sent")
  @JsonProperty("on")
  public SettingDirection getOn() {
    return on;
  }
  public void setOn(SettingDirection on) {
    this.on = on;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypingSetting typingSetting = (TypingSetting) o;

    return Objects.equals(this.on, typingSetting.on);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypingSetting {\n");
    
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
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

