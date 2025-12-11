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
import com.mypurecloud.sdk.v2.model.ConversationNotificationTemplateCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Template carousel object.
 */
@ApiModel(description = "Template carousel object.")

public class ConversationNotificationTemplateCarousel  implements Serializable {
  
  private List<ConversationNotificationTemplateCard> cards = null;

  public ConversationNotificationTemplateCarousel() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      cards = new ArrayList<ConversationNotificationTemplateCard>();
    }
  }

  
  /**
   * An array of template card objects.
   **/
  public ConversationNotificationTemplateCarousel cards(List<ConversationNotificationTemplateCard> cards) {
    this.cards = cards;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of template card objects.")
  @JsonProperty("cards")
  public List<ConversationNotificationTemplateCard> getCards() {
    return cards;
  }
  public void setCards(List<ConversationNotificationTemplateCard> cards) {
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
    ConversationNotificationTemplateCarousel conversationNotificationTemplateCarousel = (ConversationNotificationTemplateCarousel) o;

    return Objects.equals(this.cards, conversationNotificationTemplateCarousel.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationTemplateCarousel {\n");
    
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

