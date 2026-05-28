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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * QueryOpportunityEnrollmentMetadata
 */

public class QueryOpportunityEnrollmentMetadata  implements Serializable {
  
  private UserReference modifiedBy = null;
  private Date dateModified = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private Integer version = null;
  private UserReference reviewedBy = null;
  private Date dateReviewed = null;

  public QueryOpportunityEnrollmentMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryOpportunityEnrollmentMetadata(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The user who last modified the associated entity. The id may be 'System' if it was an automated process")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }


  @ApiModelProperty(example = "null", value = "The date the associated entity was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The user who created the associated entity, if available. The id may be 'System' if it was an automated process")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "The date the associated entity was created, if available. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  /**
   * The version of the associated entity.  Used to prevent conflicts on concurrent edits
   **/
  public QueryOpportunityEnrollmentMetadata version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version of the associated entity.  Used to prevent conflicts on concurrent edits")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The user who reviewed the enrollment
   **/
  public QueryOpportunityEnrollmentMetadata reviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who reviewed the enrollment")
  @JsonProperty("reviewedBy")
  public UserReference getReviewedBy() {
    return reviewedBy;
  }
  public void setReviewedBy(UserReference reviewedBy) {
    this.reviewedBy = reviewedBy;
  }


  /**
   * The date the enrollment was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public QueryOpportunityEnrollmentMetadata dateReviewed(Date dateReviewed) {
    this.dateReviewed = dateReviewed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the enrollment was reviewed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateReviewed")
  public Date getDateReviewed() {
    return dateReviewed;
  }
  public void setDateReviewed(Date dateReviewed) {
    this.dateReviewed = dateReviewed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOpportunityEnrollmentMetadata queryOpportunityEnrollmentMetadata = (QueryOpportunityEnrollmentMetadata) o;

    return Objects.equals(this.modifiedBy, queryOpportunityEnrollmentMetadata.modifiedBy) &&
            Objects.equals(this.dateModified, queryOpportunityEnrollmentMetadata.dateModified) &&
            Objects.equals(this.createdBy, queryOpportunityEnrollmentMetadata.createdBy) &&
            Objects.equals(this.dateCreated, queryOpportunityEnrollmentMetadata.dateCreated) &&
            Objects.equals(this.version, queryOpportunityEnrollmentMetadata.version) &&
            Objects.equals(this.reviewedBy, queryOpportunityEnrollmentMetadata.reviewedBy) &&
            Objects.equals(this.dateReviewed, queryOpportunityEnrollmentMetadata.dateReviewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedBy, dateModified, createdBy, dateCreated, version, reviewedBy, dateReviewed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOpportunityEnrollmentMetadata {\n");
    
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    dateReviewed: ").append(toIndentedString(dateReviewed)).append("\n");
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

