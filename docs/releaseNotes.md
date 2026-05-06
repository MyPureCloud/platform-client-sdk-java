Platform API version: 10222


## Release Notes

The dependency on the 3rd party Joda-Time library has been removed from the Platform API SDK for Java. The SDK now leverages the standard Java Time library.  
The impacted models/classes are:
* model/Schedule.java (properties: start, end - previously represented as org.joda.time.LocalDateTime and now represented as java.time.LocalDateTime)
* model/EdgeAutoUpdateConfig.java (properties: start, end - previously as org.joda.time.LocalDateTime and now represented as java.time.LocalDateTime)


# Major Changes (0 changes)


# Minor Changes (0 changes)


# Point Changes (0 changes)
