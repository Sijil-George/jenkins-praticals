pipeline {
    agent any
    stages {
        stage('hello') {
            steps {
                sh "echo hello checkout"
            }
        }

        stage('Detect Changes') {
            when{
                changeset "backend/*"
            }
            steps{
                sh "echo changed backend"
            }
        }
    }
}