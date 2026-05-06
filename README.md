# 🏦 BankApplication

> Application bancaire en architecture microservices — Java Spring Boot & Docker

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=flat-square&logo=springboot)
![Docker](https://img.shields.io/badge/Docker-Compose-blue?style=flat-square&logo=docker)
![Spring Cloud](https://img.shields.io/badge/Spring_Cloud-enabled-green?style=flat-square)

---

## 📖 Présentation

**BankApplication** est une application bancaire développée en architecture **microservices**. Elle permet la gestion des comptes, des cartes bancaires et des prêts via 3 services indépendants orchestrés avec Docker Compose.

Chaque microservice est autonome, conteneurisé et publié sur Docker Hub. La configuration est centralisée via un serveur de configuration Spring Cloud.

---

## 🧱 Architecture

```
BankApplication/
├── accounts/          → Microservice gestion des comptes bancaires
├── cards/             → Microservice gestion des cartes bancaires
├── loans/             → Microservice gestion des prêts
├── configserver/      → Serveur de configuration centralisé (Spring Cloud Config)
└── docker-compose.yml → Orchestration de l'ensemble des services
```

Les services communiquent entre eux via **Consul** pour la découverte de services.

---

## 📋 Prérequis

Avant de lancer le projet, assurez-vous d'avoir installé :

| Outil | Version recommandée |
|---|---|
| IntelliJ IDEA | Dernière version |
| JDK | 17 |
| Maven | 3.x |
| Docker Desktop | Dernière version |

> ✅ Docker Compose est inclus dans Docker Desktop.  
> ✅ Les images sont publiques sur Docker Hub — aucune connexion requise.

---

## 🚀 Installation

### 1. Cloner le projet

```bash
git clone https://github.com/enzo-gavini/BankApplication.git
```

### 2. Accéder au dossier

```bash
cd BankApplication
```

### 3. Compiler le projet

```bash
mvn clean install
```

---

## 🐳 Lancement avec Docker

Les images Docker sont hébergées publiquement sur **Docker Hub**. Aucune connexion n'est requise.

Docker va automatiquement télécharger les 5 images suivantes :

- `accounts` — service comptes
- `cards` — service cartes
- `loans` — service prêts
- `configserver` — serveur de configuration
- `consul` — service discovery

### Démarrer tous les services

```bash
docker compose up
```

### Démarrer en arrière-plan (mode détaché)

```bash
docker compose up -d
```

### Arrêter les services

```bash
docker compose down
```

> ⚠️ Les **health checks** sont configurés dans le docker-compose.yml pour garantir que chaque service démarre dans le bon ordre.

---

## 🛠️ Technologies utilisées

| Catégorie | Technologies |
|---|---|
| **Langages** | Java 17 |
| **Frameworks** | Spring Boot, Spring Cloud |
| **Outils** | Docker, Docker Compose, Maven, Lombok |
| **Services** | Docker Hub, Consul |

---

## 👤 Auteur

**Enzo Gavini**  
🔗 [github.com/enzo-gavini](https://github.com/enzo-gavini)
