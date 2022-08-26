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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeImportJobSettings
 */

public class KnowledgeImportJobSettings  implements Serializable {
  
  private Boolean importAsNew = null;
  private Boolean visible = null;
  private String categoryId = null;
  private List<String> labelIds = new ArrayList<String>();

  
  /**
   * If enabled import creates a new document even if update is available.
   **/
  public KnowledgeImportJobSettings importAsNew(Boolean importAsNew) {
    this.importAsNew = importAsNew;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If enabled import creates a new document even if update is available.")
  @JsonProperty("importAsNew")
  public Boolean getImportAsNew() {
    return importAsNew;
  }
  public void setImportAsNew(Boolean importAsNew) {
    this.importAsNew = importAsNew;
  }


  /**
   * If specified, import will override the visibility of the imported documents.
   **/
  public KnowledgeImportJobSettings visible(Boolean visible) {
    this.visible = visible;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If specified, import will override the visibility of the imported documents.")
  @JsonProperty("visible")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  /**
   * If specified, import will override the category of the imported documents.
   **/
  public KnowledgeImportJobSettings categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If specified, import will override the category of the imported documents.")
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  /**
   * If specified, import will add this labels to the imported documents.
   **/
  public KnowledgeImportJobSettings labelIds(List<String> labelIds) {
    this.labelIds = labelIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If specified, import will add this labels to the imported documents.")
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
    KnowledgeImportJobSettings knowledgeImportJobSettings = (KnowledgeImportJobSettings) o;

    return Objects.equals(this.importAsNew, knowledgeImportJobSettings.importAsNew) &&
            Objects.equals(this.visible, knowledgeImportJobSettings.visible) &&
            Objects.equals(this.categoryId, knowledgeImportJobSettings.categoryId) &&
            Objects.equals(this.labelIds, knowledgeImportJobSettings.labelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importAsNew, visible, categoryId, labelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeImportJobSettings {\n");
    
    sb.append("    importAsNew: ").append(toIndentedString(importAsNew)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

