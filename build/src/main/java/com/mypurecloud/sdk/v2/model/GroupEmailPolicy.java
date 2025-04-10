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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GroupEmailPolicy
 */

public class GroupEmailPolicy  implements Serializable {
  
  private Boolean emailMembers = null;
  private Boolean emailGroup = null;

  public GroupEmailPolicy() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public GroupEmailPolicy emailMembers(Boolean emailMembers) {
    this.emailMembers = emailMembers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailMembers")
  public Boolean getEmailMembers() {
    return emailMembers;
  }
  public void setEmailMembers(Boolean emailMembers) {
    this.emailMembers = emailMembers;
  }


  /**
   **/
  public GroupEmailPolicy emailGroup(Boolean emailGroup) {
    this.emailGroup = emailGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailGroup")
  public Boolean getEmailGroup() {
    return emailGroup;
  }
  public void setEmailGroup(Boolean emailGroup) {
    this.emailGroup = emailGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupEmailPolicy groupEmailPolicy = (GroupEmailPolicy) o;

    return Objects.equals(this.emailMembers, groupEmailPolicy.emailMembers) &&
            Objects.equals(this.emailGroup, groupEmailPolicy.emailGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailMembers, emailGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupEmailPolicy {\n");
    
    sb.append("    emailMembers: ").append(toIndentedString(emailMembers)).append("\n");
    sb.append("    emailGroup: ").append(toIndentedString(emailGroup)).append("\n");
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

