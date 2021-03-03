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
  private Map<String, Double> coordinates = null;
  private String notes = null;
  private LocationDefinition locationDefinition = null;

  
  /**
   * Unique identifier for the location
   **/
  public Location id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the location")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  @ApiModelProperty(example = "null", value = "Unique identifier for the location floorplan image")
  @JsonProperty("floorplanId")
  public String getFloorplanId() {
    return floorplanId;
  }

  
  /**
   * Users coordinates on the floorplan. Only used when floorplanImage is set
   **/
  public Location coordinates(Map<String, Double> coordinates) {
    this.coordinates = coordinates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Users coordinates on the floorplan. Only used when floorplanImage is set")
  @JsonProperty("coordinates")
  public Map<String, Double> getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(Map<String, Double> coordinates) {
    this.coordinates = coordinates;
  }

  
  /**
   * Optional description on the users location
   **/
  public Location notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional description on the users location")
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

