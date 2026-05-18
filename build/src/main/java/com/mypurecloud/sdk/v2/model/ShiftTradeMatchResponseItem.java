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
import com.mypurecloud.sdk.v2.model.ShiftTradePreviewResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * ShiftTradeMatchResponseItem
 */

public class ShiftTradeMatchResponseItem  implements Serializable {
  
  private List<String> shiftIds = null;
  private ShiftTradePreviewResponse preview = null;

  public ShiftTradeMatchResponseItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shiftIds = new ArrayList<String>();
    }
  }

  public ShiftTradeMatchResponseItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      shiftIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the receiving shift trades which match the initiating shift trade
   **/
  public ShiftTradeMatchResponseItem shiftIds(List<String> shiftIds) {
    this.shiftIds = shiftIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the receiving shift trades which match the initiating shift trade")
  @JsonProperty("shiftIds")
  public List<String> getShiftIds() {
    return shiftIds;
  }
  public void setShiftIds(List<String> shiftIds) {
    this.shiftIds = shiftIds;
  }


  /**
   * A preview of what the shift trade would look like if matched
   **/
  public ShiftTradeMatchResponseItem preview(ShiftTradePreviewResponse preview) {
    this.preview = preview;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A preview of what the shift trade would look like if matched")
  @JsonProperty("preview")
  public ShiftTradePreviewResponse getPreview() {
    return preview;
  }
  public void setPreview(ShiftTradePreviewResponse preview) {
    this.preview = preview;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShiftTradeMatchResponseItem shiftTradeMatchResponseItem = (ShiftTradeMatchResponseItem) o;

    return Objects.equals(this.shiftIds, shiftTradeMatchResponseItem.shiftIds) &&
            Objects.equals(this.preview, shiftTradeMatchResponseItem.preview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftIds, preview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShiftTradeMatchResponseItem {\n");
    
    sb.append("    shiftIds: ").append(toIndentedString(shiftIds)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
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

