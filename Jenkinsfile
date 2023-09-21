pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Sirojiddinov07/stage3-module5-task.git'

            }
        }

                 stage('Build') {
                     steps {
                         bat 'gradlew clean build'
                     }
                 }
                 stage('Test') {
                     steps {
                         bat 'gradlew test'
                     }
                 }
                 stage('SonarQube') {
                     steps {
                         withSonarQubeEnv(installationName:'sonar-scanner') {
                          bat 'gradlew sonarqube'
                         }
                     }
                 }
                 stage('Deploy') {
                     steps {
                         bat 'gradlew deploy'
                     }
                 }
             }
         }