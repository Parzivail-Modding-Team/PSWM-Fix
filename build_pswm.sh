(
cd PSWM
cp ../gradlew .
bash ./gradlew wrapper
bash ./gradlew jar
)
mkdir -p libraries/com/parzivail/starwarsmod/pswm/1.3.3
cp PSWM/build/libs/starwarsmod-1.3.3.jar libraries/com/parzivail/starwarsmod/pswm/1.3.3/pswm-1.3.3-dev.jar
