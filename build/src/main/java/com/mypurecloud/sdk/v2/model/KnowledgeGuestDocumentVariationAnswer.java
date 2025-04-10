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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DocumentBodyWithHighlight;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentVariationContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestDocumentVariationAnswer
 */

public class KnowledgeGuestDocumentVariationAnswer  implements Serializable {
  
  private String id = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private AddressableEntityRef documentVersion = null;
  private List<KnowledgeGuestDocumentVariationContext> contexts = null;
  private AddressableEntityRef document = null;
  private DocumentBodyWithHighlight body = null;
  private String selfUri = null;

  public KnowledgeGuestDocumentVariationAnswer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contexts = new ArrayList<KnowledgeGuestDocumentVariationContext>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the variation.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The creation date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The last modification date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * The version of the document.
   **/
  public KnowledgeGuestDocumentVariationAnswer documentVersion(AddressableEntityRef documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the document.")
  @JsonProperty("documentVersion")
  public AddressableEntityRef getDocumentVersion() {
    return documentVersion;
  }
  public void setDocumentVersion(AddressableEntityRef documentVersion) {
    this.documentVersion = documentVersion;
  }


  /**
   * The context values associated with the variation.
   **/
  public KnowledgeGuestDocumentVariationAnswer contexts(List<KnowledgeGuestDocumentVariationContext> contexts) {
    this.contexts = contexts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The context values associated with the variation.")
  @JsonProperty("contexts")
  public List<KnowledgeGuestDocumentVariationContext> getContexts() {
    return contexts;
  }
  public void setContexts(List<KnowledgeGuestDocumentVariationContext> contexts) {
    this.contexts = contexts;
  }


  @ApiModelProperty(example = "null", value = "The reference to document to which the variation is associated.")
  @JsonProperty("document")
  public AddressableEntityRef getDocument() {
    return document;
  }


  /**
   * The content for the variation.
   **/
  public KnowledgeGuestDocumentVariationAnswer body(DocumentBodyWithHighlight body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content for the variation.")
  @JsonProperty("body")
  public DocumentBodyWithHighlight getBody() {
    return body;
  }
  public void setBody(DocumentBodyWithHighlight body) {
    this.body = body;
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
    KnowledgeGuestDocumentVariationAnswer knowledgeGuestDocumentVariationAnswer = (KnowledgeGuestDocumentVariationAnswer) o;

    return Objects.equals(this.id, knowledgeGuestDocumentVariationAnswer.id) &&
            Objects.equals(this.dateCreated, knowledgeGuestDocumentVariationAnswer.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeGuestDocumentVariationAnswer.dateModified) &&
            Objects.equals(this.documentVersion, knowledgeGuestDocumentVariationAnswer.documentVersion) &&
            Objects.equals(this.contexts, knowledgeGuestDocumentVariationAnswer.contexts) &&
            Objects.equals(this.document, knowledgeGuestDocumentVariationAnswer.document) &&
            Objects.equals(this.body, knowledgeGuestDocumentVariationAnswer.body) &&
            Objects.equals(this.selfUri, knowledgeGuestDocumentVariationAnswer.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateModified, documentVersion, contexts, document, body, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestDocumentVariationAnswer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

