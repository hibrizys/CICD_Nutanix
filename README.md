# Group 1 CICD

![Flow Service](https://gitlab.com/hibrizys/gitlab-windows/-/raw/main/img/Nutanix_Services-DevSecOps.png?ref_type=heads)

Study Case CICD PT. Tabel Data Informatika

## Overview

This repository demonstrates the implementation of a basic CI/CD pipeline for a Spring Boot application. The goal is to automate the build, test, and deployment processes, enabling a more efficient and reliable software development lifecycle.

## Team member

| Name                                          | Student ID     | Major                          |
| --------------------------------------------- | -------------- | ------------------------------- |
| **Hibrizy Jodistira Hibatullah Sulistiyo**   | 1303204017     | Bachelor of Information Technology |
| **Rizky Ramdhan Nugraha**                      | 1302203122     | Bachelor of Software Engineering |
| **Ahmad Fadhil Aulia Faisal**                  | 1302200084     | Bachelor of Software Engineering |
| **Mochammad Kaori Rahadian**                  | 1302204056     | Bachelor of Software Engineering |


## Features

- [ ] **Automated Build:** The project utilizes Apache Maven to automate the build process.
- [ ] **Automated Testing:** JUnit are incorporated to ensure code quality through automated testing.
- [ ] **Continuous Integration:** GitLab CI/CD VM Nutanix is configured to trigger builds automatically upon code changes.
- [ ] **Continuous Deployment:** GitLab CI/CD VM Nutanix is configured to deploy the application to [Deployment Environment] automatically.


## Project Structure

```bash
root:.
├───.mvn
│   └───wrapper
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───maryanto
│   │   │           └───dimas
│   │   │               └───example
│   │   │                   └───kelasplatformengineer
│   │   │                       ├───controller
│   │   │                       ├───model
│   │   │                       ├───repository
│   │   │                       └───service
│   │   └───resources
│   │       ├───db
│   │       │   └───migration
│   │       └───templates
│   └───test
│       └───java
│           └───com
│               └───maryanto
│                   └───dimas
│                       └───example
│                           └───kelasplatformengineer
└───target
    ├───classes
    │   ├───com
    │   │   └───maryanto
    │   │       └───dimas
    │   │           └───example
    │   │               └───kelasplatformengineer
    │   │                   ├───controller
    │   │                   ├───model
    │   │                   ├───repository
    │   │                   └───service
    │   ├───db
    │   │   └───migration
    │   └───templates
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-archiver
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       └───testCompile
    │           └───default-testCompile
    ├───surefire-reports
    └───test-classes
        └───com
            └───maryanto
                └───dimas
                    └───example
                        └───kelasplatformengineer
```

## Getting Started

### Prerequisites

#### Nutanix Platform
- [ ] Centos 7, Nutanix Platform already support it
- [ ] Source Code SpringBootApp from Mentor
- [ ] [Java-17 on Centos 7](https://computingforgeeks.com/install-java-openjdk-17-on-centos-rhel-7/) 
- [ ] [Apache Maven 3.8.5 on Centos 7](https://tecadmin.net/install-apache-maven-on-centos/) 
- [ ] [Docker on Centos 7](https://docs.docker.com/engine/install/centos/) 
- [ ] [Gitlab on Centos 7](https://about.gitlab.com/install/#centos-7)
- [ ] [Gitlab Runner on Centos 7](https://www.jagoanhosting.com/tutorial/tutorial-vps/cara-install-gitlab-runner-di-centos-7)
- [ ] [PostgreSQL 14 on Centos 7](https://computingforgeeks.com/how-to-install-postgresql-14-centos-rhel-7/)
- [ ] [SonarQube on Centos 7](https://blog.yasithab.com/centos/install-sonarqube-on-centos-7/)
- [ ] [Nexus OSS on Centos 7](https://blog.yasithab.com/centos/install-nexus-repository-oss-on-centos-7/)
- [ ] [Grafana on Centos 7](https://roman-academy.medium.com/how-to-install-and-configure-grafana-on-centos-7-56c28dc04840)
- [ ] [Prometheus on Centos 7](https://rm-rf.medium.com/how-to-install-and-configure-prometheus-on-centos-7-1505e5bd7a3d)
- [ ] Make sure to change the all the port to be able to access, and add [firewall](https://www.thegeekdiary.com/how-to-open-a-ports-in-centos-rhel-7/) in each port

## Test and Deploy

- After the **Pre-Req** is required, u have to push your projcet on Gitlab VM
    - if the error is **SSL Verification** on the progress to git clone or git push, you have to do this command:
    ```
    git config --global http.sslVerify false
    ```
- To run register runner you can command:
    - On windows:
    ```
    sudo gitlab-runner register --url https://gitlab.com/ --registration-token $TOKEN_REGISTRATION_RUNNER
    ```
    - On Centos Nutanix Platform:
    ```
    sudo gitlab-runner register --url https://10.38.56.54/root/gitlab-vm --registration-token $TOKEN_REGISTRATION_RUNNER
    ```
    After add the command, you can input the runner section like Tags, description, etc.
- For Deploy Apache maven you can command:
    ```
    mvn clean install test
    mvn spring-boot:start
    ```
- For **Intergrate Sonarqube to Maven Apache** you can se [here](https://blog.knoldus.com/integrate-maven-project-sonarqube/)
- For **Intergrate Nexus to Maven Apache** you can se [here](https://stackoverflow.com/questions/50620209/integrate-maven-with-nexus-repository) 


## Documentation User and Password Nutanix Platform
```
Login SSH Centos 7 (NUTANIX) on CMD: ssh -p 33556 root@10.38.56.54

Centos7
User: root
password: kel1jaya

Gitlab
User:root
Password: kel1jaya
Server: https://10.38.56.54:443/

Nexus:
User:admin
Password: kel1jaya
Server: http://10.38.56.54:8081/	

SonarQube
User:admin
Password: kel1jaya
Server: http://10.38.56.54:9797/

Grafana
User:admin
Password: kel1jaya
Server: http://10.38.56.54:3000/

Prometheus
Server: http://10.38.56.54:9999/

PostgreSQL SpringbootApp Centos7
login terminal: 
- psql -U product_service -d product_service

Curl SpringbootApp Centos 7:
- curl -X GET http://10.38.56.54:9055/api/product/
- curl -X GET http://10.38.56.54:9055/app/

Curl SpringbootApp Windows:
- curl -X GET http://localhost/api/product/
- curl -X GET http://localhost/app/
```

## Integrate Grafana, Prometheus, Container Registry, Kubernetes Cluster, and Object s3 Nutanix

**To Be Discussed!!**