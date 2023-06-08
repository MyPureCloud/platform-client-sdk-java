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
import com.mypurecloud.sdk.v2.model.RoutingActivityData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingActivityResponse
 */

public class RoutingActivityResponse  implements Serializable {
  
  private List<RoutingActivityData> results = new ArrayList<RoutingActivityData>();

  private static class EntityIdDimensionEnumDeserializer extends StdDeserializer<EntityIdDimensionEnum> {
    public EntityIdDimensionEnumDeserializer() {
      super(EntityIdDimensionEnumDeserializer.class);
    }

    @Override
    public EntityIdDimensionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EntityIdDimensionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Dimension that is used as an entityId
   */
 @JsonDeserialize(using = EntityIdDimensionEnumDeserializer.class)
  public enum EntityIdDimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ORGANIZATIONPRESENCEID("organizationPresenceId"),
    PRESENCEDATE("presenceDate"),
    QUEUEID("queueId"),
    QUEUEMEMBERSHIPSTATUS("queueMembershipStatus"),
    ROUTINGSTATUS("routingStatus"),
    ROUTINGSTATUSDATE("routingStatusDate"),
    SYSTEMPRESENCE("systemPresence"),
    TEAMID("teamId"),
    USERID("userId");

    private String value;

    EntityIdDimensionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntityIdDimensionEnum fromString(String key) {
      if (key == null) return null;

      for (EntityIdDimensionEnum value : EntityIdDimensionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntityIdDimensionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntityIdDimensionEnum entityIdDimension = null;

  
  /**
   * Query results
   **/
  public RoutingActivityResponse results(List<RoutingActivityData> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query results")
  @JsonProperty("results")
  public List<RoutingActivityData> getResults() {
    return results;
  }
  public void setResults(List<RoutingActivityData> results) {
    this.results = results;
  }


  /**
   * Dimension that is used as an entityId
   **/
  public RoutingActivityResponse entityIdDimension(EntityIdDimensionEnum entityIdDimension) {
    this.entityIdDimension = entityIdDimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dimension that is used as an entityId")
  @JsonProperty("entityIdDimension")
  public EntityIdDimensionEnum getEntityIdDimension() {
    return entityIdDimension;
  }
  public void setEntityIdDimension(EntityIdDimensionEnum entityIdDimension) {
    this.entityIdDimension = entityIdDimension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingActivityResponse routingActivityResponse = (RoutingActivityResponse) o;

    return Objects.equals(this.results, routingActivityResponse.results) &&
            Objects.equals(this.entityIdDimension, routingActivityResponse.entityIdDimension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, entityIdDimension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingActivityResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    entityIdDimension: ").append(toIndentedString(entityIdDimension)).append("\n");
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

