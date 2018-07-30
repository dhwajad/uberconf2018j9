/bin/rm -rf output

mkdir -p output/classes

javac -d output/classes `find fortuneteller -name *.java`
jar -c -f output/fortuneteller.jar -C output/classes .
/bin/rm -rf output/classes

javac -p output -d output/classes `find qualityteller -name *.java`
jar -c -f output/qualityteller.jar -C output/classes .
/bin/rm -rf output/classes

javac -p output -d output/classes `find romanticteller -name *.java`
jar -c -f output/romanticteller.jar -C output/classes .
/bin/rm -rf output/classes

javac -p output -d output/classes `find multipletellers -name *.java`
jar -c -f output/multipletellers.jar -C output/classes .
/bin/rm -rf output/classes
                               
javac -p output -d output/classes `find client -name *.java`
jar -c -f output/client.jar --main-class com.agiledeveloper.client.Client -C output/classes .
/bin/rm -rf output/classes

java -p output -m com.agiledeveloper.client

/bin/rm -rf output