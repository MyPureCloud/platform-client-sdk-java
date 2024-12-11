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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MaskingRuleValidateResponse
 */

public class MaskingRuleValidateResponse  implements Serializable {
  
  private Boolean valid = null;
  private String validationMessage = null;
  private String maskedText = null;

  
  @ApiModelProperty(example = "null", value = "is masking rule definition valid?")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }


  @ApiModelProperty(example = "null", value = "Validation message.")
  @JsonProperty("validationMessage")
  public String getValidationMessage() {
    return validationMessage;
  }


  @ApiModelProperty(example = "null", value = "Masked text.")
  @JsonProperty("maskedText")
  public String getMaskedText() {
    return maskedText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingRuleValidateResponse maskingRuleValidateResponse = (MaskingRuleValidateResponse) o;

    return Objects.equals(this.valid, maskingRuleValidateResponse.valid) &&
            Objects.equals(this.validationMessage, maskingRuleValidateResponse.validationMessage) &&
            Objects.equals(this.maskedText, maskingRuleValidateResponse.maskedText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, validationMessage, maskedText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingRuleValidateResponse {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    maskedText: ").append(toIndentedString(maskedText)).append("\n");
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

