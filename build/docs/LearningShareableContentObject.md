# LearningShareableContentObject


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the SCO from the course manifest. |  |
| **lessonStatus** | [**LessonStatusEnum**](#Enum--LessonStatusEnum) | The status of the SCO. Maps to the SCORM 1.2 cmi.core.lesson_status property. |  [optional] |
| **exit** | [**ExitEnum**](#Enum--ExitEnum) | Indicates how or why the learner left the SCO. Maps to the SCORM 1.2 cmi.core.exit property. |  [optional] |
| **location** | **String** | The learner’s current location in the SCO. Maps to the SCORM 1.2 cmi.core.lesson_location property. |  [optional] |
| **scoreRaw** | **Float** | The score of the most recent attempt on the SCO. Maps to the SCORM 1.2 cmi.core.score.raw property. |  [optional] |
| **scoreMax** | **Float** | The maximum score that could be achieved on the SCO. Maps to the SCORM 1.2 cmi.core.score.max property. |  [optional] |
| **scoreMin** | **Float** | The minimum score that could be achieved on the SCO. Maps to the SCORM 1.2 cmi.core.score.min property. |  [optional] |
| **suspendData** | **String** | The unique information generated by the SCO from previous uses. Maps to the SCORM 1.2 cmi.suspend_data property. |  [optional] |
| **credit** | [**CreditEnum**](#Enum--CreditEnum) | Whether completing this course counts towards the overall assignment. Maps to the SCORM 1.2 cmi.core.credit property. |  [optional] |
| **entry** | [**EntryEnum**](#Enum--EntryEnum) | Whether the learner has previously accessed this SCO. Maps to the SCORM 1.2 cmi.core.entry property. |  [optional] |
| **mode** | [**ModeEnum**](#Enum--ModeEnum) | Identifies the mode in which the SCO should be presented to the learner. Maps to the SCORM 1.2 cmi.core.lesson_mode property. |  [optional] |
| **totalTime** | **String** | The total amount of time the learner has spent in the SCO expressed as an ISO 8601 Duration, for example PT2H10M3.5S. Maps to the SCORM 1.2 cmi.core.total_time property. |  [optional] |
| **sessionTime** | **String** | The amount of time spent in the SCO in this session expressed as an ISO-8601 Duration, for example PT2H10M3.5S. Maps to the SCORM 1.2 cmi.core.session_time property. |  [optional] |
| **href** | **String** | The href from the course manifest for this SCO. |  [optional] |
| **parameters** | **String** | The parameters from the course manifest for this SCO. |  [optional] |
| **launchData** | **String** | The launch data from the course manifest for this SCO. |  [optional] |


## Enum: LessonStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PASSED | &quot;Passed&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 
| INCOMPLETE | &quot;Incomplete&quot; | 
| BROWSED | &quot;Browsed&quot; | 
| NOTATTEMPTED | &quot;NotAttempted&quot; | 


## Enum: ExitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TIMEOUT | &quot;Timeout&quot; | 
| SUSPEND | &quot;Suspend&quot; | 
| LOGOUT | &quot;Logout&quot; | 
| EMPTY | &quot;Empty&quot; | 


## Enum: CreditEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREDIT | &quot;Credit&quot; | 
| NOCREDIT | &quot;NoCredit&quot; | 


## Enum: EntryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ABINITIO | &quot;AbInitio&quot; | 
| RESUME | &quot;Resume&quot; | 
| EMPTY | &quot;Empty&quot; | 


## Enum: ModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BROWSE | &quot;Browse&quot; | 
| NORMAL | &quot;Normal&quot; | 
| REVIEW | &quot;Review&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
