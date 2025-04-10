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
 * WorkflowTargetSettings
 */

public class WorkflowTargetSettings  implements Serializable {
  

  private static class DataFormatEnumDeserializer extends StdDeserializer<DataFormatEnum> {
    public DataFormatEnumDeserializer() {
      super(DataFormatEnumDeserializer.class);
    }

    @Override
    public DataFormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DataFormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The data format to use when invoking target.
   */
 @JsonDeserialize(using = DataFormatEnumDeserializer.class)
  public enum DataFormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    JSON("Json"),
    TOPLEVELPRIMITIVES("TopLevelPrimitives");

    private String value;

    DataFormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DataFormatEnum fromString(String key) {
      if (key == null) return null;

      for (DataFormatEnum value : DataFormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DataFormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DataFormatEnum dataFormat = null;

  public WorkflowTargetSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The data format to use when invoking target.
   **/
  public WorkflowTargetSettings dataFormat(DataFormatEnum dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data format to use when invoking target.")
  @JsonProperty("dataFormat")
  public DataFormatEnum getDataFormat() {
    return dataFormat;
  }
  public void setDataFormat(DataFormatEnum dataFormat) {
    this.dataFormat = dataFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTargetSettings workflowTargetSettings = (WorkflowTargetSettings) o;

    return Objects.equals(this.dataFormat, workflowTargetSettings.dataFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTargetSettings {\n");
    
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
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

