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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.SupportCenterCategory;
import com.mypurecloud.sdk.v2.model.SupportCenterCustomMessage;
import com.mypurecloud.sdk.v2.model.SupportCenterFeedbackSettings;
import com.mypurecloud.sdk.v2.model.SupportCenterLabelFilter;
import com.mypurecloud.sdk.v2.model.SupportCenterScreen;
import com.mypurecloud.sdk.v2.model.SupportCenterStyleSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Settings concerning knowledge portal (previously support center)
 */
@ApiModel(description = "Settings concerning knowledge portal (previously support center)")

public class SupportCenterSettings  implements Serializable {
  
  private Boolean enabled = null;
  private AddressableEntityRef knowledgeBase = null;
  private List<SupportCenterCustomMessage> customMessages = null;

  private static class RouterTypeEnumDeserializer extends StdDeserializer<RouterTypeEnum> {
    public RouterTypeEnumDeserializer() {
      super(RouterTypeEnumDeserializer.class);
    }

    @Override
    public RouterTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RouterTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Router type for knowledge portal (previously support center)
   */
 @JsonDeserialize(using = RouterTypeEnumDeserializer.class)
  public enum RouterTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HASH("Hash"),
    BROWSER("Browser");

    private String value;

    RouterTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RouterTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RouterTypeEnum value : RouterTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RouterTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RouterTypeEnum routerType = null;
  private List<SupportCenterScreen> screens = null;
  private List<SupportCenterCategory> enabledCategories = null;
  private SupportCenterLabelFilter labelFilter = null;
  private SupportCenterStyleSetting styleSetting = null;
  private SupportCenterFeedbackSettings feedback = null;

  public SupportCenterSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      customMessages = new ArrayList<SupportCenterCustomMessage>();
      screens = new ArrayList<SupportCenterScreen>();
      enabledCategories = new ArrayList<SupportCenterCategory>();
    }
  }

  
  /**
   * Whether or not knowledge portal (previously support center) is enabled
   **/
  public SupportCenterSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not knowledge portal (previously support center) is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The knowledge base for knowledge portal (previously support center)
   **/
  public SupportCenterSettings knowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The knowledge base for knowledge portal (previously support center)")
  @JsonProperty("knowledgeBase")
  public AddressableEntityRef getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * Customizable display texts for knowledge portal (previously support center)
   **/
  public SupportCenterSettings customMessages(List<SupportCenterCustomMessage> customMessages) {
    this.customMessages = customMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customizable display texts for knowledge portal (previously support center)")
  @JsonProperty("customMessages")
  public List<SupportCenterCustomMessage> getCustomMessages() {
    return customMessages;
  }
  public void setCustomMessages(List<SupportCenterCustomMessage> customMessages) {
    this.customMessages = customMessages;
  }


  /**
   * Router type for knowledge portal (previously support center)
   **/
  public SupportCenterSettings routerType(RouterTypeEnum routerType) {
    this.routerType = routerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Router type for knowledge portal (previously support center)")
  @JsonProperty("routerType")
  public RouterTypeEnum getRouterType() {
    return routerType;
  }
  public void setRouterType(RouterTypeEnum routerType) {
    this.routerType = routerType;
  }


  /**
   * Available screens for the knowledge portal (previously support center) with its modules
   **/
  public SupportCenterSettings screens(List<SupportCenterScreen> screens) {
    this.screens = screens;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Available screens for the knowledge portal (previously support center) with its modules")
  @JsonProperty("screens")
  public List<SupportCenterScreen> getScreens() {
    return screens;
  }
  public void setScreens(List<SupportCenterScreen> screens) {
    this.screens = screens;
  }


  /**
   * Featured categories for knowledge portal (previously support center) home screen
   **/
  public SupportCenterSettings enabledCategories(List<SupportCenterCategory> enabledCategories) {
    this.enabledCategories = enabledCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Featured categories for knowledge portal (previously support center) home screen")
  @JsonProperty("enabledCategories")
  public List<SupportCenterCategory> getEnabledCategories() {
    return enabledCategories;
  }
  public void setEnabledCategories(List<SupportCenterCategory> enabledCategories) {
    this.enabledCategories = enabledCategories;
  }


  /**
   * Document label filter. If set, only documents having at least one of the specified labels will be returned by knowledge document query operations.
   **/
  public SupportCenterSettings labelFilter(SupportCenterLabelFilter labelFilter) {
    this.labelFilter = labelFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Document label filter. If set, only documents having at least one of the specified labels will be returned by knowledge document query operations.")
  @JsonProperty("labelFilter")
  public SupportCenterLabelFilter getLabelFilter() {
    return labelFilter;
  }
  public void setLabelFilter(SupportCenterLabelFilter labelFilter) {
    this.labelFilter = labelFilter;
  }


  /**
   * Style attributes for knowledge portal (previously support center)
   **/
  public SupportCenterSettings styleSetting(SupportCenterStyleSetting styleSetting) {
    this.styleSetting = styleSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Style attributes for knowledge portal (previously support center)")
  @JsonProperty("styleSetting")
  public SupportCenterStyleSetting getStyleSetting() {
    return styleSetting;
  }
  public void setStyleSetting(SupportCenterStyleSetting styleSetting) {
    this.styleSetting = styleSetting;
  }


  /**
   * Customer feedback settings
   **/
  public SupportCenterSettings feedback(SupportCenterFeedbackSettings feedback) {
    this.feedback = feedback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customer feedback settings")
  @JsonProperty("feedback")
  public SupportCenterFeedbackSettings getFeedback() {
    return feedback;
  }
  public void setFeedback(SupportCenterFeedbackSettings feedback) {
    this.feedback = feedback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterSettings supportCenterSettings = (SupportCenterSettings) o;

    return Objects.equals(this.enabled, supportCenterSettings.enabled) &&
            Objects.equals(this.knowledgeBase, supportCenterSettings.knowledgeBase) &&
            Objects.equals(this.customMessages, supportCenterSettings.customMessages) &&
            Objects.equals(this.routerType, supportCenterSettings.routerType) &&
            Objects.equals(this.screens, supportCenterSettings.screens) &&
            Objects.equals(this.enabledCategories, supportCenterSettings.enabledCategories) &&
            Objects.equals(this.labelFilter, supportCenterSettings.labelFilter) &&
            Objects.equals(this.styleSetting, supportCenterSettings.styleSetting) &&
            Objects.equals(this.feedback, supportCenterSettings.feedback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, knowledgeBase, customMessages, routerType, screens, enabledCategories, labelFilter, styleSetting, feedback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    customMessages: ").append(toIndentedString(customMessages)).append("\n");
    sb.append("    routerType: ").append(toIndentedString(routerType)).append("\n");
    sb.append("    screens: ").append(toIndentedString(screens)).append("\n");
    sb.append("    enabledCategories: ").append(toIndentedString(enabledCategories)).append("\n");
    sb.append("    labelFilter: ").append(toIndentedString(labelFilter)).append("\n");
    sb.append("    styleSetting: ").append(toIndentedString(styleSetting)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
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

