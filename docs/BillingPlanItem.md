# BillingPlanItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **itemNumber** | **String** | Item number. |  [optional] |
| **name** | **String** | Name of the item. |  [optional] |
| **type** | **String** | Type of the item. |  [optional] |
| **function** | **String** | Function of the item. |  [optional] |
| **description** | **String** | Detailed description of the item. |  [optional] |
| **dateChargedThrough** | [**LocalDate**](LocalDate) | The date through which a customer has been billed for the charge. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **currencyIsoCode** | **String** | Contains the ISO code for any currency allowed by the organization. |  [optional] |
| **discountAmount** | [**BigDecimal**](BigDecimal) | The amount of the discount. |  [optional] |
| **dateEffectiveStart** | [**LocalDate**](LocalDate) | The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEffectiveEnd** | [**LocalDate**](LocalDate) | The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **overagePrice** | [**BigDecimal**](BigDecimal) | The price for units over the allowed amount. |  [optional] |
| **price** | [**BigDecimal**](BigDecimal) | The price associated with the item expressed as a decimal. |  [optional] |
| **quantity** | **Integer** | The quantity of units. |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
