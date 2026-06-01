# Current Task

## Branch
feat/simulator-hardening-v1

## Goal
Harden simulator service v1:
- replace System.out with structured logging
- add deterministic/random strategy cleanup in SimulationService
- add unit tests for generateData behavior
- keep scheduler logic simple and configurable

## Done Criteria
- mvnw test passes
- status endpoint still works
- no behavior regression in periodic simulation generation
