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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PhraseAssociations
 */

public class PhraseAssociations  implements Serializable {
  
  private String phraseId = null;
  private String documentId = null;

  public PhraseAssociations() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Id of the phrase to be linked
   **/
  public PhraseAssociations phraseId(String phraseId) {
    this.phraseId = phraseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of the phrase to be linked")
  @JsonProperty("phraseId")
  public String getPhraseId() {
    return phraseId;
  }
  public void setPhraseId(String phraseId) {
    this.phraseId = phraseId;
  }


  /**
   * Id of the document to be linked
   **/
  public PhraseAssociations documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id of the document to be linked")
  @JsonProperty("documentId")
  public String getDocumentId() {
    return documentId;
  }
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhraseAssociations phraseAssociations = (PhraseAssociations) o;

    return Objects.equals(this.phraseId, phraseAssociations.phraseId) &&
            Objects.equals(this.documentId, phraseAssociations.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phraseId, documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhraseAssociations {\n");
    
    sb.append("    phraseId: ").append(toIndentedString(phraseId)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

