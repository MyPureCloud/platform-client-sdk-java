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
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkUpdateEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeDocumentBulkUpdateRequest
 */

public class KnowledgeDocumentBulkUpdateRequest  implements Serializable {
  
  private List<KnowledgeDocumentBulkUpdateEntity> entities = new ArrayList<KnowledgeDocumentBulkUpdateEntity>();

  
  /**
   * List of unique identifiers referencing documents that are to be updated
   **/
  public KnowledgeDocumentBulkUpdateRequest entities(List<KnowledgeDocumentBulkUpdateEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of unique identifiers referencing documents that are to be updated")
  @JsonProperty("entities")
  public List<KnowledgeDocumentBulkUpdateEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<KnowledgeDocumentBulkUpdateEntity> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentBulkUpdateRequest knowledgeDocumentBulkUpdateRequest = (KnowledgeDocumentBulkUpdateRequest) o;

    return Objects.equals(this.entities, knowledgeDocumentBulkUpdateRequest.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentBulkUpdateRequest {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

