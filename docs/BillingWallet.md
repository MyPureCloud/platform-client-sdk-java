# BillingWallet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the object. |  [optional] |
| **organizations** | [**List&lt;NamedEntity&gt;**](NamedEntity) | A Genesys Cloud Organization and it's related plans. |  [optional] |
| **product** | [**BillingProduct**](BillingProduct) | Represents the details of a product. |  [optional] |
| **startingBalance** | [**BigDecimal**](BigDecimal) | The initial balance in the wallet. |  [optional] |
| **endingBalance** | [**BigDecimal**](BigDecimal) | The final balance in the wallet after transactions. |  [optional] |
| **balanceIncrease** | [**BigDecimal**](BigDecimal) | Total amount added to the wallet. |  [optional] |
| **balanceDecrease** | [**BigDecimal**](BigDecimal) | The amount removed from the wallet due to a contract change. |  [optional] |
| **balanceConsumption** | [**BigDecimal**](BigDecimal) | Total consumption deducted from the wallet. |  [optional] |
| **balanceOverage** | [**BigDecimal**](BigDecimal) | The amount exceeding a predefined balance threshold. |  [optional] |
| **balanceOverageRate** | [**BigDecimal**](BigDecimal) | The rate charged for an overage.. |  [optional] |
| **balanceOverageCharge** | [**BigDecimal**](BigDecimal) | The amount to be charged. |  [optional] |
| **balanceOverageCurrency** | **String** | The currency in which the overage charge is invoiced. |  [optional] |
| **unitOfMeasure** | [**UnitOfMeasureEnum**](#Enum--UnitOfMeasureEnum) | The unit of measure for the wallet. |  [optional] |


## Enum: UnitOfMeasureEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;Call&quot; | 
| CHARACTER | &quot;Character&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
| COURSE | &quot;Course&quot; | 
| DAY | &quot;Day&quot; | 
| EACH | &quot;Each&quot; | 
| EMPLOYEE | &quot;Employee&quot; | 
| ENGAGEMENT | &quot;Engagement&quot; | 
| EVENT | &quot;Event&quot; | 
| EXAM | &quot;Exam&quot; | 
| GB | &quot;GB&quot; | 
| HOUR | &quot;Hour&quot; | 
| INSTANCE | &quot;Instance&quot; | 
| INTERACTION | &quot;Interaction&quot; | 
| INVOCATION | &quot;Invocation&quot; | 
| MESSAGE | &quot;Message&quot; | 
| MILLIONCHARACTERS | &quot;MillionCharacters&quot; | 
| MINUTE | &quot;Minute&quot; | 
| PERSON | &quot;Person&quot; | 
| PHONENUMBER | &quot;PhoneNumber&quot; | 
| PORT | &quot;Port&quot; | 
| SEGMENT | &quot;Segment&quot; | 
| SESSION | &quot;Session&quot; | 
| STREAM | &quot;Stream&quot; | 
| TOKEN | &quot;Token&quot; | 
| TRANSACTION | &quot;Transaction&quot; | 
| TURN | &quot;Turn&quot; | 
| UNIT | &quot;Unit&quot; | 
| USER | &quot;User&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
