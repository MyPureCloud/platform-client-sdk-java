# BotEntityValue


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the entity. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The data type of the entity. Valid types include: String, Integer, Decimal, Boolean, Duration, Datetime, Currency, StringCollection, IntegerCollection, DecimalCollection, BooleanCollection, DurationCollection, DatetimeCollection, CurrencyCollection. |  |
| **value** | **String** | The string value of the entity for simple types. Required when using non-collection types. Format depends on the 'type' field: String: \"any text\"; Integer: whole number (e.g., \"42\"); Decimal: number with optional decimal point (e.g., \"42.5\"); Boolean: \"true\" or \"false\"; Duration: ISO-8601 duration format (e.g., \"PT1H30M\" for 1 hour and 30 minutes); Datetime: ISO-8601 datetime format (e.g., \"2023-04-15T14:30:00Z\"); Currency: JSON object with 'amount' and 'code' fields as an escaped JSON string (e.g., \"{\\\"amount\\\":10.50,\\\"code\\\":\\\"USD\\\"}\" - note the escaped quotes). |  [optional] |
| **values** | **List&lt;String&gt;** | The collection values for collection types. Required when using collection types. Each value must follow the format of its base type: StringCollection: array of strings; IntegerCollection: array of integer strings (e.g., [\"1\", \"2\", \"3\"]); DecimalCollection: array of decimal strings (e.g., [\"1.5\", \"2.0\", \"3.75\"]); BooleanCollection: array of boolean strings (e.g., [\"true\", \"false\"]); DurationCollection: array of ISO-8601 duration strings; DatetimeCollection: array of ISO-8601 datetime strings; CurrencyCollection: array of escaped JSON currency object strings (e.g., [\"{\\\"amount\\\":10.50,\\\"code\\\":\\\"USD\\\"}\", \"{\\\"amount\\\":25.00,\\\"code\\\":\\\"EUR\\\"}\"] - note the escaped quotes). |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;String&quot; | 
| INTEGER | &quot;Integer&quot; | 
| DECIMAL | &quot;Decimal&quot; | 
| DURATION | &quot;Duration&quot; | 
| BOOLEAN | &quot;Boolean&quot; | 
| CURRENCY | &quot;Currency&quot; | 
| DATETIME | &quot;Datetime&quot; | 
| STRINGCOLLECTION | &quot;StringCollection&quot; | 
| INTEGERCOLLECTION | &quot;IntegerCollection&quot; | 
| DECIMALCOLLECTION | &quot;DecimalCollection&quot; | 
| DURATIONCOLLECTION | &quot;DurationCollection&quot; | 
| BOOLEANCOLLECTION | &quot;BooleanCollection&quot; | 
| CURRENCYCOLLECTION | &quot;CurrencyCollection&quot; | 
| DATETIMECOLLECTION | &quot;DatetimeCollection&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
