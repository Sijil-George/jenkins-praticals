pipeline {
agent any  
parameters {  
    string(name: 'packageType', defaultValue: 'default', description: 'Type of package to build')  
}  
stages { 
        stage('Display User') {
            steps {
                script {
                    echo "Job executed by: ${env.BUILD_USER}"
                }
            }
    stage('Build') {  
        steps {  
            script{
                timeout(time:60, unit: 'SECONDS') {
                input message: 'Do you want to continue ?,ok:'YES'
}
                 
            }
        }  
    }  
}  
}
