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
import com.mypurecloud.sdk.v2.model.NluConfusionMatrixRow;
import com.mypurecloud.sdk.v2.model.NluDomainVersion;
import com.mypurecloud.sdk.v2.model.NluQualityReportSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluDomainVersionQualityReport
 */

public class NluDomainVersionQualityReport  implements Serializable {
  
  private NluDomainVersion version = null;
  private List<NluConfusionMatrixRow> confusionMatrix = new ArrayList<NluConfusionMatrixRow>();
  private NluQualityReportSummary summary = null;

  
  /**
   * The domain and version details of the quality report
   **/
  public NluDomainVersionQualityReport version(NluDomainVersion version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The domain and version details of the quality report")
  @JsonProperty("version")
  public NluDomainVersion getVersion() {
    return version;
  }
  public void setVersion(NluDomainVersion version) {
    this.version = version;
  }

  
  /**
   * The confusion matrix for the Domain Version
   **/
  public NluDomainVersionQualityReport confusionMatrix(List<NluConfusionMatrixRow> confusionMatrix) {
    this.confusionMatrix = confusionMatrix;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The confusion matrix for the Domain Version")
  @JsonProperty("confusionMatrix")
  public List<NluConfusionMatrixRow> getConfusionMatrix() {
    return confusionMatrix;
  }
  public void setConfusionMatrix(List<NluConfusionMatrixRow> confusionMatrix) {
    this.confusionMatrix = confusionMatrix;
  }

  
  /**
   * The quality report summary for the Domain Version
   **/
  public NluDomainVersionQualityReport summary(NluQualityReportSummary summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The quality report summary for the Domain Version")
  @JsonProperty("summary")
  public NluQualityReportSummary getSummary() {
    return summary;
  }
  public void setSummary(NluQualityReportSummary summary) {
    this.summary = summary;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluDomainVersionQualityReport nluDomainVersionQualityReport = (NluDomainVersionQualityReport) o;
    return Objects.equals(this.version, nluDomainVersionQualityReport.version) &&
        Objects.equals(this.confusionMatrix, nluDomainVersionQualityReport.confusionMatrix) &&
        Objects.equals(this.summary, nluDomainVersionQualityReport.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, confusionMatrix, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDomainVersionQualityReport {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    confusionMatrix: ").append(toIndentedString(confusionMatrix)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

