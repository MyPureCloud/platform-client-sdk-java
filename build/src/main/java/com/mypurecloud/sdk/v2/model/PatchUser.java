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
import com.mypurecloud.sdk.v2.model.Biography;
import com.mypurecloud.sdk.v2.model.EmployerInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PatchUser
 */

public class PatchUser  implements Serializable {
  
  private String id = null;
  private Boolean acdAutoAnswer = null;
  private List<String> certifications = new ArrayList<String>();
  private Biography biography = null;
  private EmployerInfo employerInfo = null;

  
  /**
   * The globally unique identifier for the object.
   **/
  public PatchUser id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The value that denotes if acdAutoAnswer is set on the user
   **/
  public PatchUser acdAutoAnswer(Boolean acdAutoAnswer) {
    this.acdAutoAnswer = acdAutoAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value that denotes if acdAutoAnswer is set on the user")
  @JsonProperty("acdAutoAnswer")
  public Boolean getAcdAutoAnswer() {
    return acdAutoAnswer;
  }
  public void setAcdAutoAnswer(Boolean acdAutoAnswer) {
    this.acdAutoAnswer = acdAutoAnswer;
  }

  
  /**
   **/
  public PatchUser certifications(List<String> certifications) {
    this.certifications = certifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("certifications")
  public List<String> getCertifications() {
    return certifications;
  }
  public void setCertifications(List<String> certifications) {
    this.certifications = certifications;
  }

  
  /**
   **/
  public PatchUser biography(Biography biography) {
    this.biography = biography;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("biography")
  public Biography getBiography() {
    return biography;
  }
  public void setBiography(Biography biography) {
    this.biography = biography;
  }

  
  /**
   **/
  public PatchUser employerInfo(EmployerInfo employerInfo) {
    this.employerInfo = employerInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("employerInfo")
  public EmployerInfo getEmployerInfo() {
    return employerInfo;
  }
  public void setEmployerInfo(EmployerInfo employerInfo) {
    this.employerInfo = employerInfo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchUser patchUser = (PatchUser) o;
    return Objects.equals(this.id, patchUser.id) &&
        Objects.equals(this.acdAutoAnswer, patchUser.acdAutoAnswer) &&
        Objects.equals(this.certifications, patchUser.certifications) &&
        Objects.equals(this.biography, patchUser.biography) &&
        Objects.equals(this.employerInfo, patchUser.employerInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, acdAutoAnswer, certifications, biography, employerInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acdAutoAnswer: ").append(toIndentedString(acdAutoAnswer)).append("\n");
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    employerInfo: ").append(toIndentedString(employerInfo)).append("\n");
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

