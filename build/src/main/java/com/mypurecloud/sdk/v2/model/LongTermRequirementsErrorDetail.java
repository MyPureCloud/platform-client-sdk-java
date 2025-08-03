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
 * LongTermRequirementsErrorDetail
 */

public class LongTermRequirementsErrorDetail  implements Serializable {
  

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
   * The error code
   */
 @JsonDeserialize(using = InternalErrorCodeEnumDeserializer.class)
  public enum InternalErrorCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TIMEDOUT("TimedOut"),
    NODATA("NoData"),
    CLIENTDATAINVALID("ClientDataInvalid"),
    CONFIGURATIONINVALID("ConfigurationInvalid"),
    REQUIREMENTSFAILED("RequirementsFailed");

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

  public LongTermRequirementsErrorDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The error code
   **/
  public LongTermRequirementsErrorDetail internalErrorCode(InternalErrorCodeEnum internalErrorCode) {
    this.internalErrorCode = internalErrorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The error code")
  @JsonProperty("internalErrorCode")
  public InternalErrorCodeEnum getInternalErrorCode() {
    return internalErrorCode;
  }
  public void setInternalErrorCode(InternalErrorCodeEnum internalErrorCode) {
    this.internalErrorCode = internalErrorCode;
  }


  /**
   * The description of the error code
   **/
  public LongTermRequirementsErrorDetail description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description of the error code")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTermRequirementsErrorDetail longTermRequirementsErrorDetail = (LongTermRequirementsErrorDetail) o;

    return Objects.equals(this.internalErrorCode, longTermRequirementsErrorDetail.internalErrorCode) &&
            Objects.equals(this.description, longTermRequirementsErrorDetail.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalErrorCode, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermRequirementsErrorDetail {\n");
    
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

