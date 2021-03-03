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
import com.mypurecloud.sdk.v2.model.PatchCloseButtonStyleProperties;
import com.mypurecloud.sdk.v2.model.PatchContentOfferStyleProperties;
import com.mypurecloud.sdk.v2.model.PatchContentPositionProperties;
import com.mypurecloud.sdk.v2.model.PatchCtaButtonStyleProperties;
import com.mypurecloud.sdk.v2.model.PatchTextStyleProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchContentOfferStylingConfiguration
 */

public class PatchContentOfferStylingConfiguration  implements Serializable {
  
  private PatchContentPositionProperties position = null;
  private PatchContentOfferStyleProperties offer = null;
  private PatchCloseButtonStyleProperties closeButton = null;
  private PatchCtaButtonStyleProperties ctaButton = null;
  private PatchTextStyleProperties title = null;
  private PatchTextStyleProperties headline = null;
  private PatchTextStyleProperties body = null;

  
  /**
   * Properties for customizing the positioning of the content offer.
   **/
  public PatchContentOfferStylingConfiguration position(PatchContentPositionProperties position) {
    this.position = position;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the positioning of the content offer.")
  @JsonProperty("position")
  public PatchContentPositionProperties getPosition() {
    return position;
  }
  public void setPosition(PatchContentPositionProperties position) {
    this.position = position;
  }

  
  /**
   * Properties for customizing the appearance of the content offer.
   **/
  public PatchContentOfferStylingConfiguration offer(PatchContentOfferStyleProperties offer) {
    this.offer = offer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the content offer.")
  @JsonProperty("offer")
  public PatchContentOfferStyleProperties getOffer() {
    return offer;
  }
  public void setOffer(PatchContentOfferStyleProperties offer) {
    this.offer = offer;
  }

  
  /**
   * Properties for customizing the appearance of the close button.
   **/
  public PatchContentOfferStylingConfiguration closeButton(PatchCloseButtonStyleProperties closeButton) {
    this.closeButton = closeButton;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the close button.")
  @JsonProperty("closeButton")
  public PatchCloseButtonStyleProperties getCloseButton() {
    return closeButton;
  }
  public void setCloseButton(PatchCloseButtonStyleProperties closeButton) {
    this.closeButton = closeButton;
  }

  
  /**
   * Properties for customizing the appearance of the CTA button.
   **/
  public PatchContentOfferStylingConfiguration ctaButton(PatchCtaButtonStyleProperties ctaButton) {
    this.ctaButton = ctaButton;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the CTA button.")
  @JsonProperty("ctaButton")
  public PatchCtaButtonStyleProperties getCtaButton() {
    return ctaButton;
  }
  public void setCtaButton(PatchCtaButtonStyleProperties ctaButton) {
    this.ctaButton = ctaButton;
  }

  
  /**
   * Properties for customizing the appearance of the title text.
   **/
  public PatchContentOfferStylingConfiguration title(PatchTextStyleProperties title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the title text.")
  @JsonProperty("title")
  public PatchTextStyleProperties getTitle() {
    return title;
  }
  public void setTitle(PatchTextStyleProperties title) {
    this.title = title;
  }

  
  /**
   * Properties for customizing the appearance of the headline text.
   **/
  public PatchContentOfferStylingConfiguration headline(PatchTextStyleProperties headline) {
    this.headline = headline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the headline text.")
  @JsonProperty("headline")
  public PatchTextStyleProperties getHeadline() {
    return headline;
  }
  public void setHeadline(PatchTextStyleProperties headline) {
    this.headline = headline;
  }

  
  /**
   * Properties for customizing the appearance of the body text.
   **/
  public PatchContentOfferStylingConfiguration body(PatchTextStyleProperties body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties for customizing the appearance of the body text.")
  @JsonProperty("body")
  public PatchTextStyleProperties getBody() {
    return body;
  }
  public void setBody(PatchTextStyleProperties body) {
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
    PatchContentOfferStylingConfiguration patchContentOfferStylingConfiguration = (PatchContentOfferStylingConfiguration) o;
    return Objects.equals(this.position, patchContentOfferStylingConfiguration.position) &&
        Objects.equals(this.offer, patchContentOfferStylingConfiguration.offer) &&
        Objects.equals(this.closeButton, patchContentOfferStylingConfiguration.closeButton) &&
        Objects.equals(this.ctaButton, patchContentOfferStylingConfiguration.ctaButton) &&
        Objects.equals(this.title, patchContentOfferStylingConfiguration.title) &&
        Objects.equals(this.headline, patchContentOfferStylingConfiguration.headline) &&
        Objects.equals(this.body, patchContentOfferStylingConfiguration.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, offer, closeButton, ctaButton, title, headline, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchContentOfferStylingConfiguration {\n");
    
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

