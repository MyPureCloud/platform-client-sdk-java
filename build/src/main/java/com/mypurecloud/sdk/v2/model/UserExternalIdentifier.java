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

import java.io.Serializable;
/**
 * Defines a link between an External Identifier and Authority pair to a Entity Type and Entity Identifier pair. Represents the two way, one to one mapping of an External Authority or System of Record&#39;s identifier to a PureCloud entity. e.g. (ExternalId&#x3D;&#39;05001&#39;,Authority&#x3D;&#39;XyzCRM&#39;) to (entityType&#x3D;user,entityId&#x3D;&#39;8eb03b33-3acb-4bc1-a244-50b9b9f19495&#39;)
 */
@ApiModel(description = "Defines a link between an External Identifier and Authority pair to a Entity Type and Entity Identifier pair. Represents the two way, one to one mapping of an External Authority or System of Record's identifier to a PureCloud entity. e.g. (ExternalId='05001',Authority='XyzCRM') to (entityType=user,entityId='8eb03b33-3acb-4bc1-a244-50b9b9f19495')")

public class UserExternalIdentifier  implements Serializable {
  
  private String authorityName = null;
  private String externalKey = null;
  private String selfUri = null;

  
  /**
   * Authority or System of Record which owns the External Identifier
   **/
  public UserExternalIdentifier authorityName(String authorityName) {
    this.authorityName = authorityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Authority or System of Record which owns the External Identifier")
  @JsonProperty("authorityName")
  public String getAuthorityName() {
    return authorityName;
  }
  public void setAuthorityName(String authorityName) {
    this.authorityName = authorityName;
  }


  /**
   * External Key
   **/
  public UserExternalIdentifier externalKey(String externalKey) {
    this.externalKey = externalKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "External Key")
  @JsonProperty("externalKey")
  public String getExternalKey() {
    return externalKey;
  }
  public void setExternalKey(String externalKey) {
    this.externalKey = externalKey;
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
    UserExternalIdentifier userExternalIdentifier = (UserExternalIdentifier) o;

    return Objects.equals(this.authorityName, userExternalIdentifier.authorityName) &&
            Objects.equals(this.externalKey, userExternalIdentifier.externalKey) &&
            Objects.equals(this.selfUri, userExternalIdentifier.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorityName, externalKey, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExternalIdentifier {\n");
    
    sb.append("    authorityName: ").append(toIndentedString(authorityName)).append("\n");
    sb.append("    externalKey: ").append(toIndentedString(externalKey)).append("\n");
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

