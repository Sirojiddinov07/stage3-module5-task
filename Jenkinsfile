pipeline {
    agent any
     tools {
        gradle 'GRADLE_HOME'
    }

    stages {
        stage('Project clone') {
            steps {
            sh 'cd /var/lib/jenkins/workspace/newsmng && rm -rf stage3-module5-task && git clone https://github.com/Sirojiddinov07/stage3-module5-task.git'
            }
        }
        stage('Build & SonarQube analysis') {
            steps {
                withSonarQubeEnv('SONAR_RUNNER_HOME') {
                    sh 'cd /var/lib/jenkins/workspace/newsmng/stage3-module5-task && gradle clean build sonarqube'
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
            steps {
                script {
                    sh 'rm -rf /opt/tomcat8/webapps/newsmng-1.0-plain.war && cp var/lib/jenkins/workspace/test/module-main/build/libs/newsmng-1.0-plain.war /opt/tomcat8/webapps/'
                }
            }
        }
    }
}