package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.LocationAddress;
import com.mypurecloud.sdk.v2.model.LocationEmergencyNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LocationDefinition
 */

public class LocationDefinition  implements Serializable {
  
  private String id = null;
  private String name = null;
  private LocationAddress address = null;
  private Boolean addressVerified = null;
  private LocationEmergencyNumber emergencyNumber = null;

  /**
   * Current activity status of the location.
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    DELETED("deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Integer version = null;
  private List<String> path = new ArrayList<String>();
  private String notes = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the Location.
   **/
  public LocationDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Location.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public LocationDefinition address(LocationAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public LocationAddress getAddress() {
    return address;
  }
  public void setAddress(LocationAddress address) {
    this.address = address;
  }

  
  /**
   **/
  public LocationDefinition addressVerified(Boolean addressVerified) {
    this.addressVerified = addressVerified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressVerified")
  public Boolean getAddressVerified() {
    return addressVerified;
  }
  public void setAddressVerified(Boolean addressVerified) {
    this.addressVerified = addressVerified;
  }

  
  /**
   **/
  public LocationDefinition emergencyNumber(LocationEmergencyNumber emergencyNumber) {
    this.emergencyNumber = emergencyNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emergencyNumber")
  public LocationEmergencyNumber getEmergencyNumber() {
    return emergencyNumber;
  }
  public void setEmergencyNumber(LocationEmergencyNumber emergencyNumber) {
    this.emergencyNumber = emergencyNumber;
  }

  
  /**
   * Current activity status of the location.
   **/
  public LocationDefinition state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current activity status of the location.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public LocationDefinition version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public LocationDefinition path(List<String> path) {
    this.path = path;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("path")
  public List<String> getPath() {
    return path;
  }
  public void setPath(List<String> path) {
    this.path = path;
  }

  
  /**
   **/
  public LocationDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
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
    LocationDefinition locationDefinition = (LocationDefinition) o;
    return Objects.equals(this.id, locationDefinition.id) &&
        Objects.equals(this.name, locationDefinition.name) &&
        Objects.equals(this.address, locationDefinition.address) &&
        Objects.equals(this.addressVerified, locationDefinition.addressVerified) &&
        Objects.equals(this.emergencyNumber, locationDefinition.emergencyNumber) &&
        Objects.equals(this.state, locationDefinition.state) &&
        Objects.equals(this.version, locationDefinition.version) &&
        Objects.equals(this.path, locationDefinition.path) &&
        Objects.equals(this.notes, locationDefinition.notes) &&
        Objects.equals(this.selfUri, locationDefinition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, addressVerified, emergencyNumber, state, version, path, notes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressVerified: ").append(toIndentedString(addressVerified)).append("\n");
    sb.append("    emergencyNumber: ").append(toIndentedString(emergencyNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

