package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * VisibilityCondition
 */

public class VisibilityCondition  implements Serializable {
  

  private static class CombiningOperationEnumDeserializer extends StdDeserializer<CombiningOperationEnum> {
    public CombiningOperationEnumDeserializer() {
      super(CombiningOperationEnumDeserializer.class);
    }

    @Override
    public CombiningOperationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CombiningOperationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets combiningOperation
   */
 @JsonDeserialize(using = CombiningOperationEnumDeserializer.class)
  public enum CombiningOperationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("AND"),
    OR("OR");

    private String value;

    CombiningOperationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CombiningOperationEnum fromString(String key) {
      if (key == null) return null;

      for (CombiningOperationEnum value : CombiningOperationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CombiningOperationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CombiningOperationEnum combiningOperation = null;
  private List<Object> predicates = new ArrayList<Object>();

  
  /**
   **/
  public VisibilityCondition combiningOperation(CombiningOperationEnum combiningOperation) {
    this.combiningOperation = combiningOperation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("combiningOperation")
  public CombiningOperationEnum getCombiningOperation() {
    return combiningOperation;
  }
  public void setCombiningOperation(CombiningOperationEnum combiningOperation) {
    this.combiningOperation = combiningOperation;
  }

  
  /**
   * A list of strings, each representing the location in the form of the Answer Option to depend on. In the format of \"/form/questionGroup/{questionGroupIndex}/question/{questionIndex}/answer/{answerIndex}\" or, to assume the current question group, \"../question/{questionIndex}/answer/{answerIndex}\". Note: Indexes are zero-based
   **/
  public VisibilityCondition predicates(List<Object> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of strings, each representing the location in the form of the Answer Option to depend on. In the format of \"/form/questionGroup/{questionGroupIndex}/question/{questionIndex}/answer/{answerIndex}\" or, to assume the current question group, \"../question/{questionIndex}/answer/{answerIndex}\". Note: Indexes are zero-based")
  @JsonProperty("predicates")
  public List<Object> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<Object> predicates) {
    this.predicates = predicates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisibilityCondition visibilityCondition = (VisibilityCondition) o;
    return Objects.equals(this.combiningOperation, visibilityCondition.combiningOperation) &&
        Objects.equals(this.predicates, visibilityCondition.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combiningOperation, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisibilityCondition {\n");
    
    sb.append("    combiningOperation: ").append(toIndentedString(combiningOperation)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

