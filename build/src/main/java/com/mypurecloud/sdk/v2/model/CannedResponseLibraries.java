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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * CannedResponseLibraries
 */

public class CannedResponseLibraries  implements Serializable {
  
  private List<String> libraryIds = new ArrayList<String>();

  private static class ModeEnumDeserializer extends StdDeserializer<ModeEnum> {
    public ModeEnumDeserializer() {
      super(ModeEnumDeserializer.class);
    }

    @Override
    public ModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The association mode of canned response libraries to queue
   */
 @JsonDeserialize(using = ModeEnumDeserializer.class)
  public enum ModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    SELECTEDONLY("SelectedOnly"),
    NONE("None");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ModeEnum fromString(String key) {
      if (key == null) return null;

      for (ModeEnum value : ModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ModeEnum mode = null;

  
  /**
   * Set of canned response library IDs associated with the queue only when mode is SelectedOnly.
   **/
  public CannedResponseLibraries libraryIds(List<String> libraryIds) {
    this.libraryIds = libraryIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set of canned response library IDs associated with the queue only when mode is SelectedOnly.")
  @JsonProperty("libraryIds")
  public List<String> getLibraryIds() {
    return libraryIds;
  }
  public void setLibraryIds(List<String> libraryIds) {
    this.libraryIds = libraryIds;
  }


  /**
   * The association mode of canned response libraries to queue
   **/
  public CannedResponseLibraries mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The association mode of canned response libraries to queue")
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CannedResponseLibraries cannedResponseLibraries = (CannedResponseLibraries) o;

    return Objects.equals(this.libraryIds, cannedResponseLibraries.libraryIds) &&
            Objects.equals(this.mode, cannedResponseLibraries.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraryIds, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CannedResponseLibraries {\n");
    
    sb.append("    libraryIds: ").append(toIndentedString(libraryIds)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

