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
import com.mypurecloud.sdk.v2.model.DecisionTableColumns;
import com.mypurecloud.sdk.v2.model.DecisionTableContract;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionEntity;
import com.mypurecloud.sdk.v2.model.Division;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DecisionTable
 */

public class DecisionTable  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private String description = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date datePublished = null;
  private DecisionTableVersionEntity published = null;
  private DecisionTableVersionEntity latest = null;
  private DecisionTableColumns columns = null;
  private DecisionTableContract publishedContract = null;
  private String selfUri = null;

  public DecisionTable() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DecisionTable name(String name) {
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
   * The division to which this entity belongs.
   **/
  public DecisionTable division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }


  /**
   * The decision table description.
   **/
  public DecisionTable description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decision table description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "UTC date time indicating when this decision table was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "UTC date time indicating when this decision table was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "UTC date time indicating when this decision table was published. Null if never published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePublished")
  public Date getDatePublished() {
    return datePublished;
  }


  @ApiModelProperty(example = "null", value = "The entity reference to the most recently published decision table version. Null if never published.")
  @JsonProperty("published")
  public DecisionTableVersionEntity getPublished() {
    return published;
  }


  @ApiModelProperty(example = "null", value = "The entity reference to the most recently created decision table version.")
  @JsonProperty("latest")
  public DecisionTableVersionEntity getLatest() {
    return latest;
  }


  /**
   * The column definitions of this decision table.
   **/
  public DecisionTable columns(DecisionTableColumns columns) {
    this.columns = columns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column definitions of this decision table.")
  @JsonProperty("columns")
  public DecisionTableColumns getColumns() {
    return columns;
  }
  public void setColumns(DecisionTableColumns columns) {
    this.columns = columns;
  }


  /**
   * The published contract information for this decision table.
   **/
  public DecisionTable publishedContract(DecisionTableContract publishedContract) {
    this.publishedContract = publishedContract;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The published contract information for this decision table.")
  @JsonProperty("publishedContract")
  public DecisionTableContract getPublishedContract() {
    return publishedContract;
  }
  public void setPublishedContract(DecisionTableContract publishedContract) {
    this.publishedContract = publishedContract;
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
    DecisionTable decisionTable = (DecisionTable) o;

    return Objects.equals(this.id, decisionTable.id) &&
            Objects.equals(this.name, decisionTable.name) &&
            Objects.equals(this.division, decisionTable.division) &&
            Objects.equals(this.description, decisionTable.description) &&
            Objects.equals(this.dateCreated, decisionTable.dateCreated) &&
            Objects.equals(this.dateModified, decisionTable.dateModified) &&
            Objects.equals(this.datePublished, decisionTable.datePublished) &&
            Objects.equals(this.published, decisionTable.published) &&
            Objects.equals(this.latest, decisionTable.latest) &&
            Objects.equals(this.columns, decisionTable.columns) &&
            Objects.equals(this.publishedContract, decisionTable.publishedContract) &&
            Objects.equals(this.selfUri, decisionTable.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, dateCreated, dateModified, datePublished, published, latest, columns, publishedContract, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    publishedContract: ").append(toIndentedString(publishedContract)).append("\n");
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

