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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutlierInfo
 */

public class OutlierInfo  implements Serializable {
  
  private Boolean outlier = null;
  private Float score = null;

  
  /**
   * Boolean to identify if an outlier or not.
   **/
  public OutlierInfo outlier(Boolean outlier) {
    this.outlier = outlier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean to identify if an outlier or not.")
  @JsonProperty("outlier")
  public Boolean getOutlier() {
    return outlier;
  }
  public void setOutlier(Boolean outlier) {
    this.outlier = outlier;
  }


  /**
   * Outlier score for this utterance. The score is always 0 or greater and higher the score, the more outlier.
   **/
  public OutlierInfo score(Float score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Outlier score for this utterance. The score is always 0 or greater and higher the score, the more outlier.")
  @JsonProperty("score")
  public Float getScore() {
    return score;
  }
  public void setScore(Float score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlierInfo outlierInfo = (OutlierInfo) o;

    return Objects.equals(this.outlier, outlierInfo.outlier) &&
            Objects.equals(this.score, outlierInfo.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlier, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlierInfo {\n");
    
    sb.append("    outlier: ").append(toIndentedString(outlier)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

