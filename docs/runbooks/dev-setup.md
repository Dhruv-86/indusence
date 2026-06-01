# Developer Setup - Indusence

## Daily Start
git checkout main
git pull origin main

## Start Feature Work
git checkout -b feat/<topic>

## Build/Test (Simulator Service)
cd services/device-simulator-service
./mvnw test
cd ../..

## Run (Simulator Service)
cd services/device-simulator-service
./mvnw spring-boot:run
cd ../..

## End Session
git add .
git commit -m "feat: <what changed>"
git push origin <branch>

## Sync On Second Device
git clone https://github.com/Dhruv-86/indusence.git
cd indusence
git checkout main
git pull origin main
