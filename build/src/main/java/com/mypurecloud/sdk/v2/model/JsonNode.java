package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JsonNode
 */

public class JsonNode  implements Serializable {
  
  private Boolean array = null;
  private Boolean _null = null;

  /**
   * Gets or Sets nodeType
   */
  public enum NodeTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ARRAY("ARRAY"),
    BINARY("BINARY"),
    BOOLEAN("BOOLEAN"),
    MISSING("MISSING"),
    NULL("NULL"),
    NUMBER("NUMBER"),
    OBJECT("OBJECT"),
    POJO("POJO"),
    STRING("STRING");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NodeTypeEnum fromString(String key) {
      if (key == null) return null;

      for (NodeTypeEnum value : NodeTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NodeTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NodeTypeEnum nodeType = null;
  private Boolean object = null;
  private Boolean _boolean = null;
  private Boolean number = null;
  private Boolean _float = null;
  private Boolean floatingPointNumber = null;
  private Boolean valueNode = null;
  private Boolean containerNode = null;
  private Boolean missingNode = null;
  private Boolean pojo = null;
  private Boolean integralNumber = null;
  private Boolean _short = null;
  private Boolean _int = null;
  private Boolean _long = null;
  private Boolean _double = null;
  private Boolean bigDecimal = null;
  private Boolean bigInteger = null;
  private Boolean textual = null;
  private Boolean binary = null;

  
  /**
   **/
  public JsonNode array(Boolean array) {
    this.array = array;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("array")
  public Boolean getArray() {
    return array;
  }
  public void setArray(Boolean array) {
    this.array = array;
  }

  
  /**
   **/
  public JsonNode _null(Boolean _null) {
    this._null = _null;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("null")
  public Boolean getNull() {
    return _null;
  }
  public void setNull(Boolean _null) {
    this._null = _null;
  }

  
  /**
   **/
  public JsonNode nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nodeType")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }
  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  
  /**
   **/
  public JsonNode object(Boolean object) {
    this.object = object;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("object")
  public Boolean getObject() {
    return object;
  }
  public void setObject(Boolean object) {
    this.object = object;
  }

  
  /**
   **/
  public JsonNode _boolean(Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("boolean")
  public Boolean getBoolean() {
    return _boolean;
  }
  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }

  
  /**
   **/
  public JsonNode number(Boolean number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("number")
  public Boolean getNumber() {
    return number;
  }
  public void setNumber(Boolean number) {
    this.number = number;
  }

  
  /**
   **/
  public JsonNode _float(Boolean _float) {
    this._float = _float;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("float")
  public Boolean getFloat() {
    return _float;
  }
  public void setFloat(Boolean _float) {
    this._float = _float;
  }

  
  /**
   **/
  public JsonNode floatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("floatingPointNumber")
  public Boolean getFloatingPointNumber() {
    return floatingPointNumber;
  }
  public void setFloatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }

  
  /**
   **/
  public JsonNode valueNode(Boolean valueNode) {
    this.valueNode = valueNode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valueNode")
  public Boolean getValueNode() {
    return valueNode;
  }
  public void setValueNode(Boolean valueNode) {
    this.valueNode = valueNode;
  }

  
  /**
   **/
  public JsonNode containerNode(Boolean containerNode) {
    this.containerNode = containerNode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("containerNode")
  public Boolean getContainerNode() {
    return containerNode;
  }
  public void setContainerNode(Boolean containerNode) {
    this.containerNode = containerNode;
  }

  
  /**
   **/
  public JsonNode missingNode(Boolean missingNode) {
    this.missingNode = missingNode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("missingNode")
  public Boolean getMissingNode() {
    return missingNode;
  }
  public void setMissingNode(Boolean missingNode) {
    this.missingNode = missingNode;
  }

  
  /**
   **/
  public JsonNode pojo(Boolean pojo) {
    this.pojo = pojo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pojo")
  public Boolean getPojo() {
    return pojo;
  }
  public void setPojo(Boolean pojo) {
    this.pojo = pojo;
  }

  
  /**
   **/
  public JsonNode integralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integralNumber")
  public Boolean getIntegralNumber() {
    return integralNumber;
  }
  public void setIntegralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }

  
  /**
   **/
  public JsonNode _short(Boolean _short) {
    this._short = _short;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("short")
  public Boolean getShort() {
    return _short;
  }
  public void setShort(Boolean _short) {
    this._short = _short;
  }

  
  /**
   **/
  public JsonNode _int(Boolean _int) {
    this._int = _int;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("int")
  public Boolean getInt() {
    return _int;
  }
  public void setInt(Boolean _int) {
    this._int = _int;
  }

  
  /**
   **/
  public JsonNode _long(Boolean _long) {
    this._long = _long;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("long")
  public Boolean getLong() {
    return _long;
  }
  public void setLong(Boolean _long) {
    this._long = _long;
  }

  
  /**
   **/
  public JsonNode _double(Boolean _double) {
    this._double = _double;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("double")
  public Boolean getDouble() {
    return _double;
  }
  public void setDouble(Boolean _double) {
    this._double = _double;
  }

  
  /**
   **/
  public JsonNode bigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bigDecimal")
  public Boolean getBigDecimal() {
    return bigDecimal;
  }
  public void setBigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }

  
  /**
   **/
  public JsonNode bigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bigInteger")
  public Boolean getBigInteger() {
    return bigInteger;
  }
  public void setBigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }

  
  /**
   **/
  public JsonNode textual(Boolean textual) {
    this.textual = textual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("textual")
  public Boolean getTextual() {
    return textual;
  }
  public void setTextual(Boolean textual) {
    this.textual = textual;
  }

  
  /**
   **/
  public JsonNode binary(Boolean binary) {
    this.binary = binary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("binary")
  public Boolean getBinary() {
    return binary;
  }
  public void setBinary(Boolean binary) {
    this.binary = binary;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNode jsonNode = (JsonNode) o;
    return Objects.equals(this.array, jsonNode.array) &&
        Objects.equals(this._null, jsonNode._null) &&
        Objects.equals(this.nodeType, jsonNode.nodeType) &&
        Objects.equals(this.object, jsonNode.object) &&
        Objects.equals(this._boolean, jsonNode._boolean) &&
        Objects.equals(this.number, jsonNode.number) &&
        Objects.equals(this._float, jsonNode._float) &&
        Objects.equals(this.floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(this.valueNode, jsonNode.valueNode) &&
        Objects.equals(this.containerNode, jsonNode.containerNode) &&
        Objects.equals(this.missingNode, jsonNode.missingNode) &&
        Objects.equals(this.pojo, jsonNode.pojo) &&
        Objects.equals(this.integralNumber, jsonNode.integralNumber) &&
        Objects.equals(this._short, jsonNode._short) &&
        Objects.equals(this._int, jsonNode._int) &&
        Objects.equals(this._long, jsonNode._long) &&
        Objects.equals(this._double, jsonNode._double) &&
        Objects.equals(this.bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(this.bigInteger, jsonNode.bigInteger) &&
        Objects.equals(this.textual, jsonNode.textual) &&
        Objects.equals(this.binary, jsonNode.binary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(array, _null, nodeType, object, _boolean, number, _float, floatingPointNumber, valueNode, containerNode, missingNode, pojo, integralNumber, _short, _int, _long, _double, bigDecimal, bigInteger, textual, binary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNode {\n");
    
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
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

