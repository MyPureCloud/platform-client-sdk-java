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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportedEntityTypeStatus
 */

public class SupportedEntityTypeStatus  implements Serializable {
  

  private static class ListSlotTypeEnumDeserializer extends StdDeserializer<ListSlotTypeEnum> {
    public ListSlotTypeEnumDeserializer() {
      super(ListSlotTypeEnumDeserializer.class);
    }

    @Override
    public ListSlotTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ListSlotTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The configuration status of restricted lists
   */
 @JsonDeserialize(using = ListSlotTypeEnumDeserializer.class)
  public enum ListSlotTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    RESTRICTED("Restricted"),
    UNRESTRICTED("Unrestricted");

    private String value;

    ListSlotTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ListSlotTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ListSlotTypeEnum value : ListSlotTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ListSlotTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ListSlotTypeEnum listSlotType = null;

  public SupportedEntityTypeStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The configuration status of restricted lists
   **/
  public SupportedEntityTypeStatus listSlotType(ListSlotTypeEnum listSlotType) {
    this.listSlotType = listSlotType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration status of restricted lists")
  @JsonProperty("listSlotType")
  public ListSlotTypeEnum getListSlotType() {
    return listSlotType;
  }
  public void setListSlotType(ListSlotTypeEnum listSlotType) {
    this.listSlotType = listSlotType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedEntityTypeStatus supportedEntityTypeStatus = (SupportedEntityTypeStatus) o;

    return Objects.equals(this.listSlotType, supportedEntityTypeStatus.listSlotType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listSlotType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedEntityTypeStatus {\n");
    
    sb.append("    listSlotType: ").append(toIndentedString(listSlotType)).append("\n");
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

