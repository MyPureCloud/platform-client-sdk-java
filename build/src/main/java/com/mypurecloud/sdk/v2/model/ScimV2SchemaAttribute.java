package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A complex type that defines service provider attributes or subattributes and their qualities.
 */
@ApiModel(description = "A complex type that defines service provider attributes or subattributes and their qualities.")

public class ScimV2SchemaAttribute  implements Serializable {
  
  private String name = null;

  /**
   * The data type of the attribute.
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("STRING"),
    BOOLEAN("BOOLEAN"),
    DECIMAL("DECIMAL"),
    INTEGER("INTEGER"),
    DATE_TIME("DATE_TIME"),
    REFERENCE("REFERENCE"),
    COMPLEX("COMPLEX");

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
  private List<ScimV2SchemaAttribute> subAttributes = new ArrayList<ScimV2SchemaAttribute>();
  private Boolean multiValued = null;
  private String description = null;
  private Boolean required = null;
  private List<String> canonicalValues = new ArrayList<String>();
  private Boolean caseExact = null;

  /**
   * The circumstances under which an attribute can be defined or redefined. The default is \"readWrite\".
   */
  public enum MutabilityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    READWRITE("readWrite"),
    READONLY("readOnly"),
    IMMUTABLE("immutable"),
    WRITEONLY("writeOnly");

    private String value;

    MutabilityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MutabilityEnum fromString(String key) {
      if (key == null) return null;

      for (MutabilityEnum value : MutabilityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MutabilityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MutabilityEnum mutability = null;

  /**
   * The circumstances under which an attribute and its values are returned in response to a GET, PUT, POST, or PATCH request.
   */
  public enum ReturnedEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALWAYS("ALWAYS"),
    NEVER("NEVER"),
    DEFAULT("DEFAULT"),
    REQUEST("REQUEST");

    private String value;

    ReturnedEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReturnedEnum fromString(String key) {
      if (key == null) return null;

      for (ReturnedEnum value : ReturnedEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReturnedEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReturnedEnum returned = null;

  /**
   * The method by which the service provider enforces the uniqueness of an attribute value. A server can reject a value by returning the HTTP response code 400 (Bad Request). A client can enforce uniqueness to a greater degree than the server provider enforces. For example, a client could make a value unique even though the server has \"uniqueness\" set to \"none\".
   */
  public enum UniquenessEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("NONE"),
    SERVER("SERVER"),
    GLOBAL("GLOBAL");

    private String value;

    UniquenessEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UniquenessEnum fromString(String key) {
      if (key == null) return null;

      for (UniquenessEnum value : UniquenessEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UniquenessEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UniquenessEnum uniqueness = null;

  /**
   * Gets or Sets referenceTypes
   */
  public enum ReferenceTypesEnum {
    USER("USER"),
    GROUP("GROUP"),
    EXTERNAL("EXTERNAL"),
    URI("URI");

    private String value;

    ReferenceTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReferenceTypesEnum fromString(String key) {
      if (key == null) return null;

      for (ReferenceTypesEnum value : ReferenceTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReferenceTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ReferenceTypesEnum> referenceTypes = new ArrayList<ReferenceTypesEnum>();

  
  @ApiModelProperty(example = "null", value = "The attribute's name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The data type of the attribute.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  
  /**
   * The list of subattributes for an attribute of the type \"complex\". Uses the same schema as \"attributes\".
   **/
  public ScimV2SchemaAttribute subAttributes(List<ScimV2SchemaAttribute> subAttributes) {
    this.subAttributes = subAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of subattributes for an attribute of the type \"complex\". Uses the same schema as \"attributes\".")
  @JsonProperty("subAttributes")
  public List<ScimV2SchemaAttribute> getSubAttributes() {
    return subAttributes;
  }
  public void setSubAttributes(List<ScimV2SchemaAttribute> subAttributes) {
    this.subAttributes = subAttributes;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates whether an attribute contains multiple values.")
  @JsonProperty("multiValued")
  public Boolean getMultiValued() {
    return multiValued;
  }

  
  @ApiModelProperty(example = "null", value = "The description of the attribute.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates whether an attribute is required.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  
  /**
   * The list of standard values that service providers may use. Service providers may ignore unsupported values.
   **/
  public ScimV2SchemaAttribute canonicalValues(List<String> canonicalValues) {
    this.canonicalValues = canonicalValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of standard values that service providers may use. Service providers may ignore unsupported values.")
  @JsonProperty("canonicalValues")
  public List<String> getCanonicalValues() {
    return canonicalValues;
  }
  public void setCanonicalValues(List<String> canonicalValues) {
    this.canonicalValues = canonicalValues;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates whether a string attribute is case-sensitive. If set to \"true\", the server preserves case sensitivity. If set to \"false\", the server may change the case. The server also uses case sensitivity when evaluating filters. See section 3.4.2.2 \"Filtering\" in RFC 7644 for details.")
  @JsonProperty("caseExact")
  public Boolean getCaseExact() {
    return caseExact;
  }

  
  @ApiModelProperty(example = "null", value = "The circumstances under which an attribute can be defined or redefined. The default is \"readWrite\".")
  @JsonProperty("mutability")
  public MutabilityEnum getMutability() {
    return mutability;
  }

  
  @ApiModelProperty(example = "null", value = "The circumstances under which an attribute and its values are returned in response to a GET, PUT, POST, or PATCH request.")
  @JsonProperty("returned")
  public ReturnedEnum getReturned() {
    return returned;
  }

  
  @ApiModelProperty(example = "null", value = "The method by which the service provider enforces the uniqueness of an attribute value. A server can reject a value by returning the HTTP response code 400 (Bad Request). A client can enforce uniqueness to a greater degree than the server provider enforces. For example, a client could make a value unique even though the server has \"uniqueness\" set to \"none\".")
  @JsonProperty("uniqueness")
  public UniquenessEnum getUniqueness() {
    return uniqueness;
  }

  
  /**
   * The list of SCIM resource types that may be referenced. Only applies when \"type\" is set to \"reference\".
   **/
  public ScimV2SchemaAttribute referenceTypes(List<ReferenceTypesEnum> referenceTypes) {
    this.referenceTypes = referenceTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of SCIM resource types that may be referenced. Only applies when \"type\" is set to \"reference\".")
  @JsonProperty("referenceTypes")
  public List<ReferenceTypesEnum> getReferenceTypes() {
    return referenceTypes;
  }
  public void setReferenceTypes(List<ReferenceTypesEnum> referenceTypes) {
    this.referenceTypes = referenceTypes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2SchemaAttribute scimV2SchemaAttribute = (ScimV2SchemaAttribute) o;
    return Objects.equals(this.name, scimV2SchemaAttribute.name) &&
        Objects.equals(this.type, scimV2SchemaAttribute.type) &&
        Objects.equals(this.subAttributes, scimV2SchemaAttribute.subAttributes) &&
        Objects.equals(this.multiValued, scimV2SchemaAttribute.multiValued) &&
        Objects.equals(this.description, scimV2SchemaAttribute.description) &&
        Objects.equals(this.required, scimV2SchemaAttribute.required) &&
        Objects.equals(this.canonicalValues, scimV2SchemaAttribute.canonicalValues) &&
        Objects.equals(this.caseExact, scimV2SchemaAttribute.caseExact) &&
        Objects.equals(this.mutability, scimV2SchemaAttribute.mutability) &&
        Objects.equals(this.returned, scimV2SchemaAttribute.returned) &&
        Objects.equals(this.uniqueness, scimV2SchemaAttribute.uniqueness) &&
        Objects.equals(this.referenceTypes, scimV2SchemaAttribute.referenceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, subAttributes, multiValued, description, required, canonicalValues, caseExact, mutability, returned, uniqueness, referenceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2SchemaAttribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subAttributes: ").append(toIndentedString(subAttributes)).append("\n");
    sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    canonicalValues: ").append(toIndentedString(canonicalValues)).append("\n");
    sb.append("    caseExact: ").append(toIndentedString(caseExact)).append("\n");
    sb.append("    mutability: ").append(toIndentedString(mutability)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    uniqueness: ").append(toIndentedString(uniqueness)).append("\n");
    sb.append("    referenceTypes: ").append(toIndentedString(referenceTypes)).append("\n");
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

