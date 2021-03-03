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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Represents an unassigned or assigned DID in a DID Pool.
 */
@ApiModel(description = "Represents an unassigned or assigned DID in a DID Pool.")

public class DIDNumber  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String number = null;
  private Boolean assigned = null;
  private AddressableEntityRef didPool = null;
  private DomainEntityRef owner = null;

  private static class OwnerTypeEnumDeserializer extends StdDeserializer<OwnerTypeEnum> {
    public OwnerTypeEnumDeserializer() {
      super(OwnerTypeEnumDeserializer.class);
    }

    @Override
    public OwnerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OwnerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the entity that owns this DID.  If the DID is unassigned, this will be NULL.
   */
 @JsonDeserialize(using = OwnerTypeEnumDeserializer.class)
  public enum OwnerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("USER"),
    PHONE("PHONE"),
    IVR_CONFIG("IVR_CONFIG"),
    GROUP("GROUP");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OwnerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OwnerTypeEnum value : OwnerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OwnerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OwnerTypeEnum ownerType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DIDNumber name(String name) {
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
   * The number of the DID formatted as E164.
   **/
  public DIDNumber number(String number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of the DID formatted as E164.")
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  
  /**
   * True if this DID is assigned to an entity.  False otherwise.
   **/
  public DIDNumber assigned(Boolean assigned) {
    this.assigned = assigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if this DID is assigned to an entity.  False otherwise.")
  @JsonProperty("assigned")
  public Boolean getAssigned() {
    return assigned;
  }
  public void setAssigned(Boolean assigned) {
    this.assigned = assigned;
  }

  
  /**
   * A Uri reference to the DID Pool this DID is a part of.
   **/
  public DIDNumber didPool(AddressableEntityRef didPool) {
    this.didPool = didPool;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Uri reference to the DID Pool this DID is a part of.")
  @JsonProperty("didPool")
  public AddressableEntityRef getDidPool() {
    return didPool;
  }
  public void setDidPool(AddressableEntityRef didPool) {
    this.didPool = didPool;
  }

  
  /**
   * A Uri reference to the owner of this DID.  The owner's type can be found in ownerType.  If the DID is unassigned, this will be NULL.
   **/
  public DIDNumber owner(DomainEntityRef owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A Uri reference to the owner of this DID.  The owner's type can be found in ownerType.  If the DID is unassigned, this will be NULL.")
  @JsonProperty("owner")
  public DomainEntityRef getOwner() {
    return owner;
  }
  public void setOwner(DomainEntityRef owner) {
    this.owner = owner;
  }

  
  /**
   * The type of the entity that owns this DID.  If the DID is unassigned, this will be NULL.
   **/
  public DIDNumber ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the entity that owns this DID.  If the DID is unassigned, this will be NULL.")
  @JsonProperty("ownerType")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }
  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DIDNumber dIDNumber = (DIDNumber) o;
    return Objects.equals(this.id, dIDNumber.id) &&
        Objects.equals(this.name, dIDNumber.name) &&
        Objects.equals(this.number, dIDNumber.number) &&
        Objects.equals(this.assigned, dIDNumber.assigned) &&
        Objects.equals(this.didPool, dIDNumber.didPool) &&
        Objects.equals(this.owner, dIDNumber.owner) &&
        Objects.equals(this.ownerType, dIDNumber.ownerType) &&
        Objects.equals(this.selfUri, dIDNumber.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, number, assigned, didPool, owner, ownerType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DIDNumber {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    didPool: ").append(toIndentedString(didPool)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

