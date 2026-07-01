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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Apple Messages for Business invitation template configuration
 */
@ApiModel(description = "Apple Messages for Business invitation template configuration")

public class AppleInvitation  implements Serializable {
  
  private String businessName = null;
  private String transcriptMessage = null;

  private static class TemplateTypeEnumDeserializer extends StdDeserializer<TemplateTypeEnum> {
    public TemplateTypeEnumDeserializer() {
      super(TemplateTypeEnumDeserializer.class);
    }

    @Override
    public TemplateTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TemplateTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The template type for the invitation
   */
 @JsonDeserialize(using = TemplateTypeEnumDeserializer.class)
  public enum TemplateTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WITHIMAGE("WithImage"),
    WITHOUTIMAGE("WithoutImage");

    private String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TemplateTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TemplateTypeEnum value : TemplateTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TemplateTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TemplateTypeEnum templateType = null;
  private String locale = null;

  public AppleInvitation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AppleInvitation(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The business name displayed in the invitation
   **/
  public AppleInvitation businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The business name displayed in the invitation")
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  /**
   * The transcript message displayed in the invitation
   **/
  public AppleInvitation transcriptMessage(String transcriptMessage) {
    this.transcriptMessage = transcriptMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The transcript message displayed in the invitation")
  @JsonProperty("transcriptMessage")
  public String getTranscriptMessage() {
    return transcriptMessage;
  }
  public void setTranscriptMessage(String transcriptMessage) {
    this.transcriptMessage = transcriptMessage;
  }


  /**
   * The template type for the invitation
   **/
  public AppleInvitation templateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The template type for the invitation")
  @JsonProperty("templateType")
  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }
  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }


  /**
   * The locale for the invitation
   **/
  public AppleInvitation locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The locale for the invitation")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleInvitation appleInvitation = (AppleInvitation) o;

    return Objects.equals(this.businessName, appleInvitation.businessName) &&
            Objects.equals(this.transcriptMessage, appleInvitation.transcriptMessage) &&
            Objects.equals(this.templateType, appleInvitation.templateType) &&
            Objects.equals(this.locale, appleInvitation.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessName, transcriptMessage, templateType, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleInvitation {\n");
    
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    transcriptMessage: ").append(toIndentedString(transcriptMessage)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

