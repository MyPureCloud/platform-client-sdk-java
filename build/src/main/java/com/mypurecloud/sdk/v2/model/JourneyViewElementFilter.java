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
import com.mypurecloud.sdk.v2.model.JourneyViewElementFilterNumberPredicate;
import com.mypurecloud.sdk.v2.model.JourneyViewElementFilterPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A set of filters on an element within a journey view
 */
@ApiModel(description = "A set of filters on an element within a journey view")

public class JourneyViewElementFilter  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Boolean operation to apply to the provided predicates and clauses. Valid values: And
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("And");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private List<JourneyViewElementFilterPredicate> predicates = null;
  private List<JourneyViewElementFilterNumberPredicate> numberPredicates = null;

  public JourneyViewElementFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      predicates = new ArrayList<JourneyViewElementFilterPredicate>();
      numberPredicates = new ArrayList<JourneyViewElementFilterNumberPredicate>();
    }
  }

  
  /**
   * Boolean operation to apply to the provided predicates and clauses. Valid values: And
   **/
  public JourneyViewElementFilter type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean operation to apply to the provided predicates and clauses. Valid values: And")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * predicates
   **/
  public JourneyViewElementFilter predicates(List<JourneyViewElementFilterPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "predicates")
  @JsonProperty("predicates")
  public List<JourneyViewElementFilterPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<JourneyViewElementFilterPredicate> predicates) {
    this.predicates = predicates;
  }


  /**
   * numberPredicates
   **/
  public JourneyViewElementFilter numberPredicates(List<JourneyViewElementFilterNumberPredicate> numberPredicates) {
    this.numberPredicates = numberPredicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "numberPredicates")
  @JsonProperty("numberPredicates")
  public List<JourneyViewElementFilterNumberPredicate> getNumberPredicates() {
    return numberPredicates;
  }
  public void setNumberPredicates(List<JourneyViewElementFilterNumberPredicate> numberPredicates) {
    this.numberPredicates = numberPredicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewElementFilter journeyViewElementFilter = (JourneyViewElementFilter) o;

    return Objects.equals(this.type, journeyViewElementFilter.type) &&
            Objects.equals(this.predicates, journeyViewElementFilter.predicates) &&
            Objects.equals(this.numberPredicates, journeyViewElementFilter.numberPredicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, predicates, numberPredicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewElementFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
    sb.append("    numberPredicates: ").append(toIndentedString(numberPredicates)).append("\n");
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

