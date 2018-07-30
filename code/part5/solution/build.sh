/bin/rm -rf output

mkdir -p output/classes

javac -d output/classes `find producer -name *.java`
jar -c -f output/producer.jar -C output/classes .
/bin/rm -rf output/classes
                               
javac -p output -d output/classes `find consumer -name *.java`
jar -c -f output/consumer.jar --main-class com.agiledeveloper.consumer.Consumer -C output/classes .
/bin/rm -rf output/classes

java -p output -m com.agiledeveloper.consumer

/bin/rm -rf output