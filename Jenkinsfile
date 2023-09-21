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
                bat ' gradlew clean build'

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
