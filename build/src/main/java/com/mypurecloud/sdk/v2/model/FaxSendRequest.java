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
import com.mypurecloud.sdk.v2.model.CoverSheet;
import com.mypurecloud.sdk.v2.model.Workspace;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FaxSendRequest
 */

public class FaxSendRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<String> addresses = new ArrayList<String>();
  private String documentId = null;

  private static class ContentTypeEnumDeserializer extends StdDeserializer<ContentTypeEnum> {
    public ContentTypeEnumDeserializer() {
      super(ContentTypeEnumDeserializer.class);
    }

    @Override
    public ContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The content type that is going to be uploaded. If Content Management document is used for faxing, contentType will be ignored
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPLICATION_PDF("application/pdf"),
    IMAGE_TIFF("image/tiff"),
    APPLICATION_MSWORD("application/msword"),
    APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT("application/vnd.oasis.opendocument.text"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT("application/vnd.openxmlformats-officedocument.wordprocessingml.document");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContentTypeEnum value : ContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContentTypeEnum contentType = null;
  private Workspace workspace = null;
  private CoverSheet coverSheet = null;
  private Integer timeZoneOffsetMinutes = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public FaxSendRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A list of outbound fax dialing addresses. E.g. +13175555555 or 3175555555
   **/
  public FaxSendRequest addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of outbound fax dialing addresses. E.g. +13175555555 or 3175555555")
  @JsonProperty("addresses")
  public List<String> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  
  /**
   * DocumentId of Content Management artifact. If Content Management document is not used for faxing, documentId should be null
   **/
  public FaxSendRequest documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DocumentId of Content Management artifact. If Content Management document is not used for faxing, documentId should be null")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  
  /**
   * The content type that is going to be uploaded. If Content Management document is used for faxing, contentType will be ignored
   **/
  public FaxSendRequest contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content type that is going to be uploaded. If Content Management document is used for faxing, contentType will be ignored")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  
  /**
   * Workspace in which the document should be stored. If Content Management document is used for faxing, workspace will be ignored
   **/
  public FaxSendRequest workspace(Workspace workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Workspace in which the document should be stored. If Content Management document is used for faxing, workspace will be ignored")
  @JsonProperty("workspace")
  public Workspace getWorkspace() {
    return workspace;
  }
  public void setWorkspace(Workspace workspace) {
    this.workspace = workspace;
  }

  
  /**
   * Data for coversheet generation.
   **/
  public FaxSendRequest coverSheet(CoverSheet coverSheet) {
    this.coverSheet = coverSheet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data for coversheet generation.")
  @JsonProperty("coverSheet")
  public CoverSheet getCoverSheet() {
    return coverSheet;
  }
  public void setCoverSheet(CoverSheet coverSheet) {
    this.coverSheet = coverSheet;
  }

  
  /**
   * Time zone offset minutes from GMT
   **/
  public FaxSendRequest timeZoneOffsetMinutes(Integer timeZoneOffsetMinutes) {
    this.timeZoneOffsetMinutes = timeZoneOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time zone offset minutes from GMT")
  @JsonProperty("timeZoneOffsetMinutes")
  public Integer getTimeZoneOffsetMinutes() {
    return timeZoneOffsetMinutes;
  }
  public void setTimeZoneOffsetMinutes(Integer timeZoneOffsetMinutes) {
    this.timeZoneOffsetMinutes = timeZoneOffsetMinutes;
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
    FaxSendRequest faxSendRequest = (FaxSendRequest) o;
    return Objects.equals(this.id, faxSendRequest.id) &&
        Objects.equals(this.name, faxSendRequest.name) &&
        Objects.equals(this.addresses, faxSendRequest.addresses) &&
        Objects.equals(this.documentId, faxSendRequest.documentId) &&
        Objects.equals(this.contentType, faxSendRequest.contentType) &&
        Objects.equals(this.workspace, faxSendRequest.workspace) &&
        Objects.equals(this.coverSheet, faxSendRequest.coverSheet) &&
        Objects.equals(this.timeZoneOffsetMinutes, faxSendRequest.timeZoneOffsetMinutes) &&
        Objects.equals(this.selfUri, faxSendRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, addresses, documentId, contentType, workspace, coverSheet, timeZoneOffsetMinutes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxSendRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    coverSheet: ").append(toIndentedString(coverSheet)).append("\n");
    sb.append("    timeZoneOffsetMinutes: ").append(toIndentedString(timeZoneOffsetMinutes)).append("\n");
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

