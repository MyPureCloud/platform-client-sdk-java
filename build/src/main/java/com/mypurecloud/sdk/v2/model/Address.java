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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Address
 */

public class Address  implements Serializable {
  
  private String name = null;
  private String nameRaw = null;
  private String addressNormalized = null;
  private String addressRaw = null;
  private String addressDisplayable = null;

  
  /**
   * This will be nameRaw if present, or a locality lookup of the address field otherwise.
   **/
  public Address name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This will be nameRaw if present, or a locality lookup of the address field otherwise.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The name as close to the bits on the wire as possible.
   **/
  public Address nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name as close to the bits on the wire as possible.")
  @JsonProperty("nameRaw")
  public String getNameRaw() {
    return nameRaw;
  }
  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }

  
  /**
   * The normalized address. This field is acquired from the Address Normalization Table.  The addressRaw could have gone through some transformations, such as only using the numeric portion, before being run through the Address Normalization Table.
   **/
  public Address addressNormalized(String addressNormalized) {
    this.addressNormalized = addressNormalized;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The normalized address. This field is acquired from the Address Normalization Table.  The addressRaw could have gone through some transformations, such as only using the numeric portion, before being run through the Address Normalization Table.")
  @JsonProperty("addressNormalized")
  public String getAddressNormalized() {
    return addressNormalized;
  }
  public void setAddressNormalized(String addressNormalized) {
    this.addressNormalized = addressNormalized;
  }

  
  /**
   * The address as close to the bits on the wire as possible.
   **/
  public Address addressRaw(String addressRaw) {
    this.addressRaw = addressRaw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address as close to the bits on the wire as possible.")
  @JsonProperty("addressRaw")
  public String getAddressRaw() {
    return addressRaw;
  }
  public void setAddressRaw(String addressRaw) {
    this.addressRaw = addressRaw;
  }

  
  /**
   * The displayable address. This field is acquired from the Address Normalization Table.  The addressRaw could have gone through some transformations, such as only using the numeric portion, before being run through the Address Normalization Table.
   **/
  public Address addressDisplayable(String addressDisplayable) {
    this.addressDisplayable = addressDisplayable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The displayable address. This field is acquired from the Address Normalization Table.  The addressRaw could have gone through some transformations, such as only using the numeric portion, before being run through the Address Normalization Table.")
  @JsonProperty("addressDisplayable")
  public String getAddressDisplayable() {
    return addressDisplayable;
  }
  public void setAddressDisplayable(String addressDisplayable) {
    this.addressDisplayable = addressDisplayable;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.name, address.name) &&
        Objects.equals(this.nameRaw, address.nameRaw) &&
        Objects.equals(this.addressNormalized, address.addressNormalized) &&
        Objects.equals(this.addressRaw, address.addressRaw) &&
        Objects.equals(this.addressDisplayable, address.addressDisplayable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameRaw, addressNormalized, addressRaw, addressDisplayable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
    sb.append("    addressNormalized: ").append(toIndentedString(addressNormalized)).append("\n");
    sb.append("    addressRaw: ").append(toIndentedString(addressRaw)).append("\n");
    sb.append("    addressDisplayable: ").append(toIndentedString(addressDisplayable)).append("\n");
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

