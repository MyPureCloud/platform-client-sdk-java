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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeParseJobRequest
 */

public class KnowledgeParseJobRequest  implements Serializable {
  
  private String uploadKey = null;
  private List<String> hints = new ArrayList<String>();

  
  /**
   * Upload key
   **/
  public KnowledgeParseJobRequest uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Upload key")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  /**
   * Hinted titles for the parser.
   **/
  public KnowledgeParseJobRequest hints(List<String> hints) {
    this.hints = hints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hinted titles for the parser.")
  @JsonProperty("hints")
  public List<String> getHints() {
    return hints;
  }
  public void setHints(List<String> hints) {
    this.hints = hints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeParseJobRequest knowledgeParseJobRequest = (KnowledgeParseJobRequest) o;

    return Objects.equals(this.uploadKey, knowledgeParseJobRequest.uploadKey) &&
            Objects.equals(this.hints, knowledgeParseJobRequest.hints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadKey, hints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeParseJobRequest {\n");
    
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    hints: ").append(toIndentedString(hints)).append("\n");
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

