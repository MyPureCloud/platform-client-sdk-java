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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UpdateContactColumnActionSettings
 */

public class UpdateContactColumnActionSettings  implements Serializable {
  
  private Map<String, String> properties = null;

  private static class UpdateOptionEnumDeserializer extends StdDeserializer<UpdateOptionEnum> {
    public UpdateOptionEnumDeserializer() {
      super(UpdateOptionEnumDeserializer.class);
    }

    @Override
    public UpdateOptionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UpdateOptionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of update to make to the specified contact column(s).
   */
 @JsonDeserialize(using = UpdateOptionEnumDeserializer.class)
  public enum UpdateOptionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SET("Set"),
    INCREMENT("Increment"),
    DECREMENT("Decrement"),
    CURRENTTIME("CurrentTime");

    private String value;

    UpdateOptionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UpdateOptionEnum fromString(String key) {
      if (key == null) return null;

      for (UpdateOptionEnum value : UpdateOptionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UpdateOptionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UpdateOptionEnum updateOption = null;

  
  /**
   * A mapping of contact columns to their new values.
   **/
  public UpdateContactColumnActionSettings properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "&quot;{phoneNumber:+11234567890}, {lastContactedTime:&quot;", required = true, value = "A mapping of contact columns to their new values.")
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  /**
   * The type of update to make to the specified contact column(s).
   **/
  public UpdateContactColumnActionSettings updateOption(UpdateOptionEnum updateOption) {
    this.updateOption = updateOption;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of update to make to the specified contact column(s).")
  @JsonProperty("updateOption")
  public UpdateOptionEnum getUpdateOption() {
    return updateOption;
  }
  public void setUpdateOption(UpdateOptionEnum updateOption) {
    this.updateOption = updateOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateContactColumnActionSettings updateContactColumnActionSettings = (UpdateContactColumnActionSettings) o;

    return Objects.equals(this.properties, updateContactColumnActionSettings.properties) &&
            Objects.equals(this.updateOption, updateContactColumnActionSettings.updateOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, updateOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContactColumnActionSettings {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    updateOption: ").append(toIndentedString(updateOption)).append("\n");
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

