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
 * Comment
 */

public class Comment  implements Serializable {
  
  private String id = null;
  private String content = null;
  private UserReference user = null;
  private UserReference modifiedBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public Comment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public Comment(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The comment body.
   **/
  public Comment content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comment body.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }


  /**
   * The User who authored the comment.
   **/
  public Comment user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The User who authored the comment.")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The User who last modified the comment.
   **/
  public Comment modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The User who last modified the comment.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The date the comment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Comment dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the comment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The date the comment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Comment dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the comment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
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
    Comment comment = (Comment) o;

    return Objects.equals(this.id, comment.id) &&
            Objects.equals(this.content, comment.content) &&
            Objects.equals(this.user, comment.user) &&
            Objects.equals(this.modifiedBy, comment.modifiedBy) &&
            Objects.equals(this.dateCreated, comment.dateCreated) &&
            Objects.equals(this.dateModified, comment.dateModified) &&
            Objects.equals(this.selfUri, comment.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, user, modifiedBy, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

