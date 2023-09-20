pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                // Clone your project from the git repository
                git url: 'git@github.com:https://github.com/Sirojiddinov07/stage3-module5-task.git'
            }
        }

        stage('Build') {
            steps {
                // Build your project using Gradle
                sh './gradlew build'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                // Run SonarQube analysis on your project
                withSonarQubeEnv('SonarQube') {
                    sh './gradlew sonarqube -Dsonar.login=<squ_120f65b5f7271288aa10df0a18c27f6a35731378>'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh './gradlew deploy'
            }
        }
    }
}
