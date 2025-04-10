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
 * DncPatchWhatsAppNumbersRequest
 */

public class DncPatchWhatsAppNumbersRequest  implements Serializable {
  

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The action to perform
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ADD("Add"),
    REMOVE("Remove");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;
  private List<String> whatsAppNumbers = null;
  private String expirationDateTime = null;

  public DncPatchWhatsAppNumbersRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      whatsAppNumbers = new ArrayList<String>();
    }
  }

  
  /**
   * The action to perform
   **/
  public DncPatchWhatsAppNumbersRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action to perform")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  /**
   * The list of whatsApp numbers to Add to / Remove from the DNC list 
   **/
  public DncPatchWhatsAppNumbersRequest whatsAppNumbers(List<String> whatsAppNumbers) {
    this.whatsAppNumbers = whatsAppNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of whatsApp numbers to Add to / Remove from the DNC list ")
  @JsonProperty("whatsAppNumbers")
  public List<String> getWhatsAppNumbers() {
    return whatsAppNumbers;
  }
  public void setWhatsAppNumbers(List<String> whatsAppNumbers) {
    this.whatsAppNumbers = whatsAppNumbers;
  }


  /**
   * Expiration date for DNC whatsApp numbers in yyyy-MM-ddTHH:mmZ format
   **/
  public DncPatchWhatsAppNumbersRequest expirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date for DNC whatsApp numbers in yyyy-MM-ddTHH:mmZ format")
  @JsonProperty("expirationDateTime")
  public String getExpirationDateTime() {
    return expirationDateTime;
  }
  public void setExpirationDateTime(String expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DncPatchWhatsAppNumbersRequest dncPatchWhatsAppNumbersRequest = (DncPatchWhatsAppNumbersRequest) o;

    return Objects.equals(this.action, dncPatchWhatsAppNumbersRequest.action) &&
            Objects.equals(this.whatsAppNumbers, dncPatchWhatsAppNumbersRequest.whatsAppNumbers) &&
            Objects.equals(this.expirationDateTime, dncPatchWhatsAppNumbersRequest.expirationDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, whatsAppNumbers, expirationDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DncPatchWhatsAppNumbersRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    whatsAppNumbers: ").append(toIndentedString(whatsAppNumbers)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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

