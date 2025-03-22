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
import com.mypurecloud.sdk.v2.model.OutboundOnlySetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OpenRichMediaSetting
 */

public class OpenRichMediaSetting  implements Serializable {
  
  private OutboundOnlySetting quickReply = null;
  private OutboundOnlySetting cards = null;

  
  /**
   * Setting relating to quick replies
   **/
  public OpenRichMediaSetting quickReply(OutboundOnlySetting quickReply) {
    this.quickReply = quickReply;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting relating to quick replies")
  @JsonProperty("quickReply")
  public OutboundOnlySetting getQuickReply() {
    return quickReply;
  }
  public void setQuickReply(OutboundOnlySetting quickReply) {
    this.quickReply = quickReply;
  }


  /**
   * Setting relating to cards
   **/
  public OpenRichMediaSetting cards(OutboundOnlySetting cards) {
    this.cards = cards;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting relating to cards")
  @JsonProperty("cards")
  public OutboundOnlySetting getCards() {
    return cards;
  }
  public void setCards(OutboundOnlySetting cards) {
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
    OpenRichMediaSetting openRichMediaSetting = (OpenRichMediaSetting) o;

    return Objects.equals(this.quickReply, openRichMediaSetting.quickReply) &&
            Objects.equals(this.cards, openRichMediaSetting.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quickReply, cards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenRichMediaSetting {\n");
    
    sb.append("    quickReply: ").append(toIndentedString(quickReply)).append("\n");
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

