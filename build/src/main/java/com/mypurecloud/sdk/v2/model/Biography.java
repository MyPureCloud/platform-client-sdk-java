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
import com.mypurecloud.sdk.v2.model.Education;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Biography
 */

public class Biography  implements Serializable {
  
  private String biography = null;
  private List<String> interests = new ArrayList<String>();
  private List<String> hobbies = new ArrayList<String>();
  private String spouse = null;
  private List<Education> education = new ArrayList<Education>();

  
  /**
   * Personal detailed description
   **/
  public Biography biography(String biography) {
    this.biography = biography;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Personal detailed description")
  @JsonProperty("biography")
  public String getBiography() {
    return biography;
  }
  public void setBiography(String biography) {
    this.biography = biography;
  }

  
  /**
   **/
  public Biography interests(List<String> interests) {
    this.interests = interests;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interests")
  public List<String> getInterests() {
    return interests;
  }
  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  
  /**
   **/
  public Biography hobbies(List<String> hobbies) {
    this.hobbies = hobbies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hobbies")
  public List<String> getHobbies() {
    return hobbies;
  }
  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  
  /**
   **/
  public Biography spouse(String spouse) {
    this.spouse = spouse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("spouse")
  public String getSpouse() {
    return spouse;
  }
  public void setSpouse(String spouse) {
    this.spouse = spouse;
  }

  
  /**
   * User education details
   **/
  public Biography education(List<Education> education) {
    this.education = education;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User education details")
  @JsonProperty("education")
  public List<Education> getEducation() {
    return education;
  }
  public void setEducation(List<Education> education) {
    this.education = education;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Biography biography = (Biography) o;
    return Objects.equals(this.biography, biography.biography) &&
        Objects.equals(this.interests, biography.interests) &&
        Objects.equals(this.hobbies, biography.hobbies) &&
        Objects.equals(this.spouse, biography.spouse) &&
        Objects.equals(this.education, biography.education);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biography, interests, hobbies, spouse, education);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Biography {\n");
    
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    hobbies: ").append(toIndentedString(hobbies)).append("\n");
    sb.append("    spouse: ").append(toIndentedString(spouse)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
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

