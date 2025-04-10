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
import com.mypurecloud.sdk.v2.model.TypingSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EventSetting
 */

public class EventSetting  implements Serializable {
  
  private TypingSetting typing = null;

  public EventSetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Settings regarding typing events
   **/
  public EventSetting typing(TypingSetting typing) {
    this.typing = typing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings regarding typing events")
  @JsonProperty("typing")
  public TypingSetting getTyping() {
    return typing;
  }
  public void setTyping(TypingSetting typing) {
    this.typing = typing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSetting eventSetting = (EventSetting) o;

    return Objects.equals(this.typing, eventSetting.typing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSetting {\n");
    
    sb.append("    typing: ").append(toIndentedString(typing)).append("\n");
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

