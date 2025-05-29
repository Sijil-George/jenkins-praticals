pipeline {
    agent any

    environment {
        APP_REPO = 'git@github.com:Sijil-George/simple_react_app.git'
        BRANCH = 'main'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Detect Changes') {
            steps {
                script {
                    def changeLogSets = currentBuild.changeSets
                    def backendChanged = false
                    def frontendChanged = false

                    for (changeSet in changeLogSets) {
                        for (entry in changeSet.items) {
                            for (file in entry.affectedFiles) {
                                if (file.path.startsWith('backend/')) {
                                    backendChanged = true
                                }
                                if (file.path.startsWith('frontend/')) {
                                    frontendChanged = true
                                }
                            }
                        }
                    }

                    // Set environment variables to use in next stages
                    env.BACKEND_CHANGED = backendChanged.toString()
                    env.FRONTEND_CHANGED = frontendChanged.toString()
                }
            }
        }

        stage('Build Backend') {
            when {
                expression { return env.BACKEND_CHANGED == 'true' }
            }
            steps {
                echo "Changes detected in backend. Building backend..."
                // Add your backend build steps here
            }
        }

        stage('Build Frontend') {
            when {
                expression { return env.FRONTEND_CHANGED == 'true' }
            }
            steps {
                echo "Changes detected in frontend. Building frontend..."
                // Add your frontend build steps here
            }
        }
    }
}