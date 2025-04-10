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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.JourneyViewChart;
import com.mypurecloud.sdk.v2.model.JourneyViewElement;
import com.mypurecloud.sdk.v2.model.JourneyViewUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * A journey view
 */
@ApiModel(description = "A journey view")

public class JourneyView  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Integer version = null;
  private JourneyViewUser createdBy = null;
  private JourneyViewUser modifiedBy = null;
  private String interval = null;
  private String duration = null;
  private List<JourneyViewElement> elements = null;
  private List<JourneyViewChart> charts = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public JourneyView() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      elements = new ArrayList<JourneyViewElement>();
      charts = new ArrayList<JourneyViewChart>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public JourneyView name(String name) {
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
   * A description of the journey view
   **/
  public JourneyView description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the journey view")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "The version of the journey view")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }


  @ApiModelProperty(example = "null", value = "User that has created the view.")
  @JsonProperty("createdBy")
  public JourneyViewUser getCreatedBy() {
    return createdBy;
  }


  @ApiModelProperty(example = "null", value = "User that has modified the view.")
  @JsonProperty("modifiedBy")
  public JourneyViewUser getModifiedBy() {
    return modifiedBy;
  }


  /**
   * An absolute timeframe for the journey view, expressed as an ISO 8601 interval. Only one of interval or duration must be specified. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public JourneyView interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An absolute timeframe for the journey view, expressed as an ISO 8601 interval. Only one of interval or duration must be specified. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * A relative timeframe for the journey view, expressed as an ISO 8601 duration. Only one of interval or duration must be specified. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public JourneyView duration(String duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A relative timeframe for the journey view, expressed as an ISO 8601 duration. Only one of interval or duration must be specified. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }


  /**
   * The elements within the journey view
   **/
  public JourneyView elements(List<JourneyViewElement> elements) {
    this.elements = elements;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The elements within the journey view")
  @JsonProperty("elements")
  public List<JourneyViewElement> getElements() {
    return elements;
  }
  public void setElements(List<JourneyViewElement> elements) {
    this.elements = elements;
  }


  /**
   * A list of charts to measure within context of the elements of the the journey view
   **/
  public JourneyView charts(List<JourneyViewChart> charts) {
    this.charts = charts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of charts to measure within context of the elements of the the journey view")
  @JsonProperty("charts")
  public List<JourneyViewChart> getCharts() {
    return charts;
  }
  public void setCharts(List<JourneyViewChart> charts) {
    this.charts = charts;
  }


  @ApiModelProperty(example = "null", value = "The date when the journey view was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date when this version of the journey view was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    JourneyView journeyView = (JourneyView) o;

    return Objects.equals(this.id, journeyView.id) &&
            Objects.equals(this.name, journeyView.name) &&
            Objects.equals(this.description, journeyView.description) &&
            Objects.equals(this.version, journeyView.version) &&
            Objects.equals(this.createdBy, journeyView.createdBy) &&
            Objects.equals(this.modifiedBy, journeyView.modifiedBy) &&
            Objects.equals(this.interval, journeyView.interval) &&
            Objects.equals(this.duration, journeyView.duration) &&
            Objects.equals(this.elements, journeyView.elements) &&
            Objects.equals(this.charts, journeyView.charts) &&
            Objects.equals(this.dateCreated, journeyView.dateCreated) &&
            Objects.equals(this.dateModified, journeyView.dateModified) &&
            Objects.equals(this.selfUri, journeyView.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, createdBy, modifiedBy, interval, duration, elements, charts, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyView {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

