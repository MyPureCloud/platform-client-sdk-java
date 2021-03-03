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
import com.mypurecloud.sdk.v2.model.CloseButtonStyleProperties;
import com.mypurecloud.sdk.v2.model.ContentOfferStyleProperties;
import com.mypurecloud.sdk.v2.model.ContentPositionProperties;
import com.mypurecloud.sdk.v2.model.CtaButtonStyleProperties;
import com.mypurecloud.sdk.v2.model.TextStyleProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContentOfferStylingConfiguration
 */

public class ContentOfferStylingConfiguration  implements Serializable {
  
  private ContentPositionProperties position = null;
  private ContentOfferStyleProperties offer = null;
  private CloseButtonStyleProperties closeButton = null;
  private CtaButtonStyleProperties ctaButton = null;
  private TextStyleProperties title = null;
  private TextStyleProperties headline = null;
  private TextStyleProperties body = null;

  
  /**
   * Properties for customizing the positioning of the content offer.
   **/
  public ContentOfferStylingConfiguration position(ContentPositionProperties position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the positioning of the content offer.")
  @JsonProperty("position")
  public ContentPositionProperties getPosition() {
    return position;
  }
  public void setPosition(ContentPositionProperties position) {
    this.position = position;
  }

  
  /**
   * Properties for customizing the appearance of the content offer.
   **/
  public ContentOfferStylingConfiguration offer(ContentOfferStyleProperties offer) {
    this.offer = offer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the content offer.")
  @JsonProperty("offer")
  public ContentOfferStyleProperties getOffer() {
    return offer;
  }
  public void setOffer(ContentOfferStyleProperties offer) {
    this.offer = offer;
  }

  
  /**
   * Properties for customizing the appearance of the close button.
   **/
  public ContentOfferStylingConfiguration closeButton(CloseButtonStyleProperties closeButton) {
    this.closeButton = closeButton;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the close button.")
  @JsonProperty("closeButton")
  public CloseButtonStyleProperties getCloseButton() {
    return closeButton;
  }
  public void setCloseButton(CloseButtonStyleProperties closeButton) {
    this.closeButton = closeButton;
  }

  
  /**
   * Properties for customizing the appearance of the CTA button.
   **/
  public ContentOfferStylingConfiguration ctaButton(CtaButtonStyleProperties ctaButton) {
    this.ctaButton = ctaButton;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the CTA button.")
  @JsonProperty("ctaButton")
  public CtaButtonStyleProperties getCtaButton() {
    return ctaButton;
  }
  public void setCtaButton(CtaButtonStyleProperties ctaButton) {
    this.ctaButton = ctaButton;
  }

  
  /**
   * Properties for customizing the appearance of the title text.
   **/
  public ContentOfferStylingConfiguration title(TextStyleProperties title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the title text.")
  @JsonProperty("title")
  public TextStyleProperties getTitle() {
    return title;
  }
  public void setTitle(TextStyleProperties title) {
    this.title = title;
  }

  
  /**
   * Properties for customizing the appearance of the headline text.
   **/
  public ContentOfferStylingConfiguration headline(TextStyleProperties headline) {
    this.headline = headline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the headline text.")
  @JsonProperty("headline")
  public TextStyleProperties getHeadline() {
    return headline;
  }
  public void setHeadline(TextStyleProperties headline) {
    this.headline = headline;
  }

  
  /**
   * Properties for customizing the appearance of the body text.
   **/
  public ContentOfferStylingConfiguration body(TextStyleProperties body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the body text.")
  @JsonProperty("body")
  public TextStyleProperties getBody() {
    return body;
  }
  public void setBody(TextStyleProperties body) {
    this.body = body;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentOfferStylingConfiguration contentOfferStylingConfiguration = (ContentOfferStylingConfiguration) o;
    return Objects.equals(this.position, contentOfferStylingConfiguration.position) &&
        Objects.equals(this.offer, contentOfferStylingConfiguration.offer) &&
        Objects.equals(this.closeButton, contentOfferStylingConfiguration.closeButton) &&
        Objects.equals(this.ctaButton, contentOfferStylingConfiguration.ctaButton) &&
        Objects.equals(this.title, contentOfferStylingConfiguration.title) &&
        Objects.equals(this.headline, contentOfferStylingConfiguration.headline) &&
        Objects.equals(this.body, contentOfferStylingConfiguration.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, offer, closeButton, ctaButton, title, headline, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentOfferStylingConfiguration {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    closeButton: ").append(toIndentedString(closeButton)).append("\n");
    sb.append("    ctaButton: ").append(toIndentedString(ctaButton)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

