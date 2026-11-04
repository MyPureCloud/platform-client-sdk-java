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
 * RecipientWarning
 */

public class RecipientWarning  implements Serializable {
  
  private String email = null;

  private static class ReasonEnumDeserializer extends StdDeserializer<ReasonEnum> {
    public ReasonEnumDeserializer() {
      super(ReasonEnumDeserializer.class);
    }

    @Override
    public ReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason the recipient failed validation.
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INVALIDEMAIL("InvalidEmail"),
    DOMAINNOTPERMITTED("DomainNotPermitted");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ReasonEnum value : ReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReasonEnum reason = null;
  private String fieldName = null;

  public RecipientWarning() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public RecipientWarning(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The recipient email address that failed validation.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }


  @ApiModelProperty(example = "null", value = "The reason the recipient failed validation.")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }


  @ApiModelProperty(example = "null", value = "The array-index path of the recipient within the draft, for example \"to[0]\", \"cc[1]\" or \"bcc[0]\".")
  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientWarning recipientWarning = (RecipientWarning) o;

    return Objects.equals(this.email, recipientWarning.email) &&
            Objects.equals(this.reason, recipientWarning.reason) &&
            Objects.equals(this.fieldName, recipientWarning.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, reason, fieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientWarning {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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

