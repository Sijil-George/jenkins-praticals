pipeline {
    agent any

    environment {
        APP_REPO = 'git@github.com:Sijil-George/simple_react_app.git'
        BRANCH = 'main'
    }

    stages {
        stage('hello') {
            steps {
                echo "hello checkout"
            }
        }

        stage('Detect Changes') {
            when{
                changeset "/backend/*"
            }
            steps{
                sh echo "changed backend"
            }
        }

 
    }
}