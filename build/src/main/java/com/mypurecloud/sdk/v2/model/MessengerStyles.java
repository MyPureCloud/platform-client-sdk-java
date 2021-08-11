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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MessengerStyles
 */

public class MessengerStyles  implements Serializable {
  
  private String primaryColor = null;

  
  /**
   * The primary color of messenger in hexadecimal
   **/
  public MessengerStyles primaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
    return this;
  }
  
  @ApiModelProperty(example = "#a7017c", value = "The primary color of messenger in hexadecimal")
  @JsonProperty("primaryColor")
  public String getPrimaryColor() {
    return primaryColor;
  }
  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessengerStyles messengerStyles = (MessengerStyles) o;
    return Objects.equals(this.primaryColor, messengerStyles.primaryColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessengerStyles {\n");
    
    sb.append("    primaryColor: ").append(toIndentedString(primaryColor)).append("\n");
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

