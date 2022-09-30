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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Information about the Trigger test mode schema validation step
 */
@ApiModel(description = "Information about the Trigger test mode schema validation step")

public class TestSchemaOperation  implements Serializable {
  
  private String name = null;
  private Integer step = null;
  private Boolean matches = null;
  private List<String> details = new ArrayList<String>();

  
  /**
   * The name of the processing step
   **/
  public TestSchemaOperation name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the processing step")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The number of the processing step
   **/
  public TestSchemaOperation step(Integer step) {
    this.step = step;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of the processing step")
  @JsonProperty("step")
  public Integer getStep() {
    return step;
  }
  public void setStep(Integer step) {
    this.step = step;
  }


  /**
   * Whether or not the operation matches expectations
   **/
  public TestSchemaOperation matches(Boolean matches) {
    this.matches = matches;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the operation matches expectations")
  @JsonProperty("matches")
  public Boolean getMatches() {
    return matches;
  }
  public void setMatches(Boolean matches) {
    this.matches = matches;
  }


  /**
   * Details about why the operation did or did not succeed
   **/
  public TestSchemaOperation details(List<String> details) {
    this.details = details;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about why the operation did or did not succeed")
  @JsonProperty("details")
  public List<String> getDetails() {
    return details;
  }
  public void setDetails(List<String> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSchemaOperation testSchemaOperation = (TestSchemaOperation) o;

    return Objects.equals(this.name, testSchemaOperation.name) &&
            Objects.equals(this.step, testSchemaOperation.step) &&
            Objects.equals(this.matches, testSchemaOperation.matches) &&
            Objects.equals(this.details, testSchemaOperation.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, step, matches, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSchemaOperation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

