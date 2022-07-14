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
 * Contains localized labels used in messenger apps
 */
@ApiModel(description = "Contains localized labels used in messenger apps")

public class LocalizedLabels  implements Serializable {
  

  private static class KeyEnumDeserializer extends StdDeserializer<KeyEnum> {
    public KeyEnumDeserializer() {
      super(KeyEnumDeserializer.class);
    }

    @Override
    public KeyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KeyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Contains localized label key used in messenger homescreen
   */
 @JsonDeserialize(using = KeyEnumDeserializer.class)
  public enum KeyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MESSENGERHOMEHEADERTITLE("MessengerHomeHeaderTitle"),
    MESSENGERHOMEHEADERSUBTITLE("MessengerHomeHeaderSubTitle");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KeyEnum fromString(String key) {
      if (key == null) return null;

      for (KeyEnum value : KeyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KeyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KeyEnum key = null;
  private String value = null;

  
  /**
   * Contains localized label key used in messenger homescreen
   **/
  public LocalizedLabels key(KeyEnum key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains localized label key used in messenger homescreen")
  @JsonProperty("key")
  public KeyEnum getKey() {
    return key;
  }
  public void setKey(KeyEnum key) {
    this.key = key;
  }


  /**
   * Contains localized label value used in messenger homescreen
   **/
  public LocalizedLabels value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains localized label value used in messenger homescreen")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedLabels localizedLabels = (LocalizedLabels) o;

    return Objects.equals(this.key, localizedLabels.key) &&
            Objects.equals(this.value, localizedLabels.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedLabels {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

