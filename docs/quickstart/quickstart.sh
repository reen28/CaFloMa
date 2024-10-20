#!/bin/bash

# Specifies the source and target directory
SOURCE_DIRECTORY="run-configurations"
TARGET_DIRECTORY="../../cafloma/.run"
TARGET_FILE="*.template.xml"

# Creating the target directory if not exists
echo "Step 1: Creating .run directory for run configurations"
mkdir -p "$TARGET_DIRECTORY"

# Find every template run configuration file and adding them
# to the target directory
echo "Step 2: Find all template files and copy them into the target directory"
find "$SOURCE_DIRECTORY" \
-type f -name "$TARGET_FILE" \
-exec sh -c 'cp "$1" "$2/$(basename "${1%.template.xml}.run.xml")"' _ {} "$TARGET_DIRECTORY" \;

