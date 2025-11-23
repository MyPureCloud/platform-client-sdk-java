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
 * UsersRulesLastRunMetadata
 */

public class UsersRulesLastRunMetadata  implements Serializable {
  
  private String id = null;
  private Date createdDate = null;
  private UserReference createdBy = null;
  private Long resultCount = null;

  public UsersRulesLastRunMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id of the run
   **/
  public UsersRulesLastRunMetadata id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the run")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The date/time the rule was run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UsersRulesLastRunMetadata createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date/time the rule was run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * The user that started the run
   **/
  public UsersRulesLastRunMetadata createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that started the run")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The number of users returned by the run
   **/
  public UsersRulesLastRunMetadata resultCount(Long resultCount) {
    this.resultCount = resultCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of users returned by the run")
  @JsonProperty("resultCount")
  public Long getResultCount() {
    return resultCount;
  }
  public void setResultCount(Long resultCount) {
    this.resultCount = resultCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersRulesLastRunMetadata usersRulesLastRunMetadata = (UsersRulesLastRunMetadata) o;

    return Objects.equals(this.id, usersRulesLastRunMetadata.id) &&
            Objects.equals(this.createdDate, usersRulesLastRunMetadata.createdDate) &&
            Objects.equals(this.createdBy, usersRulesLastRunMetadata.createdBy) &&
            Objects.equals(this.resultCount, usersRulesLastRunMetadata.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdDate, createdBy, resultCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesLastRunMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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

