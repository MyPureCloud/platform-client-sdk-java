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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Widget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DashboardConfiguration
 */

public class DashboardConfiguration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer rows = null;
  private Integer columns = null;
  private List<Widget> widgets = new ArrayList<Widget>();
  private Boolean favorite = null;
  private Boolean publicDashboard = null;
  private Boolean restricted = null;

  private static class LayoutTypeEnumDeserializer extends StdDeserializer<LayoutTypeEnum> {
    public LayoutTypeEnumDeserializer() {
      super(LayoutTypeEnumDeserializer.class);
    }

    @Override
    public LayoutTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LayoutTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The layout type of the dashboard
   */
 @JsonDeserialize(using = LayoutTypeEnumDeserializer.class)
  public enum LayoutTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GRID("Grid"),
    FLOW("Flow");

    private String value;

    LayoutTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LayoutTypeEnum fromString(String key) {
      if (key == null) return null;

      for (LayoutTypeEnum value : LayoutTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LayoutTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LayoutTypeEnum layoutType = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private AddressableEntityRef createdBy = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of dashboard configuration.
   **/
  public DashboardConfiguration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of dashboard configuration.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The count of rows for the specific dashboard configuration.
   **/
  public DashboardConfiguration rows(Integer rows) {
    this.rows = rows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of rows for the specific dashboard configuration.")
  @JsonProperty("rows")
  public Integer getRows() {
    return rows;
  }
  public void setRows(Integer rows) {
    this.rows = rows;
  }


  /**
   * The count of columns for the specific dashboard.
   **/
  public DashboardConfiguration columns(Integer columns) {
    this.columns = columns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count of columns for the specific dashboard.")
  @JsonProperty("columns")
  public Integer getColumns() {
    return columns;
  }
  public void setColumns(Integer columns) {
    this.columns = columns;
  }


  /**
   * List of widgets for dashboard configuration.
   **/
  public DashboardConfiguration widgets(List<Widget> widgets) {
    this.widgets = widgets;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of widgets for dashboard configuration.")
  @JsonProperty("widgets")
  public List<Widget> getWidgets() {
    return widgets;
  }
  public void setWidgets(List<Widget> widgets) {
    this.widgets = widgets;
  }


  /**
   * The flag indicates if the dashboard is favorited by the user
   **/
  public DashboardConfiguration favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flag indicates if the dashboard is favorited by the user")
  @JsonProperty("favorite")
  public Boolean getFavorite() {
    return favorite;
  }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }


  /**
   * The flag to indicate if the dashboard is published by an user
   **/
  public DashboardConfiguration publicDashboard(Boolean publicDashboard) {
    this.publicDashboard = publicDashboard;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The flag to indicate if the dashboard is published by an user")
  @JsonProperty("publicDashboard")
  public Boolean getPublicDashboard() {
    return publicDashboard;
  }
  public void setPublicDashboard(Boolean publicDashboard) {
    this.publicDashboard = publicDashboard;
  }


  @ApiModelProperty(example = "null", value = "The flag to indicate if the dashboard has any restricted data for that user")
  @JsonProperty("restricted")
  public Boolean getRestricted() {
    return restricted;
  }


  /**
   * The layout type of the dashboard
   **/
  public DashboardConfiguration layoutType(LayoutTypeEnum layoutType) {
    this.layoutType = layoutType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The layout type of the dashboard")
  @JsonProperty("layoutType")
  public LayoutTypeEnum getLayoutType() {
    return layoutType;
  }
  public void setLayoutType(LayoutTypeEnum layoutType) {
    this.layoutType = layoutType;
  }


  /**
   * The created date of the dashboard. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DashboardConfiguration dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The created date of the dashboard. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The last modified date of the dashboard. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DashboardConfiguration dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The last modified date of the dashboard. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @ApiModelProperty(example = "null", value = "The id of user who created the dashboard")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
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
    DashboardConfiguration dashboardConfiguration = (DashboardConfiguration) o;

    return Objects.equals(this.id, dashboardConfiguration.id) &&
            Objects.equals(this.name, dashboardConfiguration.name) &&
            Objects.equals(this.rows, dashboardConfiguration.rows) &&
            Objects.equals(this.columns, dashboardConfiguration.columns) &&
            Objects.equals(this.widgets, dashboardConfiguration.widgets) &&
            Objects.equals(this.favorite, dashboardConfiguration.favorite) &&
            Objects.equals(this.publicDashboard, dashboardConfiguration.publicDashboard) &&
            Objects.equals(this.restricted, dashboardConfiguration.restricted) &&
            Objects.equals(this.layoutType, dashboardConfiguration.layoutType) &&
            Objects.equals(this.dateCreated, dashboardConfiguration.dateCreated) &&
            Objects.equals(this.dateModified, dashboardConfiguration.dateModified) &&
            Objects.equals(this.createdBy, dashboardConfiguration.createdBy) &&
            Objects.equals(this.selfUri, dashboardConfiguration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rows, columns, widgets, favorite, publicDashboard, restricted, layoutType, dateCreated, dateModified, createdBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    publicDashboard: ").append(toIndentedString(publicDashboard)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

