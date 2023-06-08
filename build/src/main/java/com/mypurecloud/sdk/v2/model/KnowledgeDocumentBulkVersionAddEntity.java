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
 * KnowledgeDocumentBulkVersionAddEntity
 */

public class KnowledgeDocumentBulkVersionAddEntity  implements Serializable {
  
  private String id = null;
  private String restoreFromVersionId = null;
  private Boolean restorePrevious = null;

  
  /**
   * The globally unique identifier for the object.
   **/
  public KnowledgeDocumentBulkVersionAddEntity id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The globally unique identifier for the document version. If the value is provided, the document is restored to the given version.
   **/
  public KnowledgeDocumentBulkVersionAddEntity restoreFromVersionId(String restoreFromVersionId) {
    this.restoreFromVersionId = restoreFromVersionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the document version. If the value is provided, the document is restored to the given version.")
  @JsonProperty("restoreFromVersionId")
  public String getRestoreFromVersionId() {
    return restoreFromVersionId;
  }
  public void setRestoreFromVersionId(String restoreFromVersionId) {
    this.restoreFromVersionId = restoreFromVersionId;
  }


  /**
   * Indicates if the document's previous version will be restored
   **/
  public KnowledgeDocumentBulkVersionAddEntity restorePrevious(Boolean restorePrevious) {
    this.restorePrevious = restorePrevious;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the document's previous version will be restored")
  @JsonProperty("restorePrevious")
  public Boolean getRestorePrevious() {
    return restorePrevious;
  }
  public void setRestorePrevious(Boolean restorePrevious) {
    this.restorePrevious = restorePrevious;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentBulkVersionAddEntity knowledgeDocumentBulkVersionAddEntity = (KnowledgeDocumentBulkVersionAddEntity) o;

    return Objects.equals(this.id, knowledgeDocumentBulkVersionAddEntity.id) &&
            Objects.equals(this.restoreFromVersionId, knowledgeDocumentBulkVersionAddEntity.restoreFromVersionId) &&
            Objects.equals(this.restorePrevious, knowledgeDocumentBulkVersionAddEntity.restorePrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, restoreFromVersionId, restorePrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentBulkVersionAddEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    restoreFromVersionId: ").append(toIndentedString(restoreFromVersionId)).append("\n");
    sb.append("    restorePrevious: ").append(toIndentedString(restorePrevious)).append("\n");
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

