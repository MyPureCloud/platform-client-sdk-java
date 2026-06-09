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
import com.mypurecloud.sdk.v2.model.Button;
import com.mypurecloud.sdk.v2.model.CardBodyText;
import com.mypurecloud.sdk.v2.model.MessageHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CarouselCard
 */

public class CarouselCard  implements Serializable {
  
  private MessageHeader header = null;
  private List<Button> buttons = null;
  private CardBodyText cardBodyText = null;

  public CarouselCard() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      buttons = new ArrayList<Button>();
    }
  }

  public CarouselCard(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      buttons = new ArrayList<Button>();
    }
  }

  
  /**
   * Header for whatsApp carousel card
   **/
  public CarouselCard header(MessageHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Header for whatsApp carousel card")
  @JsonProperty("header")
  public MessageHeader getHeader() {
    return header;
  }
  public void setHeader(MessageHeader header) {
    this.header = header;
  }


  /**
   * List of buttons to be included in the whatsApp carousel messages template
   **/
  public CarouselCard buttons(List<Button> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of buttons to be included in the whatsApp carousel messages template")
  @JsonProperty("buttons")
  public List<Button> getButtons() {
    return buttons;
  }
  public void setButtons(List<Button> buttons) {
    this.buttons = buttons;
  }


  /**
   * Optional card body text to be included in the whatsApp carousel messages template
   **/
  public CarouselCard cardBodyText(CardBodyText cardBodyText) {
    this.cardBodyText = cardBodyText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional card body text to be included in the whatsApp carousel messages template")
  @JsonProperty("cardBodyText")
  public CardBodyText getCardBodyText() {
    return cardBodyText;
  }
  public void setCardBodyText(CardBodyText cardBodyText) {
    this.cardBodyText = cardBodyText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarouselCard carouselCard = (CarouselCard) o;

    return Objects.equals(this.header, carouselCard.header) &&
            Objects.equals(this.buttons, carouselCard.buttons) &&
            Objects.equals(this.cardBodyText, carouselCard.cardBodyText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, buttons, cardBodyText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselCard {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    cardBodyText: ").append(toIndentedString(cardBodyText)).append("\n");
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

