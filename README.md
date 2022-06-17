# dont-use-bad-java

Please don't use this code. It was a short-lived experiment in log4j testing on 
AWS Lambda.

If run locally, it will use the unpatched log4j 2.14.1 libraries which will try to land
the exploit.

If run as an AWS Lambda (as intended), it demonstrates the existing mitigation patch for JNDI.

