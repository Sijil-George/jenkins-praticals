pipeline {
    agent any
    stages {
        stage('Display User') {
            steps {
                script {
                    println "CurrentBuild Username:" + getBuildUserInfo().UserName
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    timeout(time:60, unit: 'SECONDS') {
                        input message: 'Do you want to continue ?', ok:'YES'
                    }
                }
            }
        }
    }
}

