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
 * DefaultAnswersTo
 */

public class DefaultAnswersTo  implements Serializable {
  
  private Boolean highestScore = null;
  private Boolean notApplicable = null;
  private Boolean lowestScore = null;
  private Boolean userDefined = null;

  public DefaultAnswersTo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * True, when answer should default to highest score
   **/
  public DefaultAnswersTo highestScore(Boolean highestScore) {
    this.highestScore = highestScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, when answer should default to highest score")
  @JsonProperty("highestScore")
  public Boolean getHighestScore() {
    return highestScore;
  }
  public void setHighestScore(Boolean highestScore) {
    this.highestScore = highestScore;
  }


  /**
   * True, when answer should default to N/A
   **/
  public DefaultAnswersTo notApplicable(Boolean notApplicable) {
    this.notApplicable = notApplicable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, when answer should default to N/A")
  @JsonProperty("notApplicable")
  public Boolean getNotApplicable() {
    return notApplicable;
  }
  public void setNotApplicable(Boolean notApplicable) {
    this.notApplicable = notApplicable;
  }


  /**
   * True, when answer should default to lowest score
   **/
  public DefaultAnswersTo lowestScore(Boolean lowestScore) {
    this.lowestScore = lowestScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, when answer should default to lowest score")
  @JsonProperty("lowestScore")
  public Boolean getLowestScore() {
    return lowestScore;
  }
  public void setLowestScore(Boolean lowestScore) {
    this.lowestScore = lowestScore;
  }


  /**
   * True, when answer should default to user defined answer
   **/
  public DefaultAnswersTo userDefined(Boolean userDefined) {
    this.userDefined = userDefined;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True, when answer should default to user defined answer")
  @JsonProperty("userDefined")
  public Boolean getUserDefined() {
    return userDefined;
  }
  public void setUserDefined(Boolean userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultAnswersTo defaultAnswersTo = (DefaultAnswersTo) o;

    return Objects.equals(this.highestScore, defaultAnswersTo.highestScore) &&
            Objects.equals(this.notApplicable, defaultAnswersTo.notApplicable) &&
            Objects.equals(this.lowestScore, defaultAnswersTo.lowestScore) &&
            Objects.equals(this.userDefined, defaultAnswersTo.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highestScore, notApplicable, lowestScore, userDefined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultAnswersTo {\n");
    
    sb.append("    highestScore: ").append(toIndentedString(highestScore)).append("\n");
    sb.append("    notApplicable: ").append(toIndentedString(notApplicable)).append("\n");
    sb.append("    lowestScore: ").append(toIndentedString(lowestScore)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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

