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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ModelingProcessingError
 */

public class ModelingProcessingError  implements Serializable {
  

  private static class InternalErrorCodeEnumDeserializer extends StdDeserializer<InternalErrorCodeEnum> {
    public InternalErrorCodeEnumDeserializer() {
      super(InternalErrorCodeEnumDeserializer.class);
    }

    @Override
    public InternalErrorCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InternalErrorCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * An internal code representing the type of error. ModelInputMissing for 'Model Builder inputs not found.' ModelInputInvalid for 'Model Builder inputs are invalid. Ensure the input data format is correct.' ModelFailed for 'An error occured while building the model with the given input.'
   */
 @JsonDeserialize(using = InternalErrorCodeEnumDeserializer.class)
  public enum InternalErrorCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MODELINPUTMISSING("ModelInputMissing"),
    MODELINPUTINVALID("ModelInputInvalid"),
    MODELFAILED("ModelFailed");

    private String value;

    InternalErrorCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InternalErrorCodeEnum fromString(String key) {
      if (key == null) return null;

      for (InternalErrorCodeEnum value : InternalErrorCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InternalErrorCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InternalErrorCodeEnum internalErrorCode = null;
  private String description = null;

  
  @ApiModelProperty(example = "null", value = "An internal code representing the type of error. ModelInputMissing for 'Model Builder inputs not found.' ModelInputInvalid for 'Model Builder inputs are invalid. Ensure the input data format is correct.' ModelFailed for 'An error occured while building the model with the given input.'")
  @JsonProperty("internalErrorCode")
  public InternalErrorCodeEnum getInternalErrorCode() {
    return internalErrorCode;
  }

  
  @ApiModelProperty(example = "null", value = "A text description of the error")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelingProcessingError modelingProcessingError = (ModelingProcessingError) o;
    return Objects.equals(this.internalErrorCode, modelingProcessingError.internalErrorCode) &&
        Objects.equals(this.description, modelingProcessingError.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalErrorCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelingProcessingError {\n");
    
    sb.append("    internalErrorCode: ").append(toIndentedString(internalErrorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

