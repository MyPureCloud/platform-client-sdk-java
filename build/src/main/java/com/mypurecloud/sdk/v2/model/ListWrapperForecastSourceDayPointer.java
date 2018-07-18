package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ForecastSourceDayPointer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ListWrapperForecastSourceDayPointer
 */

public class ListWrapperForecastSourceDayPointer  implements Serializable {
  
  private List<ForecastSourceDayPointer> values = new ArrayList<ForecastSourceDayPointer>();

  
  /**
   **/
  public ListWrapperForecastSourceDayPointer values(List<ForecastSourceDayPointer> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<ForecastSourceDayPointer> getValues() {
    return values;
  }
  public void setValues(List<ForecastSourceDayPointer> values) {
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
    ListWrapperForecastSourceDayPointer listWrapperForecastSourceDayPointer = (ListWrapperForecastSourceDayPointer) o;
    return Objects.equals(this.values, listWrapperForecastSourceDayPointer.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWrapperForecastSourceDayPointer {\n");
    
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

