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
import com.mypurecloud.sdk.v2.model.DatePicker;
import com.mypurecloud.sdk.v2.model.ListPicker;
import com.mypurecloud.sdk.v2.model.RecordingInput;
import com.mypurecloud.sdk.v2.model.RecordingWheelPicker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecordingFormPageComponent
 */

public class RecordingFormPageComponent  implements Serializable {
  

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
   * Type of this form component element.
   */
 @JsonDeserialize(using = FormComponentTypeEnumDeserializer.class)
  public enum FormComponentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LISTPICKER("ListPicker"),
    DATEPICKER("DatePicker"),
    WHEELPICKER("WheelPicker"),
    INPUT("Input");

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
  private DatePicker datePicker = null;
  private RecordingWheelPicker wheelPicker = null;
  private ListPicker listPicker = null;
  private RecordingInput input = null;

  public RecordingFormPageComponent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Type of this form component element.
   **/
  public RecordingFormPageComponent formComponentType(FormComponentTypeEnum formComponentType) {
    this.formComponentType = formComponentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of this form component element.")
  @JsonProperty("formComponentType")
  public FormComponentTypeEnum getFormComponentType() {
    return formComponentType;
  }
  public void setFormComponentType(FormComponentTypeEnum formComponentType) {
    this.formComponentType = formComponentType;
  }


  /**
   * Date Picker content.
   **/
  public RecordingFormPageComponent datePicker(DatePicker datePicker) {
    this.datePicker = datePicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date Picker content.")
  @JsonProperty("datePicker")
  public DatePicker getDatePicker() {
    return datePicker;
  }
  public void setDatePicker(DatePicker datePicker) {
    this.datePicker = datePicker;
  }


  /**
   * Wheel Picker content.
   **/
  public RecordingFormPageComponent wheelPicker(RecordingWheelPicker wheelPicker) {
    this.wheelPicker = wheelPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wheel Picker content.")
  @JsonProperty("wheelPicker")
  public RecordingWheelPicker getWheelPicker() {
    return wheelPicker;
  }
  public void setWheelPicker(RecordingWheelPicker wheelPicker) {
    this.wheelPicker = wheelPicker;
  }


  /**
   * List Picker content.
   **/
  public RecordingFormPageComponent listPicker(ListPicker listPicker) {
    this.listPicker = listPicker;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List Picker content.")
  @JsonProperty("listPicker")
  public ListPicker getListPicker() {
    return listPicker;
  }
  public void setListPicker(ListPicker listPicker) {
    this.listPicker = listPicker;
  }


  /**
   * Input content.
   **/
  public RecordingFormPageComponent input(RecordingInput input) {
    this.input = input;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Input content.")
  @JsonProperty("input")
  public RecordingInput getInput() {
    return input;
  }
  public void setInput(RecordingInput input) {
    this.input = input;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingFormPageComponent recordingFormPageComponent = (RecordingFormPageComponent) o;

    return Objects.equals(this.formComponentType, recordingFormPageComponent.formComponentType) &&
            Objects.equals(this.datePicker, recordingFormPageComponent.datePicker) &&
            Objects.equals(this.wheelPicker, recordingFormPageComponent.wheelPicker) &&
            Objects.equals(this.listPicker, recordingFormPageComponent.listPicker) &&
            Objects.equals(this.input, recordingFormPageComponent.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formComponentType, datePicker, wheelPicker, listPicker, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingFormPageComponent {\n");
    
    sb.append("    formComponentType: ").append(toIndentedString(formComponentType)).append("\n");
    sb.append("    datePicker: ").append(toIndentedString(datePicker)).append("\n");
    sb.append("    wheelPicker: ").append(toIndentedString(wheelPicker)).append("\n");
    sb.append("    listPicker: ").append(toIndentedString(listPicker)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

