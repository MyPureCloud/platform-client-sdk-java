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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GeneralProgramJobRequest
 */

public class GeneralProgramJobRequest  implements Serializable {
  

  private static class DialectEnumDeserializer extends StdDeserializer<DialectEnum> {
    public DialectEnumDeserializer() {
      super(DialectEnumDeserializer.class);
    }

    @Override
    public DialectEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DialectEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The dialect of the topics to link with the general program, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
   */
 @JsonDeserialize(using = DialectEnumDeserializer.class)
  public enum DialectEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-US"),
    ES_US("es-US"),
    EN_AU("en-AU"),
    EN_GB("en-GB"),
    EN_ZA("en-ZA"),
    ES_ES("es-ES"),
    EN_IN("en-IN"),
    FR_FR("fr-FR"),
    FR_CA("fr-CA"),
    IT_IT("it-IT"),
    DE_DE("de-DE"),
    PT_BR("pt-BR");

    private String value;

    DialectEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DialectEnum fromString(String key) {
      if (key == null) return null;

      for (DialectEnum value : DialectEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DialectEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DialectEnum dialect = null;

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
   * The mode to use for the general program job, default value is Skip
   */
 @JsonDeserialize(using = ModeEnumDeserializer.class)
  public enum ModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SKIP("Skip"),
    MERGE("Merge");

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
   * The dialect of the topics to link with the general program, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard
   **/
  public GeneralProgramJobRequest dialect(DialectEnum dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The dialect of the topics to link with the general program, dialect format is {language}-{country} where language follows ISO 639-1 standard and country follows ISO 3166-1 alpha 2 standard")
  @JsonProperty("dialect")
  public DialectEnum getDialect() {
    return dialect;
  }
  public void setDialect(DialectEnum dialect) {
    this.dialect = dialect;
  }

  
  /**
   * The mode to use for the general program job, default value is Skip
   **/
  public GeneralProgramJobRequest mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The mode to use for the general program job, default value is Skip")
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
    GeneralProgramJobRequest generalProgramJobRequest = (GeneralProgramJobRequest) o;
    return Objects.equals(this.dialect, generalProgramJobRequest.dialect) &&
        Objects.equals(this.mode, generalProgramJobRequest.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialect, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralProgramJobRequest {\n");
    
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
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

