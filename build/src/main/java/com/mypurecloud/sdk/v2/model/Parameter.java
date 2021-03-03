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
 * Parameter
 */

public class Parameter  implements Serializable {
  
  private String name = null;

  private static class ParameterTypeEnumDeserializer extends StdDeserializer<ParameterTypeEnum> {
    public ParameterTypeEnumDeserializer() {
      super(ParameterTypeEnumDeserializer.class);
    }

    @Override
    public ParameterTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ParameterTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets parameterType
   */
 @JsonDeserialize(using = ParameterTypeEnumDeserializer.class)
  public enum ParameterTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UUID("UUID"),
    STRING("STRING"),
    UUIDLIST("UUIDLIST"),
    STRINGLIST("STRINGLIST");

    private String value;

    ParameterTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParameterTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ParameterTypeEnum value : ParameterTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParameterTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ParameterTypeEnum parameterType = null;

  private static class DomainEnumDeserializer extends StdDeserializer<DomainEnum> {
    public DomainEnumDeserializer() {
      super(DomainEnumDeserializer.class);
    }

    @Override
    public DomainEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DomainEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets domain
   */
 @JsonDeserialize(using = DomainEnumDeserializer.class)
  public enum DomainEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USERID("USERID"),
    QUEUEID("QUEUEID"),
    MEDIATYPE("MEDIATYPE"),
    DIALERCAMPAIGNID("DIALERCAMPAIGNID"),
    QMEVALFORMID("QMEVALFORMID"),
    UNKNOWN("UNKNOWN");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DomainEnum fromString(String key) {
      if (key == null) return null;

      for (DomainEnum value : DomainEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DomainEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DomainEnum domain = null;
  private Boolean required = null;

  
  /**
   **/
  public Parameter name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Parameter parameterType(ParameterTypeEnum parameterType) {
    this.parameterType = parameterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parameterType")
  public ParameterTypeEnum getParameterType() {
    return parameterType;
  }
  public void setParameterType(ParameterTypeEnum parameterType) {
    this.parameterType = parameterType;
  }

  
  /**
   **/
  public Parameter domain(DomainEnum domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public DomainEnum getDomain() {
    return domain;
  }
  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  
  /**
   **/
  public Parameter required(Boolean required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter parameter = (Parameter) o;
    return Objects.equals(this.name, parameter.name) &&
        Objects.equals(this.parameterType, parameter.parameterType) &&
        Objects.equals(this.domain, parameter.domain) &&
        Objects.equals(this.required, parameter.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parameterType, domain, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameterType: ").append(toIndentedString(parameterType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

