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
import com.mypurecloud.sdk.v2.model.ExternalDataSource;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Note
 */

public class Note  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String noteText = null;
  private Date modifyDate = null;
  private Date createDate = null;
  private User createdBy = null;
  private List<ExternalDataSource> externalDataSources = new ArrayList<ExternalDataSource>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Note name(String name) {
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
  public Note noteText(String noteText) {
    this.noteText = noteText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noteText")
  public String getNoteText() {
    return noteText;
  }
  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Note modifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifyDate")
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Note createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   * The author of this note
   **/
  public Note createdBy(User createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The author of this note")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param.
   **/
  public Note externalDataSources(List<ExternalDataSource> externalDataSources) {
    this.externalDataSources = externalDataSources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param.")
  @JsonProperty("externalDataSources")
  public List<ExternalDataSource> getExternalDataSources() {
    return externalDataSources;
  }
  public void setExternalDataSources(List<ExternalDataSource> externalDataSources) {
    this.externalDataSources = externalDataSources;
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
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.name, note.name) &&
        Objects.equals(this.noteText, note.noteText) &&
        Objects.equals(this.modifyDate, note.modifyDate) &&
        Objects.equals(this.createDate, note.createDate) &&
        Objects.equals(this.createdBy, note.createdBy) &&
        Objects.equals(this.externalDataSources, note.externalDataSources) &&
        Objects.equals(this.selfUri, note.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, noteText, modifyDate, createDate, createdBy, externalDataSources, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noteText: ").append(toIndentedString(noteText)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    externalDataSources: ").append(toIndentedString(externalDataSources)).append("\n");
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

