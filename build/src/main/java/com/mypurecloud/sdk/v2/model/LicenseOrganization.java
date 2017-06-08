package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * LicenseOrganization
 */

public class LicenseOrganization  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Map<String, List<AddressableEntityUser>> licenses = new HashMap<String, List<AddressableEntityUser>>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public LicenseOrganization name(String name) {
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
  public LicenseOrganization licenses(Map<String, List<AddressableEntityUser>> licenses) {
    this.licenses = licenses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("licenses")
  public Map<String, List<AddressableEntityUser>> getLicenses() {
    return licenses;
  }
  public void setLicenses(Map<String, List<AddressableEntityUser>> licenses) {
    this.licenses = licenses;
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
    LicenseOrganization licenseOrganization = (LicenseOrganization) o;
    return Objects.equals(this.id, licenseOrganization.id) &&
        Objects.equals(this.name, licenseOrganization.name) &&
        Objects.equals(this.licenses, licenseOrganization.licenses) &&
        Objects.equals(this.selfUri, licenseOrganization.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, licenses, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
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

