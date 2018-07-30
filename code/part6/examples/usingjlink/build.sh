/bin/rm -rf agiledeveloper
jlink --module-path $JMODS:../opens/output/mlib --add-modules com.agiledeveloper.util --add-modules com.agiledeveloper.first --output agiledeveloper --launcher=agiledeveloper=com.agiledeveloper.first
./agiledeveloper/bin/java --list-modules
./agiledeveloper/bin/java -m com.agiledeveloper.first
./agiledeveloper/bin/agiledeveloper