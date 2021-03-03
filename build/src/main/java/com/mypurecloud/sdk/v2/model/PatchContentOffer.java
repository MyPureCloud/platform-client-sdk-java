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
import com.mypurecloud.sdk.v2.model.PatchCallToAction;
import com.mypurecloud.sdk.v2.model.PatchContentOfferStylingConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchContentOffer
 */

public class PatchContentOffer  implements Serializable {
  
  private String imageUrl = null;

  private static class DisplayModeEnumDeserializer extends StdDeserializer<DisplayModeEnum> {
    public DisplayModeEnumDeserializer() {
      super(DisplayModeEnumDeserializer.class);
    }

    @Override
    public DisplayModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DisplayModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The display mode of Genesys Widgets when displaying content offer.
   */
 @JsonDeserialize(using = DisplayModeEnumDeserializer.class)
  public enum DisplayModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MODAL("Modal"),
    OVERLAY("Overlay"),
    TOAST("Toast");

    private String value;

    DisplayModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisplayModeEnum fromString(String key) {
      if (key == null) return null;

      for (DisplayModeEnum value : DisplayModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisplayModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisplayModeEnum displayMode = null;

  private static class LayoutModeEnumDeserializer extends StdDeserializer<LayoutModeEnum> {
    public LayoutModeEnumDeserializer() {
      super(LayoutModeEnumDeserializer.class);
    }

    @Override
    public LayoutModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LayoutModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The layout mode of the text shown to the user when displaying content offer.
   */
 @JsonDeserialize(using = LayoutModeEnumDeserializer.class)
  public enum LayoutModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXTONLY("TextOnly"),
    IMAGEONLY("ImageOnly"),
    LEFTTEXT("LeftText"),
    RIGHTTEXT("RightText"),
    TOPTEXT("TopText"),
    BOTTOMTEXT("BottomText");

    private String value;

    LayoutModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LayoutModeEnum fromString(String key) {
      if (key == null) return null;

      for (LayoutModeEnum value : LayoutModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LayoutModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LayoutModeEnum layoutMode = null;
  private String title = null;
  private String headline = null;
  private String body = null;
  private PatchCallToAction callToAction = null;
  private PatchContentOfferStylingConfiguration style = null;

  
  /**
   * URL for image displayed to the customer when displaying content offer.
   **/
  public PatchContentOffer imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL for image displayed to the customer when displaying content offer.")
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  
  /**
   * The display mode of Genesys Widgets when displaying content offer.
   **/
  public PatchContentOffer displayMode(DisplayModeEnum displayMode) {
    this.displayMode = displayMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The display mode of Genesys Widgets when displaying content offer.")
  @JsonProperty("displayMode")
  public DisplayModeEnum getDisplayMode() {
    return displayMode;
  }
  public void setDisplayMode(DisplayModeEnum displayMode) {
    this.displayMode = displayMode;
  }

  
  /**
   * The layout mode of the text shown to the user when displaying content offer.
   **/
  public PatchContentOffer layoutMode(LayoutModeEnum layoutMode) {
    this.layoutMode = layoutMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The layout mode of the text shown to the user when displaying content offer.")
  @JsonProperty("layoutMode")
  public LayoutModeEnum getLayoutMode() {
    return layoutMode;
  }
  public void setLayoutMode(LayoutModeEnum layoutMode) {
    this.layoutMode = layoutMode;
  }

  
  /**
   * Title used in the header of the content offer.
   **/
  public PatchContentOffer title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title used in the header of the content offer.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Headline displayed above the body text of the content offer.
   **/
  public PatchContentOffer headline(String headline) {
    this.headline = headline;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Headline displayed above the body text of the content offer.")
  @JsonProperty("headline")
  public String getHeadline() {
    return headline;
  }
  public void setHeadline(String headline) {
    this.headline = headline;
  }

  
  /**
   * Body text of the content offer.
   **/
  public PatchContentOffer body(String body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Body text of the content offer.")
  @JsonProperty("body")
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }

  
  /**
   * Properties customizing the call to action button on the content offer.
   **/
  public PatchContentOffer callToAction(PatchCallToAction callToAction) {
    this.callToAction = callToAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties customizing the call to action button on the content offer.")
  @JsonProperty("callToAction")
  public PatchCallToAction getCallToAction() {
    return callToAction;
  }
  public void setCallToAction(PatchCallToAction callToAction) {
    this.callToAction = callToAction;
  }

  
  /**
   * Properties customizing the styling of the content offer.
   **/
  public PatchContentOffer style(PatchContentOfferStylingConfiguration style) {
    this.style = style;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Properties customizing the styling of the content offer.")
  @JsonProperty("style")
  public PatchContentOfferStylingConfiguration getStyle() {
    return style;
  }
  public void setStyle(PatchContentOfferStylingConfiguration style) {
    this.style = style;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchContentOffer patchContentOffer = (PatchContentOffer) o;
    return Objects.equals(this.imageUrl, patchContentOffer.imageUrl) &&
        Objects.equals(this.displayMode, patchContentOffer.displayMode) &&
        Objects.equals(this.layoutMode, patchContentOffer.layoutMode) &&
        Objects.equals(this.title, patchContentOffer.title) &&
        Objects.equals(this.headline, patchContentOffer.headline) &&
        Objects.equals(this.body, patchContentOffer.body) &&
        Objects.equals(this.callToAction, patchContentOffer.callToAction) &&
        Objects.equals(this.style, patchContentOffer.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, displayMode, layoutMode, title, headline, body, callToAction, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchContentOffer {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    displayMode: ").append(toIndentedString(displayMode)).append("\n");
    sb.append("    layoutMode: ").append(toIndentedString(layoutMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

