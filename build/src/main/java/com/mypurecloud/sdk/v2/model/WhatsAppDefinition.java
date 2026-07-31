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
import com.mypurecloud.sdk.v2.model.Button;
import com.mypurecloud.sdk.v2.model.Carousel;
import com.mypurecloud.sdk.v2.model.MessageFooter;
import com.mypurecloud.sdk.v2.model.MessageHeader;
import com.mypurecloud.sdk.v2.model.StatusInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A WhatsApp messaging template definition as defined in the WhatsApp Business Manager
 */
@ApiModel(description = "A WhatsApp messaging template definition as defined in the WhatsApp Business Manager")

public class WhatsAppDefinition  implements Serializable {
  
  private String name = null;
  private String namespace = null;
  private String language = null;
  private List<Button> buttons = null;
  private MessageFooter messageFooter = null;
  private MessageHeader header = null;
  private String integrationId = null;

  private static class CategoryEnumDeserializer extends StdDeserializer<CategoryEnum> {
    public CategoryEnumDeserializer() {
      super(CategoryEnumDeserializer.class);
    }

    @Override
    public CategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Category of whatsApp carousels template.
   */
 @JsonDeserialize(using = CategoryEnumDeserializer.class)
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MARKETING("marketing");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private String templateStatus = null;
  private StatusInfo statusInfo = null;
  private Carousel carousel = null;

  public WhatsAppDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      buttons = new ArrayList<Button>();
    }
  }

  public WhatsAppDefinition(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      buttons = new ArrayList<Button>();
    }
  }

  
  /**
   * The messaging template name.
   **/
  public WhatsAppDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging template name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The messaging template namespace. This field is deprecated.
   **/
  public WhatsAppDefinition namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging template namespace. This field is deprecated.")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  /**
   * The messaging template language configured for this template. This is a WhatsApp specific value. For example, 'en_US'
   **/
  public WhatsAppDefinition language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging template language configured for this template. This is a WhatsApp specific value. For example, 'en_US'")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * List of buttons to be included in the standard WhatsApp messages channel
   **/
  public WhatsAppDefinition buttons(List<Button> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of buttons to be included in the standard WhatsApp messages channel")
  @JsonProperty("buttons")
  public List<Button> getButtons() {
    return buttons;
  }
  public void setButtons(List<Button> buttons) {
    this.buttons = buttons;
  }


  /**
   * Footer for the message in the standard WhatsApp messages channel
   **/
  public WhatsAppDefinition messageFooter(MessageFooter messageFooter) {
    this.messageFooter = messageFooter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Footer for the message in the standard WhatsApp messages channel")
  @JsonProperty("messageFooter")
  public MessageFooter getMessageFooter() {
    return messageFooter;
  }
  public void setMessageFooter(MessageFooter messageFooter) {
    this.messageFooter = messageFooter;
  }


  /**
   * Header for the message in the standard WhatsApp messages channel
   **/
  public WhatsAppDefinition header(MessageHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Header for the message in the standard WhatsApp messages channel")
  @JsonProperty("header")
  public MessageHeader getHeader() {
    return header;
  }
  public void setHeader(MessageHeader header) {
    this.header = header;
  }


  /**
   * WhatsApp integration ID for whatsApp carousels
   **/
  public WhatsAppDefinition integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "WhatsApp integration ID for whatsApp carousels")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * Category of whatsApp carousels template.
   **/
  public WhatsAppDefinition category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category of whatsApp carousels template.")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  @ApiModelProperty(example = "null", value = "Template status of whatsApp carousels template.")
  @JsonProperty("templateStatus")
  public String getTemplateStatus() {
    return templateStatus;
  }


  @ApiModelProperty(example = "null", value = "Status information about the template")
  @JsonProperty("statusInfo")
  public StatusInfo getStatusInfo() {
    return statusInfo;
  }


  /**
   * Definition for whatsApp carousels template.
   **/
  public WhatsAppDefinition carousel(Carousel carousel) {
    this.carousel = carousel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Definition for whatsApp carousels template.")
  @JsonProperty("carousel")
  public Carousel getCarousel() {
    return carousel;
  }
  public void setCarousel(Carousel carousel) {
    this.carousel = carousel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppDefinition whatsAppDefinition = (WhatsAppDefinition) o;

    return Objects.equals(this.name, whatsAppDefinition.name) &&
            Objects.equals(this.namespace, whatsAppDefinition.namespace) &&
            Objects.equals(this.language, whatsAppDefinition.language) &&
            Objects.equals(this.buttons, whatsAppDefinition.buttons) &&
            Objects.equals(this.messageFooter, whatsAppDefinition.messageFooter) &&
            Objects.equals(this.header, whatsAppDefinition.header) &&
            Objects.equals(this.integrationId, whatsAppDefinition.integrationId) &&
            Objects.equals(this.category, whatsAppDefinition.category) &&
            Objects.equals(this.templateStatus, whatsAppDefinition.templateStatus) &&
            Objects.equals(this.statusInfo, whatsAppDefinition.statusInfo) &&
            Objects.equals(this.carousel, whatsAppDefinition.carousel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, language, buttons, messageFooter, header, integrationId, category, templateStatus, statusInfo, carousel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    messageFooter: ").append(toIndentedString(messageFooter)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    templateStatus: ").append(toIndentedString(templateStatus)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    carousel: ").append(toIndentedString(carousel)).append("\n");
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

