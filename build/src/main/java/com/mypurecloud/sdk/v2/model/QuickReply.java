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
 * QuickReply
 */

public class QuickReply  implements Serializable {
  
  private String text = null;
  private String payload = null;
  private String url = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies the type of action that is triggered upon clicking the quick reply. Currently, the only supported action is \"Message\" which sends a message using the quick reply text.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MESSAGE("Message");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;
  private Boolean isSelected = null;

  
  /**
   * Text to show inside the quick reply. This is also used as the response text after clicking on the quick reply.
   **/
  public QuickReply text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show inside the quick reply. This is also used as the response text after clicking on the quick reply.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Content of the textback payload after clicking a quick reply
   **/
  public QuickReply payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the textback payload after clicking a quick reply")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }

  
  /**
   * The location of the image file associated with quick reply
   **/
  public QuickReply url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the image file associated with quick reply")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * Specifies the type of action that is triggered upon clicking the quick reply. Currently, the only supported action is \"Message\" which sends a message using the quick reply text.
   **/
  public QuickReply action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the type of action that is triggered upon clicking the quick reply. Currently, the only supported action is \"Message\" which sends a message using the quick reply text.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * Indicates if the quick reply option is selected by end customer
   **/
  public QuickReply isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the quick reply option is selected by end customer")
  @JsonProperty("isSelected")
  public Boolean getIsSelected() {
    return isSelected;
  }
  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickReply quickReply = (QuickReply) o;
    return Objects.equals(this.text, quickReply.text) &&
        Objects.equals(this.payload, quickReply.payload) &&
        Objects.equals(this.url, quickReply.url) &&
        Objects.equals(this.action, quickReply.action) &&
        Objects.equals(this.isSelected, quickReply.isSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, payload, url, action, isSelected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickReply {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
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

