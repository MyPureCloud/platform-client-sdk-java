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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CreateAlternativeShiftTradeRequest
 */

public class CreateAlternativeShiftTradeRequest  implements Serializable {
  
  private String jobId = null;
  private List<String> dropShiftReferenceKeys = new ArrayList<String>();
  private List<String> pickupShiftReferenceKeys = new ArrayList<String>();

  private static class AlternativeShiftTradeGranularityEnumDeserializer extends StdDeserializer<AlternativeShiftTradeGranularityEnum> {
    public AlternativeShiftTradeGranularityEnumDeserializer() {
      super(AlternativeShiftTradeGranularityEnumDeserializer.class);
    }

    @Override
    public AlternativeShiftTradeGranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlternativeShiftTradeGranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The granularity of alternative shifts to be traded
   */
 @JsonDeserialize(using = AlternativeShiftTradeGranularityEnumDeserializer.class)
  public enum AlternativeShiftTradeGranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAILY("Daily");

    private String value;

    AlternativeShiftTradeGranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlternativeShiftTradeGranularityEnum fromString(String key) {
      if (key == null) return null;

      for (AlternativeShiftTradeGranularityEnum value : AlternativeShiftTradeGranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlternativeShiftTradeGranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AlternativeShiftTradeGranularityEnum alternativeShiftTradeGranularity = null;
  private Date expirationDate = null;

  
  /**
   * The ID of this alternative shift job
   **/
  public CreateAlternativeShiftTradeRequest jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of this alternative shift job")
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  /**
   * A list of offered shift reference keys an agent wants to drop
   **/
  public CreateAlternativeShiftTradeRequest dropShiftReferenceKeys(List<String> dropShiftReferenceKeys) {
    this.dropShiftReferenceKeys = dropShiftReferenceKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of offered shift reference keys an agent wants to drop")
  @JsonProperty("dropShiftReferenceKeys")
  public List<String> getDropShiftReferenceKeys() {
    return dropShiftReferenceKeys;
  }
  public void setDropShiftReferenceKeys(List<String> dropShiftReferenceKeys) {
    this.dropShiftReferenceKeys = dropShiftReferenceKeys;
  }


  /**
   * A list of offered shift reference keys an agent wants to pick up
   **/
  public CreateAlternativeShiftTradeRequest pickupShiftReferenceKeys(List<String> pickupShiftReferenceKeys) {
    this.pickupShiftReferenceKeys = pickupShiftReferenceKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of offered shift reference keys an agent wants to pick up")
  @JsonProperty("pickupShiftReferenceKeys")
  public List<String> getPickupShiftReferenceKeys() {
    return pickupShiftReferenceKeys;
  }
  public void setPickupShiftReferenceKeys(List<String> pickupShiftReferenceKeys) {
    this.pickupShiftReferenceKeys = pickupShiftReferenceKeys;
  }


  /**
   * The granularity of alternative shifts to be traded
   **/
  public CreateAlternativeShiftTradeRequest alternativeShiftTradeGranularity(AlternativeShiftTradeGranularityEnum alternativeShiftTradeGranularity) {
    this.alternativeShiftTradeGranularity = alternativeShiftTradeGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The granularity of alternative shifts to be traded")
  @JsonProperty("alternativeShiftTradeGranularity")
  public AlternativeShiftTradeGranularityEnum getAlternativeShiftTradeGranularity() {
    return alternativeShiftTradeGranularity;
  }
  public void setAlternativeShiftTradeGranularity(AlternativeShiftTradeGranularityEnum alternativeShiftTradeGranularity) {
    this.alternativeShiftTradeGranularity = alternativeShiftTradeGranularity;
  }


  /**
   * The date when the trade will expire in ISO-8601 format. The trade cannot be approved after expiration
   **/
  public CreateAlternativeShiftTradeRequest expirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the trade will expire in ISO-8601 format. The trade cannot be approved after expiration")
  @JsonProperty("expirationDate")
  public Date getExpirationDate() {
    return expirationDate;
  }
  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAlternativeShiftTradeRequest createAlternativeShiftTradeRequest = (CreateAlternativeShiftTradeRequest) o;

    return Objects.equals(this.jobId, createAlternativeShiftTradeRequest.jobId) &&
            Objects.equals(this.dropShiftReferenceKeys, createAlternativeShiftTradeRequest.dropShiftReferenceKeys) &&
            Objects.equals(this.pickupShiftReferenceKeys, createAlternativeShiftTradeRequest.pickupShiftReferenceKeys) &&
            Objects.equals(this.alternativeShiftTradeGranularity, createAlternativeShiftTradeRequest.alternativeShiftTradeGranularity) &&
            Objects.equals(this.expirationDate, createAlternativeShiftTradeRequest.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, dropShiftReferenceKeys, pickupShiftReferenceKeys, alternativeShiftTradeGranularity, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAlternativeShiftTradeRequest {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    dropShiftReferenceKeys: ").append(toIndentedString(dropShiftReferenceKeys)).append("\n");
    sb.append("    pickupShiftReferenceKeys: ").append(toIndentedString(pickupShiftReferenceKeys)).append("\n");
    sb.append("    alternativeShiftTradeGranularity: ").append(toIndentedString(alternativeShiftTradeGranularity)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

