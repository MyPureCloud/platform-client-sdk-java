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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationSummaryEditedBy
 */

public class ConversationSummaryEditedBy  implements Serializable {
  
  private AddressableEntityRef user = null;

  private static class PurposeEnumDeserializer extends StdDeserializer<PurposeEnum> {
    public PurposeEnumDeserializer() {
      super(PurposeEnumDeserializer.class);
    }

    @Override
    public PurposeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PurposeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The participant purpose of the user.
   */
 @JsonDeserialize(using = PurposeEnumDeserializer.class)
  public enum PurposeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ACD("Acd"),
    AGENT("Agent"),
    CUSTOMER("Customer"),
    WORKFLOW("Workflow");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PurposeEnum fromString(String key) {
      if (key == null) return null;

      for (PurposeEnum value : PurposeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PurposeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PurposeEnum purpose = null;

  public ConversationSummaryEditedBy() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ConversationSummaryEditedBy(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The user that edited the summary.
   **/
  public ConversationSummaryEditedBy user(AddressableEntityRef user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user that edited the summary.")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }
  public void setUser(AddressableEntityRef user) {
    this.user = user;
  }


  /**
   * The participant purpose of the user.
   **/
  public ConversationSummaryEditedBy purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant purpose of the user.")
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationSummaryEditedBy conversationSummaryEditedBy = (ConversationSummaryEditedBy) o;

    return Objects.equals(this.user, conversationSummaryEditedBy.user) &&
            Objects.equals(this.purpose, conversationSummaryEditedBy.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSummaryEditedBy {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

