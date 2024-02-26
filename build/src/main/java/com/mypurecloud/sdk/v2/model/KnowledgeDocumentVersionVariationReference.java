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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeDocumentVersionVariationReference
 */

public class KnowledgeDocumentVersionVariationReference  implements Serializable {
  
  private String documentId = null;
  private String documentVariationId = null;
  private String documentVersionId = null;

  
  /**
   * The ID of the document.
   **/
  public KnowledgeDocumentVersionVariationReference documentId(String documentId) {
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
  public KnowledgeDocumentVersionVariationReference documentVariationId(String documentVariationId) {
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
  public KnowledgeDocumentVersionVariationReference documentVersionId(String documentVersionId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentVersionVariationReference knowledgeDocumentVersionVariationReference = (KnowledgeDocumentVersionVariationReference) o;

    return Objects.equals(this.documentId, knowledgeDocumentVersionVariationReference.documentId) &&
            Objects.equals(this.documentVariationId, knowledgeDocumentVersionVariationReference.documentVariationId) &&
            Objects.equals(this.documentVersionId, knowledgeDocumentVersionVariationReference.documentVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentVariationId, documentVersionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentVersionVariationReference {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentVariationId: ").append(toIndentedString(documentVariationId)).append("\n");
    sb.append("    documentVersionId: ").append(toIndentedString(documentVersionId)).append("\n");
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

