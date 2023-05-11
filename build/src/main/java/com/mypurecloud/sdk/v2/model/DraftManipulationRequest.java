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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.HistoryHeadersTranslation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DraftManipulationRequest
 */

public class DraftManipulationRequest  implements Serializable {
  
  private HistoryHeadersTranslation translate = null;

  private static class DraftTypeEnumDeserializer extends StdDeserializer<DraftTypeEnum> {
    public DraftTypeEnumDeserializer() {
      super(DraftTypeEnumDeserializer.class);
    }

    @Override
    public DraftTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DraftTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The kind of draft that as to be treated. Used to prefix response subject or auto-include information
   */
 @JsonDeserialize(using = DraftTypeEnumDeserializer.class)
  public enum DraftTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REPLY("Reply"),
    REPLYALL("ReplyAll"),
    FORWARD("Forward");

    private String value;

    DraftTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DraftTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DraftTypeEnum value : DraftTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DraftTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DraftTypeEnum draftType = null;

  
  /**
   * A set of definitions to translate email attributes and correctly display date and time, for a given language
   **/
  public DraftManipulationRequest translate(HistoryHeadersTranslation translate) {
    this.translate = translate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of definitions to translate email attributes and correctly display date and time, for a given language")
  @JsonProperty("translate")
  public HistoryHeadersTranslation getTranslate() {
    return translate;
  }
  public void setTranslate(HistoryHeadersTranslation translate) {
    this.translate = translate;
  }


  /**
   * The kind of draft that as to be treated. Used to prefix response subject or auto-include information
   **/
  public DraftManipulationRequest draftType(DraftTypeEnum draftType) {
    this.draftType = draftType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The kind of draft that as to be treated. Used to prefix response subject or auto-include information")
  @JsonProperty("draftType")
  public DraftTypeEnum getDraftType() {
    return draftType;
  }
  public void setDraftType(DraftTypeEnum draftType) {
    this.draftType = draftType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftManipulationRequest draftManipulationRequest = (DraftManipulationRequest) o;

    return Objects.equals(this.translate, draftManipulationRequest.translate) &&
            Objects.equals(this.draftType, draftManipulationRequest.draftType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translate, draftType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftManipulationRequest {\n");
    
    sb.append("    translate: ").append(toIndentedString(translate)).append("\n");
    sb.append("    draftType: ").append(toIndentedString(draftType)).append("\n");
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

