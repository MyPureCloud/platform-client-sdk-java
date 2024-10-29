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
import com.mypurecloud.sdk.v2.model.DocumentBodyResponse;
import com.mypurecloud.sdk.v2.model.DocumentVariationContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentVersionVariation
 */

public class KnowledgeDocumentVersionVariation  implements Serializable {
  
  private String id = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private List<DocumentVariationContext> contexts = new ArrayList<DocumentVariationContext>();
  private Integer priority = null;
  private String name = null;
  private DocumentBodyResponse body = null;
  private String selfUri = null;
  private AddressableEntityRef documentVersion = null;

  
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
   * The context values associated with the variation.
   **/
  public KnowledgeDocumentVersionVariation contexts(List<DocumentVariationContext> contexts) {
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


  /**
   * The priority of the variation.
   **/
  public KnowledgeDocumentVersionVariation priority(Integer priority) {
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
  public KnowledgeDocumentVersionVariation name(String name) {
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
  public KnowledgeDocumentVersionVariation body(DocumentBodyResponse body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content for the variation.")
  @JsonProperty("body")
  public DocumentBodyResponse getBody() {
    return body;
  }
  public void setBody(DocumentBodyResponse body) {
    this.body = body;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @ApiModelProperty(example = "null", value = "Reference to the document version to which the variation is associated with.")
  @JsonProperty("documentVersion")
  public AddressableEntityRef getDocumentVersion() {
    return documentVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentVersionVariation knowledgeDocumentVersionVariation = (KnowledgeDocumentVersionVariation) o;

    return Objects.equals(this.id, knowledgeDocumentVersionVariation.id) &&
            Objects.equals(this.dateCreated, knowledgeDocumentVersionVariation.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeDocumentVersionVariation.dateModified) &&
            Objects.equals(this.contexts, knowledgeDocumentVersionVariation.contexts) &&
            Objects.equals(this.priority, knowledgeDocumentVersionVariation.priority) &&
            Objects.equals(this.name, knowledgeDocumentVersionVariation.name) &&
            Objects.equals(this.body, knowledgeDocumentVersionVariation.body) &&
            Objects.equals(this.selfUri, knowledgeDocumentVersionVariation.selfUri) &&
            Objects.equals(this.documentVersion, knowledgeDocumentVersionVariation.documentVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateModified, contexts, priority, name, body, selfUri, documentVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentVersionVariation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
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

