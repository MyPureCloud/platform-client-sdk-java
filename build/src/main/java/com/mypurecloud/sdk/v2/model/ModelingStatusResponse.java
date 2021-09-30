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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ModelingProcessingError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ModelingStatusResponse
 */

public class ModelingStatusResponse  implements Serializable {
  
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
   * The status of the modeling job.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    SUCCESS("Success"),
    FAILED("Failed"),
    ONGOING("Ongoing"),
    PARTIALFAILURE("PartialFailure");

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
  private List<ModelingProcessingError> errorDetails = new ArrayList<ModelingProcessingError>();
  private String modelingResultUri = null;

  
  @ApiModelProperty(example = "null", value = "The ID generated for the modeling job.  Use to GET result when job is completed.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The status of the modeling job.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "If the request could not be properly processed, error details will be given here.")
  @JsonProperty("errorDetails")
  public List<ModelingProcessingError> getErrorDetails() {
    return errorDetails;
  }

  
  @ApiModelProperty(example = "null", value = "The uri of the modeling result. It has a value if the status is either 'Success', 'PartialFailure', or 'Failed'.")
  @JsonProperty("modelingResultUri")
  public String getModelingResultUri() {
    return modelingResultUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelingStatusResponse modelingStatusResponse = (ModelingStatusResponse) o;
    return Objects.equals(this.id, modelingStatusResponse.id) &&
        Objects.equals(this.status, modelingStatusResponse.status) &&
        Objects.equals(this.errorDetails, modelingStatusResponse.errorDetails) &&
        Objects.equals(this.modelingResultUri, modelingStatusResponse.modelingResultUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, errorDetails, modelingResultUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelingStatusResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    modelingResultUri: ").append(toIndentedString(modelingResultUri)).append("\n");
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

