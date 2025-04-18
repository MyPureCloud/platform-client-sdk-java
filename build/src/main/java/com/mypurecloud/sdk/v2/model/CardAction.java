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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A card action that a user can take.
 */
@ApiModel(description = "A card action that a user can take.")

public class CardAction  implements Serializable {
  

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
   * Describes the type of action.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LINK("Link"),
    POSTBACK("Postback");

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
  private String payload = null;
  private String url = null;
  private Boolean isSelected = null;

  public CardAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Describes the type of action.
   **/
  public CardAction type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the type of action.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The response text from the button click.
   **/
  public CardAction text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The response text from the button click.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Content of the textback payload after clicking a button.
   **/
  public CardAction payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content of the textback payload after clicking a button.")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }


  /**
   * The location of the image file associated with action.
   **/
  public CardAction url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The location of the image file associated with action.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Indicates if the card option is selected by end customer.
   **/
  public CardAction isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the card option is selected by end customer.")
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
    CardAction cardAction = (CardAction) o;

    return Objects.equals(this.type, cardAction.type) &&
            Objects.equals(this.text, cardAction.text) &&
            Objects.equals(this.payload, cardAction.payload) &&
            Objects.equals(this.url, cardAction.url) &&
            Objects.equals(this.isSelected, cardAction.isSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, payload, url, isSelected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

