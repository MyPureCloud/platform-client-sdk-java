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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Settings for a user&#39;s mobile notifications
 */
@ApiModel(description = "Settings for a user's mobile notifications")

public class MobileNotificationSettings  implements Serializable {
  

  private static class WhenEnumDeserializer extends StdDeserializer<WhenEnum> {
    public WhenEnumDeserializer() {
      super(WhenEnumDeserializer.class);
    }

    @Override
    public WhenEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WhenEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * When the user should receive notifications
   */
 @JsonDeserialize(using = WhenEnumDeserializer.class)
  public enum WhenEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALWAYS("Always"),
    ONLYWHENINACTIVE("OnlyWhenInactive");

    private String value;

    WhenEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WhenEnum fromString(String key) {
      if (key == null) return null;

      for (WhenEnum value : WhenEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WhenEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WhenEnum when = null;

  
  /**
   * When the user should receive notifications
   **/
  public MobileNotificationSettings when(WhenEnum when) {
    this.when = when;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When the user should receive notifications")
  @JsonProperty("when")
  public WhenEnum getWhen() {
    return when;
  }
  public void setWhen(WhenEnum when) {
    this.when = when;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileNotificationSettings mobileNotificationSettings = (MobileNotificationSettings) o;

    return Objects.equals(this.when, mobileNotificationSettings.when);
  }

  @Override
  public int hashCode() {
    return Objects.hash(when);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileNotificationSettings {\n");
    
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

