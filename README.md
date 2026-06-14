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

The `k8s/` folder now includes Kubernetes YAML manifests that deploy the full stack to a Kubernetes cluster.

### Key Features

- Centralized service discovery with Eureka
- Gateway routing to internal services
- Independently deployable service modules
- Docker-ready builds for local and production-like environments
- Kubernetes manifests for cluster deployment

## How to Run Locally

1. Build the project modules with Maven or Docker.
2. Start the stack using Docker Compose:

```bash
docker compose up --build
```

3. Access the gateway at `http://localhost:8180`
4. Access the Eureka dashboard at `http://localhost:8761`

## Kubernetes Deployment

This project now includes a working Kubernetes deployment using YAML manifests in the `k8s/` folder.
The manifests define the necessary `Deployment` and `Service` resources for Eureka, API gateway, service-one, and service-two.

### Run on Kubernetes

1. Build the Docker images for each service and push them to a registry accessible by your cluster.
2. Apply the Kubernetes manifests:

```bash
kubectl apply -f k8s/
```

3. Verify pods and services:

```bash
kubectl get pods
kubectl get svc
```

4. Access the gateway through the configured service or ingress endpoint.

### Included Kubernetes Resources

- `k8s/eureka.yaml`
- `k8s/api-gateway.yaml`
- `k8s/service-one.yaml`
- `k8s/service-two.yaml`

### Kubernetes Benefits

- Run each microservice independently in pods
- Scale `service-one` and `service-two` separately
- Keep Eureka and the gateway available through Kubernetes service discovery
- Simplify cloud-native deployments on GKE / EKS / AKS

## Notes

This repository now demonstrates both Docker Compose and Kubernetes deployment options for a Spring Boot microservice architecture.
The `k8s/` manifests are ready to use as the next phase of the project.
