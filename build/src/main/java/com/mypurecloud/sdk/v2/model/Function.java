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
import java.util.Date;

import java.io.Serializable;
/**
 * Action function settings.
 */
@ApiModel(description = "Action function settings.")

public class Function  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Date dateCreated = null;
  private String zipId = null;
  private String handler = null;
  private String runtime = null;
  private Integer timeoutSeconds = null;

  
  @ApiModelProperty(example = "null", value = "Function identifier.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "Function name. This is automatically created based on the Action Id.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  /**
   * Description of the function. Limit 255 characters.
   **/
  public Function description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description of the function. Limit 255 characters.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "Date and time function was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Zip file identifier.")
  @JsonProperty("zipId")
  public String getZipId() {
    return zipId;
  }


  /**
   * Handler entry point into zip file to execute function. Should be path within upload function package to the invocation module without language extension, followed by a period and then exported invocation method name. e.g. 'src/index.handler'
   **/
  public Function handler(String handler) {
    this.handler = handler;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Handler entry point into zip file to execute function. Should be path within upload function package to the invocation module without language extension, followed by a period and then exported invocation method name. e.g. 'src/index.handler'")
  @JsonProperty("handler")
  public String getHandler() {
    return handler;
  }
  public void setHandler(String handler) {
    this.handler = handler;
  }


  /**
   * Runtime required for execution. Valid runtimes change over time as versions are deprecated. Use /api/v2/integrations/actions/functions/runtimes for current list.
   **/
  public Function runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Runtime required for execution. Valid runtimes change over time as versions are deprecated. Use /api/v2/integrations/actions/functions/runtimes for current list.")
  @JsonProperty("runtime")
  public String getRuntime() {
    return runtime;
  }
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }


  /**
   * Execution timeout to apply to function. Value is in seconds. Range allowed 1 to 15. Default value 15 seconds.
   * minimum: 1
   * maximum: 15
   **/
  public Function timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Execution timeout to apply to function. Value is in seconds. Range allowed 1 to 15. Default value 15 seconds.")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Function function = (Function) o;

    return Objects.equals(this.id, function.id) &&
            Objects.equals(this.name, function.name) &&
            Objects.equals(this.description, function.description) &&
            Objects.equals(this.dateCreated, function.dateCreated) &&
            Objects.equals(this.zipId, function.zipId) &&
            Objects.equals(this.handler, function.handler) &&
            Objects.equals(this.runtime, function.runtime) &&
            Objects.equals(this.timeoutSeconds, function.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateCreated, zipId, handler, runtime, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Function {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    zipId: ").append(toIndentedString(zipId)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

