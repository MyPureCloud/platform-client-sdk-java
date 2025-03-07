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
import com.mypurecloud.sdk.v2.model.NotificationTemplateParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template button object
 */
@ApiModel(description = "Template button object")

public class NotificationTemplateButton  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies the type of the button.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUICKREPLY("QuickReply"),
    PHONENUMBER("PhoneNumber"),
    URL("Url");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String text = null;
  private Long index = null;
  private String phoneNumber = null;
  private String url = null;
  private List<NotificationTemplateParameter> parameters = new ArrayList<NotificationTemplateParameter>();

  
  /**
   * Specifies the type of the button.
   **/
  public NotificationTemplateButton type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specifies the type of the button.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Button text message.
   **/
  public NotificationTemplateButton text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button text message.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * index of the button in the list.
   **/
  public NotificationTemplateButton index(Long index) {
    this.index = index;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "index of the button in the list.")
  @JsonProperty("index")
  public Long getIndex() {
    return index;
  }
  public void setIndex(Long index) {
    this.index = index;
  }


  /**
   * Button phone number.
   **/
  public NotificationTemplateButton phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button phone number.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * Button URL link.
   **/
  public NotificationTemplateButton url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button URL link.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Template parameters for placeholders in the button.
   **/
  public NotificationTemplateButton parameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template parameters for placeholders in the button.")
  @JsonProperty("parameters")
  public List<NotificationTemplateParameter> getParameters() {
    return parameters;
  }
  public void setParameters(List<NotificationTemplateParameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationTemplateButton notificationTemplateButton = (NotificationTemplateButton) o;

    return Objects.equals(this.type, notificationTemplateButton.type) &&
            Objects.equals(this.text, notificationTemplateButton.text) &&
            Objects.equals(this.index, notificationTemplateButton.index) &&
            Objects.equals(this.phoneNumber, notificationTemplateButton.phoneNumber) &&
            Objects.equals(this.url, notificationTemplateButton.url) &&
            Objects.equals(this.parameters, notificationTemplateButton.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, index, phoneNumber, url, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationTemplateButton {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

