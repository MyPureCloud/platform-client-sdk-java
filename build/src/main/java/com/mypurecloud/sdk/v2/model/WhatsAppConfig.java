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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WhatsAppConfig
 */

public class WhatsAppConfig  implements Serializable {
  
  private List<String> whatsAppColumns = new ArrayList<String>();
  private AddressableEntityRef whatsAppIntegration = null;
  private DomainEntityRef contentTemplate = null;

  
  /**
   * The contact list columns specifying the WhatsApp address(es) of the contact.
   **/
  public WhatsAppConfig whatsAppColumns(List<String> whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The contact list columns specifying the WhatsApp address(es) of the contact.")
  @JsonProperty("whatsAppColumns")
  public List<String> getWhatsAppColumns() {
    return whatsAppColumns;
  }
  public void setWhatsAppColumns(List<String> whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
  }


  /**
   * The WhatsApp integration used to send message to the contact.
   **/
  public WhatsAppConfig whatsAppIntegration(AddressableEntityRef whatsAppIntegration) {
    this.whatsAppIntegration = whatsAppIntegration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WhatsApp integration used to send message to the contact.")
  @JsonProperty("whatsAppIntegration")
  public AddressableEntityRef getWhatsAppIntegration() {
    return whatsAppIntegration;
  }
  public void setWhatsAppIntegration(AddressableEntityRef whatsAppIntegration) {
    this.whatsAppIntegration = whatsAppIntegration;
  }


  /**
   * The content template used to formulate the WhatsApp message to send to the contact.
   **/
  public WhatsAppConfig contentTemplate(DomainEntityRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The content template used to formulate the WhatsApp message to send to the contact.")
  @JsonProperty("contentTemplate")
  public DomainEntityRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(DomainEntityRef contentTemplate) {
    this.contentTemplate = contentTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppConfig whatsAppConfig = (WhatsAppConfig) o;

    return Objects.equals(this.whatsAppColumns, whatsAppConfig.whatsAppColumns) &&
            Objects.equals(this.whatsAppIntegration, whatsAppConfig.whatsAppIntegration) &&
            Objects.equals(this.contentTemplate, whatsAppConfig.contentTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsAppColumns, whatsAppIntegration, contentTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppConfig {\n");
    
    sb.append("    whatsAppColumns: ").append(toIndentedString(whatsAppColumns)).append("\n");
    sb.append("    whatsAppIntegration: ").append(toIndentedString(whatsAppIntegration)).append("\n");
    sb.append("    contentTemplate: ").append(toIndentedString(contentTemplate)).append("\n");
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

