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
import com.mypurecloud.sdk.v2.model.Function;
import com.mypurecloud.sdk.v2.model.FunctionZipConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Current action function configuration and zip upload configuration.
 */
@ApiModel(description = "Current action function configuration and zip upload configuration.")

public class FunctionConfig  implements Serializable {
  
  private String id = null;
  private Function function = null;
  private FunctionZipConfig zip = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "Action identifier.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "Function configuration.")
  @JsonProperty("function")
  public Function getFunction() {
    return function;
  }


  @ApiModelProperty(example = "null", value = "Zip file configuration and state.")
  @JsonProperty("zip")
  public FunctionZipConfig getZip() {
    return zip;
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
    FunctionConfig functionConfig = (FunctionConfig) o;

    return Objects.equals(this.id, functionConfig.id) &&
            Objects.equals(this.function, functionConfig.function) &&
            Objects.equals(this.zip, functionConfig.zip) &&
            Objects.equals(this.selfUri, functionConfig.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, function, zip, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionConfig {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

