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
 * EvaluationQualityV2TopicEvaluationSource
 */

public class EvaluationQualityV2TopicEvaluationSource  implements Serializable {
  
  private String evaluationSourceType = null;
  private String evaluationSourceId = null;
  private String evaluationSourceName = null;

  public EvaluationQualityV2TopicEvaluationSource() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public EvaluationQualityV2TopicEvaluationSource evaluationSourceType(String evaluationSourceType) {
    this.evaluationSourceType = evaluationSourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationSourceType")
  public String getEvaluationSourceType() {
    return evaluationSourceType;
  }
  public void setEvaluationSourceType(String evaluationSourceType) {
    this.evaluationSourceType = evaluationSourceType;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationSource evaluationSourceId(String evaluationSourceId) {
    this.evaluationSourceId = evaluationSourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationSourceId")
  public String getEvaluationSourceId() {
    return evaluationSourceId;
  }
  public void setEvaluationSourceId(String evaluationSourceId) {
    this.evaluationSourceId = evaluationSourceId;
  }


  /**
   **/
  public EvaluationQualityV2TopicEvaluationSource evaluationSourceName(String evaluationSourceName) {
    this.evaluationSourceName = evaluationSourceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("evaluationSourceName")
  public String getEvaluationSourceName() {
    return evaluationSourceName;
  }
  public void setEvaluationSourceName(String evaluationSourceName) {
    this.evaluationSourceName = evaluationSourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationQualityV2TopicEvaluationSource evaluationQualityV2TopicEvaluationSource = (EvaluationQualityV2TopicEvaluationSource) o;

    return Objects.equals(this.evaluationSourceType, evaluationQualityV2TopicEvaluationSource.evaluationSourceType) &&
            Objects.equals(this.evaluationSourceId, evaluationQualityV2TopicEvaluationSource.evaluationSourceId) &&
            Objects.equals(this.evaluationSourceName, evaluationQualityV2TopicEvaluationSource.evaluationSourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationSourceType, evaluationSourceId, evaluationSourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationQualityV2TopicEvaluationSource {\n");
    
    sb.append("    evaluationSourceType: ").append(toIndentedString(evaluationSourceType)).append("\n");
    sb.append("    evaluationSourceId: ").append(toIndentedString(evaluationSourceId)).append("\n");
    sb.append("    evaluationSourceName: ").append(toIndentedString(evaluationSourceName)).append("\n");
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

