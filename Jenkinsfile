pipeline {
    agent any
    stages {
        stage('Display User') {
            steps {
                script {
                    def user = currentBuild.rawBuild.getCause(Cause.UserIdCause)?.getUserName()
                    if (user) {
                        echo "Build triggered by user: ${user}"
                    } else {
                        echo 'Build was not triggered by a user.'
                    }
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

