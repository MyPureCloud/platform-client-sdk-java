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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AdherenceExplanationListingAgentQueryResponse;
import com.mypurecloud.sdk.v2.model.AdherenceExplanationListingBuQueryResponse;
import com.mypurecloud.sdk.v2.model.AdherenceExplanationResponse;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AdherenceExplanationJob
 */

public class AdherenceExplanationJob  implements Serializable {
  
  private String id = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the adherence explanation job
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDEXPLANATION("AddExplanation"),
    UPDATEEXPLANATION("UpdateExplanation"),
    QUERYAGENTEXPLANATIONS("QueryAgentExplanations"),
    QUERYBUEXPLANATIONS("QueryBuExplanations");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

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
   * The status of the adherence explanation job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

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
  private AdherenceExplanationResponse adherenceExplanation = null;
  private String downloadUrl = null;
  private ErrorBody error = null;
  private AdherenceExplanationListingAgentQueryResponse agentQueryResponseTemplate = null;
  private AdherenceExplanationListingBuQueryResponse buQueryResponseTemplate = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The type of the adherence explanation job
   **/
  public AdherenceExplanationJob type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the adherence explanation job")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The status of the adherence explanation job
   **/
  public AdherenceExplanationJob status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the adherence explanation job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The adherence explanation added or modified by the job once complete; may be null if status == 'Error'. Used if type is in [ 'AddExplanation', 'UpdateExplanation' ]
   **/
  public AdherenceExplanationJob adherenceExplanation(AdherenceExplanationResponse adherenceExplanation) {
    this.adherenceExplanation = adherenceExplanation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The adherence explanation added or modified by the job once complete; may be null if status == 'Error'. Used if type is in [ 'AddExplanation', 'UpdateExplanation' ]")
  @JsonProperty("adherenceExplanation")
  public AdherenceExplanationResponse getAdherenceExplanation() {
    return adherenceExplanation;
  }
  public void setAdherenceExplanation(AdherenceExplanationResponse adherenceExplanation) {
    this.adherenceExplanation = adherenceExplanation;
  }


  /**
   * A URL to fetch results of the job. Only set if status == 'Complete' and type is in [ 'QueryAgentExplanations', 'QueryBuExplanations' ]
   **/
  public AdherenceExplanationJob downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URL to fetch results of the job. Only set if status == 'Complete' and type is in [ 'QueryAgentExplanations', 'QueryBuExplanations' ]")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Error details if status == 'Error'
   **/
  public AdherenceExplanationJob error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details if status == 'Error'")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  /**
   * Schema template for deserializing data returned from the downloadUrl. Use if type == 'QueryAgentExplanations'
   **/
  public AdherenceExplanationJob agentQueryResponseTemplate(AdherenceExplanationListingAgentQueryResponse agentQueryResponseTemplate) {
    this.agentQueryResponseTemplate = agentQueryResponseTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schema template for deserializing data returned from the downloadUrl. Use if type == 'QueryAgentExplanations'")
  @JsonProperty("agentQueryResponseTemplate")
  public AdherenceExplanationListingAgentQueryResponse getAgentQueryResponseTemplate() {
    return agentQueryResponseTemplate;
  }
  public void setAgentQueryResponseTemplate(AdherenceExplanationListingAgentQueryResponse agentQueryResponseTemplate) {
    this.agentQueryResponseTemplate = agentQueryResponseTemplate;
  }


  /**
   * Schema template for deserializing data returned from the downloadUrl. Use if type == 'QueryBuExplanations'
   **/
  public AdherenceExplanationJob buQueryResponseTemplate(AdherenceExplanationListingBuQueryResponse buQueryResponseTemplate) {
    this.buQueryResponseTemplate = buQueryResponseTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schema template for deserializing data returned from the downloadUrl. Use if type == 'QueryBuExplanations'")
  @JsonProperty("buQueryResponseTemplate")
  public AdherenceExplanationListingBuQueryResponse getBuQueryResponseTemplate() {
    return buQueryResponseTemplate;
  }
  public void setBuQueryResponseTemplate(AdherenceExplanationListingBuQueryResponse buQueryResponseTemplate) {
    this.buQueryResponseTemplate = buQueryResponseTemplate;
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
    AdherenceExplanationJob adherenceExplanationJob = (AdherenceExplanationJob) o;

    return Objects.equals(this.id, adherenceExplanationJob.id) &&
            Objects.equals(this.type, adherenceExplanationJob.type) &&
            Objects.equals(this.status, adherenceExplanationJob.status) &&
            Objects.equals(this.adherenceExplanation, adherenceExplanationJob.adherenceExplanation) &&
            Objects.equals(this.downloadUrl, adherenceExplanationJob.downloadUrl) &&
            Objects.equals(this.error, adherenceExplanationJob.error) &&
            Objects.equals(this.agentQueryResponseTemplate, adherenceExplanationJob.agentQueryResponseTemplate) &&
            Objects.equals(this.buQueryResponseTemplate, adherenceExplanationJob.buQueryResponseTemplate) &&
            Objects.equals(this.selfUri, adherenceExplanationJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, adherenceExplanation, downloadUrl, error, agentQueryResponseTemplate, buQueryResponseTemplate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdherenceExplanationJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    adherenceExplanation: ").append(toIndentedString(adherenceExplanation)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    agentQueryResponseTemplate: ").append(toIndentedString(agentQueryResponseTemplate)).append("\n");
    sb.append("    buQueryResponseTemplate: ").append(toIndentedString(buQueryResponseTemplate)).append("\n");
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

