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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Represents an organization language assigned to a user. When assigning to a user specify the organization langauge id as the id.
 */
@ApiModel(description = "Represents an organization language assigned to a user. When assigning to a user specify the organization langauge id as the id.")

public class UserRoutingLanguagePost  implements Serializable {
  
  private String id = null;
  private Double proficiency = null;
  private String languageUri = null;
  private String selfUri = null;

  
  /**
   * The id of the existing routing language to add to the user
   **/
  public UserRoutingLanguagePost id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the existing routing language to add to the user")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Proficiency is a rating from 0.0 to 5.0 on how competent an agent is for a particular language. It is used when a queue is set to \"Best available language\" mode to allow acd interactions to target agents with higher proficiency ratings.
   **/
  public UserRoutingLanguagePost proficiency(Double proficiency) {
    this.proficiency = proficiency;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Proficiency is a rating from 0.0 to 5.0 on how competent an agent is for a particular language. It is used when a queue is set to \"Best available language\" mode to allow acd interactions to target agents with higher proficiency ratings.")
  @JsonProperty("proficiency")
  public Double getProficiency() {
    return proficiency;
  }
  public void setProficiency(Double proficiency) {
    this.proficiency = proficiency;
  }

  
  @ApiModelProperty(example = "null", value = "URI to the organization language used by this user language.")
  @JsonProperty("languageUri")
  public String getLanguageUri() {
    return languageUri;
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
    UserRoutingLanguagePost userRoutingLanguagePost = (UserRoutingLanguagePost) o;
    return Objects.equals(this.id, userRoutingLanguagePost.id) &&
        Objects.equals(this.proficiency, userRoutingLanguagePost.proficiency) &&
        Objects.equals(this.languageUri, userRoutingLanguagePost.languageUri) &&
        Objects.equals(this.selfUri, userRoutingLanguagePost.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, proficiency, languageUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoutingLanguagePost {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
    sb.append("    languageUri: ").append(toIndentedString(languageUri)).append("\n");
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

