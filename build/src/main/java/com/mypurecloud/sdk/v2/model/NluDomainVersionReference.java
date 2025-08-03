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
import com.mypurecloud.sdk.v2.model.IntentReference;
import com.mypurecloud.sdk.v2.model.NluDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluDomainVersionReference
 */

public class NluDomainVersionReference  implements Serializable {
  
  private String id = null;
  private NluDomain domain = null;
  private List<IntentReference> intents = null;
  private String selfUri = null;

  public NluDomainVersionReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intents = new ArrayList<IntentReference>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The NLU domain of the version.")
  @JsonProperty("domain")
  public NluDomain getDomain() {
    return domain;
  }


  /**
   * The intents defined for this NLU domain version.
   **/
  public NluDomainVersionReference intents(List<IntentReference> intents) {
    this.intents = intents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intents defined for this NLU domain version.")
  @JsonProperty("intents")
  public List<IntentReference> getIntents() {
    return intents;
  }
  public void setIntents(List<IntentReference> intents) {
    this.intents = intents;
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
    NluDomainVersionReference nluDomainVersionReference = (NluDomainVersionReference) o;

    return Objects.equals(this.id, nluDomainVersionReference.id) &&
            Objects.equals(this.domain, nluDomainVersionReference.domain) &&
            Objects.equals(this.intents, nluDomainVersionReference.intents) &&
            Objects.equals(this.selfUri, nluDomainVersionReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, domain, intents, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDomainVersionReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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

