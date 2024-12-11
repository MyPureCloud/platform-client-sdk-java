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
import com.mypurecloud.sdk.v2.model.PauseCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Settings concerning cobrowse
 */
@ApiModel(description = "Settings concerning cobrowse")

public class CobrowseSettings  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean allowAgentControl = null;
  private Boolean allowAgentNavigation = null;
  private Boolean allowDraw = null;
  private List<String> maskSelectors = new ArrayList<String>();

  private static class ChannelsEnumDeserializer extends StdDeserializer<ChannelsEnum> {
    public ChannelsEnumDeserializer() {
      super(ChannelsEnumDeserializer.class);
    }

    @Override
    public ChannelsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ChannelsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets channels
   */
 @JsonDeserialize(using = ChannelsEnumDeserializer.class)
  public enum ChannelsEnum {
    WEBMESSAGING("Webmessaging"),
    VOICE("Voice");

    private String value;

    ChannelsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChannelsEnum fromString(String key) {
      if (key == null) return null;

      for (ChannelsEnum value : ChannelsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ChannelsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ChannelsEnum> channels = new ArrayList<ChannelsEnum>();
  private List<String> readonlySelectors = new ArrayList<String>();
  private List<PauseCriteria> pauseCriteria = new ArrayList<PauseCriteria>();

  
  /**
   * Whether or not cobrowse is enabled
   **/
  public CobrowseSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not cobrowse is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Whether the viewer should have option to request control
   **/
  public CobrowseSettings allowAgentControl(Boolean allowAgentControl) {
    this.allowAgentControl = allowAgentControl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the viewer should have option to request control")
  @JsonProperty("allowAgentControl")
  public Boolean getAllowAgentControl() {
    return allowAgentControl;
  }
  public void setAllowAgentControl(Boolean allowAgentControl) {
    this.allowAgentControl = allowAgentControl;
  }


  /**
   * Whether the viewer should have option to request navigation
   **/
  public CobrowseSettings allowAgentNavigation(Boolean allowAgentNavigation) {
    this.allowAgentNavigation = allowAgentNavigation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the viewer should have option to request navigation")
  @JsonProperty("allowAgentNavigation")
  public Boolean getAllowAgentNavigation() {
    return allowAgentNavigation;
  }
  public void setAllowAgentNavigation(Boolean allowAgentNavigation) {
    this.allowAgentNavigation = allowAgentNavigation;
  }


  /**
   * Should cobrowse draw be enabled
   **/
  public CobrowseSettings allowDraw(Boolean allowDraw) {
    this.allowDraw = allowDraw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Should cobrowse draw be enabled")
  @JsonProperty("allowDraw")
  public Boolean getAllowDraw() {
    return allowDraw;
  }
  public void setAllowDraw(Boolean allowDraw) {
    this.allowDraw = allowDraw;
  }


  /**
   * Mask patterns that will apply to pages being shared
   **/
  public CobrowseSettings maskSelectors(List<String> maskSelectors) {
    this.maskSelectors = maskSelectors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mask patterns that will apply to pages being shared")
  @JsonProperty("maskSelectors")
  public List<String> getMaskSelectors() {
    return maskSelectors;
  }
  public void setMaskSelectors(List<String> maskSelectors) {
    this.maskSelectors = maskSelectors;
  }


  /**
   * Cobrowse channels for web messenger
   **/
  public CobrowseSettings channels(List<ChannelsEnum> channels) {
    this.channels = channels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Cobrowse channels for web messenger")
  @JsonProperty("channels")
  public List<ChannelsEnum> getChannels() {
    return channels;
  }
  public void setChannels(List<ChannelsEnum> channels) {
    this.channels = channels;
  }


  /**
   * Readonly patterns that will apply to pages being shared
   **/
  public CobrowseSettings readonlySelectors(List<String> readonlySelectors) {
    this.readonlySelectors = readonlySelectors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Readonly patterns that will apply to pages being shared")
  @JsonProperty("readonlySelectors")
  public List<String> getReadonlySelectors() {
    return readonlySelectors;
  }
  public void setReadonlySelectors(List<String> readonlySelectors) {
    this.readonlySelectors = readonlySelectors;
  }


  /**
   * Pause criteria that will pause cobrowse if some of them are met in the user's URL
   **/
  public CobrowseSettings pauseCriteria(List<PauseCriteria> pauseCriteria) {
    this.pauseCriteria = pauseCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Pause criteria that will pause cobrowse if some of them are met in the user's URL")
  @JsonProperty("pauseCriteria")
  public List<PauseCriteria> getPauseCriteria() {
    return pauseCriteria;
  }
  public void setPauseCriteria(List<PauseCriteria> pauseCriteria) {
    this.pauseCriteria = pauseCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobrowseSettings cobrowseSettings = (CobrowseSettings) o;

    return Objects.equals(this.enabled, cobrowseSettings.enabled) &&
            Objects.equals(this.allowAgentControl, cobrowseSettings.allowAgentControl) &&
            Objects.equals(this.allowAgentNavigation, cobrowseSettings.allowAgentNavigation) &&
            Objects.equals(this.allowDraw, cobrowseSettings.allowDraw) &&
            Objects.equals(this.maskSelectors, cobrowseSettings.maskSelectors) &&
            Objects.equals(this.channels, cobrowseSettings.channels) &&
            Objects.equals(this.readonlySelectors, cobrowseSettings.readonlySelectors) &&
            Objects.equals(this.pauseCriteria, cobrowseSettings.pauseCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, allowAgentControl, allowAgentNavigation, allowDraw, maskSelectors, channels, readonlySelectors, pauseCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobrowseSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    allowAgentControl: ").append(toIndentedString(allowAgentControl)).append("\n");
    sb.append("    allowAgentNavigation: ").append(toIndentedString(allowAgentNavigation)).append("\n");
    sb.append("    allowDraw: ").append(toIndentedString(allowDraw)).append("\n");
    sb.append("    maskSelectors: ").append(toIndentedString(maskSelectors)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    readonlySelectors: ").append(toIndentedString(readonlySelectors)).append("\n");
    sb.append("    pauseCriteria: ").append(toIndentedString(pauseCriteria)).append("\n");
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

