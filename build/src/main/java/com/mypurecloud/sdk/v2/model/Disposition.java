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
import com.mypurecloud.sdk.v2.model.DispositionAmdTimeout;
import com.mypurecloud.sdk.v2.model.DispositionParameters;
import com.mypurecloud.sdk.v2.model.DispositionSilentCallTimeout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Disposition
 */

public class Disposition  implements Serializable {
  
  private String name = null;
  private String analyzer = null;
  private DispositionParameters dispositionParameters = null;
  private Date detectedSpeechStart = null;
  private Date detectedSpeechEnd = null;
  private DispositionAmdTimeout amdTimeout = null;
  private DispositionSilentCallTimeout silentCallTimeout = null;

  public Disposition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the disposition. Either a platform predefined value, or the name of the disposition in the disposition table..
   **/
  public Disposition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the disposition. Either a platform predefined value, or the name of the disposition in the disposition table..")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The final media analyzer result that triggered the disposition result, if any.
   **/
  public Disposition analyzer(String analyzer) {
    this.analyzer = analyzer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The final media analyzer result that triggered the disposition result, if any.")
  @JsonProperty("analyzer")
  public String getAnalyzer() {
    return analyzer;
  }
  public void setAnalyzer(String analyzer) {
    this.analyzer = analyzer;
  }


  /**
   * Contains various parameters related to call analysis.
   **/
  public Disposition dispositionParameters(DispositionParameters dispositionParameters) {
    this.dispositionParameters = dispositionParameters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains various parameters related to call analysis.")
  @JsonProperty("dispositionParameters")
  public DispositionParameters getDispositionParameters() {
    return dispositionParameters;
  }
  public void setDispositionParameters(DispositionParameters dispositionParameters) {
    this.dispositionParameters = dispositionParameters;
  }


  /**
   * Absolute time when the speech started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Disposition detectedSpeechStart(Date detectedSpeechStart) {
    this.detectedSpeechStart = detectedSpeechStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Absolute time when the speech started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("detectedSpeechStart")
  public Date getDetectedSpeechStart() {
    return detectedSpeechStart;
  }
  public void setDetectedSpeechStart(Date detectedSpeechStart) {
    this.detectedSpeechStart = detectedSpeechStart;
  }


  /**
   * Absolute time when the speech ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Disposition detectedSpeechEnd(Date detectedSpeechEnd) {
    this.detectedSpeechEnd = detectedSpeechEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Absolute time when the speech ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("detectedSpeechEnd")
  public Date getDetectedSpeechEnd() {
    return detectedSpeechEnd;
  }
  public void setDetectedSpeechEnd(Date detectedSpeechEnd) {
    this.detectedSpeechEnd = detectedSpeechEnd;
  }


  /**
   * Answering Machine Detection timeout configuration.
   **/
  public Disposition amdTimeout(DispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Answering Machine Detection timeout configuration.")
  @JsonProperty("amdTimeout")
  public DispositionAmdTimeout getAmdTimeout() {
    return amdTimeout;
  }
  public void setAmdTimeout(DispositionAmdTimeout amdTimeout) {
    this.amdTimeout = amdTimeout;
  }


  /**
   * Silent Call timeout configuration.
   **/
  public Disposition silentCallTimeout(DispositionSilentCallTimeout silentCallTimeout) {
    this.silentCallTimeout = silentCallTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Silent Call timeout configuration.")
  @JsonProperty("silentCallTimeout")
  public DispositionSilentCallTimeout getSilentCallTimeout() {
    return silentCallTimeout;
  }
  public void setSilentCallTimeout(DispositionSilentCallTimeout silentCallTimeout) {
    this.silentCallTimeout = silentCallTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disposition disposition = (Disposition) o;

    return Objects.equals(this.name, disposition.name) &&
            Objects.equals(this.analyzer, disposition.analyzer) &&
            Objects.equals(this.dispositionParameters, disposition.dispositionParameters) &&
            Objects.equals(this.detectedSpeechStart, disposition.detectedSpeechStart) &&
            Objects.equals(this.detectedSpeechEnd, disposition.detectedSpeechEnd) &&
            Objects.equals(this.amdTimeout, disposition.amdTimeout) &&
            Objects.equals(this.silentCallTimeout, disposition.silentCallTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, analyzer, dispositionParameters, detectedSpeechStart, detectedSpeechEnd, amdTimeout, silentCallTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disposition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    analyzer: ").append(toIndentedString(analyzer)).append("\n");
    sb.append("    dispositionParameters: ").append(toIndentedString(dispositionParameters)).append("\n");
    sb.append("    detectedSpeechStart: ").append(toIndentedString(detectedSpeechStart)).append("\n");
    sb.append("    detectedSpeechEnd: ").append(toIndentedString(detectedSpeechEnd)).append("\n");
    sb.append("    amdTimeout: ").append(toIndentedString(amdTimeout)).append("\n");
    sb.append("    silentCallTimeout: ").append(toIndentedString(silentCallTimeout)).append("\n");
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

