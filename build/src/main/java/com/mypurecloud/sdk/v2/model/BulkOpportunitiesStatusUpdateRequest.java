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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkOpportunitiesStatusUpdateRequest
 */

public class BulkOpportunitiesStatusUpdateRequest  implements Serializable {
  
  private List<String> opportunityIds = null;

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
   * The status to set for all opportunities specified in this request
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLOSED("Closed");

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

  public BulkOpportunitiesStatusUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      opportunityIds = new ArrayList<String>();
    }
  }

  public BulkOpportunitiesStatusUpdateRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      opportunityIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the opportunities to update
   **/
  public BulkOpportunitiesStatusUpdateRequest opportunityIds(List<String> opportunityIds) {
    this.opportunityIds = opportunityIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the opportunities to update")
  @JsonProperty("opportunityIds")
  public List<String> getOpportunityIds() {
    return opportunityIds;
  }
  public void setOpportunityIds(List<String> opportunityIds) {
    this.opportunityIds = opportunityIds;
  }


  /**
   * The status to set for all opportunities specified in this request
   **/
  public BulkOpportunitiesStatusUpdateRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status to set for all opportunities specified in this request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOpportunitiesStatusUpdateRequest bulkOpportunitiesStatusUpdateRequest = (BulkOpportunitiesStatusUpdateRequest) o;

    return Objects.equals(this.opportunityIds, bulkOpportunitiesStatusUpdateRequest.opportunityIds) &&
            Objects.equals(this.status, bulkOpportunitiesStatusUpdateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opportunityIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOpportunitiesStatusUpdateRequest {\n");
    
    sb.append("    opportunityIds: ").append(toIndentedString(opportunityIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

