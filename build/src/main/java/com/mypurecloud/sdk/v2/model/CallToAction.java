package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CallToAction
 */

public class CallToAction  implements Serializable {
  
  private String text = null;
  private String url = null;

  private static class TargetEnumDeserializer extends StdDeserializer<TargetEnum> {
    public TargetEnumDeserializer() {
      super(TargetEnumDeserializer.class);
    }

    @Override
    public TargetEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TargetEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Where the URL should be opened when the user clicks on the call to action button.
   */
 @JsonDeserialize(using = TargetEnumDeserializer.class)
  public enum TargetEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BLANK("Blank"),
    SELF("Self");

    private String value;

    TargetEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TargetEnum fromString(String key) {
      if (key == null) return null;

      for (TargetEnum value : TargetEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TargetEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TargetEnum target = null;

  
  /**
   * Text displayed on the call to action button.
   **/
  public CallToAction text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text displayed on the call to action button.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * URL to open when user clicks on the call to action button.
   **/
  public CallToAction url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL to open when user clicks on the call to action button.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Where the URL should be opened when the user clicks on the call to action button.
   **/
  public CallToAction target(TargetEnum target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Where the URL should be opened when the user clicks on the call to action button.")
  @JsonProperty("target")
  public TargetEnum getTarget() {
    return target;
  }
  public void setTarget(TargetEnum target) {
    this.target = target;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallToAction callToAction = (CallToAction) o;
    return Objects.equals(this.text, callToAction.text) &&
        Objects.equals(this.url, callToAction.url) &&
        Objects.equals(this.target, callToAction.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, url, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallToAction {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

