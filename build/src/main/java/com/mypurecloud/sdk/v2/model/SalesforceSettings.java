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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SalesforceSettings
 */

public class SalesforceSettings  implements Serializable {
  

  private static class ChannelEnumDeserializer extends StdDeserializer<ChannelEnum> {
    public ChannelEnumDeserializer() {
      super(ChannelEnumDeserializer.class);
    }

    @Override
    public ChannelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ChannelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Filter source by channel.
   */
 @JsonDeserialize(using = ChannelEnumDeserializer.class)
  public enum ChannelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APP("App"),
    PKB("Pkb"),
    CSP("Csp"),
    PRM("Prm");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChannelEnum fromString(String key) {
      if (key == null) return null;

      for (ChannelEnum value : ChannelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ChannelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ChannelEnum channel = null;
  private String language = null;
  private List<String> categories = new ArrayList<String>();

  
  /**
   * Filter source by channel.
   **/
  public SalesforceSettings channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter source by channel.")
  @JsonProperty("channel")
  public ChannelEnum getChannel() {
    return channel;
  }
  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  /**
   * Filter source by language.
   **/
  public SalesforceSettings language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter source by language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Filter source by categories.
   **/
  public SalesforceSettings categories(List<String> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter source by categories.")
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesforceSettings salesforceSettings = (SalesforceSettings) o;

    return Objects.equals(this.channel, salesforceSettings.channel) &&
            Objects.equals(this.language, salesforceSettings.language) &&
            Objects.equals(this.categories, salesforceSettings.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, language, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesforceSettings {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

