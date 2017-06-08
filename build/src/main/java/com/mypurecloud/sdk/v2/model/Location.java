package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LocationDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Location
 */

public class Location  implements Serializable {
  
  private String id = null;
  private String floorplanId = null;
  private Map<String, Double> coordinates = new HashMap<String, Double>();
  private String notes = null;
  private LocationDefinition locationDefinition = null;

  
  /**
   **/
  public Location id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public Location floorplanId(String floorplanId) {
    this.floorplanId = floorplanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("floorplanId")
  public String getFloorplanId() {
    return floorplanId;
  }
  public void setFloorplanId(String floorplanId) {
    this.floorplanId = floorplanId;
  }

  
  /**
   **/
  public Location coordinates(Map<String, Double> coordinates) {
    this.coordinates = coordinates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("coordinates")
  public Map<String, Double> getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(Map<String, Double> coordinates) {
    this.coordinates = coordinates;
  }

  
  /**
   **/
  public Location notes(String notes) {
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

  
  /**
   **/
  public Location locationDefinition(LocationDefinition locationDefinition) {
    this.locationDefinition = locationDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locationDefinition")
  public LocationDefinition getLocationDefinition() {
    return locationDefinition;
  }
  public void setLocationDefinition(LocationDefinition locationDefinition) {
    this.locationDefinition = locationDefinition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.floorplanId, location.floorplanId) &&
        Objects.equals(this.coordinates, location.coordinates) &&
        Objects.equals(this.notes, location.notes) &&
        Objects.equals(this.locationDefinition, location.locationDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, floorplanId, coordinates, notes, locationDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    floorplanId: ").append(toIndentedString(floorplanId)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    locationDefinition: ").append(toIndentedString(locationDefinition)).append("\n");
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

