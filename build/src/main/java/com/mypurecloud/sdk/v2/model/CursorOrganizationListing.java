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
import com.mypurecloud.sdk.v2.model.Cursors;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CursorOrganizationListing
 */

public class CursorOrganizationListing  implements Serializable {
  
  private List<ExternalOrganization> entities = null;
  private String nextUri = null;
  private String selfUri = null;
  private String previousUri = null;
  private Cursors cursors = null;

  public CursorOrganizationListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ExternalOrganization>();
    }
  }

  
  /**
   **/
  public CursorOrganizationListing entities(List<ExternalOrganization> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ExternalOrganization> getEntities() {
    return entities;
  }
  public void setEntities(List<ExternalOrganization> entities) {
    this.entities = entities;
  }


  /**
   **/
  public CursorOrganizationListing nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   **/
  public CursorOrganizationListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   **/
  public CursorOrganizationListing previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * The cursor that points to the next set of entities being returned.
   **/
  public CursorOrganizationListing cursors(Cursors cursors) {
    this.cursors = cursors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cursor that points to the next set of entities being returned.")
  @JsonProperty("cursors")
  public Cursors getCursors() {
    return cursors;
  }
  public void setCursors(Cursors cursors) {
    this.cursors = cursors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorOrganizationListing cursorOrganizationListing = (CursorOrganizationListing) o;

    return Objects.equals(this.entities, cursorOrganizationListing.entities) &&
            Objects.equals(this.nextUri, cursorOrganizationListing.nextUri) &&
            Objects.equals(this.selfUri, cursorOrganizationListing.selfUri) &&
            Objects.equals(this.previousUri, cursorOrganizationListing.previousUri) &&
            Objects.equals(this.cursors, cursorOrganizationListing.cursors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, nextUri, selfUri, previousUri, cursors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorOrganizationListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    cursors: ").append(toIndentedString(cursors)).append("\n");
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

