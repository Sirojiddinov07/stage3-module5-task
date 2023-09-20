pipeline {
    agent any
     tools {
        gradle 'GRADLE_HOME'
    }

    stages {
        stage('Project clone') {
            steps {
            bat 'cd /var/lib/jenkins/workspace/Simple Job && rm -rf stage3-module5-task && git clone https://github.com/Sirojiddinov07/stage3-module5-task.git'
            }



        }
    }
}




