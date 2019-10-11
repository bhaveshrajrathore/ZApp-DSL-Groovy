pipelineJob('ZingUpLife-DSL') {
    definition {
        cpsScm {
            scm {
                git{
                remote {
                url('https://github.com/bhaveshrajrathore/ZUL.git')
                credentials('HappyTrip')
            }
             branch('master')
                }
             scriptPath("Jenkinsfile")
                 }
                }
        }
    }
