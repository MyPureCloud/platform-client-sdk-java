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
import com.mypurecloud.sdk.v2.model.LineUserId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * User information for a Line account
 */
@ApiModel(description = "User information for a Line account")

public class LineId  implements Serializable {
  
  private List<LineUserId> ids = new ArrayList<LineUserId>();
  private String displayName = null;

  
  /**
   * The set of Line userIds that this person has. Each userId is specific to the Line channel that the user interacts with.
   **/
  public LineId ids(List<LineUserId> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of Line userIds that this person has. Each userId is specific to the Line channel that the user interacts with.")
  @JsonProperty("ids")
  public List<LineUserId> getIds() {
    return ids;
  }
  public void setIds(List<LineUserId> ids) {
    this.ids = ids;
  }

  
  /**
   * The displayName of this person's account in Line
   **/
  public LineId displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The displayName of this person's account in Line")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineId lineId = (LineId) o;
    return Objects.equals(this.ids, lineId.ids) &&
        Objects.equals(this.displayName, lineId.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineId {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

