#!/bin/sh
echo "Starting GraalVM build"

METADATA_FOLDER=src/main/resources/META-INF/native-image

mvn clean package

if [ $? -ne 0 ]; then
    echo "Maven build failed"
    exit 1
fi

mkdir -p $METADATA_FOLDER

java -agentlib:native-image-agent=config-output-dir=$METADATA_FOLDER \
  -Dagentrun=true -jar target/native.jar
