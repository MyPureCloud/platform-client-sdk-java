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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WebDeploymentsDeploymentTopicWebMessagingConfigChangeEventBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody
 */

public class WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody  implements Serializable {
  
  private String id = null;
  private WebDeploymentsDeploymentTopicWebMessagingConfigChangeEventBody _configuration = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ERROR("Error"),
    DELETING("Deleting");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  
  /**
   **/
  public WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody _configuration(WebDeploymentsDeploymentTopicWebMessagingConfigChangeEventBody _configuration) {
    this._configuration = _configuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configuration")
  public WebDeploymentsDeploymentTopicWebMessagingConfigChangeEventBody getConfiguration() {
    return _configuration;
  }
  public void setConfiguration(WebDeploymentsDeploymentTopicWebMessagingConfigChangeEventBody _configuration) {
    this._configuration = _configuration;
  }

  
  /**
   **/
  public WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody webDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody = (WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody) o;
    return Objects.equals(this.id, webDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody.id) &&
        Objects.equals(this._configuration, webDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody._configuration) &&
        Objects.equals(this.status, webDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _configuration, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentsDeploymentTopicWebMessagingDeploymentChangeEventBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

