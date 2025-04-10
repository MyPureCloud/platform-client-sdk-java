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
import com.mypurecloud.sdk.v2.model.DocumentBodyRequest;
import com.mypurecloud.sdk.v2.model.DocumentVariationContext;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentVariationRequest
 */

public class DocumentVariationRequest  implements Serializable {
  
  private String id = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private AddressableEntityRef documentVersion = null;
  private List<DocumentVariationContext> contexts = null;
  private KnowledgeDocumentReference document = null;
  private Integer priority = null;
  private String name = null;
  private DocumentBodyRequest body = null;
  private String selfUri = null;

  public DocumentVariationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contexts = new ArrayList<DocumentVariationContext>();
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
  public DocumentVariationRequest documentVersion(AddressableEntityRef documentVersion) {
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
  public DocumentVariationRequest contexts(List<DocumentVariationContext> contexts) {
    this.contexts = contexts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The context values associated with the variation.")
  @JsonProperty("contexts")
  public List<DocumentVariationContext> getContexts() {
    return contexts;
  }
  public void setContexts(List<DocumentVariationContext> contexts) {
    this.contexts = contexts;
  }


  @ApiModelProperty(example = "null", value = "The reference to document to which the variation is associated.")
  @JsonProperty("document")
  public KnowledgeDocumentReference getDocument() {
    return document;
  }


  /**
   * The priority of the variation.
   **/
  public DocumentVariationRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of the variation.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * The name of the variation.
   **/
  public DocumentVariationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the variation.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The content for the variation.
   **/
  public DocumentVariationRequest body(DocumentBodyRequest body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content for the variation.")
  @JsonProperty("body")
  public DocumentBodyRequest getBody() {
    return body;
  }
  public void setBody(DocumentBodyRequest body) {
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
    DocumentVariationRequest documentVariationRequest = (DocumentVariationRequest) o;

    return Objects.equals(this.id, documentVariationRequest.id) &&
            Objects.equals(this.dateCreated, documentVariationRequest.dateCreated) &&
            Objects.equals(this.dateModified, documentVariationRequest.dateModified) &&
            Objects.equals(this.documentVersion, documentVariationRequest.documentVersion) &&
            Objects.equals(this.contexts, documentVariationRequest.contexts) &&
            Objects.equals(this.document, documentVariationRequest.document) &&
            Objects.equals(this.priority, documentVariationRequest.priority) &&
            Objects.equals(this.name, documentVariationRequest.name) &&
            Objects.equals(this.body, documentVariationRequest.body) &&
            Objects.equals(this.selfUri, documentVariationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateModified, documentVersion, contexts, document, priority, name, body, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVariationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

