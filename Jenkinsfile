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
                    def proceed = false
                    timeout(time: 1, unit: 'MINUTES') {
                        proceed = input(message: 'Do you want to continue?', ok: 'YES')
                        echo "User chose to proceed: ${proceed}"
                    }
                    waitUntil {
                        if (proceed) {
                            echo 'Proceeding with the build...'
                            return true
                        } else {
                            echo 'Build aborted due to timeout or user decision.'
                            error('Build aborted.')
                        }
                    }
                }
            }
        }
    }
}

