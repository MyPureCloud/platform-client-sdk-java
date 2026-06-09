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
import com.mypurecloud.sdk.v2.model.KnowledgeGenerationSetting;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.V3SourceRef;
import com.mypurecloud.sdk.v2.model.V3SourceTagFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSettingsResponse
 */

public class KnowledgeSettingsResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<V3SourceRef> sources = null;
  private KnowledgeGenerationSetting generationSetting = null;
  private Boolean stateful = null;
  private V3SourceTagFilter filter = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private UserReference modifiedBy = null;
  private String selfUri = null;

  public KnowledgeSettingsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sources = new ArrayList<V3SourceRef>();
    }
  }

  public KnowledgeSettingsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sources = new ArrayList<V3SourceRef>();
    }
  }

  
  /**
   * Knowledge Setting Id.
   **/
  public KnowledgeSettingsResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge Setting Id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Knowledge Setting Name.
   **/
  public KnowledgeSettingsResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge Setting Name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Knowledge setting description.
   **/
  public KnowledgeSettingsResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge setting description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Knowledge source information searched upon.
   **/
  public KnowledgeSettingsResponse sources(List<V3SourceRef> sources) {
    this.sources = sources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge source information searched upon.")
  @JsonProperty("sources")
  public List<V3SourceRef> getSources() {
    return sources;
  }
  public void setSources(List<V3SourceRef> sources) {
    this.sources = sources;
  }


  /**
   * Settings for answer generation.
   **/
  public KnowledgeSettingsResponse generationSetting(KnowledgeGenerationSetting generationSetting) {
    this.generationSetting = generationSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for answer generation.")
  @JsonProperty("generationSetting")
  public KnowledgeGenerationSetting getGenerationSetting() {
    return generationSetting;
  }
  public void setGenerationSetting(KnowledgeGenerationSetting generationSetting) {
    this.generationSetting = generationSetting;
  }


  /**
   * Indicates if stateful search and generation is enabled for the knowledge setting.
   **/
  public KnowledgeSettingsResponse stateful(Boolean stateful) {
    this.stateful = stateful;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if stateful search and generation is enabled for the knowledge setting.")
  @JsonProperty("stateful")
  public Boolean getStateful() {
    return stateful;
  }
  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }


  /**
   * Composite tag filter of search results.
   **/
  public KnowledgeSettingsResponse filter(V3SourceTagFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Composite tag filter of search results.")
  @JsonProperty("filter")
  public V3SourceTagFilter getFilter() {
    return filter;
  }
  public void setFilter(V3SourceTagFilter filter) {
    this.filter = filter;
  }


  /**
   * Knowledge setting created date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeSettingsResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge setting created date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Knowledge setting last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public KnowledgeSettingsResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge setting last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The user who modified the knowledge setting.
   **/
  public KnowledgeSettingsResponse modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who modified the knowledge setting.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
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
    KnowledgeSettingsResponse knowledgeSettingsResponse = (KnowledgeSettingsResponse) o;

    return Objects.equals(this.id, knowledgeSettingsResponse.id) &&
            Objects.equals(this.name, knowledgeSettingsResponse.name) &&
            Objects.equals(this.description, knowledgeSettingsResponse.description) &&
            Objects.equals(this.sources, knowledgeSettingsResponse.sources) &&
            Objects.equals(this.generationSetting, knowledgeSettingsResponse.generationSetting) &&
            Objects.equals(this.stateful, knowledgeSettingsResponse.stateful) &&
            Objects.equals(this.filter, knowledgeSettingsResponse.filter) &&
            Objects.equals(this.dateCreated, knowledgeSettingsResponse.dateCreated) &&
            Objects.equals(this.dateModified, knowledgeSettingsResponse.dateModified) &&
            Objects.equals(this.modifiedBy, knowledgeSettingsResponse.modifiedBy) &&
            Objects.equals(this.selfUri, knowledgeSettingsResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, sources, generationSetting, stateful, filter, dateCreated, dateModified, modifiedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSettingsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    generationSetting: ").append(toIndentedString(generationSetting)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

