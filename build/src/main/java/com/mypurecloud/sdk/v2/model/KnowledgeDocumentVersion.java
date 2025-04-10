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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeDocumentVersion
 */

public class KnowledgeDocumentVersion  implements Serializable {
  
  private String id = null;
  private Date datePublished = null;
  private KnowledgeDocumentResponse document = null;
  private String restoreFromVersionId = null;
  private Integer versionNumber = null;
  private Date dateExpires = null;
  private String selfUri = null;

  public KnowledgeDocumentVersion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Globally unique identifier for the document version.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "Published date of document version. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePublished")
  public Date getDatePublished() {
    return datePublished;
  }


  @ApiModelProperty(example = "null", value = "The document which is versioned.")
  @JsonProperty("document")
  public KnowledgeDocumentResponse getDocument() {
    return document;
  }


  /**
   * The globally unique identifier for the document version. If the value is provided, the document is restored to the given version. If not, it publishes the draft changes as a new version of the document.
   **/
  public KnowledgeDocumentVersion restoreFromVersionId(String restoreFromVersionId) {
    this.restoreFromVersionId = restoreFromVersionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the document version. If the value is provided, the document is restored to the given version. If not, it publishes the draft changes as a new version of the document.")
  @JsonProperty("restoreFromVersionId")
  public String getRestoreFromVersionId() {
    return restoreFromVersionId;
  }
  public void setRestoreFromVersionId(String restoreFromVersionId) {
    this.restoreFromVersionId = restoreFromVersionId;
  }


  @ApiModelProperty(example = "null", value = "Version Number of the document.")
  @JsonProperty("versionNumber")
  public Integer getVersionNumber() {
    return versionNumber;
  }


  @ApiModelProperty(example = "null", value = "Expiry date of document version, applicable only to the 'Archived' version of the document. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
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
    KnowledgeDocumentVersion knowledgeDocumentVersion = (KnowledgeDocumentVersion) o;

    return Objects.equals(this.id, knowledgeDocumentVersion.id) &&
            Objects.equals(this.datePublished, knowledgeDocumentVersion.datePublished) &&
            Objects.equals(this.document, knowledgeDocumentVersion.document) &&
            Objects.equals(this.restoreFromVersionId, knowledgeDocumentVersion.restoreFromVersionId) &&
            Objects.equals(this.versionNumber, knowledgeDocumentVersion.versionNumber) &&
            Objects.equals(this.dateExpires, knowledgeDocumentVersion.dateExpires) &&
            Objects.equals(this.selfUri, knowledgeDocumentVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, datePublished, document, restoreFromVersionId, versionNumber, dateExpires, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    restoreFromVersionId: ").append(toIndentedString(restoreFromVersionId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
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

