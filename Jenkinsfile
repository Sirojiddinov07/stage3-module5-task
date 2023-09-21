pipeline {
    agent any
     tools {
                     // Install the Gradle version configured as "GRADLE_HOME" and add it to the path.
                     gradle "GRADLE_HOME"
                 }



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
        stage('Sonar') {
            steps {
                    withSonarQubeEnv(installationName: 'sonar-scanner') {
                                bat "gradlew sonar"
            }


        }

    }
}
def call() {
    node {
        timestamps {
            ansiColor('xterm') {
                try {
                    powershell """
                        throw new Exception("ERROR: This is a test Exception.")
                    """
                } catch (error) {
                    println("Caught error: ${error.getMessage()}")
                }
            }
        }
    }
}
