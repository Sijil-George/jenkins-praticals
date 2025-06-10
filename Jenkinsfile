pipeline {
agent any  
parameters {  
    string(name: 'packageType', defaultValue: 'default', description: 'Type of package to build')  
}  
stages {  
    stage('Build') {  
        steps {  
            script{
                 def answer = input message: 'Do you want to continue ?',
parameters: [booleanParam(defaultValue: false,
description: 'click procced if you want to continue', name: 'answer')]
            }
        }  
    }  
}  
}
