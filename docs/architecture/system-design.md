# Indusence System Design (Initial)

## Services
- device-simulator-service: generates machine telemetry
- ingestion-gateway-service: accepts telemetry, validates, forwards
- stream-processing-service: evaluates rules/anomalies
- alerts-service: sends alert events/notifications
- device-registry-service: manages device metadata/status
- query-api-service: serves telemetry/alert/dashboard queries

## Event Flow
1. Simulator generates telemetry
2. Gateway validates and publishes to message broker
3. Processor consumes events and detects anomalies
4. Alerts service emits alerts
5. Query API exposes data for UI/reporting
