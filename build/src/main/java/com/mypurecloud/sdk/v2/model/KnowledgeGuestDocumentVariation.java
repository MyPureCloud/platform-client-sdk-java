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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DocumentBody;
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentVariationContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestDocumentVariation
 */

public class KnowledgeGuestDocumentVariation  implements Serializable {
  
  private String id = null;
  private DocumentBody body = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private AddressableEntityRef documentVersion = null;
  private List<KnowledgeGuestDocumentVariationContext> contexts = null;
  private AddressableEntityRef document = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the variation.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The content for the variation.
   **/
  public KnowledgeGuestDocumentVariation body(DocumentBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content for the variation.")
  @JsonProperty("body")
  public DocumentBody getBody() {
    return body;
  }
  public void setBody(DocumentBody body) {
    this.body = body;
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
  public KnowledgeGuestDocumentVariation documentVersion(AddressableEntityRef documentVersion) {
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
  public KnowledgeGuestDocumentVariation contexts(List<KnowledgeGuestDocumentVariationContext> contexts) {
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
    KnowledgeGuestDocumentVariation knowledgeGuestDocumentVariation = (KnowledgeGuestDocumentVariation) o;

    return Objects.equals(this.id, knowledgeGuestDocumentVariation.id) &&
            Objects.equals(this.body, knowledgeGuestDocumentVariation.body) &&
            Objects.equals(this.dateCreated, knowledgeGuestDocumentVariation.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeGuestDocumentVariation.dateModified) &&
            Objects.equals(this.documentVersion, knowledgeGuestDocumentVariation.documentVersion) &&
            Objects.equals(this.contexts, knowledgeGuestDocumentVariation.contexts) &&
            Objects.equals(this.document, knowledgeGuestDocumentVariation.document) &&
            Objects.equals(this.selfUri, knowledgeGuestDocumentVariation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, body, dateCreated, dateModified, documentVersion, contexts, document, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestDocumentVariation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

