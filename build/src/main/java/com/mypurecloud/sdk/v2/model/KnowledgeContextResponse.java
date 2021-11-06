package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.KnowledgeContextValueResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeContextResponse
 */

public class KnowledgeContextResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private List<KnowledgeContextValueResponse> values = new ArrayList<KnowledgeContextValueResponse>();
  private String selfUri = null;

  
  /**
   * Context ID.
   **/
  public KnowledgeContextResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Context ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Context name.
   **/
  public KnowledgeContextResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Context name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Context description.
   **/
  public KnowledgeContextResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Context description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The date when the context was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeContextResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date when the context was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The date when the context was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeContextResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date when the context was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * Knowledge context values.
   **/
  public KnowledgeContextResponse values(List<KnowledgeContextValueResponse> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge context values.")
  @JsonProperty("values")
  public List<KnowledgeContextValueResponse> getValues() {
    return values;
  }
  public void setValues(List<KnowledgeContextValueResponse> values) {
    this.values = values;
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
    KnowledgeContextResponse knowledgeContextResponse = (KnowledgeContextResponse) o;
    return Objects.equals(this.id, knowledgeContextResponse.id) &&
        Objects.equals(this.name, knowledgeContextResponse.name) &&
        Objects.equals(this.description, knowledgeContextResponse.description) &&
        Objects.equals(this.dateCreated, knowledgeContextResponse.dateCreated) &&
        Objects.equals(this.dateModified, knowledgeContextResponse.dateModified) &&
        Objects.equals(this.values, knowledgeContextResponse.values) &&
        Objects.equals(this.selfUri, knowledgeContextResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateCreated, dateModified, values, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeContextResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

