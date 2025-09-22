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
import com.mypurecloud.sdk.v2.model.SummarySetting;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SummarySettingWithTranscript
 */

public class SummarySettingWithTranscript  implements Serializable {
  
  private String transcript = null;
  private SummarySetting summarySetting = null;
  private String summaryPreviewSessionId = null;

  public SummarySettingWithTranscript() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Example transcript to preview with the setting.
   **/
  public SummarySettingWithTranscript transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Example transcript to preview with the setting.")
  @JsonProperty("transcript")
  public String getTranscript() {
    return transcript;
  }
  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }


  /**
   * Summary setting to preview on the transcript.
   **/
  public SummarySettingWithTranscript summarySetting(SummarySetting summarySetting) {
    this.summarySetting = summarySetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Summary setting to preview on the transcript.")
  @JsonProperty("summarySetting")
  public SummarySetting getSummarySetting() {
    return summarySetting;
  }
  public void setSummarySetting(SummarySetting summarySetting) {
    this.summarySetting = summarySetting;
  }


  /**
   * Session identifier of the summary preview.
   **/
  public SummarySettingWithTranscript summaryPreviewSessionId(String summaryPreviewSessionId) {
    this.summaryPreviewSessionId = summaryPreviewSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Session identifier of the summary preview.")
  @JsonProperty("summaryPreviewSessionId")
  public String getSummaryPreviewSessionId() {
    return summaryPreviewSessionId;
  }
  public void setSummaryPreviewSessionId(String summaryPreviewSessionId) {
    this.summaryPreviewSessionId = summaryPreviewSessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarySettingWithTranscript summarySettingWithTranscript = (SummarySettingWithTranscript) o;

    return Objects.equals(this.transcript, summarySettingWithTranscript.transcript) &&
            Objects.equals(this.summarySetting, summarySettingWithTranscript.summarySetting) &&
            Objects.equals(this.summaryPreviewSessionId, summarySettingWithTranscript.summaryPreviewSessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transcript, summarySetting, summaryPreviewSessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarySettingWithTranscript {\n");
    
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    summarySetting: ").append(toIndentedString(summarySetting)).append("\n");
    sb.append("    summaryPreviewSessionId: ").append(toIndentedString(summaryPreviewSessionId)).append("\n");
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

