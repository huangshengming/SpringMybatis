call mvn -s settings.xml install:install-file -Dfile=lib/jskills-0.9.1-SNAPSHOT.jar -DgroupId=jskills -DartifactId=jskills -Dversion=0.9.1-SNAPSHOT -Dpackaging=jar -DgeneratePom=true
call mvn -s settings.xml package 
call mvn -s settings.xml eclipse:eclipse
pause