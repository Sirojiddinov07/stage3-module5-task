pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git url: 'git@github.com:Sirojiddinov07/stage3-module5-task.git'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('SonarQube Analysis') {
            steps {
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
