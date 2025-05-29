pipeline {
    agent any
    stages {
        stage('hello') {
            steps {
                echo "hello checkout"
            }
        }

        stage('Detect Changes') {
            when{
                changeset "backend/*"
            }
            steps{
                sh echo "changed backend"
            }
        }
    }
}