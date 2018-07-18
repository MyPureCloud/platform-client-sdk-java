package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchUser
 */

public class PatchUser  implements Serializable {
  
  private String id = null;
  private Boolean acdAutoAnswer = null;
  private String selfUri = null;

  
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
    PatchUser patchUser = (PatchUser) o;
    return Objects.equals(this.id, patchUser.id) &&
        Objects.equals(this.acdAutoAnswer, patchUser.acdAutoAnswer) &&
        Objects.equals(this.selfUri, patchUser.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, acdAutoAnswer, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    acdAutoAnswer: ").append(toIndentedString(acdAutoAnswer)).append("\n");
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

