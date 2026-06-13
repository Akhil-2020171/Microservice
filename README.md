# Microservice Project

This repository contains a Spring Boot microservices demo built with:
- `eureka` — service registry and discovery
- `api-gateway` — gateway routing requests to downstream services
- `service-one` — example microservice
- `service-two` — example microservice

## Project Overview

The architecture uses Spring Cloud Netflix and Docker for containerized microservices.
All services are defined as separate Maven modules and can be built independently or together.
The `compose.yaml` file lets you start the full stack with Docker Compose, including Eureka, service instances, and the API gateway.

### Key Features

- Centralized service discovery with Eureka
- Gateway routing to internal services
- Independently deployable service modules
- Docker-ready builds for local and production-like environments

## How to Run Locally

1. Build the project modules with Maven or Docker.
2. Start the stack using Docker Compose:

```bash
docker compose up --build
```

3. Access the gateway at `http://localhost:8180`
4. Access the Eureka dashboard at `http://localhost:8761`

## Future Prospective: Kubernetes Cluster

This project is a strong candidate for migration to Kubernetes.
Deploying on Kubernetes would add several benefits:

- Automated container orchestration and scaling
- Health checks and self-healing service recovery
- Centralized service routing via Ingress
- Better support for configuration management and secrets
- Easier deployment of distributed service updates

### Kubernetes Roadmap

Planned improvements for a Kubernetes-based deployment:

1. Add `Deployment` manifests for each service.
2. Add `Service` resources for internal communication.
3. Add an `Ingress` or API Gateway layer for external traffic.
4. Use `ConfigMap` / `Secret` for environment settings.
5. Use Helm charts or Kustomize for repeatable environments.
6. Add monitoring and logging integrations (Prometheus, Grafana, Loki).

### Benefits for This Project

- Run each microservice independently in pods
- Scale `service-one` and `service-two` separately
- Keep Eureka and the gateway highly available
- Simplify cloud-native deployments on GKE / EKS / AKS

## Notes

This repository is a great demo of how to move from Docker Compose into a true Kubernetes microservices environment.
The next phase is to add Kubernetes manifests and deployment automation.
