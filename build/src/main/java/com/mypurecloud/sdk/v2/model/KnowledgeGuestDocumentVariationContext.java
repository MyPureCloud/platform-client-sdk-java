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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestDocumentVariationContext
 */

public class KnowledgeGuestDocumentVariationContext  implements Serializable {
  
  private AddressableEntityRef context = null;
  private List<AddressableEntityRef> values = null;

  public KnowledgeGuestDocumentVariationContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<AddressableEntityRef>();
    }
  }

  
  /**
   * The knowledge context associated with the variation.
   **/
  public KnowledgeGuestDocumentVariationContext context(AddressableEntityRef context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The knowledge context associated with the variation.")
  @JsonProperty("context")
  public AddressableEntityRef getContext() {
    return context;
  }
  public void setContext(AddressableEntityRef context) {
    this.context = context;
  }


  /**
   * The list of knowledge context values associated with the variation.
   **/
  public KnowledgeGuestDocumentVariationContext values(List<AddressableEntityRef> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of knowledge context values associated with the variation.")
  @JsonProperty("values")
  public List<AddressableEntityRef> getValues() {
    return values;
  }
  public void setValues(List<AddressableEntityRef> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestDocumentVariationContext knowledgeGuestDocumentVariationContext = (KnowledgeGuestDocumentVariationContext) o;

    return Objects.equals(this.context, knowledgeGuestDocumentVariationContext.context) &&
            Objects.equals(this.values, knowledgeGuestDocumentVariationContext.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestDocumentVariationContext {\n");
    
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

