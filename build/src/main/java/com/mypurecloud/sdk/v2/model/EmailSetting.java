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
import com.mypurecloud.sdk.v2.model.Domains;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Email routing settings.
 */
@ApiModel(description = "Email routing settings.")

public class EmailSetting  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Domains domains = null;
  private String selfUri = null;

  public EmailSetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the settings.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the email setting.
   **/
  public EmailSetting name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the email setting.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The domain list settings.
   **/
  public EmailSetting domains(Domains domains) {
    this.domains = domains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The domain list settings.")
  @JsonProperty("domains")
  public Domains getDomains() {
    return domains;
  }
  public void setDomains(Domains domains) {
    this.domains = domains;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSetting emailSetting = (EmailSetting) o;

    return Objects.equals(this.id, emailSetting.id) &&
            Objects.equals(this.name, emailSetting.name) &&
            Objects.equals(this.domains, emailSetting.domains) &&
            Objects.equals(this.selfUri, emailSetting.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, domains, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSetting {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

