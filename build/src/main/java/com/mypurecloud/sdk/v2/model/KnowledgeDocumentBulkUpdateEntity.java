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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentBulkUpdateEntity
 */

public class KnowledgeDocumentBulkUpdateEntity  implements Serializable {
  
  private String id = null;
  private String categoryId = null;
  private List<String> labelIds = null;

  public KnowledgeDocumentBulkUpdateEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      labelIds = new ArrayList<String>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public KnowledgeDocumentBulkUpdateEntity id(String id) {
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
   * The category associated with the document.
   **/
  public KnowledgeDocumentBulkUpdateEntity categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category associated with the document.")
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  /**
   * The ids of labels associated with the document.
   **/
  public KnowledgeDocumentBulkUpdateEntity labelIds(List<String> labelIds) {
    this.labelIds = labelIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ids of labels associated with the document.")
  @JsonProperty("labelIds")
  public List<String> getLabelIds() {
    return labelIds;
  }
  public void setLabelIds(List<String> labelIds) {
    this.labelIds = labelIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentBulkUpdateEntity knowledgeDocumentBulkUpdateEntity = (KnowledgeDocumentBulkUpdateEntity) o;

    return Objects.equals(this.id, knowledgeDocumentBulkUpdateEntity.id) &&
            Objects.equals(this.categoryId, knowledgeDocumentBulkUpdateEntity.categoryId) &&
            Objects.equals(this.labelIds, knowledgeDocumentBulkUpdateEntity.labelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryId, labelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentBulkUpdateEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
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

