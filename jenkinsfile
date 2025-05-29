pipeline {
    agent any
    stages {
        stage('hello') {
            steps{
                echo "hello world"
            }
        }

        stage('Detect Changes') {
            when{
                changeset "backend/*"
            }
            steps{
                echo "changed backend"
            }
        }
    }
}