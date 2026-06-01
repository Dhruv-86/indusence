# Indusence Master Plan

## Phase 0 - Foundation (Current)
- GitHub repo setup
- Cross-device workflow docs
- Core folder structure

## Phase 1 - Simulator Hardening
- Improve simulator realism and state model
- Add structured logging
- Add unit tests for data generation
- Add config profiles (dev/test)

## Phase 2 - Ingestion + Messaging
- Build ingestion gateway service (HTTP/MQTT entry)
- Define telemetry event schema (versioned)
- Publish events to broker (Kafka/RabbitMQ)

## Phase 3 - Processing + Alerts
- Stream processing for anomaly/rule detection
- Alerts service (create and route alerts)
- Retry/DLQ strategy

## Phase 4 - Registry + Query APIs
- Device registry service (metadata/lifecycle)
- Query API service for dashboard and reports
- Data retention and indexing strategy

## Phase 5 - Ops + Production Readiness
- Docker Compose local stack
- CI pipeline (build/test)
- Observability baseline (logs/metrics/traces)
- Security baseline (authn/authz/secrets)

## Success Criteria (v1)
- Multi-service telemetry flow works end-to-end
- Alerting works on anomaly conditions
- System is reproducible on any machine from docs
