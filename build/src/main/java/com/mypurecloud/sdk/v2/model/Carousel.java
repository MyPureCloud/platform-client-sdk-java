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
import com.mypurecloud.sdk.v2.model.CarouselCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A WhatsApp Carousel messaging template definition
 */
@ApiModel(description = "A WhatsApp Carousel messaging template definition")

public class Carousel  implements Serializable {
  
  private List<CarouselCard> cards = null;

  public Carousel() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      cards = new ArrayList<CarouselCard>();
    }
  }

  public Carousel(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      cards = new ArrayList<CarouselCard>();
    }
  }

  
  /**
   * List of cards in a carousels template.
   **/
  public Carousel cards(List<CarouselCard> cards) {
    this.cards = cards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of cards in a carousels template.")
  @JsonProperty("cards")
  public List<CarouselCard> getCards() {
    return cards;
  }
  public void setCards(List<CarouselCard> cards) {
    this.cards = cards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carousel carousel = (Carousel) o;

    return Objects.equals(this.cards, carousel.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carousel {\n");
    
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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

