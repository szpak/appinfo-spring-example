AppInfo-Spring-Example - an example how easy is displaying always current application version with AppInfo library.

Copyright (C) 2010 Marcin Zajaczkowski
Licensed under the Apache License, Version 2.0
Email: mszpak ATT wp DOTT pl
Homepage: http://appinfo.sourceforge.net/


To run example first simulate build from CI server:
$ BUILD_NUMBER=12 SVN_REVISION=12345 mvn clean package

After successful build run the application:
$ java -jar target/appinfo-spring-example-*.jar
(or just run.sh undel Unix-like systems)


Current version of that example can be get from Git repository:
git clone git://appinfo.git.sourceforge.net/gitroot/appinfo/appinfo-spring-example
