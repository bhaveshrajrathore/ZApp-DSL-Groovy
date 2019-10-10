pipelineJob ('ZingUpLife-DSL') {
     def gitUrl = 'https://github.com/bhaveshrajrathore/ZApp.git'
     definition {
                    cps {
                         script(readFileFromWorkspace('Jenkinsfile'))
                         sandbox()     
                    }
     }
}
