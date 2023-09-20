pipeline {
    agent any
     tools {
        gradle 'GRADLE_HOME'
    }

    stages {
        stage('Project clone') {
            steps {
            sh 'cd C:\ProgramData\Jenkins\.jenkins\workspace\sonar && rm -rf stage3-module5-task && git clone https://github.com/Sirojiddinov07/stage3-module5-task.git'
            }
        }
        stage('Build & SonarQube analysis') {
            steps {
                withSonarQubeEnv('SONAR_RUNNER_HOME') {
                    sh 'cd C:\ProgramData\Jenkins\.jenkins\workspace\sonar stage3-module5-task && gradle clean build sonarqube'
                }
            }
        }
        stage('Deploy') {
            when {
                expression {
                    script {
                        def qg = waitForQualityGate()
                        if (qg.status != 'OK') {
                            error "Pipeline aborted due to quality gate failure: ${qg.status}"
                        } else {
                            return true
                        }
                    }
                }
            }

        }
    }
}