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
 * Response for activation of an external event
 */
@ApiModel(description = "Response for activation of an external event")

public class ActivateExternalEventResponse  implements Serializable {
  
  private String schemaId = null;
  private String eventName = null;
  private String displayName = null;
  private Integer rank = null;

  private static class ActivationStatusEnumDeserializer extends StdDeserializer<ActivationStatusEnum> {
    public ActivationStatusEnumDeserializer() {
      super(ActivationStatusEnumDeserializer.class);
    }

    @Override
    public ActivationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The activation status of the external event
   */
 @JsonDeserialize(using = ActivationStatusEnumDeserializer.class)
  public enum ActivationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVATED("Activated"),
    DEACTIVATED("Deactivated");

    private String value;

    ActivationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (ActivationStatusEnum value : ActivationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivationStatusEnum activationStatus = null;

  public ActivateExternalEventResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ActivateExternalEventResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The schema ID of the external event")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }


  @ApiModelProperty(example = "null", value = "The name of the external event")
  @JsonProperty("eventName")
  public String getEventName() {
    return eventName;
  }


  @ApiModelProperty(example = "null", value = "The display name of the external event")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }


  @ApiModelProperty(example = "null", value = "The rank of the external event")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }


  @ApiModelProperty(example = "null", value = "The activation status of the external event")
  @JsonProperty("activationStatus")
  public ActivationStatusEnum getActivationStatus() {
    return activationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivateExternalEventResponse activateExternalEventResponse = (ActivateExternalEventResponse) o;

    return Objects.equals(this.schemaId, activateExternalEventResponse.schemaId) &&
            Objects.equals(this.eventName, activateExternalEventResponse.eventName) &&
            Objects.equals(this.displayName, activateExternalEventResponse.displayName) &&
            Objects.equals(this.rank, activateExternalEventResponse.rank) &&
            Objects.equals(this.activationStatus, activateExternalEventResponse.activationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, eventName, displayName, rank, activationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivateExternalEventResponse {\n");
    
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    activationStatus: ").append(toIndentedString(activationStatus)).append("\n");
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

