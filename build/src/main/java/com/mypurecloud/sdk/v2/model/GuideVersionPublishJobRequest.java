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
import com.mypurecloud.sdk.v2.model.GuideVersionPublish;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Request body for publishing a guide version
 */
@ApiModel(description = "Request body for publishing a guide version")

public class GuideVersionPublishJobRequest  implements Serializable {
  
  private GuideVersionPublish guideVersion = null;

  public GuideVersionPublishJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The attributes of the guide version to update as part of this publish job.
   **/
  public GuideVersionPublishJobRequest guideVersion(GuideVersionPublish guideVersion) {
    this.guideVersion = guideVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attributes of the guide version to update as part of this publish job.")
  @JsonProperty("guideVersion")
  public GuideVersionPublish getGuideVersion() {
    return guideVersion;
  }
  public void setGuideVersion(GuideVersionPublish guideVersion) {
    this.guideVersion = guideVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideVersionPublishJobRequest guideVersionPublishJobRequest = (GuideVersionPublishJobRequest) o;

    return Objects.equals(this.guideVersion, guideVersionPublishJobRequest.guideVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guideVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideVersionPublishJobRequest {\n");
    
    sb.append("    guideVersion: ").append(toIndentedString(guideVersion)).append("\n");
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

