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
import com.mypurecloud.sdk.v2.model.SummarySettingCustomEntity;
import com.mypurecloud.sdk.v2.model.SummarySettingPII;
import com.mypurecloud.sdk.v2.model.SummarySettingParticipantLabels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SummarySetting
 */

public class SummarySetting  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String language = null;

  private static class SummaryTypeEnumDeserializer extends StdDeserializer<SummaryTypeEnum> {
    public SummaryTypeEnumDeserializer() {
      super(SummaryTypeEnumDeserializer.class);
    }

    @Override
    public SummaryTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SummaryTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Level of detail of the generated summary.
   */
 @JsonDeserialize(using = SummaryTypeEnumDeserializer.class)
  public enum SummaryTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONCISE("Concise"),
    DETAILED("Detailed");

    private String value;

    SummaryTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SummaryTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SummaryTypeEnum value : SummaryTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SummaryTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SummaryTypeEnum summaryType = null;

  private static class FormatEnumDeserializer extends StdDeserializer<FormatEnum> {
    public FormatEnumDeserializer() {
      super(FormatEnumDeserializer.class);
    }

    @Override
    public FormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Format of the generated summary.
   */
 @JsonDeserialize(using = FormatEnumDeserializer.class)
  public enum FormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXTBLOCK("TextBlock"),
    BULLETPOINTS("BulletPoints"),
    GROUPEDTEXTBLOCKS("GroupedTextBlocks"),
    GROUPEDBULLETPOINTS("GroupedBulletPoints");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FormatEnum fromString(String key) {
      if (key == null) return null;

      for (FormatEnum value : FormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FormatEnum format = null;
  private SummarySettingPII maskPII = null;
  private SummarySettingParticipantLabels participantLabels = null;

  private static class PredefinedInsightsEnumDeserializer extends StdDeserializer<PredefinedInsightsEnum> {
    public PredefinedInsightsEnumDeserializer() {
      super(PredefinedInsightsEnumDeserializer.class);
    }

    @Override
    public PredefinedInsightsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PredefinedInsightsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets predefinedInsights
   */
 @JsonDeserialize(using = PredefinedInsightsEnumDeserializer.class)
  public enum PredefinedInsightsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REASONFORCALL("ReasonForCall"),
    RESOLUTION("Resolution"),
    ACTIONITEMS("ActionItems");

    private String value;

    PredefinedInsightsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PredefinedInsightsEnum fromString(String key) {
      if (key == null) return null;

      for (PredefinedInsightsEnum value : PredefinedInsightsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PredefinedInsightsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<PredefinedInsightsEnum> predefinedInsights = null;
  private List<SummarySettingCustomEntity> customEntities = null;

  private static class SettingTypeEnumDeserializer extends StdDeserializer<SettingTypeEnum> {
    public SettingTypeEnumDeserializer() {
      super(SettingTypeEnumDeserializer.class);
    }

    @Override
    public SettingTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SettingTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of the summary setting.
   */
 @JsonDeserialize(using = SettingTypeEnumDeserializer.class)
  public enum SettingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BASIC("Basic"),
    PROMPT("Prompt");

    private String value;

    SettingTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SettingTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SettingTypeEnum value : SettingTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SettingTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SettingTypeEnum settingType = null;
  private String prompt = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public SummarySetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      predefinedInsights = new ArrayList<PredefinedInsightsEnum>();
      customEntities = new ArrayList<SummarySettingCustomEntity>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Name of the summary setting.
   **/
  public SummarySetting name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the summary setting.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Language of the generated summary, e.g. en-US, it-IT.
   **/
  public SummarySetting language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Language of the generated summary, e.g. en-US, it-IT.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Level of detail of the generated summary.
   **/
  public SummarySetting summaryType(SummaryTypeEnum summaryType) {
    this.summaryType = summaryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Level of detail of the generated summary.")
  @JsonProperty("summaryType")
  public SummaryTypeEnum getSummaryType() {
    return summaryType;
  }
  public void setSummaryType(SummaryTypeEnum summaryType) {
    this.summaryType = summaryType;
  }


  /**
   * Format of the generated summary.
   **/
  public SummarySetting format(FormatEnum format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Format of the generated summary.")
  @JsonProperty("format")
  public FormatEnum getFormat() {
    return format;
  }
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  /**
   * Displaying PII in the generated summary.
   **/
  public SummarySetting maskPII(SummarySettingPII maskPII) {
    this.maskPII = maskPII;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Displaying PII in the generated summary.")
  @JsonProperty("maskPII")
  public SummarySettingPII getMaskPII() {
    return maskPII;
  }
  public void setMaskPII(SummarySettingPII maskPII) {
    this.maskPII = maskPII;
  }


  /**
   * How to refer to interaction participants in the generated summary.
   **/
  public SummarySetting participantLabels(SummarySettingParticipantLabels participantLabels) {
    this.participantLabels = participantLabels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to refer to interaction participants in the generated summary.")
  @JsonProperty("participantLabels")
  public SummarySettingParticipantLabels getParticipantLabels() {
    return participantLabels;
  }
  public void setParticipantLabels(SummarySettingParticipantLabels participantLabels) {
    this.participantLabels = participantLabels;
  }


  /**
   * Set which insights to include in the generated summary by default.
   **/
  public SummarySetting predefinedInsights(List<PredefinedInsightsEnum> predefinedInsights) {
    this.predefinedInsights = predefinedInsights;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set which insights to include in the generated summary by default.")
  @JsonProperty("predefinedInsights")
  public List<PredefinedInsightsEnum> getPredefinedInsights() {
    return predefinedInsights;
  }
  public void setPredefinedInsights(List<PredefinedInsightsEnum> predefinedInsights) {
    this.predefinedInsights = predefinedInsights;
  }


  /**
   * Custom entity definition.
   **/
  public SummarySetting customEntities(List<SummarySettingCustomEntity> customEntities) {
    this.customEntities = customEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom entity definition.")
  @JsonProperty("customEntities")
  public List<SummarySettingCustomEntity> getCustomEntities() {
    return customEntities;
  }
  public void setCustomEntities(List<SummarySettingCustomEntity> customEntities) {
    this.customEntities = customEntities;
  }


  /**
   * Type of the summary setting.
   **/
  public SummarySetting settingType(SettingTypeEnum settingType) {
    this.settingType = settingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the summary setting.")
  @JsonProperty("settingType")
  public SettingTypeEnum getSettingType() {
    return settingType;
  }
  public void setSettingType(SettingTypeEnum settingType) {
    this.settingType = settingType;
  }


  /**
   * Custom prompt of summary setting.
   **/
  public SummarySetting prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom prompt of summary setting.")
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }


  @ApiModelProperty(example = "null", value = "The date and time the setting was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date and time the setting was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarySetting summarySetting = (SummarySetting) o;

    return Objects.equals(this.id, summarySetting.id) &&
            Objects.equals(this.name, summarySetting.name) &&
            Objects.equals(this.language, summarySetting.language) &&
            Objects.equals(this.summaryType, summarySetting.summaryType) &&
            Objects.equals(this.format, summarySetting.format) &&
            Objects.equals(this.maskPII, summarySetting.maskPII) &&
            Objects.equals(this.participantLabels, summarySetting.participantLabels) &&
            Objects.equals(this.predefinedInsights, summarySetting.predefinedInsights) &&
            Objects.equals(this.customEntities, summarySetting.customEntities) &&
            Objects.equals(this.settingType, summarySetting.settingType) &&
            Objects.equals(this.prompt, summarySetting.prompt) &&
            Objects.equals(this.dateCreated, summarySetting.dateCreated) &&
            Objects.equals(this.dateModified, summarySetting.dateModified) &&
            Objects.equals(this.selfUri, summarySetting.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, summaryType, format, maskPII, participantLabels, predefinedInsights, customEntities, settingType, prompt, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarySetting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    maskPII: ").append(toIndentedString(maskPII)).append("\n");
    sb.append("    participantLabels: ").append(toIndentedString(participantLabels)).append("\n");
    sb.append("    predefinedInsights: ").append(toIndentedString(predefinedInsights)).append("\n");
    sb.append("    customEntities: ").append(toIndentedString(customEntities)).append("\n");
    sb.append("    settingType: ").append(toIndentedString(settingType)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

