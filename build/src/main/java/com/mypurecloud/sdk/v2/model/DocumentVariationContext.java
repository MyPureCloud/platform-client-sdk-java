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
import com.mypurecloud.sdk.v2.model.KnowledgeContextReference;
import com.mypurecloud.sdk.v2.model.KnowledgeContextValueReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentVariationContext
 */

public class DocumentVariationContext  implements Serializable {
  
  private KnowledgeContextReference context = null;
  private List<KnowledgeContextValueReference> values = null;

  public DocumentVariationContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<KnowledgeContextValueReference>();
    }
  }

  
  /**
   * The knowledge context associated with the variation.
   **/
  public DocumentVariationContext context(KnowledgeContextReference context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The knowledge context associated with the variation.")
  @JsonProperty("context")
  public KnowledgeContextReference getContext() {
    return context;
  }
  public void setContext(KnowledgeContextReference context) {
    this.context = context;
  }


  /**
   * The list of knowledge context values associated with the variation.
   **/
  public DocumentVariationContext values(List<KnowledgeContextValueReference> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of knowledge context values associated with the variation.")
  @JsonProperty("values")
  public List<KnowledgeContextValueReference> getValues() {
    return values;
  }
  public void setValues(List<KnowledgeContextValueReference> values) {
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
    DocumentVariationContext documentVariationContext = (DocumentVariationContext) o;

    return Objects.equals(this.context, documentVariationContext.context) &&
            Objects.equals(this.values, documentVariationContext.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentVariationContext {\n");
    
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

