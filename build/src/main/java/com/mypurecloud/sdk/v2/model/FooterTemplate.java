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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * The Footer template identifies the Footer type and its footerUsage
 */
@ApiModel(description = "The Footer template identifies the Footer type and its footerUsage")

public class FooterTemplate  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies the type represented by Footer.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SIGNATURE("Signature");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  private static class ApplicableResourcesEnumDeserializer extends StdDeserializer<ApplicableResourcesEnum> {
    public ApplicableResourcesEnumDeserializer() {
      super(ApplicableResourcesEnumDeserializer.class);
    }

    @Override
    public ApplicableResourcesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ApplicableResourcesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets applicableResources
   */
 @JsonDeserialize(using = ApplicableResourcesEnumDeserializer.class)
  public enum ApplicableResourcesEnum {
    CAMPAIGN("Campaign");

    private String value;

    ApplicableResourcesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ApplicableResourcesEnum fromString(String key) {
      if (key == null) return null;

      for (ApplicableResourcesEnum value : ApplicableResourcesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ApplicableResourcesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ApplicableResourcesEnum> applicableResources = null;

  
  /**
   * Specifies the type represented by Footer.
   **/
  public FooterTemplate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the type represented by Footer.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Specifies the canned response template where the footer can be used.
   **/
  public FooterTemplate applicableResources(List<ApplicableResourcesEnum> applicableResources) {
    this.applicableResources = applicableResources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies the canned response template where the footer can be used.")
  @JsonProperty("applicableResources")
  public List<ApplicableResourcesEnum> getApplicableResources() {
    return applicableResources;
  }
  public void setApplicableResources(List<ApplicableResourcesEnum> applicableResources) {
    this.applicableResources = applicableResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FooterTemplate footerTemplate = (FooterTemplate) o;

    return Objects.equals(this.type, footerTemplate.type) &&
            Objects.equals(this.applicableResources, footerTemplate.applicableResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, applicableResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FooterTemplate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    applicableResources: ").append(toIndentedString(applicableResources)).append("\n");
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

