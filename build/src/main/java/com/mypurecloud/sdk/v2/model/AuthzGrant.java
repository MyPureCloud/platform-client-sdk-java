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
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzGrantRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AuthzGrant
 */

public class AuthzGrant  implements Serializable {
  
  private String subjectId = null;
  private AuthzDivision division = null;
  private AuthzGrantRole role = null;
  private Date grantMadeAt = null;

  
  /**
   **/
  public AuthzGrant subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subjectId")
  public String getSubjectId() {
    return subjectId;
  }
  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  
  /**
   **/
  public AuthzGrant division(AuthzDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public AuthzDivision getDivision() {
    return division;
  }
  public void setDivision(AuthzDivision division) {
    this.division = division;
  }

  
  /**
   **/
  public AuthzGrant role(AuthzGrantRole role) {
    this.role = role;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("role")
  public AuthzGrantRole getRole() {
    return role;
  }
  public void setRole(AuthzGrantRole role) {
    this.role = role;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AuthzGrant grantMadeAt(Date grantMadeAt) {
    this.grantMadeAt = grantMadeAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("grantMadeAt")
  public Date getGrantMadeAt() {
    return grantMadeAt;
  }
  public void setGrantMadeAt(Date grantMadeAt) {
    this.grantMadeAt = grantMadeAt;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthzGrant authzGrant = (AuthzGrant) o;
    return Objects.equals(this.subjectId, authzGrant.subjectId) &&
        Objects.equals(this.division, authzGrant.division) &&
        Objects.equals(this.role, authzGrant.role) &&
        Objects.equals(this.grantMadeAt, authzGrant.grantMadeAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectId, division, role, grantMadeAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzGrant {\n");
    
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    grantMadeAt: ").append(toIndentedString(grantMadeAt)).append("\n");
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

