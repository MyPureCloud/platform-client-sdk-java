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
 * Contact fields a merchant requires to complete a payment request.
 */
@ApiModel(description = "Contact fields a merchant requires to complete a payment request.")

public class ConversationContentRequiredContactField  implements Serializable {
  

  private static class ContactFieldEnumDeserializer extends StdDeserializer<ContactFieldEnum> {
    public ContactFieldEnumDeserializer() {
      super(ContactFieldEnumDeserializer.class);
    }

    @Override
    public ContactFieldEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContactFieldEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The name of the contact field
   */
 @JsonDeserialize(using = ContactFieldEnumDeserializer.class)
  public enum ContactFieldEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADDRESS("Address"),
    NAME("Name"),
    PHONE("Phone"),
    EMAIL("Email");

    private String value;

    ContactFieldEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContactFieldEnum fromString(String key) {
      if (key == null) return null;

      for (ContactFieldEnum value : ContactFieldEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContactFieldEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContactFieldEnum contactField = null;

  public ConversationContentRequiredContactField() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the contact field
   **/
  public ConversationContentRequiredContactField contactField(ContactFieldEnum contactField) {
    this.contactField = contactField;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the contact field")
  @JsonProperty("contactField")
  public ContactFieldEnum getContactField() {
    return contactField;
  }
  public void setContactField(ContactFieldEnum contactField) {
    this.contactField = contactField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentRequiredContactField conversationContentRequiredContactField = (ConversationContentRequiredContactField) o;

    return Objects.equals(this.contactField, conversationContentRequiredContactField.contactField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentRequiredContactField {\n");
    
    sb.append("    contactField: ").append(toIndentedString(contactField)).append("\n");
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

