pipeline {
    agent any
    stages {

                    stage('Sonar') {
                        steps {
                            withSonarQubeEnv(installationName: 'sonarqube') {
                                bat "gradlew sonar"
                            }
                        }
                    }

    }


}