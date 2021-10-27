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

import java.io.Serializable;
/**
 * Learning module inform steps request
 */
@ApiModel(description = "Learning module inform steps request")

public class LearningModuleInformStepRequest  implements Serializable {
  

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
   * The learning module inform step type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    URL("Url"),
    CONTENT("Content"),
    RICHTEXT("RichText");

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
  private String name = null;
  private String value = null;
  private String sharingUri = null;
  private String contentType = null;
  private Integer order = null;

  
  /**
   * The learning module inform step type
   **/
  public LearningModuleInformStepRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The learning module inform step type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The name of the inform step or content
   **/
  public LearningModuleInformStepRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the inform step or content")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The value for inform step
   **/
  public LearningModuleInformStepRequest value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value for inform step")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The sharing uri for Content type inform step
   **/
  public LearningModuleInformStepRequest sharingUri(String sharingUri) {
    this.sharingUri = sharingUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sharing uri for Content type inform step")
  @JsonProperty("sharingUri")
  public String getSharingUri() {
    return sharingUri;
  }
  public void setSharingUri(String sharingUri) {
    this.sharingUri = sharingUri;
  }

  
  /**
   * The document type for Content type Inform step
   **/
  public LearningModuleInformStepRequest contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The document type for Content type Inform step")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   * The order of inform step in a learning module
   **/
  public LearningModuleInformStepRequest order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The order of inform step in a learning module")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningModuleInformStepRequest learningModuleInformStepRequest = (LearningModuleInformStepRequest) o;
    return Objects.equals(this.type, learningModuleInformStepRequest.type) &&
        Objects.equals(this.name, learningModuleInformStepRequest.name) &&
        Objects.equals(this.value, learningModuleInformStepRequest.value) &&
        Objects.equals(this.sharingUri, learningModuleInformStepRequest.sharingUri) &&
        Objects.equals(this.contentType, learningModuleInformStepRequest.contentType) &&
        Objects.equals(this.order, learningModuleInformStepRequest.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, value, sharingUri, contentType, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningModuleInformStepRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    sharingUri: ").append(toIndentedString(sharingUri)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

