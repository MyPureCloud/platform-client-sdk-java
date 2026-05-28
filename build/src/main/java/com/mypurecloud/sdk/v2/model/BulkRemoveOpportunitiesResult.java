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
import com.mypurecloud.sdk.v2.model.BulkOpportunitiesError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BulkRemoveOpportunitiesResult
 */

public class BulkRemoveOpportunitiesResult  implements Serializable {
  

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
   * The status indicating the result of the bulk operation for this item
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private BulkOpportunitiesError error = null;
  private String opportunityId = null;

  public BulkRemoveOpportunitiesResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BulkRemoveOpportunitiesResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The status indicating the result of the bulk operation for this item
   **/
  public BulkRemoveOpportunitiesResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status indicating the result of the bulk operation for this item")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The error result if the operation failed
   **/
  public BulkRemoveOpportunitiesResult error(BulkOpportunitiesError error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error result if the operation failed")
  @JsonProperty("error")
  public BulkOpportunitiesError getError() {
    return error;
  }
  public void setError(BulkOpportunitiesError error) {
    this.error = error;
  }


  /**
   * The ID of the opportunity
   **/
  public BulkRemoveOpportunitiesResult opportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the opportunity")
  @JsonProperty("opportunityId")
  public String getOpportunityId() {
    return opportunityId;
  }
  public void setOpportunityId(String opportunityId) {
    this.opportunityId = opportunityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkRemoveOpportunitiesResult bulkRemoveOpportunitiesResult = (BulkRemoveOpportunitiesResult) o;

    return Objects.equals(this.status, bulkRemoveOpportunitiesResult.status) &&
            Objects.equals(this.error, bulkRemoveOpportunitiesResult.error) &&
            Objects.equals(this.opportunityId, bulkRemoveOpportunitiesResult.opportunityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, opportunityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkRemoveOpportunitiesResult {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    opportunityId: ").append(toIndentedString(opportunityId)).append("\n");
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

