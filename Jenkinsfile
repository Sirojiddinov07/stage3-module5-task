pipeline {
  agent any

  stages {
    stage('build') {
      steps {
        bat 'gradlew build'
      }
    }

    stage('sonarqube') {
      steps {
        withSonarQubeEnv('sonarqube-server') {
          bat 'gradlew sonar'
        }

      }
    }

    stage("Quality Gate") {
        steps {
            timeout(time: 1, unit: 'HOURS') {
                waitForQualityGate abortPipeline: true
            }
        }
    }

    stage('deploy') {
      steps {
        build 'stage4-task1-deploy'
      }
    }

  }
}