/bin/rm -rf output

mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find creating_module -name *.java`
jar -c -f output/mlib/util.jar -C output/classes .
/bin/rm -rf output/classes
                               
jar -f output/mlib/util.jar -d

javac -p output/mlib -d output/classes `find using_module -name *.java`
jar -c -f output/mlib/first.jar --main-class com.agiledeveloper.user.FirstUser -C output/classes .
/bin/rm -rf output/classes

java -p output/mlib -m com.agiledeveloper.first
java -p output/mlib -m com.agiledeveloper.first/com.agiledeveloper.user.FirstUser
