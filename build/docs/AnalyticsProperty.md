---
title: AnalyticsProperty
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum) | Indicates what the data type is (e.g. integer vs string) and therefore how to evaluate what would constitute a match |  |
| **property** | **String** | User-defined rather than intrinsic system-observed values. These are tagged onto segments by other components within PureCloud or by API users directly.  This is the name of the user-defined property. |  |
| **value** | **String** | What property value to match against |  |
{: class="table table-striped"}


<a name="PropertyTypeEnum"></a>

## Enum: PropertyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| BOOL | &quot;bool&quot; |
| INTEGER | &quot;integer&quot; |
| REAL | &quot;real&quot; |
| DATE | &quot;date&quot; |
| STRING | &quot;string&quot; |
| UUID | &quot;uuid&quot; |
{: class="table table-striped"}


