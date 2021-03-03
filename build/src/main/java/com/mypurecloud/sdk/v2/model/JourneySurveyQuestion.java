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
 * JourneySurveyQuestion
 */

public class JourneySurveyQuestion  implements Serializable {
  

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
   * Type of survey question.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXT("text"),
    HIDDEN("hidden"),
    SELECT("select"),
    CHECKBOX("checkbox"),
    TEXTAREA("textarea");

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
  private String label = null;

  private static class CustomerPropertyEnumDeserializer extends StdDeserializer<CustomerPropertyEnum> {
    public CustomerPropertyEnumDeserializer() {
      super(CustomerPropertyEnumDeserializer.class);
    }

    @Override
    public CustomerPropertyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CustomerPropertyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The customer property that the answer maps to.
   */
 @JsonDeserialize(using = CustomerPropertyEnumDeserializer.class)
  public enum CustomerPropertyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GIVENNAME("givenName"),
    FAMILYNAME("familyName"),
    EMAIL("email"),
    PHONE("phone"),
    GENDER("gender"),
    COMPANYNAME("companyName");

    private String value;

    CustomerPropertyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CustomerPropertyEnum fromString(String key) {
      if (key == null) return null;

      for (CustomerPropertyEnum value : CustomerPropertyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CustomerPropertyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CustomerPropertyEnum customerProperty = null;
  private List<String> choices = new ArrayList<String>();
  private Boolean isMandatory = null;

  
  /**
   * Type of survey question.
   **/
  public JourneySurveyQuestion type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of survey question.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Label of question.
   **/
  public JourneySurveyQuestion label(String label) {
    this.label = label;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Label of question.")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  
  /**
   * The customer property that the answer maps to.
   **/
  public JourneySurveyQuestion customerProperty(CustomerPropertyEnum customerProperty) {
    this.customerProperty = customerProperty;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer property that the answer maps to.")
  @JsonProperty("customerProperty")
  public CustomerPropertyEnum getCustomerProperty() {
    return customerProperty;
  }
  public void setCustomerProperty(CustomerPropertyEnum customerProperty) {
    this.customerProperty = customerProperty;
  }

  
  /**
   * Choices available to user.
   **/
  public JourneySurveyQuestion choices(List<String> choices) {
    this.choices = choices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Choices available to user.")
  @JsonProperty("choices")
  public List<String> getChoices() {
    return choices;
  }
  public void setChoices(List<String> choices) {
    this.choices = choices;
  }

  
  /**
   * Whether answering this question is mandatory.
   **/
  public JourneySurveyQuestion isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether answering this question is mandatory.")
  @JsonProperty("isMandatory")
  public Boolean getIsMandatory() {
    return isMandatory;
  }
  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneySurveyQuestion journeySurveyQuestion = (JourneySurveyQuestion) o;
    return Objects.equals(this.type, journeySurveyQuestion.type) &&
        Objects.equals(this.label, journeySurveyQuestion.label) &&
        Objects.equals(this.customerProperty, journeySurveyQuestion.customerProperty) &&
        Objects.equals(this.choices, journeySurveyQuestion.choices) &&
        Objects.equals(this.isMandatory, journeySurveyQuestion.isMandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, label, customerProperty, choices, isMandatory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySurveyQuestion {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    customerProperty: ").append(toIndentedString(customerProperty)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
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

