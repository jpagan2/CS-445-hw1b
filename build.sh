#!/bin/bash

cd 445hw1b
sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk

sudo snap install gradle --classic
./gradlew clean build