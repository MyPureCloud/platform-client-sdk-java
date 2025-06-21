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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.GeneratedGuideContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GuideContentGenerationJob
 */

public class GuideContentGenerationJob  implements Serializable {
  
  private String id = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the job.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INPROGRESS("InProgress"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private List<ErrorBody> errors = null;
  private AddressableEntityRef guide = null;
  private GeneratedGuideContent guideContent = null;
  private String selfUri = null;

  public GuideContentGenerationJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      errors = new ArrayList<ErrorBody>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The status of the job.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The list of errors in case of job failure.")
  @JsonProperty("errors")
  public List<ErrorBody> getErrors() {
    return errors;
  }


  /**
   **/
  public GuideContentGenerationJob guide(AddressableEntityRef guide) {
    this.guide = guide;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("guide")
  public AddressableEntityRef getGuide() {
    return guide;
  }
  public void setGuide(AddressableEntityRef guide) {
    this.guide = guide;
  }


  /**
   **/
  public GuideContentGenerationJob guideContent(GeneratedGuideContent guideContent) {
    this.guideContent = guideContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("guideContent")
  public GeneratedGuideContent getGuideContent() {
    return guideContent;
  }
  public void setGuideContent(GeneratedGuideContent guideContent) {
    this.guideContent = guideContent;
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
    GuideContentGenerationJob guideContentGenerationJob = (GuideContentGenerationJob) o;

    return Objects.equals(this.id, guideContentGenerationJob.id) &&
            Objects.equals(this.status, guideContentGenerationJob.status) &&
            Objects.equals(this.errors, guideContentGenerationJob.errors) &&
            Objects.equals(this.guide, guideContentGenerationJob.guide) &&
            Objects.equals(this.guideContent, guideContentGenerationJob.guideContent) &&
            Objects.equals(this.selfUri, guideContentGenerationJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, errors, guide, guideContent, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideContentGenerationJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    guide: ").append(toIndentedString(guide)).append("\n");
    sb.append("    guideContent: ").append(toIndentedString(guideContent)).append("\n");
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

