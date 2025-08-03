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
import com.mypurecloud.sdk.v2.model.FormDatePicker;
import com.mypurecloud.sdk.v2.model.FormListPicker;
import com.mypurecloud.sdk.v2.model.Input;
import com.mypurecloud.sdk.v2.model.WheelPicker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A component within a form page
 */
@ApiModel(description = "A component within a form page")

public class FormPageComponent  implements Serializable {
  

  private static class FormComponentTypeEnumDeserializer extends StdDeserializer<FormComponentTypeEnum> {
    public FormComponentTypeEnumDeserializer() {
      super(FormComponentTypeEnumDeserializer.class);
    }

    @Override
    public FormComponentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FormComponentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of the component
   */
 @JsonDeserialize(using = FormComponentTypeEnumDeserializer.class)
  public enum FormComponentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LISTPICKER("ListPicker"),
    DATEPICKER("DatePicker"),
    INPUT("Input"),
    WHEELPICKER("WheelPicker");

    private String value;

    FormComponentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FormComponentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FormComponentTypeEnum value : FormComponentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FormComponentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FormComponentTypeEnum formComponentType = null;
  private FormListPicker listPicker = null;
  private FormDatePicker datePicker = null;
  private Input input = null;
  private WheelPicker wheelPicker = null;

  public FormPageComponent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Type of the component
   **/
  public FormPageComponent formComponentType(FormComponentTypeEnum formComponentType) {
    this.formComponentType = formComponentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the component")
  @JsonProperty("formComponentType")
  public FormComponentTypeEnum getFormComponentType() {
    return formComponentType;
  }
  public void setFormComponentType(FormComponentTypeEnum formComponentType) {
    this.formComponentType = formComponentType;
  }


  /**
   * List picker configuration
   **/
  public FormPageComponent listPicker(FormListPicker listPicker) {
    this.listPicker = listPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List picker configuration")
  @JsonProperty("listPicker")
  public FormListPicker getListPicker() {
    return listPicker;
  }
  public void setListPicker(FormListPicker listPicker) {
    this.listPicker = listPicker;
  }


  /**
   * Date picker configuration
   **/
  public FormPageComponent datePicker(FormDatePicker datePicker) {
    this.datePicker = datePicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date picker configuration")
  @JsonProperty("datePicker")
  public FormDatePicker getDatePicker() {
    return datePicker;
  }
  public void setDatePicker(FormDatePicker datePicker) {
    this.datePicker = datePicker;
  }


  /**
   * Input field configuration
   **/
  public FormPageComponent input(Input input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Input field configuration")
  @JsonProperty("input")
  public Input getInput() {
    return input;
  }
  public void setInput(Input input) {
    this.input = input;
  }


  /**
   * Wheel picker configuration
   **/
  public FormPageComponent wheelPicker(WheelPicker wheelPicker) {
    this.wheelPicker = wheelPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wheel picker configuration")
  @JsonProperty("wheelPicker")
  public WheelPicker getWheelPicker() {
    return wheelPicker;
  }
  public void setWheelPicker(WheelPicker wheelPicker) {
    this.wheelPicker = wheelPicker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormPageComponent formPageComponent = (FormPageComponent) o;

    return Objects.equals(this.formComponentType, formPageComponent.formComponentType) &&
            Objects.equals(this.listPicker, formPageComponent.listPicker) &&
            Objects.equals(this.datePicker, formPageComponent.datePicker) &&
            Objects.equals(this.input, formPageComponent.input) &&
            Objects.equals(this.wheelPicker, formPageComponent.wheelPicker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formComponentType, listPicker, datePicker, input, wheelPicker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormPageComponent {\n");
    
    sb.append("    formComponentType: ").append(toIndentedString(formComponentType)).append("\n");
    sb.append("    listPicker: ").append(toIndentedString(listPicker)).append("\n");
    sb.append("    datePicker: ").append(toIndentedString(datePicker)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    wheelPicker: ").append(toIndentedString(wheelPicker)).append("\n");
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

