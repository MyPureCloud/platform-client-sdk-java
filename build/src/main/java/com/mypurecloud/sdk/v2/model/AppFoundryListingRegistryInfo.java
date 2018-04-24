package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents the optional integration registry support for a listing
 */
@ApiModel(description = "Represents the optional integration registry support for a listing")

public class AppFoundryListingRegistryInfo  implements Serializable {
  
  private String id = null;
  private List<String> regions = new ArrayList<String>();

  
  /**
   * The ID of the integration registry entry that is represented by the listing
   **/
  public AppFoundryListingRegistryInfo id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the integration registry entry that is represented by the listing")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Supported regions where the listing may be installed
   **/
  public AppFoundryListingRegistryInfo regions(List<String> regions) {
    this.regions = regions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supported regions where the listing may be installed")
  @JsonProperty("regions")
  public List<String> getRegions() {
    return regions;
  }
  public void setRegions(List<String> regions) {
    this.regions = regions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppFoundryListingRegistryInfo appFoundryListingRegistryInfo = (AppFoundryListingRegistryInfo) o;
    return Objects.equals(this.id, appFoundryListingRegistryInfo.id) &&
        Objects.equals(this.regions, appFoundryListingRegistryInfo.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppFoundryListingRegistryInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

