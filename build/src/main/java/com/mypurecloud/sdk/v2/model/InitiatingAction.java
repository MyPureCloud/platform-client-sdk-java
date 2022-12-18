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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InitiatingAction
 */

public class InitiatingAction  implements Serializable {
  
  private String transactionId = null;

  private static class ActionContextEnumDeserializer extends StdDeserializer<ActionContextEnum> {
    public ActionContextEnumDeserializer() {
      super(ActionContextEnumDeserializer.class);
    }

    @Override
    public ActionContextEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionContextEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Action of the audit initiating the transaction
   */
 @JsonDeserialize(using = ActionContextEnumDeserializer.class)
  public enum ActionContextEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATE("Create"),
    VIEW("View"),
    UPDATE("Update"),
    MOVE("Move"),
    COPY("Copy"),
    DELETE("Delete"),
    DELETEALL("DeleteAll"),
    FAX("Fax"),
    VERSIONCREATE("VersionCreate"),
    DOWNLOAD("Download"),
    UPLOAD("Upload"),
    MEMBERADD("MemberAdd"),
    MEMBERUPDATE("MemberUpdate"),
    MEMBERREMOVE("MemberRemove"),
    SHAREADD("ShareAdd"),
    SHAREREMOVE("ShareRemove"),
    TAGADD("TagAdd"),
    TAGREMOVE("TagRemove"),
    TAGUPDATE("TagUpdate"),
    READ("Read"),
    READALL("ReadAll"),
    EXECUTE("Execute"),
    APPLYPROTECTION("ApplyProtection"),
    REVOKEPROTECTION("RevokeProtection"),
    UPDATERETENTION("UpdateRetention"),
    ABANDON("Abandon"),
    ARCHIVE("Archive"),
    RESTOREREQUEST("RestoreRequest"),
    RESTORECOMPLETE("RestoreComplete"),
    PROMOTE("Promote"),
    PUBLISH("Publish"),
    UNPUBLISH("Unpublish"),
    ACTIVATE("Activate"),
    CHECKIN("Checkin"),
    CHECKOUT("Checkout"),
    DEACTIVATE("Deactivate"),
    DEBUG("Debug"),
    SAVE("Save"),
    REVERT("Revert"),
    TRANSCODE("Transcode"),
    ENABLE("Enable"),
    DISABLE("Disable"),
    AUTHORIZE("Authorize"),
    DEAUTHORIZE("Deauthorize"),
    AUTHENTICATE("Authenticate"),
    CHANGEPASSWORD("ChangePassword"),
    REVOKE("Revoke"),
    EXPORT("Export"),
    APPEND("Append"),
    RECYCLE("Recycle"),
    OPEN("Open"),
    APPROVED("Approved"),
    REJECTED("Rejected"),
    ROLLBACK("Rollback"),
    IMPLEMENTINGCHANGE("ImplementingChange"),
    CHANGEIMPLEMENTED("ChangeImplemented"),
    IMPLEMENTINGROLLBACK("ImplementingRollback"),
    ROLLBACKIMPLEMENTED("RollbackImplemented"),
    WRITE("Write"),
    PURGE("Purge"),
    PROCESSED("Processed"),
    REMOVE("Remove"),
    REPLACE("Replace"),
    UPDATEINSERVICE("UpdateInService"),
    UPDATEOUTOFSERVICE("UpdateOutOfService"),
    CYCLE("Cycle"),
    SCALE("Scale"),
    IPALLOWLISTCLEAR("IpAllowlistClear"),
    ADDPAIRINGROLE("AddPairingRole"),
    ADD("Add"),
    VERIFY("Verify"),
    ASSIGN("Assign"),
    UNASSIGN("Unassign"),
    REASSIGN("Reassign"),
    RESCHEDULE("Reschedule"),
    CANCEL("Cancel"),
    SOFTDELETE("SoftDelete"),
    HARDDELETE("HardDelete"),
    RESET("Reset"),
    ROTATE("Rotate"),
    RESTORE("Restore"),
    UNARCHIVE("Unarchive"),
    ENABLECAPTURE("EnableCapture"),
    DOWNLOADCAPTURE("DownloadCapture");

    private String value;

    ActionContextEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionContextEnum fromString(String key) {
      if (key == null) return null;

      for (ActionContextEnum value : ActionContextEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionContextEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionContextEnum actionContext = null;

  
  /**
   * Id of the audit initiating the transaction
   **/
  public InitiatingAction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the audit initiating the transaction")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  /**
   * Action of the audit initiating the transaction
   **/
  public InitiatingAction actionContext(ActionContextEnum actionContext) {
    this.actionContext = actionContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action of the audit initiating the transaction")
  @JsonProperty("actionContext")
  public ActionContextEnum getActionContext() {
    return actionContext;
  }
  public void setActionContext(ActionContextEnum actionContext) {
    this.actionContext = actionContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatingAction initiatingAction = (InitiatingAction) o;

    return Objects.equals(this.transactionId, initiatingAction.transactionId) &&
            Objects.equals(this.actionContext, initiatingAction.actionContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, actionContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatingAction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    actionContext: ").append(toIndentedString(actionContext)).append("\n");
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

