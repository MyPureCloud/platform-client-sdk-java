package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Path
 */

public class Path  implements Serializable {
  
  private String schemaUrn = null;
  private Boolean root = null;

  
  /**
   **/
  public Path schemaUrn(String schemaUrn) {
    this.schemaUrn = schemaUrn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schemaUrn")
  public String getSchemaUrn() {
    return schemaUrn;
  }
  public void setSchemaUrn(String schemaUrn) {
    this.schemaUrn = schemaUrn;
  }

  
  /**
   **/
  public Path root(Boolean root) {
    this.root = root;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("root")
  public Boolean getRoot() {
    return root;
  }
  public void setRoot(Boolean root) {
    this.root = root;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Path path = (Path) o;
    return Objects.equals(this.schemaUrn, path.schemaUrn) &&
        Objects.equals(this.root, path.root);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaUrn, root);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Path {\n");
    
    sb.append("    schemaUrn: ").append(toIndentedString(schemaUrn)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
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

