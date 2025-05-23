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
 * Settings concerning position
 */
@ApiModel(description = "Settings concerning position")

public class PositionSettings  implements Serializable {
  

  private static class AlignmentEnumDeserializer extends StdDeserializer<AlignmentEnum> {
    public AlignmentEnumDeserializer() {
      super(AlignmentEnumDeserializer.class);
    }

    @Override
    public AlignmentEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlignmentEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The alignment for position
   */
 @JsonDeserialize(using = AlignmentEnumDeserializer.class)
  public enum AlignmentEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUTO("Auto"),
    LEFT("Left"),
    RIGHT("Right");

    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlignmentEnum fromString(String key) {
      if (key == null) return null;

      for (AlignmentEnum value : AlignmentEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlignmentEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AlignmentEnum alignment = null;
  private Integer sideSpace = null;
  private Integer bottomSpace = null;

  public PositionSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The alignment for position
   **/
  public PositionSettings alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The alignment for position")
  @JsonProperty("alignment")
  public AlignmentEnum getAlignment() {
    return alignment;
  }
  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }


  /**
   * The sidespace value for position
   **/
  public PositionSettings sideSpace(Integer sideSpace) {
    this.sideSpace = sideSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sidespace value for position")
  @JsonProperty("sideSpace")
  public Integer getSideSpace() {
    return sideSpace;
  }
  public void setSideSpace(Integer sideSpace) {
    this.sideSpace = sideSpace;
  }


  /**
   * The bottomspace value for position
   **/
  public PositionSettings bottomSpace(Integer bottomSpace) {
    this.bottomSpace = bottomSpace;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The bottomspace value for position")
  @JsonProperty("bottomSpace")
  public Integer getBottomSpace() {
    return bottomSpace;
  }
  public void setBottomSpace(Integer bottomSpace) {
    this.bottomSpace = bottomSpace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionSettings positionSettings = (PositionSettings) o;

    return Objects.equals(this.alignment, positionSettings.alignment) &&
            Objects.equals(this.sideSpace, positionSettings.sideSpace) &&
            Objects.equals(this.bottomSpace, positionSettings.bottomSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, sideSpace, bottomSpace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionSettings {\n");
    
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    sideSpace: ").append(toIndentedString(sideSpace)).append("\n");
    sb.append("    bottomSpace: ").append(toIndentedString(bottomSpace)).append("\n");
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

