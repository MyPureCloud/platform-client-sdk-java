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
 * PresenceSetting
 */

public class PresenceSetting  implements Serializable {
  
  private SettingDirection join = null;

  
  /**
   * Should Presence Events be sent
   **/
  public PresenceSetting join(SettingDirection join) {
    this.join = join;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Should Presence Events be sent")
  @JsonProperty("join")
  public SettingDirection getJoin() {
    return join;
  }
  public void setJoin(SettingDirection join) {
    this.join = join;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresenceSetting presenceSetting = (PresenceSetting) o;

    return Objects.equals(this.join, presenceSetting.join);
  }

  @Override
  public int hashCode() {
    return Objects.hash(join);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceSetting {\n");
    
    sb.append("    join: ").append(toIndentedString(join)).append("\n");
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

