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
import com.mypurecloud.sdk.v2.model.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Script
 */

public class Script  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String versionId = null;
  private Date createdDate = null;
  private Date modifiedDate = null;
  private Date publishedDate = null;
  private Date versionDate = null;
  private String startPageId = null;
  private String startPageName = null;
  private Object features = null;
  private Object variables = null;
  private Object customActions = null;
  private List<Page> pages = new ArrayList<Page>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Script name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Script versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("versionId")
  public String getVersionId() {
    return versionId;
  }
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Script createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Script modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Script publishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("publishedDate")
  public Date getPublishedDate() {
    return publishedDate;
  }
  public void setPublishedDate(Date publishedDate) {
    this.publishedDate = publishedDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Script versionDate(Date versionDate) {
    this.versionDate = versionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("versionDate")
  public Date getVersionDate() {
    return versionDate;
  }
  public void setVersionDate(Date versionDate) {
    this.versionDate = versionDate;
  }

  
  /**
   **/
  public Script startPageId(String startPageId) {
    this.startPageId = startPageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startPageId")
  public String getStartPageId() {
    return startPageId;
  }
  public void setStartPageId(String startPageId) {
    this.startPageId = startPageId;
  }

  
  /**
   **/
  public Script startPageName(String startPageName) {
    this.startPageName = startPageName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startPageName")
  public String getStartPageName() {
    return startPageName;
  }
  public void setStartPageName(String startPageName) {
    this.startPageName = startPageName;
  }

  
  /**
   **/
  public Script features(Object features) {
    this.features = features;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("features")
  public Object getFeatures() {
    return features;
  }
  public void setFeatures(Object features) {
    this.features = features;
  }

  
  /**
   **/
  public Script variables(Object variables) {
    this.variables = variables;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("variables")
  public Object getVariables() {
    return variables;
  }
  public void setVariables(Object variables) {
    this.variables = variables;
  }

  
  /**
   **/
  public Script customActions(Object customActions) {
    this.customActions = customActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customActions")
  public Object getCustomActions() {
    return customActions;
  }
  public void setCustomActions(Object customActions) {
    this.customActions = customActions;
  }

  
  /**
   **/
  public Script pages(List<Page> pages) {
    this.pages = pages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pages")
  public List<Page> getPages() {
    return pages;
  }
  public void setPages(List<Page> pages) {
    this.pages = pages;
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
    Script script = (Script) o;
    return Objects.equals(this.id, script.id) &&
        Objects.equals(this.name, script.name) &&
        Objects.equals(this.versionId, script.versionId) &&
        Objects.equals(this.createdDate, script.createdDate) &&
        Objects.equals(this.modifiedDate, script.modifiedDate) &&
        Objects.equals(this.publishedDate, script.publishedDate) &&
        Objects.equals(this.versionDate, script.versionDate) &&
        Objects.equals(this.startPageId, script.startPageId) &&
        Objects.equals(this.startPageName, script.startPageName) &&
        Objects.equals(this.features, script.features) &&
        Objects.equals(this.variables, script.variables) &&
        Objects.equals(this.customActions, script.customActions) &&
        Objects.equals(this.pages, script.pages) &&
        Objects.equals(this.selfUri, script.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, versionId, createdDate, modifiedDate, publishedDate, versionDate, startPageId, startPageName, features, variables, customActions, pages, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Script {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    versionDate: ").append(toIndentedString(versionDate)).append("\n");
    sb.append("    startPageId: ").append(toIndentedString(startPageId)).append("\n");
    sb.append("    startPageName: ").append(toIndentedString(startPageName)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    customActions: ").append(toIndentedString(customActions)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

