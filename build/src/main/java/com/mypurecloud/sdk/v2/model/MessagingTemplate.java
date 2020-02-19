package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The messaging template identifies a structured message templates supported by a messaging channel. For example, WhatsApp
 */
@ApiModel(description = "The messaging template identifies a structured message templates supported by a messaging channel. For example, WhatsApp")

public class MessagingTemplate  implements Serializable {
  
  private String name = null;
  private String namespace = null;
  private String language = null;

  
  /**
   * The messaging template name.
   **/
  public MessagingTemplate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging template name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The messaging template namespace.
   **/
  public MessagingTemplate namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging template namespace.")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  
  /**
   * The messaging template language. For example, 'en-US'
   **/
  public MessagingTemplate language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging template language. For example, 'en-US'")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingTemplate messagingTemplate = (MessagingTemplate) o;
    return Objects.equals(this.name, messagingTemplate.name) &&
        Objects.equals(this.namespace, messagingTemplate.namespace) &&
        Objects.equals(this.language, messagingTemplate.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingTemplate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

