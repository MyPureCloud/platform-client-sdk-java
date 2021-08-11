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
import com.mypurecloud.sdk.v2.model.FormsTrackTrigger;
import com.mypurecloud.sdk.v2.model.IdleEventTrigger;
import com.mypurecloud.sdk.v2.model.ScrollPercentageEventTrigger;
import com.mypurecloud.sdk.v2.model.SelectorEventTrigger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Settings concerning journey events
 */
@ApiModel(description = "Settings concerning journey events")

public class JourneyEventsSettings  implements Serializable {
  
  private Boolean enabled = null;
  private List<String> excludedQueryParameters = new ArrayList<String>();
  private Boolean shouldKeepUrlFragment = null;
  private List<String> searchQueryParameters = new ArrayList<String>();

  private static class PageviewConfigEnumDeserializer extends StdDeserializer<PageviewConfigEnum> {
    public PageviewConfigEnumDeserializer() {
      super(PageviewConfigEnumDeserializer.class);
    }

    @Override
    public PageviewConfigEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PageviewConfigEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Controls how the pageview events are tracked.
   */
 @JsonDeserialize(using = PageviewConfigEnumDeserializer.class)
  public enum PageviewConfigEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUTO("Auto"),
    ONCE("Once"),
    OFF("Off");

    private String value;

    PageviewConfigEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PageviewConfigEnum fromString(String key) {
      if (key == null) return null;

      for (PageviewConfigEnum value : PageviewConfigEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PageviewConfigEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PageviewConfigEnum pageviewConfig = null;
  private List<SelectorEventTrigger> clickEvents = new ArrayList<SelectorEventTrigger>();
  private List<FormsTrackTrigger> formsTrackEvents = new ArrayList<FormsTrackTrigger>();
  private List<IdleEventTrigger> idleEvents = new ArrayList<IdleEventTrigger>();
  private List<SelectorEventTrigger> inViewportEvents = new ArrayList<SelectorEventTrigger>();
  private List<ScrollPercentageEventTrigger> scrollDepthEvents = new ArrayList<ScrollPercentageEventTrigger>();

  
  /**
   * Whether or not journey event collection is enabled.
   **/
  public JourneyEventsSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not journey event collection is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * List of parameters to be excluded from the query string.
   **/
  public JourneyEventsSettings excludedQueryParameters(List<String> excludedQueryParameters) {
    this.excludedQueryParameters = excludedQueryParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of parameters to be excluded from the query string.")
  @JsonProperty("excludedQueryParameters")
  public List<String> getExcludedQueryParameters() {
    return excludedQueryParameters;
  }
  public void setExcludedQueryParameters(List<String> excludedQueryParameters) {
    this.excludedQueryParameters = excludedQueryParameters;
  }

  
  /**
   * Whether or not to keep the URL fragment.
   **/
  public JourneyEventsSettings shouldKeepUrlFragment(Boolean shouldKeepUrlFragment) {
    this.shouldKeepUrlFragment = shouldKeepUrlFragment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to keep the URL fragment.")
  @JsonProperty("shouldKeepUrlFragment")
  public Boolean getShouldKeepUrlFragment() {
    return shouldKeepUrlFragment;
  }
  public void setShouldKeepUrlFragment(Boolean shouldKeepUrlFragment) {
    this.shouldKeepUrlFragment = shouldKeepUrlFragment;
  }

  
  /**
   * List of query parameters used for search (e.g. 'q').
   **/
  public JourneyEventsSettings searchQueryParameters(List<String> searchQueryParameters) {
    this.searchQueryParameters = searchQueryParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of query parameters used for search (e.g. 'q').")
  @JsonProperty("searchQueryParameters")
  public List<String> getSearchQueryParameters() {
    return searchQueryParameters;
  }
  public void setSearchQueryParameters(List<String> searchQueryParameters) {
    this.searchQueryParameters = searchQueryParameters;
  }

  
  /**
   * Controls how the pageview events are tracked.
   **/
  public JourneyEventsSettings pageviewConfig(PageviewConfigEnum pageviewConfig) {
    this.pageviewConfig = pageviewConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Controls how the pageview events are tracked.")
  @JsonProperty("pageviewConfig")
  public PageviewConfigEnum getPageviewConfig() {
    return pageviewConfig;
  }
  public void setPageviewConfig(PageviewConfigEnum pageviewConfig) {
    this.pageviewConfig = pageviewConfig;
  }

  
  /**
   * Tracks when and where a visitor clicks on a webpage.
   **/
  public JourneyEventsSettings clickEvents(List<SelectorEventTrigger> clickEvents) {
    this.clickEvents = clickEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tracks when and where a visitor clicks on a webpage.")
  @JsonProperty("clickEvents")
  public List<SelectorEventTrigger> getClickEvents() {
    return clickEvents;
  }
  public void setClickEvents(List<SelectorEventTrigger> clickEvents) {
    this.clickEvents = clickEvents;
  }

  
  /**
   * Controls how the form submitted and form abandoned events are tracked after a visitor interacts with a form element.
   **/
  public JourneyEventsSettings formsTrackEvents(List<FormsTrackTrigger> formsTrackEvents) {
    this.formsTrackEvents = formsTrackEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Controls how the form submitted and form abandoned events are tracked after a visitor interacts with a form element.")
  @JsonProperty("formsTrackEvents")
  public List<FormsTrackTrigger> getFormsTrackEvents() {
    return formsTrackEvents;
  }
  public void setFormsTrackEvents(List<FormsTrackTrigger> formsTrackEvents) {
    this.formsTrackEvents = formsTrackEvents;
  }

  
  /**
   * Tracks when and where a visitor becomes inactive on a webpage.
   **/
  public JourneyEventsSettings idleEvents(List<IdleEventTrigger> idleEvents) {
    this.idleEvents = idleEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tracks when and where a visitor becomes inactive on a webpage.")
  @JsonProperty("idleEvents")
  public List<IdleEventTrigger> getIdleEvents() {
    return idleEvents;
  }
  public void setIdleEvents(List<IdleEventTrigger> idleEvents) {
    this.idleEvents = idleEvents;
  }

  
  /**
   * Tracks when elements become visible or hidden on screen.
   **/
  public JourneyEventsSettings inViewportEvents(List<SelectorEventTrigger> inViewportEvents) {
    this.inViewportEvents = inViewportEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tracks when elements become visible or hidden on screen.")
  @JsonProperty("inViewportEvents")
  public List<SelectorEventTrigger> getInViewportEvents() {
    return inViewportEvents;
  }
  public void setInViewportEvents(List<SelectorEventTrigger> inViewportEvents) {
    this.inViewportEvents = inViewportEvents;
  }

  
  /**
   * Tracks when a visitor scrolls to a specific percentage of a webpage.
   **/
  public JourneyEventsSettings scrollDepthEvents(List<ScrollPercentageEventTrigger> scrollDepthEvents) {
    this.scrollDepthEvents = scrollDepthEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tracks when a visitor scrolls to a specific percentage of a webpage.")
  @JsonProperty("scrollDepthEvents")
  public List<ScrollPercentageEventTrigger> getScrollDepthEvents() {
    return scrollDepthEvents;
  }
  public void setScrollDepthEvents(List<ScrollPercentageEventTrigger> scrollDepthEvents) {
    this.scrollDepthEvents = scrollDepthEvents;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyEventsSettings journeyEventsSettings = (JourneyEventsSettings) o;
    return Objects.equals(this.enabled, journeyEventsSettings.enabled) &&
        Objects.equals(this.excludedQueryParameters, journeyEventsSettings.excludedQueryParameters) &&
        Objects.equals(this.shouldKeepUrlFragment, journeyEventsSettings.shouldKeepUrlFragment) &&
        Objects.equals(this.searchQueryParameters, journeyEventsSettings.searchQueryParameters) &&
        Objects.equals(this.pageviewConfig, journeyEventsSettings.pageviewConfig) &&
        Objects.equals(this.clickEvents, journeyEventsSettings.clickEvents) &&
        Objects.equals(this.formsTrackEvents, journeyEventsSettings.formsTrackEvents) &&
        Objects.equals(this.idleEvents, journeyEventsSettings.idleEvents) &&
        Objects.equals(this.inViewportEvents, journeyEventsSettings.inViewportEvents) &&
        Objects.equals(this.scrollDepthEvents, journeyEventsSettings.scrollDepthEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, excludedQueryParameters, shouldKeepUrlFragment, searchQueryParameters, pageviewConfig, clickEvents, formsTrackEvents, idleEvents, inViewportEvents, scrollDepthEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyEventsSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    excludedQueryParameters: ").append(toIndentedString(excludedQueryParameters)).append("\n");
    sb.append("    shouldKeepUrlFragment: ").append(toIndentedString(shouldKeepUrlFragment)).append("\n");
    sb.append("    searchQueryParameters: ").append(toIndentedString(searchQueryParameters)).append("\n");
    sb.append("    pageviewConfig: ").append(toIndentedString(pageviewConfig)).append("\n");
    sb.append("    clickEvents: ").append(toIndentedString(clickEvents)).append("\n");
    sb.append("    formsTrackEvents: ").append(toIndentedString(formsTrackEvents)).append("\n");
    sb.append("    idleEvents: ").append(toIndentedString(idleEvents)).append("\n");
    sb.append("    inViewportEvents: ").append(toIndentedString(inViewportEvents)).append("\n");
    sb.append("    scrollDepthEvents: ").append(toIndentedString(scrollDepthEvents)).append("\n");
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

