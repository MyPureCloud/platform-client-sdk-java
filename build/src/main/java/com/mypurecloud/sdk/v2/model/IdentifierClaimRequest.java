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
import com.mypurecloud.sdk.v2.model.ContactIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IdentifierClaimRequest
 */

public class IdentifierClaimRequest  implements Serializable {
  

  private static class OperationEnumDeserializer extends StdDeserializer<OperationEnum> {
    public OperationEnumDeserializer() {
      super(OperationEnumDeserializer.class);
    }

    @Override
    public OperationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operation to perform claim/release
   */
 @JsonDeserialize(using = OperationEnumDeserializer.class)
  public enum OperationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLAIM("Claim"),
    RELEASE("Release");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperationEnum fromString(String key) {
      if (key == null) return null;

      for (OperationEnum value : OperationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperationEnum operation = null;
  private ContactIdentifier identifier = null;

  
  /**
   * The operation to perform claim/release
   **/
  public IdentifierClaimRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operation to perform claim/release")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  /**
   * The identifier that should be claimed/released from a contact
   **/
  public IdentifierClaimRequest identifier(ContactIdentifier identifier) {
    this.identifier = identifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The identifier that should be claimed/released from a contact")
  @JsonProperty("identifier")
  public ContactIdentifier getIdentifier() {
    return identifier;
  }
  public void setIdentifier(ContactIdentifier identifier) {
    this.identifier = identifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierClaimRequest identifierClaimRequest = (IdentifierClaimRequest) o;

    return Objects.equals(this.operation, identifierClaimRequest.operation) &&
            Objects.equals(this.identifier, identifierClaimRequest.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierClaimRequest {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

