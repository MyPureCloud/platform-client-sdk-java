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
 * A complex type that defines service provider attributes, or sub-attributes and their qualities.
 */
@ApiModel(description = "A complex type that defines service provider attributes, or sub-attributes and their qualities.")

public class ScimV2SchemaAttribute  implements Serializable {
  
  private String name = null;

  /**
   * The attribute's data type.  Valid values are \"string\", \"boolean\", \"decimal\", \"integer\", \"dateTime\", \"reference\", and \"complex\".
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
   * A single keyword indicating the circumstances under which the value of the attribute can be (re)defined. Value are readOnly, readWrite, immutable, writeOnly
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
   * A single keyword that indicates when an attribute and associated values are returned in response to a GET request, or in response to a PUT, POST, or PATCH request.  Valid keywords are as follows: always, never, default, request
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
   * A single keyword value that specifies how the service provider enforces uniqueness of attribute values.  A server MAY reject an invalid value based on uniqueness by returning HTTP response code 400 (Bad Request).  A client MAY enforce uniqueness on the client side to a greater degree than the service provider enforces.  For example, a client could make a value unique while the server has uniqueness of \"none\".  Valid keywords are as follows: none, server, global
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

  
  @ApiModelProperty(example = "null", value = "The attribute's data type.  Valid values are \"string\", \"boolean\", \"decimal\", \"integer\", \"dateTime\", \"reference\", and \"complex\".")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  
  /**
   * When an attribute is of type \"complex\", \"subAttributes\" defines a set of sub-attributes. \"subAttributes\" has the same schema sub-attributes as \"attributes\"
   **/
  public ScimV2SchemaAttribute subAttributes(List<ScimV2SchemaAttribute> subAttributes) {
    this.subAttributes = subAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When an attribute is of type \"complex\", \"subAttributes\" defines a set of sub-attributes. \"subAttributes\" has the same schema sub-attributes as \"attributes\"")
  @JsonProperty("subAttributes")
  public List<ScimV2SchemaAttribute> getSubAttributes() {
    return subAttributes;
  }
  public void setSubAttributes(List<ScimV2SchemaAttribute> subAttributes) {
    this.subAttributes = subAttributes;
  }

  
  @ApiModelProperty(example = "null", value = "A Boolean value indicating the attribute's plurality.")
  @JsonProperty("multiValued")
  public Boolean getMultiValued() {
    return multiValued;
  }

  
  @ApiModelProperty(example = "null", value = "The attribute's human-readable description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "A Boolean value that specifies whether or not the attribute is required.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }

  
  /**
   * A collection of suggested canonical values that MAY be used (e.g., \"work\" and \"home\").  In some cases, service providers MAY choose to ignore unsupported values.  OPTIONAL.
   **/
  public ScimV2SchemaAttribute canonicalValues(List<String> canonicalValues) {
    this.canonicalValues = canonicalValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A collection of suggested canonical values that MAY be used (e.g., \"work\" and \"home\").  In some cases, service providers MAY choose to ignore unsupported values.  OPTIONAL.")
  @JsonProperty("canonicalValues")
  public List<String> getCanonicalValues() {
    return canonicalValues;
  }
  public void setCanonicalValues(List<String> canonicalValues) {
    this.canonicalValues = canonicalValues;
  }

  
  @ApiModelProperty(example = "null", value = "A Boolean value that specifies whether or not a string attribute is case sensitive.  The server SHALL use case sensitivity when evaluating filters.  For attributes that are case exact, the server SHALL preserve case for any value submitted.  If the attribute is case insensitive, the server MAY alter case for a submitted value.  Case sensitivity also impacts how attribute values MAY be compared against filter values (see Section 3.4.2.2 of [RFC7644])")
  @JsonProperty("caseExact")
  public Boolean getCaseExact() {
    return caseExact;
  }

  
  @ApiModelProperty(example = "null", value = "A single keyword indicating the circumstances under which the value of the attribute can be (re)defined. Value are readOnly, readWrite, immutable, writeOnly")
  @JsonProperty("mutability")
  public MutabilityEnum getMutability() {
    return mutability;
  }

  
  @ApiModelProperty(example = "null", value = "A single keyword that indicates when an attribute and associated values are returned in response to a GET request, or in response to a PUT, POST, or PATCH request.  Valid keywords are as follows: always, never, default, request")
  @JsonProperty("returned")
  public ReturnedEnum getReturned() {
    return returned;
  }

  
  @ApiModelProperty(example = "null", value = "A single keyword value that specifies how the service provider enforces uniqueness of attribute values.  A server MAY reject an invalid value based on uniqueness by returning HTTP response code 400 (Bad Request).  A client MAY enforce uniqueness on the client side to a greater degree than the service provider enforces.  For example, a client could make a value unique while the server has uniqueness of \"none\".  Valid keywords are as follows: none, server, global")
  @JsonProperty("uniqueness")
  public UniquenessEnum getUniqueness() {
    return uniqueness;
  }

  
  /**
   * A multi-valued array of JSON strings that indicate the SCIM resource types that may be referenced. Values include User, Group, external and uri.
   **/
  public ScimV2SchemaAttribute referenceTypes(List<ReferenceTypesEnum> referenceTypes) {
    this.referenceTypes = referenceTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A multi-valued array of JSON strings that indicate the SCIM resource types that may be referenced. Values include User, Group, external and uri.")
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

