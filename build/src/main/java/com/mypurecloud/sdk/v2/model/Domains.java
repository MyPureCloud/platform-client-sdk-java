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
import com.mypurecloud.sdk.v2.model.AuthorizedDomains;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The domain list settings.
 */
@ApiModel(description = "The domain list settings.")

public class Domains  implements Serializable {
  
  private AuthorizedDomains authorizedDomains = null;
  private Boolean allowExistingEmailParticipants = null;
  private Boolean allowOutboundToAnyDomainAcd = null;

  public Domains() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public Domains(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The authorized domains settings for email processing.
   **/
  public Domains authorizedDomains(AuthorizedDomains authorizedDomains) {
    this.authorizedDomains = authorizedDomains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The authorized domains settings for email processing.")
  @JsonProperty("authorizedDomains")
  public AuthorizedDomains getAuthorizedDomains() {
    return authorizedDomains;
  }
  public void setAuthorizedDomains(AuthorizedDomains authorizedDomains) {
    this.authorizedDomains = authorizedDomains;
  }


  /**
   * Allow reply and forward to recipients included in the previous email, ignoring the authorized domains list
   **/
  public Domains allowExistingEmailParticipants(Boolean allowExistingEmailParticipants) {
    this.allowExistingEmailParticipants = allowExistingEmailParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allow reply and forward to recipients included in the previous email, ignoring the authorized domains list")
  @JsonProperty("allowExistingEmailParticipants")
  public Boolean getAllowExistingEmailParticipants() {
    return allowExistingEmailParticipants;
  }
  public void setAllowExistingEmailParticipants(Boolean allowExistingEmailParticipants) {
    this.allowExistingEmailParticipants = allowExistingEmailParticipants;
  }


  /**
   * Allow new outbound email (no existing conversation) to be sent to any domain, ignoring the authorized domains list.This setting applies only to new outbound emails sent on behalf of queue or agentless, NOT campaigns.This setting can only be true if allowExistingEmailParticipants is also true.
   **/
  public Domains allowOutboundToAnyDomainAcd(Boolean allowOutboundToAnyDomainAcd) {
    this.allowOutboundToAnyDomainAcd = allowOutboundToAnyDomainAcd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Allow new outbound email (no existing conversation) to be sent to any domain, ignoring the authorized domains list.This setting applies only to new outbound emails sent on behalf of queue or agentless, NOT campaigns.This setting can only be true if allowExistingEmailParticipants is also true.")
  @JsonProperty("allowOutboundToAnyDomainAcd")
  public Boolean getAllowOutboundToAnyDomainAcd() {
    return allowOutboundToAnyDomainAcd;
  }
  public void setAllowOutboundToAnyDomainAcd(Boolean allowOutboundToAnyDomainAcd) {
    this.allowOutboundToAnyDomainAcd = allowOutboundToAnyDomainAcd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domains domains = (Domains) o;

    return Objects.equals(this.authorizedDomains, domains.authorizedDomains) &&
            Objects.equals(this.allowExistingEmailParticipants, domains.allowExistingEmailParticipants) &&
            Objects.equals(this.allowOutboundToAnyDomainAcd, domains.allowOutboundToAnyDomainAcd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedDomains, allowExistingEmailParticipants, allowOutboundToAnyDomainAcd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domains {\n");
    
    sb.append("    authorizedDomains: ").append(toIndentedString(authorizedDomains)).append("\n");
    sb.append("    allowExistingEmailParticipants: ").append(toIndentedString(allowExistingEmailParticipants)).append("\n");
    sb.append("    allowOutboundToAnyDomainAcd: ").append(toIndentedString(allowOutboundToAnyDomainAcd)).append("\n");
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

