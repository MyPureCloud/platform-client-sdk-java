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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RegisterArchitectValidateJobResponse
 */

public class RegisterArchitectValidateJobResponse  implements Serializable {
  
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
   * The status of the validate job.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REGISTERED("Registered"),
    STARTED("Started"),
    SUCCESS("Success"),
    FAILURE("Failure");

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
  private Integer totalFlows = null;
  private String selfUri = null;

  public RegisterArchitectValidateJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public RegisterArchitectValidateJobResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The status of the validate job.
   **/
  public RegisterArchitectValidateJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the validate job.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The number of flows submitted for validation.
   **/
  public RegisterArchitectValidateJobResponse totalFlows(Integer totalFlows) {
    this.totalFlows = totalFlows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of flows submitted for validation.")
  @JsonProperty("totalFlows")
  public Integer getTotalFlows() {
    return totalFlows;
  }
  public void setTotalFlows(Integer totalFlows) {
    this.totalFlows = totalFlows;
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
    RegisterArchitectValidateJobResponse registerArchitectValidateJobResponse = (RegisterArchitectValidateJobResponse) o;

    return Objects.equals(this.id, registerArchitectValidateJobResponse.id) &&
            Objects.equals(this.status, registerArchitectValidateJobResponse.status) &&
            Objects.equals(this.totalFlows, registerArchitectValidateJobResponse.totalFlows) &&
            Objects.equals(this.selfUri, registerArchitectValidateJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, totalFlows, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterArchitectValidateJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalFlows: ").append(toIndentedString(totalFlows)).append("\n");
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

