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
import com.mypurecloud.sdk.v2.model.ImportReport;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeImport
 */

public class KnowledgeImport  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String uploadKey = null;

  private static class FileTypeEnumDeserializer extends StdDeserializer<FileTypeEnum> {
    public FileTypeEnumDeserializer() {
      super(FileTypeEnumDeserializer.class);
    }

    @Override
    public FileTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FileTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * file type of the document
   */
 @JsonDeserialize(using = FileTypeEnumDeserializer.class)
  public enum FileTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CSV("Csv"),
    JSONLINES("JsonLines");

    private String value;

    FileTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FileTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FileTypeEnum value : FileTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FileTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FileTypeEnum fileType = null;
  private Boolean ignoreHeaders = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of the operation
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATED("Created"),
    VALIDATIONINPROGRESS("ValidationInProgress"),
    VALIDATIONCOMPLETED("ValidationCompleted"),
    VALIDATIONFAILED("ValidationFailed"),
    STARTED("Started"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    PARTIALCOMPLETED("PartialCompleted"),
    FAILED("Failed"),
    ABORTREQUESTED("AbortRequested"),
    ABORTED("Aborted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private ImportReport report = null;
  private KnowledgeBase knowledgeBase = null;

  private static class LanguageCodeEnumDeserializer extends StdDeserializer<LanguageCodeEnum> {
    public LanguageCodeEnumDeserializer() {
      super(LanguageCodeEnumDeserializer.class);
    }

    @Override
    public LanguageCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Language code
   */
 @JsonDeserialize(using = LanguageCodeEnumDeserializer.class)
  public enum LanguageCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-US"),
    EN_UK("en-UK"),
    EN_AU("en-AU"),
    EN_CA("en-CA"),
    EN_HK("en-HK"),
    EN_IN("en-IN"),
    EN_IE("en-IE"),
    EN_NZ("en-NZ"),
    EN_PH("en-PH"),
    EN_SG("en-SG"),
    EN_ZA("en-ZA"),
    DE_DE("de-DE"),
    DE_AT("de-AT"),
    DE_CH("de-CH"),
    ES_AR("es-AR"),
    ES_CO("es-CO"),
    ES_MX("es-MX"),
    ES_US("es-US"),
    ES_ES("es-ES"),
    FR_FR("fr-FR"),
    FR_BE("fr-BE"),
    FR_CA("fr-CA"),
    FR_CH("fr-CH"),
    PT_BR("pt-BR"),
    PT_PT("pt-PT"),
    NL_NL("nl-NL"),
    NL_BE("nl-BE"),
    IT_IT("it-IT"),
    CA_ES("ca-ES"),
    TR_TR("tr-TR"),
    SV_SE("sv-SE"),
    FI_FI("fi-FI"),
    NB_NO("nb-NO"),
    DA_DK("da-DK"),
    JA_JP("ja-JP"),
    AR_AE("ar-AE"),
    ZH_CN("zh-CN"),
    ZH_TW("zh-TW"),
    ZH_HK("zh-HK"),
    KO_KR("ko-KR"),
    PL_PL("pl-PL"),
    HI_IN("hi-IN"),
    TH_TH("th-TH"),
    HU_HU("hu-HU"),
    VI_VN("vi-VN"),
    UK_UA("uk-UA");

    private String value;

    LanguageCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageCodeEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageCodeEnum value : LanguageCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageCodeEnum languageCode = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public KnowledgeImport() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Id of the import operation")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Name of the import operation
   **/
  public KnowledgeImport name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the import operation")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Upload key
   **/
  public KnowledgeImport uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Upload key")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   * file type of the document
   **/
  public KnowledgeImport fileType(FileTypeEnum fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "file type of the document")
  @JsonProperty("fileType")
  public FileTypeEnum getFileType() {
    return fileType;
  }
  public void setFileType(FileTypeEnum fileType) {
    this.fileType = fileType;
  }


  /**
   * Ignore headers for the specified file
   **/
  public KnowledgeImport ignoreHeaders(Boolean ignoreHeaders) {
    this.ignoreHeaders = ignoreHeaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ignore headers for the specified file")
  @JsonProperty("ignoreHeaders")
  public Boolean getIgnoreHeaders() {
    return ignoreHeaders;
  }
  public void setIgnoreHeaders(Boolean ignoreHeaders) {
    this.ignoreHeaders = ignoreHeaders;
  }


  @ApiModelProperty(example = "null", value = "Status of the operation")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "Report of the import operation")
  @JsonProperty("report")
  public ImportReport getReport() {
    return report;
  }


  @ApiModelProperty(example = "null", value = "Knowledge base which document import does belong to")
  @JsonProperty("knowledgeBase")
  public KnowledgeBase getKnowledgeBase() {
    return knowledgeBase;
  }


  @ApiModelProperty(example = "null", value = "Language code")
  @JsonProperty("languageCode")
  public LanguageCodeEnum getLanguageCode() {
    return languageCode;
  }


  @ApiModelProperty(example = "null", value = "Created date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    KnowledgeImport knowledgeImport = (KnowledgeImport) o;

    return Objects.equals(this.id, knowledgeImport.id) &&
            Objects.equals(this.name, knowledgeImport.name) &&
            Objects.equals(this.uploadKey, knowledgeImport.uploadKey) &&
            Objects.equals(this.fileType, knowledgeImport.fileType) &&
            Objects.equals(this.ignoreHeaders, knowledgeImport.ignoreHeaders) &&
            Objects.equals(this.status, knowledgeImport.status) &&
            Objects.equals(this.report, knowledgeImport.report) &&
            Objects.equals(this.knowledgeBase, knowledgeImport.knowledgeBase) &&
            Objects.equals(this.languageCode, knowledgeImport.languageCode) &&
            Objects.equals(this.dateCreated, knowledgeImport.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeImport.dateModified) &&
            Objects.equals(this.selfUri, knowledgeImport.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uploadKey, fileType, ignoreHeaders, status, report, knowledgeBase, languageCode, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeImport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    ignoreHeaders: ").append(toIndentedString(ignoreHeaders)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

