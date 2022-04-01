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
import com.mypurecloud.sdk.v2.model.RecipientAdditionalIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Information about the recipient the message is sent to or received from.
 */
@ApiModel(description = "Information about the recipient the message is sent to or received from.")

public class WebMessagingRecipient  implements Serializable {
  
  private String firstName = null;
  private String lastName = null;
  private String nickname = null;
  private List<RecipientAdditionalIdentifier> additionalIds = new ArrayList<RecipientAdditionalIdentifier>();

  
  @ApiModelProperty(example = "null", value = "First name of the recipient.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  
  @ApiModelProperty(example = "null", value = "Last name of the recipient.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  
  @ApiModelProperty(example = "null", value = "Nickname or display name of the recipient.")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }

  
  @ApiModelProperty(example = "null", value = "List of recipient additional identifiers")
  @JsonProperty("additionalIds")
  public List<RecipientAdditionalIdentifier> getAdditionalIds() {
    return additionalIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebMessagingRecipient webMessagingRecipient = (WebMessagingRecipient) o;
    return Objects.equals(this.firstName, webMessagingRecipient.firstName) &&
        Objects.equals(this.lastName, webMessagingRecipient.lastName) &&
        Objects.equals(this.nickname, webMessagingRecipient.nickname) &&
        Objects.equals(this.additionalIds, webMessagingRecipient.additionalIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, nickname, additionalIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebMessagingRecipient {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    additionalIds: ").append(toIndentedString(additionalIds)).append("\n");
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

