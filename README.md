# Projet Programmation Distribuée - Gestion de Montres/Bracelets

Microservices Spring Boot déployés avec Kubernetes (Minikube)

## Fonctionnalités
- Bracelet-service
  Endpoint : `GET /bracelets` → `["Bracelet Cuir", "Bracelet Métal"]` *(fonctionnel)*
- Montre-service  
  Endpoint : `GET /montres` → `["Rolex Daytona", "Patek Philippe Nautilus"]` *(problème Ingress en cours)*

## Structure
/ProjetProgDistrib

-bracelet-service/ (Code Spring + Dockerfile)

-montre-service/ (Code Spring + Dockerfile)

-kubernetes/ (Configs K8s (deployments, services, ingress))


## Prérequis
- Docker Desktop
- Minikube
- kubectl

## Installation
1. Démarrer Minikube :
   minikube start --driver=docker
   minikube addons enable ingress

Déployer les services :

kubectl apply -f kubernetes/
Accéder aux services :

minikube tunnel
### Test :
curl http://localhost/bracelets

Problèmes : Le endpoint /montres retourne 502 via Ingress
Solution temporaire :

kubectl port-forward svc/montre-service 8080:80
curl http://localhost:8080/montres