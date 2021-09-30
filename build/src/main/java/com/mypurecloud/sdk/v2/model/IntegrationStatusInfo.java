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
import com.mypurecloud.sdk.v2.model.MessageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Status information for an Integration.
 */
@ApiModel(description = "Status information for an Integration.")

public class IntegrationStatusInfo  implements Serializable {
  

  private static class CodeEnumDeserializer extends StdDeserializer<CodeEnum> {
    public CodeEnumDeserializer() {
      super(CodeEnumDeserializer.class);
    }

    @Override
    public CodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Machine-readable status as reported by the integration.
   */
 @JsonDeserialize(using = CodeEnumDeserializer.class)
  public enum CodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("ACTIVE"),
    ACTIVATING("ACTIVATING"),
    INACTIVE("INACTIVE"),
    DEACTIVATING("DEACTIVATING"),
    ERROR("ERROR");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CodeEnum fromString(String key) {
      if (key == null) return null;

      for (CodeEnum value : CodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CodeEnum code = null;
  private String effective = null;
  private MessageInfo detail = null;
  private Date lastUpdated = null;

  
  @ApiModelProperty(example = "null", value = "Machine-readable status as reported by the integration.")
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }

  
  @ApiModelProperty(example = "null", value = "Localized, human-readable, effective status of the integration.")
  @JsonProperty("effective")
  public String getEffective() {
    return effective;
  }

  
  @ApiModelProperty(example = "null", value = "Localizable status details for the integration.")
  @JsonProperty("detail")
  public MessageInfo getDetail() {
    return detail;
  }

  
  @ApiModelProperty(example = "null", value = "Date and time (in UTC) when the integration status (i.e. the code field) was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("lastUpdated")
  public Date getLastUpdated() {
    return lastUpdated;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationStatusInfo integrationStatusInfo = (IntegrationStatusInfo) o;
    return Objects.equals(this.code, integrationStatusInfo.code) &&
        Objects.equals(this.effective, integrationStatusInfo.effective) &&
        Objects.equals(this.detail, integrationStatusInfo.detail) &&
        Objects.equals(this.lastUpdated, integrationStatusInfo.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, effective, detail, lastUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationStatusInfo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
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

