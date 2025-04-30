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
 * PresentedKnowledgeDocument
 */

public class PresentedKnowledgeDocument  implements Serializable {
  
  private String documentId = null;
  private String documentVariationId = null;
  private String documentVersionId = null;

  private static class SurfacingMethodEnumDeserializer extends StdDeserializer<SurfacingMethodEnum> {
    public SurfacingMethodEnumDeserializer() {
      super(SurfacingMethodEnumDeserializer.class);
    }

    @Override
    public SurfacingMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SurfacingMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown.
   */
 @JsonDeserialize(using = SurfacingMethodEnumDeserializer.class)
  public enum SurfacingMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ARTICLE("Article"),
    SNIPPET("Snippet"),
    HIGHLIGHT("Highlight"),
    GENERATIVE("Generative");

    private String value;

    SurfacingMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SurfacingMethodEnum fromString(String key) {
      if (key == null) return null;

      for (SurfacingMethodEnum value : SurfacingMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SurfacingMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SurfacingMethodEnum surfacingMethod = null;

  public PresentedKnowledgeDocument() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the document.
   **/
  public PresentedKnowledgeDocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the document.")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  /**
   * The variation of the document.
   **/
  public PresentedKnowledgeDocument documentVariationId(String documentVariationId) {
    this.documentVariationId = documentVariationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The variation of the document.")
  @JsonProperty("documentVariationId")
  public String getDocumentVariationId() {
    return documentVariationId;
  }
  public void setDocumentVariationId(String documentVariationId) {
    this.documentVariationId = documentVariationId;
  }


  /**
   * The version of the document.
   **/
  public PresentedKnowledgeDocument documentVersionId(String documentVersionId) {
    this.documentVersionId = documentVersionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of the document.")
  @JsonProperty("documentVersionId")
  public String getDocumentVersionId() {
    return documentVersionId;
  }
  public void setDocumentVersionId(String documentVersionId) {
    this.documentVersionId = documentVersionId;
  }


  /**
   * The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown.
   **/
  public PresentedKnowledgeDocument surfacingMethod(SurfacingMethodEnum surfacingMethod) {
    this.surfacingMethod = surfacingMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The method how knowledge was surfaced. Article: Full article was shown. Snippet: A snippet from the article was shown. Highlight: A highlighted answer in a snippet was shown.Generative: A generated answer in a snippet was shown.")
  @JsonProperty("surfacingMethod")
  public SurfacingMethodEnum getSurfacingMethod() {
    return surfacingMethod;
  }
  public void setSurfacingMethod(SurfacingMethodEnum surfacingMethod) {
    this.surfacingMethod = surfacingMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentedKnowledgeDocument presentedKnowledgeDocument = (PresentedKnowledgeDocument) o;

    return Objects.equals(this.documentId, presentedKnowledgeDocument.documentId) &&
            Objects.equals(this.documentVariationId, presentedKnowledgeDocument.documentVariationId) &&
            Objects.equals(this.documentVersionId, presentedKnowledgeDocument.documentVersionId) &&
            Objects.equals(this.surfacingMethod, presentedKnowledgeDocument.surfacingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentVariationId, documentVersionId, surfacingMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentedKnowledgeDocument {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentVariationId: ").append(toIndentedString(documentVariationId)).append("\n");
    sb.append("    documentVersionId: ").append(toIndentedString(documentVersionId)).append("\n");
    sb.append("    surfacingMethod: ").append(toIndentedString(surfacingMethod)).append("\n");
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

