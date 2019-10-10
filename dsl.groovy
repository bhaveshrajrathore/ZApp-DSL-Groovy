pipelineJob('ZingUpLife-DSL') {
    definition {
        cpsScm {
            scm {
                git{
                remote {
                url('https://github.com/bhaveshrajrathore/ZApp.git')
                credentials('HappyTrip')
            }
             branch('master')
                }
             scriptPath("Jenkinsfile")
                 }
                }
        }
    }
