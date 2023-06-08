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
import com.mypurecloud.sdk.v2.model.ExecutionDataEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * This is a list of executionData links that can be used to download the complete executionData
 */
@ApiModel(description = "This is a list of executionData links that can be used to download the complete executionData")

public class GetFlowExecutionDataJobResult  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ExecutionDataEntity> entities = new ArrayList<ExecutionDataEntity>();

  private static class JobStateEnumDeserializer extends StdDeserializer<JobStateEnum> {
    public JobStateEnumDeserializer() {
      super(JobStateEnumDeserializer.class);
    }

    @Override
    public JobStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return JobStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the backend process to prep the files for download.
   */
 @JsonDeserialize(using = JobStateEnumDeserializer.class)
  public enum JobStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REGISTERED("Registered"),
    RUNNING("Running"),
    SUCCESS("Success"),
    FAILED("Failed");

    private String value;

    JobStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static JobStateEnum fromString(String key) {
      if (key == null) return null;

      for (JobStateEnum value : JobStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return JobStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private JobStateEnum jobState = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public GetFlowExecutionDataJobResult name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * On jobState = Success this field will be populated with the list of results of files for download.
   **/
  public GetFlowExecutionDataJobResult entities(List<ExecutionDataEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "On jobState = Success this field will be populated with the list of results of files for download.")
  @JsonProperty("entities")
  public List<ExecutionDataEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<ExecutionDataEntity> entities) {
    this.entities = entities;
  }


  /**
   * The state of the backend process to prep the files for download.
   **/
  public GetFlowExecutionDataJobResult jobState(JobStateEnum jobState) {
    this.jobState = jobState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the backend process to prep the files for download.")
  @JsonProperty("jobState")
  public JobStateEnum getJobState() {
    return jobState;
  }
  public void setJobState(JobStateEnum jobState) {
    this.jobState = jobState;
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
    GetFlowExecutionDataJobResult getFlowExecutionDataJobResult = (GetFlowExecutionDataJobResult) o;

    return Objects.equals(this.id, getFlowExecutionDataJobResult.id) &&
            Objects.equals(this.name, getFlowExecutionDataJobResult.name) &&
            Objects.equals(this.entities, getFlowExecutionDataJobResult.entities) &&
            Objects.equals(this.jobState, getFlowExecutionDataJobResult.jobState) &&
            Objects.equals(this.selfUri, getFlowExecutionDataJobResult.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, entities, jobState, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFlowExecutionDataJobResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
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

