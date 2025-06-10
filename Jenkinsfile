pipeline {
agent any  
parameters {  
    string(name: 'packageType', defaultValue: 'default', description: 'Type of package to build')  
}  
stages {  
    stage('Build') {  
        steps {  
            script{
                 def answer = input message: '<message>',
parameters: [booleanParam(defaultValue: true,
description: 'Prerelease setting', name: 'prerelease')]
            }
          
        }  
    }  
}  
}
