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
import com.mypurecloud.sdk.v2.model.DataAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GuideVersionResources
 */

public class GuideVersionResources  implements Serializable {
  
  private List<DataAction> dataActions = null;

  public GuideVersionResources() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dataActions = new ArrayList<DataAction>();
    }
  }

  
  /**
   * The data actions associated with this version of the guide.
   **/
  public GuideVersionResources dataActions(List<DataAction> dataActions) {
    this.dataActions = dataActions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data actions associated with this version of the guide.")
  @JsonProperty("dataActions")
  public List<DataAction> getDataActions() {
    return dataActions;
  }
  public void setDataActions(List<DataAction> dataActions) {
    this.dataActions = dataActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideVersionResources guideVersionResources = (GuideVersionResources) o;

    return Objects.equals(this.dataActions, guideVersionResources.dataActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideVersionResources {\n");
    
    sb.append("    dataActions: ").append(toIndentedString(dataActions)).append("\n");
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

