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

- **Automated Build:** The project utilizes Apache Maven to automate the build process.
- **Automated Testing:** JUnit are incorporated to ensure code quality through automated testing.
- **Continuous Integration:** GitLab CI/CD VM Nutanix is configured to trigger builds automatically upon code changes.
- **Continuous Deployment:** GitLab CI/CD VM Nutanix is configured to deploy the application to [Deployment Environment] automatically.


## Project Structure

```bash
D:.
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
- Centos 7, Nutanix Platform already support it
- Source Code SpringBootApp from Mentor
- [Java-17 on Centos 7](https://computingforgeeks.com/install-java-openjdk-17-on-centos-rhel-7/) 
- [Apache Maven 3.8.5 on Centos 7](https://tecadmin.net/install-apache-maven-on-centos/) 
- [Docker on Centos 7](https://docs.docker.com/engine/install/centos/) 
- [Gitlab on Centos 7](https://about.gitlab.com/install/#centos-7)
- [PostgreSQL 14 on Centos 7](https://computingforgeeks.com/how-to-install-postgresql-14-centos-rhel-7/)
- [SonarQube on Centos 7](https://blog.yasithab.com/centos/install-sonarqube-on-centos-7/)
- [Nexus OSS on Centos 7](https://blog.yasithab.com/centos/install-nexus-repository-oss-on-centos-7/)
- [Grafana on Centos 7](https://roman-academy.medium.com/how-to-install-and-configure-grafana-on-centos-7-56c28dc04840)
- [Prometheus on Centos 7](https://rm-rf.medium.com/how-to-install-and-configure-prometheus-on-centos-7-1505e5bd7a3d)
- 


- [ ] [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
- [ ] [Add files using the command line](https://docs.gitlab.com/ee/gitlab-basics/add-file.html#add-a-file-using-the-command-line) or push an existing Git repository with the following command:

```
cd existing_repo
git remote add origin https://gitlab.kelompok1.com/root/gitlab-vm.git
git branch -M main
git push -uf origin main
```

## Integrate with your tools

- [ ] [Set up project integrations](https://gitlab.kelompok1.com/root/gitlab-vm/-/settings/integrations)

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Set auto-merge](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing (SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***