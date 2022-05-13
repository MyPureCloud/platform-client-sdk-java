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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.SupportCenterCustomMessage;
import com.mypurecloud.sdk.v2.model.SupportCenterScreen;
import com.mypurecloud.sdk.v2.model.SupportCenterStyleSetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Settings concerning support center
 */
@ApiModel(description = "Settings concerning support center")

public class SupportCenterSettings  implements Serializable {
  
  private Boolean enabled = null;
  private AddressableEntityRef knowledgeBase = null;
  private List<SupportCenterCustomMessage> customMessages = new ArrayList<SupportCenterCustomMessage>();

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
   * Router type for support center
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
  private List<SupportCenterScreen> screens = new ArrayList<SupportCenterScreen>();
  private List<AddressableEntityRef> enabledCategories = new ArrayList<AddressableEntityRef>();
  private SupportCenterStyleSetting styleSetting = null;

  
  /**
   * Whether or not support center is enabled
   **/
  public SupportCenterSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not support center is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The knowledge base for support center
   **/
  public SupportCenterSettings knowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge base for support center")
  @JsonProperty("knowledgeBase")
  public AddressableEntityRef getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(AddressableEntityRef knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * Customizable display texts for support center
   **/
  public SupportCenterSettings customMessages(List<SupportCenterCustomMessage> customMessages) {
    this.customMessages = customMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Customizable display texts for support center")
  @JsonProperty("customMessages")
  public List<SupportCenterCustomMessage> getCustomMessages() {
    return customMessages;
  }
  public void setCustomMessages(List<SupportCenterCustomMessage> customMessages) {
    this.customMessages = customMessages;
  }


  /**
   * Router type for support center
   **/
  public SupportCenterSettings routerType(RouterTypeEnum routerType) {
    this.routerType = routerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Router type for support center")
  @JsonProperty("routerType")
  public RouterTypeEnum getRouterType() {
    return routerType;
  }
  public void setRouterType(RouterTypeEnum routerType) {
    this.routerType = routerType;
  }


  /**
   * Available screens for the support center with its modules
   **/
  public SupportCenterSettings screens(List<SupportCenterScreen> screens) {
    this.screens = screens;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Available screens for the support center with its modules")
  @JsonProperty("screens")
  public List<SupportCenterScreen> getScreens() {
    return screens;
  }
  public void setScreens(List<SupportCenterScreen> screens) {
    this.screens = screens;
  }


  /**
   * Enabled article categories for support center
   **/
  public SupportCenterSettings enabledCategories(List<AddressableEntityRef> enabledCategories) {
    this.enabledCategories = enabledCategories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Enabled article categories for support center")
  @JsonProperty("enabledCategories")
  public List<AddressableEntityRef> getEnabledCategories() {
    return enabledCategories;
  }
  public void setEnabledCategories(List<AddressableEntityRef> enabledCategories) {
    this.enabledCategories = enabledCategories;
  }


  /**
   * Style attributes for support center
   **/
  public SupportCenterSettings styleSetting(SupportCenterStyleSetting styleSetting) {
    this.styleSetting = styleSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Style attributes for support center")
  @JsonProperty("styleSetting")
  public SupportCenterStyleSetting getStyleSetting() {
    return styleSetting;
  }
  public void setStyleSetting(SupportCenterStyleSetting styleSetting) {
    this.styleSetting = styleSetting;
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
            Objects.equals(this.styleSetting, supportCenterSettings.styleSetting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, knowledgeBase, customMessages, routerType, screens, enabledCategories, styleSetting);
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
    sb.append("    styleSetting: ").append(toIndentedString(styleSetting)).append("\n");
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

