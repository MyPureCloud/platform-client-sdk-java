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
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ResponseAsset
 */

public class ResponseAsset  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private Long contentLength = null;
  private String contentLocation = null;
  private String contentType = null;
  private Date dateCreated = null;
  private DomainEntityRef createdBy = null;
  private Date dateModified = null;
  private DomainEntityRef modifiedBy = null;
  private List<DomainEntityRef> responses = new ArrayList<DomainEntityRef>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ResponseAsset name(String name) {
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
  public ResponseAsset division(Division division) {
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
   * response asset size in bytes
   **/
  public ResponseAsset contentLength(Long contentLength) {
    this.contentLength = contentLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "response asset size in bytes")
  @JsonProperty("contentLength")
  public Long getContentLength() {
    return contentLength;
  }
  public void setContentLength(Long contentLength) {
    this.contentLength = contentLength;
  }

  
  /**
   * response asset location.
   **/
  public ResponseAsset contentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "response asset location.")
  @JsonProperty("contentLocation")
  public String getContentLocation() {
    return contentLocation;
  }
  public void setContentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
  }

  
  /**
   * MIME type of response asset
   **/
  public ResponseAsset contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "MIME type of response asset")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   * Created date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ResponseAsset dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Created date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * User who created the response asset
   **/
  public ResponseAsset createdBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User who created the response asset")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * Last modified date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ResponseAsset dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified date of the response asset. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * User who last modified the response asset
   **/
  public ResponseAsset modifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User who last modified the response asset")
  @JsonProperty("modifiedBy")
  public DomainEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * Canned responses actively using this asset
   **/
  public ResponseAsset responses(List<DomainEntityRef> responses) {
    this.responses = responses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Canned responses actively using this asset")
  @JsonProperty("responses")
  public List<DomainEntityRef> getResponses() {
    return responses;
  }
  public void setResponses(List<DomainEntityRef> responses) {
    this.responses = responses;
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
    ResponseAsset responseAsset = (ResponseAsset) o;
    return Objects.equals(this.id, responseAsset.id) &&
        Objects.equals(this.name, responseAsset.name) &&
        Objects.equals(this.division, responseAsset.division) &&
        Objects.equals(this.contentLength, responseAsset.contentLength) &&
        Objects.equals(this.contentLocation, responseAsset.contentLocation) &&
        Objects.equals(this.contentType, responseAsset.contentType) &&
        Objects.equals(this.dateCreated, responseAsset.dateCreated) &&
        Objects.equals(this.createdBy, responseAsset.createdBy) &&
        Objects.equals(this.dateModified, responseAsset.dateModified) &&
        Objects.equals(this.modifiedBy, responseAsset.modifiedBy) &&
        Objects.equals(this.responses, responseAsset.responses) &&
        Objects.equals(this.selfUri, responseAsset.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, contentLength, contentLocation, contentType, dateCreated, createdBy, dateModified, modifiedBy, responses, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAsset {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    contentLocation: ").append(toIndentedString(contentLocation)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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

