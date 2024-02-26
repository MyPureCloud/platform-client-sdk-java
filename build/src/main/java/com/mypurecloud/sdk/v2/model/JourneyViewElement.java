package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.JourneyViewElementAttributes;
import com.mypurecloud.sdk.v2.model.JourneyViewElementFilter;
import com.mypurecloud.sdk.v2.model.JourneyViewLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * An element within a journey view
 */
@ApiModel(description = "An element within a journey view")

public class JourneyViewElement  implements Serializable {
  
  private String id = null;
  private String name = null;
  private JourneyViewElementAttributes attributes = null;
  private JourneyViewElementFilter filter = null;
  private List<JourneyViewLink> followedBy = new ArrayList<JourneyViewLink>();

  
  /**
   * The unique identifier of the element within the elements list
   **/
  public JourneyViewElement id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the element within the elements list")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The unique name of the element within the view
   **/
  public JourneyViewElement name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique name of the element within the view")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Required attributes of the element
   **/
  public JourneyViewElement attributes(JourneyViewElementAttributes attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Required attributes of the element")
  @JsonProperty("attributes")
  public JourneyViewElementAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(JourneyViewElementAttributes attributes) {
    this.attributes = attributes;
  }


  /**
   * Any filters applied to this element
   **/
  public JourneyViewElement filter(JourneyViewElementFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any filters applied to this element")
  @JsonProperty("filter")
  public JourneyViewElementFilter getFilter() {
    return filter;
  }
  public void setFilter(JourneyViewElementFilter filter) {
    this.filter = filter;
  }


  /**
   * A list of JourneyViewLink objects, listing the elements downstream of this element
   **/
  public JourneyViewElement followedBy(List<JourneyViewLink> followedBy) {
    this.followedBy = followedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of JourneyViewLink objects, listing the elements downstream of this element")
  @JsonProperty("followedBy")
  public List<JourneyViewLink> getFollowedBy() {
    return followedBy;
  }
  public void setFollowedBy(List<JourneyViewLink> followedBy) {
    this.followedBy = followedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewElement journeyViewElement = (JourneyViewElement) o;

    return Objects.equals(this.id, journeyViewElement.id) &&
            Objects.equals(this.name, journeyViewElement.name) &&
            Objects.equals(this.attributes, journeyViewElement.attributes) &&
            Objects.equals(this.filter, journeyViewElement.filter) &&
            Objects.equals(this.followedBy, journeyViewElement.followedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, attributes, filter, followedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    followedBy: ").append(toIndentedString(followedBy)).append("\n");
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

